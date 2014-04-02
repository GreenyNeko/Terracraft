package com.terracraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ModBlockCrimstone extends ModBlock
{
    public ModBlockCrimstone(String name, Material material)
    {
        super(name, material);
        this.setTickRandomly(true);
        this.setHardness(4.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, Blocks.stone);
            }
            else
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    Block l1 = par1World.getBlock(i1, j1 + 1, k1);

/*		>> IF WORLD IS HARD MODE <<
                    if (par1World.getBlockId(i1, j1, k1) == Block.stone.blockID
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.crimstone.blockID);
                    }
                    if (par1World.getBlockId(i1, j1, k1) == Block.sand.blockID
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.crimsand.blockID);
                    }
		>> IF END <<
*/
                    if (par1World.getBlock(i1, j1, k1) == Blocks.grass
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassCrimson);
                    }
                }
            }
        }
    }
}

