package net.emajiro.cowow.item;

import net.emajiro.cowow.Cowow;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GREEGLE_SAP = registerItem("greegle_sap", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Cowow.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Cowow.LOGGER.info("Registering Mod Items for " + Cowow.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GREEGLE_SAP);
        });
    }
}
