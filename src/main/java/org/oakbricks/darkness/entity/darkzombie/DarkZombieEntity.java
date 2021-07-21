package org.oakbricks.darkness.entity.darkzombie;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.world.World;

public class DarkZombieEntity extends ZombieEntity {

    public DarkZombieEntity(EntityType<? extends MobEntity> entityType, World world) {
        super((EntityType<? extends ZombieEntity>) entityType, world);
    }
}