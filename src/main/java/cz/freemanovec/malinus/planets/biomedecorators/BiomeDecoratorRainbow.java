package cz.freemanovec.malinus.planets.biomedecorators;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import net.minecraft.world.World;

public class BiomeDecoratorRainbow extends BiomeDecoratorSpace{
	
	private World currentWorld;
	
	public BiomeDecoratorRainbow(){
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
