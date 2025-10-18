package net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingSorcerest;

import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMobRenderer;
import net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingArchmage.DeeplingArchmageEmissiveLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DeeplingSorcerestRenderer extends AbstractSpellCastingMobRenderer {
    public DeeplingSorcerestRenderer(EntityRendererProvider.Context context) {
        super(context, new DeeplingSorcerestModel());
        this.addRenderLayer(new DeeplingSorcerestEmissiveLayer(this));
    }
}
