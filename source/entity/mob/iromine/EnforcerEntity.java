package net.tslat.aoa3.entity.mob.iromine;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EnforcerEntity extends AoAMeleeMob {
    public EnforcerEntity(EntityType<? extends MonsterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 2.0625f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0.4;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 89;
    }

    @Override
    protected double getBaseMeleeDamage() {
        return 10;
    }

    @Override
    protected double getBaseMovementSpeed() {
        return 0.25;
    }

    @Override
    protected double getBaseArmour() {
        return 4;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return AoASounds.ENTITY_ENFORCER_AMBIENT.get();
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return AoASounds.ENTITY_ENFORCER_DEATH.get();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return AoASounds.ENTITY_ENFORCER_HURT.get();
    }
}
