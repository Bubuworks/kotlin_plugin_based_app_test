package com.example.pluginapp

import com.example.pluginapp.core.PluginManager

fun main() {
    val pluginManager = PluginManager()

    pluginManager.loadPlugin("com.example.pluginapp.plugins.GreetingPlugin")
    pluginManager.loadPlugin("com.example.pluginapp.plugins.MathPlugin")

    pluginManager.executeAll()
}
