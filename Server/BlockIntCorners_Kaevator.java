// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BlockIntCorners_Kaevator.java

import java.util.ArrayList;

public class BlockIntCorners_Kaevator extends vz
{

    protected BlockIntCorners_Kaevator(int i, int j, na material)
    {
        super(i, j, material);
        f(mod_Kaevator_IntCorners.SlopesOpacity);
    }

    public int c()
    {
        return mod_Kaevator_IntCorners.IntCornersRenderID;
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
        if(lCurrentID == mod_Kaevator_IntCorners.BlockKaevBlackWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevRedWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevGreenWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevBrownWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevBlueWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevPurpleWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevCyanWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevSilverWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevGrayWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevPinkWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevLimeWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevYellowWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevLightBlueWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevMagentaWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevOrangeWoolIntCorners.bO || lCurrentID == mod_Kaevator_IntCorners.BlockKaevWhiteWoolIntCorners.bO)
        {
            kp itemstack = entityplayer.k.d();
            if(itemstack != null && itemstack.c == id.aV.bP)
            {
                int lOldMeta = world.c(i, j, k);
                if(itemstack.h() == 0 && mod_Kaevator_IntCorners.BlockKaevBlackWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevBlackWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 1 && mod_Kaevator_IntCorners.BlockKaevRedWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevRedWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 2 && mod_Kaevator_IntCorners.BlockKaevGreenWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevGreenWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 3 && mod_Kaevator_IntCorners.BlockKaevBrownWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevBrownWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 4 && mod_Kaevator_IntCorners.BlockKaevBlueWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevBlueWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 5 && mod_Kaevator_IntCorners.BlockKaevPurpleWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevPurpleWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 6 && mod_Kaevator_IntCorners.BlockKaevCyanWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevCyanWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 7 && mod_Kaevator_IntCorners.BlockKaevSilverWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevSilverWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 8 && mod_Kaevator_IntCorners.BlockKaevGrayWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevGrayWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 9 && mod_Kaevator_IntCorners.BlockKaevPinkWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevPinkWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 10 && mod_Kaevator_IntCorners.BlockKaevLimeWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevLimeWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 11 && mod_Kaevator_IntCorners.BlockKaevYellowWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevYellowWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 12 && mod_Kaevator_IntCorners.BlockKaevLightBlueWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevLightBlueWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 13 && mod_Kaevator_IntCorners.BlockKaevMagentaWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevMagentaWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 14 && mod_Kaevator_IntCorners.BlockKaevOrangeWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevOrangeWoolIntCorners.bO, lOldMeta);
                    return true;
                }
                if(itemstack.h() == 15 && mod_Kaevator_IntCorners.BlockKaevWhiteWoolIntCorners.bO != vz.t.bO)
                {
                    world.b(i, j, k, mod_Kaevator_IntCorners.BlockKaevWhiteWoolIntCorners.bO, lOldMeta);
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
