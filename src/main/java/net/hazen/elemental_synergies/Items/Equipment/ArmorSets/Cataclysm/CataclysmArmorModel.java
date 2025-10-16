package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Cataclysm;

import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.AbyssalJellyfish.AbyssalJellyfishArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CataclysmArmorModel extends GeoModel<CataclysmArmorItem> {
    public CataclysmArmorModel() {
    }

    public ResourceLocation getModelResource(CataclysmArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/cataclysm_armor.geo.json");
    }

    public ResourceLocation getTextureResource(CataclysmArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/cataclysm_armor.png");
    }

    public ResourceLocation getAnimationResource(CataclysmArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
