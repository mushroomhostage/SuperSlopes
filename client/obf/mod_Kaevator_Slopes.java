// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   mod_Kaevator_Slopes.java

import java.io.File;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class mod_Kaevator_Slopes extends BaseMod
{

    public static void prepareProps()
    {
        props.getInt("Slopes_Opacity", 0);
        props.getInt("BlockKaevWoodSlopes", 191);
        props.getInt("BlockKaevCobblestoneSlopes", 192);
        props.getInt("BlockKaevGlassSlopes", 0);
        props.getInt("BlockKaevSandstoneSlopes", 0);
        props.getInt("BlockKaevDirtSlopes", 0);
        props.getInt("BlockKaevStoneSlopes", 0);
        props.getInt("BlockKaevSandSlopes", 0);
        props.getInt("BlockKaevSnowSlopes", 0);
        props.getInt("BlockKaevGrassSlopes", 0);
        props.getInt("BlockKaevBricksSlopes", 193);
        props.getInt("BlockKaevGravelSlopes", 195);
        props.getInt("BlockKaevGoldSlopes", 0);
        props.getInt("BlockKaevSteelSlopes", 0);
        props.getInt("BlockKaevObsidianSlopes", 0);
        props.getInt("BlockKaevDiamondSlopes", 0);
        props.getInt("BlockKaevWhiteWoolSlopes", 196);
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
        ModLoader.addLocalization("KaevWoodSlopesStairsUp.name", "Wooden Ceiling Stairs");
        ModLoader.addLocalization("KaevWoodSlopesSlopeDown.name", "Wooden Sloped Floor");
        ModLoader.addLocalization("KaevWoodSlopesSlopeUp.name", "Wooden Sloped Ceiling");
        ModLoader.addLocalization("KaevWoodSlopesSlopeSide.name", "Wooden Corner");
        ModLoader.addLocalization("KaevCobblestoneSlopesStairsUp.name", "Cobblestone Ceiling Stairs");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeDown.name", "Cobblestone Sloped Floor");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeUp.name", "Cobblestone Sloped Ceiling");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeSide.name", "Cobblestone Corner");
        ModLoader.addLocalization("KaevGlassSlopesStairsUp.name", "Glass Ceiling Stairs");
        ModLoader.addLocalization("KaevGlassSlopesSlopeDown.name", "Glass Sloped Floor");
        ModLoader.addLocalization("KaevGlassSlopesSlopeUp.name", "Glass Sloped Ceiling");
        ModLoader.addLocalization("KaevGlassSlopesSlopeSide.name", "Glass Corner");
        ModLoader.addLocalization("KaevSandstoneSlopesStairsUp.name", "Sandstone Ceiling Stairs");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeDown.name", "Sandstone Sloped Floor");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeUp.name", "Sandstone Sloped Ceiling");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeSide.name", "Sandstone Corner");
        ModLoader.addLocalization("KaevDirtSlopesStairsUp.name", "Dirt Ceiling Stairs");
        ModLoader.addLocalization("KaevDirtSlopesSlopeDown.name", "Dirt Sloped Floor");
        ModLoader.addLocalization("KaevDirtSlopesSlopeUp.name", "Dirt Sloped Ceiling");
        ModLoader.addLocalization("KaevDirtSlopesSlopeSide.name", "Dirt Corner");
        ModLoader.addLocalization("KaevStoneSlopesStairsUp.name", "Stone Ceiling Stairs");
        ModLoader.addLocalization("KaevStoneSlopesSlopeDown.name", "Stone Sloped Floor");
        ModLoader.addLocalization("KaevStoneSlopesSlopeUp.name", "Stone Sloped Ceiling");
        ModLoader.addLocalization("KaevStoneSlopesSlopeSide.name", "Stone Corner");
        ModLoader.addLocalization("KaevSandSlopesStairsUp.name", "Sand Ceiling Stairs");
        ModLoader.addLocalization("KaevSandSlopesSlopeDown.name", "Sand Sloped Floor");
        ModLoader.addLocalization("KaevSandSlopesSlopeUp.name", "Sand Sloped Ceiling");
        ModLoader.addLocalization("KaevSandSlopesSlopeSide.name", "Sand Corner");
        ModLoader.addLocalization("KaevSnowSlopesStairsUp.name", "Snow Ceiling Stairs");
        ModLoader.addLocalization("KaevSnowSlopesSlopeDown.name", "Snow Sloped Floor");
        ModLoader.addLocalization("KaevSnowSlopesSlopeUp.name", "Snow Sloped Ceiling");
        ModLoader.addLocalization("KaevSnowSlopesSlopeSide.name", "Snow Corner");
        ModLoader.addLocalization("KaevGrassSlopesStairsUp.name", "Grass Ceiling Stairs");
        ModLoader.addLocalization("KaevGrassSlopesSlopeDown.name", "Grass Sloped Floor");
        ModLoader.addLocalization("KaevGrassSlopesSlopeUp.name", "Grass Sloped Ceiling");
        ModLoader.addLocalization("KaevGrassSlopesSlopeSide.name", "Grass Corner");
        ModLoader.addLocalization("KaevBricksSlopesStairsUp.name", "Bricks Ceiling Stairs");
        ModLoader.addLocalization("KaevBricksSlopesSlopeDown.name", "Bricks Sloped Floor");
        ModLoader.addLocalization("KaevBricksSlopesSlopeUp.name", "Bricks Sloped Ceiling");
        ModLoader.addLocalization("KaevBricksSlopesSlopeSide.name", "Bricks Corner");
        ModLoader.addLocalization("KaevGravelSlopesStairsUp.name", "Gravel Ceiling Stairs");
        ModLoader.addLocalization("KaevGravelSlopesSlopeDown.name", "Gravel Sloped Floor");
        ModLoader.addLocalization("KaevGravelSlopesSlopeUp.name", "Gravel Sloped Ceiling");
        ModLoader.addLocalization("KaevGravelSlopesSlopeSide.name", "Gravel Corner");
        ModLoader.addLocalization("KaevGoldSlopesStairsUp.name", "Golden Ceiling Stairs");
        ModLoader.addLocalization("KaevGoldSlopesSlopeDown.name", "Golden Sloped Floor");
        ModLoader.addLocalization("KaevGoldSlopesSlopeUp.name", "Golden Sloped Ceiling");
        ModLoader.addLocalization("KaevGoldSlopesSlopeSide.name", "Golden Corner");
        ModLoader.addLocalization("KaevSteelSlopesStairsUp.name", "Steel Ceiling Stairs");
        ModLoader.addLocalization("KaevSteelSlopesSlopeDown.name", "Steel Sloped Floor");
        ModLoader.addLocalization("KaevSteelSlopesSlopeUp.name", "Steel Sloped Ceiling");
        ModLoader.addLocalization("KaevSteelSlopesSlopeSide.name", "Steel Corner");
        ModLoader.addLocalization("KaevObsidianSlopesStairsUp.name", "Obsidian Ceiling Stairs");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeDown.name", "Obsidian Sloped Floor");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeUp.name", "Obsidian Sloped Ceiling");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeSide.name", "Obsidian Corner");
        ModLoader.addLocalization("KaevDiamondSlopesStairsUp.name", "Diamond Ceiling Stairs");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeDown.name", "Diamond Sloped Floor");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeUp.name", "Diamond Sloped Ceiling");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeSide.name", "Diamond Corner");
        ModLoader.addLocalization("KaevWhiteWoolSlopesStairsUp.name", "White Ceiling Stairs");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeDown.name", "White Sloped Floor");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeUp.name", "White Sloped Ceiling");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeSide.name", "White Corner");
        ModLoader.addLocalization("KaevBlackWoolSlopesStairsUp.name", "Black Ceiling Stairs");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeDown.name", "Black Sloped Floor");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeUp.name", "Black Sloped Ceiling");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeSide.name", "Black Corner");
        ModLoader.addLocalization("KaevRedWoolSlopesStairsUp.name", "Red Ceiling Stairs");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeDown.name", "Red Sloped Floor");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeUp.name", "Red Sloped Ceiling");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeSide.name", "Red Corner");
        ModLoader.addLocalization("KaevGreenWoolSlopesStairsUp.name", "Green Ceiling Stairs");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeDown.name", "Green Sloped Floor");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeUp.name", "Green Sloped Ceiling");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeSide.name", "Green Corner");
        ModLoader.addLocalization("KaevBrownWoolSlopesStairsUp.name", "Brown Ceiling Stairs");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeDown.name", "Brown Sloped Floor");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeUp.name", "Brown Sloped Ceiling");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeSide.name", "Brown Corner");
        ModLoader.addLocalization("KaevBlueWoolSlopesStairsUp.name", "Blue Ceiling Stairs");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeDown.name", "Blue Sloped Floor");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeUp.name", "Blue Sloped Ceiling");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeSide.name", "Blue Corner");
        ModLoader.addLocalization("KaevPurpleWoolSlopesStairsUp.name", "Purple Ceiling Stairs");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeDown.name", "Purple Sloped Floor");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeUp.name", "Purple Sloped Ceiling");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeSide.name", "Purple Corner");
        ModLoader.addLocalization("KaevCyanWoolSlopesStairsUp.name", "Cyan Ceiling Stairs");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeDown.name", "Cyan Sloped Floor");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeUp.name", "Cyan Sloped Ceiling");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeSide.name", "Cyan Corner");
        ModLoader.addLocalization("KaevSilverWoolSlopesStairsUp.name", "Silver Ceiling Stairs");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeDown.name", "Silver Sloped Floor");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeUp.name", "Silver Sloped Ceiling");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeSide.name", "Silver Corner");
        ModLoader.addLocalization("KaevGrayWoolSlopesStairsUp.name", "Gray Ceiling Stairs");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeDown.name", "Gray Sloped Floor");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeUp.name", "Gray Sloped Ceiling");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeSide.name", "Gray Corner");
        ModLoader.addLocalization("KaevPinkWoolSlopesStairsUp.name", "Pink Ceiling Stairs");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeDown.name", "Pink Sloped Floor");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeUp.name", "Pink Sloped Ceiling");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeSide.name", "Pink Corner");
        ModLoader.addLocalization("KaevLimeWoolSlopesStairsUp.name", "Lime Ceiling Stairs");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeDown.name", "Lime Sloped Floor");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeUp.name", "Lime Sloped Ceiling");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeSide.name", "Lime Corner");
        ModLoader.addLocalization("KaevYellowWoolSlopesStairsUp.name", "Yellow Ceiling Stairs");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeDown.name", "Yellow Sloped Floor");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeUp.name", "Yellow Sloped Ceiling");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeSide.name", "Yellow Corner");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesStairsUp.name", "Light Blue Ceiling Stairs");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeDown.name", "Light Blue Sloped Floor");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeUp.name", "Light Blue Sloped Ceiling");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeSide.name", "Light Blue Corner");
        ModLoader.addLocalization("KaevMagentaWoolSlopesStairsUp.name", "Magenta Ceiling Stairs");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeDown.name", "Magenta Sloped Floor");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeUp.name", "Magenta Sloped Ceiling");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeSide.name", "Magenta Corner");
        ModLoader.addLocalization("KaevOrangeWoolSlopesStairsUp.name", "Orange Ceiling Stairs");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeDown.name", "Orange Sloped Floor");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeUp.name", "Orange Sloped Ceiling");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeSide.name", "Orange Corner");
        if(props.getInt("BlockKaevWoodSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevWoodSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.x
            });
            ModLoader.addRecipe(new aan(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.x
            });
            ModLoader.addRecipe(new aan(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.x
            });
            ModLoader.addRecipe(new aan(BlockKaevWoodSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.x
            });
            ModLoader.addRecipe(new aan(pb.x, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevWoodSlopes
            });
        }
        if(props.getInt("BlockKaevCobblestoneSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevCobblestoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.w
            });
            ModLoader.addRecipe(new aan(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.w
            });
            ModLoader.addRecipe(new aan(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.w
            });
            ModLoader.addRecipe(new aan(BlockKaevCobblestoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.w
            });
            ModLoader.addRecipe(new aan(pb.w, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevCobblestoneSlopes
            });
        }
        if(props.getInt("BlockKaevGlassSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevGlassSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.M
            });
            ModLoader.addRecipe(new aan(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.M
            });
            ModLoader.addRecipe(new aan(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.M
            });
            ModLoader.addRecipe(new aan(BlockKaevGlassSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.M
            });
            ModLoader.addRecipe(new aan(pb.M, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGlassSlopes
            });
        }
        if(props.getInt("BlockKaevSandstoneSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevSandstoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.Q
            });
            ModLoader.addRecipe(new aan(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.Q
            });
            ModLoader.addRecipe(new aan(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.Q
            });
            ModLoader.addRecipe(new aan(BlockKaevSandstoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.Q
            });
            ModLoader.addRecipe(new aan(pb.Q, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSandstoneSlopes
            });
        }
        if(props.getInt("BlockKaevDirtSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevDirtSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.v
            });
            ModLoader.addRecipe(new aan(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.v
            });
            ModLoader.addRecipe(new aan(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.v
            });
            ModLoader.addRecipe(new aan(BlockKaevDirtSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.v
            });
            ModLoader.addRecipe(new aan(pb.v, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevDirtSlopes
            });
        }
        if(props.getInt("BlockKaevStoneSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevStoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.t
            });
            ModLoader.addRecipe(new aan(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.t
            });
            ModLoader.addRecipe(new aan(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.t
            });
            ModLoader.addRecipe(new aan(BlockKaevStoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.t
            });
            ModLoader.addRecipe(new aan(pb.t, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevStoneSlopes
            });
        }
        if(props.getInt("BlockKaevSandSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevSandSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.E
            });
            ModLoader.addRecipe(new aan(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.E
            });
            ModLoader.addRecipe(new aan(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.E
            });
            ModLoader.addRecipe(new aan(BlockKaevSandSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.E
            });
            ModLoader.addRecipe(new aan(pb.E, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSandSlopes
            });
        }
        if(props.getInt("BlockKaevSnowSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevSnowSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.aU
            });
            ModLoader.addRecipe(new aan(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.aU
            });
            ModLoader.addRecipe(new aan(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.aU
            });
            ModLoader.addRecipe(new aan(BlockKaevSnowSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.aU
            });
            ModLoader.addRecipe(new aan(pb.aU, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSnowSlopes
            });
        }
        if(props.getInt("BlockKaevGrassSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevGrassSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.u
            });
            ModLoader.addRecipe(new aan(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.u
            });
            ModLoader.addRecipe(new aan(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.u
            });
            ModLoader.addRecipe(new aan(BlockKaevGrassSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.u
            });
            ModLoader.addRecipe(new aan(pb.u, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGrassSlopes
            });
        }
        if(props.getInt("BlockKaevBricksSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevBricksSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.al
            });
            ModLoader.addRecipe(new aan(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.al
            });
            ModLoader.addRecipe(new aan(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.al
            });
            ModLoader.addRecipe(new aan(BlockKaevBricksSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.al
            });
            ModLoader.addRecipe(new aan(pb.al, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBricksSlopes
            });
        }
        if(props.getInt("BlockKaevGravelSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevGravelSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.F
            });
            ModLoader.addRecipe(new aan(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.F
            });
            ModLoader.addRecipe(new aan(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.F
            });
            ModLoader.addRecipe(new aan(BlockKaevGravelSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.F
            });
            ModLoader.addRecipe(new aan(pb.F, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGravelSlopes
            });
        }
        if(props.getInt("BlockKaevGoldSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevGoldSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.ah
            });
            ModLoader.addRecipe(new aan(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.ah
            });
            ModLoader.addRecipe(new aan(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.ah
            });
            ModLoader.addRecipe(new aan(BlockKaevGoldSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.ah
            });
            ModLoader.addRecipe(new aan(pb.ah, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGoldSlopes
            });
        }
        if(props.getInt("BlockKaevSteelSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevSteelSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.ai
            });
            ModLoader.addRecipe(new aan(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.ai
            });
            ModLoader.addRecipe(new aan(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.ai
            });
            ModLoader.addRecipe(new aan(BlockKaevSteelSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.ai
            });
            ModLoader.addRecipe(new aan(pb.ai, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSteelSlopes
            });
        }
        if(props.getInt("BlockKaevObsidianSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevObsidianSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.ap
            });
            ModLoader.addRecipe(new aan(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.ap
            });
            ModLoader.addRecipe(new aan(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.ap
            });
            ModLoader.addRecipe(new aan(BlockKaevObsidianSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.ap
            });
            ModLoader.addRecipe(new aan(pb.ap, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevObsidianSlopes
            });
        }
        if(props.getInt("BlockKaevDiamondSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevDiamondSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.ax
            });
            ModLoader.addRecipe(new aan(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.ax
            });
            ModLoader.addRecipe(new aan(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.ax
            });
            ModLoader.addRecipe(new aan(BlockKaevDiamondSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.ax
            });
            ModLoader.addRecipe(new aan(pb.ax, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevDiamondSlopes
            });
        }
        if(props.getInt("BlockKaevWhiteWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new aan(BlockKaevWhiteWoolSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
                "###", "## ", "#  ", Character.valueOf('#'), pb.ab
            });
            ModLoader.addRecipe(new aan(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
                "#  ", " # ", "###", Character.valueOf('#'), pb.ab
            });
            ModLoader.addRecipe(new aan(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
                "###", " # ", "#  ", Character.valueOf('#'), pb.ab
            });
            ModLoader.addRecipe(new aan(BlockKaevWhiteWoolSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
                " # ", " ##", " # ", Character.valueOf('#'), pb.ab
            });
            ModLoader.addRecipe(new aan(pb.ab, 1, 0), new Object[] {
                "#", Character.valueOf('#'), BlockKaevWhiteWoolSlopes
            });
        }
        if(props.getInt("BlockKaevBlackWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 15), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBlackWoolSlopes
            });
        if(props.getInt("BlockKaevRedWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 14), new Object[] {
                "#", Character.valueOf('#'), BlockKaevRedWoolSlopes
            });
        if(props.getInt("BlockKaevGreenWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 13), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGreenWoolSlopes
            });
        if(props.getInt("BlockKaevBrownWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 12), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBrownWoolSlopes
            });
        if(props.getInt("BlockKaevBlueWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 11), new Object[] {
                "#", Character.valueOf('#'), BlockKaevBlueWoolSlopes
            });
        if(props.getInt("BlockKaevPurpleWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 10), new Object[] {
                "#", Character.valueOf('#'), BlockKaevPurpleWoolSlopes
            });
        if(props.getInt("BlockKaevCyanWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 9), new Object[] {
                "#", Character.valueOf('#'), BlockKaevCyanWoolSlopes
            });
        if(props.getInt("BlockKaevSilverWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 8), new Object[] {
                "#", Character.valueOf('#'), BlockKaevSilverWoolSlopes
            });
        if(props.getInt("BlockKaevGrayWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 7), new Object[] {
                "#", Character.valueOf('#'), BlockKaevGrayWoolSlopes
            });
        if(props.getInt("BlockKaevPinkWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 6), new Object[] {
                "#", Character.valueOf('#'), BlockKaevPinkWoolSlopes
            });
        if(props.getInt("BlockKaevLimeWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 5), new Object[] {
                "#", Character.valueOf('#'), BlockKaevLimeWoolSlopes
            });
        if(props.getInt("BlockKaevYellowWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 4), new Object[] {
                "#", Character.valueOf('#'), BlockKaevYellowWoolSlopes
            });
        if(props.getInt("BlockKaevLightBlueWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 3), new Object[] {
                "#", Character.valueOf('#'), BlockKaevLightBlueWoolSlopes
            });
        if(props.getInt("BlockKaevMagentaWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 2), new Object[] {
                "#", Character.valueOf('#'), BlockKaevMagentaWoolSlopes
            });
        if(props.getInt("BlockKaevOrangeWoolSlopes") != 0)
            ModLoader.addRecipe(new aan(pb.ab, 1, 1), new Object[] {
                "#", Character.valueOf('#'), BlockKaevOrangeWoolSlopes
            });
    }

    private static String getAppdata()
    {
        return Minecraft.b().getPath();
    }

    public void renderInvBlock(vl vl1, pb pb1, int i, int j)
    {
        adz adz1 = adz.a;
        if(j == SlopesRenderID)
        {
            if(i / 4 == 0)
            {
                for(int k = 0; k < 2; k++)
                {
                    if(k == 0)
                        pb1.a(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
                    if(k == 1)
                        pb1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
                    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                    adz1.b();
                    adz1.b(0.0F, -1F, 0.0F);
                    vl1.a(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(0));
                    adz1.a();
                    adz1.b();
                    adz1.b(0.0F, 1.0F, 0.0F);
                    vl1.b(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(1));
                    adz1.a();
                    adz1.b();
                    adz1.b(0.0F, 0.0F, -1F);
                    vl1.c(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(2));
                    adz1.a();
                    adz1.b();
                    adz1.b(0.0F, 0.0F, 1.0F);
                    vl1.d(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(3));
                    adz1.a();
                    adz1.b();
                    adz1.b(-1F, 0.0F, 0.0F);
                    vl1.e(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(4));
                    adz1.a();
                    adz1.b();
                    adz1.b(1.0F, 0.0F, 0.0F);
                    vl1.f(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(5));
                    adz1.a();
                    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                }

            } else
            {
                pb1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                adz1.b();
                adz1.b(0.0F, -1F, 0.0F);
                renderSlopesBottomFace(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(0), i + 1, vl1, 240);
                adz1.a();
                adz1.b();
                adz1.b(0.0F, 1.0F, 0.0F);
                renderSlopesTopFace(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(1), i + 1, vl1, 240);
                adz1.a();
                adz1.b();
                adz1.b(0.0F, 0.0F, -1F);
                renderSlopesEastFace(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(2), i + 1, vl1, 240);
                adz1.a();
                adz1.b();
                adz1.b(0.0F, 0.0F, 1.0F);
                renderSlopesWestFace(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(3), i + 1, vl1, 240);
                adz1.a();
                adz1.b();
                adz1.b(-1F, 0.0F, 0.0F);
                renderSlopesNorthFace(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(4), i + 1, vl1, 240);
                adz1.a();
                adz1.b();
                adz1.b(1.0F, 0.0F, 0.0F);
                renderSlopesSouthFace(pb1, 0.0D, 0.0D, 0.0D, pb1.a_(5), i + 1, vl1, 240);
                adz1.a();
                GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }
            pb1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public boolean renderWorldBlock(vl vl1, ali ali1, int i, int j, int k, pb pb1, int l)
    {
        if(l == SlopesRenderID)
        {
            int i1 = ali1.e(i, j, k);
            if(i1 / 4 == 0)
                return renderBlockStairsUp(pb1, i, j, k, vl1, ali1);
            else
                return renderBlockSlopes(pb1, i, j, k, vl1, ali1);
        } else
        {
            return false;
        }
    }

    public boolean renderBlockStairsUp(pb pb1, int i, int j, int k, vl vl1, ali ali1)
    {
        boolean flag = false;
        int l = ali1.e(i, j, k) % 4;
        if(l == 0)
        {
            pb1.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            vl1.o(pb1, i, j, k);
            pb1.a(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            vl1.o(pb1, i, j, k);
        } else
        if(l == 1)
        {
            pb1.a(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            vl1.o(pb1, i, j, k);
            pb1.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            vl1.o(pb1, i, j, k);
        } else
        if(l == 2)
        {
            pb1.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            vl1.o(pb1, i, j, k);
            pb1.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            vl1.o(pb1, i, j, k);
        } else
        if(l == 3)
        {
            pb1.a(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            vl1.o(pb1, i, j, k);
            pb1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            vl1.o(pb1, i, j, k);
        }
        pb1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        return flag;
    }

    public boolean renderBlockSlopes(pb pb1, int i, int j, int k, vl vl1, ali ali1)
    {
        int l = ali1.e(i, j, k);
        int i1 = pb1.c(ali1, i, j, k);
        float f = (float)(i1 >> 16 & 0xff) / 255F;
        float f1 = (float)(i1 >> 8 & 0xff) / 255F;
        float f2 = (float)(i1 & 0xff) / 255F;
        if(Minecraft.t())
            return renderSlopesBlockWithAmbientOcclusion(pb1, i, j, k, f, f1, f2, l, vl1, ali1);
        else
            return renderSlopesBlockWithColorMultiplier(pb1, i, j, k, f, f1, f2, l, vl1, ali1);
    }

    public boolean renderSlopesBlockWithAmbientOcclusion(pb pb1, int i, int j, int k, float f, float f1, float f2, 
            int l, vl vl1, ali ali1)
    {
        enableAO = true;
        boolean flag = false;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;
        boolean flag5 = true;
        boolean flag6 = true;
        aoLightValueThis = pb1.f(ali1, i, j, k);
        aoLightValueXNeg = pb1.f(ali1, i - 1, j, k);
        aoLightValueYNeg = pb1.f(ali1, i, j - 1, k);
        aoLightValueZNeg = pb1.f(ali1, i, j, k - 1);
        aoLightValueXPos = pb1.f(ali1, i + 1, j, k);
        aoLightValueYPos = pb1.f(ali1, i, j + 1, k);
        aoLightValueZPos = pb1.f(ali1, i, j, k + 1);
        aoLightValueXPosYPos = pb1.f(ali1, i + 1, j + 1, k);
        aoLightValueXPosYNeg = pb1.f(ali1, i + 1, j - 1, k);
        aoLightValueXPosZPos = pb1.f(ali1, i + 1, j, k + 1);
        aoLightValueXPosZNeg = pb1.f(ali1, i + 1, j, k - 1);
        aoLightValueXNegYPos = pb1.f(ali1, i - 1, j + 1, k);
        aoLightValueXNegYNeg = pb1.f(ali1, i - 1, j - 1, k);
        aoLightValueXNegZNeg = pb1.f(ali1, i - 1, j, k - 1);
        aoLightValueXNegZPos = pb1.f(ali1, i - 1, j, k + 1);
        aoLightValueYPosZPos = pb1.f(ali1, i, j + 1, k + 1);
        aoLightValueYPosZNeg = pb1.f(ali1, i, j + 1, k - 1);
        aoLightValueYNegZPos = pb1.f(ali1, i, j - 1, k + 1);
        aoLightValueYNegZNeg = pb1.f(ali1, i, j - 1, k - 1);
        aoLightValueXPosYPosZPos = pb1.f(ali1, i + 1, j + 1, k + 1);
        aoLightValueXPosYNegZPos = pb1.f(ali1, i + 1, j - 1, k + 1);
        aoLightValueXPosYPosZNeg = pb1.f(ali1, i + 1, j + 1, k - 1);
        aoLightValueXPosYNegZNeg = pb1.f(ali1, i + 1, j - 1, k - 1);
        aoLightValueXNegYPosZPos = pb1.f(ali1, i - 1, j + 1, k + 1);
        aoLightValueXNegYNegZPos = pb1.f(ali1, i - 1, j - 1, k + 1);
        aoLightValueXNegYPosZNeg = pb1.f(ali1, i - 1, j + 1, k - 1);
        aoLightValueXNegYNegZNeg = pb1.f(ali1, i - 1, j - 1, k - 1);
        if(pb1.bN == 3)
            flag1 = flag3 = flag4 = flag5 = flag6 = false;
        float f3;
        float f4;
        float f5;
        float f6;
        if(field_22352_G > 0)
        {
            f3 = (aoLightValueXNegYNegZPos + aoLightValueXNegYNeg + aoLightValueYNegZPos + aoLightValueYNeg) / 4F;
            f6 = (aoLightValueYNegZPos + aoLightValueYNeg + aoLightValueXPosYNegZPos + aoLightValueXPosYNeg) / 4F;
            f5 = (aoLightValueYNeg + aoLightValueYNegZNeg + aoLightValueXPosYNeg + aoLightValueXPosYNegZNeg) / 4F;
            f4 = (aoLightValueXNegYNeg + aoLightValueXNegYNegZNeg + aoLightValueYNeg + aoLightValueYNegZNeg) / 4F;
        } else
        {
            f3 = f4 = f5 = f6 = aoLightValueYNeg;
        }
        colorRedTopLeft_BottomFace = colorRedBottomLeft_BottomFace = colorRedBottomRight_BottomFace = colorRedTopRight_BottomFace = (flag1 ? f : 1.0F) * 0.5F;
        colorGreenTopLeft_BottomFace = colorGreenBottomLeft_BottomFace = colorGreenBottomRight_BottomFace = colorGreenTopRight_BottomFace = (flag1 ? f1 : 1.0F) * 0.5F;
        colorBlueTopLeft_BottomFace = colorBlueBottomLeft_BottomFace = colorBlueBottomRight_BottomFace = colorBlueTopRight_BottomFace = (flag1 ? f2 : 1.0F) * 0.5F;
        colorRedTopLeft_BottomFace *= f3;
        colorGreenTopLeft_BottomFace *= f3;
        colorBlueTopLeft_BottomFace *= f3;
        colorRedBottomLeft_BottomFace *= f4;
        colorGreenBottomLeft_BottomFace *= f4;
        colorBlueBottomLeft_BottomFace *= f4;
        colorRedBottomRight_BottomFace *= f5;
        colorGreenBottomRight_BottomFace *= f5;
        colorBlueBottomRight_BottomFace *= f5;
        colorRedTopRight_BottomFace *= f6;
        colorGreenTopRight_BottomFace *= f6;
        colorBlueTopRight_BottomFace *= f6;
        float f7;
        float f8;
        float f9;
        float f10;
        if(field_22352_G > 0)
        {
            f10 = (aoLightValueXNegYPosZPos + aoLightValueXNegYPos + aoLightValueYPosZPos + aoLightValueYPos) / 4F;
            f7 = (aoLightValueYPosZPos + aoLightValueYPos + aoLightValueXPosYPosZPos + aoLightValueXPosYPos) / 4F;
            f8 = (aoLightValueYPos + aoLightValueYPosZNeg + aoLightValueXPosYPos + aoLightValueXPosYPosZNeg) / 4F;
            f9 = (aoLightValueXNegYPos + aoLightValueXNegYPosZNeg + aoLightValueYPos + aoLightValueYPosZNeg) / 4F;
        } else
        {
            f7 = f8 = f9 = f10 = aoLightValueYPos;
        }
        colorRedTopLeft_TopFace = colorRedBottomLeft_TopFace = colorRedBottomRight_TopFace = colorRedTopRight_TopFace = flag2 ? f : 1.0F;
        colorGreenTopLeft_TopFace = colorGreenBottomLeft_TopFace = colorGreenBottomRight_TopFace = colorGreenTopRight_TopFace = flag2 ? f1 : 1.0F;
        colorBlueTopLeft_TopFace = colorBlueBottomLeft_TopFace = colorBlueBottomRight_TopFace = colorBlueTopRight_TopFace = flag2 ? f2 : 1.0F;
        colorRedTopLeft_TopFace *= f7;
        colorGreenTopLeft_TopFace *= f7;
        colorBlueTopLeft_TopFace *= f7;
        colorRedBottomLeft_TopFace *= f8;
        colorGreenBottomLeft_TopFace *= f8;
        colorBlueBottomLeft_TopFace *= f8;
        colorRedBottomRight_TopFace *= f9;
        colorGreenBottomRight_TopFace *= f9;
        colorBlueBottomRight_TopFace *= f9;
        colorRedTopRight_TopFace *= f10;
        colorGreenTopRight_TopFace *= f10;
        colorBlueTopRight_TopFace *= f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if(field_22352_G > 0)
        {
            f11 = (aoLightValueXNegZNeg + aoLightValueXNegYPosZNeg + aoLightValueZNeg + aoLightValueYPosZNeg) / 4F;
            f12 = (aoLightValueZNeg + aoLightValueYPosZNeg + aoLightValueXPosZNeg + aoLightValueXPosYPosZNeg) / 4F;
            f13 = (aoLightValueYNegZNeg + aoLightValueZNeg + aoLightValueXPosYNegZNeg + aoLightValueXPosZNeg) / 4F;
            f14 = (aoLightValueXNegYNegZNeg + aoLightValueXNegZNeg + aoLightValueYNegZNeg + aoLightValueZNeg) / 4F;
        } else
        {
            f11 = f12 = f13 = f14 = aoLightValueZNeg;
        }
        colorRedTopLeft_EastFace = colorRedBottomLeft_EastFace = colorRedBottomRight_EastFace = colorRedTopRight_EastFace = (flag3 ? f : 1.0F) * 0.8F;
        colorGreenTopLeft_EastFace = colorGreenBottomLeft_EastFace = colorGreenBottomRight_EastFace = colorGreenTopRight_EastFace = (flag3 ? f1 : 1.0F) * 0.8F;
        colorBlueTopLeft_EastFace = colorBlueBottomLeft_EastFace = colorBlueBottomRight_EastFace = colorBlueTopRight_EastFace = (flag3 ? f2 : 1.0F) * 0.8F;
        colorRedTopLeft_EastFace *= f11;
        colorGreenTopLeft_EastFace *= f11;
        colorBlueTopLeft_EastFace *= f11;
        colorRedBottomLeft_EastFace *= f12;
        colorGreenBottomLeft_EastFace *= f12;
        colorBlueBottomLeft_EastFace *= f12;
        colorRedBottomRight_EastFace *= f13;
        colorGreenBottomRight_EastFace *= f13;
        colorBlueBottomRight_EastFace *= f13;
        colorRedTopRight_EastFace *= f14;
        colorGreenTopRight_EastFace *= f14;
        colorBlueTopRight_EastFace *= f14;
        int i1 = pb1.d(ali1, i, j, k, 2);
        float f15;
        float f16;
        float f17;
        float f18;
        if(field_22352_G > 0)
        {
            f15 = (aoLightValueXNegZPos + aoLightValueXNegYPosZPos + aoLightValueZPos + aoLightValueYPosZPos) / 4F;
            f18 = (aoLightValueZPos + aoLightValueYPosZPos + aoLightValueXPosZPos + aoLightValueXPosYPosZPos) / 4F;
            f17 = (aoLightValueYNegZPos + aoLightValueZPos + aoLightValueXPosYNegZPos + aoLightValueXPosZPos) / 4F;
            f16 = (aoLightValueXNegYNegZPos + aoLightValueXNegZPos + aoLightValueYNegZPos + aoLightValueZPos) / 4F;
        } else
        {
            f15 = f16 = f17 = f18 = aoLightValueZPos;
        }
        colorRedTopLeft_WestFace = colorRedBottomLeft_WestFace = colorRedBottomRight_WestFace = colorRedTopRight_WestFace = (flag4 ? f : 1.0F) * 0.8F;
        colorGreenTopLeft_WestFace = colorGreenBottomLeft_WestFace = colorGreenBottomRight_WestFace = colorGreenTopRight_WestFace = (flag4 ? f1 : 1.0F) * 0.8F;
        colorBlueTopLeft_WestFace = colorBlueBottomLeft_WestFace = colorBlueBottomRight_WestFace = colorBlueTopRight_WestFace = (flag4 ? f2 : 1.0F) * 0.8F;
        colorRedTopLeft_WestFace *= f15;
        colorGreenTopLeft_WestFace *= f15;
        colorBlueTopLeft_WestFace *= f15;
        colorRedBottomLeft_WestFace *= f16;
        colorGreenBottomLeft_WestFace *= f16;
        colorBlueBottomLeft_WestFace *= f16;
        colorRedBottomRight_WestFace *= f17;
        colorGreenBottomRight_WestFace *= f17;
        colorBlueBottomRight_WestFace *= f17;
        colorRedTopRight_WestFace *= f18;
        colorGreenTopRight_WestFace *= f18;
        colorBlueTopRight_WestFace *= f18;
        int j1 = pb1.d(ali1, i, j, k, 3);
        float f19;
        float f20;
        float f21;
        float f22;
        if(field_22352_G > 0)
        {
            f22 = (aoLightValueXNegYNeg + aoLightValueXNegYNegZPos + aoLightValueXNeg + aoLightValueXNegZPos) / 4F;
            f19 = (aoLightValueXNeg + aoLightValueXNegZPos + aoLightValueXNegYPos + aoLightValueXNegYPosZPos) / 4F;
            f20 = (aoLightValueXNegZNeg + aoLightValueXNeg + aoLightValueXNegYPosZNeg + aoLightValueXNegYPos) / 4F;
            f21 = (aoLightValueXNegYNegZNeg + aoLightValueXNegYNeg + aoLightValueXNegZNeg + aoLightValueXNeg) / 4F;
        } else
        {
            f19 = f20 = f21 = f22 = aoLightValueXNeg;
        }
        colorRedTopLeft_NorthFace = colorRedBottomLeft_NorthFace = colorRedBottomRight_NorthFace = colorRedTopRight_NorthFace = (flag5 ? f : 1.0F) * 0.6F;
        colorGreenTopLeft_NorthFace = colorGreenBottomLeft_NorthFace = colorGreenBottomRight_NorthFace = colorGreenTopRight_NorthFace = (flag5 ? f1 : 1.0F) * 0.6F;
        colorBlueTopLeft_NorthFace = colorBlueBottomLeft_NorthFace = colorBlueBottomRight_NorthFace = colorBlueTopRight_NorthFace = (flag5 ? f2 : 1.0F) * 0.6F;
        colorRedTopLeft_NorthFace *= f19;
        colorGreenTopLeft_NorthFace *= f19;
        colorBlueTopLeft_NorthFace *= f19;
        colorRedBottomLeft_NorthFace *= f20;
        colorGreenBottomLeft_NorthFace *= f20;
        colorBlueBottomLeft_NorthFace *= f20;
        colorRedBottomRight_NorthFace *= f21;
        colorGreenBottomRight_NorthFace *= f21;
        colorBlueBottomRight_NorthFace *= f21;
        colorRedTopRight_NorthFace *= f22;
        colorGreenTopRight_NorthFace *= f22;
        colorBlueTopRight_NorthFace *= f22;
        int k1 = pb1.d(ali1, i, j, k, 4);
        float f23;
        float f24;
        float f25;
        float f26;
        if(field_22352_G > 0)
        {
            f23 = (aoLightValueXPosYNeg + aoLightValueXPosYNegZPos + aoLightValueXPos + aoLightValueXPosZPos) / 4F;
            f26 = (aoLightValueXPos + aoLightValueXPosZPos + aoLightValueXPosYPos + aoLightValueXPosYPosZPos) / 4F;
            f25 = (aoLightValueXPosZNeg + aoLightValueXPos + aoLightValueXPosYPosZNeg + aoLightValueXPosYPos) / 4F;
            f24 = (aoLightValueXPosYNegZNeg + aoLightValueXPosYNeg + aoLightValueXPosZNeg + aoLightValueXPos) / 4F;
        } else
        {
            f23 = f24 = f25 = f26 = aoLightValueXPos;
        }
        colorRedTopLeft_SouthFace = colorRedBottomLeft_SouthFace = colorRedBottomRight_SouthFace = colorRedTopRight_SouthFace = (flag6 ? f : 1.0F) * 0.6F;
        colorGreenTopLeft_SouthFace = colorGreenBottomLeft_SouthFace = colorGreenBottomRight_SouthFace = colorGreenTopRight_SouthFace = (flag6 ? f1 : 1.0F) * 0.6F;
        colorBlueTopLeft_SouthFace = colorBlueBottomLeft_SouthFace = colorBlueBottomRight_SouthFace = colorBlueTopRight_SouthFace = (flag6 ? f2 : 1.0F) * 0.6F;
        colorRedTopLeft_SouthFace *= f23;
        colorGreenTopLeft_SouthFace *= f23;
        colorBlueTopLeft_SouthFace *= f23;
        colorRedBottomLeft_SouthFace *= f24;
        colorGreenBottomLeft_SouthFace *= f24;
        colorBlueBottomLeft_SouthFace *= f24;
        colorRedBottomRight_SouthFace *= f25;
        colorGreenBottomRight_SouthFace *= f25;
        colorBlueBottomRight_SouthFace *= f25;
        colorRedTopRight_SouthFace *= f26;
        colorGreenTopRight_SouthFace *= f26;
        colorBlueTopRight_SouthFace *= f26;
        int l1 = pb1.d(ali1, i, j, k, 5);
        colorRedSlopes = f;
        colorGreenSlopes = f1;
        colorBlueSlopes = f2;
        if(vl1.f || pb1.a(ali1, i, j - 1, k, 0))
        {
            renderSlopesBottomFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 0), l, vl1, pb1.d(ali1, i, j, k));
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i, j + 1, k, 1))
        {
            renderSlopesTopFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 0), l, vl1, pb1.d(ali1, i, j, k));
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i, j, k - 1, 2))
        {
            renderSlopesEastFace(pb1, i, j, k, i1, l, vl1, pb1.d(ali1, i, j, k));
            if(field_27511_cfgGrassFix && i1 == 3)
            {
                colorRedTopLeft_EastFace *= f;
                colorRedBottomLeft_EastFace *= f;
                colorRedBottomRight_EastFace *= f;
                colorRedTopRight_EastFace *= f;
                colorGreenTopLeft_EastFace *= f1;
                colorGreenBottomLeft_EastFace *= f1;
                colorGreenBottomRight_EastFace *= f1;
                colorGreenTopRight_EastFace *= f1;
                colorBlueTopLeft_EastFace *= f2;
                colorBlueBottomLeft_EastFace *= f2;
                colorBlueBottomRight_EastFace *= f2;
                colorBlueTopRight_EastFace *= f2;
                renderSlopesEastFace(pb1, i, j, k, 38, l, vl1, pb1.d(ali1, i, j, k));
            }
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i, j, k + 1, 3))
        {
            renderSlopesWestFace(pb1, i, j, k, j1, l, vl1, pb1.d(ali1, i, j, k));
            if(field_27511_cfgGrassFix && j1 == 3)
            {
                colorRedTopLeft_WestFace *= f;
                colorRedBottomLeft_WestFace *= f;
                colorRedBottomRight_WestFace *= f;
                colorRedTopRight_WestFace *= f;
                colorGreenTopLeft_WestFace *= f1;
                colorGreenBottomLeft_WestFace *= f1;
                colorGreenBottomRight_WestFace *= f1;
                colorGreenTopRight_WestFace *= f1;
                colorBlueTopLeft_WestFace *= f2;
                colorBlueBottomLeft_WestFace *= f2;
                colorBlueBottomRight_WestFace *= f2;
                colorBlueTopRight_WestFace *= f2;
                renderSlopesWestFace(pb1, i, j, k, 38, l, vl1, pb1.d(ali1, i, j, k));
            }
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i - 1, j, k, 4))
        {
            renderSlopesNorthFace(pb1, i, j, k, k1, l, vl1, pb1.d(ali1, i, j, k));
            if(field_27511_cfgGrassFix && k1 == 3)
            {
                colorRedTopLeft_NorthFace *= f;
                colorRedBottomLeft_NorthFace *= f;
                colorRedBottomRight_NorthFace *= f;
                colorRedTopRight_NorthFace *= f;
                colorGreenTopLeft_NorthFace *= f1;
                colorGreenBottomLeft_NorthFace *= f1;
                colorGreenBottomRight_NorthFace *= f1;
                colorGreenTopRight_NorthFace *= f1;
                colorBlueTopLeft_NorthFace *= f2;
                colorBlueBottomLeft_NorthFace *= f2;
                colorBlueBottomRight_NorthFace *= f2;
                colorBlueTopRight_NorthFace *= f2;
                renderSlopesNorthFace(pb1, i, j, k, 38, l, vl1, pb1.d(ali1, i, j, k));
            }
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i + 1, j, k, 5))
        {
            renderSlopesSouthFace(pb1, i, j, k, l1, l, vl1, pb1.d(ali1, i, j, k));
            if(field_27511_cfgGrassFix && l1 == 3)
            {
                colorRedTopLeft_SouthFace *= f;
                colorRedBottomLeft_SouthFace *= f;
                colorRedBottomRight_SouthFace *= f;
                colorRedTopRight_SouthFace *= f;
                colorGreenTopLeft_SouthFace *= f1;
                colorGreenBottomLeft_SouthFace *= f1;
                colorGreenBottomRight_SouthFace *= f1;
                colorGreenTopRight_SouthFace *= f1;
                colorBlueTopLeft_SouthFace *= f2;
                colorBlueBottomLeft_SouthFace *= f2;
                colorBlueBottomRight_SouthFace *= f2;
                colorBlueTopRight_SouthFace *= f2;
                renderSlopesSouthFace(pb1, i, j, k, 38, l, vl1, pb1.d(ali1, i, j, k));
            }
            flag = true;
        }
        enableAO = false;
        return flag;
    }

    public boolean renderSlopesBlockWithColorMultiplier(pb pb1, int i, int j, int k, float f, float f1, float f2, 
            int l, vl vl1, ali ali1)
    {
        adz adz1 = adz.a;
        boolean flag = false;
        float f3 = 0.5F;
        float f4 = 1.0F;
        float f5 = 0.8F;
        float f6 = 0.6F;
        float f7 = f4 * f;
        float f8 = f4 * f1;
        float f9 = f4 * f2;
        if(pb1 == pb.u)
            f = f1 = f2 = 1.0F;
        float f10 = f3 * f;
        float f11 = f5 * f;
        float f12 = f6 * f;
        float f13 = f3 * f1;
        float f14 = f5 * f1;
        float f15 = f6 * f1;
        float f16 = f3 * f2;
        float f17 = f5 * f2;
        float f18 = f6 * f2;
        float f19 = pb1.f(ali1, i, j, k);
        if((vl1.f || pb1.a(ali1, i, j - 1, k, 0)) && l / 4 != 2)
        {
            float f20 = pb1.f(ali1, i, j - 1, k);
            adz1.a(f10 * f20, f13 * f20, f16 * f20);
            renderSlopesBottomFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 0), l, vl1, pb1.d(ali1, i, j, k));
            flag = true;
        }
        if((vl1.f || pb1.a(ali1, i, j + 1, k, 1)) && l / 4 != 1)
        {
            float f21 = pb1.f(ali1, i, j + 1, k);
            if(pb1.bZ != 1.0D && !pb1.cd.d())
                f21 = f19;
            adz1.a(f7 * f21, f8 * f21, f9 * f21);
            renderSlopesTopFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 1), l, vl1, pb1.d(ali1, i, j, k));
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i, j, k - 1, 2) || l == 6 || l == 10 || l == 12)
        {
            if(l == 6)
            {
                float f22 = f19;
                adz1.a(f11 * f22, f14 * f22, f17 * f22);
                renderSlopesEastFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 1), l, vl1, pb1.d(ali1, i, j, k));
            } else
            if(l == 10)
            {
                float f23 = f19;
                adz1.a(f11 * f23, f14 * f23, f17 * f23);
                renderSlopesEastFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 0), l, vl1, pb1.d(ali1, i, j, k));
            } else
            if(l == 12)
            {
                float f24 = f19;
                adz1.a(f11 * f24, f14 * f24, f17 * f24);
                renderSlopesEastFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 2), l, vl1, pb1.d(ali1, i, j, k));
            } else
            {
                float f25 = pb1.f(ali1, i, j, k - 1);
                adz1.a(f11 * f25, f14 * f25, f17 * f25);
                renderSlopesEastFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 2), l, vl1, pb1.d(ali1, i, j, k));
            }
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i, j, k + 1, 3) || l == 7 || l == 11 || l == 13)
        {
            if(l == 7)
            {
                float f26 = f19;
                adz1.a(f11 * f26, f14 * f26, f17 * f26);
                renderSlopesWestFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 1), l, vl1, pb1.d(ali1, i, j, k));
            } else
            if(l == 11)
            {
                float f27 = f19;
                adz1.a(f11 * f27, f14 * f27, f17 * f27);
                renderSlopesWestFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 0), l, vl1, pb1.d(ali1, i, j, k));
            } else
            if(l == 13)
            {
                float f28 = f19;
                adz1.a(f11 * f28, f14 * f28, f17 * f28);
                renderSlopesWestFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 3), l, vl1, pb1.d(ali1, i, j, k));
            } else
            {
                float f29 = pb1.f(ali1, i, j, k + 1);
                adz1.a(f11 * f29, f14 * f29, f17 * f29);
                renderSlopesWestFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 3), l, vl1, pb1.d(ali1, i, j, k));
            }
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i - 1, j, k, 4) || l == 4 || l == 8 || l == 15)
        {
            if(l == 4)
            {
                float f30 = f19;
                adz1.a(f12 * f30, f15 * f30, f18 * f30);
                renderSlopesNorthFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 1), l, vl1, pb1.d(ali1, i, j, k));
            } else
            if(l == 8)
            {
                float f31 = f19;
                adz1.a(f12 * f31, f15 * f31, f18 * f31);
                renderSlopesNorthFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 0), l, vl1, pb1.d(ali1, i, j, k));
            } else
            if(l == 15)
            {
                float f32 = f19;
                adz1.a(f12 * f32, f15 * f32, f18 * f32);
                renderSlopesNorthFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 4), l, vl1, pb1.d(ali1, i, j, k));
            } else
            {
                float f33 = pb1.f(ali1, i - 1, j, k);
                adz1.a(f12 * f33, f15 * f33, f18 * f33);
                renderSlopesNorthFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 4), l, vl1, pb1.d(ali1, i, j, k));
            }
            flag = true;
        }
        if(vl1.f || pb1.a(ali1, i + 1, j, k, 5) || l == 5 || l == 9 || l == 14)
        {
            if(l == 5)
            {
                float f34 = f19;
                adz1.a(f12 * f34, f15 * f34, f18 * f34);
                renderSlopesSouthFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 1), l, vl1, pb1.d(ali1, i, j, k));
            } else
            if(l == 9)
            {
                float f35 = f19;
                adz1.a(f12 * f35, f15 * f35, f18 * f35);
                renderSlopesSouthFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 0), l, vl1, pb1.d(ali1, i, j, k));
            } else
            if(l == 14)
            {
                float f36 = f19;
                adz1.a(f12 * f36, f15 * f36, f18 * f36);
                renderSlopesSouthFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 5), l, vl1, pb1.d(ali1, i, j, k));
            } else
            {
                float f37 = pb1.f(ali1, i + 1, j, k);
                adz1.a(f12 * f37, f15 * f37, f18 * f37);
                renderSlopesSouthFace(pb1, i, j, k, pb1.d(ali1, i, j, k, 5), l, vl1, pb1.d(ali1, i, j, k));
            }
            flag = true;
        }
        return flag;
    }

    public void renderSlopesBottomFace(pb pb1, double d, double d1, double d2, 
            int i, int j, vl vl1, int k)
    {
        adz adz1 = adz.a;
        adz1.b(k);
        if(vl1.d >= 0)
            i = vl1.d;
        int l = (i & 0xf) << 4;
        int i1 = i & 0xf0;
        double d3 = ((double)l + pb1.bV * 16D) / 256D;
        double d4 = (((double)l + pb1.bY * 16D) - 0.01D) / 256D;
        double d5 = ((double)i1 + pb1.bX * 16D) / 256D;
        double d6 = (((double)i1 + pb1.ca * 16D) - 0.01D) / 256D;
        if(pb1.bV < 0.0D || pb1.bY > 1.0D)
        {
            d3 = ((float)l + 0.0F) / 256F;
            d4 = ((float)l + 15.99F) / 256F;
        }
        if(pb1.bX < 0.0D || pb1.ca > 1.0D)
        {
            d5 = ((float)i1 + 0.0F) / 256F;
            d6 = ((float)i1 + 15.99F) / 256F;
        }
        double d7 = d + pb1.bV;
        double d8 = d + pb1.bY;
        double d9 = d1 + pb1.bW;
        double d10 = d2 + pb1.bX;
        double d11 = d2 + pb1.ca;
        if(enableAO)
        {
            if(j == 4 || j == 5 || j == 6 || j == 7)
            {
                adz1.a(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
                adz1.a(d7, d9, d11, d3, d6);
                adz1.a(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
                adz1.a(d8, d9, d11, d4, d6);
            } else
            if(j == 12)
            {
                adz1.a(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
                adz1.a(d7, d9, d11, d3, d6);
                adz1.a(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
                adz1.a(d8, d9, d11, d4, d6);
            } else
            if(j == 13)
            {
                adz1.a(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
                adz1.a(d7, d9, d11, d3, d6);
                adz1.a(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
                adz1.a(d7, d9, d11, d3, d6);
            } else
            if(j == 14)
            {
                adz1.a(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
                adz1.a(d7, d9, d11, d3, d6);
                adz1.a(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
                adz1.a(d8, d9, d11, d4, d6);
            } else
            if(j == 15)
            {
                adz1.a(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
                adz1.a(d8, d9, d11, d4, d6);
            }
        } else
        if(j == 4 || j == 5 || j == 6 || j == 7)
        {
            adz1.a(d7, d9, d11, d3, d6);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d8, d9, d11, d4, d6);
        } else
        if(j == 12)
        {
            adz1.a(d7, d9, d11, d3, d6);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d8, d9, d11, d4, d6);
        } else
        if(j == 13)
        {
            adz1.a(d7, d9, d11, d3, d6);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d7, d9, d11, d3, d6);
        } else
        if(j == 14)
        {
            adz1.a(d7, d9, d11, d3, d6);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d9, d11, d4, d6);
        } else
        if(j == 15)
        {
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d8, d9, d11, d4, d6);
        }
    }

    public void renderSlopesTopFace(pb pb1, double d, double d1, double d2, 
            int i, int j, vl vl1, int k)
    {
        adz adz1 = adz.a;
        adz1.b(k);
        if(vl1.d >= 0)
            i = vl1.d;
        int l = (i & 0xf) << 4;
        int i1 = i & 0xf0;
        double d3 = ((double)l + pb1.bV * 16D) / 256D;
        double d4 = (((double)l + pb1.bY * 16D) - 0.01D) / 256D;
        double d5 = ((double)i1 + pb1.bX * 16D) / 256D;
        double d6 = (((double)i1 + pb1.ca * 16D) - 0.01D) / 256D;
        if(pb1.bV < 0.0D || pb1.bY > 1.0D)
        {
            d3 = ((float)l + 0.0F) / 256F;
            d4 = ((float)l + 15.99F) / 256F;
        }
        if(pb1.bX < 0.0D || pb1.ca > 1.0D)
        {
            d5 = ((float)i1 + 0.0F) / 256F;
            d6 = ((float)i1 + 15.99F) / 256F;
        }
        double d7 = d + pb1.bV;
        double d8 = d + pb1.bY;
        double d9 = d1 + pb1.bZ;
        double d10 = d2 + pb1.bX;
        double d11 = d2 + pb1.ca;
        if(enableAO)
        {
            if(j == 8 || j == 9 || j == 10 || j == 11)
            {
                adz1.a(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
                adz1.a(d7, d9, d11, d3, d6);
            } else
            if(j == 12)
            {
                adz1.a(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
                adz1.a(d7, d9, d11, d3, d6);
                adz1.a(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
                adz1.a(d7, d9, d11, d3, d6);
            } else
            if(j == 13)
            {
                adz1.a(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
                adz1.a(d7, d9, d11, d3, d6);
            } else
            if(j == 14)
            {
                adz1.a(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
                adz1.a(d7, d9, d11, d3, d6);
            } else
            if(j == 15)
            {
                adz1.a(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
                adz1.a(d8, d9, d10, d4, d5);
                adz1.a(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
                adz1.a(d7, d9, d10, d3, d5);
                adz1.a(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
                adz1.a(d8, d9, d11, d4, d6);
            }
        } else
        if(j == 8 || j == 9 || j == 10 || j == 11)
        {
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d7, d9, d11, d3, d6);
        } else
        if(j == 12)
        {
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d7, d9, d11, d3, d6);
            adz1.a(d7, d9, d11, d3, d6);
        } else
        if(j == 13)
        {
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d7, d9, d11, d3, d6);
        } else
        if(j == 14)
        {
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d7, d9, d11, d3, d6);
        } else
        if(j == 15)
        {
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d9, d10, d4, d5);
            adz1.a(d7, d9, d10, d3, d5);
            adz1.a(d8, d9, d11, d4, d6);
        }
    }

    public void renderSlopesEastFace(pb pb1, double d, double d1, double d2, 
            int i, int j, vl vl1, int k)
    {
        adz adz1 = adz.a;
        adz1.b(k);
        if(vl1.d >= 0)
            i = vl1.d;
        int l = (i & 0xf) << 4;
        int i1 = i & 0xf0;
        double d3 = ((double)l + pb1.bV * 16D) / 256D;
        double d4 = (((double)l + pb1.bY * 16D) - 0.01D) / 256D;
        double d5 = ((double)i1 + pb1.bW * 16D) / 256D;
        double d6 = (((double)i1 + pb1.bZ * 16D) - 0.01D) / 256D;
        if(vl1.e)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(pb1.bV < 0.0D || pb1.bY > 1.0D)
        {
            d3 = ((float)l + 0.0F) / 256F;
            d4 = ((float)l + 15.99F) / 256F;
        }
        if(pb1.bW < 0.0D || pb1.bZ > 1.0D)
        {
            d5 = ((float)i1 + 0.0F) / 256F;
            d6 = ((float)i1 + 15.99F) / 256F;
        }
        double d8 = d + pb1.bV;
        double d9 = d + pb1.bY;
        double d10 = d1 + pb1.bW;
        double d11 = d1 + pb1.bZ;
        double d12 = d2 + pb1.bX;
        double d13 = d2 + pb1.ca;
        if(enableAO)
        {
            if(j == 7 || j == 11 || j == 13 || j == 15)
            {
                adz1.a(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
                adz1.a(d8, d11, d12, d4, d5);
                adz1.a(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
                adz1.a(d9, d11, d12, d3, d5);
                adz1.a(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
                adz1.a(d9, d10, d12, d3, d6);
                adz1.a(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
                adz1.a(d8, d10, d12, d4, d6);
            } else
            if(j == 4)
            {
                adz1.a(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
                adz1.a(d8, d10, d12, d4, d6);
                adz1.a(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
                adz1.a(d9, d11, d12, d3, d5);
                adz1.a(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
                adz1.a(d9, d10, d12, d3, d6);
                adz1.a(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
                adz1.a(d8, d10, d12, d4, d6);
            } else
            if(j == 5)
            {
                adz1.a(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
                adz1.a(d8, d11, d12, d4, d5);
                adz1.a(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
                adz1.a(d9, d10, d12, d3, d6);
                adz1.a(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
                adz1.a(d9, d10, d12, d3, d6);
                adz1.a(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
                adz1.a(d8, d10, d12, d4, d6);
            } else
            if(j == 6)
            {
                adz1.a((colorRedSlopes * (aoLightValueYPos + aoLightValueXNegYPos) * (factorTop + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueYPos + aoLightValueXNegYPos) * (factorTop + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueYPos + aoLightValueXNegYPos) * (factorTop + factorEast)) / 4F);
                adz1.a(d8, d11, d13, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueYPos + aoLightValueXPosYPos) * (factorTop + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueYPos + aoLightValueXPosYPos) * (factorTop + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueYPos + aoLightValueXPosYPos) * (factorTop + factorEast)) / 4F);
                adz1.a(d9, d11, d13, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueZNeg + aoLightValueXPosZNeg) * (factorTop + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueZNeg + aoLightValueXPosZNeg) * (factorTop + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueZNeg + aoLightValueXPosZNeg) * (factorTop + factorEast)) / 4F);
                adz1.a(d9, d10, d12, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueZNeg + aoLightValueXNegZNeg) * (factorTop + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueZNeg + aoLightValueXNegZNeg) * (factorTop + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueZNeg + aoLightValueXNegZNeg) * (factorTop + factorEast)) / 4F);
                adz1.a(d8, d10, d12, d4, d6);
            } else
            if(j == 8)
            {
                adz1.a(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
                adz1.a(d8, d11, d12, d4, d5);
                adz1.a(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
                adz1.a(d9, d11, d12, d3, d5);
                adz1.a(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
                adz1.a(d9, d10, d12, d3, d6);
                adz1.a(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
                adz1.a(d8, d11, d12, d4, d5);
            } else
            if(j == 9)
            {
                adz1.a(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
                adz1.a(d8, d11, d12, d4, d5);
                adz1.a(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
                adz1.a(d9, d11, d12, d3, d5);
                adz1.a(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
                adz1.a(d9, d11, d12, d3, d5);
                adz1.a(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
                adz1.a(d8, d10, d12, d4, d6);
            } else
            if(j == 10)
            {
                adz1.a((colorRedSlopes * (aoLightValueZNeg + aoLightValueXNegZNeg) * (factorBottom + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueZNeg + aoLightValueXNegZNeg) * (factorBottom + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueZNeg + aoLightValueXNegZNeg) * (factorBottom + factorEast)) / 4F);
                adz1.a(d8, d11, d12, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueZNeg + aoLightValueXPosZNeg) * (factorBottom + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueZNeg + aoLightValueXPosZNeg) * (factorBottom + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueZNeg + aoLightValueXPosZNeg) * (factorBottom + factorEast)) / 4F);
                adz1.a(d9, d11, d12, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueYNeg + aoLightValueXPosYNeg) * (factorBottom + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueYNeg + aoLightValueXPosYNeg) * (factorBottom + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueYNeg + aoLightValueXPosYNeg) * (factorBottom + factorEast)) / 4F);
                adz1.a(d9, d10, d13, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueYNeg + aoLightValueXNegYNeg) * (factorBottom + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueYNeg + aoLightValueXNegYNeg) * (factorBottom + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueYNeg + aoLightValueXNegYNeg) * (factorBottom + factorEast)) / 4F);
                adz1.a(d8, d10, d13, d4, d6);
            } else
            if(j == 12)
            {
                adz1.a((colorRedSlopes * (aoLightValueXNeg + aoLightValueXNegYPos) * (factorNorth + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueXNeg + aoLightValueXNegYPos) * (factorNorth + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueXNeg + aoLightValueXNegYPos) * (factorNorth + factorEast)) / 4F);
                adz1.a(d8, d11, d13, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueZNeg + aoLightValueYPosZNeg) * (factorNorth + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueZNeg + aoLightValueYPosZNeg) * (factorNorth + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueZNeg + aoLightValueYPosZNeg) * (factorNorth + factorEast)) / 4F);
                adz1.a(d9, d11, d12, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueZNeg + aoLightValueYNegZNeg) * (factorNorth + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueZNeg + aoLightValueYNegZNeg) * (factorNorth + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueZNeg + aoLightValueYNegZNeg) * (factorNorth + factorEast)) / 4F);
                adz1.a(d9, d10, d12, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueXNeg + aoLightValueXNegYNeg) * (factorNorth + factorEast)) / 4F, (colorGreenSlopes * (aoLightValueXNeg + aoLightValueXNegYNeg) * (factorNorth + factorEast)) / 4F, (colorBlueSlopes * (aoLightValueXNeg + aoLightValueXNegYNeg) * (factorNorth + factorEast)) / 4F);
                adz1.a(d8, d10, d13, d4, d6);
            }
        } else
        if(j == 7 || j == 11 || j == 13 || j == 15)
        {
            adz1.a(d8, d11, d12, d4, d5);
            adz1.a(d9, d11, d12, d3, d5);
            adz1.a(d9, d10, d12, d3, d6);
            adz1.a(d8, d10, d12, d4, d6);
        } else
        if(j == 4)
        {
            adz1.a(d8, d10, d12, d4, d6);
            adz1.a(d9, d11, d12, d3, d5);
            adz1.a(d9, d10, d12, d3, d6);
            adz1.a(d8, d10, d12, d4, d6);
        } else
        if(j == 5)
        {
            adz1.a(d8, d11, d12, d4, d5);
            adz1.a(d9, d10, d12, d3, d6);
            adz1.a(d9, d10, d12, d3, d6);
            adz1.a(d8, d10, d12, d4, d6);
        } else
        if(j == 6)
        {
            adz1.a(d8, d11, d13, d4, d5);
            adz1.a(d9, d11, d13, d3, d5);
            adz1.a(d9, d10, d12, d3, d6);
            adz1.a(d8, d10, d12, d4, d6);
        } else
        if(j == 8)
        {
            adz1.a(d8, d11, d12, d4, d5);
            adz1.a(d9, d11, d12, d3, d5);
            adz1.a(d9, d10, d12, d3, d6);
            adz1.a(d8, d11, d12, d4, d5);
        } else
        if(j == 9)
        {
            adz1.a(d8, d11, d12, d4, d5);
            adz1.a(d9, d11, d12, d3, d5);
            adz1.a(d9, d11, d12, d3, d5);
            adz1.a(d8, d10, d12, d4, d6);
        } else
        if(j == 10)
        {
            adz1.a(d8, d11, d12, d4, d5);
            adz1.a(d9, d11, d12, d3, d5);
            adz1.a(d9, d10, d13, d3, d6);
            adz1.a(d8, d10, d13, d4, d6);
        } else
        if(j == 12)
        {
            adz1.a(d8, d11, d13, d4, d5);
            adz1.a(d9, d11, d12, d3, d5);
            adz1.a(d9, d10, d12, d3, d6);
            adz1.a(d8, d10, d13, d4, d6);
        }
    }

    public void renderSlopesWestFace(pb pb1, double d, double d1, double d2, 
            int i, int j, vl vl1, int k)
    {
        adz adz1 = adz.a;
        adz1.b(k);
        if(vl1.d >= 0)
            i = vl1.d;
        int l = (i & 0xf) << 4;
        int i1 = i & 0xf0;
        double d3 = ((double)l + pb1.bV * 16D) / 256D;
        double d4 = (((double)l + pb1.bY * 16D) - 0.01D) / 256D;
        double d5 = ((double)i1 + pb1.bW * 16D) / 256D;
        double d6 = (((double)i1 + pb1.bZ * 16D) - 0.01D) / 256D;
        if(vl1.e)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(pb1.bV < 0.0D || pb1.bY > 1.0D)
        {
            d3 = ((float)l + 0.0F) / 256F;
            d4 = ((float)l + 15.99F) / 256F;
        }
        if(pb1.bW < 0.0D || pb1.bZ > 1.0D)
        {
            d5 = ((float)i1 + 0.0F) / 256F;
            d6 = ((float)i1 + 15.99F) / 256F;
        }
        double d8 = d + pb1.bV;
        double d9 = d + pb1.bY;
        double d10 = d1 + pb1.bW;
        double d11 = d1 + pb1.bZ;
        double d12 = d2 + pb1.ca;
        double d13 = d2 + pb1.bX;
        if(enableAO)
        {
            if(j == 6 || j == 10 || j == 12 || j == 14)
            {
                adz1.a(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
                adz1.a(d8, d11, d12, d3, d5);
                adz1.a(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
                adz1.a(d8, d10, d12, d3, d6);
                adz1.a(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
                adz1.a(d9, d10, d12, d4, d6);
                adz1.a(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
                adz1.a(d9, d11, d12, d4, d5);
            } else
            if(j == 4)
            {
                adz1.a(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
                adz1.a(d8, d10, d12, d3, d6);
                adz1.a(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
                adz1.a(d8, d10, d12, d3, d6);
                adz1.a(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
                adz1.a(d9, d10, d12, d4, d6);
                adz1.a(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
                adz1.a(d9, d11, d12, d4, d5);
            } else
            if(j == 5)
            {
                adz1.a(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
                adz1.a(d8, d11, d12, d3, d5);
                adz1.a(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
                adz1.a(d8, d10, d12, d3, d6);
                adz1.a(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
                adz1.a(d9, d10, d12, d4, d6);
                adz1.a(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
                adz1.a(d9, d10, d12, d4, d6);
            } else
            if(j == 7)
            {
                adz1.a((colorRedSlopes * (aoLightValueYPos + aoLightValueXNegYPos) * (factorTop + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueYPos + aoLightValueXNegYPos) * (factorTop + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueYPos + aoLightValueXNegYPos) * (factorTop + factorWest)) / 4F);
                adz1.a(d8, d11, d13, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueZPos + aoLightValueXNegZPos) * (factorTop + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueZPos + aoLightValueXNegZPos) * (factorTop + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueZPos + aoLightValueXNegZPos) * (factorTop + factorWest)) / 4F);
                adz1.a(d8, d10, d12, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueZPos + aoLightValueXPosZPos) * (factorTop + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueZPos + aoLightValueXPosZPos) * (factorTop + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueZPos + aoLightValueXPosZPos) * (factorTop + factorWest)) / 4F);
                adz1.a(d9, d10, d12, d4, d6);
                adz1.a((colorRedSlopes * (aoLightValueYPos + aoLightValueXPosYPos) * (factorTop + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueYPos + aoLightValueXPosYPos) * (factorTop + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueYPos + aoLightValueXPosYPos) * (factorTop + factorWest)) / 4F);
                adz1.a(d9, d11, d13, d4, d5);
            } else
            if(j == 8)
            {
                adz1.a(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
                adz1.a(d8, d11, d12, d3, d5);
                adz1.a(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
                adz1.a(d8, d11, d12, d3, d5);
                adz1.a(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
                adz1.a(d9, d10, d12, d4, d6);
                adz1.a(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
                adz1.a(d9, d11, d12, d4, d5);
            } else
            if(j == 9)
            {
                adz1.a(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
                adz1.a(d8, d11, d12, d3, d5);
                adz1.a(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
                adz1.a(d8, d10, d12, d3, d6);
                adz1.a(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
                adz1.a(d9, d11, d12, d4, d5);
                adz1.a(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
                adz1.a(d9, d11, d12, d4, d5);
            } else
            if(j == 11)
            {
                adz1.a((colorRedSlopes * (aoLightValueZPos + aoLightValueXNegZPos) * (factorBottom + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueZPos + aoLightValueXNegZPos) * (factorBottom + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueZPos + aoLightValueXNegZPos) * (factorBottom + factorWest)) / 4F);
                adz1.a(d8, d11, d12, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueYNeg + aoLightValueXNegYNeg) * (factorBottom + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueYNeg + aoLightValueXNegYNeg) * (factorBottom + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueYNeg + aoLightValueXNegYNeg) * (factorBottom + factorWest)) / 4F);
                adz1.a(d8, d10, d13, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueYNeg + aoLightValueXPosYNeg) * (factorBottom + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueYNeg + aoLightValueXPosYNeg) * (factorBottom + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueYNeg + aoLightValueXPosYNeg) * (factorBottom + factorWest)) / 4F);
                adz1.a(d9, d10, d13, d4, d6);
                adz1.a((colorRedSlopes * (aoLightValueZPos + aoLightValueXPosZPos) * (factorBottom + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueZPos + aoLightValueXPosZPos) * (factorBottom + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueZPos + aoLightValueXPosZPos) * (factorBottom + factorWest)) / 4F);
                adz1.a(d9, d11, d12, d4, d5);
            } else
            if(j == 13)
            {
                adz1.a((colorRedSlopes * (aoLightValueZPos + aoLightValueYPosZPos) * (factorSouth + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueZPos + aoLightValueYPosZPos) * (factorSouth + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueZPos + aoLightValueYPosZPos) * (factorSouth + factorWest)) / 4F);
                adz1.a(d8, d11, d12, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueZPos + aoLightValueYNegZPos) * (factorSouth + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueZPos + aoLightValueYNegZPos) * (factorSouth + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueZPos + aoLightValueYNegZPos) * (factorSouth + factorWest)) / 4F);
                adz1.a(d8, d10, d12, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueXPos + aoLightValueXPosYNeg) * (factorSouth + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueXPos + aoLightValueXPosYNeg) * (factorSouth + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueXPos + aoLightValueXPosYNeg) * (factorSouth + factorWest)) / 4F);
                adz1.a(d9, d10, d13, d4, d6);
                adz1.a((colorRedSlopes * (aoLightValueXPos + aoLightValueXPosYPos) * (factorSouth + factorWest)) / 4F, (colorGreenSlopes * (aoLightValueXPos + aoLightValueXPosYPos) * (factorSouth + factorWest)) / 4F, (colorBlueSlopes * (aoLightValueXPos + aoLightValueXPosYPos) * (factorSouth + factorWest)) / 4F);
                adz1.a(d9, d11, d13, d4, d5);
            }
        } else
        if(j == 6 || j == 10 || j == 12 || j == 14)
        {
            adz1.a(d8, d11, d12, d3, d5);
            adz1.a(d8, d10, d12, d3, d6);
            adz1.a(d9, d10, d12, d4, d6);
            adz1.a(d9, d11, d12, d4, d5);
        } else
        if(j == 4)
        {
            adz1.a(d8, d10, d12, d3, d6);
            adz1.a(d8, d10, d12, d3, d6);
            adz1.a(d9, d10, d12, d4, d6);
            adz1.a(d9, d11, d12, d4, d5);
        } else
        if(j == 5)
        {
            adz1.a(d8, d11, d12, d3, d5);
            adz1.a(d8, d10, d12, d3, d6);
            adz1.a(d9, d10, d12, d4, d6);
            adz1.a(d9, d10, d12, d4, d6);
        } else
        if(j == 7)
        {
            adz1.a(d8, d11, d13, d3, d5);
            adz1.a(d8, d10, d12, d3, d6);
            adz1.a(d9, d10, d12, d4, d6);
            adz1.a(d9, d11, d13, d4, d5);
        } else
        if(j == 8)
        {
            adz1.a(d8, d11, d12, d3, d5);
            adz1.a(d8, d11, d12, d3, d5);
            adz1.a(d9, d10, d12, d4, d6);
            adz1.a(d9, d11, d12, d4, d5);
        } else
        if(j == 9)
        {
            adz1.a(d8, d11, d12, d3, d5);
            adz1.a(d8, d10, d12, d3, d6);
            adz1.a(d9, d11, d12, d4, d5);
            adz1.a(d9, d11, d12, d4, d5);
        } else
        if(j == 11)
        {
            adz1.a(d8, d11, d12, d3, d5);
            adz1.a(d8, d10, d13, d3, d6);
            adz1.a(d9, d10, d13, d4, d6);
            adz1.a(d9, d11, d12, d4, d5);
        } else
        if(j == 13)
        {
            adz1.a(d8, d11, d12, d3, d5);
            adz1.a(d8, d10, d12, d3, d6);
            adz1.a(d9, d10, d13, d4, d6);
            adz1.a(d9, d11, d13, d4, d5);
        }
    }

    public void renderSlopesNorthFace(pb pb1, double d, double d1, double d2, 
            int i, int j, vl vl1, int k)
    {
        adz adz1 = adz.a;
        adz1.b(k);
        if(vl1.d >= 0)
            i = vl1.d;
        int l = (i & 0xf) << 4;
        int i1 = i & 0xf0;
        double d3 = ((double)l + pb1.bX * 16D) / 256D;
        double d4 = (((double)l + pb1.ca * 16D) - 0.01D) / 256D;
        double d5 = ((double)i1 + pb1.bW * 16D) / 256D;
        double d6 = (((double)i1 + pb1.bZ * 16D) - 0.01D) / 256D;
        if(vl1.e)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(pb1.bX < 0.0D || pb1.ca > 1.0D)
        {
            d3 = ((float)l + 0.0F) / 256F;
            d4 = ((float)l + 15.99F) / 256F;
        }
        if(pb1.bW < 0.0D || pb1.bZ > 1.0D)
        {
            d5 = ((float)i1 + 0.0F) / 256F;
            d6 = ((float)i1 + 15.99F) / 256F;
        }
        double d8 = d + pb1.bV;
        double d9 = d1 + pb1.bW;
        double d10 = d1 + pb1.bZ;
        double d11 = d2 + pb1.bX;
        double d12 = d2 + pb1.ca;
        double d13 = d + pb1.bY;
        if(enableAO)
        {
            if(j == 5 || j == 9 || j == 13 || j == 14)
            {
                adz1.a(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
                adz1.a(d8, d10, d12, d4, d5);
                adz1.a(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
                adz1.a(d8, d10, d11, d3, d5);
                adz1.a(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
                adz1.a(d8, d9, d11, d3, d6);
                adz1.a(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
                adz1.a(d8, d9, d12, d4, d6);
            } else
            if(j == 4)
            {
                adz1.a((colorRedSlopes * (aoLightValueYPos + aoLightValueYPosZPos) * (factorTop + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueYPos + aoLightValueYPosZPos) * (factorTop + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueYPos + aoLightValueYPosZPos) * (factorTop + factorNorth)) / 4F);
                adz1.a(d13, d10, d12, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueYPos + aoLightValueYPosZNeg) * (factorTop + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueYPos + aoLightValueYPosZNeg) * (factorTop + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueYPos + aoLightValueYPosZNeg) * (factorTop + factorNorth)) / 4F);
                adz1.a(d13, d10, d11, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueXNeg + aoLightValueXNegZNeg) * (factorTop + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueXNeg + aoLightValueXNegZNeg) * (factorTop + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueXNeg + aoLightValueXNegZNeg) * (factorTop + factorNorth)) / 4F);
                adz1.a(d8, d9, d11, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueXNeg + aoLightValueXNegZPos) * (factorTop + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueXNeg + aoLightValueXNegZPos) * (factorTop + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueXNeg + aoLightValueXNegZPos) * (factorTop + factorNorth)) / 4F);
                adz1.a(d8, d9, d12, d4, d6);
            } else
            if(j == 6)
            {
                adz1.a(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
                adz1.a(d8, d10, d12, d4, d5);
                adz1.a(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
                adz1.a(d8, d9, d11, d3, d6);
                adz1.a(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
                adz1.a(d8, d9, d11, d3, d6);
                adz1.a(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
                adz1.a(d8, d9, d12, d4, d6);
            } else
            if(j == 7)
            {
                adz1.a(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
                adz1.a(d8, d9, d12, d4, d6);
                adz1.a(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
                adz1.a(d8, d10, d11, d3, d5);
                adz1.a(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
                adz1.a(d8, d9, d11, d3, d6);
                adz1.a(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
                adz1.a(d8, d9, d12, d4, d6);
            } else
            if(j == 8)
            {
                adz1.a((colorRedSlopes * (aoLightValueXNeg + aoLightValueXNegZPos) * (factorBottom + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueXNeg + aoLightValueXNegZPos) * (factorBottom + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueXNeg + aoLightValueXNegZPos) * (factorBottom + factorNorth)) / 4F);
                adz1.a(d8, d10, d12, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueXNeg + aoLightValueXNegZNeg) * (factorBottom + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueXNeg + aoLightValueXNegZNeg) * (factorBottom + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueXNeg + aoLightValueXNegZNeg) * (factorBottom + factorNorth)) / 4F);
                adz1.a(d8, d10, d11, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueYNeg + aoLightValueYNegZNeg) * (factorBottom + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueYNeg + aoLightValueYNegZNeg) * (factorBottom + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueYNeg + aoLightValueYNegZNeg) * (factorBottom + factorNorth)) / 4F);
                adz1.a(d13, d9, d11, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueYNeg + aoLightValueYNegZPos) * (factorBottom + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueYNeg + aoLightValueYNegZPos) * (factorBottom + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueYNeg + aoLightValueYNegZPos) * (factorBottom + factorNorth)) / 4F);
                adz1.a(d13, d9, d12, d4, d6);
            } else
            if(j == 10)
            {
                adz1.a(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
                adz1.a(d8, d10, d12, d4, d5);
                adz1.a(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
                adz1.a(d8, d10, d11, d3, d5);
                adz1.a(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
                adz1.a(d8, d10, d11, d3, d5);
                adz1.a(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
                adz1.a(d8, d9, d12, d4, d6);
            } else
            if(j == 11)
            {
                adz1.a(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
                adz1.a(d8, d10, d12, d4, d5);
                adz1.a(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
                adz1.a(d8, d10, d11, d3, d5);
                adz1.a(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
                adz1.a(d8, d9, d11, d3, d6);
                adz1.a(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
                adz1.a(d8, d10, d12, d4, d5);
            } else
            if(j == 15)
            {
                adz1.a((colorRedSlopes * (aoLightValueZPos + aoLightValueYPosZPos) * (factorWest + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueZPos + aoLightValueYPosZPos) * (factorWest + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueZPos + aoLightValueYPosZPos) * (factorWest + factorNorth)) / 4F);
                adz1.a(d13, d10, d12, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueXNeg + aoLightValueXNegYPos) * (factorWest + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueXNeg + aoLightValueXNegYPos) * (factorWest + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueXNeg + aoLightValueXNegYPos) * (factorWest + factorNorth)) / 4F);
                adz1.a(d8, d10, d11, d3, d5);
                adz1.a((colorRedSlopes * (aoLightValueXNeg + aoLightValueXNegYNeg) * (factorWest + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueXNeg + aoLightValueXNegYNeg) * (factorWest + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueXNeg + aoLightValueXNegYNeg) * (factorWest + factorNorth)) / 4F);
                adz1.a(d8, d9, d11, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueZPos + aoLightValueYNegZPos) * (factorWest + factorNorth)) / 4F, (colorGreenSlopes * (aoLightValueZPos + aoLightValueYNegZPos) * (factorWest + factorNorth)) / 4F, (colorBlueSlopes * (aoLightValueZPos + aoLightValueYNegZPos) * (factorWest + factorNorth)) / 4F);
                adz1.a(d13, d9, d12, d4, d6);
            }
        } else
        if(j == 5 || j == 9 || j == 13 || j == 14)
        {
            adz1.a(d8, d10, d12, d4, d5);
            adz1.a(d8, d10, d11, d3, d5);
            adz1.a(d8, d9, d11, d3, d6);
            adz1.a(d8, d9, d12, d4, d6);
        } else
        if(j == 4)
        {
            adz1.a(d13, d10, d12, d4, d5);
            adz1.a(d13, d10, d11, d3, d5);
            adz1.a(d8, d9, d11, d3, d6);
            adz1.a(d8, d9, d12, d4, d6);
        } else
        if(j == 6)
        {
            adz1.a(d8, d10, d12, d4, d5);
            adz1.a(d8, d9, d11, d3, d6);
            adz1.a(d8, d9, d11, d3, d6);
            adz1.a(d8, d9, d12, d4, d6);
        } else
        if(j == 7)
        {
            adz1.a(d8, d9, d12, d4, d6);
            adz1.a(d8, d10, d11, d3, d5);
            adz1.a(d8, d9, d11, d3, d6);
            adz1.a(d8, d9, d12, d4, d6);
        } else
        if(j == 8)
        {
            adz1.a(d8, d10, d12, d4, d5);
            adz1.a(d8, d10, d11, d3, d5);
            adz1.a(d13, d9, d11, d3, d6);
            adz1.a(d13, d9, d12, d4, d6);
        } else
        if(j == 10)
        {
            adz1.a(d8, d10, d12, d4, d5);
            adz1.a(d8, d10, d11, d3, d5);
            adz1.a(d8, d10, d11, d3, d5);
            adz1.a(d8, d9, d12, d4, d6);
        } else
        if(j == 11)
        {
            adz1.a(d8, d10, d12, d4, d5);
            adz1.a(d8, d10, d11, d3, d5);
            adz1.a(d8, d9, d11, d3, d6);
            adz1.a(d8, d10, d12, d4, d5);
        } else
        if(j == 15)
        {
            adz1.a(d13, d10, d12, d4, d5);
            adz1.a(d8, d10, d11, d3, d5);
            adz1.a(d8, d9, d11, d3, d6);
            adz1.a(d13, d9, d12, d4, d6);
        }
    }

    public void renderSlopesSouthFace(pb pb1, double d, double d1, double d2, 
            int i, int j, vl vl1, int k)
    {
        adz adz1 = adz.a;
        adz1.b(k);
        if(vl1.d >= 0)
            i = vl1.d;
        int l = (i & 0xf) << 4;
        int i1 = i & 0xf0;
        double d3 = ((double)l + pb1.bX * 16D) / 256D;
        double d4 = (((double)l + pb1.ca * 16D) - 0.01D) / 256D;
        double d5 = ((double)i1 + pb1.bW * 16D) / 256D;
        double d6 = (((double)i1 + pb1.bZ * 16D) - 0.01D) / 256D;
        if(vl1.e)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(pb1.bX < 0.0D || pb1.ca > 1.0D)
        {
            d3 = ((float)l + 0.0F) / 256F;
            d4 = ((float)l + 15.99F) / 256F;
        }
        if(pb1.bW < 0.0D || pb1.bZ > 1.0D)
        {
            d5 = ((float)i1 + 0.0F) / 256F;
            d6 = ((float)i1 + 15.99F) / 256F;
        }
        double d8 = d + pb1.bY;
        double d9 = d1 + pb1.bW;
        double d10 = d1 + pb1.bZ;
        double d11 = d2 + pb1.bX;
        double d12 = d2 + pb1.ca;
        double d13 = d + pb1.bV;
        if(enableAO)
        {
            if(j == 4 || j == 8 || j == 12 || j == 15)
            {
                adz1.a(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
                adz1.a(d8, d9, d12, d3, d6);
                adz1.a(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
                adz1.a(d8, d10, d11, d4, d5);
                adz1.a(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
                adz1.a(d8, d10, d12, d3, d5);
            } else
            if(j == 5)
            {
                adz1.a((colorRedSlopes * (aoLightValueXPos + aoLightValueXPosZPos) * (factorTop + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueXPos + aoLightValueXPosZPos) * (factorTop + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueXPos + aoLightValueXPosZPos) * (factorTop + factorSouth)) / 4F);
                adz1.a(d8, d9, d12, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueXPos + aoLightValueXPosZNeg) * (factorTop + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueXPos + aoLightValueXPosZNeg) * (factorTop + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueXPos + aoLightValueXPosZNeg) * (factorTop + factorSouth)) / 4F);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a((colorRedSlopes * (aoLightValueYPos + aoLightValueYPosZNeg) * (factorTop + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueYPos + aoLightValueYPosZNeg) * (factorTop + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueYPos + aoLightValueYPosZNeg) * (factorTop + factorSouth)) / 4F);
                adz1.a(d13, d10, d11, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueYPos + aoLightValueYPosZPos) * (factorTop + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueYPos + aoLightValueYPosZPos) * (factorTop + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueYPos + aoLightValueYPosZPos) * (factorTop + factorSouth)) / 4F);
                adz1.a(d13, d10, d12, d3, d5);
            } else
            if(j == 6)
            {
                adz1.a(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
                adz1.a(d8, d9, d12, d3, d6);
                adz1.a(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
                adz1.a(d8, d10, d12, d3, d5);
            } else
            if(j == 7)
            {
                adz1.a(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
                adz1.a(d8, d9, d12, d3, d6);
                adz1.a(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
                adz1.a(d8, d10, d11, d4, d5);
                adz1.a(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
                adz1.a(d8, d9, d12, d3, d6);
            } else
            if(j == 9)
            {
                adz1.a((colorRedSlopes * (aoLightValueYNeg + aoLightValueYNegZPos) * (factorBottom + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueYNeg + aoLightValueYNegZPos) * (factorBottom + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueYNeg + aoLightValueYNegZPos) * (factorBottom + factorSouth)) / 4F);
                adz1.a(d13, d9, d12, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueYNeg + aoLightValueYNegZNeg) * (factorBottom + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueYNeg + aoLightValueYNegZNeg) * (factorBottom + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueYNeg + aoLightValueYNegZNeg) * (factorBottom + factorSouth)) / 4F);
                adz1.a(d13, d9, d11, d4, d6);
                adz1.a((colorRedSlopes * (aoLightValueXPos + aoLightValueXPosZNeg) * (factorBottom + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueXPos + aoLightValueXPosZNeg) * (factorBottom + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueXPos + aoLightValueXPosZNeg) * (factorBottom + factorSouth)) / 4F);
                adz1.a(d8, d10, d11, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueXPos + aoLightValueXPosZPos) * (factorBottom + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueXPos + aoLightValueXPosZPos) * (factorBottom + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueXPos + aoLightValueXPosZPos) * (factorBottom + factorSouth)) / 4F);
                adz1.a(d8, d10, d12, d3, d5);
            } else
            if(j == 10)
            {
                adz1.a(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
                adz1.a(d8, d9, d12, d3, d6);
                adz1.a(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
                adz1.a(d8, d10, d11, d4, d5);
                adz1.a(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
                adz1.a(d8, d10, d11, d4, d5);
                adz1.a(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
                adz1.a(d8, d10, d12, d3, d5);
            } else
            if(j == 11)
            {
                adz1.a(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
                adz1.a(d8, d10, d12, d3, d5);
                adz1.a(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
                adz1.a(d8, d9, d11, d4, d6);
                adz1.a(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
                adz1.a(d8, d10, d11, d4, d5);
                adz1.a(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
                adz1.a(d8, d10, d12, d3, d5);
            } else
            if(j == 14)
            {
                adz1.a((colorRedSlopes * (aoLightValueXPos + aoLightValueXPosYNeg) * (factorEast + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueXPos + aoLightValueXPosYNeg) * (factorEast + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueXPos + aoLightValueXPosYNeg) * (factorEast + factorSouth)) / 4F);
                adz1.a(d8, d9, d12, d3, d6);
                adz1.a((colorRedSlopes * (aoLightValueZNeg + aoLightValueYNegZNeg) * (factorEast + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueZNeg + aoLightValueYNegZNeg) * (factorEast + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueZNeg + aoLightValueYNegZNeg) * (factorEast + factorSouth)) / 4F);
                adz1.a(d13, d9, d11, d4, d6);
                adz1.a((colorRedSlopes * (aoLightValueZNeg + aoLightValueYPosZNeg) * (factorEast + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueZNeg + aoLightValueYPosZNeg) * (factorEast + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueZNeg + aoLightValueYPosZNeg) * (factorEast + factorSouth)) / 4F);
                adz1.a(d13, d10, d11, d4, d5);
                adz1.a((colorRedSlopes * (aoLightValueXPos + aoLightValueXPosYPos) * (factorEast + factorSouth)) / 4F, (colorGreenSlopes * (aoLightValueXPos + aoLightValueXPosYPos) * (factorEast + factorSouth)) / 4F, (colorBlueSlopes * (aoLightValueXPos + aoLightValueXPosYPos) * (factorEast + factorSouth)) / 4F);
                adz1.a(d8, d10, d12, d3, d5);
            }
        } else
        if(j == 4 || j == 8 || j == 12 || j == 15)
        {
            adz1.a(d8, d9, d12, d3, d6);
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d10, d11, d4, d5);
            adz1.a(d8, d10, d12, d3, d5);
        } else
        if(j == 5)
        {
            adz1.a(d8, d9, d12, d3, d6);
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d13, d10, d11, d4, d5);
            adz1.a(d13, d10, d12, d3, d5);
        } else
        if(j == 6)
        {
            adz1.a(d8, d9, d12, d3, d6);
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d10, d12, d3, d5);
        } else
        if(j == 7)
        {
            adz1.a(d8, d9, d12, d3, d6);
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d10, d11, d4, d5);
            adz1.a(d8, d9, d12, d3, d6);
        } else
        if(j == 9)
        {
            adz1.a(d13, d9, d12, d3, d6);
            adz1.a(d13, d9, d11, d4, d6);
            adz1.a(d8, d10, d11, d4, d5);
            adz1.a(d8, d10, d12, d3, d5);
        } else
        if(j == 10)
        {
            adz1.a(d8, d9, d12, d3, d6);
            adz1.a(d8, d10, d11, d4, d5);
            adz1.a(d8, d10, d11, d4, d5);
            adz1.a(d8, d10, d12, d3, d5);
        } else
        if(j == 11)
        {
            adz1.a(d8, d10, d12, d3, d5);
            adz1.a(d8, d9, d11, d4, d6);
            adz1.a(d8, d10, d11, d4, d5);
            adz1.a(d8, d10, d12, d3, d5);
        } else
        if(j == 14)
        {
            adz1.a(d8, d9, d12, d3, d6);
            adz1.a(d13, d9, d11, d4, d6);
            adz1.a(d13, d10, d11, d4, d5);
            adz1.a(d8, d10, d12, d3, d5);
        }
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
    public static final pb BlockKaevWoodSlopes;
    public static final pb BlockKaevCobblestoneSlopes;
    public static final pb BlockKaevGlassSlopes;
    public static final pb BlockKaevSandstoneSlopes;
    public static final pb BlockKaevDirtSlopes;
    public static final pb BlockKaevStoneSlopes;
    public static final pb BlockKaevSandSlopes;
    public static final pb BlockKaevSnowSlopes;
    public static final pb BlockKaevGrassSlopes;
    public static final pb BlockKaevBricksSlopes;
    public static final pb BlockKaevGravelSlopes;
    public static final pb BlockKaevGoldSlopes;
    public static final pb BlockKaevSteelSlopes;
    public static final pb BlockKaevObsidianSlopes;
    public static final pb BlockKaevDiamondSlopes;
    public static final pb BlockKaevWhiteWoolSlopes;
    public static final pb BlockKaevBlackWoolSlopes;
    public static final pb BlockKaevRedWoolSlopes;
    public static final pb BlockKaevGreenWoolSlopes;
    public static final pb BlockKaevBrownWoolSlopes;
    public static final pb BlockKaevBlueWoolSlopes;
    public static final pb BlockKaevPurpleWoolSlopes;
    public static final pb BlockKaevCyanWoolSlopes;
    public static final pb BlockKaevSilverWoolSlopes;
    public static final pb BlockKaevGrayWoolSlopes;
    public static final pb BlockKaevPinkWoolSlopes;
    public static final pb BlockKaevLimeWoolSlopes;
    public static final pb BlockKaevYellowWoolSlopes;
    public static final pb BlockKaevLightBlueWoolSlopes;
    public static final pb BlockKaevMagentaWoolSlopes;
    public static final pb BlockKaevOrangeWoolSlopes;
    public static yr ItemKaevWoodSlopes;
    public static yr ItemKaevCobblestoneSlopes;
    public static yr ItemKaevGlassSlopes;
    public static yr ItemKaevSandstoneSlopes;
    public static yr ItemKaevDirtSlopes;
    public static yr ItemKaevStoneSlopes;
    public static yr ItemKaevSandSlopes;
    public static yr ItemKaevSnowSlopes;
    public static yr ItemKaevGrassSlopes;
    public static yr ItemKaevBricksSlopes;
    public static yr ItemKaevGravelSlopes;
    public static yr ItemKaevGoldSlopes;
    public static yr ItemKaevSteelSlopes;
    public static yr ItemKaevObsidianSlopes;
    public static yr ItemKaevDiamondSlopes;
    public static yr ItemKaevWhiteWoolSlopes;
    public static yr ItemKaevBlackWoolSlopes;
    public static yr ItemKaevRedWoolSlopes;
    public static yr ItemKaevGreenWoolSlopes;
    public static yr ItemKaevBrownWoolSlopes;
    public static yr ItemKaevBlueWoolSlopes;
    public static yr ItemKaevPurpleWoolSlopes;
    public static yr ItemKaevCyanWoolSlopes;
    public static yr ItemKaevSilverWoolSlopes;
    public static yr ItemKaevGrayWoolSlopes;
    public static yr ItemKaevPinkWoolSlopes;
    public static yr ItemKaevLimeWoolSlopes;
    public static yr ItemKaevYellowWoolSlopes;
    public static yr ItemKaevLightBlueWoolSlopes;
    public static yr ItemKaevMagentaWoolSlopes;
    public static yr ItemKaevOrangeWoolSlopes;
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
            BlockKaevWoodSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevWoodSlopes"), 4, acn.d)).c(2.0F).a(pb.e).b(5F).a("BlockKaevWoodSlopes");
            ItemKaevWoodSlopes = (new ItemSlopes_Kaevator(BlockKaevWoodSlopes.bO - 256, "Wood")).a("ItemKaevWoodSlopes");
        } else
        {
            BlockKaevWoodSlopes = pb.t;
        }
        if(props.getInt("BlockKaevCobblestoneSlopes") != 0)
        {
            BlockKaevCobblestoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevCobblestoneSlopes"), 16, acn.e)).c(2.0F).a(pb.h).b(10F).a("BlockKaevCobblestoneSlopes");
            ItemKaevCobblestoneSlopes = (new ItemSlopes_Kaevator(BlockKaevCobblestoneSlopes.bO - 256, "Cobblestone")).a("ItemKaevCobblestoneSlopes");
        } else
        {
            BlockKaevCobblestoneSlopes = pb.t;
        }
        if(props.getInt("BlockKaevGlassSlopes") != 0)
        {
            BlockKaevGlassSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGlassSlopes"), 49, acn.q)).c(0.3F).a(pb.j).a("BlockKaevGlassSlopes");
            ItemKaevGlassSlopes = (new ItemSlopes_Kaevator(BlockKaevGlassSlopes.bO - 256, "Glass")).a("ItemKaevGlassSlopes");
        } else
        {
            BlockKaevGlassSlopes = pb.t;
        }
        if(props.getInt("BlockKaevSandstoneSlopes") != 0)
        {
            BlockKaevSandstoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSandstoneSlopes"), 192, acn.e)).c(0.8F).a(pb.h).a("BlockKaevSandstoneSlopes");
            ItemKaevSandstoneSlopes = (new ItemSlopes_Kaevator(BlockKaevSandstoneSlopes.bO - 256, "Sandstone")).a("ItemKaevSandstoneSlopes");
        } else
        {
            BlockKaevSandstoneSlopes = pb.t;
        }
        if(props.getInt("BlockKaevDirtSlopes") != 0)
        {
            BlockKaevDirtSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevDirtSlopes"), 2, acn.c)).c(0.5F).a(pb.f).a("BlockKaevDirtSlopes");
            ItemKaevDirtSlopes = (new ItemSlopes_Kaevator(BlockKaevDirtSlopes.bO - 256, "Dirt")).a("ItemKaevDirtSlopes");
        } else
        {
            BlockKaevDirtSlopes = pb.t;
        }
        if(props.getInt("BlockKaevStoneSlopes") != 0)
        {
            BlockKaevStoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevStoneSlopes"), 1, acn.e)).c(1.5F).a(pb.h).b(10F).a("BlockKaevStoneSlopes");
            ItemKaevStoneSlopes = (new ItemSlopes_Kaevator(BlockKaevStoneSlopes.bO - 256, "Stone")).a("ItemKaevStoneSlopes");
        } else
        {
            BlockKaevStoneSlopes = pb.t;
        }
        if(props.getInt("BlockKaevSandSlopes") != 0)
        {
            BlockKaevSandSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSandSlopes"), 18, acn.o)).c(0.5F).a(pb.l).a("BlockKaevSandSlopes");
            ItemKaevSandSlopes = (new ItemSlopes_Kaevator(BlockKaevSandSlopes.bO - 256, "Sand")).a("ItemKaevSandSlopes");
        } else
        {
            BlockKaevSandSlopes = pb.t;
        }
        if(props.getInt("BlockKaevSnowSlopes") != 0)
        {
            BlockKaevSnowSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSnowSlopes"), 66, acn.v)).c(0.1F).a(pb.k).a("BlockKaevSnowSlopes");
            ItemKaevSnowSlopes = (new ItemSlopes_Kaevator(BlockKaevSnowSlopes.bO - 256, "Snow")).a("ItemKaevSnowSlopes");
        } else
        {
            BlockKaevSnowSlopes = pb.t;
        }
        if(props.getInt("BlockKaevGrassSlopes") != 0)
        {
            BlockKaevGrassSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGrassSlopes"), 3, acn.c)).c(0.6F).a(pb.g).a("BlockKaevGrassSlopes");
            ItemKaevGrassSlopes = (new ItemSlopes_Kaevator(BlockKaevGrassSlopes.bO - 256, "Grass")).a("ItemKaevGrassSlopes");
        } else
        {
            BlockKaevGrassSlopes = pb.t;
        }
        if(props.getInt("BlockKaevBricksSlopes") != 0)
        {
            BlockKaevBricksSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBricksSlopes"), 7, acn.e)).c(2.0F).a(pb.h).b(10F).a("BlockKaevBricksSlopes");
            ItemKaevBricksSlopes = (new ItemSlopes_Kaevator(BlockKaevBricksSlopes.bO - 256, "Bricks")).a("ItemKaevBricksSlopes");
        } else
        {
            BlockKaevBricksSlopes = pb.t;
        }
        if(props.getInt("BlockKaevGravelSlopes") != 0)
        {
            BlockKaevGravelSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGravelSlopes"), 19, acn.o)).c(0.6F).a(pb.f).a("BlockKaevGravelSlopes");
            ItemKaevGravelSlopes = (new ItemSlopes_Kaevator(BlockKaevGravelSlopes.bO - 256, "Gravel")).a("ItemKaevGravelSlopes");
        } else
        {
            BlockKaevGravelSlopes = pb.t;
        }
        if(props.getInt("BlockKaevGoldSlopes") != 0)
        {
            BlockKaevGoldSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGoldSlopes"), 23, acn.f)).c(3F).a(pb.i).b(10F).a("BlockKaevGoldSlopes");
            ItemKaevGoldSlopes = (new ItemSlopes_Kaevator(BlockKaevGoldSlopes.bO - 256, "Gold")).a("ItemKaevGoldSlopes");
        } else
        {
            BlockKaevGoldSlopes = pb.t;
        }
        if(props.getInt("BlockKaevSteelSlopes") != 0)
        {
            BlockKaevSteelSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSteelSlopes"), 22, acn.f)).c(5F).a(pb.i).b(10F).a("BlockKaevSteelSlopes");
            ItemKaevSteelSlopes = (new ItemSlopes_Kaevator(BlockKaevSteelSlopes.bO - 256, "Steel")).a("ItemKaevSteelSlopes");
        } else
        {
            BlockKaevSteelSlopes = pb.t;
        }
        if(props.getInt("BlockKaevObsidianSlopes") != 0)
        {
            BlockKaevObsidianSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevObsidianSlopes"), 37, acn.e)).c(10F).a(pb.h).b(2000F).a("BlockKaevObsidianSlopes");
            ItemKaevObsidianSlopes = (new ItemSlopes_Kaevator(BlockKaevObsidianSlopes.bO - 256, "Obsidian")).a("ItemKaevObsidianSlopes");
        } else
        {
            BlockKaevObsidianSlopes = pb.t;
        }
        if(props.getInt("BlockKaevDiamondSlopes") != 0)
        {
            BlockKaevDiamondSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevDiamondSlopes"), 24, acn.f)).c(5F).a(pb.i).b(10F).a("BlockKaevDiamondSlopes");
            ItemKaevDiamondSlopes = (new ItemSlopes_Kaevator(BlockKaevDiamondSlopes.bO - 256, "Diamond")).a("ItemKaevDiamondSlopes");
        } else
        {
            BlockKaevDiamondSlopes = pb.t;
        }
        if(props.getInt("BlockKaevWhiteWoolSlopes") != 0)
        {
            BlockKaevWhiteWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevWhiteWoolSlopes"), 64, acn.m)).c(1.0F).a(pb.k).a("BlockKaevWhiteWoolSlopes");
            ItemKaevWhiteWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevWhiteWoolSlopes.bO - 256, "WhiteWool")).a("ItemKaevWhiteWoolSlopes");
        } else
        {
            BlockKaevWhiteWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevBlackWoolSlopes") != 0)
        {
            BlockKaevBlackWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBlackWoolSlopes"), 113, acn.m)).c(1.0F).a(pb.k).a("BlockKaevBlackWoolSlopes");
            ItemKaevBlackWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBlackWoolSlopes.bO - 256, "BlackWool")).a("ItemKaevBlackWoolSlopes");
        } else
        {
            BlockKaevBlackWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevRedWoolSlopes") != 0)
        {
            BlockKaevRedWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevRedWoolSlopes"), 129, acn.m)).c(1.0F).a(pb.k).a("BlockKaevRedWoolSlopes");
            ItemKaevRedWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevRedWoolSlopes.bO - 256, "RedWool")).a("ItemKaevRedWoolSlopes");
        } else
        {
            BlockKaevRedWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevGreenWoolSlopes") != 0)
        {
            BlockKaevGreenWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGreenWoolSlopes"), 145, acn.m)).c(1.0F).a(pb.k).a("BlockKaevGreenWoolSlopes");
            ItemKaevGreenWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevGreenWoolSlopes.bO - 256, "GreenWool")).a("ItemKaevGreenWoolSlopes");
        } else
        {
            BlockKaevGreenWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevBrownWoolSlopes") != 0)
        {
            BlockKaevBrownWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBrownWoolSlopes"), 161, acn.m)).c(1.0F).a(pb.k).a("BlockKaevBrownWoolSlopes");
            ItemKaevBrownWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBrownWoolSlopes.bO - 256, "BrownWool")).a("ItemKaevBrownWoolSlopes");
        } else
        {
            BlockKaevBrownWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevBlueWoolSlopes") != 0)
        {
            BlockKaevBlueWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBlueWoolSlopes"), 177, acn.m)).c(1.0F).a(pb.k).a("BlockKaevBlueWoolSlopes");
            ItemKaevBlueWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBlueWoolSlopes.bO - 256, "BlueWool")).a("ItemKaevBlueWoolSlopes");
        } else
        {
            BlockKaevBlueWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevPurpleWoolSlopes") != 0)
        {
            BlockKaevPurpleWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevPurpleWoolSlopes"), 193, acn.m)).c(1.0F).a(pb.k).a("BlockKaevPurpleWoolSlopes");
            ItemKaevPurpleWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevPurpleWoolSlopes.bO - 256, "PurpleWool")).a("ItemKaevPurpleWoolSlopes");
        } else
        {
            BlockKaevPurpleWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevCyanWoolSlopes") != 0)
        {
            BlockKaevCyanWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevCyanWoolSlopes"), 209, acn.m)).c(1.0F).a(pb.k).a("BlockKaevCyanWoolSlopes");
            ItemKaevCyanWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevCyanWoolSlopes.bO - 256, "CyanWool")).a("ItemKaevCyanWoolSlopes");
        } else
        {
            BlockKaevCyanWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevSilverWoolSlopes") != 0)
        {
            BlockKaevSilverWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSilverWoolSlopes"), 225, acn.m)).c(1.0F).a(pb.k).a("BlockKaevSilverWoolSlopes");
            ItemKaevSilverWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevSilverWoolSlopes.bO - 256, "SilverWool")).a("ItemKaevSilverWoolSlopes");
        } else
        {
            BlockKaevSilverWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevGrayWoolSlopes") != 0)
        {
            BlockKaevGrayWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGrayWoolSlopes"), 114, acn.m)).c(1.0F).a(pb.k).a("BlockKaevGrayWoolSlopes");
            ItemKaevGrayWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevGrayWoolSlopes.bO - 256, "GrayWool")).a("ItemKaevGrayWoolSlopes");
        } else
        {
            BlockKaevGrayWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevPinkWoolSlopes") != 0)
        {
            BlockKaevPinkWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevPinkWoolSlopes"), 130, acn.m)).c(1.0F).a(pb.k).a("BlockKaevPinkWoolSlopes");
            ItemKaevPinkWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevPinkWoolSlopes.bO - 256, "PinkWool")).a("ItemKaevPinkWoolSlopes");
        } else
        {
            BlockKaevPinkWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevLimeWoolSlopes") != 0)
        {
            BlockKaevLimeWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevLimeWoolSlopes"), 146, acn.m)).c(1.0F).a(pb.k).a("BlockKaevLimeWoolSlopes");
            ItemKaevLimeWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevLimeWoolSlopes.bO - 256, "LimeWool")).a("ItemKaevLimeWoolSlopes");
        } else
        {
            BlockKaevLimeWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevYellowWoolSlopes") != 0)
        {
            BlockKaevYellowWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevYellowWoolSlopes"), 162, acn.m)).c(1.0F).a(pb.k).a("BlockKaevYellowWoolSlopes");
            ItemKaevYellowWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevYellowWoolSlopes.bO - 256, "YellowWool")).a("ItemKaevYellowWoolSlopes");
        } else
        {
            BlockKaevYellowWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevLightBlueWoolSlopes") != 0)
        {
            BlockKaevLightBlueWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevLightBlueWoolSlopes"), 178, acn.m)).c(1.0F).a(pb.k).a("BlockKaevLightBlueWoolSlopes");
            ItemKaevLightBlueWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevLightBlueWoolSlopes.bO - 256, "LightBlueWool")).a("ItemKaevLightBlueWoolSlopes");
        } else
        {
            BlockKaevLightBlueWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevMagentaWoolSlopes") != 0)
        {
            BlockKaevMagentaWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevMagentaWoolSlopes"), 194, acn.m)).c(1.0F).a(pb.k).a("BlockKaevMagentaWoolSlopes");
            ItemKaevMagentaWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevMagentaWoolSlopes.bO - 256, "MagentaWool")).a("ItemKaevMagentaWoolSlopes");
        } else
        {
            BlockKaevMagentaWoolSlopes = pb.t;
        }
        if(props.getInt("BlockKaevOrangeWoolSlopes") != 0)
        {
            BlockKaevOrangeWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevOrangeWoolSlopes"), 210, acn.m)).c(1.0F).a(pb.k).a("BlockKaevOrangeWoolSlopes");
            ItemKaevOrangeWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevOrangeWoolSlopes.bO - 256, "OrangeWool")).a("ItemKaevOrangeWoolSlopes");
        } else
        {
            BlockKaevOrangeWoolSlopes = pb.t;
        }
        props.save();
    }
}
