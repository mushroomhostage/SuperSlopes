package net.minecraft.src;

import forge.NetworkMod;
import java.io.File;

public class mod_Kaevator_Slopes extends NetworkMod
{
    public static KrushProps props = new KrushProps((new File(getAppdata() + "/config/KaevatorSuperSlopes.props")).getPath());
    public static int SlopesRenderID;
    public static int SlopesOpacity;
    public static final Block BlockKaevWoodSlopes;
    public static final Block BlockKaevCobblestoneSlopes;
    public static final Block BlockKaevGlassSlopes;
    public static final Block BlockKaevSandstoneSlopes;
    public static final Block BlockKaevDirtSlopes;
    public static final Block BlockKaevStoneSlopes;
    public static final Block BlockKaevSandSlopes;
    public static final Block BlockKaevSnowSlopes;
    public static final Block BlockKaevGrassSlopes;
    public static final Block BlockKaevBricksSlopes;
    public static final Block BlockKaevGravelSlopes;
    public static final Block BlockKaevGoldSlopes;
    public static final Block BlockKaevSteelSlopes;
    public static final Block BlockKaevObsidianSlopes;
    public static final Block BlockKaevDiamondSlopes;
    public static final Block BlockKaevWhiteWoolSlopes;
    public static final Block BlockKaevBlackWoolSlopes;
    public static final Block BlockKaevRedWoolSlopes;
    public static final Block BlockKaevGreenWoolSlopes;
    public static final Block BlockKaevBrownWoolSlopes;
    public static final Block BlockKaevBlueWoolSlopes;
    public static final Block BlockKaevPurpleWoolSlopes;
    public static final Block BlockKaevCyanWoolSlopes;
    public static final Block BlockKaevSilverWoolSlopes;
    public static final Block BlockKaevGrayWoolSlopes;
    public static final Block BlockKaevPinkWoolSlopes;
    public static final Block BlockKaevLimeWoolSlopes;
    public static final Block BlockKaevYellowWoolSlopes;
    public static final Block BlockKaevLightBlueWoolSlopes;
    public static final Block BlockKaevMagentaWoolSlopes;
    public static final Block BlockKaevOrangeWoolSlopes;
    public static Item ItemKaevWoodSlopes;
    public static Item ItemKaevCobblestoneSlopes;
    public static Item ItemKaevGlassSlopes;
    public static Item ItemKaevSandstoneSlopes;
    public static Item ItemKaevDirtSlopes;
    public static Item ItemKaevStoneSlopes;
    public static Item ItemKaevSandSlopes;
    public static Item ItemKaevSnowSlopes;
    public static Item ItemKaevGrassSlopes;
    public static Item ItemKaevBricksSlopes;
    public static Item ItemKaevGravelSlopes;
    public static Item ItemKaevGoldSlopes;
    public static Item ItemKaevSteelSlopes;
    public static Item ItemKaevObsidianSlopes;
    public static Item ItemKaevDiamondSlopes;
    public static Item ItemKaevWhiteWoolSlopes;
    public static Item ItemKaevBlackWoolSlopes;
    public static Item ItemKaevRedWoolSlopes;
    public static Item ItemKaevGreenWoolSlopes;
    public static Item ItemKaevBrownWoolSlopes;
    public static Item ItemKaevBlueWoolSlopes;
    public static Item ItemKaevPurpleWoolSlopes;
    public static Item ItemKaevCyanWoolSlopes;
    public static Item ItemKaevSilverWoolSlopes;
    public static Item ItemKaevGrayWoolSlopes;
    public static Item ItemKaevPinkWoolSlopes;
    public static Item ItemKaevLimeWoolSlopes;
    public static Item ItemKaevYellowWoolSlopes;
    public static Item ItemKaevLightBlueWoolSlopes;
    public static Item ItemKaevMagentaWoolSlopes;
    public static Item ItemKaevOrangeWoolSlopes;
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
        this.enableAO = false;
        this.aoLightValueThis = 0.0F;
        this.aoLightValueXNeg = 0.0F;
        this.aoLightValueYNeg = 0.0F;
        this.aoLightValueZNeg = 0.0F;
        this.aoLightValueXPos = 0.0F;
        this.aoLightValueYPos = 0.0F;
        this.aoLightValueZPos = 0.0F;
        this.aoLightValueXNegYNegZNeg = 0.0F;
        this.aoLightValueXNegYNeg = 0.0F;
        this.aoLightValueXNegYNegZPos = 0.0F;
        this.aoLightValueYNegZNeg = 0.0F;
        this.aoLightValueYNegZPos = 0.0F;
        this.aoLightValueXPosYNegZNeg = 0.0F;
        this.aoLightValueXPosYNeg = 0.0F;
        this.aoLightValueXPosYNegZPos = 0.0F;
        this.aoLightValueXNegYPosZNeg = 0.0F;
        this.aoLightValueXNegYPos = 0.0F;
        this.aoLightValueXNegYPosZPos = 0.0F;
        this.aoLightValueYPosZNeg = 0.0F;
        this.aoLightValueXPosYPosZNeg = 0.0F;
        this.aoLightValueXPosYPos = 0.0F;
        this.aoLightValueYPosZPos = 0.0F;
        this.aoLightValueXPosYPosZPos = 0.0F;
        this.aoLightValueXNegZNeg = 0.0F;
        this.aoLightValueXPosZNeg = 0.0F;
        this.aoLightValueXNegZPos = 0.0F;
        this.aoLightValueXPosZPos = 0.0F;
        this.field_22352_G = 1;
        this.isBlockYPosZNeg = false;
        this.isBlockXPosYPos = false;
        this.isBlockXNegYPos = false;
        this.isBlockYPosZPos = false;
        this.isBlockXNegZNeg = false;
        this.isBlockXPosZPos = false;
        this.isBlockXNegZPos = false;
        this.isBlockXPosZNeg = false;
        this.isBlockYNegZNeg = false;
        this.isBlockXPosYNeg = false;
        this.isBlockXNegYNeg = false;
        this.isBlockYNegZPos = false;
        this.factorTop = 1.0F;
        this.factorBottom = 0.5F;
        this.factorEast = 0.8F;
        this.factorWest = 0.8F;
        this.factorNorth = 0.6F;
        this.factorSouth = 0.6F;
        this.colorRedTopLeft_TopFace = 0.0F;
        this.colorRedBottomLeft_TopFace = 0.0F;
        this.colorRedBottomRight_TopFace = 0.0F;
        this.colorRedTopRight_TopFace = 0.0F;
        this.colorGreenTopLeft_TopFace = 0.0F;
        this.colorGreenBottomLeft_TopFace = 0.0F;
        this.colorGreenBottomRight_TopFace = 0.0F;
        this.colorGreenTopRight_TopFace = 0.0F;
        this.colorBlueTopLeft_TopFace = 0.0F;
        this.colorBlueBottomLeft_TopFace = 0.0F;
        this.colorBlueBottomRight_TopFace = 0.0F;
        this.colorBlueTopRight_TopFace = 0.0F;
        this.colorRedTopLeft_BottomFace = 0.0F;
        this.colorRedBottomLeft_BottomFace = 0.0F;
        this.colorRedBottomRight_BottomFace = 0.0F;
        this.colorRedTopRight_BottomFace = 0.0F;
        this.colorGreenTopLeft_BottomFace = 0.0F;
        this.colorGreenBottomLeft_BottomFace = 0.0F;
        this.colorGreenBottomRight_BottomFace = 0.0F;
        this.colorGreenTopRight_BottomFace = 0.0F;
        this.colorBlueTopLeft_BottomFace = 0.0F;
        this.colorBlueBottomLeft_BottomFace = 0.0F;
        this.colorBlueBottomRight_BottomFace = 0.0F;
        this.colorBlueTopRight_BottomFace = 0.0F;
        this.colorRedTopLeft_EastFace = 0.0F;
        this.colorRedBottomLeft_EastFace = 0.0F;
        this.colorRedBottomRight_EastFace = 0.0F;
        this.colorRedTopRight_EastFace = 0.0F;
        this.colorGreenTopLeft_EastFace = 0.0F;
        this.colorGreenBottomLeft_EastFace = 0.0F;
        this.colorGreenBottomRight_EastFace = 0.0F;
        this.colorGreenTopRight_EastFace = 0.0F;
        this.colorBlueTopLeft_EastFace = 0.0F;
        this.colorBlueBottomLeft_EastFace = 0.0F;
        this.colorBlueBottomRight_EastFace = 0.0F;
        this.colorBlueTopRight_EastFace = 0.0F;
        this.colorRedTopLeft_WestFace = 0.0F;
        this.colorRedBottomLeft_WestFace = 0.0F;
        this.colorRedBottomRight_WestFace = 0.0F;
        this.colorRedTopRight_WestFace = 0.0F;
        this.colorGreenTopLeft_WestFace = 0.0F;
        this.colorGreenBottomLeft_WestFace = 0.0F;
        this.colorGreenBottomRight_WestFace = 0.0F;
        this.colorGreenTopRight_WestFace = 0.0F;
        this.colorBlueTopLeft_WestFace = 0.0F;
        this.colorBlueBottomLeft_WestFace = 0.0F;
        this.colorBlueBottomRight_WestFace = 0.0F;
        this.colorBlueTopRight_WestFace = 0.0F;
        this.colorRedTopLeft_NorthFace = 0.0F;
        this.colorRedBottomLeft_NorthFace = 0.0F;
        this.colorRedBottomRight_NorthFace = 0.0F;
        this.colorRedTopRight_NorthFace = 0.0F;
        this.colorGreenTopLeft_NorthFace = 0.0F;
        this.colorGreenBottomLeft_NorthFace = 0.0F;
        this.colorGreenBottomRight_NorthFace = 0.0F;
        this.colorGreenTopRight_NorthFace = 0.0F;
        this.colorBlueTopLeft_NorthFace = 0.0F;
        this.colorBlueBottomLeft_NorthFace = 0.0F;
        this.colorBlueBottomRight_NorthFace = 0.0F;
        this.colorBlueTopRight_NorthFace = 0.0F;
        this.colorRedTopLeft_SouthFace = 0.0F;
        this.colorRedBottomLeft_SouthFace = 0.0F;
        this.colorRedBottomRight_SouthFace = 0.0F;
        this.colorRedTopRight_SouthFace = 0.0F;
        this.colorGreenTopLeft_SouthFace = 0.0F;
        this.colorGreenBottomLeft_SouthFace = 0.0F;
        this.colorGreenBottomRight_SouthFace = 0.0F;
        this.colorGreenTopRight_SouthFace = 0.0F;
        this.colorBlueTopLeft_SouthFace = 0.0F;
        this.colorBlueBottomLeft_SouthFace = 0.0F;
        this.colorBlueBottomRight_SouthFace = 0.0F;
        this.colorBlueTopRight_SouthFace = 0.0F;
        this.colorRedSlopes = 0.0F;
        this.colorGreenSlopes = 0.0F;
        this.colorBlueSlopes = 0.0F;

