// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   mod_Kaevator_IntCorners.java

import forge.NetworkMod;
import java.io.File;

public class mod_Kaevator_IntCorners extends NetworkMod
{

    public static void prepareProps()
    {
        props.getInt("Slopes_Opacity", 0);
        props.getInt("BlockKaevWoodIntCorners", 197);
        props.getInt("BlockKaevCobblestoneIntCorners", 198);
        props.getInt("BlockKaevGlassIntCorners", 199);
        props.getInt("BlockKaevSandstoneIntCorners", 200);
        props.getInt("BlockKaevDirtIntCorners", 201);
        props.getInt("BlockKaevStoneIntCorners", 202);
        props.getInt("BlockKaevSandIntCorners", 203);
        props.getInt("BlockKaevSnowIntCorners", 204);
        props.getInt("BlockKaevGrassIntCorners", 205);
        props.getInt("BlockKaevBricksIntCorners", 206);
        props.getInt("BlockKaevGravelIntCorners", 207);
        props.getInt("BlockKaevGoldIntCorners", 208);
        props.getInt("BlockKaevSteelIntCorners", 209);
        props.getInt("BlockKaevObsidianIntCorners", 210);
        props.getInt("BlockKaevDiamondIntCorners", 211);
        props.getInt("BlockKaevWhiteWoolIntCorners", 0);
        props.getInt("BlockKaevBlackWoolIntCorners", 0);
        props.getInt("BlockKaevRedWoolIntCorners", 0);
        props.getInt("BlockKaevGreenWoolIntCorners", 0);
        props.getInt("BlockKaevBrownWoolIntCorners", 0);
        props.getInt("BlockKaevBlueWoolIntCorners", 0);
        props.getInt("BlockKaevPurpleWoolIntCorners", 0);
        props.getInt("BlockKaevCyanWoolIntCorners", 0);
        props.getInt("BlockKaevSilverWoolIntCorners", 0);
        props.getInt("BlockKaevGrayWoolIntCorners", 0);
        props.getInt("BlockKaevPinkWoolIntCorners", 0);
        props.getInt("BlockKaevLimeWoolIntCorners", 0);
        props.getInt("BlockKaevYellowWoolIntCorners", 0);
        props.getInt("BlockKaevLightBlueWoolIntCorners", 0);
        props.getInt("BlockKaevMagentaWoolIntCorners", 0);
        props.getInt("BlockKaevOrangeWoolIntCorners", 0);
    }

