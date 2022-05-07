package git.tomvhs.compressibles.item;

import git.tomvhs.compressibles.CompressiblesMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COMPRESSIBLES = FabricItemGroupBuilder.build(new Identifier(CompressiblesMod.MOD_ID, "compressibles"),
            () -> new ItemStack(Items.COBBLESTONE));
}
