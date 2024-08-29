package com.mymods.wiremod;

import com.mymods.wiremod.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WireMod.MODID)
public class WireMod {
  public static final String MODID = "wiremod";

  public WireMod() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    ModItems.register(modEventBus);
  }
}