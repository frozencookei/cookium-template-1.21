package boom.pickleworks.item;

import boom.pickleworks.item.components.ComponentItems;
import boom.pickleworks.item.misc.MiscItems;


public class ModItems {

    public static void registerModItems() {
        ComponentItems.initialize();
        MiscItems.initialize();
    }
}