package net.hazen.elemental_synergies.Mixins.Spells.Aqua.TOME;

import com.gametechbc.traveloptics.spells.aqua.TheHowlingTempestSpell;
import com.github.L_Ender.cataclysm.init.ModItems;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

import static net.acetheeldritchking.cataclysm_spellbooks.util.CSUtils.isValidUnlockItemInInventory;

@Mixin(TheHowlingTempestSpell.class)
public abstract class TheHowlingTempestMixin extends AbstractSpell {

	public boolean allowCrafting() {
		return true;
	}

	public boolean canBeCraftedBy(Player player) {
		Item[] validItems = {
				ModItems.ESSENCE_OF_THE_STORM.get(),
				ModItems.LACRIMA.get()
		};
		for (Item item : validItems) {
			if (isValidUnlockItemInInventory(item, player)) {
				return true;
			}
		}
		return false;
	}

}