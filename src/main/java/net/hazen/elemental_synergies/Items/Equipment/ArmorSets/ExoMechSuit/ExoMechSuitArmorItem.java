package net.hazen.elemental_synergies.Items.Equipment.ArmorSets.ExoMechSuit;

import net.hazen.elemental_synergies.Items.Extensions.ESArmorMaterial;
import net.hazen.elemental_synergies.Items.Extensions.ESImbuableArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ExoMechSuitArmorItem extends ESImbuableArmorItem {
    public ExoMechSuitArmorItem(Type type, Properties settings) {
        super(ESArmorMaterial.EXO_MECH, type, settings);
    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(Type.HELMET.getSlot()).getItem() instanceof ExoMechSuitArmorItem &&
                player.getItemBySlot(Type.CHESTPLATE.getSlot()).getItem() instanceof ExoMechSuitArmorItem &&
                player.getItemBySlot(Type.LEGGINGS.getSlot()).getItem() instanceof ExoMechSuitArmorItem &&
                player.getItemBySlot(Type.BOOTS.getSlot()).getItem() instanceof ExoMechSuitArmorItem;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new ExoMechSuitArmorRenderer(new ExoMechSuitArmorModel());
    }
}