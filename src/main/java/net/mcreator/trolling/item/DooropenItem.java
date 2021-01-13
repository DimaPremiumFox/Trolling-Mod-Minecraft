
package net.mcreator.trolling.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.trolling.itemgroup.TrollingItemGroup;
import net.mcreator.trolling.TrollingModElements;

@TrollingModElements.ModElement.Tag
public class DooropenItem extends TrollingModElements.ModElement {
	@ObjectHolder("trolling:dooropen")
	public static final Item block = null;
	public DooropenItem(TrollingModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, TrollingModElements.sounds.get(new ResourceLocation("trolling:dooropen")),
					new Item.Properties().group(TrollingItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dooropen");
		}
	}
}
