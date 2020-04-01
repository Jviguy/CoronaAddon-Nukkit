package cn.nukkit.exampleplugin;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.Player;

/**
 * author: NycuRO
 * CoronaAddon-Nukkit Project
 * API: 1.0.5
 */
public class Loader extends PluginBase {

    @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.DARK_GREEN + "CORONA LOADED! SOON ALL PLAYERS WILL BE INFECTED!");
    }

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.DARK_GREEN + "CORONA ENABLED! BE READY!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "YOU DESTROYED THE CORONA!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName().toLowerCase()) {
            case "corona":
                Player player = (Player) sender;
                player.sendMessage("YOU GOT CORONA!");
                break;
        }
        return true;
    }

}
