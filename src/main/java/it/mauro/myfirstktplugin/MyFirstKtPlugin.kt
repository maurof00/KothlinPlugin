package it.mauro.myfirstktplugin

import org.bukkit.plugin.java.JavaPlugin

class MyFirstKtPlugin : JavaPlugin() {
    override fun onEnable() {
        getCommand("gmc")?.setExecutor(Command())
        getCommand("tp")?.setExecutor(Teleport())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
