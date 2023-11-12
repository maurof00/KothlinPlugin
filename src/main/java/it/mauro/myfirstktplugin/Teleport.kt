package it.mauro.myfirstktplugin

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Teleport : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if(sender is Player){
            if(args.size == 1) {
                val target = sender.server.getPlayerExact(args[0])

                if(target != null) {
                    sender.teleport(target)
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bTeleported to &3${target.name}&b."))
                } else{
                    sender.sendMessage("${ChatColor.RED}Giocatore offline.")
                }
            }
        }



        return false
    }
}