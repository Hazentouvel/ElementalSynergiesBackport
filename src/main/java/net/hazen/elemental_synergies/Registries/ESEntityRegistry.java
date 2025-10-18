package net.hazen.elemental_synergies.Registries;

import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingArchmage.DeeplingArchmageEntity;
import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingSorcerest.DeeplingSorcerestEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ESEntityRegistry {
    private static final DeferredRegister<EntityType<?>> ENTITIES;
    public static final RegistryObject<EntityType<DeeplingSorcerestEntity>> DEEPLING_SORCEREST;
    public static final RegistryObject<EntityType<DeeplingArchmageEntity>> DEEPLING_ARCHMAGE;

    public ESEntityRegistry() {
    }

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

    @SubscribeEvent
    public static void initializeAttributes(EntityAttributeCreationEvent event) {
        SpawnPlacements.register((EntityType)DEEPLING_SORCEREST.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, DeeplingSorcerestEntity::candeeplingSpawn);
    }

    static {
        ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "elemental_synergies");

        DEEPLING_SORCEREST = ENTITIES.register("deepling_sorcerest",
                () -> EntityType.Builder.of(DeeplingSorcerestEntity::new,
                        MobCategory.MONSTER)
                        .sized(0.6F, 2.3F)
                        .clientTrackingRange(64)
                        .build((ResourceLocation.fromNamespaceAndPath(
                                "elemental_synergies",
                                "deepling_sorcerest"))
                                .toString()));

        DEEPLING_ARCHMAGE = ENTITIES.register("deepling_archmage",
                () -> EntityType.Builder.of(DeeplingArchmageEntity::new,
                                MobCategory.MONSTER)
                        .sized(0.7F, 2.6F)
                        .clientTrackingRange(64)
                        .build((ResourceLocation.fromNamespaceAndPath(
                                "elemental_synergies",
                                "deepling_archmage"))
                                .toString()));
    }

}
