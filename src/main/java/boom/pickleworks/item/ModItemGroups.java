package boom.pickleworks.item;

import org.apache.logging.log4j.core.config.builder.api.Component;

import boom.pickleworks.Pickleworks;
import boom.pickleworks.block.machines.MachineBlocks;
import boom.pickleworks.item.components.ComponentItems;
import boom.pickleworks.item.misc.MiscItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PICKLEWORKS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Pickleworks.MOD_ID, "pickleworks_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(MachineBlocks.BASIC_PICKLER.asItem()))
                    .icon(() -> new ItemStack(MachineBlocks.ADVANCED_PICKLER.asItem()))
                    .icon(() -> new ItemStack(MachineBlocks.BASIC_COMPRESSOR.asItem()))
                    .icon(() -> new ItemStack(MachineBlocks.ADVANCED_COMPRESSOR.asItem()))
                    .displayName(Text.translatable("itemgroup.pickleworks.pickleworks_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(MachineBlocks.BASIC_PICKLER.asItem());
                        entries.add(ComponentItems.BASIC_ROBOT_ARM);
                        entries.add(ComponentItems.BASIC_BATTERY);
                        entries.add(MiscItems.STEEL);
                        entries.add(MachineBlocks.BASIC_COMPRESSOR.asItem());
                        entries.add(MachineBlocks.ADVANCED_COMPRESSOR.asItem());
                        entries.add(MachineBlocks.ADVANCED_PICKLER.asItem());
                        entries.add(ComponentItems.BASIC_MOTOR);
                        entries.add(ComponentItems.COPPER_WIRES);
                        entries.add(ComponentItems.STEEL_CASING);
                        entries.add(ComponentItems.STEEL_PLATE);
                        entries.add(ComponentItems.WIRECUTTERS);
                        entries.add(ComponentItems.HAMMER);
                        entries.add(ComponentItems.SILICON);
                        entries.add(ComponentItems.VILLAGER_BRAIN);
                    }).build());





    public static void registerItemGroups() {
        Pickleworks.LOGGER.info("Registering Item groups for " + Pickleworks.MOD_ID);

    }

}
