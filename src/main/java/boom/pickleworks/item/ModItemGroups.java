package boom.pickleworks.item;

import boom.pickleworks.Pickleworks;
import boom.pickleworks.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PICKLEWORKS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Pickleworks.MOD_ID, "pickleworks_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.COOKIUM))
                    .displayName(Text.translatable("itemgroup.pickleworks.pickleworks_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.COOKIUM);
                        entries.add(ModBlocks.COOKIUM_ORE.asItem());
                        entries.add(ModBlocks.COOKIUM_BLOCK.asItem());
                    }).build());





    public static void registerItemGroups() {
        Pickleworks.LOGGER.info("Registering Item groups for " + Pickleworks.MOD_ID);

    }

}
