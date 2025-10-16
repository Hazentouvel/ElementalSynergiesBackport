package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Cataclysm;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.AbyssalJellyfish.AbyssalJellyfishArmorModel;
import net.hazen.elemental_synergies.Items.Extensions.ESArmorMaterial;
import net.hazen.elemental_synergies.Items.Extensions.ESImbuableArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CataclysmArmorItem extends ESImbuableArmorItem {
    public CataclysmArmorItem(Type type, Properties settings) {
        super(ESArmorMaterial.CATACLYSM, type, settings);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new CataclysmArmorRenderer(new CataclysmArmorModel());
    }
}