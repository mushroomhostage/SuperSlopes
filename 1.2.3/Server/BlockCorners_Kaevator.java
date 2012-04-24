// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BlockCorners_Kaevator.java

import java.util.ArrayList;

public class BlockCorners_Kaevator extends vz
{

    protected BlockCorners_Kaevator(int i, int j, na material)
    {
        super(i, j, material);
        f(mod_Kaevator_Corners.SlopesOpacity);
    }

    public int c()
    {
        return mod_Kaevator_Corners.CornersRenderID;
    }

    public boolean a()
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }

    public boolean shouldSideBeRendered(zy iblockaccess, int i, int j, int i1, int j1)
    {
        return true;
    }

    public void a(ge world, int i, int j, int k, ne entityliving)
    {
        int oldmeta = world.c(i, j, k);
        int l = kb.b((entityliving.bs * 4F) / 360F) & 3;
        if(l == 0)
            world.c(i, j, k, 2 + oldmeta);
        if(l == 1)
            world.c(i, j, k, 1 + oldmeta);
        if(l == 2)
            world.c(i, j, k, 3 + oldmeta);
        if(l == 3)
            world.c(i, j, k, 0 + oldmeta);
    }

    protected int func_21025_b(int i)
    {
        if(i == 0 || i == 1 || i == 2 || i == 3)
            return 0;
        if(i == 4 || i == 5 || i == 6 || i == 7)
            return 4;
        if(i == 8 || i == 9 || i == 10 || i == 11)
            return 8;
        if(i == 12 || i == 13 || i == 14 || i == 15)
            return 12;
        else
            return i;
    }

    protected int c(int i)
    {
        if(i == 0 || i == 1 || i == 2 || i == 3)
            return 0;
        if(i == 4 || i == 5 || i == 6 || i == 7)
            return 4;
        if(i == 8 || i == 9 || i == 10 || i == 11)
            return 8;
        if(i == 12 || i == 13 || i == 14 || i == 15)
            return 12;
        else
            return i;
    }

    public void a(ge world, int i, int j, int k, fp axisalignedbb, ArrayList arraylist)
    {
        int l = world.c(i, j, k) % 8;
        if(l == 0)
        {
            a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
            a(0.5F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 1)
        {
            a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
            a(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 2)
        {
            a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
            a(0.0F, 0.5F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 3)
        {
            a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
            a(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 4)
        {
            a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
            a(0.5F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 5)
        {
            a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
            a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 6)
        {
            a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
            a(0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 7)
        {
            a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
            a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.a(world, i, j, k, axisalignedbb, arraylist);
        }
        a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public boolean a(ge world, int i, int j, int k, ih entityplayer)
    {
        int lCurrentID = world.a(i, j, k);
        if(lCurrentID == mod_Kaevator_Corners.BlockKaevBlackWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevRedWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevGreenWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevBrownWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevBlueWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevCyanWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevSilverWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevGrayWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevPinkWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevLimeWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevYellowWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.bO || lCurrentID == mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.bO)
        {
            kp itemstack = entityplayer.k.d();
            if(itemstack != null && itemstack.c == id.aV.bP)
            {
                int lOldMeta = world.c(i, j, k);
                if(itemstack.h() == 0 && mod_Kaevator_Corners.BlockKaevBlackWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevBlackWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 1 && mod_Kaevator_Corners.BlockKaevRedWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevRedWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 2 && mod_Kaevator_Corners.BlockKaevGreenWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevGreenWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 3 && mod_Kaevator_Corners.BlockKaevBrownWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevBrownWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 4 && mod_Kaevator_Corners.BlockKaevBlueWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevBlueWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 5 && mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 6 && mod_Kaevator_Corners.BlockKaevCyanWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevCyanWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 7 && mod_Kaevator_Corners.BlockKaevSilverWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevSilverWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 8 && mod_Kaevator_Corners.BlockKaevGrayWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevGrayWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 9 && mod_Kaevator_Corners.BlockKaevPinkWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevPinkWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 10 && mod_Kaevator_Corners.BlockKaevLimeWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevLimeWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 11 && mod_Kaevator_Corners.BlockKaevYellowWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevYellowWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 12 && mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 13 && mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 14 && mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 15 && mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.bO, lOldMeta);
                    return true;
                }
            }
        }
        return false;
    }

    public static int func_21034_c(int i)
    {
        return i;
    }

    public static int func_21035_d(int i)
    {
        return i;
    }
}
