package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Maledictus;

import net.hazen.elemental_synergies.Items.Extensions.ESArmorMaterial;
import net.hazen.elemental_synergies.Items.Extensions.ESImbuableArmorItem;
import net.hazen.hazennstuff.Items.Extensions.HnSArmorMaterial;
import net.hazen.hazennstuff.Items.Extensions.HnSImbuableArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MaledictusArmorItem extends HnSImbuableArmorItem {
    public MaledictusArmorItem(Type type, Properties settings) {
        super(HnSArmorMaterial.CRYOMANCER, type, settings);
    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(Type.HELMET.getSlot()).getItem() instanceof MaledictusArmorItem &&
                player.getItemBySlot(Type.CHESTPLATE.getSlot()).getItem() instanceof MaledictusArmorItem &&
                player.getItemBySlot(Type.LEGGINGS.getSlot()).getItem() instanceof MaledictusArmorItem &&
                player.getItemBySlot(Type.BOOTS.getSlot()).getItem() instanceof MaledictusArmorItem;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new MaledictusArmorRenderer(new MaledictusArmorModel());
    }
}