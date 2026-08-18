package net.mcreator.endlesscraftaclysm.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

@EventBusSubscriber
public class EndlesscraftaclysmModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, EndlesscraftaclysmMod.MODID);
	public static boolean NexurianERaidActive = false;
	public static double NexurianERaidWave = 0;
	public static double NexurianERaidMobRemains = 0;
	public static double NexurianERaidCenterX = 0;
	public static double NexurianERaidCenterY = 0;
	public static double NexurianERaidCenterZ = 0;
	public static double NexurianERaidMaximumWaveTier1 = 9.0;
	public static double NexurianERaidMobCount = 0;
	public static double NexurianERaidWaveCap = 0;
	public static double NexurianSeraphCharge = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}