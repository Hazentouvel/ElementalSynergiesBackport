package net.hazen.elemental_synergies.Datagen.Items;

import net.hazen.elemental_synergies.Registries.ESItemRegistry;
import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ESItemModelProvider extends ItemModelProvider {
    public ESItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HazenNStuff.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        withExistingParent(ESItemRegistry.DEEPLING_ARCHMAGE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ESItemRegistry.DEEPLING_SORCEREST_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID,"item/" + item.getId().getPath()));
    }
}