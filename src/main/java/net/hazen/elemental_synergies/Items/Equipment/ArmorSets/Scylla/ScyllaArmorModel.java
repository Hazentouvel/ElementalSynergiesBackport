package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Scylla;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ScyllaArmorModel extends GeoModel<ScyllaArmorItem> {
    public ScyllaArmorModel() {
    }

    public ResourceLocation getModelResource(ScyllaArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/scylla_armor.geo.json");
    }

    public ResourceLocation getTextureResource(ScyllaArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/scylla_armor.png");
    }

    public ResourceLocation getAnimationResource(ScyllaArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "animations/armor/scylla_armor.animation.json");
    }
}
