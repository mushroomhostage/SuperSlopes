package net.minecraft.src;

import java.util.ArrayList;

public class BlockSlopes_Kaevator extends Block
{
    protected BlockSlopes_Kaevator(int var1, int var2, Material var3)
    {
        super(var1, var2, var3);
        this.setLightOpacity(mod_Kaevator_Slopes.SlopesOpacity);
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return mod_Kaevator_Slopes.SlopesRenderID;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return true;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = var1.getBlockMetadata(var2, var3, var4);
        int var7;

        if (var6 == 12)
        {
            var7 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F)) & 3;
        }
        else
        {
            var7 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        }

        if (var7 == 0)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 2 + var6);
        }

        if (var7 == 1)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 1 + var6);
        }

        if (var7 == 2)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 3 + var6);
        }

        if (var7 == 3)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 0 + var6);
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int damageDropped(int var1)
    {
        return var1 != 0 && var1 != 1 && var1 != 2 && var1 != 3 ? (var1 != 4 && var1 != 5 && var1 != 6 && var1 != 7 ? (var1 != 8 && var1 != 9 && var1 != 10 && var1 != 11 ? (var1 != 12 && var1 != 13 && var1 != 14 && var1 != 15 ? var1 : 12) : 8) : 4) : 0;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int damageDropped(int var1)
    {
        return var1 != 0 && var1 != 1 && var1 != 2 && var1 != 3 ? (var1 != 4 && var1 != 5 && var1 != 6 && var1 != 7 ? (var1 != 8 && var1 != 9 && var1 != 10 && var1 != 11 ? (var1 != 12 && var1 != 13 && var1 != 14 && var1 != 15 ? var1 : 12) : 8) : 4) : 0;
    }

    /**
     * Adds to the supplied array any colliding bounding boxes with the passed in bounding box. Args: world, x, y, z,
     * axisAlignedBB, arrayList
     */
    public void getCollidingBoundingBoxes(World var1, int var2, int var3, int var4, AxisAlignedBB var5, ArrayList var6)
    {
        int var7 = var1.getBlockMetadata(var2, var3, var4);

        if (var7 == 0)
        {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 1)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 2)
        {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 3)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 4)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 5)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 6)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 7)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 8)
        {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 9)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 10)
        {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 11)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 12)
        {
            this.setBlockBounds(0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 13)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 14)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 15)
        {
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    /**
     * Called upon block activation (left or right click on the block.). The three integers represent x,y,z of the
     * block.
     */
    public boolean blockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        int var6 = var1.getBlockId(var2, var3, var4);

        if (var6 == mod_Kaevator_Slopes.BlockKaevBlackWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevRedWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevGreenWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevBrownWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevBlueWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevPurpleWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevCyanWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevSilverWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevGrayWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevPinkWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevLimeWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevYellowWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevLightBlueWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevMagentaWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevOrangeWoolSlopes.blockID || var6 == mod_Kaevator_Slopes.BlockKaevWhiteWoolSlopes.blockID)
        {
            ItemStack var7 = var5.inventory.getCurrentItem();

            if (var7 != null && var7.itemID == Item.dyePowder.shiftedIndex)
            {
                int var8 = var1.getBlockMetadata(var2, var3, var4);

                if (var7.getItemDamage() == 0 && mod_Kaevator_Slopes.BlockKaevBlackWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevBlackWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 1 && mod_Kaevator_Slopes.BlockKaevRedWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevRedWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 2 && mod_Kaevator_Slopes.BlockKaevGreenWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevGreenWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 3 && mod_Kaevator_Slopes.BlockKaevBrownWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevBrownWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 4 && mod_Kaevator_Slopes.BlockKaevBlueWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevBlueWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 5 && mod_Kaevator_Slopes.BlockKaevPurpleWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevPurpleWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 6 && mod_Kaevator_Slopes.BlockKaevCyanWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevCyanWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 7 && mod_Kaevator_Slopes.BlockKaevSilverWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevSilverWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 8 && mod_Kaevator_Slopes.BlockKaevGrayWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevGrayWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 9 && mod_Kaevator_Slopes.BlockKaevPinkWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevPinkWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 10 && mod_Kaevator_Slopes.BlockKaevLimeWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevLimeWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 11 && mod_Kaevator_Slopes.BlockKaevYellowWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevYellowWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 12 && mod_Kaevator_Slopes.BlockKaevLightBlueWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevLightBlueWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 13 && mod_Kaevator_Slopes.BlockKaevMagentaWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevMagentaWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 14 && mod_Kaevator_Slopes.BlockKaevOrangeWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevOrangeWoolSlopes.blockID, var8);
                    return true;
                }

                if (var7.getItemDamage() == 15 && mod_Kaevator_Slopes.BlockKaevWhiteWoolSlopes.blockID != Block.stone.blockID)
                {
                    var1.setBlockAndMetadataWithNotify(var2, var3, var4, mod_Kaevator_Slopes.BlockKaevWhiteWoolSlopes.blockID, var8);
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Takes a dye damage value and returns the block damage value to match
     */
    public static int getBlockFromDye(int var0)
    {
        return var0;
    }

    /**
     * Takes a block damage value and returns the dye damage value to match
     */
    public static int getDyeFromBlock(int var0)
    {
        return var0;
    }
}
