package com.example.pluginapp.core

class PluginManager {

    private val plugins = mutableListOf<Plugin>()

    fun loadPlugin(className: String) {
        val clazz = Class.forName(className)
        val plugin = clazz.getDeclaredConstructor().newInstance() as Plugin
        plugins.add(plugin)
        println("Loaded plugin: ${plugin.name}")
    }

    fun executeAll() {
        plugins.forEach { it.execute() }
    }
}
