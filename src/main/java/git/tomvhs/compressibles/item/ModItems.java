package git.tomvhs.compressibles.item;

import git.tomvhs.compressibles.CompressiblesMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CompressiblesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CompressiblesMod.LOGGER.info("Registering items...");
    }
}
