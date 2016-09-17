package cz.freemanovec.malinus.planets.biomegenbases;

import cz.freemanovec.malinus.ConfigurationCLS;
import cz.freemanovec.malinus.planets.biomegenflags.BiomeGenFlagRainbow;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBaseRainbow extends BiomeGenBase{

	public static final BiomeGenBase rainbow = new BiomeGenFlagRainbow(ConfigurationCLS.biomeID_rainbow).setBiomeName("rainbow");
	
	public BiomeGenBaseRainbow(int p_i1971_1_) {
		super(p_i1971_1_);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.rainfall = 0;
		this.flowers.clear();
	}
	@Override
	public BiomeGenBaseRainbow setColor(int var1){
		return (BiomeGenBaseRainbow)super.setColor(var1);
	}
	@Override
	public float getSpawningChance(){
		return 0;
	}
}
