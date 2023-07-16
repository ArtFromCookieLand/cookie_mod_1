package net.artcookie.cookiemod1.item;

import net.artcookie.cookiemod1.CookieMod1;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GOLDEN_COOKIE = registerItem("golden_cookie", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_COOKIE = registerItem("diamond_cookie", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemsGroup (FabricItemGroupEntries entries){
        entries.add(GOLDEN_COOKIE);
    }

    private static void addItemsToFoodAndDrinksItemsGroup (FabricItemGroupEntries entries) {
        entries.add(DIAMOND_COOKIE);
    }

    private static Item registerItem(String name, Item item){
     return Registry.register(Registries.ITEM, new Identifier(CookieMod1.MOD_ID, name), item);

    }

    public static void registerModItems() {
        CookieMod1.LOGGER.info("Registering Mod Items for " + CookieMod1.MOD_ID);

        // sets the tab of creative inventory where the item will be located, in this case INGREDIENTS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemsGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinksItemsGroup);

    }
}
