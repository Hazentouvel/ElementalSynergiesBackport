package net.hazen.elemental_synergies.Mixins.Spells.Aqua.CS;

import com.gametechbc.traveloptics.api.init.TravelopticsSchools;
import com.gametechbc.traveloptics.spells.ender.OrbitalVoidSpell;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.acetheeldritchking.cataclysm_spellbooks.spells.abyssal.ConjureCoralssusSpell;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ConjureCoralssusSpell.class)
public abstract class ConjustCoralssusMixin extends AbstractSpell {

	@Override
	public SchoolType getSchoolType() {
		return TravelopticsSchools.AQUA.get();
	}

}