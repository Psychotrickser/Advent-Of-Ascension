package net.tslat.aoa3.entity.mob.overworld;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoARangedMob;
import net.tslat.aoa3.entity.projectile.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectile.mob.CyanShotEntity;
import net.tslat.aoa3.util.EntityUtil;
import net.tslat.aoa3.util.PotionUtil;

import javax.annotation.Nullable;

public class SeaTrollEntity extends AoARangedMob {
	public SeaTrollEntity(EntityType<? extends MonsterEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return 1.625f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 20;
	}

	@Override
	public double getBaseProjectileDamage() {
		return 4;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.207;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_GOBLIN_AMBIENT.get();
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_GOBLIN_DEATH.get();
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_GOBLIN_HURT.get();
	}

	@Nullable
	@Override
	protected SoundEvent getShootSound() {
		return AoASounds.ENTITY_WIZARD_SHOOT.get();
	}

	@Override
	protected boolean isDaylightMob() {
		return true;
	}

	@Override
	protected BaseMobProjectile getNewProjectileInstance() {
		return new CyanShotEntity(this, BaseMobProjectile.Type.MAGIC);
	}

	@Override
	public void doProjectileImpactEffect(BaseMobProjectile projectile, Entity target) {
		EntityUtil.applyPotions(target, new PotionUtil.EffectBuilder(Effects.SLOWNESS, 120));
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}
}
