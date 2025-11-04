package net.hazen.elemental_synergies.Mixins.Spells.Geomancy.CS;

import com.gametechbc.gtbcs_geomancy_plus.api.init.GGSchools;
import com.gametechbc.traveloptics.spells.nature.SteleCascadeSpell;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.spells.nature.MonolithCrashSpell;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MonolithCrashSpell.class)
public abstract class MonolithCrashMixin extends AbstractSpell {

	public SchoolType getSchoolType() {
		return GGSchools.GEO.get();
	}

}