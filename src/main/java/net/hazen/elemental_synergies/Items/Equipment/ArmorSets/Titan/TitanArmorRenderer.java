package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Titan;

import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.AbyssalJellyfish.AbyssalJellyfishArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.AbyssalJellyfish.AbyssalJellyfishArmorModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TitanArmorRenderer extends GeoArmorRenderer<TitanArmorItem> {
    public TitanArmorRenderer(TitanArmorModel titanArmorModel) {
        super(new TitanArmorModel());
        this.addRenderLayer(new TitanArmorLayer(this));
        this.head = new GeoBone((GeoBone)null, "armorHead", false, (double)0.0F, false, false);
        this.body = new GeoBone((GeoBone)null, "armorBody", false, (double)0.0F, false, false);
        this.rightArm = new GeoBone((GeoBone)null, "armorRightArm", false, (double)0.0F, false, false);
        this.leftArm = new GeoBone((GeoBone)null, "armorLeftArm", false, (double)0.0F, false, false);
        this.rightLeg = new GeoBone((GeoBone)null, "armorRightLeg", false, (double)0.0F, false, false);
        this.leftLeg = new GeoBone((GeoBone)null, "armorLeftLeg", false, (double)0.0F, false, false);
        this.rightBoot = new GeoBone((GeoBone)null, "armorRightBoot", false, (double)0.0F, false, false);
        this.leftBoot = new GeoBone((GeoBone)null, "armorLeftBoot", false, (double)0.0F, false, false);
    }

    public RenderType getRenderType(TitanArmorItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(this.getTextureLocation(animatable));
    }
}
