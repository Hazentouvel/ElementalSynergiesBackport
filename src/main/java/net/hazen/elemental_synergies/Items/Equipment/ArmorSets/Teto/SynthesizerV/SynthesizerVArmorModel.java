package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Teto.SynthesizerV;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SynthesizerVArmorModel extends GeoModel<SynthesizerVArmorItem> {
    public SynthesizerVArmorModel() {
    }

    public ResourceLocation getModelResource(SynthesizerVArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/synthesizer_v_armor.geo.json");
    }

    public ResourceLocation getTextureResource(SynthesizerVArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/synthesizer_v_armor.png");
    }

    public ResourceLocation getAnimationResource(SynthesizerVArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
