package net.hazen.elemental_synergies.Datagen.Items;


import net.hazen.elemental_synergies.ElementalSynergies;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ESBlockTagGenerator extends BlockTagsProvider {
    public ESBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ElementalSynergies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

//        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(HnSBlockRegistry.ZENALITE_BLOCK.get(),
//                        HnSBlockRegistry.ZENALITE_ORE.get(),
//                        HnSBlockRegistry.DEEPSLATE_ZENALITE_ORE.get(),
//                        HnSBlockRegistry.END_STONE_ZENALITE_ORE.get())
//
//        ;
//
//
//        this.tag(BlockTags.NEEDS_IRON_TOOL);
//
//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .add(HnSBlockRegistry.ZENALITE_ORE.get())
//                .add(HnSBlockRegistry.DEEPSLATE_ZENALITE_ORE.get())
//                .add(HnSBlockRegistry.END_STONE_ZENALITE_ORE.get())
//
//        ;
//
//        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
//                ;
//
//        this.tag(BlockTags.NEEDS_STONE_TOOL)
//
//        ;
//
//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//
//        ;


    }
}