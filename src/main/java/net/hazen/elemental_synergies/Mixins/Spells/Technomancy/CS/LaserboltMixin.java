package net.hazen.elemental_synergies.Mixins.Spells.Technomancy.CS;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.acetheeldritchking.cataclysm_spellbooks.spells.technomancy.LaserboltSpell;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LaserboltSpell.class)
public abstract class LaserboltMixin extends AbstractSpell {

	public float getDamage(int spellLevel, LivingEntity entity) {
		if (entity == null) {
			return 2.5F + this.getSpellPower(spellLevel, entity) * 2.0F;
		}
		double lightningSpellPower = entity.getAttributes()
				.hasAttribute((Attribute) AttributeRegistry.LIGHTNING_SPELL_POWER.get()) ?
				entity.getAttributeValue((Attribute) AttributeRegistry.LIGHTNING_SPELL_POWER.get()) : (double)1.0F;
		return  (float)(this.getSpellPower(spellLevel, entity) +( 0.5 * lightningSpellPower) * 0.5F);
	}
}