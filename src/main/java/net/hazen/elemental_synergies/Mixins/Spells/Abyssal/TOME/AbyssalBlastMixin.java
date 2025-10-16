package net.hazen.elemental_synergies.Mixins.Spells.Abyssal.TOME;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.spells.eldritch.AbyssalBlastSpell;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(AbyssalBlastSpell.class)
public abstract class AbyssalBlastMixin extends AbstractSpell {


	public float getDamage(int spellLevel, LivingEntity caster) {
		if (caster == null) {
			return 2.5F + this.getSpellPower(spellLevel, caster) * 2.0F;
		}
		double aquaSpellPower = caster.getAttributes()
				.hasAttribute((Attribute) TravelopticsAttributes.AQUA_SPELL_POWER.get()) ?
				caster.getAttributeValue((Attribute)TravelopticsAttributes.AQUA_SPELL_POWER.get()) : (double)1.0F;
		return (float) (10.0F +(this.getSpellPower(spellLevel, caster) * (0.5 * aquaSpellPower) * 5.0F));
	}
}