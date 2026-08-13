package net.mcreator.endlesscraftaclysm.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModItems;

public class NexurianChestBoatEntity extends ChestBoat {
	public NexurianChestBoatEntity(EntityType<NexurianChestBoatEntity> type, Level world) {
		super(type, world, EndlesscraftaclysmModItems.NEXURIAN_CHEST_BOAT);
	}
}