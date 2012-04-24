package net.minecraft.src;

import java.io.File;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class mod_Kaevator_Corners extends BaseMod
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

    /** Fancy grass side matching biome */
    public static boolean fancyGrass = true;
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
        ModLoader.addLocalization("KaevWoodSlopesQuadriCornerDown.name", "wooden sloped angle");
        ModLoader.addLocalization("KaevWoodSlopesQuadriCornerUp.name", "wooden ceiling angle");
        ModLoader.addLocalization("KaevWoodSlopesTriCornerDown.name", "wooden slanted corner");
        ModLoader.addLocalization("KaevWoodSlopesTriCornerUp.name", "wooden slanted corner");
        ModLoader.addLocalization("KaevCobblestoneSlopesQuadriCornerDown.name", "cobblestone sloped angle");
        ModLoader.addLocalization("KaevCobblestoneSlopesQuadriCornerUp.name", "cobblestone ceiling angle");
        ModLoader.addLocalization("KaevCobblestoneSlopesTriCornerDown.name", "cobblestone slanted corner");
        ModLoader.addLocalization("KaevCobblestoneSlopesTriCornerUp.name", "cobblestone slanted corner");
        ModLoader.addLocalization("KaevGlassSlopesQuadriCornerDown.name", "glass sloped angle");
        ModLoader.addLocalization("KaevGlassSlopesQuadriCornerUp.name", "glass ceiling angle");
        ModLoader.addLocalization("KaevGlassSlopesTriCornerDown.name", "glass slanted corner");
        ModLoader.addLocalization("KaevGlassSlopesTriCornerUp.name", "glass slanted corner");
        ModLoader.addLocalization("KaevSandstoneSlopesQuadriCornerDown.name", "sandstone sloped angle");
        ModLoader.addLocalization("KaevSandstoneSlopesQuadriCornerUp.name", "sandstone ceiling angle");
        ModLoader.addLocalization("KaevSandstoneSlopesTriCornerDown.name", "sandstone slanted corner");
        ModLoader.addLocalization("KaevSandstoneSlopesTriCornerUp.name", "sandstone slanted corner");
        ModLoader.addLocalization("KaevDirtSlopesQuadriCornerDown.name", "dirt sloped angle");
        ModLoader.addLocalization("KaevDirtSlopesQuadriCornerUp.name", "dirt ceiling angle");
        ModLoader.addLocalization("KaevDirtSlopesTriCornerDown.name", "dirt slanted corner");
        ModLoader.addLocalization("KaevDirtSlopesTriCornerUp.name", "dirt slanted corner");
        ModLoader.addLocalization("KaevStoneSlopesQuadriCornerDown.name", "stone sloped angle");
        ModLoader.addLocalization("KaevStoneSlopesQuadriCornerUp.name", "stone ceiling angle");
        ModLoader.addLocalization("KaevStoneSlopesTriCornerDown.name", "stone slanted corner");
        ModLoader.addLocalization("KaevStoneSlopesTriCornerUp.name", "stone slanted corner");
        ModLoader.addLocalization("KaevSandSlopesQuadriCornerDown.name", "sand sloped angle");
        ModLoader.addLocalization("KaevSandSlopesQuadriCornerUp.name", "sand ceiling angle");
        ModLoader.addLocalization("KaevSandSlopesTriCornerDown.name", "sand slanted corner");
        ModLoader.addLocalization("KaevSandSlopesTriCornerUp.name", "sand slanted corner");
        ModLoader.addLocalization("KaevSnowSlopesQuadriCornerDown.name", "snow sloped angle");
        ModLoader.addLocalization("KaevSnowSlopesQuadriCornerUp.name", "snow ceiling angle");
        ModLoader.addLocalization("KaevSnowSlopesTriCornerDown.name", "snow slanted corner");
        ModLoader.addLocalization("KaevSnowSlopesTriCornerUp.name", "snow slanted corner");
        ModLoader.addLocalization("KaevGrassSlopesQuadriCornerDown.name", "grass sloped angle");
        ModLoader.addLocalization("KaevGrassSlopesQuadriCornerUp.name", "grass ceiling angle");
        ModLoader.addLocalization("KaevGrassSlopesTriCornerDown.name", "grass slanted corner");
        ModLoader.addLocalization("KaevGrassSlopesTriCornerUp.name", "grass slanted corner");
        ModLoader.addLocalization("KaevBricksSlopesQuadriCornerDown.name", "bricks sloped angle");
        ModLoader.addLocalization("KaevBricksSlopesQuadriCornerUp.name", "bricks ceiling angle");
        ModLoader.addLocalization("KaevBricksSlopesTriCornerDown.name", "bricks slanted corner");
        ModLoader.addLocalization("KaevBricksSlopesTriCornerUp.name", "bricks slanted corner");
        ModLoader.addLocalization("KaevGravelSlopesQuadriCornerDown.name", "gravel sloped angle");
        ModLoader.addLocalization("KaevGravelSlopesQuadriCornerUp.name", "gravel ceiling angle");
        ModLoader.addLocalization("KaevGravelSlopesTriCornerDown.name", "gravel slanted corner");
        ModLoader.addLocalization("KaevGravelSlopesTriCornerUp.name", "gravel slanted corner");
        ModLoader.addLocalization("KaevGoldSlopesQuadriCornerDown.name", "golden sloped angle");
        ModLoader.addLocalization("KaevGoldSlopesQuadriCornerUp.name", "golden ceiling angle");
        ModLoader.addLocalization("KaevGoldSlopesTriCornerDown.name", "golden slanted corner");
        ModLoader.addLocalization("KaevGoldSlopesTriCornerUp.name", "golden slanted corner");
        ModLoader.addLocalization("KaevSteelSlopesQuadriCornerDown.name", "steel sloped angle");
        ModLoader.addLocalization("KaevSteelSlopesQuadriCornerUp.name", "steel ceiling angle");
        ModLoader.addLocalization("KaevSteelSlopesTriCornerDown.name", "steel slanted corner");
        ModLoader.addLocalization("KaevSteelSlopesTriCornerUp.name", "steel slanted corner");
        ModLoader.addLocalization("KaevObsidianSlopesQuadriCornerDown.name", "obsidian sloped angle");
        ModLoader.addLocalization("KaevObsidianSlopesQuadriCornerUp.name", "obsidian ceiling angle");
        ModLoader.addLocalization("KaevObsidianSlopesTriCornerDown.name", "obsidian slanted corner");
        ModLoader.addLocalization("KaevObsidianSlopesTriCornerUp.name", "obsidian slanted corner");
        ModLoader.addLocalization("KaevDiamondSlopesQuadriCornerDown.name", "diamond sloped angle");
        ModLoader.addLocalization("KaevDiamondSlopesQuadriCornerUp.name", "diamond ceiling angle");
        ModLoader.addLocalization("KaevDiamondSlopesTriCornerDown.name", "diamond slanted corner");
        ModLoader.addLocalization("KaevDiamondSlopesTriCornerUp.name", "diamond slanted corner");
        ModLoader.addLocalization("KaevWhiteWoolSlopesQuadriCornerDown.name", "white sloped angle");
        ModLoader.addLocalization("KaevWhiteWoolSlopesQuadriCornerUp.name", "white ceiling angle");
        ModLoader.addLocalization("KaevWhiteWoolSlopesTriCornerDown.name", "white slanted corner");
        ModLoader.addLocalization("KaevWhiteWoolSlopesTriCornerUp.name", "white slanted corner");
        ModLoader.addLocalization("KaevBlackWoolSlopesQuadriCornerDown.name", "black sloped angle");
        ModLoader.addLocalization("KaevBlackWoolSlopesQuadriCornerUp.name", "black ceiling angle");
        ModLoader.addLocalization("KaevBlackWoolSlopesTriCornerDown.name", "black slanted corner");
        ModLoader.addLocalization("KaevBlackWoolSlopesTriCornerUp.name", "black slanted corner");
        ModLoader.addLocalization("KaevRedWoolSlopesQuadriCornerDown.name", "red sloped angle");
        ModLoader.addLocalization("KaevRedWoolSlopesQuadriCornerUp.name", "red ceiling angle");
        ModLoader.addLocalization("KaevRedWoolSlopesTriCornerDown.name", "red slanted corner");
        ModLoader.addLocalization("KaevRedWoolSlopesTriCornerUp.name", "red slanted corner");
        ModLoader.addLocalization("KaevGreenWoolSlopesQuadriCornerDown.name", "green sloped angle");
        ModLoader.addLocalization("KaevGreenWoolSlopesQuadriCornerUp.name", "green ceiling angle");
        ModLoader.addLocalization("KaevGreenWoolSlopesTriCornerDown.name", "green slanted corner");
        ModLoader.addLocalization("KaevGreenWoolSlopesTriCornerUp.name", "green slanted corner");
        ModLoader.addLocalization("KaevBrownWoolSlopesQuadriCornerDown.name", "brown sloped angle");
        ModLoader.addLocalization("KaevBrownWoolSlopesQuadriCornerUp.name", "brown ceiling angle");
        ModLoader.addLocalization("KaevBrownWoolSlopesTriCornerDown.name", "brown slanted corner");
        ModLoader.addLocalization("KaevBrownWoolSlopesTriCornerUp.name", "brown slanted corner");
        ModLoader.addLocalization("KaevBlueWoolSlopesQuadriCornerDown.name", "blue sloped angle");
        ModLoader.addLocalization("KaevBlueWoolSlopesQuadriCornerUp.name", "blue ceiling angle");
        ModLoader.addLocalization("KaevBlueWoolSlopesTriCornerDown.name", "blue slanted corner");
        ModLoader.addLocalization("KaevBlueWoolSlopesTriCornerUp.name", "blue slanted corner");
        ModLoader.addLocalization("KaevPurpleWoolSlopesQuadriCornerDown.name", "purple sloped angle");
        ModLoader.addLocalization("KaevPurpleWoolSlopesQuadriCornerUp.name", "purple ceiling angle");
        ModLoader.addLocalization("KaevPurpleWoolSlopesTriCornerDown.name", "purple slanted corner");
        ModLoader.addLocalization("KaevPurpleWoolSlopesTriCornerUp.name", "purple slanted corner");
        ModLoader.addLocalization("KaevCyanWoolSlopesQuadriCornerDown.name", "cyan sloped angle");
        ModLoader.addLocalization("KaevCyanWoolSlopesQuadriCornerUp.name", "cyan ceiling angle");
        ModLoader.addLocalization("KaevCyanWoolSlopesTriCornerDown.name", "cyan slanted corner");
        ModLoader.addLocalization("KaevCyanWoolSlopesTriCornerUp.name", "cyan slanted corner");
        ModLoader.addLocalization("KaevSilverWoolSlopesQuadriCornerDown.name", "silver sloped angle");
        ModLoader.addLocalization("KaevSilverWoolSlopesQuadriCornerUp.name", "silver ceiling angle");
        ModLoader.addLocalization("KaevSilverWoolSlopesTriCornerDown.name", "silver slanted corner");
        ModLoader.addLocalization("KaevSilverWoolSlopesTriCornerUp.name", "silver slanted corner");
        ModLoader.addLocalization("KaevGrayWoolSlopesQuadriCornerDown.name", "gray sloped angle");
        ModLoader.addLocalization("KaevGrayWoolSlopesQuadriCornerUp.name", "gray ceiling angle");
        ModLoader.addLocalization("KaevGrayWoolSlopesTriCornerDown.name", "gray slanted corner");
        ModLoader.addLocalization("KaevGrayWoolSlopesTriCornerUp.name", "gray slanted corner");
        ModLoader.addLocalization("KaevPinkWoolSlopesQuadriCornerDown.name", "pink sloped angle");
        ModLoader.addLocalization("KaevPinkWoolSlopesQuadriCornerUp.name", "pink ceiling angle");
        ModLoader.addLocalization("KaevPinkWoolSlopesTriCornerDown.name", "pink slanted corner");
        ModLoader.addLocalization("KaevPinkWoolSlopesTriCornerUp.name", "pink slanted corner");
        ModLoader.addLocalization("KaevLimeWoolSlopesQuadriCornerDown.name", "lime sloped angle");
        ModLoader.addLocalization("KaevLimeWoolSlopesQuadriCornerUp.name", "lime ceiling angle");
        ModLoader.addLocalization("KaevLimeWoolSlopesTriCornerDown.name", "lime slanted corner");
        ModLoader.addLocalization("KaevLimeWoolSlopesTriCornerUp.name", "lime slanted corner");
        ModLoader.addLocalization("KaevYellowWoolSlopesQuadriCornerDown.name", "yellow sloped angle");
        ModLoader.addLocalization("KaevYellowWoolSlopesQuadriCornerUp.name", "yellow ceiling angle");
        ModLoader.addLocalization("KaevYellowWoolSlopesTriCornerDown.name", "yellow slanted corner");
        ModLoader.addLocalization("KaevYellowWoolSlopesTriCornerUp.name", "yellow slanted corner");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesQuadriCornerDown.name", "lightBlue sloped angle");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesQuadriCornerUp.name", "lightBlue ceiling angle");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesTriCornerDown.name", "lightBlue slanted corner");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesTriCornerUp.name", "lightBlue slanted corner");
        ModLoader.addLocalization("KaevMagentaWoolSlopesQuadriCornerDown.name", "magenta sloped angle");
        ModLoader.addLocalization("KaevMagentaWoolSlopesQuadriCornerUp.name", "magenta ceiling angle");
        ModLoader.addLocalization("KaevMagentaWoolSlopesTriCornerDown.name", "magenta slanted corner");
        ModLoader.addLocalization("KaevMagentaWoolSlopesTriCornerUp.name", "magenta slanted corner");
        ModLoader.addLocalization("KaevOrangeWoolSlopesQuadriCornerDown.name", "orange sloped angle");
        ModLoader.addLocalization("KaevOrangeWoolSlopesQuadriCornerUp.name", "orange ceiling angle");
        ModLoader.addLocalization("KaevOrangeWoolSlopesTriCornerDown.name", "orange slanted corner");
        ModLoader.addLocalization("KaevOrangeWoolSlopesTriCornerUp.name", "orange slanted corner");

        if (props.getInt("BlockKaevWoodCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(Block.planks, 1), new Object[] {"#", '#', BlockKaevWoodCorners});
        }

        if (props.getInt("BlockKaevCobblestoneCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(Block.cobblestone, 1), new Object[] {"#", '#', BlockKaevCobblestoneCorners});
        }

        if (props.getInt("BlockKaevGlassCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(Block.glass, 1), new Object[] {"#", '#', BlockKaevGlassCorners});
        }

        if (props.getInt("BlockKaevSandstoneCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(Block.sandStone, 1), new Object[] {"#", '#', BlockKaevSandstoneCorners});
        }

        if (props.getInt("BlockKaevDirtCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(Block.dirt, 1), new Object[] {"#", '#', BlockKaevDirtCorners});
        }

        if (props.getInt("BlockKaevStoneCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(Block.stone, 1), new Object[] {"#", '#', BlockKaevStoneCorners});
        }

        if (props.getInt("BlockKaevSandCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(Block.sand, 1), new Object[] {"#", '#', BlockKaevSandCorners});
        }

        if (props.getInt("BlockKaevSnowCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(Block.blockSnow, 1), new Object[] {"#", '#', BlockKaevSnowCorners});
        }

        if (props.getInt("BlockKaevGrassCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(Block.grass, 1), new Object[] {"#", '#', BlockKaevGrassCorners});
        }

        if (props.getInt("BlockKaevBricksCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(Block.brick, 1), new Object[] {"#", '#', BlockKaevBricksCorners});
        }

        if (props.getInt("BlockKaevGravelCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(Block.gravel, 1), new Object[] {"#", '#', BlockKaevGravelCorners});
        }

        if (props.getInt("BlockKaevGoldCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(Block.blockGold, 1), new Object[] {"#", '#', BlockKaevGoldCorners});
        }

        if (props.getInt("BlockKaevSteelCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(Block.blockSteel, 1), new Object[] {"#", '#', BlockKaevSteelCorners});
        }

        if (props.getInt("BlockKaevObsidianCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {"#", '#', BlockKaevObsidianCorners});
        }

        if (props.getInt("BlockKaevDiamondCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(Block.blockDiamond, 1), new Object[] {"#", '#', BlockKaevDiamondCorners});
        }

        if (props.getInt("BlockKaevWhiteWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(0)), new Object[] {" # ", "###", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", " # ", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(8)), new Object[] {" # ", " # ", "###", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"###", " # ", " # ", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 0), new Object[] {"#", '#', BlockKaevWhiteWoolCorners});
        }

        if (props.getInt("BlockKaevBlackWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 15), new Object[] {"#", '#', BlockKaevBlackWoolCorners});
        }

        if (props.getInt("BlockKaevRedWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 14), new Object[] {"#", '#', BlockKaevRedWoolCorners});
        }

        if (props.getInt("BlockKaevGreenWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 13), new Object[] {"#", '#', BlockKaevGreenWoolCorners});
        }

        if (props.getInt("BlockKaevBrownWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 12), new Object[] {"#", '#', BlockKaevBrownWoolCorners});
        }

        if (props.getInt("BlockKaevBlueWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 11), new Object[] {"#", '#', BlockKaevBlueWoolCorners});
        }

        if (props.getInt("BlockKaevPurpleWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 10), new Object[] {"#", '#', BlockKaevPurpleWoolCorners});
        }

        if (props.getInt("BlockKaevCyanWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 9), new Object[] {"#", '#', BlockKaevCyanWoolCorners});
        }

        if (props.getInt("BlockKaevSilverWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 8), new Object[] {"#", '#', BlockKaevSilverWoolCorners});
        }

        if (props.getInt("BlockKaevGrayWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 7), new Object[] {"#", '#', BlockKaevGrayWoolCorners});
        }

        if (props.getInt("BlockKaevPinkWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 6), new Object[] {"#", '#', BlockKaevPinkWoolCorners});
        }

        if (props.getInt("BlockKaevLimeWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 5), new Object[] {"#", '#', BlockKaevLimeWoolCorners});
        }

        if (props.getInt("BlockKaevYellowWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 4), new Object[] {"#", '#', BlockKaevYellowWoolCorners});
        }

        if (props.getInt("BlockKaevLightBlueWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 3), new Object[] {"#", '#', BlockKaevLightBlueWoolCorners});
        }

        if (props.getInt("BlockKaevMagentaWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 2), new Object[] {"#", '#', BlockKaevMagentaWoolCorners});
        }

        if (props.getInt("BlockKaevOrangeWoolCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 1), new Object[] {"#", '#', BlockKaevOrangeWoolCorners});
        }
    }

    private static String getAppdata()
    {
        return Minecraft.getMinecraftDir().getPath();
    }

    public void renderInvBlock(RenderBlocks var1, Block var2, int var3, int var4)
    {
        Tessellator var5 = Tessellator.instance;

        if (var4 == CornersRenderID)
        {
            var2.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var5.startDrawingQuads();
            var5.setNormal(0.0F, -1.0F, 0.0F);
            this.renderCornersBottomFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(0, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(0.0F, 1.0F, 0.0F);
            this.renderCornersTopFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(1, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(0.0F, 0.0F, -1.0F);
            this.renderCornersEastFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(2, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(0.0F, 0.0F, 1.0F);
            this.renderCornersWestFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(3, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(-1.0F, 0.0F, 0.0F);
            this.renderCornersNorthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(4, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(1.0F, 0.0F, 0.0F);
            this.renderCornersSouthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(5, var3), var3 + 1, var1, 240);
            var5.draw();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        }

        var2.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public boolean renderWorldBlock(RenderBlocks var1, IBlockAccess var2, int var3, int var4, int var5, Block var6, int var7)
    {
        return var7 == CornersRenderID ? this.renderBlockCorners(var6, var3, var4, var5, var1, var2) : false;
    }

    public boolean renderBlockCorners(Block var1, int var2, int var3, int var4, RenderBlocks var5, IBlockAccess var6)
    {
        int var7 = var6.getBlockMetadata(var2, var3, var4);
        int var8 = var1.colorMultiplier(var6, var2, var3, var4);
        float var9 = (float)(var8 >> 16 & 255) / 255.0F;
        float var10 = (float)(var8 >> 8 & 255) / 255.0F;
        float var11 = (float)(var8 & 255) / 255.0F;
        return Minecraft.isAmbientOcclusionEnabled() ? this.renderCornersBlockWithAmbientOcclusion(var1, var2, var3, var4, var9, var10, var11, var7, var5, var6) : this.renderCornersBlockWithColorMultiplier(var1, var2, var3, var4, var9, var10, var11, var7, var5, var6);
    }

    public boolean renderCornersBlockWithAmbientOcclusion(Block var1, int var2, int var3, int var4, float var5, float var6, float var7, int var8, RenderBlocks var9, IBlockAccess var10)
    {
        this.enableAO = true;
        boolean var11 = false;
        boolean var12 = true;
        boolean var13 = true;
        boolean var14 = true;
        boolean var15 = true;
        boolean var16 = true;
        boolean var17 = true;
        this.aoLightValueThis = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4);
        this.aoLightValueXNeg = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3, var4);
        this.aoLightValueYNeg = var1.getAmbientOcclusionLightValue(var10, var2, var3 - 1, var4);
        this.aoLightValueZNeg = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4 - 1);
        this.aoLightValueXPos = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3, var4);
        this.aoLightValueYPos = var1.getAmbientOcclusionLightValue(var10, var2, var3 + 1, var4);
        this.aoLightValueZPos = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4 + 1);
        this.aoLightValueXPosYPos = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3 + 1, var4);
        this.aoLightValueXPosYNeg = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3 - 1, var4);
        this.aoLightValueXPosZPos = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3, var4 + 1);
        this.aoLightValueXPosZNeg = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3, var4 - 1);
        this.aoLightValueXNegYPos = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3 + 1, var4);
        this.aoLightValueXNegYNeg = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3 - 1, var4);
        this.aoLightValueXNegZNeg = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3, var4 - 1);
        this.aoLightValueXNegZPos = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3, var4 + 1);
        this.aoLightValueYPosZPos = var1.getAmbientOcclusionLightValue(var10, var2, var3 + 1, var4 + 1);
        this.aoLightValueYPosZNeg = var1.getAmbientOcclusionLightValue(var10, var2, var3 + 1, var4 - 1);
        this.aoLightValueYNegZPos = var1.getAmbientOcclusionLightValue(var10, var2, var3 - 1, var4 + 1);
        this.aoLightValueYNegZNeg = var1.getAmbientOcclusionLightValue(var10, var2, var3 - 1, var4 - 1);
        this.aoLightValueXPosYPosZPos = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3 + 1, var4 + 1);
        this.aoLightValueXPosYNegZPos = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3 - 1, var4 + 1);
        this.aoLightValueXPosYPosZNeg = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3 + 1, var4 - 1);
        this.aoLightValueXPosYNegZNeg = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3 - 1, var4 - 1);
        this.aoLightValueXNegYPosZPos = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3 + 1, var4 + 1);
        this.aoLightValueXNegYNegZPos = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3 - 1, var4 + 1);
        this.aoLightValueXNegYPosZNeg = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3 + 1, var4 - 1);
        this.aoLightValueXNegYNegZNeg = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3 - 1, var4 - 1);

        if (var1.blockIndexInTexture == 3)
        {
            var17 = false;
            var16 = false;
            var15 = false;
            var14 = false;
            var12 = false;
        }

        float var19;
        float var18;
        float var21;
        float var20;

        if (this.field_22352_G > 0)
        {
            var18 = (this.aoLightValueXNegYNegZPos + this.aoLightValueXNegYNeg + this.aoLightValueYNegZPos + this.aoLightValueYNeg) / 4.0F;
            var21 = (this.aoLightValueYNegZPos + this.aoLightValueYNeg + this.aoLightValueXPosYNegZPos + this.aoLightValueXPosYNeg) / 4.0F;
            var20 = (this.aoLightValueYNeg + this.aoLightValueYNegZNeg + this.aoLightValueXPosYNeg + this.aoLightValueXPosYNegZNeg) / 4.0F;
            var19 = (this.aoLightValueXNegYNeg + this.aoLightValueXNegYNegZNeg + this.aoLightValueYNeg + this.aoLightValueYNegZNeg) / 4.0F;
        }
        else
        {
            var21 = this.aoLightValueYNeg;
            var20 = this.aoLightValueYNeg;
            var19 = this.aoLightValueYNeg;
            var18 = this.aoLightValueYNeg;
        }

        this.colorRedTopLeft_BottomFace = this.colorRedBottomLeft_BottomFace = this.colorRedBottomRight_BottomFace = this.colorRedTopRight_BottomFace = (var12 ? var5 : 1.0F) * 0.5F;
        this.colorGreenTopLeft_BottomFace = this.colorGreenBottomLeft_BottomFace = this.colorGreenBottomRight_BottomFace = this.colorGreenTopRight_BottomFace = (var12 ? var6 : 1.0F) * 0.5F;
        this.colorBlueTopLeft_BottomFace = this.colorBlueBottomLeft_BottomFace = this.colorBlueBottomRight_BottomFace = this.colorBlueTopRight_BottomFace = (var12 ? var7 : 1.0F) * 0.5F;
        this.colorRedTopLeft_BottomFace *= var18;
        this.colorGreenTopLeft_BottomFace *= var18;
        this.colorBlueTopLeft_BottomFace *= var18;
        this.colorRedBottomLeft_BottomFace *= var19;
        this.colorGreenBottomLeft_BottomFace *= var19;
        this.colorBlueBottomLeft_BottomFace *= var19;
        this.colorRedBottomRight_BottomFace *= var20;
        this.colorGreenBottomRight_BottomFace *= var20;
        this.colorBlueBottomRight_BottomFace *= var20;
        this.colorRedTopRight_BottomFace *= var21;
        this.colorGreenTopRight_BottomFace *= var21;
        this.colorBlueTopRight_BottomFace *= var21;
        float var23;
        float var22;
        float var25;
        float var24;

        if (this.field_22352_G > 0)
        {
            var25 = (this.aoLightValueXNegYPosZPos + this.aoLightValueXNegYPos + this.aoLightValueYPosZPos + this.aoLightValueYPos) / 4.0F;
            var22 = (this.aoLightValueYPosZPos + this.aoLightValueYPos + this.aoLightValueXPosYPosZPos + this.aoLightValueXPosYPos) / 4.0F;
            var23 = (this.aoLightValueYPos + this.aoLightValueYPosZNeg + this.aoLightValueXPosYPos + this.aoLightValueXPosYPosZNeg) / 4.0F;
            var24 = (this.aoLightValueXNegYPos + this.aoLightValueXNegYPosZNeg + this.aoLightValueYPos + this.aoLightValueYPosZNeg) / 4.0F;
        }
        else
        {
            var25 = this.aoLightValueYPos;
            var24 = this.aoLightValueYPos;
            var23 = this.aoLightValueYPos;
            var22 = this.aoLightValueYPos;
        }

        this.colorRedTopLeft_TopFace = this.colorRedBottomLeft_TopFace = this.colorRedBottomRight_TopFace = this.colorRedTopRight_TopFace = var13 ? var5 : 1.0F;
        this.colorGreenTopLeft_TopFace = this.colorGreenBottomLeft_TopFace = this.colorGreenBottomRight_TopFace = this.colorGreenTopRight_TopFace = var13 ? var6 : 1.0F;
        this.colorBlueTopLeft_TopFace = this.colorBlueBottomLeft_TopFace = this.colorBlueBottomRight_TopFace = this.colorBlueTopRight_TopFace = var13 ? var7 : 1.0F;
        this.colorRedTopLeft_TopFace *= var22;
        this.colorGreenTopLeft_TopFace *= var22;
        this.colorBlueTopLeft_TopFace *= var22;
        this.colorRedBottomLeft_TopFace *= var23;
        this.colorGreenBottomLeft_TopFace *= var23;
        this.colorBlueBottomLeft_TopFace *= var23;
        this.colorRedBottomRight_TopFace *= var24;
        this.colorGreenBottomRight_TopFace *= var24;
        this.colorBlueBottomRight_TopFace *= var24;
        this.colorRedTopRight_TopFace *= var25;
        this.colorGreenTopRight_TopFace *= var25;
        this.colorBlueTopRight_TopFace *= var25;
        float var27;
        float var26;
        float var29;
        float var28;

        if (this.field_22352_G > 0)
        {
            var26 = (this.aoLightValueXNegZNeg + this.aoLightValueXNegYPosZNeg + this.aoLightValueZNeg + this.aoLightValueYPosZNeg) / 4.0F;
            var27 = (this.aoLightValueZNeg + this.aoLightValueYPosZNeg + this.aoLightValueXPosZNeg + this.aoLightValueXPosYPosZNeg) / 4.0F;
            var28 = (this.aoLightValueYNegZNeg + this.aoLightValueZNeg + this.aoLightValueXPosYNegZNeg + this.aoLightValueXPosZNeg) / 4.0F;
            var29 = (this.aoLightValueXNegYNegZNeg + this.aoLightValueXNegZNeg + this.aoLightValueYNegZNeg + this.aoLightValueZNeg) / 4.0F;
        }
        else
        {
            var29 = this.aoLightValueZNeg;
            var28 = this.aoLightValueZNeg;
            var27 = this.aoLightValueZNeg;
            var26 = this.aoLightValueZNeg;
        }

        this.colorRedTopLeft_EastFace = this.colorRedBottomLeft_EastFace = this.colorRedBottomRight_EastFace = this.colorRedTopRight_EastFace = (var14 ? var5 : 1.0F) * 0.8F;
        this.colorGreenTopLeft_EastFace = this.colorGreenBottomLeft_EastFace = this.colorGreenBottomRight_EastFace = this.colorGreenTopRight_EastFace = (var14 ? var6 : 1.0F) * 0.8F;
        this.colorBlueTopLeft_EastFace = this.colorBlueBottomLeft_EastFace = this.colorBlueBottomRight_EastFace = this.colorBlueTopRight_EastFace = (var14 ? var7 : 1.0F) * 0.8F;
        this.colorRedTopLeft_EastFace *= var26;
        this.colorGreenTopLeft_EastFace *= var26;
        this.colorBlueTopLeft_EastFace *= var26;
        this.colorRedBottomLeft_EastFace *= var27;
        this.colorGreenBottomLeft_EastFace *= var27;
        this.colorBlueBottomLeft_EastFace *= var27;
        this.colorRedBottomRight_EastFace *= var28;
        this.colorGreenBottomRight_EastFace *= var28;
        this.colorBlueBottomRight_EastFace *= var28;
        this.colorRedTopRight_EastFace *= var29;
        this.colorGreenTopRight_EastFace *= var29;
        this.colorBlueTopRight_EastFace *= var29;
        int var30 = var1.getBlockTexture(var10, var2, var3, var4, 2);
        float var31;
        float var34;
        float var32;
        float var33;

        if (this.field_22352_G > 0)
        {
            var31 = (this.aoLightValueXNegZPos + this.aoLightValueXNegYPosZPos + this.aoLightValueZPos + this.aoLightValueYPosZPos) / 4.0F;
            var34 = (this.aoLightValueZPos + this.aoLightValueYPosZPos + this.aoLightValueXPosZPos + this.aoLightValueXPosYPosZPos) / 4.0F;
            var33 = (this.aoLightValueYNegZPos + this.aoLightValueZPos + this.aoLightValueXPosYNegZPos + this.aoLightValueXPosZPos) / 4.0F;
            var32 = (this.aoLightValueXNegYNegZPos + this.aoLightValueXNegZPos + this.aoLightValueYNegZPos + this.aoLightValueZPos) / 4.0F;
        }
        else
        {
            var34 = this.aoLightValueZPos;
            var33 = this.aoLightValueZPos;
            var32 = this.aoLightValueZPos;
            var31 = this.aoLightValueZPos;
        }

        this.colorRedTopLeft_WestFace = this.colorRedBottomLeft_WestFace = this.colorRedBottomRight_WestFace = this.colorRedTopRight_WestFace = (var15 ? var5 : 1.0F) * 0.8F;
        this.colorGreenTopLeft_WestFace = this.colorGreenBottomLeft_WestFace = this.colorGreenBottomRight_WestFace = this.colorGreenTopRight_WestFace = (var15 ? var6 : 1.0F) * 0.8F;
        this.colorBlueTopLeft_WestFace = this.colorBlueBottomLeft_WestFace = this.colorBlueBottomRight_WestFace = this.colorBlueTopRight_WestFace = (var15 ? var7 : 1.0F) * 0.8F;
        this.colorRedTopLeft_WestFace *= var31;
        this.colorGreenTopLeft_WestFace *= var31;
        this.colorBlueTopLeft_WestFace *= var31;
        this.colorRedBottomLeft_WestFace *= var32;
        this.colorGreenBottomLeft_WestFace *= var32;
        this.colorBlueBottomLeft_WestFace *= var32;
        this.colorRedBottomRight_WestFace *= var33;
        this.colorGreenBottomRight_WestFace *= var33;
        this.colorBlueBottomRight_WestFace *= var33;
        this.colorRedTopRight_WestFace *= var34;
        this.colorGreenTopRight_WestFace *= var34;
        this.colorBlueTopRight_WestFace *= var34;
        int var35 = var1.getBlockTexture(var10, var2, var3, var4, 3);
        float var38;
        float var39;
        float var36;
        float var37;

        if (this.field_22352_G > 0)
        {
            var39 = (this.aoLightValueXNegYNeg + this.aoLightValueXNegYNegZPos + this.aoLightValueXNeg + this.aoLightValueXNegZPos) / 4.0F;
            var36 = (this.aoLightValueXNeg + this.aoLightValueXNegZPos + this.aoLightValueXNegYPos + this.aoLightValueXNegYPosZPos) / 4.0F;
            var37 = (this.aoLightValueXNegZNeg + this.aoLightValueXNeg + this.aoLightValueXNegYPosZNeg + this.aoLightValueXNegYPos) / 4.0F;
            var38 = (this.aoLightValueXNegYNegZNeg + this.aoLightValueXNegYNeg + this.aoLightValueXNegZNeg + this.aoLightValueXNeg) / 4.0F;
        }
        else
        {
            var39 = this.aoLightValueXNeg;
            var38 = this.aoLightValueXNeg;
            var37 = this.aoLightValueXNeg;
            var36 = this.aoLightValueXNeg;
        }

        this.colorRedTopLeft_NorthFace = this.colorRedBottomLeft_NorthFace = this.colorRedBottomRight_NorthFace = this.colorRedTopRight_NorthFace = (var16 ? var5 : 1.0F) * 0.6F;
        this.colorGreenTopLeft_NorthFace = this.colorGreenBottomLeft_NorthFace = this.colorGreenBottomRight_NorthFace = this.colorGreenTopRight_NorthFace = (var16 ? var6 : 1.0F) * 0.6F;
        this.colorBlueTopLeft_NorthFace = this.colorBlueBottomLeft_NorthFace = this.colorBlueBottomRight_NorthFace = this.colorBlueTopRight_NorthFace = (var16 ? var7 : 1.0F) * 0.6F;
        this.colorRedTopLeft_NorthFace *= var36;
        this.colorGreenTopLeft_NorthFace *= var36;
        this.colorBlueTopLeft_NorthFace *= var36;
        this.colorRedBottomLeft_NorthFace *= var37;
        this.colorGreenBottomLeft_NorthFace *= var37;
        this.colorBlueBottomLeft_NorthFace *= var37;
        this.colorRedBottomRight_NorthFace *= var38;
        this.colorGreenBottomRight_NorthFace *= var38;
        this.colorBlueBottomRight_NorthFace *= var38;
        this.colorRedTopRight_NorthFace *= var39;
        this.colorGreenTopRight_NorthFace *= var39;
        this.colorBlueTopRight_NorthFace *= var39;
        int var40 = var1.getBlockTexture(var10, var2, var3, var4, 4);
        float var42;
        float var43;
        float var41;
        float var44;

        if (this.field_22352_G > 0)
        {
            var41 = (this.aoLightValueXPosYNeg + this.aoLightValueXPosYNegZPos + this.aoLightValueXPos + this.aoLightValueXPosZPos) / 4.0F;
            var44 = (this.aoLightValueXPos + this.aoLightValueXPosZPos + this.aoLightValueXPosYPos + this.aoLightValueXPosYPosZPos) / 4.0F;
            var43 = (this.aoLightValueXPosZNeg + this.aoLightValueXPos + this.aoLightValueXPosYPosZNeg + this.aoLightValueXPosYPos) / 4.0F;
            var42 = (this.aoLightValueXPosYNegZNeg + this.aoLightValueXPosYNeg + this.aoLightValueXPosZNeg + this.aoLightValueXPos) / 4.0F;
        }
        else
        {
            var44 = this.aoLightValueXPos;
            var43 = this.aoLightValueXPos;
            var42 = this.aoLightValueXPos;
            var41 = this.aoLightValueXPos;
        }

        this.colorRedTopLeft_SouthFace = this.colorRedBottomLeft_SouthFace = this.colorRedBottomRight_SouthFace = this.colorRedTopRight_SouthFace = (var17 ? var5 : 1.0F) * 0.6F;
        this.colorGreenTopLeft_SouthFace = this.colorGreenBottomLeft_SouthFace = this.colorGreenBottomRight_SouthFace = this.colorGreenTopRight_SouthFace = (var17 ? var6 : 1.0F) * 0.6F;
        this.colorBlueTopLeft_SouthFace = this.colorBlueBottomLeft_SouthFace = this.colorBlueBottomRight_SouthFace = this.colorBlueTopRight_SouthFace = (var17 ? var7 : 1.0F) * 0.6F;
        this.colorRedTopLeft_SouthFace *= var41;
        this.colorGreenTopLeft_SouthFace *= var41;
        this.colorBlueTopLeft_SouthFace *= var41;
        this.colorRedBottomLeft_SouthFace *= var42;
        this.colorGreenBottomLeft_SouthFace *= var42;
        this.colorBlueBottomLeft_SouthFace *= var42;
        this.colorRedBottomRight_SouthFace *= var43;
        this.colorGreenBottomRight_SouthFace *= var43;
        this.colorBlueBottomRight_SouthFace *= var43;
        this.colorRedTopRight_SouthFace *= var44;
        this.colorGreenTopRight_SouthFace *= var44;
        this.colorBlueTopRight_SouthFace *= var44;
        int var45 = var1.getBlockTexture(var10, var2, var3, var4, 5);
        this.colorRedSlopes = var5;
        this.colorGreenSlopes = var6;
        this.colorBlueSlopes = var7;

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 - 1, var4, 0))
        {
            this.renderCornersBottomFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 + 1, var4, 1))
        {
            this.renderCornersTopFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 - 1, 2))
        {
            this.renderCornersEastFace(var1, (double)var2, (double)var3, (double)var4, var30, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

            if (field_27511_cfgGrassFix && var30 == 3)
            {
                this.colorRedTopLeft_EastFace *= var5;
                this.colorRedBottomLeft_EastFace *= var5;
                this.colorRedBottomRight_EastFace *= var5;
                this.colorRedTopRight_EastFace *= var5;
                this.colorGreenTopLeft_EastFace *= var6;
                this.colorGreenBottomLeft_EastFace *= var6;
                this.colorGreenBottomRight_EastFace *= var6;
                this.colorGreenTopRight_EastFace *= var6;
                this.colorBlueTopLeft_EastFace *= var7;
                this.colorBlueBottomLeft_EastFace *= var7;
                this.colorBlueBottomRight_EastFace *= var7;
                this.colorBlueTopRight_EastFace *= var7;
                this.renderCornersEastFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 + 1, 3))
        {
            this.renderCornersWestFace(var1, (double)var2, (double)var3, (double)var4, var35, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

            if (field_27511_cfgGrassFix && var35 == 3)
            {
                this.colorRedTopLeft_WestFace *= var5;
                this.colorRedBottomLeft_WestFace *= var5;
                this.colorRedBottomRight_WestFace *= var5;
                this.colorRedTopRight_WestFace *= var5;
                this.colorGreenTopLeft_WestFace *= var6;
                this.colorGreenBottomLeft_WestFace *= var6;
                this.colorGreenBottomRight_WestFace *= var6;
                this.colorGreenTopRight_WestFace *= var6;
                this.colorBlueTopLeft_WestFace *= var7;
                this.colorBlueBottomLeft_WestFace *= var7;
                this.colorBlueBottomRight_WestFace *= var7;
                this.colorBlueTopRight_WestFace *= var7;
                this.renderCornersWestFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 - 1, var3, var4, 4))
        {
            this.renderCornersNorthFace(var1, (double)var2, (double)var3, (double)var4, var40, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

            if (field_27511_cfgGrassFix && var40 == 3)
            {
                this.colorRedTopLeft_NorthFace *= var5;
                this.colorRedBottomLeft_NorthFace *= var5;
                this.colorRedBottomRight_NorthFace *= var5;
                this.colorRedTopRight_NorthFace *= var5;
                this.colorGreenTopLeft_NorthFace *= var6;
                this.colorGreenBottomLeft_NorthFace *= var6;
                this.colorGreenBottomRight_NorthFace *= var6;
                this.colorGreenTopRight_NorthFace *= var6;
                this.colorBlueTopLeft_NorthFace *= var7;
                this.colorBlueBottomLeft_NorthFace *= var7;
                this.colorBlueBottomRight_NorthFace *= var7;
                this.colorBlueTopRight_NorthFace *= var7;
                this.renderCornersNorthFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 + 1, var3, var4, 5))
        {
            this.renderCornersSouthFace(var1, (double)var2, (double)var3, (double)var4, var45, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

            if (field_27511_cfgGrassFix && var45 == 3)
            {
                this.colorRedTopLeft_SouthFace *= var5;
                this.colorRedBottomLeft_SouthFace *= var5;
                this.colorRedBottomRight_SouthFace *= var5;
                this.colorRedTopRight_SouthFace *= var5;
                this.colorGreenTopLeft_SouthFace *= var6;
                this.colorGreenBottomLeft_SouthFace *= var6;
                this.colorGreenBottomRight_SouthFace *= var6;
                this.colorGreenTopRight_SouthFace *= var6;
                this.colorBlueTopLeft_SouthFace *= var7;
                this.colorBlueBottomLeft_SouthFace *= var7;
                this.colorBlueBottomRight_SouthFace *= var7;
                this.colorBlueTopRight_SouthFace *= var7;
                this.renderCornersSouthFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        this.enableAO = false;
        return var11;
    }

    public boolean renderCornersBlockWithColorMultiplier(Block var1, int var2, int var3, int var4, float var5, float var6, float var7, int var8, RenderBlocks var9, IBlockAccess var10)
    {
        Tessellator var11 = Tessellator.instance;
        boolean var12 = false;
        float var13 = 0.5F;
        float var14 = 1.0F;
        float var15 = 0.8F;
        float var16 = 0.6F;
        float var17 = var14 * var5;
        float var18 = var14 * var6;
        float var19 = var14 * var7;

        if (var1 == Block.grass)
        {
            var7 = 1.0F;
            var6 = 1.0F;
            var5 = 1.0F;
        }

        float var20 = var13 * var5;
        float var21 = var15 * var5;
        float var22 = var16 * var5;
        float var23 = var13 * var6;
        float var24 = var15 * var6;
        float var25 = var16 * var6;
        float var26 = var13 * var7;
        float var27 = var15 * var7;
        float var28 = var16 * var7;
        float var29 = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4);
        float var30;

        if ((var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 - 1, var4, 0)) && var8 / 4 != 1 && var8 / 4 != 3)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3 - 1, var4);
            var11.setColorOpaque_F(var20 * var30, var23 * var30, var26 * var30);
            this.renderCornersBottomFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if ((var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 + 1, var4, 1)) && var8 / 4 != 0 && var8 / 4 != 2)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3 + 1, var4);

            if (var1.maxY != 1.0D && !var1.blockMaterial.isLiquid())
            {
                var30 = var29;
            }

            var11.setColorOpaque_F(var17 * var30, var18 * var30, var19 * var30);
            this.renderCornersTopFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 - 1, 2) || var8 % 2 == 0)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4 - 1);

            if (var8 % 2 == 0)
            {
                var30 = var29;
            }

            var11.setColorOpaque_F(var21 * var30, var24 * var30, var27 * var30);
            this.renderCornersEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 2), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 + 1, 3) || var8 % 2 == 1)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4 + 1);

            if (var8 % 2 == 1)
            {
                var30 = var29;
            }

            var11.setColorOpaque_F(var21 * var30, var24 * var30, var27 * var30);
            this.renderCornersWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 3), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 - 1, var3, var4, 4) || var8 == 0 || var8 == 3 || var8 == 4 || var8 == 7 || var8 == 11 || var8 == 15)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3, var4);

            if (var8 == 0 || var8 == 3 || var8 == 4 || var8 == 7 || var8 == 11 || var8 == 15)
            {
                var30 = var29;
            }

            var11.setColorOpaque_F(var22 * var30, var25 * var30, var28 * var30);
            this.renderCornersNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 4), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 + 1, var3, var4, 5) || var8 == 1 || var8 == 2 || var8 == 5 || var8 == 6 || var8 == 10 || var8 == 14)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3, var4);

            if (var8 == 1 || var8 == 2 || var8 == 5 || var8 == 6 || var8 == 10 || var8 == 14)
            {
                var30 = var29;
            }

            var11.setColorOpaque_F(var22 * var30, var25 * var30, var28 * var30);
            this.renderCornersSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 5), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        return var12;
    }

    public void renderCornersBottomFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
    {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0)
        {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.minX * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.maxX * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.minZ * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.maxZ * 16.0D - 0.01D) / 256.0D;

        if (var1.minX < 0.0D || var1.maxX > 1.0D)
        {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.minZ < 0.0D || var1.maxZ > 1.0D)
        {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        double var23 = var2 + var1.minX;
        double var25 = var2 + var1.maxX;
        double var27 = var4 + var1.minY;
        double var29 = var6 + var1.minZ;
        double var31 = var6 + var1.maxZ;

        if (this.enableAO)
        {
            if (var9 / 4 == 0)
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 8)
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 9)
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 10)
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 11)
            {
                var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
        }
        else if (var9 / 4 == 0)
        {
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
        }
        else if (var9 == 8)
        {
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
        }
        else if (var9 == 9)
        {
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
        }
        else if (var9 == 10)
        {
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
        }
        else if (var9 == 11)
        {
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
        }
    }

    public void renderCornersTopFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
    {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0)
        {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.minX * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.maxX * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.minZ * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.maxZ * 16.0D - 0.01D) / 256.0D;

        if (var1.minX < 0.0D || var1.maxX > 1.0D)
        {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.minZ < 0.0D || var1.maxZ > 1.0D)
        {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        double var23 = var2 + var1.minX;
        double var25 = var2 + var1.maxX;
        double var27 = var4 + var1.maxY;
        double var29 = var6 + var1.minZ;
        double var31 = var6 + var1.maxZ;

        if (this.enableAO)
        {
            if (var9 / 4 == 1)
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 12)
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 13)
            {
                var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 14)
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 15)
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
        }
        else if (var9 / 4 == 1)
        {
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
        }
        else if (var9 == 12)
        {
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
        }
        else if (var9 == 13)
        {
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
        }
        else if (var9 == 14)
        {
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
        }
        else if (var9 == 15)
        {
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
        }
    }

    public void renderCornersEastFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
    {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0)
        {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.minX * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.maxX * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.minY * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.maxY * 16.0D - 0.01D) / 256.0D;
        double var23;

        if (var10.flipTexture)
        {
            var23 = var15;
            var15 = var17;
            var17 = var23;
        }

        if (var1.minX < 0.0D || var1.maxX > 1.0D)
        {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.minY < 0.0D || var1.maxY > 1.0D)
        {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        var23 = var2 + var1.minX;
        double var25 = var2 + var1.maxX;
        double var27 = var4 + var1.minY;
        double var29 = var4 + var1.maxY;
        double var31 = var6 + var1.minZ;
        double var33 = var6 + var1.maxZ;

        if (this.enableAO)
        {
            if (var9 == 0)
            {
                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F);
                var12.addVertexWithUV(var25, var29, var33, var15, var19);
                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F);
                var12.addVertexWithUV(var25, var29, var33, var15, var19);
                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 != 1 && var9 != 9)
            {
                if (var9 == 2)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                }
                else if (var9 != 3 && var9 != 11)
                {
                    if (var9 == 4)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                        var12.addVertexWithUV(var23, var29, var31, var17, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                        var12.addVertexWithUV(var25, var27, var33, var15, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                        var12.addVertexWithUV(var25, var27, var33, var15, var21);
                    }
                    else if (var9 != 5 && var9 != 13)
                    {
                        if (var9 == 6)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                            var12.addVertexWithUV(var23, var29, var31, var17, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                            var12.addVertexWithUV(var25, var29, var31, var15, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var33, var17, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var33, var17, var21);
                        }
                        else if (var9 != 7 && var9 != 15)
                        {
                            if (var9 == 8)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPos * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPos * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPos * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var25, var29, var33, (var15 + var17) / 2.0D, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPos * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPos * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPos * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var25, var29, var33, (var15 + var17) / 2.0D, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueZNeg * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueZNeg * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueZNeg * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNeg * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNeg * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNeg * (this.factorTop + this.factorNorth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var33, var17, var21);
                            }
                            else if (var9 == 12)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var23, var29, var33, var17, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueZNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueZNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueZNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var25, var27, var33, (var15 + var17) / 2.0D, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorNorth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var25, var27, var33, (var15 + var17) / 2.0D, var21);
                            }
                        }
                        else
                        {
                            var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                            var12.addVertexWithUV(var23, var29, var31, var17, var19);
                            var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                            var12.addVertexWithUV(var25, var29, var31, var15, var19);
                            var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                            var12.addVertexWithUV(var25, var27, var31, var15, var21);
                            var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                            var12.addVertexWithUV(var23, var29, var31, var17, var19);
                        }
                    }
                    else
                    {
                        var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                        var12.addVertexWithUV(var23, var29, var31, var17, var19);
                        var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                        var12.addVertexWithUV(var23, var27, var31, var17, var21);
                    }
                }
                else
                {
                    var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                }
            }
            else
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
        }
        else if (var9 == 0)
        {
            var12.addVertexWithUV(var25, var29, var33, var15, var19);
            var12.addVertexWithUV(var25, var29, var33, var15, var19);
            var12.addVertexWithUV(var25, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var31, var17, var21);
        }
        else if (var9 != 1 && var9 != 9)
        {
            if (var9 == 2)
            {
                var12.addVertexWithUV(var23, var29, var33, var17, var19);
                var12.addVertexWithUV(var23, var29, var33, var17, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 != 3 && var9 != 11)
            {
                if (var9 == 4)
                {
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.addVertexWithUV(var25, var27, var33, var15, var21);
                    var12.addVertexWithUV(var25, var27, var33, var15, var21);
                }
                else if (var9 != 5 && var9 != 13)
                {
                    if (var9 == 6)
                    {
                        var12.addVertexWithUV(var23, var29, var31, var17, var19);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.addVertexWithUV(var23, var27, var33, var17, var21);
                        var12.addVertexWithUV(var23, var27, var33, var17, var21);
                    }
                    else if (var9 != 7 && var9 != 15)
                    {
                        if (var9 == 8)
                        {
                            var12.addVertexWithUV(var25, var29, var33, (var15 + var17) / 2.0D, var19);
                            var12.addVertexWithUV(var25, var29, var33, (var15 + var17) / 2.0D, var19);
                            var12.addVertexWithUV(var25, var27, var31, var15, var21);
                            var12.addVertexWithUV(var23, var27, var33, var17, var21);
                        }
                        else if (var9 == 12)
                        {
                            var12.addVertexWithUV(var23, var29, var33, var17, var19);
                            var12.addVertexWithUV(var25, var29, var31, var15, var19);
                            var12.addVertexWithUV(var25, var27, var33, (var15 + var17) / 2.0D, var21);
                            var12.addVertexWithUV(var25, var27, var33, (var15 + var17) / 2.0D, var21);
                        }
                    }
                    else
                    {
                        var12.addVertexWithUV(var23, var29, var31, var17, var19);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.addVertexWithUV(var25, var27, var31, var15, var21);
                        var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    }
                }
                else
                {
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                }
            }
            else
            {
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var29, var31, var17, var19);
            var12.addVertexWithUV(var23, var29, var31, var17, var19);
            var12.addVertexWithUV(var25, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var31, var17, var21);
        }
    }

    public void renderCornersWestFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
    {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0)
        {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.minX * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.maxX * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.minY * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.maxY * 16.0D - 0.01D) / 256.0D;
        double var23;

        if (var10.flipTexture)
        {
            var23 = var15;
            var15 = var17;
            var17 = var23;
        }

        if (var1.minX < 0.0D || var1.maxX > 1.0D)
        {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.minY < 0.0D || var1.maxY > 1.0D)
        {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        var23 = var2 + var1.minX;
        double var25 = var2 + var1.maxX;
        double var27 = var4 + var1.minY;
        double var29 = var4 + var1.maxY;
        double var31 = var6 + var1.maxZ;
        double var33 = var6 + var1.minZ;

        if (this.enableAO)
        {
            if (var9 != 0 && var9 != 8)
            {
                if (var9 == 1)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                }
                else if (var9 != 2 && var9 != 10)
                {
                    if (var9 == 3)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F);
                        var12.addVertexWithUV(var25, var29, var33, var17, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F);
                        var12.addVertexWithUV(var23, var27, var31, var15, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F);
                        var12.addVertexWithUV(var25, var27, var31, var17, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F);
                        var12.addVertexWithUV(var25, var29, var33, var17, var19);
                    }
                    else if (var9 != 4 && var9 != 12)
                    {
                        if (var9 == 5)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                            var12.addVertexWithUV(var23, var29, var31, var15, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var33, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var33, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                            var12.addVertexWithUV(var25, var29, var31, var17, var19);
                        }
                        else if (var9 != 6 && var9 != 14)
                        {
                            if (var9 == 7)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                                var12.addVertexWithUV(var25, var29, var31, var17, var19);
                            }
                            else if (var9 == 9)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var23, var29, var33, (var15 + var17) / 2.0D, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var23, var29, var33, (var15 + var17) / 2.0D, var19);
                            }
                            else if (var9 == 13)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var33, (var15 + var17) / 2.0D, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var33, (var15 + var17) / 2.0D, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var25, var29, var33, var17, var19);
                            }
                        }
                        else
                        {
                            var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                            var12.addVertexWithUV(var23, var29, var31, var15, var19);
                            var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                            var12.addVertexWithUV(var23, var27, var31, var15, var21);
                            var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                            var12.addVertexWithUV(var25, var29, var31, var17, var19);
                            var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                            var12.addVertexWithUV(var25, var29, var31, var17, var19);
                        }
                    }
                    else
                    {
                        var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                        var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                        var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                        var12.addVertexWithUV(var25, var27, var31, var17, var21);
                        var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                        var12.addVertexWithUV(var25, var29, var31, var17, var19);
                    }
                }
                else
                {
                    var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                }
            }
            else
            {
                var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
        }
        else if (var9 != 0 && var9 != 8)
        {
            if (var9 == 1)
            {
                var12.addVertexWithUV(var23, var29, var33, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var23, var29, var33, var15, var19);
            }
            else if (var9 != 2 && var9 != 10)
            {
                if (var9 == 3)
                {
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                }
                else if (var9 != 4 && var9 != 12)
                {
                    if (var9 == 5)
                    {
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                        var12.addVertexWithUV(var23, var27, var33, var15, var21);
                        var12.addVertexWithUV(var23, var27, var33, var15, var21);
                        var12.addVertexWithUV(var25, var29, var31, var17, var19);
                    }
                    else if (var9 != 6 && var9 != 14)
                    {
                        if (var9 == 7)
                        {
                            var12.addVertexWithUV(var23, var29, var31, var15, var19);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                            var12.addVertexWithUV(var25, var29, var31, var17, var19);
                        }
                        else if (var9 == 9)
                        {
                            var12.addVertexWithUV(var23, var29, var33, (var15 + var17) / 2.0D, var19);
                            var12.addVertexWithUV(var23, var27, var31, var15, var21);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                            var12.addVertexWithUV(var23, var29, var33, (var15 + var17) / 2.0D, var19);
                        }
                        else if (var9 == 13)
                        {
                            var12.addVertexWithUV(var23, var29, var31, var15, var19);
                            var12.addVertexWithUV(var23, var27, var33, (var15 + var17) / 2.0D, var21);
                            var12.addVertexWithUV(var23, var27, var33, (var15 + var17) / 2.0D, var21);
                            var12.addVertexWithUV(var25, var29, var33, var17, var19);
                        }
                    }
                    else
                    {
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                        var12.addVertexWithUV(var23, var27, var31, var15, var21);
                        var12.addVertexWithUV(var23, var27, var31, var15, var21);
                        var12.addVertexWithUV(var25, var29, var31, var17, var19);
                    }
                }
                else
                {
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.addVertexWithUV(var25, var29, var31, var17, var19);
                }
            }
            else
            {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
            }
        }
        else
        {
            var12.addVertexWithUV(var25, var29, var31, var17, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var29, var31, var17, var19);
        }
    }

    public void renderCornersNorthFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
    {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0)
        {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.minZ * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.maxZ * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.minY * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.maxY * 16.0D - 0.01D) / 256.0D;
        double var23;

        if (var10.flipTexture)
        {
            var23 = var15;
            var15 = var17;
            var17 = var23;
        }

        if (var1.minZ < 0.0D || var1.maxZ > 1.0D)
        {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.minY < 0.0D || var1.maxY > 1.0D)
        {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        var23 = var2 + var1.minX;
        double var25 = var4 + var1.minY;
        double var27 = var4 + var1.maxY;
        double var29 = var6 + var1.minZ;
        double var31 = var6 + var1.maxZ;
        double var33 = var2 + var1.maxX;

        if (this.enableAO)
        {
            if (var9 == 0)
            {
                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                var12.addVertexWithUV(var33, var27, var31, var17, var19);
                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                var12.addVertexWithUV(var33, var27, var31, var17, var19);
                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 != 1 && var9 != 9)
            {
                if (var9 != 2 && var9 != 10)
                {
                    if (var9 == 3)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var33, var27, var29, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var33, var27, var29, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var23, var25, var29, var15, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var23, var25, var31, var17, var21);
                    }
                    else if (var9 == 4)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var23, var27, var31, var17, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var23, var27, var29, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var33, var25, var31, var17, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var33, var25, var31, var17, var21);
                    }
                    else if (var9 != 5 && var9 != 13)
                    {
                        if (var9 != 6 && var9 != 14)
                        {
                            if (var9 == 7)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                                var12.addVertexWithUV(var33, var25, var29, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                                var12.addVertexWithUV(var33, var25, var29, var15, var21);
                            }
                            else if (var9 == 11)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var33, var27, var29, (var15 + var17) / 2.0D, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var33, var27, var29, (var15 + var17) / 2.0D, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNeg * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNeg * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNeg * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueZPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueZPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueZPos * (this.factorTop + this.factorWest + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var33, var25, var31, var17, var21);
                            }
                            else if (var9 == 15)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueZPos * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueZPos * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueZPos * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var33, var27, var31, var17, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var33, var25, var29, (var15 + var17) / 2.0D, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorWest + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var33, var25, var29, (var15 + var17) / 2.0D, var21);
                            }
                        }
                        else
                        {
                            var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                            var12.addVertexWithUV(var23, var27, var31, var17, var19);
                            var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                            var12.addVertexWithUV(var23, var27, var29, var15, var19);
                            var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                            var12.addVertexWithUV(var23, var27, var29, var15, var19);
                            var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                            var12.addVertexWithUV(var23, var25, var31, var17, var21);
                        }
                    }
                    else
                    {
                        var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                        var12.addVertexWithUV(var23, var27, var31, var17, var19);
                        var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                        var12.addVertexWithUV(var23, var27, var29, var15, var19);
                        var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                        var12.addVertexWithUV(var23, var25, var29, var15, var21);
                        var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                        var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    }
                }
                else
                {
                    var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                }
            }
            else
            {
                var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
        }
        else if (var9 == 0)
        {
            var12.addVertexWithUV(var33, var27, var31, var17, var19);
            var12.addVertexWithUV(var33, var27, var31, var17, var19);
            var12.addVertexWithUV(var23, var25, var29, var15, var21);
            var12.addVertexWithUV(var23, var25, var31, var17, var21);
        }
        else if (var9 != 1 && var9 != 9)
        {
            if (var9 != 2 && var9 != 10)
            {
                if (var9 == 3)
                {
                    var12.addVertexWithUV(var33, var27, var29, var15, var19);
                    var12.addVertexWithUV(var33, var27, var29, var15, var19);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                }
                else if (var9 == 4)
                {
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.addVertexWithUV(var33, var25, var31, var17, var21);
                    var12.addVertexWithUV(var33, var25, var31, var17, var21);
                }
                else if (var9 != 5 && var9 != 13)
                {
                    if (var9 != 6 && var9 != 14)
                    {
                        if (var9 == 7)
                        {
                            var12.addVertexWithUV(var23, var27, var31, var17, var19);
                            var12.addVertexWithUV(var23, var27, var29, var15, var19);
                            var12.addVertexWithUV(var33, var25, var29, var15, var21);
                            var12.addVertexWithUV(var33, var25, var29, var15, var21);
                        }
                        else if (var9 == 11)
                        {
                            var12.addVertexWithUV(var33, var27, var29, (var15 + var17) / 2.0D, var19);
                            var12.addVertexWithUV(var33, var27, var29, (var15 + var17) / 2.0D, var19);
                            var12.addVertexWithUV(var23, var25, var29, var15, var21);
                            var12.addVertexWithUV(var33, var25, var31, var17, var21);
                        }
                        else if (var9 == 15)
                        {
                            var12.addVertexWithUV(var33, var27, var31, var17, var19);
                            var12.addVertexWithUV(var23, var27, var29, var15, var19);
                            var12.addVertexWithUV(var33, var25, var29, (var15 + var17) / 2.0D, var21);
                            var12.addVertexWithUV(var33, var25, var29, (var15 + var17) / 2.0D, var21);
                        }
                    }
                    else
                    {
                        var12.addVertexWithUV(var23, var27, var31, var17, var19);
                        var12.addVertexWithUV(var23, var27, var29, var15, var19);
                        var12.addVertexWithUV(var23, var25, var31, var17, var21);
                        var12.addVertexWithUV(var23, var25, var31, var17, var21);
                    }
                }
                else
                {
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                }
            }
            else
            {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var25, var29, var15, var21);
            var12.addVertexWithUV(var23, var25, var31, var17, var21);
        }
    }

    public void renderCornersSouthFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
    {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0)
        {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.minZ * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.maxZ * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.minY * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.maxY * 16.0D - 0.01D) / 256.0D;
        double var23;

        if (var10.flipTexture)
        {
            var23 = var15;
            var15 = var17;
            var17 = var23;
        }

        if (var1.minZ < 0.0D || var1.maxZ > 1.0D)
        {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.minY < 0.0D || var1.maxY > 1.0D)
        {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        var23 = var2 + var1.maxX;
        double var25 = var4 + var1.minY;
        double var27 = var4 + var1.maxY;
        double var29 = var6 + var1.minZ;
        double var31 = var6 + var1.maxZ;
        double var33 = var2 + var1.minX;

        if (this.enableAO)
        {
            if (var9 != 0 && var9 != 8)
            {
                if (var9 == 1)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                }
                else if (var9 == 2)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var15, var19);
                }
                else if (var9 != 3 && var9 != 11)
                {
                    if (var9 != 4 && var9 != 12)
                    {
                        if (var9 == 5)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var29, var17, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var29, var17, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var29, var17, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var31, var15, var19);
                        }
                        else if (var9 == 6)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var31, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var31, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var29, var17, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var31, var15, var19);
                        }
                        else if (var9 != 7 && var9 != 15)
                        {
                            if (var9 == 10)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var33, var25, var29, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var33, var27, var31, (var15 + var17) / 2.0D, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var33, var27, var31, (var15 + var17) / 2.0D, var19);
                            }
                            else if (var9 == 14)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var33, var25, var31, (var15 + var17) / 2.0D, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var33, var25, var31, (var15 + var17) / 2.0D, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPos * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPos * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPos * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var31, var15, var19);
                            }
                        }
                        else
                        {
                            var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                            var12.addVertexWithUV(var23, var27, var31, var15, var19);
                            var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                            var12.addVertexWithUV(var23, var25, var29, var17, var21);
                            var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                            var12.addVertexWithUV(var23, var27, var29, var17, var19);
                            var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                            var12.addVertexWithUV(var23, var27, var31, var15, var19);
                        }
                    }
                    else
                    {
                        var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                        var12.addVertexWithUV(var23, var25, var31, var15, var21);
                        var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                        var12.addVertexWithUV(var23, var27, var29, var17, var19);
                        var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                        var12.addVertexWithUV(var23, var27, var29, var17, var19);
                        var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                        var12.addVertexWithUV(var23, var27, var31, var15, var19);
                    }
                }
                else
                {
                    var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                }
            }
            else
            {
                var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
        }
        else if (var9 != 0 && var9 != 8)
        {
            if (var9 == 1)
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
            }
            else if (var9 == 2)
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var33, var27, var31, var15, var19);
                var12.addVertexWithUV(var33, var27, var31, var15, var19);
            }
            else if (var9 != 3 && var9 != 11)
            {
                if (var9 != 4 && var9 != 12)
                {
                    if (var9 == 5)
                    {
                        var12.addVertexWithUV(var33, var25, var29, var17, var21);
                        var12.addVertexWithUV(var33, var25, var29, var17, var21);
                        var12.addVertexWithUV(var23, var27, var29, var17, var19);
                        var12.addVertexWithUV(var23, var27, var31, var15, var19);
                    }
                    else if (var9 == 6)
                    {
                        var12.addVertexWithUV(var33, var25, var31, var15, var21);
                        var12.addVertexWithUV(var33, var25, var31, var15, var21);
                        var12.addVertexWithUV(var23, var27, var29, var17, var19);
                        var12.addVertexWithUV(var23, var27, var31, var15, var19);
                    }
                    else if (var9 != 7 && var9 != 15)
                    {
                        if (var9 == 10)
                        {
                            var12.addVertexWithUV(var23, var25, var31, var15, var21);
                            var12.addVertexWithUV(var33, var25, var29, var17, var21);
                            var12.addVertexWithUV(var33, var27, var31, (var15 + var17) / 2.0D, var19);
                            var12.addVertexWithUV(var33, var27, var31, (var15 + var17) / 2.0D, var19);
                        }
                        else if (var9 == 14)
                        {
                            var12.addVertexWithUV(var33, var25, var31, (var15 + var17) / 2.0D, var21);
                            var12.addVertexWithUV(var33, var25, var31, (var15 + var17) / 2.0D, var21);
                            var12.addVertexWithUV(var33, var27, var29, var17, var19);
                            var12.addVertexWithUV(var23, var27, var31, var15, var19);
                        }
                    }
                    else
                    {
                        var12.addVertexWithUV(var23, var25, var29, var17, var21);
                        var12.addVertexWithUV(var23, var25, var29, var17, var21);
                        var12.addVertexWithUV(var23, var27, var29, var17, var19);
                        var12.addVertexWithUV(var23, var27, var31, var15, var19);
                    }
                }
                else
                {
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                }
            }
            else
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var25, var31, var15, var21);
            var12.addVertexWithUV(var23, var25, var29, var17, var21);
            var12.addVertexWithUV(var23, var27, var31, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var19);
        }
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
            BlockKaevWoodCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevWoodCorners"), 4, Material.wood)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5.0F).setBlockName("BlockKaevWoodCorners");
            ItemKaevWoodCorners = (new ItemCorners_Kaevator(BlockKaevWoodCorners.blockID - 256, "Wood")).setItemName("ItemKaevWoodCorners");
        }
        else
        {
            BlockKaevWoodCorners = Block.stone;
        }

        if (props.getInt("BlockKaevCobblestoneCorners") != 0)
        {
            BlockKaevCobblestoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevCobblestoneCorners"), 16, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevCobblestoneCorners");
            ItemKaevCobblestoneCorners = (new ItemCorners_Kaevator(BlockKaevCobblestoneCorners.blockID - 256, "Cobblestone")).setItemName("ItemKaevCobblestoneCorners");
        }
        else
        {
            BlockKaevCobblestoneCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGlassCorners") != 0)
        {
            BlockKaevGlassCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGlassCorners"), 49, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("BlockKaevGlassCorners");
            ItemKaevGlassCorners = (new ItemCorners_Kaevator(BlockKaevGlassCorners.blockID - 256, "Glass")).setItemName("ItemKaevGlassCorners");
        }
        else
        {
            BlockKaevGlassCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSandstoneCorners") != 0)
        {
            BlockKaevSandstoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSandstoneCorners"), 192, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("BlockKaevSandstoneCorners");
            ItemKaevSandstoneCorners = (new ItemCorners_Kaevator(BlockKaevSandstoneCorners.blockID - 256, "Sandstone")).setItemName("ItemKaevSandstoneCorners");
        }
        else
        {
            BlockKaevSandstoneCorners = Block.stone;
        }

        if (props.getInt("BlockKaevDirtCorners") != 0)
        {
            BlockKaevDirtCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevDirtCorners"), 2, Material.ground)).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevDirtCorners");
            ItemKaevDirtCorners = (new ItemCorners_Kaevator(BlockKaevDirtCorners.blockID - 256, "Dirt")).setItemName("ItemKaevDirtCorners");
        }
        else
        {
            BlockKaevDirtCorners = Block.stone;
        }

        if (props.getInt("BlockKaevStoneCorners") != 0)
        {
            BlockKaevStoneCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevStoneCorners"), 1, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevStoneCorners");
            ItemKaevStoneCorners = (new ItemCorners_Kaevator(BlockKaevStoneCorners.blockID - 256, "Stone")).setItemName("ItemKaevStoneCorners");
        }
        else
        {
            BlockKaevStoneCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSandCorners") != 0)
        {
            BlockKaevSandCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSandCorners"), 18, Material.sand)).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("BlockKaevSandCorners");
            ItemKaevSandCorners = (new ItemCorners_Kaevator(BlockKaevSandCorners.blockID - 256, "Sand")).setItemName("ItemKaevSandCorners");
        }
        else
        {
            BlockKaevSandCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSnowCorners") != 0)
        {
            BlockKaevSnowCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSnowCorners"), 66, Material.snow)).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSnowCorners");
            ItemKaevSnowCorners = (new ItemCorners_Kaevator(BlockKaevSnowCorners.blockID - 256, "Snow")).setItemName("ItemKaevSnowCorners");
        }
        else
        {
            BlockKaevSnowCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGrassCorners") != 0)
        {
            BlockKaevGrassCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGrassCorners"), 3, Material.ground)).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("BlockKaevGrassCorners");
            ItemKaevGrassCorners = (new ItemCorners_Kaevator(BlockKaevGrassCorners.blockID - 256, "Grass")).setItemName("ItemKaevGrassCorners");
        }
        else
        {
            BlockKaevGrassCorners = Block.stone;
        }

        if (props.getInt("BlockKaevBricksCorners") != 0)
        {
            BlockKaevBricksCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBricksCorners"), 7, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevBricksCorners");
            ItemKaevBricksCorners = (new ItemCorners_Kaevator(BlockKaevBricksCorners.blockID - 256, "Bricks")).setItemName("ItemKaevBricksCorners");
        }
        else
        {
            BlockKaevBricksCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGravelCorners") != 0)
        {
            BlockKaevGravelCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGravelCorners"), 19, Material.sand)).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevGravelCorners");
            ItemKaevGravelCorners = (new ItemCorners_Kaevator(BlockKaevGravelCorners.blockID - 256, "Gravel")).setItemName("ItemKaevGravelCorners");
        }
        else
        {
            BlockKaevGravelCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGoldCorners") != 0)
        {
            BlockKaevGoldCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGoldCorners"), 23, Material.iron)).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevGoldCorners");
            ItemKaevGoldCorners = (new ItemCorners_Kaevator(BlockKaevGoldCorners.blockID - 256, "Gold")).setItemName("ItemKaevGoldCorners");
        }
        else
        {
            BlockKaevGoldCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSteelCorners") != 0)
        {
            BlockKaevSteelCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSteelCorners"), 22, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevSteelCorners");
            ItemKaevSteelCorners = (new ItemCorners_Kaevator(BlockKaevSteelCorners.blockID - 256, "Steel")).setItemName("ItemKaevSteelCorners");
        }
        else
        {
            BlockKaevSteelCorners = Block.stone;
        }

        if (props.getInt("BlockKaevObsidianCorners") != 0)
        {
            BlockKaevObsidianCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevObsidianCorners"), 37, Material.rock)).setHardness(10.0F).setStepSound(Block.soundStoneFootstep).setResistance(2000.0F).setBlockName("BlockKaevObsidianCorners");
            ItemKaevObsidianCorners = (new ItemCorners_Kaevator(BlockKaevObsidianCorners.blockID - 256, "Obsidian")).setItemName("ItemKaevObsidianCorners");
        }
        else
        {
            BlockKaevObsidianCorners = Block.stone;
        }

        if (props.getInt("BlockKaevDiamondCorners") != 0)
        {
            BlockKaevDiamondCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevDiamondCorners"), 24, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevDiamondCorners");
            ItemKaevDiamondCorners = (new ItemCorners_Kaevator(BlockKaevDiamondCorners.blockID - 256, "Diamond")).setItemName("ItemKaevDiamondCorners");
        }
        else
        {
            BlockKaevDiamondCorners = Block.stone;
        }

        if (props.getInt("BlockKaevWhiteWoolCorners") != 0)
        {
            BlockKaevWhiteWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevWhiteWoolCorners"), 64, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevWhiteWoolCorners");
            ItemKaevWhiteWoolCorners = (new ItemCorners_Kaevator(BlockKaevWhiteWoolCorners.blockID - 256, "WhiteWool")).setItemName("ItemKaevWhiteWoolCorners");
        }
        else
        {
            BlockKaevWhiteWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevBlackWoolCorners") != 0)
        {
            BlockKaevBlackWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBlackWoolCorners"), 113, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlackWoolCorners");
            ItemKaevBlackWoolCorners = (new ItemCorners_Kaevator(BlockKaevBlackWoolCorners.blockID - 256, "BlackWool")).setItemName("ItemKaevBlackWoolCorners");
        }
        else
        {
            BlockKaevBlackWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevRedWoolCorners") != 0)
        {
            BlockKaevRedWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevRedWoolCorners"), 129, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevRedWoolCorners");
            ItemKaevRedWoolCorners = (new ItemCorners_Kaevator(BlockKaevRedWoolCorners.blockID - 256, "RedWool")).setItemName("ItemKaevRedWoolCorners");
        }
        else
        {
            BlockKaevRedWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGreenWoolCorners") != 0)
        {
            BlockKaevGreenWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGreenWoolCorners"), 145, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGreenWoolCorners");
            ItemKaevGreenWoolCorners = (new ItemCorners_Kaevator(BlockKaevGreenWoolCorners.blockID - 256, "GreenWool")).setItemName("ItemKaevGreenWoolCorners");
        }
        else
        {
            BlockKaevGreenWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevBrownWoolCorners") != 0)
        {
            BlockKaevBrownWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBrownWoolCorners"), 161, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBrownWoolCorners");
            ItemKaevBrownWoolCorners = (new ItemCorners_Kaevator(BlockKaevBrownWoolCorners.blockID - 256, "BrownWool")).setItemName("ItemKaevBrownWoolCorners");
        }
        else
        {
            BlockKaevBrownWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevBlueWoolCorners") != 0)
        {
            BlockKaevBlueWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevBlueWoolCorners"), 177, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlueWoolCorners");
            ItemKaevBlueWoolCorners = (new ItemCorners_Kaevator(BlockKaevBlueWoolCorners.blockID - 256, "BlueWool")).setItemName("ItemKaevBlueWoolCorners");
        }
        else
        {
            BlockKaevBlueWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevPurpleWoolCorners") != 0)
        {
            BlockKaevPurpleWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevPurpleWoolCorners"), 193, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPurpleWoolCorners");
            ItemKaevPurpleWoolCorners = (new ItemCorners_Kaevator(BlockKaevPurpleWoolCorners.blockID - 256, "PurpleWool")).setItemName("ItemKaevPurpleWoolCorners");
        }
        else
        {
            BlockKaevPurpleWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevCyanWoolCorners") != 0)
        {
            BlockKaevCyanWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevCyanWoolCorners"), 209, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevCyanWoolCorners");
            ItemKaevCyanWoolCorners = (new ItemCorners_Kaevator(BlockKaevCyanWoolCorners.blockID - 256, "CyanWool")).setItemName("ItemKaevCyanWoolCorners");
        }
        else
        {
            BlockKaevCyanWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSilverWoolCorners") != 0)
        {
            BlockKaevSilverWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevSilverWoolCorners"), 225, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSilverWoolCorners");
            ItemKaevSilverWoolCorners = (new ItemCorners_Kaevator(BlockKaevSilverWoolCorners.blockID - 256, "SilverWool")).setItemName("ItemKaevSilverWoolCorners");
        }
        else
        {
            BlockKaevSilverWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGrayWoolCorners") != 0)
        {
            BlockKaevGrayWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevGrayWoolCorners"), 114, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGrayWoolCorners");
            ItemKaevGrayWoolCorners = (new ItemCorners_Kaevator(BlockKaevGrayWoolCorners.blockID - 256, "GrayWool")).setItemName("ItemKaevGrayWoolCorners");
        }
        else
        {
            BlockKaevGrayWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevPinkWoolCorners") != 0)
        {
            BlockKaevPinkWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevPinkWoolCorners"), 130, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPinkWoolCorners");
            ItemKaevPinkWoolCorners = (new ItemCorners_Kaevator(BlockKaevPinkWoolCorners.blockID - 256, "PinkWool")).setItemName("ItemKaevPinkWoolCorners");
        }
        else
        {
            BlockKaevPinkWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevLimeWoolCorners") != 0)
        {
            BlockKaevLimeWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevLimeWoolCorners"), 146, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLimeWoolCorners");
            ItemKaevLimeWoolCorners = (new ItemCorners_Kaevator(BlockKaevLimeWoolCorners.blockID - 256, "LimeWool")).setItemName("ItemKaevLimeWoolCorners");
        }
        else
        {
            BlockKaevLimeWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevYellowWoolCorners") != 0)
        {
            BlockKaevYellowWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevYellowWoolCorners"), 162, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevYellowWoolCorners");
            ItemKaevYellowWoolCorners = (new ItemCorners_Kaevator(BlockKaevYellowWoolCorners.blockID - 256, "YellowWool")).setItemName("ItemKaevYellowWoolCorners");
        }
        else
        {
            BlockKaevYellowWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevLightBlueWoolCorners") != 0)
        {
            BlockKaevLightBlueWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevLightBlueWoolCorners"), 178, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLightBlueWoolCorners");
            ItemKaevLightBlueWoolCorners = (new ItemCorners_Kaevator(BlockKaevLightBlueWoolCorners.blockID - 256, "LightBlueWool")).setItemName("ItemKaevLightBlueWoolCorners");
        }
        else
        {
            BlockKaevLightBlueWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevMagentaWoolCorners") != 0)
        {
            BlockKaevMagentaWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevMagentaWoolCorners"), 194, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevMagentaWoolCorners");
            ItemKaevMagentaWoolCorners = (new ItemCorners_Kaevator(BlockKaevMagentaWoolCorners.blockID - 256, "MagentaWool")).setItemName("ItemKaevMagentaWoolCorners");
        }
        else
        {
            BlockKaevMagentaWoolCorners = Block.stone;
        }

        if (props.getInt("BlockKaevOrangeWoolCorners") != 0)
        {
            BlockKaevOrangeWoolCorners = (new BlockCorners_Kaevator(props.getInt("BlockKaevOrangeWoolCorners"), 210, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevOrangeWoolCorners");
            ItemKaevOrangeWoolCorners = (new ItemCorners_Kaevator(BlockKaevOrangeWoolCorners.blockID - 256, "OrangeWool")).setItemName("ItemKaevOrangeWoolCorners");
        }
        else
        {
            BlockKaevOrangeWoolCorners = Block.stone;
        }

        props.save();
    }
}
