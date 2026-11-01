package boom.pickleworks.block.machines;

import boom.pickleworks.Pickleworks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class MachineBlocks {

    public static final Block BASIC_PICKLER = registerBlock("basic_pickler", new Block(AbstractBlock.Settings.create().strength(3f).sounds(BlockSoundGroup.METAL)));
    public static final Block BASIC_COMPRESSOR = registerBlock("basic_compressor", new Block(AbstractBlock.Settings.create().strength(3f).sounds(BlockSoundGroup.METAL)));
    public static final Block ADVANCED_COMPRESSOR = registerBlock("advanced_compressor", new Block(AbstractBlock.Settings.create().strength(3f).sounds(BlockSoundGroup.METAL)));
    public static final Block ADVANCED_PICKLER = registerBlock("advanced_pickler", new Block(AbstractBlock.Settings.create().strength(3f).sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Pickleworks.MOD_ID, name), block);

    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Pickleworks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void initialize() {
        Pickleworks.LOGGER.info("Registering Machine Blocks for " + Pickleworks.MOD_ID);

    }

}