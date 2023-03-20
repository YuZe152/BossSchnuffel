package de.yuze.bossschnuffel;

import de.yuze.bossschnuffel.commands.SpawnWitherBoss;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class BossSchnuffel extends JavaPlugin {

    private static BossSchnuffel instance;

    @Override
    public void onEnable() {
        instance = this;
        register(Bukkit.getPluginManager());
    }

    private void register(PluginManager pm) {
        getCommand("witherboss").setExecutor(new SpawnWitherBoss());
    }

    public static BossSchnuffel getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
