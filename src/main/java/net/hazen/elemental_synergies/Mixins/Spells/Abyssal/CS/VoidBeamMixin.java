package net.hazen.elemental_synergies.Mixins.Spells.Abyssal.CS;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.acetheeldritchking.cataclysm_spellbooks.spells.abyssal.VoidBeamSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(VoidBeamSpell.class)
public abstract class VoidBeamMixin extends AbstractSpell {


	public float getDamage(int spellLevel, LivingEntity caster) {
		if (caster == null) {
			return 2.5F + this.getSpellPower(spellLevel, caster) * 2.0F;
		}
		double aquaSpellPower = caster.getAttributes()
				.hasAttribute((Attribute) TravelopticsAttributes.AQUA_SPELL_POWER.get()) ?
				caster.getAttributeValue((Attribute)TravelopticsAttributes.AQUA_SPELL_POWER.get()) : (double)1.0F;
		return (float)(2.5F + this.getSpellPower(spellLevel, caster) * (0.5 * aquaSpellPower)/ 2.0F);
	}
}