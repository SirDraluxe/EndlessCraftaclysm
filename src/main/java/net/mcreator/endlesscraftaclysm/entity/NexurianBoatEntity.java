package net.mcreator.endlesscraftaclysm.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModItems;

public class NexurianBoatEntity extends Boat {
	public NexurianBoatEntity(EntityType<NexurianBoatEntity> type, Level world) {
		super(type, world, EndlesscraftaclysmModItems.NEXURIAN_BOAT);
	}
}