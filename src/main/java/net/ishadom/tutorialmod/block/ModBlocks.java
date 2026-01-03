package net.ishadom.tutorialmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ishadom.tutorialmod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CHOCOLATE_BLOCK = registerBlock("chocolate_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.4f)
                    .sounds(BlockSoundGroup.MUD_BRICKS)
                    .mapColor(MapColor.BROWN)));

    public static final Block DARK_CHOCOLATE_BLOCK = registerBlock("dark_chocolate_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.4f)
                    .sounds(BlockSoundGroup.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));

    public static final Block WHITE_CHOCOLATE_BLOCK = registerBlock("white_chocolate_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.4f)
                    .sounds(BlockSoundGroup.MUD_BRICKS)
                    .mapColor(MapColor.OFF_WHITE)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return  Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name),block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registring Mod Blocks for"  + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CHOCOLATE_BLOCK);
            entries.add(ModBlocks.DARK_CHOCOLATE_BLOCK);
            entries.add(ModBlocks.WHITE_CHOCOLATE_BLOCK);
        });
    }
}
