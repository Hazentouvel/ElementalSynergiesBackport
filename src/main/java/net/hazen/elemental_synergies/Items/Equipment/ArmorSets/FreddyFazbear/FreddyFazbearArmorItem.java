package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.FreddyFazbear;

import net.hazen.elemental_synergies.Items.Extensions.ESArmorMaterial;
import net.hazen.elemental_synergies.Items.Extensions.ESImbuableArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FreddyFazbearArmorItem extends ESImbuableArmorItem {
    public FreddyFazbearArmorItem(Type type, Properties settings) {
        super(ESArmorMaterial.TECHNOMANCER, type, settings);
    }


    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new FreddyFazbearArmorRenderer(new FreddyFazbearArmorModel());
    }
}