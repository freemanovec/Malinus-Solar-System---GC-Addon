package cz.freemanovec.malinus.planets.biomegenbases;

import cz.freemanovec.malinus.ConfigurationCLS;
import cz.freemanovec.malinus.planets.biomegenflags.BiomeGenFlagOrion;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBaseOrion extends BiomeGenBase{
	
	public static final BiomeGenBase orionFlat = new BiomeGenFlagOrion(ConfigurationCLS.biomeID_orionFlat).setBiomeName("orionFlat");

	public BiomeGenBaseOrion(int var1) {
		super(var1);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.rainfall = 0;
		this.flowers.clear();
	}
	
	@Override
	public BiomeGenBaseOrion setColor(int var1){
		return (BiomeGenBaseOrion) super.setColor(var1);
	}
	
	@Override
	public float getSpawningChance(){
		return 0;
	}

}
