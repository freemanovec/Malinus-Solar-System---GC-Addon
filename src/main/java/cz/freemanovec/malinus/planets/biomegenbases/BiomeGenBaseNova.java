package cz.freemanovec.malinus.planets.biomegenbases;

import cz.freemanovec.malinus.ConfigurationCLS;
import cz.freemanovec.malinus.planets.biomegenflags.BiomeGenFlagNova;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBaseNova extends BiomeGenBase{

	public static final BiomeGenBase nova = new BiomeGenFlagNova(ConfigurationCLS.biomeID_nova).setBiomeName("nova");
	
	public BiomeGenBaseNova(int p_i1971_1_) {
		super(p_i1971_1_);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.rainfall = 0;
		this.flowers.clear();
	}
	@Override
	public BiomeGenBaseNova setColor(int var1){
		return (BiomeGenBaseNova)super.setColor(var1);
	}
	@Override
	public float getSpawningChance(){
		return 0;
	}
}