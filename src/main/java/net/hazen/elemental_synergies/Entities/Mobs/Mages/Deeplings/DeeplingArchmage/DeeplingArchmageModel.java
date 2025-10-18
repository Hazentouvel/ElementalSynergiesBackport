package net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingArchmage;

import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMob;
import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMobModel;
import net.minecraft.resources.ResourceLocation;

public class DeeplingArchmageModel extends AbstractSpellCastingMobModel {
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath("elemental_synergies", "textures/entities/mobs/deepling_archmage.png");
    public static final ResourceLocation MODEL = ResourceLocation.fromNamespaceAndPath("elemental_synergies", "geo/entities/mobs/deepling_archmage.geo.json");
    public static final ResourceLocation ANIMATION = ResourceLocation.fromNamespaceAndPath("traveloptics", "animations/casting_animations.json");

    public DeeplingArchmageModel() {
    }

    public ResourceLocation getTextureResource(AbstractSpellCastingMob object) {return TEXTURE;}
    public ResourceLocation getModelResource(AbstractSpellCastingMob object) {return MODEL;}
    public ResourceLocation getAnimationResource(AbstractSpellCastingMob object) {return ANIMATION;}


}
