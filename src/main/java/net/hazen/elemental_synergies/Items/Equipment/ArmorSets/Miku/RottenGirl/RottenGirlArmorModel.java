package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Miku.RottenGirl;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RottenGirlArmorModel extends GeoModel<RottenGirlArmorItem> {
    public RottenGirlArmorModel() {
    }

    public ResourceLocation getModelResource(RottenGirlArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/rotten_girl_armor.geo.json");
    }

    public ResourceLocation getTextureResource(RottenGirlArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/rotten_girl_armor.png");
    }

    public ResourceLocation getAnimationResource(RottenGirlArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
