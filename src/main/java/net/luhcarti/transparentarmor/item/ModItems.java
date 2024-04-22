package net.luhcarti.transparentarmor.item;

import net.luhcarti.transparentarmor.TransparentArmor;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TransparentArmor.MOD_ID);

    public static final RegistryObject<Item> TRANSPARENT_DIAMOND_HELMET = ITEMS.register("transparent_diamond_helmet",
            () -> new ArmorItem(DiamondTransparent.TRANSPARENT_DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_DIAMOND_CHESTPLATE = ITEMS.register("transparent_diamond_chestplate",
            () -> new ArmorItem(DiamondTransparent.TRANSPARENT_DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_DIAMOND_LEGGINGS = ITEMS.register("transparent_diamond_leggings",
            () -> new ArmorItem(DiamondTransparent.TRANSPARENT_DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_DIAMOND_BOOTS = ITEMS.register("transparent_diamond_boots",
            () -> new ArmorItem(DiamondTransparent.TRANSPARENT_DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));

    public static final RegistryObject<Item> TRANSPARENT_GOLDEN_HELMET = ITEMS.register("transparent_golden_helmet",
            () -> new ArmorItem(GoldTransparent.TRANSPARENT_GOLDEN, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_GOLDEN_CHESTPLATE = ITEMS.register("transparent_golden_chestplate",
            () -> new ArmorItem(GoldTransparent.TRANSPARENT_GOLDEN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_GOLDEN_LEGGINGS = ITEMS.register("transparent_golden_leggings",
            () -> new ArmorItem(GoldTransparent.TRANSPARENT_GOLDEN, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_GOLDEN_BOOTS = ITEMS.register("transparent_golden_boots",
            () -> new ArmorItem(GoldTransparent.TRANSPARENT_GOLDEN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));

    public static final RegistryObject<Item> TRANSPARENT_IRON_HELMET = ITEMS.register("transparent_iron_helmet",
            () -> new ArmorItem(IronTransparent.TRANSPARENT_IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_IRON_CHESTPLATE = ITEMS.register("transparent_iron_chestplate",
            () -> new ArmorItem(IronTransparent.TRANSPARENT_IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_IRON_LEGGINGS = ITEMS.register("transparent_iron_leggings",
            () -> new ArmorItem(IronTransparent.TRANSPARENT_IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_IRON_BOOTS = ITEMS.register("transparent_iron_boots",
            () -> new ArmorItem(IronTransparent.TRANSPARENT_IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));

    public static final RegistryObject<Item> TRANSPARENT_LEATHER_CAP = ITEMS.register("transparent_leather_cap",
            () -> new ArmorItem(LeatherTransparent.TRANSPARENT_LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_LEATHER_TUNIC = ITEMS.register("transparent_leather_tunic",
            () -> new ArmorItem(LeatherTransparent.TRANSPARENT_LEATHER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_LEATHER_PANTS = ITEMS.register("transparent_leather_pants",
            () -> new ArmorItem(LeatherTransparent.TRANSPARENT_LEATHER, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_LEATHER_BOOTS = ITEMS.register("transparent_leather_boots",
            () -> new ArmorItem(LeatherTransparent.TRANSPARENT_LEATHER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));

    public static final RegistryObject<Item> TRANSPARENT_CHAINMAIL_HELMET = ITEMS.register("transparent_chainmail_helmet",
            () -> new ArmorItem(ChainmailTransparent.TRANSPARENT_CHAINMAIL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_CHAINMAIL_CHESTPLATE = ITEMS.register("transparent_chainmail_chestplate",
            () -> new ArmorItem(ChainmailTransparent.TRANSPARENT_CHAINMAIL, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_CHAINMAIL_LEGGINGS = ITEMS.register("transparent_chainmail_leggings",
            () -> new ArmorItem(ChainmailTransparent.TRANSPARENT_CHAINMAIL, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_CHAINMAIL_BOOTS = ITEMS.register("transparent_chainmail_boots",
            () -> new ArmorItem(ChainmailTransparent.TRANSPARENT_CHAINMAIL, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));

    public static final RegistryObject<Item> TRANSPARENT_NETHERITE_HELMET = ITEMS.register("transparent_netherite_helmet",
            () -> new ArmorItem(NetheriteTransparent.TRANSPARENT_NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_NETHERITE_CHESTPLATE = ITEMS.register("transparent_netherite_chestplate",
            () -> new ArmorItem(NetheriteTransparent.TRANSPARENT_NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_NETHERITE_LEGGINGS = ITEMS.register("transparent_netherite_leggings",
            () -> new ArmorItem(NetheriteTransparent.TRANSPARENT_NETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));
    public static final RegistryObject<Item> TRANSPARENT_NETHERITE_BOOTS = ITEMS.register("transparent_netherite_boots",
            () -> new ArmorItem(NetheriteTransparent.TRANSPARENT_NETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TRANSPARENT_TAB)));


    public static final RegistryObject<Item> TRANSPARENT_DISH = ITEMS.register("transparent_dish",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
