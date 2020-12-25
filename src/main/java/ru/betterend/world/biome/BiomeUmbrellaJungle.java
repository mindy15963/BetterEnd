package ru.betterend.world.biome;

import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndFeatures;

public class BiomeUmbrellaJungle extends EndBiome {
	public BiomeUmbrellaJungle() {
		super(new BiomeDefinition("umbrella_jungle")
				.setFogColor(87, 223, 221)
				.setWaterAndFogColor(119, 198, 253)
				.setFoliageColor(27, 183, 194)
				.setFogDensity(2.3F)
				.setSurface(EndBlocks.JUNGLE_MOSS)
				.addFeature(EndFeatures.END_LAKE)
				.addFeature(EndFeatures.UMBRELLA_TREE)
				.addFeature(EndFeatures.TWISTED_UMBRELLA_MOSS)
				.addFeature(EndFeatures.JUNGLE_GRASS)
				.addFeature(EndFeatures.CYAN_MOSS)
				.addFeature(EndFeatures.CYAN_MOSS_WOOD)
				.addFeature(EndFeatures.CHARNIA_CYAN)
				.addFeature(EndFeatures.CHARNIA_GREEN)
				.addFeature(EndFeatures.CHARNIA_LIGHT_BLUE)
				.addFeature(EndFeatures.CHARNIA_RED_RARE));
	}
}