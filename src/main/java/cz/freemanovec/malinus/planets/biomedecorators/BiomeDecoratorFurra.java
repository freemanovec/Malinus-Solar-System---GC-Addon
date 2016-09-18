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
		//this.ironGen = new WorldGenMinableMeta(Blocks.iron_ore, 80, 0, false, Blocks.stone, 0);
		//this.goldGen = new WorldGenMinableMeta(Blocks.gold_ore, 20, 0, false, Blocks.stone, 0);
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
		//this.generateOre(10, ironGen, 0, 150);
		//this.generateOre(10, goldGen, 0, 150);
	}
}
