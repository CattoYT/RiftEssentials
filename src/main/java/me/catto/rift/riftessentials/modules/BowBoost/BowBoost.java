package me.catto.rift.riftessentials.modules.BowBoost;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

public class BowBoost implements Listener {

    @EventHandler
    private void onEntityShootBow(EntityShootBowEvent event) {

        LivingEntity entity = event.getEntity();

        if (entity.getType() == EntityType.PLAYER && !(event.getForce() > 0.14666666f)) {


            event.getProjectile().remove();
            entity.damage(0.1D, entity);
            entity.setVelocity(entity.getLocation().getDirection().multiply(2).setY(0));

        }
    }
}
