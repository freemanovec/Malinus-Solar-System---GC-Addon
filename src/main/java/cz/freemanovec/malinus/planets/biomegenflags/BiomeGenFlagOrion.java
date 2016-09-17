package cz.freemanovec.malinus.planets.biomegenflags;

import cz.freemanovec.malinus.planets.biomegenbases.BiomeGenBaseOrion;

public class BiomeGenFlagOrion extends BiomeGenBaseOrion{
	public BiomeGenFlagOrion(int par1){
		super(par1);
		this.setBiomeName("orion");
		this.setColor(16711680);
		this.setHeight(new Height(2.5f, 0.4f));
	}
}
