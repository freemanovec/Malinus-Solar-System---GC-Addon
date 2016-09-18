package cz.freemanovec.malinus.planets.biomedecorators;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecoratorAllegia extends BiomeDecoratorSpace{
	
	private WorldGenerator ironGen;
	private World currentWorld;
	
	public BiomeDecoratorAllegia(){
		this.ironGen = new WorldGenMinableMeta(Blocks.iron_ore, 40, 0, false, Blocks.stone, 0);
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
		this.generateOre(10, ironGen, 0, 150);
	}
}
