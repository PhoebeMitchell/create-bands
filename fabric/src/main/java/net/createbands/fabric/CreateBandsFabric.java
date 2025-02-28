package net.createbands.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.createbands.ExampleBlocks;
import net.createbands.CreateBands;
import net.fabricmc.api.ModInitializer;

public class CreateBandsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateBands.init();
        CreateBands.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreateBands.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ExampleBlocks.REGISTRATE.register();
    }
}
