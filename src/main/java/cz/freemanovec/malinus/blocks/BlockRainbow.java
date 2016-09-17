package cz.freemanovec.malinus.blocks;

import cz.freemanovec.malinus.References;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRainbow extends Block{

	public BlockRainbow() {
		super(Material.cloth);
		this.setBlockName("rainbow");
		this.setBlockTextureName((References.MOD_ID+":rainbow"));
		if(GalacticraftCore.galacticraftBlocksTab!=null){
			this.setCreativeTab(GalacticraftCore.galacticraftBlocksTab);
		}else{
			this.setCreativeTab(CreativeTabs.tabBlock);
		}
		this.setHardness(0.85f);
		this.setResistance(12f);
		this.setStepSound(soundTypeWood);
		this.setHarvestLevel("pickaxe", 1);
	}

}
