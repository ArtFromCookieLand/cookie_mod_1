package net.artcookie.cookiemod1.block;

import net.artcookie.cookiemod1.CookieMod1;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DOUGH_BLOCK = registerBlock("dough_block",
            // copyOf can be replaced with create, after that we'll have to set every setting manually. CopyOf copies setting og existing blocks.
            // If we want to change just one thing of copied block, we type . after brackets and choose what we want to change
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));



    // registers block
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CookieMod1.MOD_ID, name), block);
    }

    // registers block as an item that can be held in hands etc.
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CookieMod1.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CookieMod1.LOGGER.info("Registering ModBlocks for " + CookieMod1.MOD_ID);
    }

}
