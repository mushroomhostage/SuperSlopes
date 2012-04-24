package net.minecraft.server;

import forge.NetworkMod;
import java.io.File;

public class mod_Kaevator_IntCorners extends NetworkMod
{
    public static KrushProps props = new KrushProps((new File(getAppdata() + "/config/KaevatorSuperSlopes.props")).getPath());
    public static int IntCornersRenderID;
    public static int SlopesOpacity;
    public static final Block BlockKaevWoodIntCorners;
    public static final Block BlockKaevCobblestoneIntCorners;
    public static final Block BlockKaevGlassIntCorners;
    public static final Block BlockKaevSandstoneIntCorners;
    public static final Block BlockKaevDirtIntCorners;
    public static final Block BlockKaevStoneIntCorners;
    public static final Block BlockKaevSandIntCorners;
    public static final Block BlockKaevSnowIntCorners;
    public static final Block BlockKaevGrassIntCorners;
    public static final Block BlockKaevBricksIntCorners;
    public static final Block BlockKaevGravelIntCorners;
    public static final Block BlockKaevGoldIntCorners;
    public static final Block BlockKaevSteelIntCorners;
    public static final Block BlockKaevObsidianIntCorners;
    public static final Block BlockKaevDiamondIntCorners;
    public static final Block BlockKaevWhiteWoolIntCorners;
    public static final Block BlockKaevBlackWoolIntCorners;
    public static final Block BlockKaevRedWoolIntCorners;
    public static final Block BlockKaevGreenWoolIntCorners;
    public static final Block BlockKaevBrownWoolIntCorners;
    public static final Block BlockKaevBlueWoolIntCorners;
    public static final Block BlockKaevPurpleWoolIntCorners;
    public static final Block BlockKaevCyanWoolIntCorners;
    public static final Block BlockKaevSilverWoolIntCorners;
    public static final Block BlockKaevGrayWoolIntCorners;
    public static final Block BlockKaevPinkWoolIntCorners;
    public static final Block BlockKaevLimeWoolIntCorners;
    public static final Block BlockKaevYellowWoolIntCorners;
    public static final Block BlockKaevLightBlueWoolIntCorners;
    public static final Block BlockKaevMagentaWoolIntCorners;
    public static final Block BlockKaevOrangeWoolIntCorners;
    public static Item ItemKaevWoodIntCorners;
    public static Item ItemKaevCobblestoneIntCorners;
    public static Item ItemKaevGlassIntCorners;
    public static Item ItemKaevSandstoneIntCorners;
    public static Item ItemKaevDirtIntCorners;
    public static Item ItemKaevStoneIntCorners;
    public static Item ItemKaevSandIntCorners;
    public static Item ItemKaevSnowIntCorners;
    public static Item ItemKaevGrassIntCorners;
    public static Item ItemKaevBricksIntCorners;
    public static Item ItemKaevGravelIntCorners;
    public static Item ItemKaevGoldIntCorners;
    public static Item ItemKaevSteelIntCorners;
    public static Item ItemKaevObsidianIntCorners;
    public static Item ItemKaevDiamondIntCorners;
    public static Item ItemKaevWhiteWoolIntCorners;
    public static Item ItemKaevBlackWoolIntCorners;
    public static Item ItemKaevRedWoolIntCorners;
    public static Item ItemKaevGreenWoolIntCorners;
    public static Item ItemKaevBrownWoolIntCorners;
    public static Item ItemKaevBlueWoolIntCorners;
    public static Item ItemKaevPurpleWoolIntCorners;
    public static Item ItemKaevCyanWoolIntCorners;
    public static Item ItemKaevSilverWoolIntCorners;
    public static Item ItemKaevGrayWoolIntCorners;
    public static Item ItemKaevPinkWoolIntCorners;
    public static Item ItemKaevLimeWoolIntCorners;
    public static Item ItemKaevYellowWoolIntCorners;
    public static Item ItemKaevLightBlueWoolIntCorners;
    public static Item ItemKaevMagentaWoolIntCorners;
    public static Item ItemKaevOrangeWoolIntCorners;
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

