package cz.freemanovec.malinus.planets.chunkproviders;

import java.util.List;

import com.google.common.collect.Lists;

import cz.freemanovec.malinus.planets.biomedecorators.BiomeDecoratorFurra;
import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.ChunkProviderSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderFurra extends ChunkProviderSpace{

	private final BiomeDecoratorFurra furraBiomeDecorator = new BiomeDecoratorFurra();
	
	public ChunkProviderFurra(World par1World, long seed, boolean mapFeaturesEnabled) {
		super(par1World, seed, mapFeaturesEnabled);
	}

	@Override
	protected BiomeDecoratorSpace getBiomeGenerator() {
		return this.furraBiomeDecorator;
	}

	@Override
	protected BiomeGenBase[] getBiomesForGeneration() {
		return new BiomeGenBase[]{BiomeGenBase.birchForest};
	}

	@Override
	protected int getSeaLevel() {
		return 94;
	}

	@Override
	protected List<MapGenBaseMeta> getWorldGenerators() {
		return Lists.newArrayList();
	}

	@Override
	protected SpawnListEntry[] getMonsters() {
		return null;
	}

	@Override
	protected SpawnListEntry[] getCreatures() {
        return new SpawnListEntry[]{
        		new SpawnListEntry(EntitySheep.class, 8, 2, 20),
        		new SpawnListEntry(EntityPig.class, 8, 2, 20),
        		new SpawnListEntry(EntityCow.class, 8, 2, 20),
        		new SpawnListEntry(EntityChicken.class, 8, 2, 12)
        };
	}

	@Override
	protected BlockMetaPair getGrassBlock() {
		return new BlockMetaPair(Blocks.grass, (byte)0);
	}

	@Override
	protected BlockMetaPair getDirtBlock() {
		return new BlockMetaPair(Blocks.dirt, (byte)0);
	}

	@Override
	protected BlockMetaPair getStoneBlock() {
		return new BlockMetaPair(Blocks.stone, (byte)0);
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
		return 0;
	}

	@Override
	public void onChunkProvide(int cX, int cZ, Block[] blocks, byte[] metadata) {
	}

	@Override
	public void onPopulate(IChunkProvider provider, int cX, int cZ) {
	}

}
