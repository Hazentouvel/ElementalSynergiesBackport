package net.hazen.elemental_synergies.Mixins.Spells.Lightning.TOME;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSAttributeRegistry;
import net.acetheeldritchking.cataclysm_spellbooks.spells.technomancy.EMPSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EMPSpell.class)
public abstract class EmPulseSpellMixin extends AbstractSpell {

	public float getDuration(int spellLevel, LivingEntity caster) {
		if (caster == null) {
			return 2.5F + this.getSpellPower(spellLevel, caster) * 2.0F;
		}
//		double lightningSpellPower = caster.getAttributes()
//				.hasAttribute((Attribute) AttributeRegistry.LIGHTNING_SPELL_POWER.get()) ?
//				caster.getAttributeValue((Attribute)AttributeRegistry.LIGHTNING_SPELL_POWER.get()) : (double)1.0F;
		double technomancySpellPower = caster.getAttributes()
				.hasAttribute((Attribute) CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER.get()) ?
				caster.getAttributeValue((Attribute)CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER.get()) : (double)1.0F;
		return (int)((this.getSpellPower(spellLevel, caster) + ( 0.5 * technomancySpellPower)) * 20.0F);
	}
}