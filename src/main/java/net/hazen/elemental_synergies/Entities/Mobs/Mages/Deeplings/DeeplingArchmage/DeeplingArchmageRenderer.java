package net.hazen.elemental_synergies.Entities.Mobs.Mages.Deeplings.DeeplingArchmage;

import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DeeplingArchmageRenderer extends AbstractSpellCastingMobRenderer {
    public DeeplingArchmageRenderer(EntityRendererProvider.Context context) {
        super(context, new DeeplingArchmageModel());
        this.addRenderLayer(new DeeplingArchmageEmissiveLayer(this));
    }
}
