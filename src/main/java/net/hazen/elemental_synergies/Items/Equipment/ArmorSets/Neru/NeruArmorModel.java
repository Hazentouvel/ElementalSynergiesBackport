package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Neru;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NeruArmorModel extends GeoModel<NeruArmorItem> {
    public NeruArmorModel() {
    }

    public ResourceLocation getModelResource(NeruArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/neru_armor.geo.json");
    }

    public ResourceLocation getTextureResource(NeruArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/neru_armor.png");
    }

    public ResourceLocation getAnimationResource(NeruArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
