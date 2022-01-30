package de.philgamer.chaotischesuppe

import de.philgamer.chaotischesuppe.commands.DiscordCommand
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.main.KSpigot

class Main : KSpigot() {

    override fun startup() {
        logger.info("${KColors.GREEN}The Plugin was enabled!")
        DiscordCommand().register()
    }

    override fun shutdown() {
        logger.info("${KColors.RED}The Plugin was disabled!")
    }
}
