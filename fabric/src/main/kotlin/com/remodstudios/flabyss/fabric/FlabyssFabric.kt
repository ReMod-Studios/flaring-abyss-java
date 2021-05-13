package com.remodstudios.flabyss.fabric

import com.remodstudios.flabyss.flabyss
import com.remodstudios.flabyss.client.flabyssClient
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.api.ModInitializer

@Suppress("unused")
object FlabyssFabric: ModInitializer {
    override fun onInitialize() {
        Flabyss.init()
    }
}

@Suppress("unused")
@Environment(EnvType.CLIENT)
object flabyssFabricClient: ClientModInitializer {
    override fun onInitializeClient() {
        FlabyssClient.init()
    }
}