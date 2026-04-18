package net.hazen.elemental_synergies.Datagen.Items;

import net.hazen.elemental_synergies.ElementalSynergies;
import net.hazen.elemental_synergies.Registries.ESItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ESItemTagGenerator extends ItemTagsProvider {
    public ESItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                              CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, ElementalSynergies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(Tags.Items.INGOTS)
                .add(ESItemRegistry.DYNATITE_INGOT.get())

        ;

        this.tag(Tags.Items.GEMS)
                .add(ESItemRegistry.AQUAMARINE.get())

        ;

        this.tag(Tags.Items.RAW_MATERIALS)
                .add(ESItemRegistry.DYNATITE_CLUSTER.get())
        ;


        this.tag(Tags.Items.ARMORS)
                .add(ESItemRegistry.CATACLYSM_HELMET.get())
                .add(ESItemRegistry.CATACLYSM_CHESTPLATE.get())
                .add(ESItemRegistry.CATACLYSM_LEGGINGS.get())
                .add(ESItemRegistry.CATACLYSM_BOOTS.get())

                .add(ESItemRegistry.TITAN_HELMET.get())
                .add(ESItemRegistry.TITAN_CHESTPLATE.get())
                .add(ESItemRegistry.TITAN_LEGGINGS.get())
                .add(ESItemRegistry.TITAN_BOOTS.get())

                .add(ESItemRegistry.ABYSSAL_JELLYFISH_HELMET.get())
                .add(ESItemRegistry.ABYSSAL_JELLYFISH_CHESTPLATE.get())
                .add(ESItemRegistry.ABYSSAL_JELLYFISH_LEGGINGS.get())
                .add(ESItemRegistry.ABYSSAL_JELLYFISH_BOOTS.get())

                .add(ESItemRegistry.FREDDY_FAZBEAR_HELMET.get())
                .add(ESItemRegistry.FREDDY_FAZBEAR_CHESTPLATE.get())
                .add(ESItemRegistry.FREDDY_FAZBEAR_LEGGINGS.get())
                .add(ESItemRegistry.FREDDY_FAZBEAR_BOOTS.get())

                .add(ESItemRegistry.PROJECT_SEKAI_HELMET.get())
                .add(ESItemRegistry.PROJECT_SEKAI_CHESTPLATE.get())
                .add(ESItemRegistry.PROJECT_SEKAI_LEGGINGS.get())
                .add(ESItemRegistry.PROJECT_SEKAI_BOOTS.get())

                .add(ESItemRegistry.ROTTEN_GIRL_HELMET.get())
                .add(ESItemRegistry.ROTTEN_GIRL_CHESTPLATE.get())
                .add(ESItemRegistry.ROTTEN_GIRL_LEGGINGS.get())
                .add(ESItemRegistry.ROTTEN_GIRL_BOOTS.get())

                .add(ESItemRegistry.NERU_HELMET.get())
                .add(ESItemRegistry.NERU_CHESTPLATE.get())
                .add(ESItemRegistry.NERU_LEGGINGS.get())
                .add(ESItemRegistry.NERU_BOOTS.get())

                .add(ESItemRegistry.UTAU_HELMET.get())
                .add(ESItemRegistry.UTAU_CHESTPLATE.get())
                .add(ESItemRegistry.UTAU_LEGGINGS.get())
                .add(ESItemRegistry.UTAU_BOOTS.get())

                .add(ESItemRegistry.SYNTHESIZER_V_HELMET.get())
                .add(ESItemRegistry.SYNTHESIZER_V_CHESTPLATE.get())
                .add(ESItemRegistry.SYNTHESIZER_V_LEGGINGS.get())
                .add(ESItemRegistry.SYNTHESIZER_V_BOOTS.get())

                .add(ESItemRegistry.SCYLLA_HELMET.get())
                .add(ESItemRegistry.SCYLLA_CHESTPLATE.get())
                .add(ESItemRegistry.SCYLLA_LEGGINGS.get())
                .add(ESItemRegistry.SCYLLA_BOOTS.get())

                .add(ESItemRegistry.EXO_MECH_HELMET.get())
                .add(ESItemRegistry.EXO_MECH_CHESTPLATE.get())
                .add(ESItemRegistry.EXO_MECH_LEGGINGS.get())
                .add(ESItemRegistry.EXO_MECH_BOOTS.get())

                .add(ESItemRegistry.MALEDICTUS_HELMET.get())
                .add(ESItemRegistry.MALEDICTUS_CHESTPLATE.get())
                .add(ESItemRegistry.MALEDICTUS_LEGGINGS.get())
                .add(ESItemRegistry.MALEDICTUS_BOOTS.get())

        ;

        this.tag(Tags.Items.ARMORS_HELMETS)
                .add(ESItemRegistry.CATACLYSM_HELMET.get())
                .add(ESItemRegistry.TITAN_HELMET.get())
                .add(ESItemRegistry.ABYSSAL_JELLYFISH_HELMET.get())
                .add(ESItemRegistry.FREDDY_FAZBEAR_HELMET.get())
                .add(ESItemRegistry.PROJECT_SEKAI_HELMET.get())
                .add(ESItemRegistry.ROTTEN_GIRL_HELMET.get())
                .add(ESItemRegistry.NERU_HELMET.get())
                .add(ESItemRegistry.UTAU_HELMET.get())
                .add(ESItemRegistry.SYNTHESIZER_V_HELMET.get())
                .add(ESItemRegistry.SCYLLA_HELMET.get())
                .add(ESItemRegistry.EXO_MECH_HELMET.get())
                .add(ESItemRegistry.MALEDICTUS_HELMET.get())

        ;

        this.tag(Tags.Items.ARMORS_CHESTPLATES)
                .add(ESItemRegistry.CATACLYSM_CHESTPLATE.get())
                .add(ESItemRegistry.TITAN_CHESTPLATE.get())
                .add(ESItemRegistry.ABYSSAL_JELLYFISH_CHESTPLATE.get())
                .add(ESItemRegistry.FREDDY_FAZBEAR_CHESTPLATE.get())
                .add(ESItemRegistry.PROJECT_SEKAI_CHESTPLATE.get())
                .add(ESItemRegistry.ROTTEN_GIRL_CHESTPLATE.get())
                .add(ESItemRegistry.NERU_CHESTPLATE.get())
                .add(ESItemRegistry.UTAU_CHESTPLATE.get())
                .add(ESItemRegistry.SYNTHESIZER_V_CHESTPLATE.get())
                .add(ESItemRegistry.SCYLLA_CHESTPLATE.get())
                .add(ESItemRegistry.EXO_MECH_CHESTPLATE.get())
                .add(ESItemRegistry.MALEDICTUS_CHESTPLATE.get())
        ;

        this.tag(Tags.Items.ARMORS_LEGGINGS)
                .add(ESItemRegistry.CATACLYSM_LEGGINGS.get())
                .add(ESItemRegistry.TITAN_LEGGINGS.get())
                .add(ESItemRegistry.ABYSSAL_JELLYFISH_LEGGINGS.get())
                .add(ESItemRegistry.FREDDY_FAZBEAR_LEGGINGS.get())
                .add(ESItemRegistry.PROJECT_SEKAI_LEGGINGS.get())
                .add(ESItemRegistry.ROTTEN_GIRL_LEGGINGS.get())
                .add(ESItemRegistry.NERU_LEGGINGS.get())
                .add(ESItemRegistry.UTAU_LEGGINGS.get())
                .add(ESItemRegistry.SYNTHESIZER_V_LEGGINGS.get())
                .add(ESItemRegistry.SCYLLA_LEGGINGS.get())
                .add(ESItemRegistry.EXO_MECH_LEGGINGS.get())
                .add(ESItemRegistry.MALEDICTUS_LEGGINGS.get())
        ;

        this.tag(Tags.Items.ARMORS_BOOTS)
                .add(ESItemRegistry.CATACLYSM_BOOTS.get())
                .add(ESItemRegistry.TITAN_BOOTS.get())
                .add(ESItemRegistry.ABYSSAL_JELLYFISH_BOOTS.get())
                .add(ESItemRegistry.FREDDY_FAZBEAR_BOOTS.get())
                .add(ESItemRegistry.PROJECT_SEKAI_BOOTS.get())
                .add(ESItemRegistry.ROTTEN_GIRL_BOOTS.get())
                .add(ESItemRegistry.NERU_BOOTS.get())
                .add(ESItemRegistry.UTAU_BOOTS.get())
                .add(ESItemRegistry.SYNTHESIZER_V_BOOTS.get())
                .add(ESItemRegistry.SCYLLA_BOOTS.get())
                .add(ESItemRegistry.EXO_MECH_BOOTS.get())
                .add(ESItemRegistry.MALEDICTUS_BOOTS.get())
        ;


    }
}