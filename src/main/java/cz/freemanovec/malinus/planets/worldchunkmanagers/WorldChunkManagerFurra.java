package cz.freemanovec.malinus.planets.worldchunkmanagers;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldChunkManagerSpace;
import net.minecraft.world.biome.BiomeGenBase;

public class WorldChunkManagerFurra extends WorldChunkManagerSpace{
	@Override
	public BiomeGenBase getBiome(){
		return BiomeGenBase.birchForest;
	}
}
