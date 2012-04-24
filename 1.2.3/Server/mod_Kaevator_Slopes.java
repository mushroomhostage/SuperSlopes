// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   mod_Kaevator_Slopes.java

import forge.NetworkMod;
import java.io.File;

public class mod_Kaevator_Slopes extends NetworkMod
{

    public static void prepareProps()
    {
        props.getInt("Slopes_Opacity", 0);
        props.getInt("BlockKaevWoodSlopes", 167);
        props.getInt("BlockKaevCobblestoneSlopes", 168);
        props.getInt("BlockKaevGlassSlopes", 169);
        props.getInt("BlockKaevSandstoneSlopes", 170);
        props.getInt("BlockKaevDirtSlopes", 171);
        props.getInt("BlockKaevStoneSlopes", 172);
        props.getInt("BlockKaevSandSlopes", 173);
        props.getInt("BlockKaevSnowSlopes", 174);
        props.getInt("BlockKaevGrassSlopes", 175);
        props.getInt("BlockKaevBricksSlopes", 176);
        props.getInt("BlockKaevGravelSlopes", 177);
        props.getInt("BlockKaevGoldSlopes", 178);
        props.getInt("BlockKaevSteelSlopes", 179);
        props.getInt("BlockKaevObsidianSlopes", 180);
        props.getInt("BlockKaevDiamondSlopes", 181);
        props.getInt("BlockKaevWhiteWoolSlopes", 215);
        props.getInt("BlockKaevBlackWoolSlopes", 0);
        props.getInt("BlockKaevRedWoolSlopes", 0);
        props.getInt("BlockKaevGreenWoolSlopes", 0);
        props.getInt("BlockKaevBrownWoolSlopes", 0);
        props.getInt("BlockKaevBlueWoolSlopes", 0);
        props.getInt("BlockKaevPurpleWoolSlopes", 0);
        props.getInt("BlockKaevCyanWoolSlopes", 0);
        props.getInt("BlockKaevSilverWoolSlopes", 0);
        props.getInt("BlockKaevGrayWoolSlopes", 0);
        props.getInt("BlockKaevPinkWoolSlopes", 0);
        props.getInt("BlockKaevLimeWoolSlopes", 0);
        props.getInt("BlockKaevYellowWoolSlopes", 0);
        props.getInt("BlockKaevLightBlueWoolSlopes", 0);
        props.getInt("BlockKaevMagentaWoolSlopes", 0);
        props.getInt("BlockKaevOrangeWoolSlopes", 0);
    }

