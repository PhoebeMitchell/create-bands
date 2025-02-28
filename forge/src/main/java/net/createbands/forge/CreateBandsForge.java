package net.createbands.forge;

import net.createbands.ExampleBlocks;
import net.createbands.CreateBands;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateBands.MOD_ID)
public class CreateBandsForge {
    public CreateBandsForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        CreateBands.init();
    }
}
