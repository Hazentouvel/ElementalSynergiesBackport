package net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingArchmage;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.init.TravelopticsSpells;
import com.github.L_Ender.cataclysm.entity.AI.MobAIFindWater;
import com.github.L_Ender.cataclysm.entity.AI.MobAILeaveWater;
import com.github.L_Ender.cataclysm.entity.etc.ISemiAquatic;
import com.github.L_Ender.cataclysm.entity.etc.path.GroundPathNavigatorWide;
import com.github.L_Ender.cataclysm.entity.etc.path.SemiAquaticPathNavigator;
import com.github.L_Ender.cataclysm.init.ModTag;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMob;
import io.redspace.ironsspellbooks.entity.mobs.goals.SpellBarrageGoal;
import io.redspace.ironsspellbooks.entity.mobs.goals.WizardAttackGoal;
import io.redspace.ironsspellbooks.entity.mobs.goals.WizardRecoverGoal;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSAttributeRegistry;
import net.acetheeldritchking.cataclysm_spellbooks.registries.SpellRegistries;
import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingSorcerest.DeeplingSorcerestEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fluids.FluidType;

import javax.annotation.Nullable;
import java.util.List;

public class DeeplingArchmageEntity extends AbstractSpellCastingMob implements ISemiAquatic, Enemy {
    public DeeplingArchmageEntity(EntityType<? extends AbstractSpellCastingMob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.xpReward = 25;
        this.switchNavigator(false);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new SpellBarrageGoal(this,
                TravelopticsSpells.ORBITAL_VOID_SPELL.get(),
                3,
                6,
                100,
                250,
                1));
        this.goalSelector.addGoal(3, (new WizardAttackGoal(this,
                1.25D,
                50,
                75))
                .setSpells(List.of(
                               TravelopticsSpells.HYDROSHOT_SPELL.get(),
                                TravelopticsSpells.AQUA_MISSILES_SPELL.get(),
                                TravelopticsSpells.FLOOD_SLASH_SPELL.get(),
                                TravelopticsSpells.BUBBLE_SPRAY_SPELL.get()),
                        List.of(),
                        List.of(),
                        List.of()).setSingleUseSpell( SpellRegistries.ABYSSAL_PREDATOR.get(),
                        80, 400, 1, 3)
                .setDrinksPotions());
        this.goalSelector.addGoal(4, new MobAIFindWater(this, 1.0F));
        this.goalSelector.addGoal(4, new MobAILeaveWater(this));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(10, new WizardRecoverGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true));
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor serverLevelAccessor, DifficultyInstance difficultyInstance, MobSpawnType mobSpawnType, @Nullable SpawnGroupData spawnGroupData, @Nullable CompoundTag compoundTag) {
        SpawnGroupData spawngroupdata = super.finalizeSpawn(serverLevelAccessor, difficultyInstance, mobSpawnType, spawnGroupData, compoundTag);
        RandomSource randomsource = serverLevelAccessor.getRandom();
        this.populateDefaultEquipmentSlots(randomsource, difficultyInstance);
        return spawngroupdata;
    }

    public static AttributeSupplier.Builder prepareAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 4.0F)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5F)
                .add(Attributes.MAX_HEALTH, 45.0F)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.15F)
                .add(Attributes.FOLLOW_RANGE, 24.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.27F)
                .add(AttributeRegistry.SPELL_POWER.get(), 0.1F)
                .add(AttributeRegistry.SPELL_RESIST.get(), 0.15F)
                .add(TravelopticsAttributes.AQUA_SPELL_POWER.get(), 0.15F)
                .add(CSAttributeRegistry.ABYSSAL_MAGIC_POWER.get(), 0.15F);
    }

    private int moistureAttackTime = 0;
    public float LayerBrightness;
    public float oLayerBrightness;
    public int LayerTicks;
    private boolean isLandNavigator;
    private static final EntityDataAccessor<Integer> MOISTNESS;
    private static final EntityDataAccessor<Boolean> DEEPLINGSWIM;

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(MOISTNESS, 40000);
        this.entityData.define(DEEPLINGSWIM, false);
    }

    public boolean isAlliedTo(Entity entityIn) {
        if (entityIn == this) {
            return true;
        } else if (super.isAlliedTo(entityIn)) {
            return true;
        } else if (!entityIn.getType().is(ModTag.TEAM_THE_LEVIATHAN)) {
            return false;
        } else {
            return this.getTeam() == null && entityIn.getTeam() == null;
        }
    }

    public void tick() {
        super.tick();
        if (this.isInWater() && this.isLandNavigator) {
            this.switchNavigator(false);
        }

        if (!this.isInWater() && !this.isLandNavigator) {
            this.switchNavigator(true);
        }

        if (this.isNoAi()) {
            this.setAirSupply(this.getMaxAirSupply());
        } else if (this.isInWaterRainOrBubble()) {
            this.setMoistness(6000);
        } else {
            int dry = this.level().isDay() ? 2 : 1;
            this.setMoistness(this.getMoistness() - dry);
            if (this.getMoistness() <= 0 && this.moistureAttackTime-- <= 0) {
                this.hurt(this.damageSources().dryOut(), this.random.nextInt(2) == 0 ? 1.0F : 0.0F);
                this.moistureAttackTime = 20;
            }
        }

        boolean flag1 = this.canInFluidType(this.getEyeInFluidType());
        if (flag1) {
            if (this.level().noCollision(this, this.getSwimmingBox())) {
                if (!this.getDeeplingSwim()) {
                    this.setDeeplingSwim(true);
                }

                this.refreshDimensions();
            }
        } else if (this.level().noCollision(this, this.getNormalBox())) {
            if (this.getDeeplingSwim()) {
                this.setDeeplingSwim(false);
            }

            this.refreshDimensions();
        }

        if (this.level().isClientSide) {
            this.oLayerBrightness = this.LayerBrightness;
            ++this.LayerTicks;
            this.LayerBrightness += (0.0F - this.LayerBrightness) * 0.8F;
        }

    }

    private boolean canInFluidType(FluidType type) {
        ForgeMod.WATER_TYPE.get();
        return type.canSwim(this.self());
    }

    public boolean isVisuallySwimming() {
        return this.getDeeplingSwim();
    }

    public void switchNavigator(boolean onLand) {
        if (onLand) {
            this.navigation = new GroundPathNavigatorWide(this, this.level());
            this.isLandNavigator = true;
        } else {
            this.navigation = new SemiAquaticPathNavigator(this, this.level());
            this.isLandNavigator = false;
        }

    }

    public AABB getSwimmingBox() {
        return new AABB(this.getX() - (double)1.15F, this.getY(), this.getZ() - (double)1.15F, this.getX() + (double)1.15F, this.getY() + (double)0.6F, this.getZ() + (double)1.15F);
    }

    public AABB getNormalBox() {
        return new AABB(this.getX() - (double)0.6F, this.getY(), this.getZ() - (double)0.6F, this.getX() + (double)0.6F, this.getY() + (double)2.3F, this.getZ() + (double)0.6F);
    }

    public EntityDimensions getSwimmingSize() {
        return this.getType().getDimensions().scale(this.getScale());
    }

    public EntityDimensions getDimensions(Pose poseIn) {
        return this.getDeeplingSwim() ? this.getSwimmingSize() : super.getDimensions(poseIn);
    }

    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("Moisture", this.getMoistness());
    }

    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setMoistness(compound.getInt("Moisture"));
    }

    public int getMoistness() {
        return (Integer)this.entityData.get(MOISTNESS);
    }

    public void setMoistness(int p_211137_1_) {
        this.entityData.set(MOISTNESS, p_211137_1_);
    }

    public boolean getDeeplingSwim() {
        return (Boolean)this.entityData.get(DEEPLINGSWIM);
    }

    public void setDeeplingSwim(boolean swim) {
        this.entityData.set(DEEPLINGSWIM, swim);
    }

    public MobType getMobType() {
        return MobType.WATER;
    }

    public boolean isPushedByFluid() {
        return !this.isSwimming();
    }

    public boolean canBreatheUnderwater() {
        return true;
    }

    public boolean shouldEnterWater() {
        return this.getMoistness() < 300;
    }

    public boolean shouldLeaveWater() {
        return this.getTarget() != null && !this.getTarget().isInWater();
    }

    public boolean shouldStopMoving() {
        return false;
    }

    public int getWaterSearchRange() {
        return 32;
    }


    static {
        MOISTNESS = SynchedEntityData.defineId(DeeplingSorcerestEntity.class, EntityDataSerializers.INT);
        DEEPLINGSWIM = SynchedEntityData.defineId(DeeplingSorcerestEntity.class, EntityDataSerializers.BOOLEAN);
    }
}
