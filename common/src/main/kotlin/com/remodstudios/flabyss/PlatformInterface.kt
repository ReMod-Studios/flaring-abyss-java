@file:JvmName("PlatformInterface")
package com.remodstudios.flabyss

import me.shedaniel.architectury.annotations.ExpectPlatform

@ExpectPlatform
fun printHelloWorld(): Unit = throw AssertionError()