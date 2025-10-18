package net.hazen.elemental_synergies.Mixins.Spells.Aqua.CS;

import com.gametechbc.traveloptics.api.init.TravelopticsSchools;
import com.gametechbc.traveloptics.spells.ender.OrbitalVoidSpell;
import com.github.L_Ender.cataclysm.init.ModItems;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.spells.abyssal.ConjureCoralssusSpell;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

import static net.acetheeldritchking.cataclysm_spellbooks.util.CSUtils.isValidUnlockItemInInventory;

@Mixin(ConjureCoralssusSpell.class)
public abstract class ConjustCoralssusMixin extends AbstractSpell {

	public boolean canBeCraftedBy(Player player) {
		Item coralChunk = ModItems.CORAL_CHUNK.get();
		return isValidUnlockItemInInventory(coralChunk, player);
	}

}