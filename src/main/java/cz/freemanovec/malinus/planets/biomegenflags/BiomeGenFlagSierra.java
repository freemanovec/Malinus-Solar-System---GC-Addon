package cz.freemanovec.malinus.planets.biomegenflags;

import cz.freemanovec.malinus.planets.biomegenbases.BiomeGenBaseSierra;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeGenFlagSierra extends BiomeGenBaseSierra{

	public BiomeGenFlagSierra(int var1) {
		super(var1);
		this.setBiomeName("sierra");
		this.setColor(16711680);
		this.setHeight(new Height(2.5f, 0.4f));
	}

}
