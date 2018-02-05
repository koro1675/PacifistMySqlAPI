package pacifist.mysqlapi;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class PacifistMySqlAPI extends JavaPlugin {

    String prefix = "§f§l[§6§lPacifist§3§lMy§6§lSQL§b§lAPI§f§l]§r";

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player == false) {
            sender.sendMessage("[PacifistMySqlAPI]: This command cannot execute Console");
            return false;
        }

        if (command.getName().equalsIgnoreCase("mysqlapi")
                || command.getName().equalsIgnoreCase("sqlapi")) {
            sender.sendMessage(prefix + "§f§lVersion1.0-SNAPSHOT");
        }
        return false;
    }
}
