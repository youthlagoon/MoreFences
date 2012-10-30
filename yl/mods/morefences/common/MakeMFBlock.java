package yl.mods.morefences.common;

import net.minecraft.src.Block;
import net.minecraft.src.BlockFence;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class MakeMFBlock extends BlockFence {

	public MakeMFBlock(int par1, int par2) {
		super(par1, par2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean canPlaceTorchOnTop(World world, int x,int y,int z){
		
		return true;
	}
	
	@Override
	public boolean canConnectFenceTo(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{	
		super.canConnectFenceTo(par1IBlockAccess, par2, par3, par4);
        
		int var5 = par1IBlockAccess.getBlockId(par2, par3, par4);

        if (var5 != this.blockID && var5 != Block.fenceGate.blockID)
        {
            Block var6 = Block.blocksList[var5];
            return var6 != null && var6.blockMaterial.isOpaque() && var6.renderAsNormalBlock() ? var6.blockMaterial != Material.pumpkin : false;
        }
        else
        {
            return true;
        }
    }
	
	


}
