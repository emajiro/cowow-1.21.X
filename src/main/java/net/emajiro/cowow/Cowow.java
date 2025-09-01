package net.emajiro.cowow;

import net.emajiro.cowow.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//comment
public class Cowow implements ModInitializer {
	public static final String MOD_ID = "cowow";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}