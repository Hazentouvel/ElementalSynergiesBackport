package net.hazen.elemental_synergies.Mixins.Spells.Aqua.CS;

import com.gametechbc.traveloptics.api.init.TravelopticsSchools;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.spells.abyssal.ConjureClawdianSpell;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ConjureClawdianSpell.class)
public abstract class ConjureClawdianMixin extends AbstractSpell {

	@Override
	public SchoolType getSchoolType() {
		return TravelopticsSchools.AQUA.get();
	}

}