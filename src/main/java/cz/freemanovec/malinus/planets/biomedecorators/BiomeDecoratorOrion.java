package cz.freemanovec.malinus.planets.biomedecorators;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecoratorOrion extends BiomeDecoratorSpace{

	private WorldGenerator glassGen;
	private World currentWorld;
	
	public BiomeDecoratorOrion(){
		this.glassGen = new WorldGenMinableMeta(Blocks.glass, 18, 0, true, Blocks.sandstone, 6);
	}
	
	@Override
	protected void setCurrentWorld(World world) {
		this.currentWorld = world;
	}

	@Override
	protected World getCurrentWorld() {
		return this.currentWorld;
	}

	@Override
	protected void decorate() {
		this.generateOre(4, this.glassGen, 60, 120);
	}

}
