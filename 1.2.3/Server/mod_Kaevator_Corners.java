// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   mod_Kaevator_Corners.java

import forge.NetworkMod;
import java.io.File;

public class mod_Kaevator_Corners extends NetworkMod
{

    public static void prepareProps()
    {
        props.getInt("Slopes_Opacity", 0);
        props.getInt("BlockKaevWoodCorners", 182);
        props.getInt("BlockKaevCobblestoneCorners", 183);
        props.getInt("BlockKaevGlassCorners", 184);
        props.getInt("BlockKaevSandstoneCorners", 185);
        props.getInt("BlockKaevDirtCorners", 186);
        props.getInt("BlockKaevStoneCorners", 187);
        props.getInt("BlockKaevSandCorners", 188);
        props.getInt("BlockKaevSnowCorners", 189);
        props.getInt("BlockKaevGrassCorners", 190);
        props.getInt("BlockKaevBricksCorners", 191);
        props.getInt("BlockKaevGravelCorners", 192);
        props.getInt("BlockKaevGoldCorners", 193);
        props.getInt("BlockKaevSteelCorners", 194);
        props.getInt("BlockKaevObsidianCorners", 195);
        props.getInt("BlockKaevDiamondCorners", 196);
        props.getInt("BlockKaevWhiteWoolCorners", 0);
        props.getInt("BlockKaevBlackWoolCorners", 0);
        props.getInt("BlockKaevRedWoolCorners", 0);
        props.getInt("BlockKaevGreenWoolCorners", 0);
        props.getInt("BlockKaevBrownWoolCorners", 0);
        props.getInt("BlockKaevBlueWoolCorners", 0);
        props.getInt("BlockKaevPurpleWoolCorners", 0);
        props.getInt("BlockKaevCyanWoolCorners", 0);
        props.getInt("BlockKaevSilverWoolCorners", 0);
        props.getInt("BlockKaevGrayWoolCorners", 0);
        props.getInt("BlockKaevPinkWoolCorners", 0);
        props.getInt("BlockKaevLimeWoolCorners", 0);
        props.getInt("BlockKaevYellowWoolCorners", 0);
        props.getInt("BlockKaevLightBlueWoolCorners", 0);
        props.getInt("BlockKaevMagentaWoolCorners", 0);
        props.getInt("BlockKaevOrangeWoolCorners", 0);
    }

