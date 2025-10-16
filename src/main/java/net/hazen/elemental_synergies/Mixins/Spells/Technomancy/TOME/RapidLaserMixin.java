package net.hazen.elemental_synergies.Mixins.Spells.Technomancy.TOME;

import com.gametechbc.traveloptics.spells.lightning.DeathLaserSpell;
import com.gametechbc.traveloptics.spells.lightning.RapidLaserSpell;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSSchoolRegistry;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(RapidLaserSpell.class)
public abstract class RapidLaserMixin extends AbstractSpell {

	@Override
	public SchoolType getSchoolType() {
		return CSSchoolRegistry.TECHNOMANCY.get();
	}

	public float getDamage(int spellLevel, LivingEntity caster) {
		if (caster == null) {
			return 2.5F + this.getSpellPower(spellLevel, caster) * 2.0F;
		}
		double lightningSpellPower = caster.getAttributes()
				.hasAttribute((Attribute) AttributeRegistry.LIGHTNING_SPELL_POWER.get()) ?
				caster.getAttributeValue((Attribute)AttributeRegistry.LIGHTNING_SPELL_POWER.get()) : (double)1.0F;
		return (float)(this.getSpellPower(spellLevel, caster) +  (0.5 * lightningSpellPower) * 5.0F);
	}
}