        if (props.getInt("BlockKaevWoodIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.WOOD});
            ModLoader.addRecipe(new ItemStack(Block.WOOD, 1), new Object[] {"#", '#', BlockKaevWoodIntCorners});
        }

        if (props.getInt("BlockKaevCobblestoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.COBBLESTONE});
            ModLoader.addRecipe(new ItemStack(Block.COBBLESTONE, 1), new Object[] {"#", '#', BlockKaevCobblestoneIntCorners});
        }

        if (props.getInt("BlockKaevGlassIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.GLASS});
            ModLoader.addRecipe(new ItemStack(Block.GLASS, 1), new Object[] {"#", '#', BlockKaevGlassIntCorners});
        }

        if (props.getInt("BlockKaevSandstoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.SANDSTONE});
            ModLoader.addRecipe(new ItemStack(Block.SANDSTONE, 1), new Object[] {"#", '#', BlockKaevSandstoneIntCorners});
        }

        if (props.getInt("BlockKaevDirtIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.DIRT});
            ModLoader.addRecipe(new ItemStack(Block.DIRT, 1), new Object[] {"#", '#', BlockKaevDirtIntCorners});
        }

        if (props.getInt("BlockKaevStoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.STONE});
            ModLoader.addRecipe(new ItemStack(Block.STONE, 1), new Object[] {"#", '#', BlockKaevStoneIntCorners});
        }

        if (props.getInt("BlockKaevSandIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.SAND});
            ModLoader.addRecipe(new ItemStack(Block.SAND, 1), new Object[] {"#", '#', BlockKaevSandIntCorners});
        }

        if (props.getInt("BlockKaevSnowIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.SNOW_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.SNOW_BLOCK, 1), new Object[] {"#", '#', BlockKaevSnowIntCorners});
        }

        if (props.getInt("BlockKaevGrassIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.GRASS});
            ModLoader.addRecipe(new ItemStack(Block.GRASS, 1), new Object[] {"#", '#', BlockKaevGrassIntCorners});
        }

        if (props.getInt("BlockKaevBricksIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.BRICK});
            ModLoader.addRecipe(new ItemStack(Block.BRICK, 1), new Object[] {"#", '#', BlockKaevBricksIntCorners});
        }

        if (props.getInt("BlockKaevGravelIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.GRAVEL});
            ModLoader.addRecipe(new ItemStack(Block.GRAVEL, 1), new Object[] {"#", '#', BlockKaevGravelIntCorners});
        }

        if (props.getInt("BlockKaevGoldIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.GOLD_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.GOLD_BLOCK, 1), new Object[] {"#", '#', BlockKaevGoldIntCorners});
        }

        if (props.getInt("BlockKaevSteelIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.IRON_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.IRON_BLOCK, 1), new Object[] {"#", '#', BlockKaevSteelIntCorners});
        }

        if (props.getInt("BlockKaevObsidianIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.OBSIDIAN});
            ModLoader.addRecipe(new ItemStack(Block.OBSIDIAN, 1), new Object[] {"#", '#', BlockKaevObsidianIntCorners});
        }

        if (props.getInt("BlockKaevDiamondIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.DIAMOND_BLOCK});
            ModLoader.addRecipe(new ItemStack(Block.DIAMOND_BLOCK, 1), new Object[] {"#", '#', BlockKaevDiamondIntCorners});
        }

        if (props.getInt("BlockKaevWhiteWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {"  #", "###", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {"###", "  #", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {"## ", "# #", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {"# #", "## ", '#', Block.WOOL});
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 0), new Object[] {"#", '#', BlockKaevWhiteWoolIntCorners});
        }

        if (props.getInt("BlockKaevBlackWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 15), new Object[] {"#", '#', BlockKaevBlackWoolIntCorners});
        }

        if (props.getInt("BlockKaevRedWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 14), new Object[] {"#", '#', BlockKaevRedWoolIntCorners});
        }

        if (props.getInt("BlockKaevGreenWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 13), new Object[] {"#", '#', BlockKaevGreenWoolIntCorners});
        }

        if (props.getInt("BlockKaevBrownWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 12), new Object[] {"#", '#', BlockKaevBrownWoolIntCorners});
        }

        if (props.getInt("BlockKaevBlueWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 11), new Object[] {"#", '#', BlockKaevBlueWoolIntCorners});
        }

        if (props.getInt("BlockKaevPurpleWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 10), new Object[] {"#", '#', BlockKaevPurpleWoolIntCorners});
        }

        if (props.getInt("BlockKaevCyanWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 9), new Object[] {"#", '#', BlockKaevCyanWoolIntCorners});
        }

        if (props.getInt("BlockKaevSilverWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 8), new Object[] {"#", '#', BlockKaevSilverWoolIntCorners});
        }

        if (props.getInt("BlockKaevGrayWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 7), new Object[] {"#", '#', BlockKaevGrayWoolIntCorners});
        }

        if (props.getInt("BlockKaevPinkWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 6), new Object[] {"#", '#', BlockKaevPinkWoolIntCorners});
        }

        if (props.getInt("BlockKaevLimeWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 5), new Object[] {"#", '#', BlockKaevLimeWoolIntCorners});
        }

        if (props.getInt("BlockKaevYellowWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 4), new Object[] {"#", '#', BlockKaevYellowWoolIntCorners});
        }

        if (props.getInt("BlockKaevLightBlueWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 3), new Object[] {"#", '#', BlockKaevLightBlueWoolIntCorners});
        }

        if (props.getInt("BlockKaevMagentaWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 2), new Object[] {"#", '#', BlockKaevMagentaWoolIntCorners});
        }

        if (props.getInt("BlockKaevOrangeWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.WOOL, 1, 1), new Object[] {"#", '#', BlockKaevOrangeWoolIntCorners});
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

        if (props.getInt("BlockKaevWoodIntCorners") != 0)
        {
            BlockKaevWoodIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevWoodIntCorners"), 4, Material.WOOD)).c(2.0F).a(Block.e).b(5.0F).a("BlockKaevWoodIntCorners");
            ItemKaevWoodIntCorners = (new ItemIntCorners_Kaevator(BlockKaevWoodIntCorners.id - 256, "Wood")).a("ItemKaevWoodIntCorners");
        }
        else
        {
            BlockKaevWoodIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevCobblestoneIntCorners") != 0)
        {
            BlockKaevCobblestoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevCobblestoneIntCorners"), 16, Material.STONE)).c(2.0F).a(Block.h).b(10.0F).a("BlockKaevCobblestoneIntCorners");
            ItemKaevCobblestoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevCobblestoneIntCorners.id - 256, "Cobblestone")).a("ItemKaevCobblestoneIntCorners");
        }
        else
        {
            BlockKaevCobblestoneIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGlassIntCorners") != 0)
        {
            BlockKaevGlassIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGlassIntCorners"), 49, Material.SHATTERABLE)).c(0.3F).a(Block.j).a("BlockKaevGlassIntCorners");
            ItemKaevGlassIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGlassIntCorners.id - 256, "Glass")).a("ItemKaevGlassIntCorners");
        }
        else
        {
            BlockKaevGlassIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSandstoneIntCorners") != 0)
        {
            BlockKaevSandstoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSandstoneIntCorners"), 192, Material.STONE)).c(0.8F).a(Block.h).a("BlockKaevSandstoneIntCorners");
            ItemKaevSandstoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSandstoneIntCorners.id - 256, "Sandstone")).a("ItemKaevSandstoneIntCorners");
        }
        else
        {
            BlockKaevSandstoneIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevDirtIntCorners") != 0)
        {
            BlockKaevDirtIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevDirtIntCorners"), 2, Material.EARTH)).c(0.5F).a(Block.f).a("BlockKaevDirtIntCorners");
            ItemKaevDirtIntCorners = (new ItemIntCorners_Kaevator(BlockKaevDirtIntCorners.id - 256, "Dirt")).a("ItemKaevDirtIntCorners");
        }
        else
        {
            BlockKaevDirtIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevStoneIntCorners") != 0)
        {
            BlockKaevStoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevStoneIntCorners"), 1, Material.STONE)).c(1.5F).a(Block.h).b(10.0F).a("BlockKaevStoneIntCorners");
            ItemKaevStoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevStoneIntCorners.id - 256, "Stone")).a("ItemKaevStoneIntCorners");
        }
        else
        {
            BlockKaevStoneIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSandIntCorners") != 0)
        {
            BlockKaevSandIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSandIntCorners"), 18, Material.SAND)).c(0.5F).a(Block.l).a("BlockKaevSandIntCorners");
            ItemKaevSandIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSandIntCorners.id - 256, "Sand")).a("ItemKaevSandIntCorners");
        }
        else
        {
            BlockKaevSandIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSnowIntCorners") != 0)
        {
            BlockKaevSnowIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSnowIntCorners"), 66, Material.SNOW_LAYER)).c(0.1F).a(Block.k).a("BlockKaevSnowIntCorners");
            ItemKaevSnowIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSnowIntCorners.id - 256, "Snow")).a("ItemKaevSnowIntCorners");
        }
        else
        {
            BlockKaevSnowIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGrassIntCorners") != 0)
        {
            BlockKaevGrassIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGrassIntCorners"), 3, Material.EARTH)).c(0.6F).a(Block.g).a("BlockKaevGrassIntCorners");
            ItemKaevGrassIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGrassIntCorners.id - 256, "Grass")).a("ItemKaevGrassIntCorners");
        }
        else
        {
            BlockKaevGrassIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevBricksIntCorners") != 0)
        {
            BlockKaevBricksIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBricksIntCorners"), 7, Material.STONE)).c(2.0F).a(Block.h).b(10.0F).a("BlockKaevBricksIntCorners");
            ItemKaevBricksIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBricksIntCorners.id - 256, "Bricks")).a("ItemKaevBricksIntCorners");
        }
        else
        {
            BlockKaevBricksIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGravelIntCorners") != 0)
        {
            BlockKaevGravelIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGravelIntCorners"), 19, Material.SAND)).c(0.6F).a(Block.f).a("BlockKaevGravelIntCorners");
            ItemKaevGravelIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGravelIntCorners.id - 256, "Gravel")).a("ItemKaevGravelIntCorners");
        }
        else
        {
            BlockKaevGravelIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGoldIntCorners") != 0)
        {
            BlockKaevGoldIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGoldIntCorners"), 23, Material.ORE)).c(3.0F).a(Block.i).b(10.0F).a("BlockKaevGoldIntCorners");
            ItemKaevGoldIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGoldIntCorners.id - 256, "Gold")).a("ItemKaevGoldIntCorners");
        }
        else
        {
            BlockKaevGoldIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSteelIntCorners") != 0)
        {
            BlockKaevSteelIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSteelIntCorners"), 22, Material.ORE)).c(5.0F).a(Block.i).b(10.0F).a("BlockKaevSteelIntCorners");
            ItemKaevSteelIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSteelIntCorners.id - 256, "Steel")).a("ItemKaevSteelIntCorners");
        }
        else
        {
            BlockKaevSteelIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevObsidianIntCorners") != 0)
        {
            BlockKaevObsidianIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevObsidianIntCorners"), 37, Material.STONE)).c(10.0F).a(Block.h).b(2000.0F).a("BlockKaevObsidianIntCorners");
            ItemKaevObsidianIntCorners = (new ItemIntCorners_Kaevator(BlockKaevObsidianIntCorners.id - 256, "Obsidian")).a("ItemKaevObsidianIntCorners");
        }
        else
        {
            BlockKaevObsidianIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevDiamondIntCorners") != 0)
        {
            BlockKaevDiamondIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevDiamondIntCorners"), 24, Material.ORE)).c(5.0F).a(Block.i).b(10.0F).a("BlockKaevDiamondIntCorners");
            ItemKaevDiamondIntCorners = (new ItemIntCorners_Kaevator(BlockKaevDiamondIntCorners.id - 256, "Diamond")).a("ItemKaevDiamondIntCorners");
        }
        else
        {
            BlockKaevDiamondIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevWhiteWoolIntCorners") != 0)
        {
            BlockKaevWhiteWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevWhiteWoolIntCorners", 212), 64, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevWhiteWoolIntCorners");
            ItemKaevWhiteWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevWhiteWoolIntCorners.id - 256, "WhiteWool")).a("ItemKaevWhiteWoolIntCorners");
        }
        else
        {
            BlockKaevWhiteWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevBlackWoolIntCorners") != 0)
        {
            BlockKaevBlackWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBlackWoolIntCorners", 213), 113, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBlackWoolIntCorners");
            ItemKaevBlackWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBlackWoolIntCorners.id - 256, "BlackWool")).a("ItemKaevBlackWoolIntCorners");
        }
        else
        {
            BlockKaevBlackWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevRedWoolIntCorners") != 0)
        {
            BlockKaevRedWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevRedWoolIntCorners", 214), 129, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevRedWoolIntCorners");
            ItemKaevRedWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevRedWoolIntCorners.id - 256, "RedWool")).a("ItemKaevRedWoolIntCorners");
        }
        else
        {
            BlockKaevRedWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGreenWoolIntCorners") != 0)
        {
            BlockKaevGreenWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGreenWoolIntCorners", 215), 145, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevGreenWoolIntCorners");
            ItemKaevGreenWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGreenWoolIntCorners.id - 256, "GreenWool")).a("ItemKaevGreenWoolIntCorners");
        }
        else
        {
            BlockKaevGreenWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevBrownWoolIntCorners") != 0)
        {
            BlockKaevBrownWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBrownWoolIntCorners", 216), 161, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBrownWoolIntCorners");
            ItemKaevBrownWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBrownWoolIntCorners.id - 256, "BrownWool")).a("ItemKaevBrownWoolIntCorners");
        }
        else
        {
            BlockKaevBrownWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevBlueWoolIntCorners") != 0)
        {
            BlockKaevBlueWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBlueWoolIntCorners", 217), 177, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevBlueWoolIntCorners");
            ItemKaevBlueWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBlueWoolIntCorners.id - 256, "BlueWool")).a("ItemKaevBlueWoolIntCorners");
        }
        else
        {
            BlockKaevBlueWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevPurpleWoolIntCorners") != 0)
        {
            BlockKaevPurpleWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevPurpleWoolIntCorners", 218), 193, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevPurpleWoolIntCorners");
            ItemKaevPurpleWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevPurpleWoolIntCorners.id - 256, "PurpleWool")).a("ItemKaevPurpleWoolIntCorners");
        }
        else
        {
            BlockKaevPurpleWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevCyanWoolIntCorners") != 0)
        {
            BlockKaevCyanWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevCyanWoolIntCorners", 219), 209, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevCyanWoolIntCorners");
            ItemKaevCyanWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevCyanWoolIntCorners.id - 256, "CyanWool")).a("ItemKaevCyanWoolIntCorners");
        }
        else
        {
            BlockKaevCyanWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevSilverWoolIntCorners") != 0)
        {
            BlockKaevSilverWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSilverWoolIntCorners", 220), 225, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevSilverWoolIntCorners");
            ItemKaevSilverWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSilverWoolIntCorners.id - 256, "SilverWool")).a("ItemKaevSilverWoolIntCorners");
        }
        else
        {
            BlockKaevSilverWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevGrayWoolIntCorners") != 0)
        {
            BlockKaevGrayWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGrayWoolIntCorners", 221), 114, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevGrayWoolIntCorners");
            ItemKaevGrayWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGrayWoolIntCorners.id - 256, "GrayWool")).a("ItemKaevGrayWoolIntCorners");
        }
        else
        {
            BlockKaevGrayWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevPinkWoolIntCorners") != 0)
        {
            BlockKaevPinkWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevPinkWoolIntCorners", 222), 130, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevPinkWoolIntCorners");
            ItemKaevPinkWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevPinkWoolIntCorners.id - 256, "PinkWool")).a("ItemKaevPinkWoolIntCorners");
        }
        else
        {
            BlockKaevPinkWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevLimeWoolIntCorners") != 0)
        {
            BlockKaevLimeWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevLimeWoolIntCorners", 223), 146, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevLimeWoolIntCorners");
            ItemKaevLimeWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevLimeWoolIntCorners.id - 256, "LimeWool")).a("ItemKaevLimeWoolIntCorners");
        }
        else
        {
            BlockKaevLimeWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevYellowWoolIntCorners") != 0)
        {
            BlockKaevYellowWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevYellowWoolIntCorners", 224), 162, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevYellowWoolIntCorners");
            ItemKaevYellowWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevYellowWoolIntCorners.id - 256, "YellowWool")).a("ItemKaevYellowWoolIntCorners");
        }
        else
        {
            BlockKaevYellowWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevLightBlueWoolIntCorners") != 0)
        {
            BlockKaevLightBlueWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevLightBlueWoolIntCorners", 225), 178, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevLightBlueWoolIntCorners");
            ItemKaevLightBlueWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevLightBlueWoolIntCorners.id - 256, "LightBlueWool")).a("ItemKaevLightBlueWoolIntCorners");
        }
        else
        {
            BlockKaevLightBlueWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevMagentaWoolIntCorners") != 0)
        {
            BlockKaevMagentaWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevMagentaWoolIntCorners", 226), 194, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevMagentaWoolIntCorners");
            ItemKaevMagentaWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevMagentaWoolIntCorners.id - 256, "MagentaWool")).a("ItemKaevMagentaWoolIntCorners");
        }
        else
        {
            BlockKaevMagentaWoolIntCorners = Block.STONE;
        }

        if (props.getInt("BlockKaevOrangeWoolIntCorners") != 0)
        {
            BlockKaevOrangeWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevOrangeWoolIntCorners", 227), 210, Material.CLOTH)).c(1.0F).a(Block.k).a("BlockKaevOrangeWoolIntCorners");
            ItemKaevOrangeWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevOrangeWoolIntCorners.id - 256, "OrangeWool")).a("ItemKaevOrangeWoolIntCorners");
        }
        else
        {
            BlockKaevOrangeWoolIntCorners = Block.STONE;
        }

        props.save();
    }
}
