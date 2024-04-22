package net.luhcarti.transparentarmor.item;

import net.luhcarti.transparentarmor.TransparentArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TransparentArmor.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TRANSPARENT_TAB = CREATIVE_MODE_TABS.register("transparent_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.BLACK_DYE))
                    .title(Component.translatable("creativetab.end_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TRANSPARENT_DIAMOND_HELMET.get());
                        pOutput.accept(ModItems.TRANSPARENT_DIAMOND_CHESTPLATE.get());
                        pOutput.accept(ModItems.TRANSPARENT_DIAMOND_LEGGINGS.get());
                        pOutput.accept(ModItems.TRANSPARENT_DIAMOND_BOOTS.get());

                        pOutput.accept(ModItems.TRANSPARENT_GOLDEN_HELMET.get());
                        pOutput.accept(ModItems.TRANSPARENT_GOLDEN_CHESTPLATE.get());
                        pOutput.accept(ModItems.TRANSPARENT_GOLDEN_LEGGINGS.get());
                        pOutput.accept(ModItems.TRANSPARENT_GOLDEN_BOOTS.get());

                        pOutput.accept(ModItems.TRANSPARENT_IRON_HELMET.get());
                        pOutput.accept(ModItems.TRANSPARENT_IRON_CHESTPLATE.get());
                        pOutput.accept(ModItems.TRANSPARENT_IRON_LEGGINGS.get());
                        pOutput.accept(ModItems.TRANSPARENT_IRON_BOOTS.get());

                        pOutput.accept(ModItems.TRANSPARENT_LEATHER_CAP.get());
                        pOutput.accept(ModItems.TRANSPARENT_LEATHER_TUNIC.get());
                        pOutput.accept(ModItems.TRANSPARENT_LEATHER_PANTS.get());
                        pOutput.accept(ModItems.TRANSPARENT_LEATHER_BOOTS.get());

                        pOutput.accept(ModItems.TRANSPARENT_CHAINMAIL_HELMET.get());
                        pOutput.accept(ModItems.TRANSPARENT_CHAINMAIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.TRANSPARENT_CHAINMAIL_LEGGINGS.get());
                        pOutput.accept(ModItems.TRANSPARENT_CHAINMAIL_BOOTS.get());

                        pOutput.accept(ModItems.TRANSPARENT_NETHERITE_HELMET.get());
                        pOutput.accept(ModItems.TRANSPARENT_NETHERITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.TRANSPARENT_NETHERITE_LEGGINGS.get());
                        pOutput.accept(ModItems.TRANSPARENT_NETHERITE_BOOTS.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
