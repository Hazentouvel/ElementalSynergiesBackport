package net.hazen.elemental_synergies.Datagen;

import net.hazen.elemental_synergies.Datagen.Items.ESBlockTagGenerator;
import net.hazen.elemental_synergies.Datagen.Items.ESItemModelProvider;
import net.hazen.elemental_synergies.Datagen.Items.ESItemTagGenerator;
import net.hazen.elemental_synergies.ElementalSynergies;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ElementalSynergies.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ESRecipeProvider(packOutput));

        generator.addProvider(event.includeClient(), new ESItemModelProvider(packOutput, existingFileHelper));


        ESBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new ESBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ESItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

    }
}