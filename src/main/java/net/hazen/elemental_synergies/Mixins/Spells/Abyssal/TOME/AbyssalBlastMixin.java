package net.hazen.elemental_synergies.Mixins.Spells.Abyssal.TOME;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.init.TravelopticsItems;
import com.gametechbc.traveloptics.spells.eldritch.AbyssalBlastSpell;
import com.github.L_Ender.cataclysm.init.ModItems;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

import static net.acetheeldritchking.cataclysm_spellbooks.util.CSUtils.isValidUnlockItemInInventory;

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

	public boolean allowCrafting() {
		return true;
	}

	public boolean canBeCraftedBy(Player player) {
		Item chitinClaw = TravelopticsItems.ABYSSAL_SPELLWEAVE_INGOT.get();
		return isValidUnlockItemInInventory(chitinClaw, player);
	}
}