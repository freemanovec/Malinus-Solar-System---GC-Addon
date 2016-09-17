package cz.freemanovec.malinus.planets.biomegenflags;

import cz.freemanovec.malinus.planets.biomegenbases.BiomeGenBaseRainbow;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeGenFlagRainbow extends BiomeGenBaseRainbow{

	public BiomeGenFlagRainbow(int var1) {
		super(var1);
		this.setBiomeName("rainbow");
		this.setColor(16711680);
		this.setHeight(new Height(2.5f, 0.4f));
	}

}
