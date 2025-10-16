package net.hazen.elemental_synergies.Mixins.Spells.Abyssal.TOME;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.spells.ender.OrbitalVoidSpell;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSSchoolRegistry;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(OrbitalVoidSpell.class)
public abstract class OrbitalVoidMixin extends AbstractSpell {

	@Override
	public SchoolType getSchoolType() {
		return CSSchoolRegistry.ABYSSAL.get();
	}

	public float getDamage(int spellLevel, LivingEntity caster) {
		if (caster == null) {
			return 2.5F + this.getSpellPower(spellLevel, caster) * 2.0F;
		}
		double aquaSpellPower = caster.getAttributes()
				.hasAttribute((Attribute) TravelopticsAttributes.AQUA_SPELL_POWER.get()) ?
				caster.getAttributeValue((Attribute)TravelopticsAttributes.AQUA_SPELL_POWER.get()) : (double)1.0F;
		return (float)(2.5F + this.getSpellPower(spellLevel, caster) * (0.5 * aquaSpellPower));
	}
}