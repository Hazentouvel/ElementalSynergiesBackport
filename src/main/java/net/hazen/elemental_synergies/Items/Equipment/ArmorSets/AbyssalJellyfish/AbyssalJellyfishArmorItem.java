package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.AbyssalJellyfish;

import net.hazen.elemental_synergies.Items.Extensions.ESArmorMaterial;
import net.hazen.elemental_synergies.Items.Extensions.ESImbuableArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AbyssalJellyfishArmorItem extends ESImbuableArmorItem {
    public AbyssalJellyfishArmorItem(Type type, Properties settings) {
        super(ESArmorMaterial.ABYSSAL_JELLYFISH, type, settings);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new AbyssalJellyfishArmorRenderer(new AbyssalJellyfishArmorModel());
    }
}