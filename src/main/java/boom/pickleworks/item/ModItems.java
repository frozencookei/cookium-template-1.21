package boom.pickleworks.item;

import boom.pickleworks.Pickleworks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item COOKIUM = registerItem("cookium", new Item(new Item.Settings()));
    public static final Item RAW_COOKIUM = registerItem("raw_cookium", new Item(new Item.Settings()));
    


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Pickleworks.MOD_ID, name), item);

    }


    public static void registerModItems() {
        Pickleworks.LOGGER.info("Registering Mod Items for " + Pickleworks.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(COOKIUM);
            entries.add(RAW_COOKIUM);
           

        });
    }



}
