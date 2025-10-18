package net.hazen.elemental_synergies.Registries;

import net.hazen.elemental_synergies.ElementalSynergies;
import net.hazen.hazennstuff.Registries.HnSCreativeModeTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ESCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementalSynergies.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ELEMENTAL_SYNERGIES_MATERIALS = CREATIVE_MODE_TABS.register("elemental_synergies_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ESItemRegistry.CLUSTER.get()))
                    .withTabsBefore(new ResourceKey[]{HnSCreativeModeTabs.HAZENNSTUFF_MATERIALS.getKey()})
                    .title(Component.translatable("creativetab.elemental_synergies_materials"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ESItemRegistry.DYNATITE_CLUSTER.get());
                        pOutput.accept(ESItemRegistry.DYNATITE_INGOT.get());
                        pOutput.accept(ESItemRegistry.STEEL_SHEET.get());


                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> ELEMENTAL_SYNERGIES_ARMOR = CREATIVE_MODE_TABS.register("elemental_synergies_armor",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ESItemRegistry.CATACLYSM_HELMET.get()))
                    .withTabsBefore(new ResourceKey[]{HnSCreativeModeTabs.HAZENNSTUFF_ARMOR.getKey()})
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ElementalSynergies.MOD_ID, "elemental_synergies_materials"))
                    .title(Component.translatable("creativetab.elemental_synergies_armor"))
                    .displayItems((pParameters, pOutput) -> {


                        /*
                         *** Armor
                         */

                        pOutput.accept(ESItemRegistry.ABYSSAL_JELLYFISH_HELMET.get());
                        pOutput.accept(ESItemRegistry.ABYSSAL_JELLYFISH_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.ABYSSAL_JELLYFISH_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.ABYSSAL_JELLYFISH_BOOTS.get());

                        pOutput.accept(ESItemRegistry.TITAN_HELMET.get());
                        pOutput.accept(ESItemRegistry.TITAN_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.TITAN_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.TITAN_BOOTS.get());

                        pOutput.accept(ESItemRegistry.CATACLYSM_HELMET.get());
                        pOutput.accept(ESItemRegistry.CATACLYSM_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.CATACLYSM_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.CATACLYSM_BOOTS.get());

                        pOutput.accept(ESItemRegistry.NERU_HELMET.get());
                        pOutput.accept(ESItemRegistry.NERU_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.NERU_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.NERU_BOOTS.get());

                        pOutput.accept(ESItemRegistry.PROJECT_SEKAI_HELMET.get());
                        pOutput.accept(ESItemRegistry.PROJECT_SEKAI_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.PROJECT_SEKAI_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.PROJECT_SEKAI_BOOTS.get());

                        pOutput.accept(ESItemRegistry.ROTTEN_GIRL_HELMET.get());
                        pOutput.accept(ESItemRegistry.ROTTEN_GIRL_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.ROTTEN_GIRL_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.ROTTEN_GIRL_BOOTS.get());

                        pOutput.accept(ESItemRegistry.UTAU_HELMET.get());
                        pOutput.accept(ESItemRegistry.UTAU_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.UTAU_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.UTAU_BOOTS.get());

                        pOutput.accept(ESItemRegistry.SYNTHESIZER_V_HELMET.get());
                        pOutput.accept(ESItemRegistry.SYNTHESIZER_V_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.SYNTHESIZER_V_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.SYNTHESIZER_V_BOOTS.get());

                        pOutput.accept(ESItemRegistry.FREDDY_FAZBEAR_HELMET.get());
                        pOutput.accept(ESItemRegistry.FREDDY_FAZBEAR_CHESTPLATE.get());
                        pOutput.accept(ESItemRegistry.FREDDY_FAZBEAR_LEGGINGS.get());
                        pOutput.accept(ESItemRegistry.FREDDY_FAZBEAR_BOOTS.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ELEMENTAL_SYNERGIES_MOBS = CREATIVE_MODE_TABS.register("elemental_synergies_mobs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ESItemRegistry.CLUSTER.get()))
                    .withTabsBefore(new ResourceKey[]{CreativeModeTabs.SPAWN_EGGS})
                    .title(Component.translatable("creativetab.elemental_synergies_materials"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ESItemRegistry.DEEPLING_SORCEREST_SPAWN_EGG.get());
                        pOutput.accept(ESItemRegistry.DEEPLING_ARCHMAGE_SPAWN_EGG.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}