package it.mauro.myfirstktplugin

import org.bukkit.ChatColor
import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandException
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Command : CommandExecutor {
    override fun onCommand(sender: CommandSender, cmd: Command, string: String, args: Array<out String>): Boolean {

        if(sender.hasPermission("myplugin.gamemode") && sender is Player) {
            sender.gameMode = GameMode.CREATIVE
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bGamemode cambiata in &3%gamemode%").replace("%gamemode%", sender.gameMode.toString()))
        }else{
            sender.sendMessage("Non puoi eseguire questo comando")
        }




        return false
    }

}