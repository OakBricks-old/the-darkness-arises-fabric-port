package org.oakbricks.darkness;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import org.oakbricks.darkness.entity.darkzombie.DarkZombieEntityModel;
import org.oakbricks.darkness.entity.darkzombie.DarkZombieEntityRenderer;
import org.oakbricks.darkness.init.RegisterEntityStuff;

@Environment(EnvType.CLIENT)
public class TDAClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier(TDAMain.MOD_ID, "dark_zombie"), "main");
    @Override
    public void onInitializeClient() {
        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        EntityRendererRegistry.INSTANCE.register(RegisterEntityStuff.CUBE, (context) -> {
            return new DarkZombieEntityRenderer(context);
        });
        EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, DarkZombieEntityModel::getTexturedModelData);
    }
}