        if (props.getInt("BlockKaevWoodSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(Block.WOOD, 1), new Object[] {"#", '#', BlockKaevWoodSlopes});
        }

        if (props.getInt("BlockKaevCobblestoneSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(Block.COBBLESTONE, 1), new Object[] {"#", '#', BlockKaevCobblestoneSlopes});
        }

        if (props.getInt("BlockKaevGlassSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(Block.GLASS, 1), new Object[] {"#", '#', BlockKaevGlassSlopes});
        }

        if (props.getInt("BlockKaevSandstoneSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(Block.SANDSTONE, 1), new Object[] {"#", '#', BlockKaevSandstoneSlopes});
        }

        if (props.getInt("BlockKaevDirtSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(Block.DIRT, 1), new Object[] {"#", '#', BlockKaevDirtSlopes});
        }

        if (props.getInt("BlockKaevStoneSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(Block.STONE, 1), new Object[] {"#", '#', BlockKaevStoneSlopes});
        }

        if (props.getInt("BlockKaevSandSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(Block.SAND, 1), new Object[] {"#", '#', BlockKaevSandSlopes});
        }

        if (props.getInt("BlockKaevSnowSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.SNOW_BLOCK, 1), new Object[] {"#", '#', BlockKaevSnowSlopes});
        }

        if (props.getInt("BlockKaevGrassSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(Block.GRASS, 1), new Object[] {"#", '#', BlockKaevGrassSlopes});
        }

        if (props.getInt("BlockKaevBricksSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(Block.BRICK, 1), new Object[] {"#", '#', BlockKaevBricksSlopes});
        }

        if (props.getInt("BlockKaevGravelSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(Block.GRAVEL, 1), new Object[] {"#", '#', BlockKaevGravelSlopes});
        }

        if (props.getInt("BlockKaevGoldSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.GOLD_BLOCK, 1), new Object[] {"#", '#', BlockKaevGoldSlopes});
        }

        if (props.getInt("BlockKaevSteelSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.IRON_BLOCK, 1), new Object[] {"#", '#', BlockKaevSteelSlopes});
        }

        if (props.getInt("BlockKaevObsidianSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(Block.OBSIDIAN, 1), new Object[] {"#", '#', BlockKaevObsidianSlopes});
        }

        if (props.getInt("BlockKaevDiamondSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.DIAMOND_BLOCK, 1), new Object[] {"#", '#', BlockKaevDiamondSlopes});
        }

        if (props.getInt("BlockKaevWhiteWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {"###", "## ", "#  ", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {"#  ", " # ", "###", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {"###", " # ", "#  ", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {" # ", " ##", " # ", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 0), new Object[] {"#", '#', BlockKaevWhiteWoolSlopes});
        }

        if (props.getInt("BlockKaevBlackWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 15), new Object[] {"#", '#', BlockKaevBlackWoolSlopes});
        }

        if (props.getInt("BlockKaevRedWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 14), new Object[] {"#", '#', BlockKaevRedWoolSlopes});
        }

        if (props.getInt("BlockKaevGreenWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 13), new Object[] {"#", '#', BlockKaevGreenWoolSlopes});
        }

        if (props.getInt("BlockKaevBrownWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 12), new Object[] {"#", '#', BlockKaevBrownWoolSlopes});
        }

        if (props.getInt("BlockKaevBlueWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 11), new Object[] {"#", '#', BlockKaevBlueWoolSlopes});
        }

        if (props.getInt("BlockKaevPurpleWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 10), new Object[] {"#", '#', BlockKaevPurpleWoolSlopes});
        }

        if (props.getInt("BlockKaevCyanWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 9), new Object[] {"#", '#', BlockKaevCyanWoolSlopes});
        }

        if (props.getInt("BlockKaevSilverWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 8), new Object[] {"#", '#', BlockKaevSilverWoolSlopes});
        }

        if (props.getInt("BlockKaevGrayWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 7), new Object[] {"#", '#', BlockKaevGrayWoolSlopes});
        }

        if (props.getInt("BlockKaevPinkWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 6), new Object[] {"#", '#', BlockKaevPinkWoolSlopes});
        }

        if (props.getInt("BlockKaevLimeWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 5), new Object[] {"#", '#', BlockKaevLimeWoolSlopes});
        }

        if (props.getInt("BlockKaevYellowWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 4), new Object[] {"#", '#', BlockKaevYellowWoolSlopes});
        }

        if (props.getInt("BlockKaevLightBlueWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 3), new Object[] {"#", '#', BlockKaevLightBlueWoolSlopes});
        }

        if (props.getInt("BlockKaevMagentaWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 2), new Object[] {"#", '#', BlockKaevMagentaWoolSlopes});
        }

        if (props.getInt("BlockKaevOrangeWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 1), new Object[] {"#", '#', BlockKaevOrangeWoolSlopes});
        }
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

    public void load() {}

    public boolean clientSideRequired()
    {
        return true;
    }

    public boolean serverSideRequired()
    {
        return true;
    }

    static
    {
        prepareProps();
        SlopesOpacity = props.getInt("Slopes_Opacity");

        if (props.getInt("BlockKaevWoodSlopes") != 0)
        {
            BlockKaevWoodSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevWoodSlopes"), 4, Material.WOOD)).c(2.0F).a(Block.e).b(5.0F).a("BlockKaevWoodSlopes");
            ItemKaevWoodSlopes = (new ItemSlopes_Kaevator(BlockKaevWoodSlopes.id - 256, "Wood")).a("ItemKaevWoodSlopes");
        }
        else
        {
            BlockKaevWoodSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevCobblestoneSlopes") != 0)
        {
            BlockKaevCobblestoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevCobblestoneSlopes"), 16, Material.STONE)).c(2.0F).a(Block.h).b(10.0F).a("BlockKaevCobblestoneSlopes");
            ItemKaevCobblestoneSlopes = (new ItemSlopes_Kaevator(BlockKaevCobblestoneSlopes.id - 256, "Cobblestone")).a("ItemKaevCobblestoneSlopes");
        }
        else
        {
            BlockKaevCobblestoneSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevGlassSlopes") != 0)
        {
            BlockKaevGlassSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGlassSlopes"), 49, Material.SHATTERABLE)).c(0.3F).a(Block.j).a("BlockKaevGlassSlopes");
            ItemKaevGlassSlopes = (new ItemSlopes_Kaevator(BlockKaevGlassSlopes.id - 256, "Glass")).a("ItemKaevGlassSlopes");
        }
        else
        {
            BlockKaevGlassSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevSandstoneSlopes") != 0)
        {
            BlockKaevSandstoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSandstoneSlopes"), 192, Material.STONE)).c(0.8F).a(Block.h).a("BlockKaevSandstoneSlopes");
            ItemKaevSandstoneSlopes = (new ItemSlopes_Kaevator(BlockKaevSandstoneSlopes.id - 256, "Sandstone")).a("ItemKaevSandstoneSlopes");
        }
        else
        {
            BlockKaevSandstoneSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevDirtSlopes") != 0)
        {
            BlockKaevDirtSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevDirtSlopes"), 2, Material.EARTH)).c(0.5F).a(Block.f).a("BlockKaevDirtSlopes");
            ItemKaevDirtSlopes = (new ItemSlopes_Kaevator(BlockKaevDirtSlopes.id - 256, "Dirt")).a("ItemKaevDirtSlopes");
        }
        else
        {
            BlockKaevDirtSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevStoneSlopes") != 0)
        {
            BlockKaevStoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevStoneSlopes"), 1, Material.STONE)).c(1.5F).a(Block.h).b(10.0F).a("BlockKaevStoneSlopes");
            ItemKaevStoneSlopes = (new ItemSlopes_Kaevator(BlockKaevStoneSlopes.id - 256, "Stone")).a("ItemKaevStoneSlopes");
        }
        else
        {
            BlockKaevStoneSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevSandSlopes") != 0)
        {
            BlockKaevSandSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSandSlopes"), 18, Material.SAND)).c(0.5F).a(Block.l).a("BlockKaevSandSlopes");
            ItemKaevSandSlopes = (new ItemSlopes_Kaevator(BlockKaevSandSlopes.id - 256, "Sand")).a("ItemKaevSandSlopes");
        }
        else
        {
            BlockKaevSandSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevSnowSlopes") != 0)
        {
            BlockKaevSnowSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSnowSlopes"), 66, Material.SNOW_LAYER)).c(0.1F).a(Block.k).a("BlockKaevSnowSlopes");
            ItemKaevSnowSlopes = (new ItemSlopes_Kaevator(BlockKaevSnowSlopes.id - 256, "Snow")).a("ItemKaevSnowSlopes");
        }
        else
        {
            BlockKaevSnowSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevGrassSlopes") != 0)
        {
            BlockKaevGrassSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGrassSlopes"), 3, Material.EARTH)).c(0.6F).a(Block.g).a("BlockKaevGrassSlopes");
            ItemKaevGrassSlopes = (new ItemSlopes_Kaevator(BlockKaevGrassSlopes.id - 256, "Grass")).a("ItemKaevGrassSlopes");
        }
        else
        {
            BlockKaevGrassSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevBricksSlopes") != 0)
        {
            BlockKaevBricksSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBricksSlopes"), 7, Material.STONE)).c(2.0F).a(Block.h).b(10.0F).a("BlockKaevBricksSlopes");
            ItemKaevBricksSlopes = (new ItemSlopes_Kaevator(BlockKaevBricksSlopes.id - 256, "Bricks")).a("ItemKaevBricksSlopes");
        }
        else
        {
            BlockKaevBricksSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevGravelSlopes") != 0)
        {
            BlockKaevGravelSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGravelSlopes"), 19, Material.SAND)).c(0.6F).a(Block.f).a("BlockKaevGravelSlopes");
            ItemKaevGravelSlopes = (new ItemSlopes_Kaevator(BlockKaevGravelSlopes.id - 256, "Gravel")).a("ItemKaevGravelSlopes");
        }
        else
        {
            BlockKaevGravelSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevGoldSlopes") != 0)
        {
            BlockKaevGoldSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGoldSlopes"), 23, Material.ORE)).c(3.0F).a(Block.i).b(10.0F).a("BlockKaevGoldSlopes");
            ItemKaevGoldSlopes = (new ItemSlopes_Kaevator(BlockKaevGoldSlopes.id - 256, "Gold")).a("ItemKaevGoldSlopes");
        }
        else
        {
            BlockKaevGoldSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevSteelSlopes") != 0)
        {
            BlockKaevSteelSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSteelSlopes"), 22, Material.ORE)).c(5.0F).a(Block.i).b(10.0F).a("BlockKaevSteelSlopes");
            ItemKaevSteelSlopes = (new ItemSlopes_Kaevator(BlockKaevSteelSlopes.id - 256, "Steel")).a("ItemKaevSteelSlopes");
        }
        else
        {
            BlockKaevSteelSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevObsidianSlopes") != 0)
        {
            BlockKaevObsidianSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevObsidianSlopes"), 37, Material.STONE)).c(10.0F).a(Block.h).b(2000.0F).a("BlockKaevObsidianSlopes");
            ItemKaevObsidianSlopes = (new ItemSlopes_Kaevator(BlockKaevObsidianSlopes.id - 256, "Obsidian")).a("ItemKaevObsidianSlopes");
        }
        else
        {
            BlockKaevObsidianSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevDiamondSlopes") != 0)
        {
            BlockKaevDiamondSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevDiamondSlopes"), 24, Material.ORE)).c(5.0F).a(Block.i).b(10.0F).a("BlockKaevDiamondSlopes");
            ItemKaevDiamondSlopes = (new ItemSlopes_Kaevator(BlockKaevDiamondSlopes.id - 256, "Diamond")).a("ItemKaevDiamondSlopes");
        }
        else
        {
            BlockKaevDiamondSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevWhiteWoolSlopes") != 0)
        {
            BlockKaevWhiteWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevWhiteWoolSlopes"), 64, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevWhiteWoolSlopes");
            ItemKaevWhiteWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevWhiteWoolSlopes.id - 256, "WhiteWool")).a("ItemKaevWhiteWoolSlopes");
        }
        else
        {
            BlockKaevWhiteWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevBlackWoolSlopes") != 0)
        {
            BlockKaevBlackWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBlackWoolSlopes"), 113, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBlackWoolSlopes");
            ItemKaevBlackWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBlackWoolSlopes.id - 256, "BlackWool")).a("ItemKaevBlackWoolSlopes");
        }
        else
        {
            BlockKaevBlackWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevRedWoolSlopes") != 0)
        {
            BlockKaevRedWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevRedWoolSlopes"), 129, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevRedWoolSlopes");
            ItemKaevRedWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevRedWoolSlopes.id - 256, "RedWool")).a("ItemKaevRedWoolSlopes");
        }
        else
        {
            BlockKaevRedWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevGreenWoolSlopes") != 0)
        {
            BlockKaevGreenWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGreenWoolSlopes"), 145, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevGreenWoolSlopes");
            ItemKaevGreenWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevGreenWoolSlopes.id - 256, "GreenWool")).a("ItemKaevGreenWoolSlopes");
        }
        else
        {
            BlockKaevGreenWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevBrownWoolSlopes") != 0)
        {
            BlockKaevBrownWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBrownWoolSlopes"), 161, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBrownWoolSlopes");
            ItemKaevBrownWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBrownWoolSlopes.id - 256, "BrownWool")).a("ItemKaevBrownWoolSlopes");
        }
        else
        {
            BlockKaevBrownWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevBlueWoolSlopes") != 0)
        {
            BlockKaevBlueWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBlueWoolSlopes"), 177, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBlueWoolSlopes");
            ItemKaevBlueWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBlueWoolSlopes.id - 256, "BlueWool")).a("ItemKaevBlueWoolSlopes");
        }
        else
        {
            BlockKaevBlueWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevPurpleWoolSlopes") != 0)
        {
            BlockKaevPurpleWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevPurpleWoolSlopes"), 193, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevPurpleWoolSlopes");
            ItemKaevPurpleWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevPurpleWoolSlopes.id - 256, "PurpleWool")).a("ItemKaevPurpleWoolSlopes");
        }
        else
        {
            BlockKaevPurpleWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevCyanWoolSlopes") != 0)
        {
            BlockKaevCyanWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevCyanWoolSlopes"), 209, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevCyanWoolSlopes");
            ItemKaevCyanWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevCyanWoolSlopes.id - 256, "CyanWool")).a("ItemKaevCyanWoolSlopes");
        }
        else
        {
            BlockKaevCyanWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevSilverWoolSlopes") != 0)
        {
            BlockKaevSilverWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSilverWoolSlopes"), 225, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevSilverWoolSlopes");
            ItemKaevSilverWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevSilverWoolSlopes.id - 256, "SilverWool")).a("ItemKaevSilverWoolSlopes");
        }
        else
        {
            BlockKaevSilverWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevGrayWoolSlopes") != 0)
        {
            BlockKaevGrayWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGrayWoolSlopes"), 114, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevGrayWoolSlopes");
            ItemKaevGrayWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevGrayWoolSlopes.id - 256, "GrayWool")).a("ItemKaevGrayWoolSlopes");
        }
        else
        {
            BlockKaevGrayWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevPinkWoolSlopes") != 0)
        {
            BlockKaevPinkWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevPinkWoolSlopes"), 130, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevPinkWoolSlopes");
            ItemKaevPinkWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevPinkWoolSlopes.id - 256, "PinkWool")).a("ItemKaevPinkWoolSlopes");
        }
        else
        {
            BlockKaevPinkWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevLimeWoolSlopes") != 0)
        {
            BlockKaevLimeWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevLimeWoolSlopes"), 146, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevLimeWoolSlopes");
            ItemKaevLimeWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevLimeWoolSlopes.id - 256, "LimeWool")).a("ItemKaevLimeWoolSlopes");
        }
        else
        {
            BlockKaevLimeWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevYellowWoolSlopes") != 0)
        {
            BlockKaevYellowWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevYellowWoolSlopes"), 162, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevYellowWoolSlopes");
            ItemKaevYellowWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevYellowWoolSlopes.id - 256, "YellowWool")).a("ItemKaevYellowWoolSlopes");
        }
        else
        {
            BlockKaevYellowWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevLightBlueWoolSlopes") != 0)
        {
            BlockKaevLightBlueWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevLightBlueWoolSlopes"), 178, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevLightBlueWoolSlopes");
            ItemKaevLightBlueWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevLightBlueWoolSlopes.id - 256, "LightBlueWool")).a("ItemKaevLightBlueWoolSlopes");
        }
        else
        {
            BlockKaevLightBlueWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevMagentaWoolSlopes") != 0)
        {
            BlockKaevMagentaWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevMagentaWoolSlopes"), 194, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevMagentaWoolSlopes");
            ItemKaevMagentaWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevMagentaWoolSlopes.id - 256, "MagentaWool")).a("ItemKaevMagentaWoolSlopes");
        }
        else
        {
            BlockKaevMagentaWoolSlopes = Block.STONE;
        }

        if (props.getInt("BlockKaevOrangeWoolSlopes") != 0)
        {
            BlockKaevOrangeWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevOrangeWoolSlopes"), 210, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevOrangeWoolSlopes");
            ItemKaevOrangeWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevOrangeWoolSlopes.id - 256, "OrangeWool")).a("ItemKaevOrangeWoolSlopes");
        }
        else
        {
            BlockKaevOrangeWoolSlopes = Block.STONE;
        }

        props.save();
    }
}
