package boom.pickleworks.item.misc;

import boom.pickleworks.Pickleworks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MiscItems {

    public static final Item STEEL =
            registerItem("steel", new Item(new Item.Settings()));
    
    private static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(Pickleworks.MOD_ID, name),
                item
        );
    }

    public static void initialize() {
        Pickleworks.LOGGER.info("Registering misc items for " + Pickleworks.MOD_ID);
    }
}