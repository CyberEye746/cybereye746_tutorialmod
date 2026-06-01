package net.cybereye746.tutorialmod;

import net.cybereye746.tutorialmod.item.ModItems;
import net.cybereye746.tutorialmod.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		
	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
