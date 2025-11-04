package net.hazen.elemental_synergies.Mixins.Spells.Geomancy.TOME;

import com.gametechbc.gtbcs_geomancy_plus.api.init.GGSchools;
import com.gametechbc.traveloptics.api.init.TravelopticsSchools;
import com.gametechbc.traveloptics.spells.nature.SteleCascadeSpell;
import com.github.L_Ender.cataclysm.init.ModItems;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.spells.abyssal.ConjureClawdianSpell;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

import static net.acetheeldritchking.cataclysm_spellbooks.util.CSUtils.isValidUnlockItemInInventory;

@Mixin(SteleCascadeSpell.class)
public abstract class SteleCascadeMixin extends AbstractSpell {

	public SchoolType getSchoolType() {
		return GGSchools.GEO.get();
	}

}