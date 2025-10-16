package net.hazen.elemental_synergies.Mixins.Spells.Fire.CS;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.acetheeldritchking.cataclysm_spellbooks.spells.fire.AshenBreathSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(AshenBreathSpell.class)
public abstract class AshenBreathMixin extends AbstractSpell {

	public float getDamage(int spellLevel, LivingEntity caster) {
		if (caster == null) {
			return 2.5F + this.getSpellPower(spellLevel, caster) * 2.0F;
		}
		double evocationSpellPower = caster.getAttributes()
				.hasAttribute((Attribute) AttributeRegistry.EVOCATION_SPELL_POWER.get()) ?
				caster.getAttributeValue((Attribute)AttributeRegistry.EVOCATION_SPELL_POWER.get()) : (double)1.0F;
		return (float)(this.getSpellPower(spellLevel, caster) + ( 0.5 * evocationSpellPower));
	}
}