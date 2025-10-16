package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Titan;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TitanArmorModel extends GeoModel<TitanArmorItem> {
    public TitanArmorModel() {
    }

    public ResourceLocation getModelResource(TitanArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/titan_armor.geo.json");
    }

    public ResourceLocation getTextureResource(TitanArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/titan_armor.png");
    }

    public ResourceLocation getAnimationResource(TitanArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
