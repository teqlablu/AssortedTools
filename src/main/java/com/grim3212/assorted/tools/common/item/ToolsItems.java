package com.grim3212.assorted.tools.common.item;

import java.util.function.Supplier;

import com.grim3212.assorted.tools.AssortedTools;
import com.grim3212.assorted.tools.common.handler.ToolsConfig;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolsItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AssortedTools.MODID);

	public static final RegistryObject<HammerItem> NETHERITE_HAMMER = register("netherite_hammer", () -> new HammerItem(ToolsConfig.COMMON.netheriteItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<HammerItem> DIAMOND_HAMMER = register("diamond_hammer", () -> new HammerItem(ToolsConfig.COMMON.diamondItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<HammerItem> GOLD_HAMMER = register("gold_hammer", () -> new HammerItem(ToolsConfig.COMMON.goldItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<HammerItem> IRON_HAMMER = register("iron_hammer", () -> new HammerItem(ToolsConfig.COMMON.ironItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<HammerItem> STONE_HAMMER = register("stone_hammer", () -> new HammerItem(ToolsConfig.COMMON.stoneItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<HammerItem> WOOD_HAMMER = register("wood_hammer", () -> new HammerItem(ToolsConfig.COMMON.woodItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));

	public static final RegistryObject<BoomerangItem> WOOD_BOOMERANG = register("wood_boomerang", () -> new BoomerangItem(true, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP).maxStackSize(1)));
	public static final RegistryObject<BoomerangItem> DIAMOND_BOOMERANG = register("diamond_boomerang", () -> new BoomerangItem(false, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP).maxStackSize(1)));

	public static final RegistryObject<WandBuildingItem> BUILDING_WAND = register("building_wand", () -> new WandBuildingItem(false, new Item.Properties().maxDamage(30)));
	public static final RegistryObject<WandBuildingItem> REINFORCED_BUILDING_WAND = register("reinforced_building_wand", () -> new WandBuildingItem(true, new Item.Properties().maxDamage(200)));
	public static final RegistryObject<WandBreakingItem> BREAKING_WAND = register("breaking_wand", () -> new WandBreakingItem(false, new Item.Properties().maxDamage(15)));
	public static final RegistryObject<WandBreakingItem> REINFORCED_BREAKING_WAND = register("reinforced_breaking_wand", () -> new WandBreakingItem(true, new Item.Properties().maxDamage(120)));
	public static final RegistryObject<WandMiningItem> MINING_WAND = register("mining_wand", () -> new WandMiningItem(false, new Item.Properties().maxDamage(15)));
	public static final RegistryObject<WandMiningItem> REINFORCED_MINING_WAND = register("reinforced_mining_wand", () -> new WandMiningItem(true, new Item.Properties().maxDamage(120)));

	public static final RegistryObject<ChickenSuitArmor> CHICKEN_SUIT_HELMET = register("chicken_suit_helmet", () -> new ChickenSuitArmor(EquipmentSlotType.HEAD, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<ChickenSuitArmor> CHICKEN_SUIT_CHESTPLATE = register("chicken_suit_chestplate", () -> new ChickenSuitArmor(EquipmentSlotType.CHEST, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<ChickenSuitArmor> CHICKEN_SUIT_LEGGINGS = register("chicken_suit_leggings", () -> new ChickenSuitArmor(EquipmentSlotType.LEGS, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<ChickenSuitArmor> CHICKEN_SUIT_BOOTS = register("chicken_suit_boots", () -> new ChickenSuitArmor(EquipmentSlotType.FEET, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));

	public static final RegistryObject<PokeballItem> POKEBALL = register("pokeball", () -> new PokeballItem(new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));

	public static final RegistryObject<MultiToolItem> WOODEN_MULTITOOL = register("wooden_multitool", () -> new MultiToolItem(ToolsConfig.COMMON.woodItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<MultiToolItem> STONE_MULTITOOL = register("stone_multitool", () -> new MultiToolItem(ToolsConfig.COMMON.stoneItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<MultiToolItem> GOLDEN_MULTITOOL = register("golden_multitool", () -> new MultiToolItem(ToolsConfig.COMMON.goldItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<MultiToolItem> IRON_MULTITOOL = register("iron_multitool", () -> new MultiToolItem(ToolsConfig.COMMON.ironItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<MultiToolItem> DIAMOND_MULTITOOL = register("diamond_multitool", () -> new MultiToolItem(ToolsConfig.COMMON.diamondItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));
	public static final RegistryObject<MultiToolItem> NETHERITE_MULTITOOL = register("netherite_multitool", () -> new MultiToolItem(ToolsConfig.COMMON.netheriteItemTier, new Item.Properties().group(AssortedTools.ASSORTED_TOOLS_ITEM_GROUP)));

	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> sup) {
		return ITEMS.register(name, sup);
	}
}
