package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.FreddyFazbear;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FreddyFazbearArmorModel extends GeoModel<FreddyFazbearArmorItem> {
    public FreddyFazbearArmorModel() {
    }

    public ResourceLocation getModelResource(FreddyFazbearArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/freddy_fazbear_armor.geo.json");
    }

    public ResourceLocation getTextureResource(FreddyFazbearArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/freddy_fazbear_armor.png");
    }

    public ResourceLocation getAnimationResource(FreddyFazbearArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
