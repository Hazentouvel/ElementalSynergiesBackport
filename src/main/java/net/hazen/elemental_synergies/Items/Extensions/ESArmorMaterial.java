package net.hazen.elemental_synergies.Items.Extensions;

import com.gametechbc.gtbcs_geomancy_plus.api.init.GGAttributes;
import com.gametechbc.traveloptics.api.init.TravelopticsAttributes;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSAttributeRegistry;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public enum ESArmorMaterial implements ArmorMaterial {

    /*
    *** Pure Armor
     */

    MUSICIAN("musician",
            38, schoolArmorMap(),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0F,
            0.0F,
            () -> Ingredient.of(new ItemLike[]{(ItemLike) ItemRegistry.MAGIC_CLOTH.get()}),
            Map.of(
                    (Attribute)AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", (double)200.0F, Operation.ADDITION),
                    (Attribute)net.alshanex.alshanex_familiars.registry.AttributeRegistry.SOUND_SPELL_POWER.get(), new AttributeModifier("Sound Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.ELDRITCH_SPELL_POWER.get(), new AttributeModifier("Eldritch Power", 0.05, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Base Power", 0.15, Operation.MULTIPLY_BASE))),

    AQUAMANCER("aquamancer",
            38, schoolArmorMap(),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0F,
            0.0F,
            () -> Ingredient.of(new ItemLike[]{(ItemLike) ItemRegistry.MAGIC_CLOTH.get()}),
            Map.of(
                    (Attribute)AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", (double)200.0F, Operation.ADDITION),
                    (Attribute)TravelopticsAttributes.AQUA_SPELL_POWER.get(), new AttributeModifier("Aqua Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute) CSAttributeRegistry.ABYSSAL_MAGIC_POWER.get(), new AttributeModifier("Abyssal Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.ELDRITCH_SPELL_POWER.get(), new AttributeModifier("Eldritch Power", 0.05, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Base Power", 0.15, Operation.MULTIPLY_BASE))),

    TECHNOMANCER("technomancer",
            38, schoolArmorMap(),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0F,
            0.0F,
            () -> Ingredient.of(new ItemLike[]{(ItemLike) ItemRegistry.MAGIC_CLOTH.get()}),
            Map.of(
                    (Attribute)AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", (double)200.0F, Operation.ADDITION),
                    (Attribute) CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER.get(), new AttributeModifier("Techno Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.ELDRITCH_SPELL_POWER.get(), new AttributeModifier("Eldritch Power", 0.05, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Base Power", 0.15, Operation.MULTIPLY_BASE))),

    TITAN("titan",
            38, schoolArmorMap(),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0F,
            0.0F,
            () -> Ingredient.of(new ItemLike[]{(ItemLike) ItemRegistry.MAGIC_CLOTH.get()}),
            Map.of(
                    (Attribute)AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", (double)200.0F, Operation.ADDITION),
                    (Attribute)AttributeRegistry.FIRE_SPELL_POWER.get(), new AttributeModifier("Fire Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute) GGAttributes.GEO_SPELL_POWER.get(), new AttributeModifier("Geo Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Base Power", 0.15, Operation.MULTIPLY_BASE))),


    CATACLYSM("cataclysm",
            38, schoolArmorMap(),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0F,
            0.0F,
            () -> Ingredient.of(new ItemLike[]{(ItemLike) ItemRegistry.MAGIC_CLOTH.get()}),
            Map.of(
                    (Attribute)AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", (double)200.0F, Operation.ADDITION),
                    (Attribute)AttributeRegistry.FIRE_SPELL_POWER.get(), new AttributeModifier("Fire Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute) CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER.get(), new AttributeModifier("Techno Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Base Power", 0.15, Operation.MULTIPLY_BASE))),


    ABYSSAL_JELLYFISH("abyssal_jellyfish",
            38, schoolArmorMap(),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0F,
            0.0F,
            () -> Ingredient.of(new ItemLike[]{(ItemLike) ItemRegistry.MAGIC_CLOTH.get()}),
            Map.of(
                    (Attribute)AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", (double)200.0F, Operation.ADDITION),
                    (Attribute)TravelopticsAttributes.AQUA_SPELL_POWER.get(), new AttributeModifier("Aqua Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute) CSAttributeRegistry.ABYSSAL_MAGIC_POWER.get(), new AttributeModifier("Abyssal Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute) AttributeRegistry.LIGHTNING_SPELL_POWER.get(), new AttributeModifier("Lightning Power", 0.15, Operation.MULTIPLY_BASE),
                    (Attribute)AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Base Power", 0.15, Operation.MULTIPLY_BASE)));


    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;
    private final Map<Attribute, AttributeModifier> additionalAttributes;
    private static final EnumMap<Type, Integer> HEALTH_FUNCTION_FOR_TYPE = (EnumMap)Util.make(new EnumMap(Type.class), (p_266653_) -> {
        p_266653_.put(Type.BOOTS, 13);
        p_266653_.put(Type.LEGGINGS, 15);
        p_266653_.put(Type.CHESTPLATE, 16);
        p_266653_.put(Type.HELMET, 11);
    });

    private ESArmorMaterial(String pName, int pDurabilityMultiplier, EnumMap<Type, Integer> protectionMap, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient, Map<Attribute, AttributeModifier> additionalAttributes) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.protectionFunctionForType = protectionMap;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue(pRepairIngredient);
        this.additionalAttributes = additionalAttributes;
    }

    public static EnumMap<Type, Integer> makeArmorMap(int helmet, int chestplate, int leggings, int boots) {
        return (EnumMap)Util.make(new EnumMap(Type.class), (p_266655_) -> {
            p_266655_.put(Type.BOOTS, boots);
            p_266655_.put(Type.LEGGINGS, leggings);
            p_266655_.put(Type.CHESTPLATE, chestplate);
            p_266655_.put(Type.HELMET, helmet);
        });
    }

    public static EnumMap<Type, Integer> schoolArmorMap() {
        return makeArmorMap(3, 8, 6, 3);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDurabilityForType(Type p_266745_) {
        return (Integer)HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(Type p_266752_) {
        return (Integer)this.protectionFunctionForType.get(p_266752_);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public Map<Attribute, AttributeModifier> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
