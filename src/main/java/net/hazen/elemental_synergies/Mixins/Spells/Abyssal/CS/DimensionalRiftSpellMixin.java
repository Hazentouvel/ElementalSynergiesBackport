package net.hazen.elemental_synergies.Mixins.Spells.Abyssal.CS;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.github.L_Ender.cataclysm.entity.AnimationMonster.BossMonsters.The_Leviathan.Dimensional_Rift_Entity;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.acetheeldritchking.cataclysm_spellbooks.spells.abyssal.DimensionalRiftSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(DimensionalRiftSpell.class)
public abstract class DimensionalRiftSpellMixin extends AbstractSpell {

	public int getRiftLifespan(int spellLevel, LivingEntity caster) {
		double aquaSpellPower = caster.getAttributes().hasAttribute((Attribute) TravelopticsAttributes.AQUA_SPELL_POWER.get())
				? caster.getAttributeValue((Attribute) TravelopticsAttributes.AQUA_SPELL_POWER.get())
				: 1.0;

		int lifespanPerLevel = (int)((this.getSpellPower(spellLevel, caster) + ( 0.5 * aquaSpellPower)) * 100.0F);
		int baseLevel = 100;
		int reduceLifeSpan = lifespanPerLevel - baseLevel;
		return reduceLifeSpan;
	}

	public int setRiftStage(int spellLevel, Dimensional_Rift_Entity rift) {
		if (rift.getStage() < 4) {
			rift.setStage(rift.getStage() + spellLevel);
		}

		return rift.getStage();
	}
}