package com.grim3212.assorted.tools.common.data;

import java.util.function.Consumer;

import com.grim3212.assorted.tools.common.item.ToolsItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.Tags;

public class ToolsRecipes extends RecipeProvider {

	public ToolsRecipes(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		hammerPattern(ToolsItems.NETHERITE_HAMMER.get(), Tags.Items.INGOTS_NETHERITE).build(consumer);
		hammerPattern(ToolsItems.DIAMOND_HAMMER.get(), Tags.Items.GEMS_DIAMOND).build(consumer);
		hammerPattern(ToolsItems.IRON_HAMMER.get(), Tags.Items.INGOTS_IRON).build(consumer);
		hammerPattern(ToolsItems.GOLD_HAMMER.get(), Tags.Items.INGOTS_GOLD).build(consumer);
		hammerPattern(ToolsItems.STONE_HAMMER.get(), Tags.Items.COBBLESTONE).build(consumer);
		hammerPattern(ToolsItems.WOOD_HAMMER.get(), ItemTags.PLANKS).build(consumer);

		ShapedRecipeBuilder.shapedRecipe(ToolsItems.WOOD_BOOMERANG.get()).key('X', ItemTags.PLANKS).patternLine("XX").patternLine("X ").patternLine("XX").addCriterion("has_planks", hasItem(ItemTags.PLANKS)).build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ToolsItems.DIAMOND_BOOMERANG.get()).key('X', Tags.Items.GEMS_DIAMOND).key('Y', ToolsItems.WOOD_BOOMERANG.get()).patternLine("XX").patternLine("XY").patternLine("XX").addCriterion("has_diamonds", hasItem(Tags.Items.GEMS_DIAMOND)).build(consumer);

		ShapedRecipeBuilder.shapedRecipe(ToolsItems.BUILDING_WAND.get()).key('X', ItemTags.PLANKS).key('G', Tags.Items.INGOTS_GOLD).patternLine("XGX").patternLine("XGX").patternLine("XGX").addCriterion("has_gold", hasItem(Tags.Items.INGOTS_GOLD)).build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ToolsItems.BREAKING_WAND.get()).key('X', ItemTags.PLANKS).key('G', Tags.Items.INGOTS_IRON).patternLine("XGX").patternLine("XGX").patternLine("XGX").addCriterion("has_iron", hasItem(Tags.Items.INGOTS_IRON)).build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ToolsItems.MINING_WAND.get()).key('X', ItemTags.PLANKS).key('G', Tags.Items.GEMS_DIAMOND).patternLine("XGX").patternLine("XGX").patternLine("XGX").addCriterion("has_diamond", hasItem(Tags.Items.GEMS_DIAMOND)).build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ToolsItems.REINFORCED_BUILDING_WAND.get()).key('X', Tags.Items.OBSIDIAN).key('G', Tags.Items.STORAGE_BLOCKS_GOLD).patternLine("XGX").patternLine("XGX").patternLine("XGX").addCriterion("has_obsidian", hasItem(Tags.Items.OBSIDIAN)).build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ToolsItems.REINFORCED_BREAKING_WAND.get()).key('X', Tags.Items.OBSIDIAN).key('G', Tags.Items.STORAGE_BLOCKS_IRON).patternLine("XGX").patternLine("XGX").patternLine("XGX").addCriterion("has_obsidian", hasItem(Tags.Items.OBSIDIAN)).build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ToolsItems.REINFORCED_MINING_WAND.get()).key('X', Tags.Items.OBSIDIAN).key('G', Tags.Items.STORAGE_BLOCKS_DIAMOND).patternLine("XGX").patternLine("XGX").patternLine("XGX").addCriterion("has_obsidian", hasItem(Tags.Items.OBSIDIAN)).build(consumer);
	}

	@Override
	public String getName() {
		return "Assorted Tools recipes";
	}

	private ShapedRecipeBuilder hammerPattern(IItemProvider output, ITag<Item> input) {
		return ShapedRecipeBuilder.shapedRecipe(output).key('S', Tags.Items.RODS_WOODEN).key('I', input).patternLine("III").patternLine("III").patternLine(" S ").addCriterion("has_item", hasItem(input));
	}
}