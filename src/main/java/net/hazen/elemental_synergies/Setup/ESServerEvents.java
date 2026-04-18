package net.hazen.elemental_synergies.Setup;

import com.gametechbc.gtbcs_geomancy_plus.api.init.GGSchools;
import com.gametechbc.traveloptics.spells.nature.SteleCascadeSpell;
import io.redspace.ironsspellbooks.api.config.ModifyDefaultConfigValuesEvent;
import io.redspace.ironsspellbooks.api.config.SpellConfigParameter;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = "elemental_synergies",
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class ESServerEvents {

    @SubscribeEvent
    public static void modifySpellSchool(ModifyDefaultConfigValuesEvent event) {

        if(event.getSpell() instanceof SteleCascadeSpell) {
            event.setDefaultValue(SpellConfigParameter.SCHOOL, GGSchools.GEO.get());
        }

    }
}
