package net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingSorcerest;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.init.TravelopticsSpells;
import com.github.L_Ender.cataclysm.entity.AI.MobAIFindWater;
import com.github.L_Ender.cataclysm.entity.AI.MobAILeaveWater;
import com.github.L_Ender.cataclysm.entity.Deepling.Deepling_Angler_Entity;
import com.github.L_Ender.cataclysm.init.ModSounds;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.mobs.goals.SpellBarrageGoal;
import io.redspace.ironsspellbooks.entity.mobs.goals.WizardAttackGoal;
import io.redspace.ironsspellbooks.entity.mobs.goals.WizardRecoverGoal;
import java.util.List;
import javax.annotation.Nullable;

import net.acetheeldritchking.cataclysm_spellbooks.registries.CSAttributeRegistry;
import net.acetheeldritchking.cataclysm_spellbooks.registries.SpellRegistries;
import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingWizard;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeMod;

public class DeeplingSorcerestEntity extends DeeplingWizard implements Enemy {
    public DeeplingSorcerestEntity(EntityType<? extends DeeplingWizard> type, Level world) {
        super(type, world);
        this.xpReward = 25;
        this.moveControl = new DeeplingMoveControl(this, 1.0F);
    }
    boolean searchingForLand;

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(5, new DeeplingSorcerestEntity.DeeplingGoToBeachGoal(this, (double)1.0F));
        this.goalSelector.addGoal(6, new DeeplingSorcerestEntity.DeeplingSwimUpGoal(this, (double)1.0F, this.level().getSeaLevel()));
        this.goalSelector.addGoal(0, new MobAIFindWater(this, 1.0D)); // higher priority
        this.goalSelector.addGoal(1, new MobAILeaveWater(this));
        this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.0D));
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
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(10, new WizardRecoverGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true));
    }

    public static boolean candeeplingSpawn(EntityType<Deepling_Angler_Entity> p_223364_0_, LevelAccessor p_223364_1_, MobSpawnType reason, BlockPos p_223364_3_, RandomSource p_223364_4_) {
        return p_223364_1_.getDifficulty() != Difficulty.PEACEFUL && (reason == MobSpawnType.SPAWNER || p_223364_1_.getFluidState(p_223364_3_).is(FluidTags.WATER));
    }


    static class DeeplingGoToBeachGoal extends MoveToBlockGoal {
        private final DeeplingSorcerestEntity drowned;

        public DeeplingGoToBeachGoal(DeeplingSorcerestEntity p_32409_, double p_32410_) {
            super(p_32409_, p_32410_, 8, 2);
            this.drowned = p_32409_;
        }

        public boolean canUse() {
            return super.canUse() && this.drowned.level().isRaining() && this.drowned.isInWater() && this.drowned.getY() >= (double)(this.drowned.level().getSeaLevel() - 3);
        }

        public boolean canContinueToUse() {
            return super.canContinueToUse();
        }

        protected boolean isValidTarget(LevelReader p_32413_, BlockPos p_32414_) {
            BlockPos blockpos = p_32414_.above();
            return p_32413_.isEmptyBlock(blockpos) && p_32413_.isEmptyBlock(blockpos.above()) ? p_32413_.getBlockState(p_32414_).entityCanStandOn(p_32413_, p_32414_, this.drowned) : false;
        }

        public void start() {
            this.drowned.setSearchingForLand(false);
            super.start();
        }

        public void stop() {
            super.stop();
        }
    }

    static class DeeplingSwimUpGoal extends Goal {
        private final DeeplingSorcerestEntity drowned;
        private final double speedModifier;
        private final int seaLevel;
        private boolean stuck;

        public DeeplingSwimUpGoal(DeeplingSorcerestEntity p_32440_, double p_32441_, int p_32442_) {
            this.drowned = p_32440_;
            this.speedModifier = p_32441_;
            this.seaLevel = p_32442_;
        }

        public boolean canUse() {
            return (this.drowned.level().isRaining() || this.drowned.isInWater()) && this.drowned.getY() < (double)(this.seaLevel - 2);
        }

        public boolean canContinueToUse() {
            return this.canUse() && !this.stuck;
        }

        public void tick() {
            if (this.drowned.getY() < (double)(this.seaLevel - 1) && (this.drowned.getNavigation().isDone() || this.drowned.closeToNextPos())) {
                Vec3 vec3 = DefaultRandomPos.getPosTowards(this.drowned, 4, 8, new Vec3(this.drowned.getX(), (double)(this.seaLevel - 1), this.drowned.getZ()), (double)((float)Math.PI / 2F));
                if (vec3 == null) {
                    this.stuck = true;
                    return;
                }

                this.drowned.getNavigation().moveTo(vec3.x, vec3.y, vec3.z, this.speedModifier);
            }

        }

        public void start() {
            this.drowned.setSearchingForLand(true);
            this.stuck = false;
        }

        public void stop() {
            this.drowned.setSearchingForLand(false);
        }
    }

    static class DeeplingMoveControl extends MoveControl {
        private final DeeplingSorcerestEntity drowned;
        private final float speedMulti;

        public DeeplingMoveControl(DeeplingSorcerestEntity p_32433_, float speedMulti) {
            super(p_32433_);
            this.drowned = p_32433_;
            this.speedMulti = speedMulti;
        }

        public void tick() {
            LivingEntity livingentity = this.drowned.getTarget();
            if (this.drowned.wantsToSwim() && this.drowned.isInWater()) {
                if (livingentity != null && livingentity.getY() > this.drowned.getY() || this.drowned.searchingForLand) {
                    this.drowned.setDeltaMovement(this.drowned.getDeltaMovement().add((double)0.0F, 0.002, (double)0.0F));
                }

                if (this.operation != Operation.MOVE_TO || this.drowned.getNavigation().isDone()) {
                    this.drowned.setSpeed(0.0F);
                    return;
                }

                double d0 = this.wantedX - this.drowned.getX();
                double d1 = this.wantedY - this.drowned.getY();
                double d2 = this.wantedZ - this.drowned.getZ();
                double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                d1 /= d3;
                float f = (float)(Mth.atan2(d2, d0) * (double)(180F / (float)Math.PI)) - 90.0F;
                this.drowned.setYRot(this.rotlerp(this.drowned.getYRot(), f, 90.0F));
                this.drowned.yBodyRot = this.drowned.getYRot();
                float f1 = (float)(this.speedModifier * (double)this.speedMulti * this.drowned.getAttributeValue(Attributes.MOVEMENT_SPEED));
                float f2 = Mth.lerp(0.125F, this.drowned.getSpeed(), f1);
                this.drowned.setSpeed(f2);
                this.drowned.setDeltaMovement(this.drowned.getDeltaMovement().add((double)f2 * d0 * 0.005, (double)f2 * d1 * 0.1, (double)f2 * d2 * 0.005));
            } else {
                if (!this.drowned.onGround()) {
                    this.drowned.setDeltaMovement(this.drowned.getDeltaMovement().add((double)0.0F, -0.008, (double)0.0F));
                }

                super.tick();
            }

        }
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
                .add(ForgeMod.SWIM_SPEED.get(), 1.0D)
                .add(AttributeRegistry.SPELL_POWER.get(), 0.1F)
                .add(AttributeRegistry.SPELL_RESIST.get(), 0.15F)
                .add(TravelopticsAttributes.AQUA_SPELL_POWER.get(), 0.15F)
                .add(CSAttributeRegistry.ABYSSAL_MAGIC_POWER.get(), 0.15F);
    }

    public void travel(Vec3 movementInput) {
        if (this.isEffectiveAi() && this.isInWater() && this.wantsToSwim()) {
            this.moveRelative(0.01F, movementInput);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.9));
        } else {
            super.travel(movementInput);
        }
    }




    protected SoundEvent getAmbientSound() {
        return (SoundEvent) ModSounds.DEEPLING_IDLE.get();
    }
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return (SoundEvent)ModSounds.DEEPLING_HURT.get();
    }
    protected SoundEvent getDeathSound() {
        return (SoundEvent)ModSounds.DEEPLING_DEATH.get();
    }

    public boolean wantsToSwim() {
        if (this.searchingForLand) return true;
        LivingEntity target = this.getTarget();
        return target != null && target.isInWater();
    }


    public void setSearchingForLand(boolean searching) {
        this.searchingForLand = searching;
    }

    public boolean closeToNextPos() {
        if (this.getNavigation().isDone()) return true;

        BlockPos targetPos = this.getNavigation().getTargetPos();
        if (targetPos == null) return false;

        Vec3 targetVec = new Vec3(targetPos.getX() + 0.5, targetPos.getY(), targetPos.getZ() + 0.5);
        return this.position().distanceToSqr(targetVec) < 1.0D;
    }

    protected PathNavigation createNavigation(Level worldIn) {
        return new WaterBoundPathNavigation(this, worldIn);
    }


}
