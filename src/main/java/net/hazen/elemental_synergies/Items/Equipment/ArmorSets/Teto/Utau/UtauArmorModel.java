package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Teto.Utau;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class UtauArmorModel extends GeoModel<UtauArmorItem> {
    public UtauArmorModel() {
    }

    public ResourceLocation getModelResource(UtauArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/utau_armor.geo.json");
    }

    public ResourceLocation getTextureResource(UtauArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/utau_armor.png");
    }

    public ResourceLocation getAnimationResource(UtauArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
