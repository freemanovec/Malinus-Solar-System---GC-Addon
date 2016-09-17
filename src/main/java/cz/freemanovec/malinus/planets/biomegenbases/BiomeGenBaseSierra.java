package cz.freemanovec.malinus.planets.biomegenbases;

import cz.freemanovec.malinus.ConfigurationCLS;
import cz.freemanovec.malinus.planets.biomegenflags.BiomeGenFlagSierra;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBaseSierra extends BiomeGenBase{

	public static final BiomeGenBase sierra = new BiomeGenFlagSierra(ConfigurationCLS.biomeID_sierra).setBiomeName("sierra");
	
	public BiomeGenBaseSierra(int p_i1971_1_) {
		super(p_i1971_1_);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.rainfall = 0;
		this.flowers.clear();
	}
	@Override
	public BiomeGenBaseSierra setColor(int var1){
		return (BiomeGenBaseSierra)super.setColor(var1);
	}
	@Override
	public float getSpawningChance(){
		return 0;
	}
}
