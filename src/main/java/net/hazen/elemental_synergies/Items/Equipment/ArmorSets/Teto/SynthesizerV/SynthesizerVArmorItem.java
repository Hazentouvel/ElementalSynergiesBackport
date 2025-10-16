package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Teto.SynthesizerV;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import net.hazen.elemental_synergies.Items.Extensions.ESArmorMaterial;
import net.hazen.elemental_synergies.Items.Extensions.ESImbuableArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SynthesizerVArmorItem extends ESImbuableArmorItem {
    public SynthesizerVArmorItem(Type type, Properties settings) {
        super(ESArmorMaterial.MUSICIAN, type, settings);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new SynthesizerVArmorModel());
    }
}