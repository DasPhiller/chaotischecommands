package de.philgamer.chaotischesuppe.commands

import net.axay.kspigot.chat.chatComponent
import net.axay.kspigot.chat.clickEvent
import net.axay.kspigot.chat.hoverEventText
import net.axay.kspigot.commands.command
import net.axay.kspigot.commands.requiresPermission
import net.axay.kspigot.commands.runs
import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.chat.ClickEvent

class DiscordCommand {
    fun register() = command("discord", true) {

        runs {
            val component = chatComponent {
                text("Here is our discord") {
                    color = ChatColor.GREEN
                    isBold = false
                }
                text("[Join]") {
                    color = ChatColor.AQUA
                    clickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/38fW65zzqC")
                    hoverEventText {
                        text("Join the Discord") { color = ChatColor.GREEN }
                    }
                }
            }
        }
    }
}