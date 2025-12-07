package fliplus.norestfortheliving.mixins;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.PhantomSpawner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PhantomSpawner.class)
public class PhantomSpawnerMixin {

    @Redirect(
        method = "tick",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/util/RandomSource;nextInt(I)I",
            ordinal = 1
        )
    )
    private int nextInt(RandomSource instance, int i, @Local ServerPlayer serverPlayer) {
        if (serverPlayer.isSleeping()) return 72000;
        return 0;
    }
}
