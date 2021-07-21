package org.oakbricks.darkness.entity.darkzombie;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class DarkZombieEntity extends MobEntity {

    public DarkZombieEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }
}