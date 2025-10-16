package net.hazen.elemental_synergies.Registries;

import net.hazen.elemental_synergies.ElementalSynergies;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.AbyssalJellyfish.AbyssalJellyfishArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Cataclysm.CataclysmArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.FreddyFazbear.FreddyFazbearArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Miku.ProjectSekai.ProjectSekaiArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Miku.RottenGirl.RottenGirlArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Neru.NeruArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Teto.SynthesizerV.SynthesizerVArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Teto.Utau.UtauArmorItem;
import net.hazen.elemental_synergies.Items.Equipment.ArmorSets.Titan.TitanArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;

public class ESItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementalSynergies.MOD_ID);


    /*
     *** Materials
     */


    public static final RegistryObject<Item> CLUSTER = ITEMS.register("cluster",
            () -> new Item(new Item
                    .Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> DYNATITE_CLUSTER = ITEMS.register("dynatite_cluster",
            () -> new Item(new Item
                    .Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> DYNATITE_INGOT = ITEMS.register("dynatite_ingot",
            () -> new Item(new Item
                    .Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet",
            () -> new Item(new Item
                    .Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));


    /*
     *** Armor
     */

    // Abyssal Jellyfish
    public static final RegistryObject<Item> ABYSSAL_JELLYFISH_HELMET = ITEMS.register("abyssal_jellyfish_helmet", () -> new AbyssalJellyfishArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> ABYSSAL_JELLYFISH_CHESTPLATE = ITEMS.register("abyssal_jellyfish_chestplate", () -> new AbyssalJellyfishArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> ABYSSAL_JELLYFISH_LEGGINGS = ITEMS.register("abyssal_jellyfish_leggings", () -> new AbyssalJellyfishArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> ABYSSAL_JELLYFISH_BOOTS = ITEMS.register("abyssal_jellyfish_boots", () -> new AbyssalJellyfishArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    // Titan
    public static final RegistryObject<Item> FREDDY_FAZBEAR_HELMET = ITEMS.register("freddy_fazbear_helmet", () -> new FreddyFazbearArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> FREDDY_FAZBEAR_CHESTPLATE = ITEMS.register("freddy_fazbear_chestplate", () -> new FreddyFazbearArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> FREDDY_FAZBEAR_LEGGINGS = ITEMS.register("freddy_fazbear_leggings", () -> new FreddyFazbearArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> FREDDY_FAZBEAR_BOOTS = ITEMS.register("freddy_fazbear_boots", () -> new FreddyFazbearArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    // Cataclysm
    public static final RegistryObject<Item> CATACLYSM_HELMET = ITEMS.register("cataclysm_helmet", () -> new CataclysmArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> CATACLYSM_CHESTPLATE = ITEMS.register("cataclysm_chestplate", () -> new CataclysmArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> CATACLYSM_LEGGINGS = ITEMS.register("cataclysm_leggings", () -> new CataclysmArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> CATACLYSM_BOOTS = ITEMS.register("cataclysm_boots", () -> new CataclysmArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    // Neru
    public static final RegistryObject<Item> NERU_HELMET = ITEMS.register("neru_helmet", () -> new NeruArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> NERU_CHESTPLATE = ITEMS.register("neru_chestplate", () -> new NeruArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> NERU_LEGGINGS = ITEMS.register("neru_leggings", () -> new NeruArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> NERU_BOOTS = ITEMS.register("neru_boots", () -> new NeruArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    // Neru
    public static final RegistryObject<Item> PROJECT_SEKAI_HELMET = ITEMS.register("project_sekai_helmet", () -> new ProjectSekaiArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> PROJECT_SEKAI_CHESTPLATE = ITEMS.register("project_sekai_chestplate", () -> new ProjectSekaiArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> PROJECT_SEKAI_LEGGINGS = ITEMS.register("project_sekai_leggings", () -> new ProjectSekaiArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> PROJECT_SEKAI_BOOTS = ITEMS.register("project_sekai_boots", () -> new ProjectSekaiArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    // Rotten Girl
    public static final RegistryObject<Item> ROTTEN_GIRL_HELMET = ITEMS.register("rotten_girl_helmet", () -> new RottenGirlArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> ROTTEN_GIRL_CHESTPLATE = ITEMS.register("rotten_girl_chestplate", () -> new RottenGirlArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> ROTTEN_GIRL_LEGGINGS = ITEMS.register("rotten_girl_leggings", () -> new RottenGirlArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> ROTTEN_GIRL_BOOTS = ITEMS.register("rotten_girl_boots", () -> new RottenGirlArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    // Synthesizer V
    public static final RegistryObject<Item> SYNTHESIZER_V_HELMET = ITEMS.register("synthesizer_v_helmet", () -> new SynthesizerVArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> SYNTHESIZER_V_CHESTPLATE = ITEMS.register("synthesizer_v_chestplate", () -> new SynthesizerVArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> SYNTHESIZER_V_LEGGINGS = ITEMS.register("synthesizer_v_leggings", () -> new SynthesizerVArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> SYNTHESIZER_V_BOOTS = ITEMS.register("synthesizer_v_boots", () -> new SynthesizerVArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    // Utau
    public static final RegistryObject<Item> UTAU_HELMET = ITEMS.register("utau_helmet", () -> new UtauArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> UTAU_CHESTPLATE = ITEMS.register("utau_chestplate", () -> new UtauArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> UTAU_LEGGINGS = ITEMS.register("utau_leggings", () -> new UtauArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> UTAU_BOOTS = ITEMS.register("utau_boots", () -> new UtauArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));

    // Titan
    public static final RegistryObject<Item> TITAN_HELMET = ITEMS.register("titan_helmet", () -> new TitanArmorItem
            (ArmorItem.Type.HELMET,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> TITAN_CHESTPLATE = ITEMS.register("titan_chestplate", () -> new TitanArmorItem
            (ArmorItem.Type.CHESTPLATE,
                    ItemPropertiesHelper
                            .equipment()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
            ));
    public static final RegistryObject<Item> TITAN_LEGGINGS = ITEMS.register("titan_leggings", () -> new TitanArmorItem
            (ArmorItem.Type.LEGGINGS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));
    public static final RegistryObject<Item> TITAN_BOOTS = ITEMS.register("titan_boots", () -> new TitanArmorItem
            (ArmorItem.Type.BOOTS, ItemPropertiesHelper
                    .equipment()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
