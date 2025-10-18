package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.AbyssalJellyfish;

import net.hazen.elemental_synergies.Items.Extensions.ESArmorMaterial;
import net.hazen.elemental_synergies.Items.Extensions.ESImbuableArmorItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AbyssalJellyfishArmorItem extends ESImbuableArmorItem {
    public AbyssalJellyfishArmorItem(Type type, Properties settings) {
        super(ESArmorMaterial.ABYSSAL_JELLYFISH, type, settings);
    }

    public void onArmorTick(ItemStack stack, Level world, Player player) {
        super.onArmorTick(stack, world, player);
        if (!world.isClientSide && this.isWearingFullSet(player) && player.isUnderWater()) {
            this.grantWaterBreathing(player);
        }

    }

    private void grantWaterBreathing(Player player) {
        if (!player.hasEffect(MobEffects.CONDUIT_POWER)) {
            player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER,
                    200,
                    0,
                    false,
                    false,
                    false));
        }

    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(Type.HELMET.getSlot()).getItem() instanceof AbyssalJellyfishArmorItem &&
                player.getItemBySlot(Type.CHESTPLATE.getSlot()).getItem() instanceof AbyssalJellyfishArmorItem &&
                player.getItemBySlot(Type.LEGGINGS.getSlot()).getItem() instanceof AbyssalJellyfishArmorItem &&
                player.getItemBySlot(Type.BOOTS.getSlot()).getItem() instanceof AbyssalJellyfishArmorItem;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new AbyssalJellyfishArmorRenderer(new AbyssalJellyfishArmorModel());
    }
}