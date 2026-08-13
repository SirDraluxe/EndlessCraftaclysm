package net.mcreator.endlesscraftaclysm.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements EndlesscraftaclysmModBiomes.EndlesscraftaclysmModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> endlesscraftaclysm_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.endlesscraftaclysm_dimensionTypeReference != null) {
			retval = EndlesscraftaclysmModBiomes.adaptSurfaceRule(retval, this.endlesscraftaclysm_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setendlesscraftaclysmDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.endlesscraftaclysm_dimensionTypeReference = dimensionType;
	}
}