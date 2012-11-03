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
	public boolean canConnectFenceTo(IBlockAccess w, int x, int y, int z)
    {
        int bid = w.getBlockId(x, y, z);
        int chkid = 0;
        
        switch(this.blockID){
        case 3231: chkid = 3331; break;
        case 3232: chkid = 3332; break;
        case 3233: chkid = 3333; break;
        case 3234: chkid = 3334; break;
        case 3235: chkid = 3335; break;
        //case 3236: chkid = 3336; break;
        //case 3237: chkid = 3337; break;
        
        default : chkid = 3331;
        			
        
        
        
        }

        if (bid != this.blockID && bid != chkid)
        {
            Block var6 = Block.blocksList[bid];
            return var6 != null && var6.blockMaterial.isOpaque() && var6.renderAsNormalBlock() ? var6.blockMaterial != Material.pumpkin : false;
        }
        else
        {
        	return true;
        }
    }
	
	
	
	
	
	
	


}
