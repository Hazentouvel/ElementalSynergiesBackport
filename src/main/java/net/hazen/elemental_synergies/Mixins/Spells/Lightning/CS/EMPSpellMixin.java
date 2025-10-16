package net.hazen.elemental_synergies.Mixins.Spells.Lightning.CS;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.spells.ender.OrbitalVoidSpell;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSAttributeRegistry;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSSchoolRegistry;
import net.acetheeldritchking.cataclysm_spellbooks.spells.technomancy.EMPSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EMPSpell.class)
public abstract class EMPSpellMixin extends AbstractSpell {

	@Override
	public SchoolType getSchoolType() {
		return SchoolRegistry.LIGHTNING.get();
	}

	public float getDamage(int spellLevel, LivingEntity caster) {
		if (caster == null) {
			return 2.5F + this.getSpellPower(spellLevel, caster) * 2.0F;
		}
//		double lightningSpellPower = caster.getAttributes()
//				.hasAttribute((Attribute) AttributeRegistry.LIGHTNING_SPELL_POWER.get()) ?
//				caster.getAttributeValue((Attribute)AttributeRegistry.LIGHTNING_SPELL_POWER.get()) : (double)1.0F;
		double technomancySpellPower = caster.getAttributes()
				.hasAttribute((Attribute) CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER.get()) ?
				caster.getAttributeValue((Attribute)CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER.get()) : (double)1.0F;
		return (float)(0.7 * ((double)this.getSpellPower(spellLevel, caster) + (0.5 * technomancySpellPower)));
	}
}