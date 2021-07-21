package org.oakbricks.darkness.entity.darkzombie;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import org.oakbricks.darkness.TDAClient;
import org.oakbricks.darkness.TDAMain;

public class DarkZombieEntityRenderer extends MobEntityRenderer<DarkZombieEntity, DarkZombieEntityModel> {

    public DarkZombieEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new DarkZombieEntityModel(context.getPart(TDAClient.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(DarkZombieEntity entity) {
        return new Identifier(TDAMain.MOD_ID, "textures/entity/dark_zombie/dark_zombie.png");
    }

}
