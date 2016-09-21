package cz.freemanovec.malinus.planets.biomedecorators;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecoratorFurra extends BiomeDecoratorSpace{
	private WorldGenerator ironGen, goldGen;
	private World currentWorld;
	
	public BiomeDecoratorFurra(){
	}
	
	@Override
	protected void setCurrentWorld(World world){
		this.currentWorld = world;
	}
	
	@Override
	protected World getCurrentWorld() {
		return this.currentWorld;
	}
	
	@Override
	protected void decorate(){
	}
}
