package net.tslat.aoa3.item.weapon.bow;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.entity.projectile.arrow.CustomArrowEntity;
import net.tslat.aoa3.util.LocaleUtil;

import javax.annotation.Nullable;
import java.util.List;

public class PrimordialBow extends BaseBow {
	public PrimordialBow(double damage, float drawSpeedMultiplier, int durability) {
		super(damage, drawSpeedMultiplier, durability);
	}

	@Override
	public void onBlockHit(CustomArrowEntity arrow, BlockRayTraceResult rayTrace, Entity shooter) {
		AreaEffectCloudEntity cloud = new AreaEffectCloudEntity(arrow.world, arrow.getPosX(), arrow.getPosY(), arrow.getPosZ());

		cloud.addEffect(new EffectInstance(Effects.WITHER, 40, 0, false, true));
		cloud.setParticleData(ParticleTypes.SMOKE);
		cloud.setRadius(2);
		cloud.setDuration(200);

		arrow.world.addEntity(cloud);
	}

	@Override
	public void onEntityHit(CustomArrowEntity arrow, Entity target, Entity shooter, double damage, float drawStrength) {
		AreaEffectCloudEntity cloud = new AreaEffectCloudEntity(arrow.world, arrow.getPosX(), arrow.getPosY(), arrow.getPosZ());

		cloud.addEffect(new EffectInstance(Effects.WITHER, 40, 0, false, true));
		cloud.setParticleData(ParticleTypes.SMOKE);
		cloud.setRadius(2);
		cloud.setDuration(200);

		arrow.world.addEntity(cloud);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
		super.addInformation(stack, world, tooltip, flag);
	}
}
