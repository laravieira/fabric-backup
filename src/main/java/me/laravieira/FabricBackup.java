package me.laravieira;

import me.laravieira.block.ModBlocks;
import me.laravieira.item.ModItemGroups;
import me.laravieira.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricBackup implements ModInitializer {
	public static final String MODID = "fabric-backup";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModItemGroups.registerItemGroups();
	}
}