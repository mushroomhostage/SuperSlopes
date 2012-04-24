package net.minecraft.server;

import forge.NetworkMod;
import java.io.File;

public class mod_Kaevator_Corners extends NetworkMod
{
    public static KrushProps props = new KrushProps((new File(getAppdata() + "/config/KaevatorSuperSlopes.props")).getPath());
    public static int CornersRenderID;
    public static int SlopesOpacity;
    public static final Block BlockKaevWoodCorners;
    public static final Block BlockKaevCobblestoneCorners;
    public static final Block BlockKaevGlassCorners;
    public static final Block BlockKaevSandstoneCorners;
    public static final Block BlockKaevDirtCorners;
    public static final Block BlockKaevStoneCorners;
    public static final Block BlockKaevSandCorners;
    public static final Block BlockKaevSnowCorners;
    public static final Block BlockKaevGrassCorners;
    public static final Block BlockKaevBricksCorners;
    public static final Block BlockKaevGravelCorners;
    public static final Block BlockKaevGoldCorners;
    public static final Block BlockKaevSteelCorners;
    public static final Block BlockKaevObsidianCorners;
    public static final Block BlockKaevDiamondCorners;
    public static final Block BlockKaevWhiteWoolCorners;
    public static final Block BlockKaevBlackWoolCorners;
    public static final Block BlockKaevRedWoolCorners;
    public static final Block BlockKaevGreenWoolCorners;
    public static final Block BlockKaevBrownWoolCorners;
    public static final Block BlockKaevBlueWoolCorners;
    public static final Block BlockKaevPurpleWoolCorners;
    public static final Block BlockKaevCyanWoolCorners;
    public static final Block BlockKaevSilverWoolCorners;
    public static final Block BlockKaevGrayWoolCorners;
    public static final Block BlockKaevPinkWoolCorners;
    public static final Block BlockKaevLimeWoolCorners;
    public static final Block BlockKaevYellowWoolCorners;
    public static final Block BlockKaevLightBlueWoolCorners;
    public static final Block BlockKaevMagentaWoolCorners;
    public static final Block BlockKaevOrangeWoolCorners;
    public static Item ItemKaevWoodCorners;
    public static Item ItemKaevCobblestoneCorners;
    public static Item ItemKaevGlassCorners;
    public static Item ItemKaevSandstoneCorners;
    public static Item ItemKaevDirtCorners;
    public static Item ItemKaevStoneCorners;
    public static Item ItemKaevSandCorners;
    public static Item ItemKaevSnowCorners;
    public static Item ItemKaevGrassCorners;
    public static Item ItemKaevBricksCorners;
    public static Item ItemKaevGravelCorners;
    public static Item ItemKaevGoldCorners;
    public static Item ItemKaevSteelCorners;
    public static Item ItemKaevObsidianCorners;
    public static Item ItemKaevDiamondCorners;
    public static Item ItemKaevWhiteWoolCorners;
    public static Item ItemKaevBlackWoolCorners;
    public static Item ItemKaevRedWoolCorners;
    public static Item ItemKaevGreenWoolCorners;
    public static Item ItemKaevBrownWoolCorners;
    public static Item ItemKaevBlueWoolCorners;
    public static Item ItemKaevPurpleWoolCorners;
    public static Item ItemKaevCyanWoolCorners;
    public static Item ItemKaevSilverWoolCorners;
    public static Item ItemKaevGrayWoolCorners;
    public static Item ItemKaevPinkWoolCorners;
    public static Item ItemKaevLimeWoolCorners;
    public static Item ItemKaevYellowWoolCorners;
    public static Item ItemKaevLightBlueWoolCorners;
    public static Item ItemKaevMagentaWoolCorners;
    public static Item ItemKaevOrangeWoolCorners;
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