    public mod_Kaevator_Slopes()
    {
        SlopesRenderID = ModLoader.getUniqueBlockModelID(this, true);
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
        if(props.getInt("BlockKaevWoodSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevWoodSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(BlockKaevWoodSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.x
            });
            ModLoader.addRecipe(new kp(vz.x, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevWoodSlopes
            });
        }
        if(props.getInt("BlockKaevCobblestoneSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(BlockKaevCobblestoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.w
            });
            ModLoader.addRecipe(new kp(vz.w, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevCobblestoneSlopes
            });
        }
        if(props.getInt("BlockKaevGlassSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGlassSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(BlockKaevGlassSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.M
            });
            ModLoader.addRecipe(new kp(vz.M, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGlassSlopes
            });
        }
        if(props.getInt("BlockKaevSandstoneSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSandstoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(BlockKaevSandstoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.Q
            });
            ModLoader.addRecipe(new kp(vz.Q, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSandstoneSlopes
            });
        }
        if(props.getInt("BlockKaevDirtSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevDirtSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(BlockKaevDirtSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.v
            });
            ModLoader.addRecipe(new kp(vz.v, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevDirtSlopes
            });
        }
        if(props.getInt("BlockKaevStoneSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevStoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(BlockKaevStoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.t
            });
            ModLoader.addRecipe(new kp(vz.t, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevStoneSlopes
            });
        }
        if(props.getInt("BlockKaevSandSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSandSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(BlockKaevSandSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.E
            });
            ModLoader.addRecipe(new kp(vz.E, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSandSlopes
            });
        }
        if(props.getInt("BlockKaevSnowSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSnowSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(BlockKaevSnowSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.aU
            });
            ModLoader.addRecipe(new kp(vz.aU, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSnowSlopes
            });
        }
        if(props.getInt("BlockKaevGrassSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGrassSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(BlockKaevGrassSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.u
            });
            ModLoader.addRecipe(new kp(vz.u, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGrassSlopes
            });
        }
        if(props.getInt("BlockKaevBricksSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevBricksSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(BlockKaevBricksSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.al
            });
            ModLoader.addRecipe(new kp(vz.al, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBricksSlopes
            });
        }
        if(props.getInt("BlockKaevGravelSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGravelSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(BlockKaevGravelSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.F
            });
            ModLoader.addRecipe(new kp(vz.F, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGravelSlopes
            });
        }
        if(props.getInt("BlockKaevGoldSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevGoldSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(BlockKaevGoldSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.ah
            });
            ModLoader.addRecipe(new kp(vz.ah, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGoldSlopes
            });
        }
        if(props.getInt("BlockKaevSteelSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevSteelSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(BlockKaevSteelSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.ai
            });
            ModLoader.addRecipe(new kp(vz.ai, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSteelSlopes
            });
        }
        if(props.getInt("BlockKaevObsidianSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevObsidianSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(BlockKaevObsidianSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.ap
            });
            ModLoader.addRecipe(new kp(vz.ap, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevObsidianSlopes
            });
        }
        if(props.getInt("BlockKaevDiamondSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevDiamondSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(BlockKaevDiamondSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.ax
            });
            ModLoader.addRecipe(new kp(vz.ax, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevDiamondSlopes
            });
        }
        if(props.getInt("BlockKaevWhiteWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(BlockKaevWhiteWoolSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), vz.ab
            });
            ModLoader.addRecipe(new kp(vz.ab, 1, 0), new Object[] {
                "#", Character.valueOf('#'), BlockKaevWhiteWoolSlopes
            });
        }
        if(props.getInt("BlockKaevBlackWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 15), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBlackWoolSlopes
            });
        if(props.getInt("BlockKaevRedWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 14), new Object[] {
                "#", Character.valueOf('#'), BlockKaevRedWoolSlopes
            });
        if(props.getInt("BlockKaevGreenWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 13), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGreenWoolSlopes
            });
        if(props.getInt("BlockKaevBrownWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 12), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBrownWoolSlopes
            });
        if(props.getInt("BlockKaevBlueWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 11), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBlueWoolSlopes
            });
        if(props.getInt("BlockKaevPurpleWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 10), new Object[] {
                "#", Character.valueOf('#'), BlockKaevPurpleWoolSlopes
            });
        if(props.getInt("BlockKaevCyanWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 9), new Object[] {
                "#", Character.valueOf('#'), BlockKaevCyanWoolSlopes
            });
        if(props.getInt("BlockKaevSilverWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 8), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSilverWoolSlopes
            });
        if(props.getInt("BlockKaevGrayWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 7), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGrayWoolSlopes
            });
        if(props.getInt("BlockKaevPinkWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 6), new Object[] {
                "#", Character.valueOf('#'), BlockKaevPinkWoolSlopes
            });
        if(props.getInt("BlockKaevLimeWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 5), new Object[] {
                "#", Character.valueOf('#'), BlockKaevLimeWoolSlopes
            });
        if(props.getInt("BlockKaevYellowWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 4), new Object[] {
                "#", Character.valueOf('#'), BlockKaevYellowWoolSlopes
            });
        if(props.getInt("BlockKaevLightBlueWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 3), new Object[] {
                "#", Character.valueOf('#'), BlockKaevLightBlueWoolSlopes
            });
        if(props.getInt("BlockKaevMagentaWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 2), new Object[] {
                "#", Character.valueOf('#'), BlockKaevMagentaWoolSlopes
            });
        if(props.getInt("BlockKaevOrangeWoolSlopes") != 0)
            ModLoader.addRecipe(new kp(vz.ab, 1, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevOrangeWoolSlopes
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
    public static int SlopesRenderID;
    public static int SlopesOpacity;
    public static final vz BlockKaevWoodSlopes;
    public static final vz BlockKaevCobblestoneSlopes;
    public static final vz BlockKaevGlassSlopes;
    public static final vz BlockKaevSandstoneSlopes;
    public static final vz BlockKaevDirtSlopes;
    public static final vz BlockKaevStoneSlopes;
    public static final vz BlockKaevSandSlopes;
    public static final vz BlockKaevSnowSlopes;
    public static final vz BlockKaevGrassSlopes;
    public static final vz BlockKaevBricksSlopes;
    public static final vz BlockKaevGravelSlopes;
    public static final vz BlockKaevGoldSlopes;
    public static final vz BlockKaevSteelSlopes;
    public static final vz BlockKaevObsidianSlopes;
    public static final vz BlockKaevDiamondSlopes;
    public static final vz BlockKaevWhiteWoolSlopes;
    public static final vz BlockKaevBlackWoolSlopes;
    public static final vz BlockKaevRedWoolSlopes;
    public static final vz BlockKaevGreenWoolSlopes;
    public static final vz BlockKaevBrownWoolSlopes;
    public static final vz BlockKaevBlueWoolSlopes;
    public static final vz BlockKaevPurpleWoolSlopes;
    public static final vz BlockKaevCyanWoolSlopes;
    public static final vz BlockKaevSilverWoolSlopes;
    public static final vz BlockKaevGrayWoolSlopes;
    public static final vz BlockKaevPinkWoolSlopes;
    public static final vz BlockKaevLimeWoolSlopes;
    public static final vz BlockKaevYellowWoolSlopes;
    public static final vz BlockKaevLightBlueWoolSlopes;
    public static final vz BlockKaevMagentaWoolSlopes;
    public static final vz BlockKaevOrangeWoolSlopes;
    public static id ItemKaevWoodSlopes;
    public static id ItemKaevCobblestoneSlopes;
    public static id ItemKaevGlassSlopes;
    public static id ItemKaevSandstoneSlopes;
    public static id ItemKaevDirtSlopes;
    public static id ItemKaevStoneSlopes;
    public static id ItemKaevSandSlopes;
    public static id ItemKaevSnowSlopes;
    public static id ItemKaevGrassSlopes;
    public static id ItemKaevBricksSlopes;
    public static id ItemKaevGravelSlopes;
    public static id ItemKaevGoldSlopes;
    public static id ItemKaevSteelSlopes;
    public static id ItemKaevObsidianSlopes;
    public static id ItemKaevDiamondSlopes;
    public static id ItemKaevWhiteWoolSlopes;
    public static id ItemKaevBlackWoolSlopes;
    public static id ItemKaevRedWoolSlopes;
    public static id ItemKaevGreenWoolSlopes;
    public static id ItemKaevBrownWoolSlopes;
    public static id ItemKaevBlueWoolSlopes;
    public static id ItemKaevPurpleWoolSlopes;
    public static id ItemKaevCyanWoolSlopes;
    public static id ItemKaevSilverWoolSlopes;
    public static id ItemKaevGrayWoolSlopes;
    public static id ItemKaevPinkWoolSlopes;
    public static id ItemKaevLimeWoolSlopes;
    public static id ItemKaevYellowWoolSlopes;
    public static id ItemKaevLightBlueWoolSlopes;
    public static id ItemKaevMagentaWoolSlopes;
    public static id ItemKaevOrangeWoolSlopes;
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
        if(props.getInt("BlockKaevWoodSlopes") != 0)
        {
            BlockKaevWoodSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevWoodSlopes"), 4, na.d)).c(2.0F).a(vz.e).b(5F).a("BlockKaevWoodSlopes");
            ItemKaevWoodSlopes = (new ItemSlopes_Kaevator(BlockKaevWoodSlopes.bO - 256, "Wood")).a("ItemKaevWoodSlopes");
        } else
        {
            BlockKaevWoodSlopes = vz.t;
        }
        if(props.getInt("BlockKaevCobblestoneSlopes") != 0)
        {
            BlockKaevCobblestoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevCobblestoneSlopes"), 16, na.e)).c(2.0F).a(vz.h).b(10F).a("BlockKaevCobblestoneSlopes");
            ItemKaevCobblestoneSlopes = (new ItemSlopes_Kaevator(BlockKaevCobblestoneSlopes.bO - 256, "Cobblestone")).a("ItemKaevCobblestoneSlopes");
        } else
        {
            BlockKaevCobblestoneSlopes = vz.t;
        }
        if(props.getInt("BlockKaevGlassSlopes") != 0)
        {
            BlockKaevGlassSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGlassSlopes"), 49, na.q)).c(0.3F).a(vz.j).a("BlockKaevGlassSlopes");
            ItemKaevGlassSlopes = (new ItemSlopes_Kaevator(BlockKaevGlassSlopes.bO - 256, "Glass")).a("ItemKaevGlassSlopes");
        } else
        {
            BlockKaevGlassSlopes = vz.t;
        }
        if(props.getInt("BlockKaevSandstoneSlopes") != 0)
        {
            BlockKaevSandstoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSandstoneSlopes"), 192, na.e)).c(0.8F).a(vz.h).a("BlockKaevSandstoneSlopes");
            ItemKaevSandstoneSlopes = (new ItemSlopes_Kaevator(BlockKaevSandstoneSlopes.bO - 256, "Sandstone")).a("ItemKaevSandstoneSlopes");
        } else
        {
            BlockKaevSandstoneSlopes = vz.t;
        }
        if(props.getInt("BlockKaevDirtSlopes") != 0)
        {
            BlockKaevDirtSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevDirtSlopes"), 2, na.c)).c(0.5F).a(vz.f).a("BlockKaevDirtSlopes");
            ItemKaevDirtSlopes = (new ItemSlopes_Kaevator(BlockKaevDirtSlopes.bO - 256, "Dirt")).a("ItemKaevDirtSlopes");
        } else
        {
            BlockKaevDirtSlopes = vz.t;
        }
        if(props.getInt("BlockKaevStoneSlopes") != 0)
        {
            BlockKaevStoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevStoneSlopes"), 1, na.e)).c(1.5F).a(vz.h).b(10F).a("BlockKaevStoneSlopes");
            ItemKaevStoneSlopes = (new ItemSlopes_Kaevator(BlockKaevStoneSlopes.bO - 256, "Stone")).a("ItemKaevStoneSlopes");
        } else
        {
            BlockKaevStoneSlopes = vz.t;
        }
        if(props.getInt("BlockKaevSandSlopes") != 0)
        {
            BlockKaevSandSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSandSlopes"), 18, na.o)).c(0.5F).a(vz.l).a("BlockKaevSandSlopes");
            ItemKaevSandSlopes = (new ItemSlopes_Kaevator(BlockKaevSandSlopes.bO - 256, "Sand")).a("ItemKaevSandSlopes");
        } else
        {
            BlockKaevSandSlopes = vz.t;
        }
        if(props.getInt("BlockKaevSnowSlopes") != 0)
        {
            BlockKaevSnowSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSnowSlopes"), 66, na.v)).c(0.1F).a(vz.k).a("BlockKaevSnowSlopes");
            ItemKaevSnowSlopes = (new ItemSlopes_Kaevator(BlockKaevSnowSlopes.bO - 256, "Snow")).a("ItemKaevSnowSlopes");
        } else
        {
            BlockKaevSnowSlopes = vz.t;
        }
        if(props.getInt("BlockKaevGrassSlopes") != 0)
        {
            BlockKaevGrassSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGrassSlopes"), 3, na.c)).c(0.6F).a(vz.g).a("BlockKaevGrassSlopes");
            ItemKaevGrassSlopes = (new ItemSlopes_Kaevator(BlockKaevGrassSlopes.bO - 256, "Grass")).a("ItemKaevGrassSlopes");
        } else
        {
            BlockKaevGrassSlopes = vz.t;
        }
        if(props.getInt("BlockKaevBricksSlopes") != 0)
        {
            BlockKaevBricksSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBricksSlopes"), 7, na.e)).c(2.0F).a(vz.h).b(10F).a("BlockKaevBricksSlopes");
            ItemKaevBricksSlopes = (new ItemSlopes_Kaevator(BlockKaevBricksSlopes.bO - 256, "Bricks")).a("ItemKaevBricksSlopes");
        } else
        {
            BlockKaevBricksSlopes = vz.t;
        }
        if(props.getInt("BlockKaevGravelSlopes") != 0)
        {
            BlockKaevGravelSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGravelSlopes"), 19, na.o)).c(0.6F).a(vz.f).a("BlockKaevGravelSlopes");
            ItemKaevGravelSlopes = (new ItemSlopes_Kaevator(BlockKaevGravelSlopes.bO - 256, "Gravel")).a("ItemKaevGravelSlopes");
        } else
        {
            BlockKaevGravelSlopes = vz.t;
        }
        if(props.getInt("BlockKaevGoldSlopes") != 0)
        {
            BlockKaevGoldSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGoldSlopes"), 23, na.f)).c(3F).a(vz.i).b(10F).a("BlockKaevGoldSlopes");
            ItemKaevGoldSlopes = (new ItemSlopes_Kaevator(BlockKaevGoldSlopes.bO - 256, "Gold")).a("ItemKaevGoldSlopes");
        } else
        {
            BlockKaevGoldSlopes = vz.t;
        }
        if(props.getInt("BlockKaevSteelSlopes") != 0)
        {
            BlockKaevSteelSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSteelSlopes"), 22, na.f)).c(5F).a(vz.i).b(10F).a("BlockKaevSteelSlopes");
            ItemKaevSteelSlopes = (new ItemSlopes_Kaevator(BlockKaevSteelSlopes.bO - 256, "Steel")).a("ItemKaevSteelSlopes");
        } else
        {
            BlockKaevSteelSlopes = vz.t;
        }
        if(props.getInt("BlockKaevObsidianSlopes") != 0)
        {
            BlockKaevObsidianSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevObsidianSlopes"), 37, na.e)).c(10F).a(vz.h).b(2000F).a("BlockKaevObsidianSlopes");
            ItemKaevObsidianSlopes = (new ItemSlopes_Kaevator(BlockKaevObsidianSlopes.bO - 256, "Obsidian")).a("ItemKaevObsidianSlopes");
        } else
        {
            BlockKaevObsidianSlopes = vz.t;
        }
        if(props.getInt("BlockKaevDiamondSlopes") != 0)
        {
            BlockKaevDiamondSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevDiamondSlopes"), 24, na.f)).c(5F).a(vz.i).b(10F).a("BlockKaevDiamondSlopes");
            ItemKaevDiamondSlopes = (new ItemSlopes_Kaevator(BlockKaevDiamondSlopes.bO - 256, "Diamond")).a("ItemKaevDiamondSlopes");
        } else
        {
            BlockKaevDiamondSlopes = vz.t;
        }
        if(props.getInt("BlockKaevWhiteWoolSlopes") != 0)
        {
            BlockKaevWhiteWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevWhiteWoolSlopes"), 64, na.m)).c(1.0F).a(vz.k).a("BlockKaevWhiteWoolSlopes");
            ItemKaevWhiteWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevWhiteWoolSlopes.bO - 256, "WhiteWool")).a("ItemKaevWhiteWoolSlopes");
        } else
        {
            BlockKaevWhiteWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevBlackWoolSlopes") != 0)
        {
            BlockKaevBlackWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBlackWoolSlopes"), 113, na.m)).c(1.0F).a(vz.k).a("BlockKaevBlackWoolSlopes");
            ItemKaevBlackWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBlackWoolSlopes.bO - 256, "BlackWool")).a("ItemKaevBlackWoolSlopes");
        } else
        {
            BlockKaevBlackWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevRedWoolSlopes") != 0)
        {
            BlockKaevRedWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevRedWoolSlopes"), 129, na.m)).c(1.0F).a(vz.k).a("BlockKaevRedWoolSlopes");
            ItemKaevRedWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevRedWoolSlopes.bO - 256, "RedWool")).a("ItemKaevRedWoolSlopes");
        } else
        {
            BlockKaevRedWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevGreenWoolSlopes") != 0)
        {
            BlockKaevGreenWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGreenWoolSlopes"), 145, na.m)).c(1.0F).a(vz.k).a("BlockKaevGreenWoolSlopes");
            ItemKaevGreenWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevGreenWoolSlopes.bO - 256, "GreenWool")).a("ItemKaevGreenWoolSlopes");
        } else
        {
            BlockKaevGreenWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevBrownWoolSlopes") != 0)
        {
            BlockKaevBrownWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBrownWoolSlopes"), 161, na.m)).c(1.0F).a(vz.k).a("BlockKaevBrownWoolSlopes");
            ItemKaevBrownWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBrownWoolSlopes.bO - 256, "BrownWool")).a("ItemKaevBrownWoolSlopes");
        } else
        {
            BlockKaevBrownWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevBlueWoolSlopes") != 0)
        {
            BlockKaevBlueWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBlueWoolSlopes"), 177, na.m)).c(1.0F).a(vz.k).a("BlockKaevBlueWoolSlopes");
            ItemKaevBlueWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBlueWoolSlopes.bO - 256, "BlueWool")).a("ItemKaevBlueWoolSlopes");
        } else
        {
            BlockKaevBlueWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevPurpleWoolSlopes") != 0)
        {
            BlockKaevPurpleWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevPurpleWoolSlopes"), 193, na.m)).c(1.0F).a(vz.k).a("BlockKaevPurpleWoolSlopes");
            ItemKaevPurpleWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevPurpleWoolSlopes.bO - 256, "PurpleWool")).a("ItemKaevPurpleWoolSlopes");
        } else
        {
            BlockKaevPurpleWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevCyanWoolSlopes") != 0)
        {
            BlockKaevCyanWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevCyanWoolSlopes"), 209, na.m)).c(1.0F).a(vz.k).a("BlockKaevCyanWoolSlopes");
            ItemKaevCyanWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevCyanWoolSlopes.bO - 256, "CyanWool")).a("ItemKaevCyanWoolSlopes");
        } else
        {
            BlockKaevCyanWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevSilverWoolSlopes") != 0)
        {
            BlockKaevSilverWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSilverWoolSlopes"), 225, na.m)).c(1.0F).a(vz.k).a("BlockKaevSilverWoolSlopes");
            ItemKaevSilverWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevSilverWoolSlopes.bO - 256, "SilverWool")).a("ItemKaevSilverWoolSlopes");
        } else
        {
            BlockKaevSilverWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevGrayWoolSlopes") != 0)
        {
            BlockKaevGrayWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGrayWoolSlopes"), 114, na.m)).c(1.0F).a(vz.k).a("BlockKaevGrayWoolSlopes");
            ItemKaevGrayWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevGrayWoolSlopes.bO - 256, "GrayWool")).a("ItemKaevGrayWoolSlopes");
        } else
        {
            BlockKaevGrayWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevPinkWoolSlopes") != 0)
        {
            BlockKaevPinkWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevPinkWoolSlopes"), 130, na.m)).c(1.0F).a(vz.k).a("BlockKaevPinkWoolSlopes");
            ItemKaevPinkWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevPinkWoolSlopes.bO - 256, "PinkWool")).a("ItemKaevPinkWoolSlopes");
        } else
        {
            BlockKaevPinkWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevLimeWoolSlopes") != 0)
        {
            BlockKaevLimeWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevLimeWoolSlopes"), 146, na.m)).c(1.0F).a(vz.k).a("BlockKaevLimeWoolSlopes");
            ItemKaevLimeWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevLimeWoolSlopes.bO - 256, "LimeWool")).a("ItemKaevLimeWoolSlopes");
        } else
        {
            BlockKaevLimeWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevYellowWoolSlopes") != 0)
        {
            BlockKaevYellowWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevYellowWoolSlopes"), 162, na.m)).c(1.0F).a(vz.k).a("BlockKaevYellowWoolSlopes");
            ItemKaevYellowWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevYellowWoolSlopes.bO - 256, "YellowWool")).a("ItemKaevYellowWoolSlopes");
        } else
        {
            BlockKaevYellowWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevLightBlueWoolSlopes") != 0)
        {
            BlockKaevLightBlueWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevLightBlueWoolSlopes"), 178, na.m)).c(1.0F).a(vz.k).a("BlockKaevLightBlueWoolSlopes");
            ItemKaevLightBlueWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevLightBlueWoolSlopes.bO - 256, "LightBlueWool")).a("ItemKaevLightBlueWoolSlopes");
        } else
        {
            BlockKaevLightBlueWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevMagentaWoolSlopes") != 0)
        {
            BlockKaevMagentaWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevMagentaWoolSlopes"), 194, na.m)).c(1.0F).a(vz.k).a("BlockKaevMagentaWoolSlopes");
            ItemKaevMagentaWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevMagentaWoolSlopes.bO - 256, "MagentaWool")).a("ItemKaevMagentaWoolSlopes");
        } else
        {
            BlockKaevMagentaWoolSlopes = vz.t;
        }
        if(props.getInt("BlockKaevOrangeWoolSlopes") != 0)
        {
            BlockKaevOrangeWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevOrangeWoolSlopes"), 210, na.m)).c(1.0F).a(vz.k).a("BlockKaevOrangeWoolSlopes");
            ItemKaevOrangeWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevOrangeWoolSlopes.bO - 256, "OrangeWool")).a("ItemKaevOrangeWoolSlopes");
        } else
        {
            BlockKaevOrangeWoolSlopes = vz.t;
        }
        props.save();
    }
}
