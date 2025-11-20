//? if fabric {
package fliplus.loaders.fabric;

import fliplus.NoRestForTheLiving;
import net.fabricmc.api.ModInitializer;

public class FabricEntrypoint implements ModInitializer {

    @Override
    public void onInitialize() {
        NoRestForTheLiving.initialize();
    }
}
//?}