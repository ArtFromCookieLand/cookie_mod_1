package net.artcookie.cookiemod1.item;

import net.artcookie.cookiemod1.CookieMod1;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup COOKIE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CookieMod1.MOD_ID, "golden_cookie"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cookie"))
                    .icon(() -> new ItemStack(ModItems.DIAMOND_COOKIE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.GOLDEN_COOKIE);
                        entries.add(ModItems.DIAMOND_COOKIE);


                    }).build());

    public static void registerItemGroups() {
        CookieMod1.LOGGER.info("Registering Item Groups for " + CookieMod1.MOD_ID);
    }

}