        if (props.getInt("BlockKaevWoodCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(Block.WOOD, 1), new Object[] {"#", '#', BlockKaevWoodCorners});
        }

        if (props.getInt("BlockKaevCobblestoneCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(Block.COBBLESTONE, 1), new Object[] {"#", '#', BlockKaevCobblestoneCorners});
        }

        if (props.getInt("BlockKaevGlassCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(Block.GLASS, 1), new Object[] {"#", '#', BlockKaevGlassCorners});
        }

        if (props.getInt("BlockKaevSandstoneCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(Block.SANDSTONE, 1), new Object[] {"#", '#', BlockKaevSandstoneCorners});
        }

        if (props.getInt("BlockKaevDirtCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(Block.DIRT, 1), new Object[] {"#", '#', BlockKaevDirtCorners});
        }

        if (props.getInt("BlockKaevStoneCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(Block.STONE, 1), new Object[] {"#", '#', BlockKaevStoneCorners});
        }

        if (props.getInt("BlockKaevSandCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(Block.SAND, 1), new Object[] {"#", '#', BlockKaevSandCorners});
        }

        if (props.getInt("BlockKaevSnowCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.SNOW_BLOCK, 1), new Object[] {"#", '#', BlockKaevSnowCorners});
        }

        if (props.getInt("BlockKaevGrassCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(Block.GRASS, 1), new Object[] {"#", '#', BlockKaevGrassCorners});
        }

        if (props.getInt("BlockKaevBricksCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(Block.BRICK, 1), new Object[] {"#", '#', BlockKaevBricksCorners});
        }

        if (props.getInt("BlockKaevGravelCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(Block.GRAVEL, 1), new Object[] {"#", '#', BlockKaevGravelCorners});
        }

        if (props.getInt("BlockKaevGoldCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.GOLD_BLOCK, 1), new Object[] {"#", '#', BlockKaevGoldCorners});
        }

        if (props.getInt("BlockKaevSteelCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.IRON_BLOCK, 1), new Object[] {"#", '#', BlockKaevSteelCorners});
        }

        if (props.getInt("BlockKaevObsidianCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(Block.OBSIDIAN, 1), new Object[] {"#", '#', BlockKaevObsidianCorners});
        }

        if (props.getInt("BlockKaevDiamondCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.DIAMOND_BLOCK, 1), new Object[] {"#", '#', BlockKaevDiamondCorners});
        }

        if (props.getInt("BlockKaevWhiteWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {" # ", "###", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {"###", " # ", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {" # ", " # ", "###", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {"###", " # ", " # ", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 0), new Object[] {"#", '#', BlockKaevWhiteWoolCorners});
        }

        if (props.getInt("BlockKaevBlackWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 15), new Object[] {"#", '#', BlockKaevBlackWoolCorners});
        }

        if (props.getInt("BlockKaevRedWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 14), new Object[] {"#", '#', BlockKaevRedWoolCorners});
        }

        if (props.getInt("BlockKaevGreenWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 13), new Object[] {"#", '#', BlockKaevGreenWoolCorners});
        }

        if (props.getInt("BlockKaevBrownWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 12), new Object[] {"#", '#', BlockKaevBrownWoolCorners});
        }

        if (props.getInt("BlockKaevBlueWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 11), new Object[] {"#", '#', BlockKaevBlueWoolCorners});
        }

        if (props.getInt("BlockKaevPurpleWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 10), new Object[] {"#", '#', BlockKaevPurpleWoolCorners});
        }

        if (props.getInt("BlockKaevCyanWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 9), new Object[] {"#", '#', BlockKaevCyanWoolCorners});
        }

        if (props.getInt("BlockKaevSilverWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 8), new Object[] {"#", '#', BlockKaevSilverWoolCorners});
        }

        if (props.getInt("BlockKaevGrayWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 7), new Object[] {"#", '#', BlockKaevGrayWoolCorners});
        }

        if (props.getInt("BlockKaevPinkWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 6), new Object[] {"#", '#', BlockKaevPinkWoolCorners});
        }

        if (props.getInt("BlockKaevLimeWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 5), new Object[] {"#", '#', BlockKaevLimeWoolCorners});
        }

        if (props.getInt("BlockKaevYellowWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 4), new Object[] {"#", '#', BlockKaevYellowWoolCorners});
        }

        if (props.getInt("BlockKaevLightBlueWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 3), new Object[] {"#", '#', BlockKaevLightBlueWoolCorners});
        }

        if (props.getInt("BlockKaevMagentaWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 2), new Object[] {"#", '#', BlockKaevMagentaWoolCorners});
        }

        if (props.getInt("BlockKaevOrangeWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 1), new Object[] {"#", '#', BlockKaevOrangeWoolCorners});
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

        if (props.getInt("BlockKaevWoodCorners") != 0)
        {
            BlockKaevWoodCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevWoodCorners"), 4, Material.WOOD)).c(2.0F).a(Block.e).b(5.0F).a("BlockKaevWoodCorners");
            ItemKaevWoodCorners = (new ItemCorners_Kaevator(BlockKaevWoodCorners.id - 256, "Wood")).a("ItemKaevWoodCorners");
        }
        else
        {
            BlockKaevWoodCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevCobblestoneCorners") != 0)
        {
            BlockKaevCobblestoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevCobblestoneCorners"), 16, Material.STONE)).c(2.0F).a(Block.h).b(10.0F).a("BlockKaevCobblestoneCorners");
            ItemKaevCobblestoneCorners = (new ItemCorners_Kaevator(BlockKaevCobblestoneCorners.id - 256, "Cobblestone")).a("ItemKaevCobblestoneCorners");
        }
        else
        {
            BlockKaevCobblestoneCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGlassCorners") != 0)
        {
            BlockKaevGlassCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGlassCorners"), 49, Material.SHATTERABLE)).c(0.3F).a(Block.j).a("BlockKaevGlassCorners");
            ItemKaevGlassCorners = (new ItemCorners_Kaevator(BlockKaevGlassCorners.id - 256, "Glass")).a("ItemKaevGlassCorners");
        }
        else
        {
            BlockKaevGlassCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSandstoneCorners") != 0)
        {
            BlockKaevSandstoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSandstoneCorners"), 192, Material.STONE)).c(0.8F).a(Block.h).a("BlockKaevSandstoneCorners");
            ItemKaevSandstoneCorners = (new ItemCorners_Kaevator(BlockKaevSandstoneCorners.id - 256, "Sandstone")).a("ItemKaevSandstoneCorners");
        }
        else
        {
            BlockKaevSandstoneCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevDirtCorners") != 0)
        {
            BlockKaevDirtCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevDirtCorners"), 2, Material.EARTH)).c(0.5F).a(Block.f).a("BlockKaevDirtCorners");
            ItemKaevDirtCorners = (new ItemCorners_Kaevator(BlockKaevDirtCorners.id - 256, "Dirt")).a("ItemKaevDirtCorners");
        }
        else
        {
            BlockKaevDirtCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevStoneCorners") != 0)
        {
            BlockKaevStoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevStoneCorners"), 1, Material.STONE)).c(1.5F).a(Block.h).b(10.0F).a("BlockKaevStoneCorners");
            ItemKaevStoneCorners = (new ItemCorners_Kaevator(BlockKaevStoneCorners.id - 256, "Stone")).a("ItemKaevStoneCorners");
        }
        else
        {
            BlockKaevStoneCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSandCorners") != 0)
        {
            BlockKaevSandCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSandCorners"), 18, Material.SAND)).c(0.5F).a(Block.l).a("BlockKaevSandCorners");
            ItemKaevSandCorners = (new ItemCorners_Kaevator(BlockKaevSandCorners.id - 256, "Sand")).a("ItemKaevSandCorners");
        }
        else
        {
            BlockKaevSandCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSnowCorners") != 0)
        {
            BlockKaevSnowCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSnowCorners"), 66, Material.SNOW_LAYER)).c(0.1F).a(Block.k).a("BlockKaevSnowCorners");
            ItemKaevSnowCorners = (new ItemCorners_Kaevator(BlockKaevSnowCorners.id - 256, "Snow")).a("ItemKaevSnowCorners");
        }
        else
        {
            BlockKaevSnowCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGrassCorners") != 0)
        {
            BlockKaevGrassCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGrassCorners"), 3, Material.EARTH)).c(0.6F).a(Block.g).a("BlockKaevGrassCorners");
            ItemKaevGrassCorners = (new ItemCorners_Kaevator(BlockKaevGrassCorners.id - 256, "Grass")).a("ItemKaevGrassCorners");
        }
        else
        {
            BlockKaevGrassCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevBricksCorners") != 0)
        {
            BlockKaevBricksCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBricksCorners"), 7, Material.STONE)).c(2.0F).a(Block.h).b(10.0F).a("BlockKaevBricksCorners");
            ItemKaevBricksCorners = (new ItemCorners_Kaevator(BlockKaevBricksCorners.id - 256, "Bricks")).a("ItemKaevBricksCorners");
        }
        else
        {
            BlockKaevBricksCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGravelCorners") != 0)
        {
            BlockKaevGravelCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGravelCorners"), 19, Material.SAND)).c(0.6F).a(Block.f).a("BlockKaevGravelCorners");
            ItemKaevGravelCorners = (new ItemCorners_Kaevator(BlockKaevGravelCorners.id - 256, "Gravel")).a("ItemKaevGravelCorners");
        }
        else
        {
            BlockKaevGravelCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGoldCorners") != 0)
        {
            BlockKaevGoldCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGoldCorners"), 23, Material.ORE)).c(3.0F).a(Block.i).b(10.0F).a("BlockKaevGoldCorners");
            ItemKaevGoldCorners = (new ItemCorners_Kaevator(BlockKaevGoldCorners.id - 256, "Gold")).a("ItemKaevGoldCorners");
        }
        else
        {
            BlockKaevGoldCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSteelCorners") != 0)
        {
            BlockKaevSteelCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSteelCorners"), 22, Material.ORE)).c(5.0F).a(Block.i).b(10.0F).a("BlockKaevSteelCorners");
            ItemKaevSteelCorners = (new ItemCorners_Kaevator(BlockKaevSteelCorners.id - 256, "Steel")).a("ItemKaevSteelCorners");
        }
        else
        {
            BlockKaevSteelCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevObsidianCorners") != 0)
        {
            BlockKaevObsidianCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevObsidianCorners"), 37, Material.STONE)).c(10.0F).a(Block.h).b(2000.0F).a("BlockKaevObsidianCorners");
            ItemKaevObsidianCorners = (new ItemCorners_Kaevator(BlockKaevObsidianCorners.id - 256, "Obsidian")).a("ItemKaevObsidianCorners");
        }
        else
        {
            BlockKaevObsidianCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevDiamondCorners") != 0)
        {
            BlockKaevDiamondCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevDiamondCorners"), 24, Material.ORE)).c(5.0F).a(Block.i).b(10.0F).a("BlockKaevDiamondCorners");
            ItemKaevDiamondCorners = (new ItemCorners_Kaevator(BlockKaevDiamondCorners.id - 256, "Diamond")).a("ItemKaevDiamondCorners");
        }
        else
        {
            BlockKaevDiamondCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevWhiteWoolCorners") != 0)
        {
            BlockKaevWhiteWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevWhiteWoolCorners"), 64, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevWhiteWoolCorners");
            ItemKaevWhiteWoolCorners = (new ItemCorners_Kaevator(BlockKaevWhiteWoolCorners.id - 256, "WhiteWool")).a("ItemKaevWhiteWoolCorners");
        }
        else
        {
            BlockKaevWhiteWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevBlackWoolCorners") != 0)
        {
            BlockKaevBlackWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBlackWoolCorners"), 113, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBlackWoolCorners");
            ItemKaevBlackWoolCorners = (new ItemCorners_Kaevator(BlockKaevBlackWoolCorners.id - 256, "BlackWool")).a("ItemKaevBlackWoolCorners");
        }
        else
        {
            BlockKaevBlackWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevRedWoolCorners") != 0)
        {
            BlockKaevRedWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevRedWoolCorners"), 129, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevRedWoolCorners");
            ItemKaevRedWoolCorners = (new ItemCorners_Kaevator(BlockKaevRedWoolCorners.id - 256, "RedWool")).a("ItemKaevRedWoolCorners");
        }
        else
        {
            BlockKaevRedWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGreenWoolCorners") != 0)
        {
            BlockKaevGreenWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGreenWoolCorners"), 145, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevGreenWoolCorners");
            ItemKaevGreenWoolCorners = (new ItemCorners_Kaevator(BlockKaevGreenWoolCorners.id - 256, "GreenWool")).a("ItemKaevGreenWoolCorners");
        }
        else
        {
            BlockKaevGreenWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevBrownWoolCorners") != 0)
        {
            BlockKaevBrownWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBrownWoolCorners"), 161, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBrownWoolCorners");
            ItemKaevBrownWoolCorners = (new ItemCorners_Kaevator(BlockKaevBrownWoolCorners.id - 256, "BrownWool")).a("ItemKaevBrownWoolCorners");
        }
        else
        {
            BlockKaevBrownWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevBlueWoolCorners") != 0)
        {
            BlockKaevBlueWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBlueWoolCorners"), 177, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBlueWoolCorners");
            ItemKaevBlueWoolCorners = (new ItemCorners_Kaevator(BlockKaevBlueWoolCorners.id - 256, "BlueWool")).a("ItemKaevBlueWoolCorners");
        }
        else
        {
            BlockKaevBlueWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevPurpleWoolCorners") != 0)
        {
            BlockKaevPurpleWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevPurpleWoolCorners"), 193, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevPurpleWoolCorners");
            ItemKaevPurpleWoolCorners = (new ItemCorners_Kaevator(BlockKaevPurpleWoolCorners.id - 256, "PurpleWool")).a("ItemKaevPurpleWoolCorners");
        }
        else
        {
            BlockKaevPurpleWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevCyanWoolCorners") != 0)
        {
            BlockKaevCyanWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevCyanWoolCorners"), 209, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevCyanWoolCorners");
            ItemKaevCyanWoolCorners = (new ItemCorners_Kaevator(BlockKaevCyanWoolCorners.id - 256, "CyanWool")).a("ItemKaevCyanWoolCorners");
        }
        else
        {
            BlockKaevCyanWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSilverWoolCorners") != 0)
        {
            BlockKaevSilverWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSilverWoolCorners"), 225, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevSilverWoolCorners");
            ItemKaevSilverWoolCorners = (new ItemCorners_Kaevator(BlockKaevSilverWoolCorners.id - 256, "SilverWool")).a("ItemKaevSilverWoolCorners");
        }
        else
        {
            BlockKaevSilverWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGrayWoolCorners") != 0)
        {
            BlockKaevGrayWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGrayWoolCorners"), 114, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevGrayWoolCorners");
            ItemKaevGrayWoolCorners = (new ItemCorners_Kaevator(BlockKaevGrayWoolCorners.id - 256, "GrayWool")).a("ItemKaevGrayWoolCorners");
        }
        else
        {
            BlockKaevGrayWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevPinkWoolCorners") != 0)
        {
            BlockKaevPinkWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevPinkWoolCorners"), 130, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevPinkWoolCorners");
            ItemKaevPinkWoolCorners = (new ItemCorners_Kaevator(BlockKaevPinkWoolCorners.id - 256, "PinkWool")).a("ItemKaevPinkWoolCorners");
        }
        else
        {
            BlockKaevPinkWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevLimeWoolCorners") != 0)
        {
            BlockKaevLimeWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevLimeWoolCorners"), 146, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevLimeWoolCorners");
            ItemKaevLimeWoolCorners = (new ItemCorners_Kaevator(BlockKaevLimeWoolCorners.id - 256, "LimeWool")).a("ItemKaevLimeWoolCorners");
        }
        else
        {
            BlockKaevLimeWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevYellowWoolCorners") != 0)
        {
            BlockKaevYellowWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevYellowWoolCorners"), 162, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevYellowWoolCorners");
            ItemKaevYellowWoolCorners = (new ItemCorners_Kaevator(BlockKaevYellowWoolCorners.id - 256, "YellowWool")).a("ItemKaevYellowWoolCorners");
        }
        else
        {
            BlockKaevYellowWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevLightBlueWoolCorners") != 0)
        {
            BlockKaevLightBlueWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevLightBlueWoolCorners"), 178, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevLightBlueWoolCorners");
            ItemKaevLightBlueWoolCorners = (new ItemCorners_Kaevator(BlockKaevLightBlueWoolCorners.id - 256, "LightBlueWool")).a("ItemKaevLightBlueWoolCorners");
        }
        else
        {
            BlockKaevLightBlueWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevMagentaWoolCorners") != 0)
        {
            BlockKaevMagentaWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevMagentaWoolCorners"), 194, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevMagentaWoolCorners");
            ItemKaevMagentaWoolCorners = (new ItemCorners_Kaevator(BlockKaevMagentaWoolCorners.id - 256, "MagentaWool")).a("ItemKaevMagentaWoolCorners");
        }
        else
        {
            BlockKaevMagentaWoolCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevOrangeWoolCorners") != 0)
        {
            BlockKaevOrangeWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevOrangeWoolCorners"), 210, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevOrangeWoolCorners");
            ItemKaevOrangeWoolCorners = (new ItemCorners_Kaevator(BlockKaevOrangeWoolCorners.id - 256, "OrangeWool")).a("ItemKaevOrangeWoolCorners");
        }
        else
        {
            BlockKaevOrangeWoolCorners = Block.STONE;
        }

        props.save();
    }
}
