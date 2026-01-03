package net.ishadom.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent POISONED_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200), 0.93f).build();
    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder()
            .nutrition(3)
            .snack()
            .saturationModifier(0.1F)
            .alwaysEdible().build();
    public static final FoodComponent DARK_CHOCOLATE = new FoodComponent.Builder()
            .nutrition(3)
            .snack()
            .saturationModifier(0.1F)
            .alwaysEdible().build();
    public static final FoodComponent WHITE_CHOCOLATE = new FoodComponent.Builder()
            .nutrition(3)
            .snack()
            .saturationModifier(0.1F)
            .alwaysEdible().build();


}