    public mod_Kaevator_Corners()
    {
        CornersRenderID = ModLoader.getUniqueBlockModelID(this, true);
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
        if(props.getInt("BlockKaevWoodCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(vz.x, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevWoodCorners
            });
        }
        if(props.getInt("BlockKaevCobblestoneCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(vz.w, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevCobblestoneCorners
            });
        }
        if(props.getInt("BlockKaevGlassCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(vz.M, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGlassCorners
            });
        }
        if(props.getInt("BlockKaevSandstoneCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(vz.Q, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSandstoneCorners
            });
        }
        if(props.getInt("BlockKaevDirtCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(vz.v, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevDirtCorners
            });
        }
        if(props.getInt("BlockKaevStoneCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(vz.t, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevStoneCorners
            });
        }
        if(props.getInt("BlockKaevSandCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(vz.E, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSandCorners
            });
        }
        if(props.getInt("BlockKaevSnowCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(vz.aU, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSnowCorners
            });
        }
        if(props.getInt("BlockKaevGrassCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(vz.u, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGrassCorners
            });
        }
        if(props.getInt("BlockKaevBricksCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(vz.al, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBricksCorners
            });
        }
        if(props.getInt("BlockKaevGravelCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(vz.F, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGravelCorners
            });
        }
        if(props.getInt("BlockKaevGoldCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(vz.ah, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGoldCorners
            });
        }
        if(props.getInt("BlockKaevSteelCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(vz.ai, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSteelCorners
            });
        }
        if(props.getInt("BlockKaevObsidianCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(vz.ap, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevObsidianCorners
            });
        }
        if(props.getInt("BlockKaevDiamondCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(vz.ax, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevDiamondCorners
            });
        }
        if(props.getInt("BlockKaevWhiteWoolCorners") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
                " # ", "###", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
                "###", " # ", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
                " # ", " # ", "###", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
                "###", " # ", " # ", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(vz.ab, 1, 0), new Object[] {
                "#", Character.valueOf('#'), BlockKaevWhiteWoolCorners
            });
        }
        if(props.getInt("BlockKaevBlackWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 15), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBlackWoolCorners
            });
        if(props.getInt("BlockKaevRedWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 14), new Object[] {
                "#", Character.valueOf('#'), BlockKaevRedWoolCorners
            });
        if(props.getInt("BlockKaevGreenWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 13), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGreenWoolCorners
            });
        if(props.getInt("BlockKaevBrownWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 12), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBrownWoolCorners
            });
        if(props.getInt("BlockKaevBlueWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 11), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBlueWoolCorners
            });
        if(props.getInt("BlockKaevPurpleWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 10), new Object[] {
                "#", Character.valueOf('#'), BlockKaevPurpleWoolCorners
            });
        if(props.getInt("BlockKaevCyanWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 9), new Object[] {
                "#", Character.valueOf('#'), BlockKaevCyanWoolCorners
            });
        if(props.getInt("BlockKaevSilverWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 8), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSilverWoolCorners
            });
        if(props.getInt("BlockKaevGrayWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 7), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGrayWoolCorners
            });
        if(props.getInt("BlockKaevPinkWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 6), new Object[] {
                "#", Character.valueOf('#'), BlockKaevPinkWoolCorners
            });
        if(props.getInt("BlockKaevLimeWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 5), new Object[] {
                "#", Character.valueOf('#'), BlockKaevLimeWoolCorners
            });
        if(props.getInt("BlockKaevYellowWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 4), new Object[] {
                "#", Character.valueOf('#'), BlockKaevYellowWoolCorners
            });
        if(props.getInt("BlockKaevLightBlueWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 3), new Object[] {
                "#", Character.valueOf('#'), BlockKaevLightBlueWoolCorners
            });
        if(props.getInt("BlockKaevMagentaWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 2), new Object[] {
                "#", Character.valueOf('#'), BlockKaevMagentaWoolCorners
            });
        if(props.getInt("BlockKaevOrangeWoolCorners") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevOrangeWoolCorners
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
    public static int CornersRenderID;
    public static int SlopesOpacity;
    public static final vz BlockKaevWoodCorners;
    public static final vz BlockKaevCobblestoneCorners;
    public static final vz BlockKaevGlassCorners;
    public static final vz BlockKaevSandstoneCorners;
    public static final vz BlockKaevDirtCorners;
    public static final vz BlockKaevStoneCorners;
    public static final vz BlockKaevSandCorners;
    public static final vz BlockKaevSnowCorners;
    public static final vz BlockKaevGrassCorners;
    public static final vz BlockKaevBricksCorners;
    public static final vz BlockKaevGravelCorners;
    public static final vz BlockKaevGoldCorners;
    public static final vz BlockKaevSteelCorners;
    public static final vz BlockKaevObsidianCorners;
    public static final vz BlockKaevDiamondCorners;
    public static final vz BlockKaevWhiteWoolCorners;
    public static final vz BlockKaevBlackWoolCorners;
    public static final vz BlockKaevRedWoolCorners;
    public static final vz BlockKaevGreenWoolCorners;
    public static final vz BlockKaevBrownWoolCorners;
    public static final vz BlockKaevBlueWoolCorners;
    public static final vz BlockKaevPurpleWoolCorners;
    public static final vz BlockKaevCyanWoolCorners;
    public static final vz BlockKaevSilverWoolCorners;
    public static final vz BlockKaevGrayWoolCorners;
    public static final vz BlockKaevPinkWoolCorners;
    public static final vz BlockKaevLimeWoolCorners;
    public static final vz BlockKaevYellowWoolCorners;
    public static final vz BlockKaevLightBlueWoolCorners;
    public static final vz BlockKaevMagentaWoolCorners;
    public static final vz BlockKaevOrangeWoolCorners;
    public static id ItemKaevWoodCorners;
    public static id ItemKaevCobblestoneCorners;
    public static id ItemKaevGlassCorners;
    public static id ItemKaevSandstoneCorners;
    public static id ItemKaevDirtCorners;
    public static id ItemKaevStoneCorners;
    public static id ItemKaevSandCorners;
    public static id ItemKaevSnowCorners;
    public static id ItemKaevGrassCorners;
    public static id ItemKaevBricksCorners;
    public static id ItemKaevGravelCorners;
    public static id ItemKaevGoldCorners;
    public static id ItemKaevSteelCorners;
    public static id ItemKaevObsidianCorners;
    public static id ItemKaevDiamondCorners;
    public static id ItemKaevWhiteWoolCorners;
    public static id ItemKaevBlackWoolCorners;
    public static id ItemKaevRedWoolCorners;
    public static id ItemKaevGreenWoolCorners;
    public static id ItemKaevBrownWoolCorners;
    public static id ItemKaevBlueWoolCorners;
    public static id ItemKaevPurpleWoolCorners;
    public static id ItemKaevCyanWoolCorners;
    public static id ItemKaevSilverWoolCorners;
    public static id ItemKaevGrayWoolCorners;
    public static id ItemKaevPinkWoolCorners;
    public static id ItemKaevLimeWoolCorners;
    public static id ItemKaevYellowWoolCorners;
    public static id ItemKaevLightBlueWoolCorners;
    public static id ItemKaevMagentaWoolCorners;
    public static id ItemKaevOrangeWoolCorners;
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
        if(props.getInt("BlockKaevWoodCorners") != 0)
        {
            BlockKaevWoodCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevWoodCorners"), 4, na.d)).c(2.0F).a(vz.e).b(5F).a("BlockKaevWoodCorners");
            ItemKaevWoodCorners = (new ItemCorners_Kaevator(BlockKaevWoodCorners.bO - 256, "Wood")).a("ItemKaevWoodCorners");
        } else
        {
            BlockKaevWoodCorners = vz.t;
        }
        if(props.getInt("BlockKaevCobblestoneCorners") != 0)
        {
            BlockKaevCobblestoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevCobblestoneCorners"), 16, na.e)).c(2.0F).a(vz.h).b(10F).a("BlockKaevCobblestoneCorners");
            ItemKaevCobblestoneCorners = (new ItemCorners_Kaevator(BlockKaevCobblestoneCorners.bO - 256, "Cobblestone")).a("ItemKaevCobblestoneCorners");
        } else
        {
            BlockKaevCobblestoneCorners = vz.t;
        }
        if(props.getInt("BlockKaevGlassCorners") != 0)
        {
            BlockKaevGlassCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGlassCorners"), 49, na.q)).c(0.3F).a(vz.j).a("BlockKaevGlassCorners");
            ItemKaevGlassCorners = (new ItemCorners_Kaevator(BlockKaevGlassCorners.bO - 256, "Glass")).a("ItemKaevGlassCorners");
        } else
        {
            BlockKaevGlassCorners = vz.t;
        }
        if(props.getInt("BlockKaevSandstoneCorners") != 0)
        {
            BlockKaevSandstoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSandstoneCorners"), 192, na.e)).c(0.8F).a(vz.h).a("BlockKaevSandstoneCorners");
            ItemKaevSandstoneCorners = (new ItemCorners_Kaevator(BlockKaevSandstoneCorners.bO - 256, "Sandstone")).a("ItemKaevSandstoneCorners");
        } else
        {
            BlockKaevSandstoneCorners = vz.t;
        }
        if(props.getInt("BlockKaevDirtCorners") != 0)
        {
            BlockKaevDirtCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevDirtCorners"), 2, na.c)).c(0.5F).a(vz.f).a("BlockKaevDirtCorners");
            ItemKaevDirtCorners = (new ItemCorners_Kaevator(BlockKaevDirtCorners.bO - 256, "Dirt")).a("ItemKaevDirtCorners");
        } else
        {
            BlockKaevDirtCorners = vz.t;
        }
        if(props.getInt("BlockKaevStoneCorners") != 0)
        {
            BlockKaevStoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevStoneCorners"), 1, na.e)).c(1.5F).a(vz.h).b(10F).a("BlockKaevStoneCorners");
            ItemKaevStoneCorners = (new ItemCorners_Kaevator(BlockKaevStoneCorners.bO - 256, "Stone")).a("ItemKaevStoneCorners");
        } else
        {
            BlockKaevStoneCorners = vz.t;
        }
        if(props.getInt("BlockKaevSandCorners") != 0)
        {
            BlockKaevSandCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSandCorners"), 18, na.o)).c(0.5F).a(vz.l).a("BlockKaevSandCorners");
            ItemKaevSandCorners = (new ItemCorners_Kaevator(BlockKaevSandCorners.bO - 256, "Sand")).a("ItemKaevSandCorners");
        } else
        {
            BlockKaevSandCorners = vz.t;
        }
        if(props.getInt("BlockKaevSnowCorners") != 0)
        {
            BlockKaevSnowCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSnowCorners"), 66, na.v)).c(0.1F).a(vz.k).a("BlockKaevSnowCorners");
            ItemKaevSnowCorners = (new ItemCorners_Kaevator(BlockKaevSnowCorners.bO - 256, "Snow")).a("ItemKaevSnowCorners");
        } else
        {
            BlockKaevSnowCorners = vz.t;
        }
        if(props.getInt("BlockKaevGrassCorners") != 0)
        {
            BlockKaevGrassCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGrassCorners"), 3, na.c)).c(0.6F).a(vz.g).a("BlockKaevGrassCorners");
            ItemKaevGrassCorners = (new ItemCorners_Kaevator(BlockKaevGrassCorners.bO - 256, "Grass")).a("ItemKaevGrassCorners");
        } else
        {
            BlockKaevGrassCorners = vz.t;
        }
        if(props.getInt("BlockKaevBricksCorners") != 0)
        {
            BlockKaevBricksCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBricksCorners"), 7, na.e)).c(2.0F).a(vz.h).b(10F).a("BlockKaevBricksCorners");
            ItemKaevBricksCorners = (new ItemCorners_Kaevator(BlockKaevBricksCorners.bO - 256, "Bricks")).a("ItemKaevBricksCorners");
        } else
        {
            BlockKaevBricksCorners = vz.t;
        }
        if(props.getInt("BlockKaevGravelCorners") != 0)
        {
            BlockKaevGravelCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGravelCorners"), 19, na.o)).c(0.6F).a(vz.f).a("BlockKaevGravelCorners");
            ItemKaevGravelCorners = (new ItemCorners_Kaevator(BlockKaevGravelCorners.bO - 256, "Gravel")).a("ItemKaevGravelCorners");
        } else
        {
            BlockKaevGravelCorners = vz.t;
        }
        if(props.getInt("BlockKaevGoldCorners") != 0)
        {
            BlockKaevGoldCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGoldCorners"), 23, na.f)).c(3F).a(vz.i).b(10F).a("BlockKaevGoldCorners");
            ItemKaevGoldCorners = (new ItemCorners_Kaevator(BlockKaevGoldCorners.bO - 256, "Gold")).a("ItemKaevGoldCorners");
        } else
        {
            BlockKaevGoldCorners = vz.t;
        }
        if(props.getInt("BlockKaevSteelCorners") != 0)
        {
            BlockKaevSteelCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSteelCorners"), 22, na.f)).c(5F).a(vz.i).b(10F).a("BlockKaevSteelCorners");
            ItemKaevSteelCorners = (new ItemCorners_Kaevator(BlockKaevSteelCorners.bO - 256, "Steel")).a("ItemKaevSteelCorners");
        } else
        {
            BlockKaevSteelCorners = vz.t;
        }
        if(props.getInt("BlockKaevObsidianCorners") != 0)
        {
            BlockKaevObsidianCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevObsidianCorners"), 37, na.e)).c(10F).a(vz.h).b(2000F).a("BlockKaevObsidianCorners");
            ItemKaevObsidianCorners = (new ItemCorners_Kaevator(BlockKaevObsidianCorners.bO - 256, "Obsidian")).a("ItemKaevObsidianCorners");
        } else
        {
            BlockKaevObsidianCorners = vz.t;
        }
        if(props.getInt("BlockKaevDiamondCorners") != 0)
        {
            BlockKaevDiamondCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevDiamondCorners"), 24, na.f)).c(5F).a(vz.i).b(10F).a("BlockKaevDiamondCorners");
            ItemKaevDiamondCorners = (new ItemCorners_Kaevator(BlockKaevDiamondCorners.bO - 256, "Diamond")).a("ItemKaevDiamondCorners");
        } else
        {
            BlockKaevDiamondCorners = vz.t;
        }
        if(props.getInt("BlockKaevWhiteWoolCorners") != 0)
        {
            BlockKaevWhiteWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevWhiteWoolCorners"), 64, na.m)).c(1.0F).a(vz.k).a("BlockKaevWhiteWoolCorners");
            ItemKaevWhiteWoolCorners = (new ItemCorners_Kaevator(BlockKaevWhiteWoolCorners.bO - 256, "WhiteWool")).a("ItemKaevWhiteWoolCorners");
        } else
        {
            BlockKaevWhiteWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevBlackWoolCorners") != 0)
        {
            BlockKaevBlackWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBlackWoolCorners"), 113, na.m)).c(1.0F).a(vz.k).a("BlockKaevBlackWoolCorners");
            ItemKaevBlackWoolCorners = (new ItemCorners_Kaevator(BlockKaevBlackWoolCorners.bO - 256, "BlackWool")).a("ItemKaevBlackWoolCorners");
        } else
        {
            BlockKaevBlackWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevRedWoolCorners") != 0)
        {
            BlockKaevRedWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevRedWoolCorners"), 129, na.m)).c(1.0F).a(vz.k).a("BlockKaevRedWoolCorners");
            ItemKaevRedWoolCorners = (new ItemCorners_Kaevator(BlockKaevRedWoolCorners.bO - 256, "RedWool")).a("ItemKaevRedWoolCorners");
        } else
        {
            BlockKaevRedWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevGreenWoolCorners") != 0)
        {
            BlockKaevGreenWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGreenWoolCorners"), 145, na.m)).c(1.0F).a(vz.k).a("BlockKaevGreenWoolCorners");
            ItemKaevGreenWoolCorners = (new ItemCorners_Kaevator(BlockKaevGreenWoolCorners.bO - 256, "GreenWool")).a("ItemKaevGreenWoolCorners");
        } else
        {
            BlockKaevGreenWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevBrownWoolCorners") != 0)
        {
            BlockKaevBrownWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBrownWoolCorners"), 161, na.m)).c(1.0F).a(vz.k).a("BlockKaevBrownWoolCorners");
            ItemKaevBrownWoolCorners = (new ItemCorners_Kaevator(BlockKaevBrownWoolCorners.bO - 256, "BrownWool")).a("ItemKaevBrownWoolCorners");
        } else
        {
            BlockKaevBrownWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevBlueWoolCorners") != 0)
        {
            BlockKaevBlueWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBlueWoolCorners"), 177, na.m)).c(1.0F).a(vz.k).a("BlockKaevBlueWoolCorners");
            ItemKaevBlueWoolCorners = (new ItemCorners_Kaevator(BlockKaevBlueWoolCorners.bO - 256, "BlueWool")).a("ItemKaevBlueWoolCorners");
        } else
        {
            BlockKaevBlueWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevPurpleWoolCorners") != 0)
        {
            BlockKaevPurpleWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevPurpleWoolCorners"), 193, na.m)).c(1.0F).a(vz.k).a("BlockKaevPurpleWoolCorners");
            ItemKaevPurpleWoolCorners = (new ItemCorners_Kaevator(BlockKaevPurpleWoolCorners.bO - 256, "PurpleWool")).a("ItemKaevPurpleWoolCorners");
        } else
        {
            BlockKaevPurpleWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevCyanWoolCorners") != 0)
        {
            BlockKaevCyanWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevCyanWoolCorners"), 209, na.m)).c(1.0F).a(vz.k).a("BlockKaevCyanWoolCorners");
            ItemKaevCyanWoolCorners = (new ItemCorners_Kaevator(BlockKaevCyanWoolCorners.bO - 256, "CyanWool")).a("ItemKaevCyanWoolCorners");
        } else
        {
            BlockKaevCyanWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevSilverWoolCorners") != 0)
        {
            BlockKaevSilverWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSilverWoolCorners"), 225, na.m)).c(1.0F).a(vz.k).a("BlockKaevSilverWoolCorners");
            ItemKaevSilverWoolCorners = (new ItemCorners_Kaevator(BlockKaevSilverWoolCorners.bO - 256, "SilverWool")).a("ItemKaevSilverWoolCorners");
        } else
        {
            BlockKaevSilverWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevGrayWoolCorners") != 0)
        {
            BlockKaevGrayWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGrayWoolCorners"), 114, na.m)).c(1.0F).a(vz.k).a("BlockKaevGrayWoolCorners");
            ItemKaevGrayWoolCorners = (new ItemCorners_Kaevator(BlockKaevGrayWoolCorners.bO - 256, "GrayWool")).a("ItemKaevGrayWoolCorners");
        } else
        {
            BlockKaevGrayWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevPinkWoolCorners") != 0)
        {
            BlockKaevPinkWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevPinkWoolCorners"), 130, na.m)).c(1.0F).a(vz.k).a("BlockKaevPinkWoolCorners");
            ItemKaevPinkWoolCorners = (new ItemCorners_Kaevator(BlockKaevPinkWoolCorners.bO - 256, "PinkWool")).a("ItemKaevPinkWoolCorners");
        } else
        {
            BlockKaevPinkWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevLimeWoolCorners") != 0)
        {
            BlockKaevLimeWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevLimeWoolCorners"), 146, na.m)).c(1.0F).a(vz.k).a("BlockKaevLimeWoolCorners");
            ItemKaevLimeWoolCorners = (new ItemCorners_Kaevator(BlockKaevLimeWoolCorners.bO - 256, "LimeWool")).a("ItemKaevLimeWoolCorners");
        } else
        {
            BlockKaevLimeWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevYellowWoolCorners") != 0)
        {
            BlockKaevYellowWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevYellowWoolCorners"), 162, na.m)).c(1.0F).a(vz.k).a("BlockKaevYellowWoolCorners");
            ItemKaevYellowWoolCorners = (new ItemCorners_Kaevator(BlockKaevYellowWoolCorners.bO - 256, "YellowWool")).a("ItemKaevYellowWoolCorners");
        } else
        {
            BlockKaevYellowWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevLightBlueWoolCorners") != 0)
        {
            BlockKaevLightBlueWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevLightBlueWoolCorners"), 178, na.m)).c(1.0F).a(vz.k).a("BlockKaevLightBlueWoolCorners");
            ItemKaevLightBlueWoolCorners = (new ItemCorners_Kaevator(BlockKaevLightBlueWoolCorners.bO - 256, "LightBlueWool")).a("ItemKaevLightBlueWoolCorners");
        } else
        {
            BlockKaevLightBlueWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevMagentaWoolCorners") != 0)
        {
            BlockKaevMagentaWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevMagentaWoolCorners"), 194, na.m)).c(1.0F).a(vz.k).a("BlockKaevMagentaWoolCorners");
            ItemKaevMagentaWoolCorners = (new ItemCorners_Kaevator(BlockKaevMagentaWoolCorners.bO - 256, "MagentaWool")).a("ItemKaevMagentaWoolCorners");
        } else
        {
            BlockKaevMagentaWoolCorners = vz.t;
        }
        if(props.getInt("BlockKaevOrangeWoolCorners") != 0)
        {
            BlockKaevOrangeWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevOrangeWoolCorners"), 210, na.m)).c(1.0F).a(vz.k).a("BlockKaevOrangeWoolCorners");
            ItemKaevOrangeWoolCorners = (new ItemCorners_Kaevator(BlockKaevOrangeWoolCorners.bO - 256, "OrangeWool")).a("ItemKaevOrangeWoolCorners");
        } else
        {
            BlockKaevOrangeWoolCorners = vz.t;
        }
        props.save();
    }
}
