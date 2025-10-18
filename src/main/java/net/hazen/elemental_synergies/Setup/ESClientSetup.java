package net.hazen.elemental_synergies.Setup;

import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingArchmage.DeeplingArchmageRenderer;
import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingSorcerest.DeeplingSorcerestRenderer;
import net.hazen.elemental_synergies.Registries.ESEntityRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = "elemental_synergies",
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = {Dist.CLIENT}
)
public class ESClientSetup {
    public ESClientSetup() {
    }

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType) ESEntityRegistry.DEEPLING_SORCEREST.get(), DeeplingSorcerestRenderer::new);
        event.registerEntityRenderer((EntityType) ESEntityRegistry.DEEPLING_ARCHMAGE.get(), DeeplingArchmageRenderer::new);


    }
}
