package git.tomvhs.compressibles;

import git.tomvhs.compressibles.block.ModBlocks;
import git.tomvhs.compressibles.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompressiblesMod implements ModInitializer {
	public static final String MOD_ID = "toms_compressibles";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
