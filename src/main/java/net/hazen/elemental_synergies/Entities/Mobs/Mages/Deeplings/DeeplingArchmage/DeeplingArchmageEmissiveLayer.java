package net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingArchmage;

import com.gametechbc.traveloptics.entity.mobs.nightwarden_boss.NightwardenBossEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMob;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class DeeplingArchmageEmissiveLayer extends GeoRenderLayer<AbstractSpellCastingMob> {
    public DeeplingArchmageEmissiveLayer(GeoRenderer<AbstractSpellCastingMob> entityRenderer) {
        super(entityRenderer);
    }

    public void render(PoseStack poseStack, AbstractSpellCastingMob animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        ResourceLocation layerTex = ResourceLocation.fromNamespaceAndPath("elemental_synergies", "textures/entities/mobs/deepling_archmage_layer.png");

        RenderType glowRenderType = RenderType.eyes(layerTex);
        this.getRenderer().reRender(this.getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}

