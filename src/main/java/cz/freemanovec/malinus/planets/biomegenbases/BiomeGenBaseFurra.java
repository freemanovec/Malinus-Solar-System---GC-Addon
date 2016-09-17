package cz.freemanovec.malinus.planets.biomegenbases;

import cz.freemanovec.malinus.ConfigurationCLS;
import cz.freemanovec.malinus.planets.biomegenflags.BiomeGenFlagFurra;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBaseFurra extends BiomeGenBase{

	public static final BiomeGenBase furra = new BiomeGenFlagFurra(ConfigurationCLS.biomeID_furra).setBiomeName("furra");
	
	public BiomeGenBaseFurra(int p_i1971_1_) {
		super(p_i1971_1_);
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
