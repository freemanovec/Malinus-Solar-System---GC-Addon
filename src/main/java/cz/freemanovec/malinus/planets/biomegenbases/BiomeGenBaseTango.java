package cz.freemanovec.malinus.planets.biomegenbases;

import cz.freemanovec.malinus.ConfigurationCLS;
import cz.freemanovec.malinus.planets.biomegenflags.BiomeGenFlagTango;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBaseTango extends BiomeGenBase{

	public static final BiomeGenBase tango = new BiomeGenFlagTango(ConfigurationCLS.biomeID_tango).setBiomeName("tango");
	
	public BiomeGenBaseTango(int p_i1971_1_) {
		super(p_i1971_1_);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.rainfall = 0;
		this.flowers.clear();
	}
	@Override
	public BiomeGenBaseTango setColor(int var1){
		return (BiomeGenBaseTango)super.setColor(var1);
	}
	@Override
	public float getSpawningChance(){
		return 0;
	}
}
