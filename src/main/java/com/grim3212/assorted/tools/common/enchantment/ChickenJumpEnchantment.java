package com.grim3212.assorted.tools.common.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class ChickenJumpEnchantment extends Enchantment {

	protected ChickenJumpEnchantment() {
		super(Rarity.UNCOMMON, EnchantmentType.ARMOR, new EquipmentSlotType[] { EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET });
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 10;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return super.getMaxEnchantability(enchantmentLevel) + 20;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}
}
