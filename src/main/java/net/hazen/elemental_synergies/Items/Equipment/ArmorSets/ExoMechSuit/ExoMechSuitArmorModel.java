package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.ExoMechSuit;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ExoMechSuitArmorModel extends GeoModel<ExoMechSuitArmorItem> {
    public ExoMechSuitArmorModel() {
    }

    public ResourceLocation getModelResource(ExoMechSuitArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/exo_mech_suit.geo.json");
    }

    public ResourceLocation getTextureResource(ExoMechSuitArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/exo_mech_suit.png");
    }

    public ResourceLocation getAnimationResource(ExoMechSuitArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
