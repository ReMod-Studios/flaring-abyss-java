package com.remodstudios.flabyss

import net.minecraft.util.Identifier

object Flabyss {
    const val MOD_ID = "flabyss"

    fun init() {
        printHelloWorld()
    }

    fun id(path: String): Identifier {
        return Identifier(MOD_ID, path)
    }
}