package net.viap.vpc.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ClickType;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class ModFoodComponents extends Item {

    public ModFoodComponents(Settings settings) {
        super(settings);
    }
    public static final FoodComponent FESTIS_KAKTUS =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).snack().statusEffect(
                    new StatusEffectInstance(StatusEffects.HEALTH_BOOST), 0.5f
            ).build();

    public ItemStack drinkFood(World world, ItemStack stack, LivingEntity user) {
        if (stack.isFood()) {
            world.playSound(null, user.getX(), user.getY(), user.getZ(), getCustomDrinkSound(), SoundCategory.NEUTRAL, 1.0f, 1.0f + (world.random.nextFloat() - world.random.nextFloat()) * 0.4f);
        }
        return stack;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
            user.sendMessage(Text.literal("Finished eating"));
        return drinkFood(world, stack, user);
    }

    private SoundEvent getCustomDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }


}