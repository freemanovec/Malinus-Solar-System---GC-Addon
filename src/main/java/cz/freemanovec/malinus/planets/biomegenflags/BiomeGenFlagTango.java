package cz.freemanovec.malinus.planets.biomegenflags;

import cz.freemanovec.malinus.planets.biomegenbases.BiomeGenBaseTango;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeGenFlagTango  extends BiomeGenBaseTango{

	public BiomeGenFlagTango(int var1) {
		super(var1);
		this.setBiomeName("tango");
		this.setColor(16711680);
		this.setHeight(new Height(2.5f, 0.4f));
	}

}
