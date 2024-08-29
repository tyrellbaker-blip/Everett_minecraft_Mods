package com.mymods.wiremod.init;


import com.mymods.wiremod.WireMod;
import com.mymods.wiremod.items.WireItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.eventbus.api.IEventBus;

@EventBusSubscriber(modid = WireMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WireMod.MODID);

  public static final RegistryObject<Item> WIRE = ITEMS.register("wire",
      () -> new WireItem(new Item.Properties().tab(CreativeModeTabs.TAB_MATERIALS)));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}