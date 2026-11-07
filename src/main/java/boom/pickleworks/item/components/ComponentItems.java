package boom.pickleworks.item.components;

import boom.pickleworks.Pickleworks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComponentItems {

    public static final Item BASIC_ROBOT_ARM =
            registerItem("basic_robot_arm", new Item(new Item.Settings()));
    public static final Item BASIC_BATTERY =
            registerItem("basic_battery", new Item(new Item.Settings()));
    public static final Item BASIC_MOTOR =
            registerItem("basic_motor", new Item(new Item.Settings()));
    public static final Item COPPER_WIRES =
            registerItem("copper_wires", new Item(new Item.Settings()));
    public static final Item STEEL_CASING =
        registerItem("steel_casing", new Item(new Item.Settings()));
    public static final Item STEEL_PLATE =
        registerItem("steel_plate", new Item(new Item.Settings()));
    public static final Item SILICON =
        registerItem("silicone", new Item(new Item.Settings()));
    public static final Item VILLAGER_BRAIN =
        registerItem("villager_brain", new Item(new Item.Settings()));
public static final Item WIRECUTTERS = registerItem("wirecutters",
    new Item(new Item.Settings().maxCount(1)) {
        @Override
        public ItemStack getRecipeRemainder(ItemStack stack) {
            return stack.copy();
        }
    });

public static final Item HAMMER = registerItem("hammer",
    new Item(new Item.Settings().maxCount(1)) {
        @Override
        public ItemStack getRecipeRemainder(ItemStack stack) {
            return stack.copy();
        }
    });


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