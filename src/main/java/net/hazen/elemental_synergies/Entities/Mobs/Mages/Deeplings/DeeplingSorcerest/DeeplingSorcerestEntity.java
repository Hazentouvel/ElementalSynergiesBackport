package net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingSorcerest;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.init.TravelopticsSpells;
import com.github.L_Ender.cataclysm.entity.AI.MobAIFindWater;
import com.github.L_Ender.cataclysm.entity.AI.MobAILeaveWater;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMob;
import io.redspace.ironsspellbooks.entity.mobs.goals.SpellBarrageGoal;
import io.redspace.ironsspellbooks.entity.mobs.goals.WizardAttackGoal;
import io.redspace.ironsspellbooks.entity.mobs.goals.WizardRecoverGoal;
import java.util.List;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nullable;

public class DeeplingSorcerestEntity extends AbstractSpellCastingMob implements Enemy {
    public DeeplingSorcerestEntity(EntityType<? extends AbstractSpellCastingMob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.xpReward = 25;
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
                        List.of()).setSingleUseSpell( TravelopticsSpells.AQUA_MISSILES_SPELL.get(),
                        80, 400, 1, 3)
                .setDrinksPotions());
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(10, new WizardRecoverGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
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
                .add(TravelopticsAttributes.AQUA_SPELL_POWER.get(), 0.15F);
    }
}
