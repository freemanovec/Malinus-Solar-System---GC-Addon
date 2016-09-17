package cz.freemanovec.malinus.planets.biomegenbases;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBaseFurra extends BiomeGenBase{

	public BiomeGenBaseFurra(int p_i1971_1_) {
		super(p_i1971_1_);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.rainfall = 0;
		this.flowers.clear();
	}
	@Override
	public BiomeGenBaseFurra setColor(int var1){
		return (BiomeGenBaseFurra)super.setColor(var1);
	}
	@Override
	public float getSpawningChance(){
		return 0;
	}
}
