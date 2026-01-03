package net.ishadom.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ishadom.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item POISONED_APPLE = registerItem("poisoned_apple", new Item(new Item.Settings().food(ModFoodComponents.POISONED_APPLE)));
    public static final Item CHOCOLATE = registerItem("chocolate", new Item(new Item.Settings().food(ModFoodComponents.CHOCOLATE)));
    public static final Item DARK_CHOCOLATE = registerItem("dark_chocolate", new Item(new Item.Settings().food(ModFoodComponents.DARK_CHOCOLATE)));
    public static final Item WHITE_CHOCOLATE = registerItem("white_chocolate", new Item(new Item.Settings().food(ModFoodComponents.WHITE_CHOCOLATE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registring Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(POISONED_APPLE);
            entries.add(CHOCOLATE);
            entries.add(DARK_CHOCOLATE);
            entries.add(WHITE_CHOCOLATE);
        });
    }

}
