package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Maledictus;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MaledictusArmorModel extends GeoModel<MaledictusArmorItem> {
    public MaledictusArmorModel() {
    }

    public ResourceLocation getModelResource(MaledictusArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/maledictus_armor.geo.json");
    }

    public ResourceLocation getTextureResource(MaledictusArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/maledictus_armor.png");
    }

    public ResourceLocation getAnimationResource(MaledictusArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
