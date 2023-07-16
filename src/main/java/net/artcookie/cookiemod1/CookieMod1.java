package net.artcookie.cookiemod1;

import net.artcookie.cookiemod1.block.ModBlocks;
import net.artcookie.cookiemod1.item.ModItemGroups;
import net.artcookie.cookiemod1.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookieMod1 implements ModInitializer {
	public static final String MOD_ID = "cookiemod1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}