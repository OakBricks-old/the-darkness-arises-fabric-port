package org.oakbricks.darkness;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.oakbricks.darkness.init.RegisterEntityStuff;

public class TDAMain implements ModInitializer {

	public static final String MOD_ID = "darkness";
	public static final Logger LOGGER = LogManager.getLogger("The Darkness Arises");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		RegisterEntityStuff.registerEntityStuff();
		LOGGER.info("[The Darkness Arises]: Initalized Mod!");
	}
}
