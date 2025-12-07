//? if fabric {
package fliplus.norestfortheliving.loaders.fabric;

import fliplus.norestfortheliving.NoRestForTheLiving;
import net.fabricmc.api.ModInitializer;

public class FabricEntrypoint implements ModInitializer {

    @Override
    public void onInitialize() {
        NoRestForTheLiving.initialize();
    }
}
//?}