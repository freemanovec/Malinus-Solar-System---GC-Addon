package cz.freemanovec.malinus.planets.providers;

import cz.freemanovec.malinus.Main;
import cz.freemanovec.malinus.ModuleOrion;
import cz.freemanovec.malinus.planets.chunkproviders.ChunkProviderOrion;
import cz.freemanovec.malinus.planets.worldchunkmanagers.WorldChunkManagerOrion;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.api.world.IExitHeight;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderOrion extends WorldProviderSpace implements IGalacticraftWorldProvider{

	@Override
	public float getGravity() {
		//a really high gravity
		return -0.05f;
	}

	@Override
	public double getMeteorFrequency() {
		//a lot of meteors
		return 0.001;
	}

	@Override
	public double getFuelUsageMultiplier() {
		//a high fuel usage
		return 5;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier>1;
	}

	@Override
	public float getFallDamageModifier() {
		return 5;
	}

	@Override
	public float getSoundVolReductionAmount() {
		return 3;
	}

	@Override
	public float getThermalLevelModifier() {
		return 2;
	}

	@Override
	public float getWindLevel() {
		return 0;
	}

	@Override
	public CelestialBody getCelestialBody() {
		if(ModuleOrion.planetOrion==null)
			Main.log.fatal("planetOrion is not inicialized!");
		return ModuleOrion.planetOrion;
	}

	@Override
	public Vector3 getFogColor() {
		float f = 1.0F - this.getStarBrightness(1.0F);
        return new Vector3(210f / 255f * f, 120f / 255f * f, 59f / 255f * f);
	}

	@Override
	public Vector3 getSkyColor() {
		float f = 1.0F - this.getStarBrightness(1.0F);
		Main.log.info("xxxxxx Values of sky: " + new Vector3(154 / 255.0F * f, 114 / 255.0F * f, 66 / 255.0F * f));
		//Vector3 sky = new Vector3(154 / 255.0F * f, 114 / 255.0F * f, 66 / 255.0F * f); //ORIGINAL ORANGE
		//Vector3 sky = new Vector3(255/255.0f * f, 0 / 255.0f * f, 0 / 255.0f *f); //RED
		//Vector3 sky = new Vector3(0/255.0f * f, 255 / 255.0f * f, 0 / 255.0f *f); //GREEN
		Vector3 sky = new Vector3(0/255.0f * f, 0 / 255.0f * f, 255 / 255.0f *f); //BLUE
		//Vector3 sky = new Vector3(255/255.0f * f, 255 / 255.0f * f, 255 / 255.0f *f); //WHITE
		//Vector3 sky = new Vector3(0/255.0f * f, 0 / 255.0f * f, 0 / 255.0f *f); //BLACK
        //return new Vector3(154 / 255.0F * f, 114 / 255.0F * f, 66 / 255.0F * f);
		return sky;
	}

	@Override
	public boolean canRainOrSnow() {
		return false;
	}

	@Override
	public boolean hasSunset() {
		return false;
	}

	@Override
	public long getDayLength() {
		return 600;
	}

	@Override
	public boolean shouldForceRespawn() {
		return !ConfigManagerCore.forceOverworldRespawn;
	}

	@Override
	public Class<? extends IChunkProvider> getChunkProviderClass() {
		return ChunkProviderOrion.class;
	}

	@Override
	public Class<? extends WorldChunkManager> getWorldChunkManagerClass() {
		return WorldChunkManagerOrion.class;
	}

}
