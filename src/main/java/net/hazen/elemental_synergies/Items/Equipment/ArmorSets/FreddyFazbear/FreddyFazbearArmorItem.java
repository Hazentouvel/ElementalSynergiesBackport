package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.FreddyFazbear;

import net.hazen.elemental_synergies.Items.Extensions.ESArmorMaterial;
import net.hazen.elemental_synergies.Items.Extensions.ESImbuableArmorItem;
import net.hazen.hazennstuff.Items.Extensions.HnSArmorMaterial;
import net.hazen.hazennstuff.Items.Extensions.HnSImbuableArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FreddyFazbearArmorItem extends HnSImbuableArmorItem {
    public FreddyFazbearArmorItem(Type type, Properties settings) {
        super(HnSArmorMaterial.ELECTROMANCER, type, settings);
    }


    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new FreddyFazbearArmorRenderer(new FreddyFazbearArmorModel());
    }
}