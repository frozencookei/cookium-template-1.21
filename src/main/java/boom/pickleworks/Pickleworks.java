package boom.pickleworks;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import boom.pickleworks.block.ModBlocks;
import boom.pickleworks.item.ModItemGroups;
import boom.pickleworks.item.ModItems;

public class Pickleworks implements ModInitializer {
	public static final String MOD_ID = "pickleworks";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("pickleworks");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}