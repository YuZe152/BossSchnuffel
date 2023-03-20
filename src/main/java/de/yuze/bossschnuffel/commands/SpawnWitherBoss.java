package de.yuze.bossschnuffel.commands;

import de.yuze.bossschnuffel.core.WitherManager;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * JavaDoc this file!
 * Created: 20.03.2023
 *
 * @author YuZe152
 */

public class SpawnWitherBoss implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You need to be a player to use this command.");
            return false;
        }

        Player player = (Player) sender;
        if (!player.hasPermission("boss.spawn.use")) {
            player.sendMessage(ChatColor.RED + "You have no permissions to spawn this boss.");
            return false;
        }

        Location location = player.getLocation();
        new WitherManager(location);
        return false;
    }
}
