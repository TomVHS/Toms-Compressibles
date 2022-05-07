package git.tomvhs.compressibles.block;

import git.tomvhs.compressibles.CompressiblesMod;
import git.tomvhs.compressibles.block.custom.Cobblestone_Single;
import git.tomvhs.compressibles.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    /// COBBLESTONE
    public static final Block COBBLESTONE_SINGLE = registerBlock("single_compressed_cobblestone",
            new Cobblestone_Single(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroups.COMPRESSIBLES);

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(CompressiblesMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CompressiblesMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CompressiblesMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        CompressiblesMod.LOGGER.info("Registering blocks...");
    }
}
