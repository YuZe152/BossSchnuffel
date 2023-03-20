package de.yuze.bossschnuffel.core;

import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Wither;

/**
 * JavaDoc this file!
 * Created: 20.03.2023
 *
 * @author YuZe152
 */

public class WitherManager {

    private Wither wither;

    public WitherManager(Location location) {
        getWither(location);
    }

    public Wither getWither(Location location) {
        this.wither = location.getWorld().spawn(location, Wither.class);
        this.wither.setMaxHealth(500);
        this.wither.setHealth(500);
        this.wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(28.0f);
        this.wither.setRemoveWhenFarAway(false);
        this.wither.setPersistent(true);
        return this.wither;
    }
}
