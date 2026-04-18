package net.hazen.elemental_synergies.Datagen;

import net.hazen.elemental_synergies.ElementalSynergies;
import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ESTags {
    public static class Items {

        public static final TagKey<Item> EXCELSIUS_HELMET = forgeTag("armor/excelsius_helmet");
        public static final TagKey<Item> EXCELSIUS_CHESTPLATE = forgeTag("armor/excelsius_chestplate");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ElementalSynergies.MOD_ID, name));
        }
    }


    private static TagKey<Item> forgeTag(String name) {
        return ItemTags.create(new ResourceLocation("forge", name));
    }


    public static class Blocks {


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ElementalSynergies.MOD_ID, name));
        }
    }
}