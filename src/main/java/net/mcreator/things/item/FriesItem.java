
package net.mcreator.things.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.things.ThingsElements;

@ThingsElements.ModElement.Tag
public class FriesItem extends ThingsElements.ModElement {
	@ObjectHolder("things:fries")
	public static final Item block = null;
	public FriesItem(ThingsElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64)
					.food((new Food.Builder()).hunger(10).saturation(0.3f).setAlwaysEdible().meat().build()));
			setRegistryName("fries");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 12;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}