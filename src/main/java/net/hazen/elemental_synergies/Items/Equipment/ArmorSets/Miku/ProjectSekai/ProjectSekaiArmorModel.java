package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Miku.ProjectSekai;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ProjectSekaiArmorModel extends GeoModel<ProjectSekaiArmorItem> {
    public ProjectSekaiArmorModel() {
    }

    public ResourceLocation getModelResource(ProjectSekaiArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "geo/armor/project_sekai_armor.geo.json");
    }

    public ResourceLocation getTextureResource(ProjectSekaiArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "elemental_synergies",
                "textures/armor/project_sekai_armor.png");
    }

    public ResourceLocation getAnimationResource(ProjectSekaiArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(
                "irons_spellbooks",
                "animations/wizard_armor_animation.json");
    }
}
