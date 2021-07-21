package org.oakbricks.darkness.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.oakbricks.darkness.TDAMain;
import org.oakbricks.darkness.entity.darkzombie.DarkZombieEntity;

import static net.minecraft.data.client.model.Models.CUBE;

public class RegisterEntityStuff {

    public static final EntityType<DarkZombieEntity> CUBE =  Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(TDAMain.MOD_ID, "dark_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DarkZombieEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );;

    public static final void registerEntityStuff() {

        FabricDefaultAttributeRegistry.register(CUBE, DarkZombieEntity.createMobAttributes());

    }

}