    public mod_Kaevator_IntCorners()
    {
        IntCornersRenderID = ModLoader.getUniqueBlockModelID(this, true);
        enableAO = false;
        aoLightValueThis = 0.0F;
        aoLightValueXNeg = 0.0F;
        aoLightValueYNeg = 0.0F;
        aoLightValueZNeg = 0.0F;
        aoLightValueXPos = 0.0F;
        aoLightValueYPos = 0.0F;
        aoLightValueZPos = 0.0F;
        aoLightValueXNegYNegZNeg = 0.0F;
        aoLightValueXNegYNeg = 0.0F;
        aoLightValueXNegYNegZPos = 0.0F;
        aoLightValueYNegZNeg = 0.0F;
        aoLightValueYNegZPos = 0.0F;
        aoLightValueXPosYNegZNeg = 0.0F;
        aoLightValueXPosYNeg = 0.0F;
        aoLightValueXPosYNegZPos = 0.0F;
        aoLightValueXNegYPosZNeg = 0.0F;
        aoLightValueXNegYPos = 0.0F;
        aoLightValueXNegYPosZPos = 0.0F;
        aoLightValueYPosZNeg = 0.0F;
        aoLightValueXPosYPosZNeg = 0.0F;
        aoLightValueXPosYPos = 0.0F;
        aoLightValueYPosZPos = 0.0F;
        aoLightValueXPosYPosZPos = 0.0F;
        aoLightValueXNegZNeg = 0.0F;
        aoLightValueXPosZNeg = 0.0F;
        aoLightValueXNegZPos = 0.0F;
        aoLightValueXPosZPos = 0.0F;
        field_22352_G = 1;
        isBlockYPosZNeg = false;
        isBlockXPosYPos = false;
        isBlockXNegYPos = false;
        isBlockYPosZPos = false;
        isBlockXNegZNeg = false;
        isBlockXPosZPos = false;
        isBlockXNegZPos = false;
        isBlockXPosZNeg = false;
        isBlockYNegZNeg = false;
        isBlockXPosYNeg = false;
        isBlockXNegYNeg = false;
        isBlockYNegZPos = false;
        factorTop = 1.0F;
        factorBottom = 0.5F;
        factorEast = 0.8F;
        factorWest = 0.8F;
        factorNorth = 0.6F;
        factorSouth = 0.6F;
        colorRedTopLeft_TopFace = 0.0F;
        colorRedBottomLeft_TopFace = 0.0F;
        colorRedBottomRight_TopFace = 0.0F;
        colorRedTopRight_TopFace = 0.0F;
        colorGreenTopLeft_TopFace = 0.0F;
        colorGreenBottomLeft_TopFace = 0.0F;
        colorGreenBottomRight_TopFace = 0.0F;
        colorGreenTopRight_TopFace = 0.0F;
        colorBlueTopLeft_TopFace = 0.0F;
        colorBlueBottomLeft_TopFace = 0.0F;
        colorBlueBottomRight_TopFace = 0.0F;
        colorBlueTopRight_TopFace = 0.0F;
        colorRedTopLeft_BottomFace = 0.0F;
        colorRedBottomLeft_BottomFace = 0.0F;
        colorRedBottomRight_BottomFace = 0.0F;
        colorRedTopRight_BottomFace = 0.0F;
        colorGreenTopLeft_BottomFace = 0.0F;
        colorGreenBottomLeft_BottomFace = 0.0F;
        colorGreenBottomRight_BottomFace = 0.0F;
        colorGreenTopRight_BottomFace = 0.0F;
        colorBlueTopLeft_BottomFace = 0.0F;
        colorBlueBottomLeft_BottomFace = 0.0F;
        colorBlueBottomRight_BottomFace = 0.0F;
        colorBlueTopRight_BottomFace = 0.0F;
        colorRedTopLeft_EastFace = 0.0F;
        colorRedBottomLeft_EastFace = 0.0F;
        colorRedBottomRight_EastFace = 0.0F;
        colorRedTopRight_EastFace = 0.0F;
        colorGreenTopLeft_EastFace = 0.0F;
        colorGreenBottomLeft_EastFace = 0.0F;
        colorGreenBottomRight_EastFace = 0.0F;
        colorGreenTopRight_EastFace = 0.0F;
        colorBlueTopLeft_EastFace = 0.0F;
        colorBlueBottomLeft_EastFace = 0.0F;
        colorBlueBottomRight_EastFace = 0.0F;
        colorBlueTopRight_EastFace = 0.0F;
        colorRedTopLeft_WestFace = 0.0F;
        colorRedBottomLeft_WestFace = 0.0F;
        colorRedBottomRight_WestFace = 0.0F;
        colorRedTopRight_WestFace = 0.0F;
        colorGreenTopLeft_WestFace = 0.0F;
        colorGreenBottomLeft_WestFace = 0.0F;
        colorGreenBottomRight_WestFace = 0.0F;
        colorGreenTopRight_WestFace = 0.0F;
        colorBlueTopLeft_WestFace = 0.0F;
        colorBlueBottomLeft_WestFace = 0.0F;
        colorBlueBottomRight_WestFace = 0.0F;
        colorBlueTopRight_WestFace = 0.0F;
        colorRedTopLeft_NorthFace = 0.0F;
        colorRedBottomLeft_NorthFace = 0.0F;
        colorRedBottomRight_NorthFace = 0.0F;
        colorRedTopRight_NorthFace = 0.0F;
        colorGreenTopLeft_NorthFace = 0.0F;
        colorGreenBottomLeft_NorthFace = 0.0F;
        colorGreenBottomRight_NorthFace = 0.0F;
        colorGreenTopRight_NorthFace = 0.0F;
        colorBlueTopLeft_NorthFace = 0.0F;
        colorBlueBottomLeft_NorthFace = 0.0F;
        colorBlueBottomRight_NorthFace = 0.0F;
        colorBlueTopRight_NorthFace = 0.0F;
        colorRedTopLeft_SouthFace = 0.0F;
        colorRedBottomLeft_SouthFace = 0.0F;
        colorRedBottomRight_SouthFace = 0.0F;
        colorRedTopRight_SouthFace = 0.0F;
        colorGreenTopLeft_SouthFace = 0.0F;
        colorGreenBottomLeft_SouthFace = 0.0F;
        colorGreenBottomRight_SouthFace = 0.0F;
        colorGreenTopRight_SouthFace = 0.0F;
        colorBlueTopLeft_SouthFace = 0.0F;
        colorBlueBottomLeft_SouthFace = 0.0F;
        colorBlueBottomRight_SouthFace = 0.0F;
        colorBlueTopRight_SouthFace = 0.0F;
        colorRedSlopes = 0.0F;
        colorGreenSlopes = 0.0F;
        colorBlueSlopes = 0.0F;
        if(props.getInt("BlockKaevWoodIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(vz.x, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevWoodIntCorners
            });
        }
        if(props.getInt("BlockKaevCobblestoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(vz.w, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevCobblestoneIntCorners
            });
        }
        if(props.getInt("BlockKaevGlassIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(vz.M, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGlassIntCorners
            });
        }
        if(props.getInt("BlockKaevSandstoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(vz.Q, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSandstoneIntCorners
            });
        }
        if(props.getInt("BlockKaevDirtIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(vz.v, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevDirtIntCorners
            });
        }
        if(props.getInt("BlockKaevStoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(vz.t, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevStoneIntCorners
            });
        }
        if(props.getInt("BlockKaevSandIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(vz.E, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSandIntCorners
            });
        }
        if(props.getInt("BlockKaevSnowIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(vz.aU, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSnowIntCorners
            });
        }
        if(props.getInt("BlockKaevGrassIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(vz.u, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGrassIntCorners
            });
        }
        if(props.getInt("BlockKaevBricksIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(vz.al, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBricksIntCorners
            });
        }
        if(props.getInt("BlockKaevGravelIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(vz.F, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGravelIntCorners
            });
        }
        if(props.getInt("BlockKaevGoldIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(vz.ah, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGoldIntCorners
            });
        }
        if(props.getInt("BlockKaevSteelIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(vz.ai, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSteelIntCorners
            });
        }
        if(props.getInt("BlockKaevObsidianIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(vz.ap, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevObsidianIntCorners
            });
        }
        if(props.getInt("BlockKaevDiamondIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(vz.ax, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevDiamondIntCorners
            });
        }
        if(props.getInt("BlockKaevWhiteWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
                "  #", "###", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", "  #", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
                "## ", "# #", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
                "# #", "## ", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(vz.ab, 1, 0), new Object[] {
                "#", Character.valueOf('#'), BlockKaevWhiteWoolIntCorners
            });
        }
        if(props.getInt("BlockKaevBlackWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 15), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBlackWoolIntCorners
            });
        if(props.getInt("BlockKaevRedWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 14), new Object[] {
                "#", Character.valueOf('#'), BlockKaevRedWoolIntCorners
            });
        if(props.getInt("BlockKaevGreenWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 13), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGreenWoolIntCorners
            });
        if(props.getInt("BlockKaevBrownWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 12), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBrownWoolIntCorners
            });
        if(props.getInt("BlockKaevBlueWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 11), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBlueWoolIntCorners
            });
        if(props.getInt("BlockKaevPurpleWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 10), new Object[] {
                "#", Character.valueOf('#'), BlockKaevPurpleWoolIntCorners
            });
        if(props.getInt("BlockKaevCyanWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 9), new Object[] {
                "#", Character.valueOf('#'), BlockKaevCyanWoolIntCorners
            });
        if(props.getInt("BlockKaevSilverWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 8), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSilverWoolIntCorners
            });
        if(props.getInt("BlockKaevGrayWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 7), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGrayWoolIntCorners
            });
        if(props.getInt("BlockKaevPinkWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 6), new Object[] {
                "#", Character.valueOf('#'), BlockKaevPinkWoolIntCorners
            });
        if(props.getInt("BlockKaevLimeWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 5), new Object[] {
                "#", Character.valueOf('#'), BlockKaevLimeWoolIntCorners
            });
        if(props.getInt("BlockKaevYellowWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 4), new Object[] {
                "#", Character.valueOf('#'), BlockKaevYellowWoolIntCorners
            });
        if(props.getInt("BlockKaevLightBlueWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 3), new Object[] {
                "#", Character.valueOf('#'), BlockKaevLightBlueWoolIntCorners
            });
        if(props.getInt("BlockKaevMagentaWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 2), new Object[] {
                "#", Character.valueOf('#'), BlockKaevMagentaWoolIntCorners
            });
        if(props.getInt("BlockKaevOrangeWoolIntCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevOrangeWoolIntCorners
            });
    }

    public static File getMinecraftDir()
    {
        return new File(".");
    }

    private static String getAppdata()
    {
        return getMinecraftDir().getPath();
    }

    public String getVersion()
    {
        return "1.2.4 Infi";
    }

    public void load()
    {
    }

    public boolean clientSideRequired()
    {
        return true;
    }

    public boolean serverSideRequired()
    {
        return true;
    }

    public static KrushProps props;
    public static int IntCornersRenderID;
    public static int SlopesOpacity;
    public static final vz BlockKaevWoodIntCorners;
    public static final vz BlockKaevCobblestoneIntCorners;
    public static final vz BlockKaevGlassIntCorners;
    public static final vz BlockKaevSandstoneIntCorners;
    public static final vz BlockKaevDirtIntCorners;
    public static final vz BlockKaevStoneIntCorners;
    public static final vz BlockKaevSandIntCorners;
    public static final vz BlockKaevSnowIntCorners;
    public static final vz BlockKaevGrassIntCorners;
    public static final vz BlockKaevBricksIntCorners;
    public static final vz BlockKaevGravelIntCorners;
    public static final vz BlockKaevGoldIntCorners;
    public static final vz BlockKaevSteelIntCorners;
    public static final vz BlockKaevObsidianIntCorners;
    public static final vz BlockKaevDiamondIntCorners;
    public static final vz BlockKaevWhiteWoolIntCorners;
    public static final vz BlockKaevBlackWoolIntCorners;
    public static final vz BlockKaevRedWoolIntCorners;
    public static final vz BlockKaevGreenWoolIntCorners;
    public static final vz BlockKaevBrownWoolIntCorners;
    public static final vz BlockKaevBlueWoolIntCorners;
    public static final vz BlockKaevPurpleWoolIntCorners;
    public static final vz BlockKaevCyanWoolIntCorners;
    public static final vz BlockKaevSilverWoolIntCorners;
    public static final vz BlockKaevGrayWoolIntCorners;
    public static final vz BlockKaevPinkWoolIntCorners;
    public static final vz BlockKaevLimeWoolIntCorners;
    public static final vz BlockKaevYellowWoolIntCorners;
    public static final vz BlockKaevLightBlueWoolIntCorners;
    public static final vz BlockKaevMagentaWoolIntCorners;
    public static final vz BlockKaevOrangeWoolIntCorners;
    public static id ItemKaevWoodIntCorners;
    public static id ItemKaevCobblestoneIntCorners;
    public static id ItemKaevGlassIntCorners;
    public static id ItemKaevSandstoneIntCorners;
    public static id ItemKaevDirtIntCorners;
    public static id ItemKaevStoneIntCorners;
    public static id ItemKaevSandIntCorners;
    public static id ItemKaevSnowIntCorners;
    public static id ItemKaevGrassIntCorners;
    public static id ItemKaevBricksIntCorners;
    public static id ItemKaevGravelIntCorners;
    public static id ItemKaevGoldIntCorners;
    public static id ItemKaevSteelIntCorners;
    public static id ItemKaevObsidianIntCorners;
    public static id ItemKaevDiamondIntCorners;
    public static id ItemKaevWhiteWoolIntCorners;
    public static id ItemKaevBlackWoolIntCorners;
    public static id ItemKaevRedWoolIntCorners;
    public static id ItemKaevGreenWoolIntCorners;
    public static id ItemKaevBrownWoolIntCorners;
    public static id ItemKaevBlueWoolIntCorners;
    public static id ItemKaevPurpleWoolIntCorners;
    public static id ItemKaevCyanWoolIntCorners;
    public static id ItemKaevSilverWoolIntCorners;
    public static id ItemKaevGrayWoolIntCorners;
    public static id ItemKaevPinkWoolIntCorners;
    public static id ItemKaevLimeWoolIntCorners;
    public static id ItemKaevYellowWoolIntCorners;
    public static id ItemKaevLightBlueWoolIntCorners;
    public static id ItemKaevMagentaWoolIntCorners;
    public static id ItemKaevOrangeWoolIntCorners;
    public static boolean field_27406_a = true;
    public static boolean field_27511_cfgGrassFix = true;
    public boolean enableAO;
    public float aoLightValueThis;
    public float aoLightValueXNeg;
    public float aoLightValueYNeg;
    public float aoLightValueZNeg;
    public float aoLightValueXPos;
    public float aoLightValueYPos;
    public float aoLightValueZPos;
    public float aoLightValueXNegYNegZNeg;
    public float aoLightValueXNegYNeg;
    public float aoLightValueXNegYNegZPos;
    public float aoLightValueYNegZNeg;
    public float aoLightValueYNegZPos;
    public float aoLightValueXPosYNegZNeg;
    public float aoLightValueXPosYNeg;
    public float aoLightValueXPosYNegZPos;
    public float aoLightValueXNegYPosZNeg;
    public float aoLightValueXNegYPos;
    public float aoLightValueXNegYPosZPos;
    public float aoLightValueYPosZNeg;
    public float aoLightValueXPosYPosZNeg;
    public float aoLightValueXPosYPos;
    public float aoLightValueYPosZPos;
    public float aoLightValueXPosYPosZPos;
    public float aoLightValueXNegZNeg;
    public float aoLightValueXPosZNeg;
    public float aoLightValueXNegZPos;
    public float aoLightValueXPosZPos;
    public int field_22352_G;
    public boolean isBlockYPosZNeg;
    public boolean isBlockXPosYPos;
    public boolean isBlockXNegYPos;
    public boolean isBlockYPosZPos;
    public boolean isBlockXNegZNeg;
    public boolean isBlockXPosZPos;
    public boolean isBlockXNegZPos;
    public boolean isBlockXPosZNeg;
    public boolean isBlockYNegZNeg;
    public boolean isBlockXPosYNeg;
    public boolean isBlockXNegYNeg;
    public boolean isBlockYNegZPos;
    public int field_27510_blockX;
    public int field_27509_blockY;
    public int field_27508_blockZ;
    public float factorTop;
    public float factorBottom;
    public float factorEast;
    public float factorWest;
    public float factorNorth;
    public float factorSouth;
    public float colorRedTopLeft_TopFace;
    public float colorRedBottomLeft_TopFace;
    public float colorRedBottomRight_TopFace;
    public float colorRedTopRight_TopFace;
    public float colorGreenTopLeft_TopFace;
    public float colorGreenBottomLeft_TopFace;
    public float colorGreenBottomRight_TopFace;
    public float colorGreenTopRight_TopFace;
    public float colorBlueTopLeft_TopFace;
    public float colorBlueBottomLeft_TopFace;
    public float colorBlueBottomRight_TopFace;
    public float colorBlueTopRight_TopFace;
    public float colorRedTopLeft_BottomFace;
    public float colorRedBottomLeft_BottomFace;
    public float colorRedBottomRight_BottomFace;
    public float colorRedTopRight_BottomFace;
    public float colorGreenTopLeft_BottomFace;
    public float colorGreenBottomLeft_BottomFace;
    public float colorGreenBottomRight_BottomFace;
    public float colorGreenTopRight_BottomFace;
    public float colorBlueTopLeft_BottomFace;
    public float colorBlueBottomLeft_BottomFace;
    public float colorBlueBottomRight_BottomFace;
    public float colorBlueTopRight_BottomFace;
    public float colorRedTopLeft_EastFace;
    public float colorRedBottomLeft_EastFace;
    public float colorRedBottomRight_EastFace;
    public float colorRedTopRight_EastFace;
    public float colorGreenTopLeft_EastFace;
    public float colorGreenBottomLeft_EastFace;
    public float colorGreenBottomRight_EastFace;
    public float colorGreenTopRight_EastFace;
    public float colorBlueTopLeft_EastFace;
    public float colorBlueBottomLeft_EastFace;
    public float colorBlueBottomRight_EastFace;
    public float colorBlueTopRight_EastFace;
    public float colorRedTopLeft_WestFace;
    public float colorRedBottomLeft_WestFace;
    public float colorRedBottomRight_WestFace;
    public float colorRedTopRight_WestFace;
    public float colorGreenTopLeft_WestFace;
    public float colorGreenBottomLeft_WestFace;
    public float colorGreenBottomRight_WestFace;
    public float colorGreenTopRight_WestFace;
    public float colorBlueTopLeft_WestFace;
    public float colorBlueBottomLeft_WestFace;
    public float colorBlueBottomRight_WestFace;
    public float colorBlueTopRight_WestFace;
    public float colorRedTopLeft_NorthFace;
    public float colorRedBottomLeft_NorthFace;
    public float colorRedBottomRight_NorthFace;
    public float colorRedTopRight_NorthFace;
    public float colorGreenTopLeft_NorthFace;
    public float colorGreenBottomLeft_NorthFace;
    public float colorGreenBottomRight_NorthFace;
    public float colorGreenTopRight_NorthFace;
    public float colorBlueTopLeft_NorthFace;
    public float colorBlueBottomLeft_NorthFace;
    public float colorBlueBottomRight_NorthFace;
    public float colorBlueTopRight_NorthFace;
    public float colorRedTopLeft_SouthFace;
    public float colorRedBottomLeft_SouthFace;
    public float colorRedBottomRight_SouthFace;
    public float colorRedTopRight_SouthFace;
    public float colorGreenTopLeft_SouthFace;
    public float colorGreenBottomLeft_SouthFace;
    public float colorGreenBottomRight_SouthFace;
    public float colorGreenTopRight_SouthFace;
    public float colorBlueTopLeft_SouthFace;
    public float colorBlueBottomLeft_SouthFace;
    public float colorBlueBottomRight_SouthFace;
    public float colorBlueTopRight_SouthFace;
    public float colorRedSlopes;
    public float colorGreenSlopes;
    public float colorBlueSlopes;

    static 
    {
        props = new KrushProps((new File((new StringBuilder()).append(getAppdata()).append("/config/KaevatorSuperSlopes.props").toString())).getPath());
        prepareProps();
        SlopesOpacity = props.getInt("Slopes_Opacity");
        if(props.getInt("BlockKaevWoodIntCorners") != 0)
        {
            BlockKaevWoodIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevWoodIntCorners"), 4, na.d)).c(2.0F).a(vz.e).b(5F).a("BlockKaevWoodIntCorners");
            ItemKaevWoodIntCorners = (new ItemIntCorners_Kaevator(BlockKaevWoodIntCorners.bO - 256, "Wood")).a("ItemKaevWoodIntCorners");
        } else
        {
            BlockKaevWoodIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevCobblestoneIntCorners") != 0)
        {
            BlockKaevCobblestoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevCobblestoneIntCorners"), 16, na.e)).c(2.0F).a(vz.h).b(10F).a("BlockKaevCobblestoneIntCorners");
            ItemKaevCobblestoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevCobblestoneIntCorners.bO - 256, "Cobblestone")).a("ItemKaevCobblestoneIntCorners");
        } else
        {
            BlockKaevCobblestoneIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevGlassIntCorners") != 0)
        {
            BlockKaevGlassIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGlassIntCorners"), 49, na.q)).c(0.3F).a(vz.j).a("BlockKaevGlassIntCorners");
            ItemKaevGlassIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGlassIntCorners.bO - 256, "Glass")).a("ItemKaevGlassIntCorners");
        } else
        {
            BlockKaevGlassIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevSandstoneIntCorners") != 0)
        {
            BlockKaevSandstoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSandstoneIntCorners"), 192, na.e)).c(0.8F).a(vz.h).a("BlockKaevSandstoneIntCorners");
            ItemKaevSandstoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSandstoneIntCorners.bO - 256, "Sandstone")).a("ItemKaevSandstoneIntCorners");
        } else
        {
            BlockKaevSandstoneIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevDirtIntCorners") != 0)
        {
            BlockKaevDirtIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevDirtIntCorners"), 2, na.c)).c(0.5F).a(vz.f).a("BlockKaevDirtIntCorners");
            ItemKaevDirtIntCorners = (new ItemIntCorners_Kaevator(BlockKaevDirtIntCorners.bO - 256, "Dirt")).a("ItemKaevDirtIntCorners");
        } else
        {
            BlockKaevDirtIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevStoneIntCorners") != 0)
        {
            BlockKaevStoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevStoneIntCorners"), 1, na.e)).c(1.5F).a(vz.h).b(10F).a("BlockKaevStoneIntCorners");
            ItemKaevStoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevStoneIntCorners.bO - 256, "Stone")).a("ItemKaevStoneIntCorners");
        } else
        {
            BlockKaevStoneIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevSandIntCorners") != 0)
        {
            BlockKaevSandIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSandIntCorners"), 18, na.o)).c(0.5F).a(vz.l).a("BlockKaevSandIntCorners");
            ItemKaevSandIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSandIntCorners.bO - 256, "Sand")).a("ItemKaevSandIntCorners");
        } else
        {
            BlockKaevSandIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevSnowIntCorners") != 0)
        {
            BlockKaevSnowIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSnowIntCorners"), 66, na.v)).c(0.1F).a(vz.k).a("BlockKaevSnowIntCorners");
            ItemKaevSnowIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSnowIntCorners.bO - 256, "Snow")).a("ItemKaevSnowIntCorners");
        } else
        {
            BlockKaevSnowIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevGrassIntCorners") != 0)
        {
            BlockKaevGrassIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGrassIntCorners"), 3, na.c)).c(0.6F).a(vz.g).a("BlockKaevGrassIntCorners");
            ItemKaevGrassIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGrassIntCorners.bO - 256, "Grass")).a("ItemKaevGrassIntCorners");
        } else
        {
            BlockKaevGrassIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevBricksIntCorners") != 0)
        {
            BlockKaevBricksIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBricksIntCorners"), 7, na.e)).c(2.0F).a(vz.h).b(10F).a("BlockKaevBricksIntCorners");
            ItemKaevBricksIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBricksIntCorners.bO - 256, "Bricks")).a("ItemKaevBricksIntCorners");
        } else
        {
            BlockKaevBricksIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevGravelIntCorners") != 0)
        {
            BlockKaevGravelIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGravelIntCorners"), 19, na.o)).c(0.6F).a(vz.f).a("BlockKaevGravelIntCorners");
            ItemKaevGravelIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGravelIntCorners.bO - 256, "Gravel")).a("ItemKaevGravelIntCorners");
        } else
        {
            BlockKaevGravelIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevGoldIntCorners") != 0)
        {
            BlockKaevGoldIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGoldIntCorners"), 23, na.f)).c(3F).a(vz.i).b(10F).a("BlockKaevGoldIntCorners");
            ItemKaevGoldIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGoldIntCorners.bO - 256, "Gold")).a("ItemKaevGoldIntCorners");
        } else
        {
            BlockKaevGoldIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevSteelIntCorners") != 0)
        {
            BlockKaevSteelIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSteelIntCorners"), 22, na.f)).c(5F).a(vz.i).b(10F).a("BlockKaevSteelIntCorners");
            ItemKaevSteelIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSteelIntCorners.bO - 256, "Steel")).a("ItemKaevSteelIntCorners");
        } else
        {
            BlockKaevSteelIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevObsidianIntCorners") != 0)
        {
            BlockKaevObsidianIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevObsidianIntCorners"), 37, na.e)).c(10F).a(vz.h).b(2000F).a("BlockKaevObsidianIntCorners");
            ItemKaevObsidianIntCorners = (new ItemIntCorners_Kaevator(BlockKaevObsidianIntCorners.bO - 256, "Obsidian")).a("ItemKaevObsidianIntCorners");
        } else
        {
            BlockKaevObsidianIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevDiamondIntCorners") != 0)
        {
            BlockKaevDiamondIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevDiamondIntCorners"), 24, na.f)).c(5F).a(vz.i).b(10F).a("BlockKaevDiamondIntCorners");
            ItemKaevDiamondIntCorners = (new ItemIntCorners_Kaevator(BlockKaevDiamondIntCorners.bO - 256, "Diamond")).a("ItemKaevDiamondIntCorners");
        } else
        {
            BlockKaevDiamondIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevWhiteWoolIntCorners") != 0)
        {
            BlockKaevWhiteWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevWhiteWoolIntCorners", 212), 64, na.m)).c(1.0F).a(vz.k).a("BlockKaevWhiteWoolIntCorners");
            ItemKaevWhiteWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevWhiteWoolIntCorners.bO - 256, "WhiteWool")).a("ItemKaevWhiteWoolIntCorners");
        } else
        {
            BlockKaevWhiteWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevBlackWoolIntCorners") != 0)
        {
            BlockKaevBlackWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBlackWoolIntCorners", 213), 113, na.m)).c(1.0F).a(vz.k).a("BlockKaevBlackWoolIntCorners");
            ItemKaevBlackWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBlackWoolIntCorners.bO - 256, "BlackWool")).a("ItemKaevBlackWoolIntCorners");
        } else
        {
            BlockKaevBlackWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevRedWoolIntCorners") != 0)
        {
            BlockKaevRedWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevRedWoolIntCorners", 214), 129, na.m)).c(1.0F).a(vz.k).a("BlockKaevRedWoolIntCorners");
            ItemKaevRedWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevRedWoolIntCorners.bO - 256, "RedWool")).a("ItemKaevRedWoolIntCorners");
        } else
        {
            BlockKaevRedWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevGreenWoolIntCorners") != 0)
        {
            BlockKaevGreenWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGreenWoolIntCorners", 215), 145, na.m)).c(1.0F).a(vz.k).a("BlockKaevGreenWoolIntCorners");
            ItemKaevGreenWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGreenWoolIntCorners.bO - 256, "GreenWool")).a("ItemKaevGreenWoolIntCorners");
        } else
        {
            BlockKaevGreenWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevBrownWoolIntCorners") != 0)
        {
            BlockKaevBrownWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBrownWoolIntCorners", 216), 161, na.m)).c(1.0F).a(vz.k).a("BlockKaevBrownWoolIntCorners");
            ItemKaevBrownWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBrownWoolIntCorners.bO - 256, "BrownWool")).a("ItemKaevBrownWoolIntCorners");
        } else
        {
            BlockKaevBrownWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevBlueWoolIntCorners") != 0)
        {
            BlockKaevBlueWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBlueWoolIntCorners", 217), 177, na.m)).c(1.0F).a(vz.k).a("BlockKaevBlueWoolIntCorners");
            ItemKaevBlueWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBlueWoolIntCorners.bO - 256, "BlueWool")).a("ItemKaevBlueWoolIntCorners");
        } else
        {
            BlockKaevBlueWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevPurpleWoolIntCorners") != 0)
        {
            BlockKaevPurpleWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevPurpleWoolIntCorners", 218), 193, na.m)).c(1.0F).a(vz.k).a("BlockKaevPurpleWoolIntCorners");
            ItemKaevPurpleWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevPurpleWoolIntCorners.bO - 256, "PurpleWool")).a("ItemKaevPurpleWoolIntCorners");
        } else
        {
            BlockKaevPurpleWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevCyanWoolIntCorners") != 0)
        {
            BlockKaevCyanWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevCyanWoolIntCorners", 219), 209, na.m)).c(1.0F).a(vz.k).a("BlockKaevCyanWoolIntCorners");
            ItemKaevCyanWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevCyanWoolIntCorners.bO - 256, "CyanWool")).a("ItemKaevCyanWoolIntCorners");
        } else
        {
            BlockKaevCyanWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevSilverWoolIntCorners") != 0)
        {
            BlockKaevSilverWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSilverWoolIntCorners", 220), 225, na.m)).c(1.0F).a(vz.k).a("BlockKaevSilverWoolIntCorners");
            ItemKaevSilverWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSilverWoolIntCorners.bO - 256, "SilverWool")).a("ItemKaevSilverWoolIntCorners");
        } else
        {
            BlockKaevSilverWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevGrayWoolIntCorners") != 0)
        {
            BlockKaevGrayWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGrayWoolIntCorners", 221), 114, na.m)).c(1.0F).a(vz.k).a("BlockKaevGrayWoolIntCorners");
            ItemKaevGrayWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGrayWoolIntCorners.bO - 256, "GrayWool")).a("ItemKaevGrayWoolIntCorners");
        } else
        {
            BlockKaevGrayWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevPinkWoolIntCorners") != 0)
        {
            BlockKaevPinkWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevPinkWoolIntCorners", 222), 130, na.m)).c(1.0F).a(vz.k).a("BlockKaevPinkWoolIntCorners");
            ItemKaevPinkWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevPinkWoolIntCorners.bO - 256, "PinkWool")).a("ItemKaevPinkWoolIntCorners");
        } else
        {
            BlockKaevPinkWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevLimeWoolIntCorners") != 0)
        {
            BlockKaevLimeWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevLimeWoolIntCorners", 223), 146, na.m)).c(1.0F).a(vz.k).a("BlockKaevLimeWoolIntCorners");
            ItemKaevLimeWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevLimeWoolIntCorners.bO - 256, "LimeWool")).a("ItemKaevLimeWoolIntCorners");
        } else
        {
            BlockKaevLimeWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevYellowWoolIntCorners") != 0)
        {
            BlockKaevYellowWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevYellowWoolIntCorners", 224), 162, na.m)).c(1.0F).a(vz.k).a("BlockKaevYellowWoolIntCorners");
            ItemKaevYellowWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevYellowWoolIntCorners.bO - 256, "YellowWool")).a("ItemKaevYellowWoolIntCorners");
        } else
        {
            BlockKaevYellowWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevLightBlueWoolIntCorners") != 0)
        {
            BlockKaevLightBlueWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevLightBlueWoolIntCorners", 225), 178, na.m)).c(1.0F).a(vz.k).a("BlockKaevLightBlueWoolIntCorners");
            ItemKaevLightBlueWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevLightBlueWoolIntCorners.bO - 256, "LightBlueWool")).a("ItemKaevLightBlueWoolIntCorners");
        } else
        {
            BlockKaevLightBlueWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevMagentaWoolIntCorners") != 0)
        {
            BlockKaevMagentaWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevMagentaWoolIntCorners", 226), 194, na.m)).c(1.0F).a(vz.k).a("BlockKaevMagentaWoolIntCorners");
            ItemKaevMagentaWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevMagentaWoolIntCorners.bO - 256, "MagentaWool")).a("ItemKaevMagentaWoolIntCorners");
        } else
        {
            BlockKaevMagentaWoolIntCorners = vz.t;
        }
        if(props.getInt("BlockKaevOrangeWoolIntCorners") != 0)
        {
            BlockKaevOrangeWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevOrangeWoolIntCorners", 227), 210, na.m)).c(1.0F).a(vz.k).a("BlockKaevOrangeWoolIntCorners");
            ItemKaevOrangeWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevOrangeWoolIntCorners.bO - 256, "OrangeWool")).a("ItemKaevOrangeWoolIntCorners");
        } else
        {
            BlockKaevOrangeWoolIntCorners = vz.t;
        }
        props.save();
    }
}
