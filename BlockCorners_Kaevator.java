package net.minecraft.src;

import java.util.ArrayList;

public class BlockCorners_Kaevator extends Block
{
    protected BlockCorners_Kaevator(int var1, int var2, Material var3)
    {
        super(var1, var2, var3);
        this.f(mod_Kaevator_Corners.SlopesOpacity);
    }

    /**
     * The type of render function that is called for this block
     */
    public int c()
    {
        return mod_Kaevator_Corners.CornersRenderID;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean a()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean b()
    {
        return false;
    }

    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return true;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void postPlace(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = var1.getData(var2, var3, var4);
        int var7 = MathHelper.floor((double)(var5.yaw * 4.0F / 360.0F)) & 3;

        if (var7 == 0)
        {
            var1.setData(var2, var3, var4, 2 + var6);
        }

        if (var7 == 1)
        {
            var1.setData(var2, var3, var4, 1 + var6);
        }

        if (var7 == 2)
        {
            var1.setData(var2, var3, var4, 3 + var6);
        }

        if (var7 == 3)
        {
            var1.setData(var2, var3, var4, 0 + var6);
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int getDropData(int var1)
    {
        return var1 != 0 && var1 != 1 && var1 != 2 && var1 != 3 ? (var1 != 4 && var1 != 5 && var1 != 6 && var1 != 7 ? (var1 != 8 && var1 != 9 && var1 != 10 && var1 != 11 ? (var1 != 12 && var1 != 13 && var1 != 14 && var1 != 15 ? var1 : 12) : 8) : 4) : 0;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int getDropData(int var1)
    {
        return var1 != 0 && var1 != 1 && var1 != 2 && var1 != 3 ? (var1 != 4 && var1 != 5 && var1 != 6 && var1 != 7 ? (var1 != 8 && var1 != 9 && var1 != 10 && var1 != 11 ? (var1 != 12 && var1 != 13 && var1 != 14 && var1 != 15 ? var1 : 12) : 8) : 4) : 0;
    }

    /**
     * Adds to the supplied array any colliding bounding boxes with the passed in bounding box. Args: world, x, y, z,
     * axisAlignedBB, arrayList
     */
    public void a(World var1, int var2, int var3, int var4, AxisAlignedBB var5, ArrayList var6)
    {
        int var7 = var1.getData(var2, var3, var4) % 8;

        if (var7 == 0)
        {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.5F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 1)
        {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.a(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 2)
        {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.0F, 0.5F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 3)
        {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.a(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 4)
        {
            this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.5F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 5)
        {
            this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F);
            super.a(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 6)
        {
            this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
        }
        else if (var7 == 7)
        {
            this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.a(var1, var2, var3, var4, var5, var6);
        }

        this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    /**
     * Called upon block activation (left or right click on the block.). The three integers represent x,y,z of the
     * block.
     */
    public boolean interact(World var1, int var2, int var3, int var4, EntityHuman var5)
    {
        int var6 = var1.getTypeId(var2, var3, var4);

        if (var6 == mod_Kaevator_Corners.BlockKaevBlackWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevRedWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevGreenWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevBrownWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevBlueWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevCyanWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevSilverWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevGrayWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevPinkWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevLimeWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevYellowWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.id || var6 == mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.id)
        {
            ItemStack var7 = var5.inventory.getItemInHand();

            if (var7 != null && var7.id == Item.INK_SACK.id)
            {
                int var8 = var1.getData(var2, var3, var4);

                if (var7.getData() == 0 && mod_Kaevator_Corners.BlockKaevBlackWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevBlackWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 1 && mod_Kaevator_Corners.BlockKaevRedWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevRedWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 2 && mod_Kaevator_Corners.BlockKaevGreenWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevGreenWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 3 && mod_Kaevator_Corners.BlockKaevBrownWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevBrownWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 4 && mod_Kaevator_Corners.BlockKaevBlueWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevBlueWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 5 && mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 6 && mod_Kaevator_Corners.BlockKaevCyanWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevCyanWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 7 && mod_Kaevator_Corners.BlockKaevSilverWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevSilverWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 8 && mod_Kaevator_Corners.BlockKaevGrayWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevGrayWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 9 && mod_Kaevator_Corners.BlockKaevPinkWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevPinkWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 10 && mod_Kaevator_Corners.BlockKaevLimeWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevLimeWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 11 && mod_Kaevator_Corners.BlockKaevYellowWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevYellowWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 12 && mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 13 && mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 14 && mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.id, var8);
                    return true;
                }

                if (var7.getData() == 15 && mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.id != Block.STONE.id)
                {
                    var1.setTypeIdAndData(var2, var3, var4, mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.id, var8);
                    return true;
                }
            }
        }

        return false;
    }

    public static int func_21034_c(int var0)
    {
        return var0;
    }

    public static int func_21035_d(int var0)
    {
        return var0;
    }
}
