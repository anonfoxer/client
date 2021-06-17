package me.zeroeightsix.kami.module.modules.misc

import me.zeroeightsix.kami.module.Module

@Module.Info(
        name = "AntiWeather",
        description = "Prevents rain or snow",
        category = Module.Category.MISC
)
object AntiWeather : Module() {
    override fun onUpdate() {
        if (mc.world.isRaining) mc.world.setRainStrength(0f)
        if (mc.world.isThundering) mc.world.setThunderStrength(0f)
    }
}
