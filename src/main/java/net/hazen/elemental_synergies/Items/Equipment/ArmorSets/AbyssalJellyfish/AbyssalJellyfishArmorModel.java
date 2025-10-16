package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.AbyssalJellyfish;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AbyssalJellyfishArmorModel extends GeoModel<AbyssalJellyfishArmorItem> {
    public AbyssalJellyfishArmorModel() {
    }

    public ResourceLocation getModelResource(AbyssalJellyfishArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/abyssal_jellyfish_armor.geo.json");
    }

    public ResourceLocation getTextureResource(AbyssalJellyfishArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/abyssal_jellyfish_armor_alt.png");
    }

    public ResourceLocation getAnimationResource(AbyssalJellyfishArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
