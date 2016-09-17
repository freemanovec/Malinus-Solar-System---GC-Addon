package cz.freemanovec.malinus.planets.worldchunkmanagers;

import cz.freemanovec.malinus.planets.biomegenbases.BiomeGenBaseOrion;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldChunkManagerSpace;
import net.minecraft.world.biome.BiomeGenBase;

public class WorldChunkManagerOrion extends WorldChunkManagerSpace{

	@Override
	public BiomeGenBase getBiome() {
		return BiomeGenBaseOrion.orionFlat;
	}

}
