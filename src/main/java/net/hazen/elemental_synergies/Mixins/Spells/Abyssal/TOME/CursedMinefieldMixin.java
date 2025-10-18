package net.hazen.elemental_synergies.Mixins.Spells.Abyssal.TOME;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.spells.ender.CursedMinefieldSpell;
import com.github.L_Ender.cataclysm.entity.AnimationMonster.BossMonsters.The_Leviathan.Abyss_Mine_Entity;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.CastSource;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSSchoolRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CursedMinefieldSpell.class)
public abstract class CursedMinefieldMixin extends AbstractSpell {

	@Override
	public SchoolType getSchoolType() {
		return CSSchoolRegistry.ABYSSAL.get();
	}

	public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
		super.onCast(level, spellLevel, entity, castSource, playerMagicData);

		double aquaSpellPower = 1.0;
		if (entity.getAttributes().hasAttribute(TravelopticsAttributes.AQUA_SPELL_POWER.get())) {
			aquaSpellPower = entity.getAttributeValue(TravelopticsAttributes.AQUA_SPELL_POWER.get());
		}

		if (!level.isClientSide()) {
			int numEntities = (int)Math.ceil((double)((this.getSpellPower(spellLevel, entity) + ( 0.5 * aquaSpellPower)) * 4.0F));

			for(int i = 0; i < numEntities; ++i) {
				double randomX = entity.getX() + (level.random.nextDouble() - (double)0.5F) * (double)40.0F;
				double randomY = entity.getY() + level.random.nextDouble() * (double)3.0F;
				double randomZ = entity.getZ() + (level.random.nextDouble() - (double)0.5F) * (double)40.0F;
				new BlockPos((int)randomX, (int)randomY, (int)randomZ);
				EntityType<?> abyssMineType = (EntityType)BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("cataclysm", "abyss_mine"));
				if (abyssMineType != null) {
					Entity abyssMine = abyssMineType.create(level);
					if (abyssMine instanceof Abyss_Mine_Entity) {
						Abyss_Mine_Entity mine = (Abyss_Mine_Entity)abyssMine;
						mine.moveTo(randomX, randomY, randomZ);
						mine.setCaster(entity);
						level.addFreshEntity(mine);
					}
				}
			}
		}

	}
}