package net.hazen.elemental_synergies.Mixins.Spells.Aqua.CS;

import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import com.gametechbc.traveloptics.api.init.TravelopticsSchools;
import com.gametechbc.traveloptics.spells.ender.OrbitalVoidSpell;
import com.github.L_Ender.cataclysm.init.ModItems;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSSchoolRegistry;
import net.acetheeldritchking.cataclysm_spellbooks.spells.abyssal.ConjureCoralssusSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

import static net.acetheeldritchking.cataclysm_spellbooks.util.CSUtils.isValidUnlockItemInInventory;

@Mixin(ConjureCoralssusSpell.class)
public abstract class ConjureCoralGolemMixin extends AbstractSpell {

	@Override
	public SchoolType getSchoolType() {
		return TravelopticsSchools.AQUA.get();
	}


	public boolean canBeCraftedBy(Player player) {
		Item[] validItems = {
				ModItems.CRYSTALLIZED_CORAL_FRAGMENTS.get(),
				ModItems.CRYSTALLIZED_CORAL.get()
		};
		for (Item item : validItems) {
			if (isValidUnlockItemInInventory(item, player)) {
				return true;
			}
		}
		return false;
	}
}