package cz.freemanovec.malinus.planets.biomegenflags;

import cz.freemanovec.malinus.planets.biomegenbases.BiomeGenBaseFurra;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeGenFlagFurra extends BiomeGenBaseFurra{

	public BiomeGenFlagFurra(int var1) {
		super(var1);
		this.setBiomeName("furra");
		this.setColor(16711680);
		this.setHeight(new Height(2.5f, 0.4f));
	}

}
