package me.catto.rift.riftessentials.modules.BowBoost;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

public class BowBoost implements Listener {

    public static double getBowVelocity() {
        return bowVelocity;
    }

    private static double bowVelocity = 1.6;
    public static void setBowVelocity(double desiredBowVelocity) {

        bowVelocity = desiredBowVelocity;

    }

    @EventHandler
    private void onEntityShootBow(EntityShootBowEvent event) {

        LivingEntity entity = event.getEntity();

        if (entity.getType() == EntityType.PLAYER && !(event.getForce() > 0.14666666f)) {


            event.getProjectile().remove();
            entity.damage(0.1D, entity);
            entity.setVelocity(entity.getLocation().getDirection().multiply(bowVelocity*32.2));

        }
    }
}
