
package net.hazen.elemental_synergies.Mixins.Spells.Geomancy.GG;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.spells.nature.EarthquakeSpell;
import io.redspace.ironsspellbooks.spells.nature.StompSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(StompSpell.class)
public abstract class StompMixin extends AbstractSpell {

	public float getDamage(int spellLevel, LivingEntity caster) {
		if (caster == null) {
			return 2.5F + this.getSpellPower(spellLevel, caster) * 2.0F;
		}
		double natureSpellPower = caster.getAttributes()
				.hasAttribute((Attribute) AttributeRegistry.NATURE_SPELL_POWER.get()) ?
				caster.getAttributeValue((Attribute) AttributeRegistry.NATURE_SPELL_POWER.get()) : (double)1.0F;
		return (float)(this.getSpellPower(spellLevel, caster) + (natureSpellPower * 0.5));
	}
}
