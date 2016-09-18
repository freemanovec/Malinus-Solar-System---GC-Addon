package cz.freemanovec.malinus.planets.providers;

import cz.freemanovec.malinus.Main;
import cz.freemanovec.malinus.MalinusSystemModule;
import cz.freemanovec.malinus.planets.chunkproviders.ChunkProviderFurra;
import cz.freemanovec.malinus.planets.worldchunkmanagers.WorldChunkManagerFurra;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderFurra extends WorldProviderSpace implements IGalacticraftWorldProvider{

	@Override
	public float getGravity() {
		return 0;
	}

	@Override
	public double getMeteorFrequency() {
		return 0;
	}

	@Override
	public double getFuelUsageMultiplier() {
		return 1;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier>1;
	}

	@Override
	public float getFallDamageModifier() {
		return 1;
	}

	@Override
	public float getSoundVolReductionAmount() {
		return 0;
	}

	@Override
	public float getThermalLevelModifier() {
		return 0;
	}

	@Override
	public float getWindLevel() {
		return 1f;
	}

	@Override
	public CelestialBody getCelestialBody() {
		if(MalinusSystemModule.planetFurra==null)
			Main.log.fatal("planetFurra is not inicialized!");
		return MalinusSystemModule.planetFurra;
	}

	@Override
	public Vector3 getFogColor() {
		return new Vector3(0,0,0);
	}

	@Override
	public Vector3 getSkyColor() {
		return new Vector3(0.2f,0.2f,1f);
	}

	@Override
	public boolean canRainOrSnow() {
		return true;
	}

	@Override
	public boolean hasSunset() {
		return true;
	}

	@Override
	public long getDayLength() {
		return 3080;
	}

	@Override
	public boolean shouldForceRespawn() {
		return true;
	}

	@Override
	public Class<? extends IChunkProvider> getChunkProviderClass() {
		return ChunkProviderFurra.class;
	}

	@Override
	public Class<? extends WorldChunkManager> getWorldChunkManagerClass() {
		return WorldChunkManagerFurra.class;
	}

}
