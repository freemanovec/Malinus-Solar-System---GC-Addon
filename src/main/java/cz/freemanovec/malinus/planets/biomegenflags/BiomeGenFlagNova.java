package cz.freemanovec.malinus.planets.biomegenflags;

import cz.freemanovec.malinus.planets.biomegenbases.BiomeGenBaseNova;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeGenFlagNova  extends BiomeGenBaseNova{

	public BiomeGenFlagNova(int var1) {
		super(var1);
		this.setBiomeName("nova");
		this.setColor(16711680);
		this.setHeight(new Height(2.5f, 0.4f));
	}

}
