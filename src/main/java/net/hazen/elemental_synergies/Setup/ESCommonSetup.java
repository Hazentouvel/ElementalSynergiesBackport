package net.hazen.elemental_synergies.Setup;

import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingArchmage.DeeplingArchmageEntity;
import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingSorcerest.DeeplingSorcerestEntity;
import net.hazen.elemental_synergies.Registries.ESEntityRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
    modid = "elemental_synergies",
    bus = Bus.MOD
)
public class ESCommonSetup {
    public ESCommonSetup() {
    }

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        event.put((EntityType) ESEntityRegistry.DEEPLING_SORCEREST.get(), DeeplingSorcerestEntity.prepareAttributes().build());
        event.put((EntityType) ESEntityRegistry.DEEPLING_ARCHMAGE.get(), DeeplingArchmageEntity.prepareAttributes().build());
    }
}
