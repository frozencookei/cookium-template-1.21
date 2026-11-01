package boom.pickleworks.item.components;

import boom.pickleworks.Pickleworks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComponentItems {

    public static final Item NETHERITE_ROBOT_ARM =
            registerItem("netherite_robot_arm", new Item(new Item.Settings()));
    public static final Item BASIC_BATTERY =
            registerItem("basic_battery", new Item(new Item.Settings()));
    public static final Item BASIC_MOTOR =
            registerItem("basic_motor", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(Pickleworks.MOD_ID, name),
                item
        );
    }

    public static void initialize() {
        Pickleworks.LOGGER.info("Registering component items for " + Pickleworks.MOD_ID);
    }
}