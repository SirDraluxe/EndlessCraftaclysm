package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class NexurianGalanthisAntiGravityChargeRageModeProjectileHitsPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((-1.3), 1.3, (-1.3)));
	}
}