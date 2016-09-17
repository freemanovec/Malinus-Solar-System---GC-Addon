package cz.freemanovec.malinus.planets.chunkproviders;

import java.util.List;

import com.google.common.collect.Lists;

import cz.freemanovec.malinus.planets.biomedecorators.BiomeDecoratorOrion;
import cz.freemanovec.malinus.planets.biomegenbases.BiomeGenBaseOrion;
import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.ChunkProviderSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderOrion extends ChunkProviderSpace{

	private final BiomeDecoratorOrion orionBiomeDecorator = new BiomeDecoratorOrion();
	
	public ChunkProviderOrion(World par1World, long seed, boolean mapFeaturesEnabled) {
		super(par1World, seed, mapFeaturesEnabled);
	}

	@Override
	protected BiomeDecoratorSpace getBiomeGenerator() {
		return this.orionBiomeDecorator;
	}

	@Override
	protected BiomeGenBase[] getBiomesForGeneration() {
		return new BiomeGenBase[]{BiomeGenBaseOrion.orionFlat};
	}

	@Override
	protected int getSeaLevel() {
		return 93;
	}

	@Override
	protected List<MapGenBaseMeta> getWorldGenerators() {
		return Lists.newArrayList();
	}

	@Override
	protected SpawnListEntry[] getMonsters() {
		return new SpawnListEntry[]{};
	}

	@Override
	protected SpawnListEntry[] getCreatures() {
		return new SpawnListEntry[]{};
	}

	@Override
	protected BlockMetaPair getGrassBlock() {
		return new BlockMetaPair(Blocks.sand, (byte)0);
	}

	@Override
	protected BlockMetaPair getDirtBlock() {
		return new BlockMetaPair(Blocks.sandstone, (byte)0);
	}

	@Override
	protected BlockMetaPair getStoneBlock() {
		return new BlockMetaPair(Blocks.sandstone, (byte)0);
	}

	@Override
	public double getHeightModifier() {
		return 1;
	}

	@Override
	public double getSmallFeatureHeightModifier() {
		return 1;
	}

	@Override
	public double getMountainHeightModifier() {
		return 1;
	}

	@Override
	public double getValleyHeightModifier() {
		return 1;
	}

	@Override
	public int getCraterProbability() {
		return 3000;
	}

	@Override
	public void onChunkProvide(int cX, int cZ, Block[] blocks, byte[] metadata) {
		// left blank
	}

	@Override
	public void onPopulate(IChunkProvider provider, int cX, int cZ) {
		//left blank
	}

}
