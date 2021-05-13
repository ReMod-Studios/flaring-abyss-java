package com.remodstudios.flabyss.forge

import com.remodstudios.flabyss.Flabyss
import com.remodstudios.flabyss.client.FlabyssClient
import me.shedaniel.architectury.platform.forge.EventBuses
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(Flabyss.MOD_ID)
object FlabyssForge {
    init {
        EventBuses.registerModEventBus(Flabyss.MOD_ID, MOD_BUS);
        MOD_BUS.addListener(::onClientSetup)

        Flabyss.init();
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        FlabyssClient.init()
    }
}