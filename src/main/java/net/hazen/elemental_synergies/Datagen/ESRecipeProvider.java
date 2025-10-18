package net.hazen.elemental_synergies.Datagen;

import com.gametechbc.gtbcs_geomancy_plus.init.GGItems;
import com.gametechbc.traveloptics.init.TravelopticsItems;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.acetheeldritchking.cataclysm_spellbooks.registries.ItemRegistries;
import net.hazen.elemental_synergies.ElementalSynergies;
import net.hazen.elemental_synergies.Registries.ESItemRegistry;
import net.hazen.hazennstuff.Datagen.HnSTags;
import net.hazen.hazennstuff.Registries.HnSItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ESRecipeProvider extends RecipeProvider implements IConditionBuilder {
//    private static final List<ItemLike> ZENALITE_SMELTABLES = List.of(
//            HnSItemRegistry.STARKISSED_ZENALITE.get(),
//            HnSBlockRegistry.ZENALITE_ORE.get(),
//            HnSBlockRegistry.DEEPSLATE_ZENALITE_ORE.get(),
//            HnSBlockRegistry.END_STONE_ZENALITE_ORE.get()
//    );
//
//    private static final List<ItemLike> STEEL_SMELTABLES = List.of(
//            HnSItemRegistry.CRUDE_METAL.get()
//    );

    public ESRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        /*
        *** Ores
         */
//        oreSmelting(pWriter, ZENALITE_SMELTABLES,
//                RecipeCategory.MISC,
//                HnSItemRegistry.ZENALITE_INGOT.get(),
//                0.25f,
//                200,
//                "ZENALITE"
//
//        );
//        oreBlasting(pWriter, ZENALITE_SMELTABLES,
//                RecipeCategory.MISC,
//                HnSItemRegistry.ZENALITE_INGOT.get(),
//                0.25f,
//                100,
//                "ZENALITE"
//
//        );
//
//        oreSmelting(pWriter, STEEL_SMELTABLES,
//                RecipeCategory.MISC,
//                HnSItemRegistry.STEEL_INGOT.get(),
//                0.25f,
//                200,
//                "STEEL"
//
//        );
//        oreBlasting(pWriter, STEEL_SMELTABLES,
//                RecipeCategory.MISC,
//                HnSItemRegistry.STEEL_INGOT.get(),
//                0.25f,
//                100,
//                "STEEL"
//
//        );

        /*
        *** Materials and Blocks
         */

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.STEEL_SHEET.get())
                .pattern("   ")
                .pattern("SSS")
                .pattern("   ")
                .define('S', HnSTags.Items.INGOTS_STEEL)
                .unlockedBy(getHasName(HnSItemRegistry.STEEL_INGOT.get()),
                        has(HnSItemRegistry.STEEL_INGOT.get())
                )
                .save(pWriter);

        /*
        *** Armor Sets
         */

        /*
        *** Water
         */


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.ABYSSAL_JELLYFISH_HELMET.get())
                .pattern("ZZZ")
                .pattern("ASR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', TravelopticsItems.DEEPLING_MAGE_ARMOR_HELMET.get())
                .define('R', TravelopticsItems.AQUA_RUNE.get())
                .define('A', ItemRegistries.ABYSSAL_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.ABYSSAL_JELLYFISH_CHESTPLATE.get())
                .pattern("ZSZ")
                .pattern("AZR")
                .pattern("ZZZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', TravelopticsItems.DEEPLING_MAGE_ARMOR_ROBE.get())
                .define('R', TravelopticsItems.AQUA_RUNE.get())
                .define('A', ItemRegistries.ABYSSAL_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.ABYSSAL_JELLYFISH_LEGGINGS.get())
                .pattern("AZR")
                .pattern("ZSZ")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', TravelopticsItems.DEEPLING_MAGE_ARMOR_LEGGINGS.get())
                .define('R', TravelopticsItems.AQUA_RUNE.get())
                .define('A', ItemRegistries.ABYSSAL_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.ABYSSAL_JELLYFISH_BOOTS.get())
                .pattern("Z Z")
                .pattern("ASR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', TravelopticsItems.DEEPLING_MAGE_ARMOR_BOOTS.get())
                .define('R', TravelopticsItems.AQUA_RUNE.get())
                .define('A', ItemRegistries.ABYSSAL_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.CATACLYSM_HELMET.get())
                .pattern("ZZZ")
                .pattern("ASR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', ItemRegistry.NETHERITE_MAGE_HELMET.get())
                .define('R', ItemRegistries.TECHNOMANCY_RUNE.get())
                .define('A', ItemRegistry.FIRE_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.CATACLYSM_CHESTPLATE.get())
                .pattern("ZSZ")
                .pattern("AZR")
                .pattern("ZZZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', ItemRegistry.NETHERITE_MAGE_CHESTPLATE.get())
                .define('R', ItemRegistries.TECHNOMANCY_RUNE.get())
                .define('A', ItemRegistry.FIRE_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.CATACLYSM_LEGGINGS.get())
                .pattern("AZR")
                .pattern("ZSZ")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', ItemRegistry.NETHERITE_MAGE_LEGGINGS.get())
                .define('R', ItemRegistries.TECHNOMANCY_RUNE.get())
                .define('A', ItemRegistry.FIRE_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.CATACLYSM_BOOTS.get())
                .pattern("Z Z")
                .pattern("ASR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', ItemRegistry.NETHERITE_MAGE_BOOTS.get())
                .define('R', ItemRegistries.TECHNOMANCY_RUNE.get())
                .define('A', ItemRegistry.FIRE_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.TITAN_HELMET.get())
                .pattern("ZZZ")
                .pattern("ASR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', ItemRegistry.NETHERITE_MAGE_HELMET.get())
                .define('R', GGItems.GEO_RUNE.get())
                .define('A', ItemRegistry.FIRE_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.TITAN_CHESTPLATE.get())
                .pattern("ZSZ")
                .pattern("AZR")
                .pattern("ZZZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', ItemRegistry.NETHERITE_MAGE_CHESTPLATE.get())
                .define('R', GGItems.GEO_RUNE.get())
                .define('A', ItemRegistry.FIRE_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.TITAN_LEGGINGS.get())
                .pattern("AZR")
                .pattern("ZSZ")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', ItemRegistry.NETHERITE_MAGE_LEGGINGS.get())
                .define('R', GGItems.GEO_RUNE.get())
                .define('A', ItemRegistry.FIRE_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.TITAN_BOOTS.get())
                .pattern("Z Z")
                .pattern("ASR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('S', ItemRegistry.NETHERITE_MAGE_BOOTS.get())
                .define('R', GGItems.GEO_RUNE.get())
                .define('A', ItemRegistry.FIRE_RUNE.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.FREDDY_FAZBEAR_HELMET.get())
                .pattern("RSR")
                .pattern("ZAZ")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_HELMET.get())
                .define('R', ItemRegistries.TECHNOMANCY_RUNE.get())
                .define('S', ESItemRegistry.STEEL_SHEET.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.FREDDY_FAZBEAR_CHESTPLATE.get())
                .pattern("SAS")
                .pattern("RZR")
                .pattern("ZZZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_CHESTPLATE.get())
                .define('R', ItemRegistries.TECHNOMANCY_RUNE.get())
                .define('S', ESItemRegistry.STEEL_SHEET.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.FREDDY_FAZBEAR_LEGGINGS.get())
                .pattern("RZR")
                .pattern("SAS")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_LEGGINGS.get())
                .define('R', ItemRegistries.TECHNOMANCY_RUNE.get())
                .define('S', ESItemRegistry.STEEL_SHEET.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.FREDDY_FAZBEAR_BOOTS.get())
                .pattern("S S")
                .pattern("RAR")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_BOOTS.get())
                .define('R', ItemRegistries.TECHNOMANCY_RUNE.get())
                .define('S', ESItemRegistry.STEEL_SHEET.get())
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.PROJECT_SEKAI_HELMET.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_HELMET.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.CYAN_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.PROJECT_SEKAI_CHESTPLATE.get())
                .pattern("ZAZ")
                .pattern("RZR")
                .pattern("ZDZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_CHESTPLATE.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.CYAN_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.PROJECT_SEKAI_LEGGINGS.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_LEGGINGS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.CYAN_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.PROJECT_SEKAI_BOOTS.get())
                .pattern("ZDZ")
                .pattern("RAR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_BOOTS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.CYAN_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.NERU_HELMET.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_HELMET.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.YELLOW_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.NERU_CHESTPLATE.get())
                .pattern("ZAZ")
                .pattern("RZR")
                .pattern("ZDZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_CHESTPLATE.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.YELLOW_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.NERU_LEGGINGS.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_LEGGINGS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.YELLOW_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.NERU_BOOTS.get())
                .pattern("ZDZ")
                .pattern("RAR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_BOOTS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.YELLOW_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.ROTTEN_GIRL_HELMET.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_HELMET.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.GREEN_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.ROTTEN_GIRL_CHESTPLATE.get())
                .pattern("ZAZ")
                .pattern("RZR")
                .pattern("ZDZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_CHESTPLATE.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.GREEN_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.ROTTEN_GIRL_LEGGINGS.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_LEGGINGS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.GREEN_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.ROTTEN_GIRL_BOOTS.get())
                .pattern("ZDZ")
                .pattern("RAR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_BOOTS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.GREEN_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.SYNTHESIZER_V_HELMET.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ESItemRegistry.UTAU_HELMET.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.RED_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.SYNTHESIZER_V_CHESTPLATE.get())
                .pattern("ZAZ")
                .pattern("RZR")
                .pattern("ZDZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ESItemRegistry.UTAU_CHESTPLATE.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.RED_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.SYNTHESIZER_V_LEGGINGS.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ESItemRegistry.UTAU_LEGGINGS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.RED_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.SYNTHESIZER_V_BOOTS.get())
                .pattern("ZDZ")
                .pattern("RAR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ESItemRegistry.UTAU_BOOTS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.RED_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.UTAU_HELMET.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_HELMET.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.RED_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.UTAU_CHESTPLATE.get())
                .pattern("ZAZ")
                .pattern("RZR")
                .pattern("ZDZ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_CHESTPLATE.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.RED_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.UTAU_LEGGINGS.get())
                .pattern("RDR")
                .pattern("ZAZ")
                .pattern("Z Z")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_LEGGINGS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.RED_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ESItemRegistry.UTAU_BOOTS.get())
                .pattern("ZDZ")
                .pattern("RAR")
                .pattern("   ")
                .define('Z', HnSItemRegistry.ZENALITE_INGOT.get())
                .define('A', ItemRegistry.NETHERITE_MAGE_BOOTS.get())
                .define('R', net.alshanex.alshanex_familiars.registry.ItemRegistry.SOUND_RUNE.get())
                .define('D', Items.RED_DYE)
                .unlockedBy(getHasName(HnSItemRegistry.ZENALITE_INGOT.get()),
                        has(HnSItemRegistry.ZENALITE_INGOT.get())
                )
                .save(pWriter);


    }



    public static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    public static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  ElementalSynergies.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}