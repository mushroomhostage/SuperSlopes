package net.minecraft.src;

import java.io.File;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class mod_Kaevator_Slopes extends BaseMod
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
        ModLoader.addLocalization("KaevWoodSlopesStairsUp.name", "wooden ceiling stairs");
        ModLoader.addLocalization("KaevWoodSlopesSlopeDown.name", "wooden sloped floor");
        ModLoader.addLocalization("KaevWoodSlopesSlopeUp.name", "wooden sloped ceiling");
        ModLoader.addLocalization("KaevWoodSlopesSlopeSide.name", "wooden corner ");
        ModLoader.addLocalization("KaevCobblestoneSlopesStairsUp.name", "cobblestone ceiling stairs");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeDown.name", "cobblestone sloped floor");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeUp.name", "cobblestone sloped ceiling");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeSide.name", "cobblestone corner ");
        ModLoader.addLocalization("KaevGlassSlopesStairsUp.name", "glass ceiling stairs");
        ModLoader.addLocalization("KaevGlassSlopesSlopeDown.name", "glass sloped floor");
        ModLoader.addLocalization("KaevGlassSlopesSlopeUp.name", "glass sloped ceiling");
        ModLoader.addLocalization("KaevGlassSlopesSlopeSide.name", "glass corner ");
        ModLoader.addLocalization("KaevSandstoneSlopesStairsUp.name", "sandstone ceiling stairs");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeDown.name", "sandstone sloped floor");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeUp.name", "sandstone sloped ceiling");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeSide.name", "sandstone corner ");
        ModLoader.addLocalization("KaevDirtSlopesStairsUp.name", "dirt ceiling stairs");
        ModLoader.addLocalization("KaevDirtSlopesSlopeDown.name", "dirt sloped floor");
        ModLoader.addLocalization("KaevDirtSlopesSlopeUp.name", "dirt sloped ceiling");
        ModLoader.addLocalization("KaevDirtSlopesSlopeSide.name", "dirt corner ");
        ModLoader.addLocalization("KaevStoneSlopesStairsUp.name", "stone ceiling stairs");
        ModLoader.addLocalization("KaevStoneSlopesSlopeDown.name", "stone sloped floor");
        ModLoader.addLocalization("KaevStoneSlopesSlopeUp.name", "stone sloped ceiling");
        ModLoader.addLocalization("KaevStoneSlopesSlopeSide.name", "stone corner ");
        ModLoader.addLocalization("KaevSandSlopesStairsUp.name", "sand ceiling stairs");
        ModLoader.addLocalization("KaevSandSlopesSlopeDown.name", "sand sloped floor");
        ModLoader.addLocalization("KaevSandSlopesSlopeUp.name", "sand sloped ceiling");
        ModLoader.addLocalization("KaevSandSlopesSlopeSide.name", "sand corner ");
        ModLoader.addLocalization("KaevSnowSlopesStairsUp.name", "snow ceiling stairs");
        ModLoader.addLocalization("KaevSnowSlopesSlopeDown.name", "snow sloped floor");
        ModLoader.addLocalization("KaevSnowSlopesSlopeUp.name", "snow sloped ceiling");
        ModLoader.addLocalization("KaevSnowSlopesSlopeSide.name", "snow corner ");
        ModLoader.addLocalization("KaevGrassSlopesStairsUp.name", "grass ceiling stairs");
        ModLoader.addLocalization("KaevGrassSlopesSlopeDown.name", "grass sloped floor");
        ModLoader.addLocalization("KaevGrassSlopesSlopeUp.name", "grass sloped ceiling");
        ModLoader.addLocalization("KaevGrassSlopesSlopeSide.name", "grass corner ");
        ModLoader.addLocalization("KaevBricksSlopesStairsUp.name", "bricks ceiling stairs");
        ModLoader.addLocalization("KaevBricksSlopesSlopeDown.name", "bricks sloped floor");
        ModLoader.addLocalization("KaevBricksSlopesSlopeUp.name", "bricks sloped ceiling");
        ModLoader.addLocalization("KaevBricksSlopesSlopeSide.name", "bricks corner ");
        ModLoader.addLocalization("KaevGravelSlopesStairsUp.name", "gravel ceiling stairs");
        ModLoader.addLocalization("KaevGravelSlopesSlopeDown.name", "gravel sloped floor");
        ModLoader.addLocalization("KaevGravelSlopesSlopeUp.name", "gravel sloped ceiling");
        ModLoader.addLocalization("KaevGravelSlopesSlopeSide.name", "gravel corner ");
        ModLoader.addLocalization("KaevGoldSlopesStairsUp.name", "golden ceiling stairs");
        ModLoader.addLocalization("KaevGoldSlopesSlopeDown.name", "golden sloped floor");
        ModLoader.addLocalization("KaevGoldSlopesSlopeUp.name", "golden sloped ceiling");
        ModLoader.addLocalization("KaevGoldSlopesSlopeSide.name", "golden corner ");
        ModLoader.addLocalization("KaevSteelSlopesStairsUp.name", "steel ceiling stairs");
        ModLoader.addLocalization("KaevSteelSlopesSlopeDown.name", "steel sloped floor");
        ModLoader.addLocalization("KaevSteelSlopesSlopeUp.name", "steel sloped ceiling");
        ModLoader.addLocalization("KaevSteelSlopesSlopeSide.name", "steel corner ");
        ModLoader.addLocalization("KaevObsidianSlopesStairsUp.name", "obsidian ceiling stairs");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeDown.name", "obsidian sloped floor");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeUp.name", "obsidian sloped ceiling");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeSide.name", "obsidian corner ");
        ModLoader.addLocalization("KaevDiamondSlopesStairsUp.name", "diamond ceiling stairs");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeDown.name", "diamond sloped floor");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeUp.name", "diamond sloped ceiling");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeSide.name", "diamond corner ");
        ModLoader.addLocalization("KaevWhiteWoolSlopesStairsUp.name", "white ceiling stairs");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeDown.name", "white sloped floor");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeUp.name", "white sloped ceiling");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeSide.name", "white corner ");
        ModLoader.addLocalization("KaevBlackWoolSlopesStairsUp.name", "black ceiling stairs");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeDown.name", "black sloped floor");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeUp.name", "black sloped ceiling");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeSide.name", "black corner ");
        ModLoader.addLocalization("KaevRedWoolSlopesStairsUp.name", "red ceiling stairs");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeDown.name", "red sloped floor");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeUp.name", "red sloped ceiling");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeSide.name", "red corner ");
        ModLoader.addLocalization("KaevGreenWoolSlopesStairsUp.name", "green ceiling stairs");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeDown.name", "green sloped floor");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeUp.name", "green sloped ceiling");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeSide.name", "green corner ");
        ModLoader.addLocalization("KaevBrownWoolSlopesStairsUp.name", "brown ceiling stairs");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeDown.name", "brown sloped floor");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeUp.name", "brown sloped ceiling");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeSide.name", "brown corner ");
        ModLoader.addLocalization("KaevBlueWoolSlopesStairsUp.name", "blue ceiling stairs");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeDown.name", "blue sloped floor");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeUp.name", "blue sloped ceiling");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeSide.name", "blue corner ");
        ModLoader.addLocalization("KaevPurpleWoolSlopesStairsUp.name", "purple ceiling stairs");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeDown.name", "purple sloped floor");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeUp.name", "purple sloped ceiling");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeSide.name", "purple corner ");
        ModLoader.addLocalization("KaevCyanWoolSlopesStairsUp.name", "cyan ceiling stairs");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeDown.name", "cyan sloped floor");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeUp.name", "cyan sloped ceiling");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeSide.name", "cyan corner ");
        ModLoader.addLocalization("KaevSilverWoolSlopesStairsUp.name", "silver ceiling stairs");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeDown.name", "silver sloped floor");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeUp.name", "silver sloped ceiling");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeSide.name", "silver corner ");
        ModLoader.addLocalization("KaevGrayWoolSlopesStairsUp.name", "gray ceiling stairs");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeDown.name", "gray sloped floor");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeUp.name", "gray sloped ceiling");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeSide.name", "gray corner ");
        ModLoader.addLocalization("KaevPinkWoolSlopesStairsUp.name", "pink ceiling stairs");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeDown.name", "pink sloped floor");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeUp.name", "pink sloped ceiling");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeSide.name", "pink corner ");
        ModLoader.addLocalization("KaevLimeWoolSlopesStairsUp.name", "lime ceiling stairs");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeDown.name", "lime sloped floor");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeUp.name", "lime sloped ceiling");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeSide.name", "lime corner ");
        ModLoader.addLocalization("KaevYellowWoolSlopesStairsUp.name", "yellow ceiling stairs");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeDown.name", "yellow sloped floor");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeUp.name", "yellow sloped ceiling");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeSide.name", "yellow corner ");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesStairsUp.name", "lightBlue ceiling stairs");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeDown.name", "lightBlue sloped floor");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeUp.name", "lightBlue sloped ceiling");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeSide.name", "lightBlue corner ");
        ModLoader.addLocalization("KaevMagentaWoolSlopesStairsUp.name", "magenta ceiling stairs");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeDown.name", "magenta sloped floor");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeUp.name", "magenta sloped ceiling");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeSide.name", "magenta corner ");
        ModLoader.addLocalization("KaevOrangeWoolSlopesStairsUp.name", "orange ceiling stairs");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeDown.name", "orange sloped floor");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeUp.name", "orange sloped ceiling");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeSide.name", "orange corner ");

        if (props.getInt("BlockKaevWoodSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(Block.planks, 1), new Object[] {"#", '#', BlockKaevWoodSlopes});
        }

        if (props.getInt("BlockKaevCobblestoneSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(Block.cobblestone, 1), new Object[] {"#", '#', BlockKaevCobblestoneSlopes});
        }

        if (props.getInt("BlockKaevGlassSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(Block.glass, 1), new Object[] {"#", '#', BlockKaevGlassSlopes});
        }

        if (props.getInt("BlockKaevSandstoneSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(Block.sandStone, 1), new Object[] {"#", '#', BlockKaevSandstoneSlopes});
        }

        if (props.getInt("BlockKaevDirtSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(Block.dirt, 1), new Object[] {"#", '#', BlockKaevDirtSlopes});
        }

        if (props.getInt("BlockKaevStoneSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(Block.stone, 1), new Object[] {"#", '#', BlockKaevStoneSlopes});
        }

        if (props.getInt("BlockKaevSandSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(Block.sand, 1), new Object[] {"#", '#', BlockKaevSandSlopes});
        }

        if (props.getInt("BlockKaevSnowSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(Block.blockSnow, 1), new Object[] {"#", '#', BlockKaevSnowSlopes});
        }

        if (props.getInt("BlockKaevGrassSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(Block.grass, 1), new Object[] {"#", '#', BlockKaevGrassSlopes});
        }

        if (props.getInt("BlockKaevBricksSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(Block.brick, 1), new Object[] {"#", '#', BlockKaevBricksSlopes});
        }

        if (props.getInt("BlockKaevGravelSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(Block.gravel, 1), new Object[] {"#", '#', BlockKaevGravelSlopes});
        }

        if (props.getInt("BlockKaevGoldSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(Block.blockGold, 1), new Object[] {"#", '#', BlockKaevGoldSlopes});
        }

        if (props.getInt("BlockKaevSteelSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(Block.blockSteel, 1), new Object[] {"#", '#', BlockKaevSteelSlopes});
        }

        if (props.getInt("BlockKaevObsidianSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {"#", '#', BlockKaevObsidianSlopes});
        }

        if (props.getInt("BlockKaevDiamondSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(Block.blockDiamond, 1), new Object[] {"#", '#', BlockKaevDiamondSlopes});
        }

        if (props.getInt("BlockKaevWhiteWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 3, BlockSlopes_Kaevator.getDyeFromBlock(0)), new Object[] {"###", "## ", "#  ", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(4)), new Object[] {"#  ", " # ", "###", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.getDyeFromBlock(8)), new Object[] {"###", " # ", "#  ", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 4, BlockSlopes_Kaevator.getDyeFromBlock(12)), new Object[] {" # ", " ##", " # ", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 0), new Object[] {"#", '#', BlockKaevWhiteWoolSlopes});
        }

        if (props.getInt("BlockKaevBlackWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 15), new Object[] {"#", '#', BlockKaevBlackWoolSlopes});
        }

        if (props.getInt("BlockKaevRedWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 14), new Object[] {"#", '#', BlockKaevRedWoolSlopes});
        }

        if (props.getInt("BlockKaevGreenWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 13), new Object[] {"#", '#', BlockKaevGreenWoolSlopes});
        }

        if (props.getInt("BlockKaevBrownWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 12), new Object[] {"#", '#', BlockKaevBrownWoolSlopes});
        }

        if (props.getInt("BlockKaevBlueWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 11), new Object[] {"#", '#', BlockKaevBlueWoolSlopes});
        }

        if (props.getInt("BlockKaevPurpleWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 10), new Object[] {"#", '#', BlockKaevPurpleWoolSlopes});
        }

        if (props.getInt("BlockKaevCyanWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 9), new Object[] {"#", '#', BlockKaevCyanWoolSlopes});
        }

        if (props.getInt("BlockKaevSilverWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 8), new Object[] {"#", '#', BlockKaevSilverWoolSlopes});
        }

        if (props.getInt("BlockKaevGrayWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 7), new Object[] {"#", '#', BlockKaevGrayWoolSlopes});
        }

        if (props.getInt("BlockKaevPinkWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 6), new Object[] {"#", '#', BlockKaevPinkWoolSlopes});
        }

        if (props.getInt("BlockKaevLimeWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 5), new Object[] {"#", '#', BlockKaevLimeWoolSlopes});
        }

        if (props.getInt("BlockKaevYellowWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 4), new Object[] {"#", '#', BlockKaevYellowWoolSlopes});
        }

        if (props.getInt("BlockKaevLightBlueWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 3), new Object[] {"#", '#', BlockKaevLightBlueWoolSlopes});
        }

        if (props.getInt("BlockKaevMagentaWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 2), new Object[] {"#", '#', BlockKaevMagentaWoolSlopes});
        }

        if (props.getInt("BlockKaevOrangeWoolSlopes") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 1), new Object[] {"#", '#', BlockKaevOrangeWoolSlopes});
        }
    }

    private static String getAppdata()
    {
        return Minecraft.getMinecraftDir().getPath();
    }

    public void renderInvBlock(RenderBlocks var1, Block var2, int var3, int var4)
    {
        Tessellator var5 = Tessellator.instance;

        if (var4 == SlopesRenderID)
        {
            if (var3 / 4 == 0)
            {
                for (int var6 = 0; var6 < 2; ++var6)
                {
                    if (var6 == 0)
                    {
                        var2.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
                    }

                    if (var6 == 1)
                    {
                        var2.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
                    }

                    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                    var5.startDrawingQuads();
                    var5.setNormal(0.0F, -1.0F, 0.0F);
                    var1.renderBottomFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(0));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(0.0F, 1.0F, 0.0F);
                    var1.renderTopFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(1));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(0.0F, 0.0F, -1.0F);
                    var1.renderEastFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(2));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(0.0F, 0.0F, 1.0F);
                    var1.renderWestFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(3));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(-1.0F, 0.0F, 0.0F);
                    var1.renderNorthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(4));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(1.0F, 0.0F, 0.0F);
                    var1.renderSouthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(5));
                    var5.draw();
                    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                }
            }
            else
            {
                var2.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                var5.startDrawingQuads();
                var5.setNormal(0.0F, -1.0F, 0.0F);
                this.renderSlopesBottomFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(0), var3 + 1, var1, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(0.0F, 1.0F, 0.0F);
                this.renderSlopesTopFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(1), var3 + 1, var1, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(0.0F, 0.0F, -1.0F);
                this.renderSlopesEastFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(2), var3 + 1, var1, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(0.0F, 0.0F, 1.0F);
                this.renderSlopesWestFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(3), var3 + 1, var1, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(-1.0F, 0.0F, 0.0F);
                this.renderSlopesNorthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(4), var3 + 1, var1, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(1.0F, 0.0F, 0.0F);
                this.renderSlopesSouthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSide(5), var3 + 1, var1, 240);
                var5.draw();
                GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            var2.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public boolean renderWorldBlock(RenderBlocks var1, IBlockAccess var2, int var3, int var4, int var5, Block var6, int var7)
    {
        if (var7 == SlopesRenderID)
        {
            int var8 = var2.getBlockMetadata(var3, var4, var5);
            return var8 / 4 == 0 ? this.renderBlockStairsUp(var6, var3, var4, var5, var1, var2) : this.renderBlockSlopes(var6, var3, var4, var5, var1, var2);
        }
        else
        {
            return false;
        }
    }

    public boolean renderBlockStairsUp(Block var1, int var2, int var3, int var4, RenderBlocks var5, IBlockAccess var6)
    {
        boolean var7 = false;
        int var8 = var6.getBlockMetadata(var2, var3, var4) % 4;

        if (var8 == 0)
        {
            var1.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            var5.renderStandardBlock(var1, var2, var3, var4);
            var1.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            var5.renderStandardBlock(var1, var2, var3, var4);
        }
        else if (var8 == 1)
        {
            var1.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            var5.renderStandardBlock(var1, var2, var3, var4);
            var1.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            var5.renderStandardBlock(var1, var2, var3, var4);
        }
        else if (var8 == 2)
        {
            var1.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            var5.renderStandardBlock(var1, var2, var3, var4);
            var1.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            var5.renderStandardBlock(var1, var2, var3, var4);
        }
        else if (var8 == 3)
        {
            var1.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            var5.renderStandardBlock(var1, var2, var3, var4);
            var1.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            var5.renderStandardBlock(var1, var2, var3, var4);
        }

        var1.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        return var7;
    }

    public boolean renderBlockSlopes(Block var1, int var2, int var3, int var4, RenderBlocks var5, IBlockAccess var6)
    {
        int var7 = var6.getBlockMetadata(var2, var3, var4);
        int var8 = var1.colorMultiplier(var6, var2, var3, var4);
        float var9 = (float)(var8 >> 16 & 255) / 255.0F;
        float var10 = (float)(var8 >> 8 & 255) / 255.0F;
        float var11 = (float)(var8 & 255) / 255.0F;
        return Minecraft.isAmbientOcclusionEnabled() ? this.renderSlopesBlockWithAmbientOcclusion(var1, var2, var3, var4, var9, var10, var11, var7, var5, var6) : this.renderSlopesBlockWithColorMultiplier(var1, var2, var3, var4, var9, var10, var11, var7, var5, var6);
    }

    public boolean renderSlopesBlockWithAmbientOcclusion(Block var1, int var2, int var3, int var4, float var5, float var6, float var7, int var8, RenderBlocks var9, IBlockAccess var10)
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
            this.renderSlopesBottomFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 + 1, var4, 1))
        {
            this.renderSlopesTopFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 - 1, 2))
        {
            this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var30, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

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
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 + 1, 3))
        {
            this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var35, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

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
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 - 1, var3, var4, 4))
        {
            this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var40, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

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
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 + 1, var3, var4, 5))
        {
            this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var45, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

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
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        this.enableAO = false;
        return var11;
    }

    public boolean renderSlopesBlockWithColorMultiplier(Block var1, int var2, int var3, int var4, float var5, float var6, float var7, int var8, RenderBlocks var9, IBlockAccess var10)
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

        if ((var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 - 1, var4, 0)) && var8 / 4 != 2)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3 - 1, var4);
            var11.setColorOpaque_F(var20 * var30, var23 * var30, var26 * var30);
            this.renderSlopesBottomFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if ((var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 + 1, var4, 1)) && var8 / 4 != 1)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3 + 1, var4);

            if (var1.maxY != 1.0D && !var1.blockMaterial.isLiquid())
            {
                var30 = var29;
            }

            var11.setColorOpaque_F(var17 * var30, var18 * var30, var19 * var30);
            this.renderSlopesTopFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 - 1, 2) || var8 == 6 || var8 == 10 || var8 == 12)
        {
            if (var8 == 6)
            {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 10)
            {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 12)
            {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 2), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else
            {
                var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4 - 1);
                var11.setColorOpaque_F(var21 * var30, var24 * var30, var27 * var30);
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 2), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 + 1, 3) || var8 == 7 || var8 == 11 || var8 == 13)
        {
            if (var8 == 7)
            {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 11)
            {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 13)
            {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 3), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else
            {
                var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4 + 1);
                var11.setColorOpaque_F(var21 * var30, var24 * var30, var27 * var30);
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 3), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 - 1, var3, var4, 4) || var8 == 4 || var8 == 8 || var8 == 15)
        {
            if (var8 == 4)
            {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 8)
            {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 15)
            {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 4), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else
            {
                var30 = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3, var4);
                var11.setColorOpaque_F(var22 * var30, var25 * var30, var28 * var30);
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 4), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 + 1, var3, var4, 5) || var8 == 5 || var8 == 9 || var8 == 14)
        {
            if (var8 == 5)
            {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 9)
            {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 14)
            {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 5), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else
            {
                var30 = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3, var4);
                var11.setColorOpaque_F(var22 * var30, var25 * var30, var28 * var30);
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 5), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var12 = true;
        }

        return var12;
    }

    public void renderSlopesBottomFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 4 && var9 != 5 && var9 != 6 && var9 != 7)
            {
                if (var9 == 12)
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
                else if (var9 == 13)
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
                else if (var9 == 14)
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
                else if (var9 == 15)
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
            else
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
        }
        else if (var9 != 4 && var9 != 5 && var9 != 6 && var9 != 7)
        {
            if (var9 == 12)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 13)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 14)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 15)
            {
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
        }
    }

    public void renderSlopesTopFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 8 && var9 != 9 && var9 != 10 && var9 != 11)
            {
                if (var9 == 12)
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
            else
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
        }
        else if (var9 != 8 && var9 != 9 && var9 != 10 && var9 != 11)
        {
            if (var9 == 12)
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
        else
        {
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
        }
    }

    public void renderSlopesEastFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 7 && var9 != 11 && var9 != 13 && var9 != 15)
            {
                if (var9 == 4)
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
                else if (var9 == 5)
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
                else if (var9 == 6)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                }
                else if (var9 == 8)
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
                else if (var9 == 9)
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
                else if (var9 == 10)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var33, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var33, var17, var21);
                }
                else if (var9 == 12)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorNorth + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorNorth + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorNorth + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorNorth + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorNorth + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorNorth + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var33, var17, var21);
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
                var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
        }
        else if (var9 != 7 && var9 != 11 && var9 != 13 && var9 != 15)
        {
            if (var9 == 4)
            {
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 == 5)
            {
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 == 6)
            {
                var12.addVertexWithUV(var23, var29, var33, var17, var19);
                var12.addVertexWithUV(var25, var29, var33, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 == 8)
            {
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
            }
            else if (var9 == 9)
            {
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 == 10)
            {
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var33, var15, var21);
                var12.addVertexWithUV(var23, var27, var33, var17, var21);
            }
            else if (var9 == 12)
            {
                var12.addVertexWithUV(var23, var29, var33, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var33, var17, var21);
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var29, var31, var17, var19);
            var12.addVertexWithUV(var25, var29, var31, var15, var19);
            var12.addVertexWithUV(var25, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var31, var17, var21);
        }
    }

    public void renderSlopesWestFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 6 && var9 != 10 && var9 != 12 && var9 != 14)
            {
                if (var9 == 4)
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
                else if (var9 == 5)
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
                else if (var9 == 7)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                }
                else if (var9 == 8)
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
                else if (var9 == 9)
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
                else if (var9 == 11)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var33, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var33, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var31, var17, var19);
                }
                else if (var9 == 13)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorSouth + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorSouth + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorSouth + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorSouth + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorSouth + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var33, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorSouth + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
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
                var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
        }
        else if (var9 != 6 && var9 != 10 && var9 != 12 && var9 != 14)
        {
            if (var9 == 4)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
            else if (var9 == 5)
            {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 7)
            {
                var12.addVertexWithUV(var23, var29, var33, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var29, var33, var17, var19);
            }
            else if (var9 == 8)
            {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
            else if (var9 == 9)
            {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
            else if (var9 == 11)
            {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var33, var15, var21);
                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
            else if (var9 == 13)
            {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                var12.addVertexWithUV(var25, var29, var33, var17, var19);
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var29, var31, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var29, var31, var17, var19);
        }
    }

    public void renderSlopesNorthFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 5 && var9 != 9 && var9 != 13 && var9 != 14)
            {
                if (var9 == 4)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                }
                else if (var9 == 6)
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
                else if (var9 == 7)
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
                else if (var9 == 8)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var31, var17, var21);
                }
                else if (var9 == 10)
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
                else if (var9 == 11)
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
                else if (var9 == 15)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorWest + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorWest + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorWest + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorWest + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorWest + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorWest + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var31, var17, var21);
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
                var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
        }
        else if (var9 != 5 && var9 != 9 && var9 != 13 && var9 != 14)
        {
            if (var9 == 4)
            {
                var12.addVertexWithUV(var33, var27, var31, var17, var19);
                var12.addVertexWithUV(var33, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 == 6)
            {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 == 7)
            {
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 == 8)
            {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var33, var25, var29, var15, var21);
                var12.addVertexWithUV(var33, var25, var31, var17, var21);
            }
            else if (var9 == 10)
            {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 == 11)
            {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
            }
            else if (var9 == 15)
            {
                var12.addVertexWithUV(var33, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var33, var25, var31, var17, var21);
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var27, var31, var17, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var25, var29, var15, var21);
            var12.addVertexWithUV(var23, var25, var31, var17, var21);
        }
    }

    public void renderSlopesSouthFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 4 && var9 != 8 && var9 != 12 && var9 != 15)
            {
                if (var9 == 5)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var15, var19);
                }
                else if (var9 == 6)
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
                else if (var9 == 7)
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
                else if (var9 == 9)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                }
                else if (var9 == 10)
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
                else if (var9 == 11)
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
                else if (var9 == 14)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorEast + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorEast + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorEast + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorEast + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorEast + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorEast + this.factorSouth) / 4.0F);
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
                var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
        }
        else if (var9 != 4 && var9 != 8 && var9 != 12 && var9 != 15)
        {
            if (var9 == 5)
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var33, var27, var31, var15, var19);
            }
            else if (var9 == 6)
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
            else if (var9 == 7)
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
            }
            else if (var9 == 9)
            {
                var12.addVertexWithUV(var33, var25, var31, var15, var21);
                var12.addVertexWithUV(var33, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
            else if (var9 == 10)
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
            else if (var9 == 11)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
            else if (var9 == 14)
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var33, var25, var29, var17, var21);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var25, var31, var15, var21);
            var12.addVertexWithUV(var23, var25, var29, var17, var21);
            var12.addVertexWithUV(var23, var27, var29, var17, var19);
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

        if (props.getInt("BlockKaevWoodSlopes") != 0)
        {
            BlockKaevWoodSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevWoodSlopes"), 4, Material.wood)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5.0F).setBlockName("BlockKaevWoodSlopes");
            ItemKaevWoodSlopes = (new ItemSlopes_Kaevator(BlockKaevWoodSlopes.blockID - 256, "Wood")).setItemName("ItemKaevWoodSlopes");
        }
        else
        {
            BlockKaevWoodSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevCobblestoneSlopes") != 0)
        {
            BlockKaevCobblestoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevCobblestoneSlopes"), 16, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevCobblestoneSlopes");
            ItemKaevCobblestoneSlopes = (new ItemSlopes_Kaevator(BlockKaevCobblestoneSlopes.blockID - 256, "Cobblestone")).setItemName("ItemKaevCobblestoneSlopes");
        }
        else
        {
            BlockKaevCobblestoneSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevGlassSlopes") != 0)
        {
            BlockKaevGlassSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGlassSlopes"), 49, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("BlockKaevGlassSlopes");
            ItemKaevGlassSlopes = (new ItemSlopes_Kaevator(BlockKaevGlassSlopes.blockID - 256, "Glass")).setItemName("ItemKaevGlassSlopes");
        }
        else
        {
            BlockKaevGlassSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevSandstoneSlopes") != 0)
        {
            BlockKaevSandstoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSandstoneSlopes"), 192, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("BlockKaevSandstoneSlopes");
            ItemKaevSandstoneSlopes = (new ItemSlopes_Kaevator(BlockKaevSandstoneSlopes.blockID - 256, "Sandstone")).setItemName("ItemKaevSandstoneSlopes");
        }
        else
        {
            BlockKaevSandstoneSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevDirtSlopes") != 0)
        {
            BlockKaevDirtSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevDirtSlopes"), 2, Material.ground)).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevDirtSlopes");
            ItemKaevDirtSlopes = (new ItemSlopes_Kaevator(BlockKaevDirtSlopes.blockID - 256, "Dirt")).setItemName("ItemKaevDirtSlopes");
        }
        else
        {
            BlockKaevDirtSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevStoneSlopes") != 0)
        {
            BlockKaevStoneSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevStoneSlopes"), 1, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevStoneSlopes");
            ItemKaevStoneSlopes = (new ItemSlopes_Kaevator(BlockKaevStoneSlopes.blockID - 256, "Stone")).setItemName("ItemKaevStoneSlopes");
        }
        else
        {
            BlockKaevStoneSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevSandSlopes") != 0)
        {
            BlockKaevSandSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSandSlopes"), 18, Material.sand)).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("BlockKaevSandSlopes");
            ItemKaevSandSlopes = (new ItemSlopes_Kaevator(BlockKaevSandSlopes.blockID - 256, "Sand")).setItemName("ItemKaevSandSlopes");
        }
        else
        {
            BlockKaevSandSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevSnowSlopes") != 0)
        {
            BlockKaevSnowSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSnowSlopes"), 66, Material.snow)).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSnowSlopes");
            ItemKaevSnowSlopes = (new ItemSlopes_Kaevator(BlockKaevSnowSlopes.blockID - 256, "Snow")).setItemName("ItemKaevSnowSlopes");
        }
        else
        {
            BlockKaevSnowSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevGrassSlopes") != 0)
        {
            BlockKaevGrassSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGrassSlopes"), 3, Material.ground)).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("BlockKaevGrassSlopes");
            ItemKaevGrassSlopes = (new ItemSlopes_Kaevator(BlockKaevGrassSlopes.blockID - 256, "Grass")).setItemName("ItemKaevGrassSlopes");
        }
        else
        {
            BlockKaevGrassSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevBricksSlopes") != 0)
        {
            BlockKaevBricksSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBricksSlopes"), 7, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevBricksSlopes");
            ItemKaevBricksSlopes = (new ItemSlopes_Kaevator(BlockKaevBricksSlopes.blockID - 256, "Bricks")).setItemName("ItemKaevBricksSlopes");
        }
        else
        {
            BlockKaevBricksSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevGravelSlopes") != 0)
        {
            BlockKaevGravelSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGravelSlopes"), 19, Material.sand)).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevGravelSlopes");
            ItemKaevGravelSlopes = (new ItemSlopes_Kaevator(BlockKaevGravelSlopes.blockID - 256, "Gravel")).setItemName("ItemKaevGravelSlopes");
        }
        else
        {
            BlockKaevGravelSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevGoldSlopes") != 0)
        {
            BlockKaevGoldSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGoldSlopes"), 23, Material.iron)).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevGoldSlopes");
            ItemKaevGoldSlopes = (new ItemSlopes_Kaevator(BlockKaevGoldSlopes.blockID - 256, "Gold")).setItemName("ItemKaevGoldSlopes");
        }
        else
        {
            BlockKaevGoldSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevSteelSlopes") != 0)
        {
            BlockKaevSteelSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSteelSlopes"), 22, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevSteelSlopes");
            ItemKaevSteelSlopes = (new ItemSlopes_Kaevator(BlockKaevSteelSlopes.blockID - 256, "Steel")).setItemName("ItemKaevSteelSlopes");
        }
        else
        {
            BlockKaevSteelSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevObsidianSlopes") != 0)
        {
            BlockKaevObsidianSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevObsidianSlopes"), 37, Material.rock)).setHardness(10.0F).setStepSound(Block.soundStoneFootstep).setResistance(2000.0F).setBlockName("BlockKaevObsidianSlopes");
            ItemKaevObsidianSlopes = (new ItemSlopes_Kaevator(BlockKaevObsidianSlopes.blockID - 256, "Obsidian")).setItemName("ItemKaevObsidianSlopes");
        }
        else
        {
            BlockKaevObsidianSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevDiamondSlopes") != 0)
        {
            BlockKaevDiamondSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevDiamondSlopes"), 24, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevDiamondSlopes");
            ItemKaevDiamondSlopes = (new ItemSlopes_Kaevator(BlockKaevDiamondSlopes.blockID - 256, "Diamond")).setItemName("ItemKaevDiamondSlopes");
        }
        else
        {
            BlockKaevDiamondSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevWhiteWoolSlopes") != 0)
        {
            BlockKaevWhiteWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevWhiteWoolSlopes"), 64, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevWhiteWoolSlopes");
            ItemKaevWhiteWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevWhiteWoolSlopes.blockID - 256, "WhiteWool")).setItemName("ItemKaevWhiteWoolSlopes");
        }
        else
        {
            BlockKaevWhiteWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevBlackWoolSlopes") != 0)
        {
            BlockKaevBlackWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBlackWoolSlopes"), 113, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlackWoolSlopes");
            ItemKaevBlackWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBlackWoolSlopes.blockID - 256, "BlackWool")).setItemName("ItemKaevBlackWoolSlopes");
        }
        else
        {
            BlockKaevBlackWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevRedWoolSlopes") != 0)
        {
            BlockKaevRedWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevRedWoolSlopes"), 129, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevRedWoolSlopes");
            ItemKaevRedWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevRedWoolSlopes.blockID - 256, "RedWool")).setItemName("ItemKaevRedWoolSlopes");
        }
        else
        {
            BlockKaevRedWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevGreenWoolSlopes") != 0)
        {
            BlockKaevGreenWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGreenWoolSlopes"), 145, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGreenWoolSlopes");
            ItemKaevGreenWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevGreenWoolSlopes.blockID - 256, "GreenWool")).setItemName("ItemKaevGreenWoolSlopes");
        }
        else
        {
            BlockKaevGreenWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevBrownWoolSlopes") != 0)
        {
            BlockKaevBrownWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBrownWoolSlopes"), 161, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBrownWoolSlopes");
            ItemKaevBrownWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBrownWoolSlopes.blockID - 256, "BrownWool")).setItemName("ItemKaevBrownWoolSlopes");
        }
        else
        {
            BlockKaevBrownWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevBlueWoolSlopes") != 0)
        {
            BlockKaevBlueWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevBlueWoolSlopes"), 177, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlueWoolSlopes");
            ItemKaevBlueWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevBlueWoolSlopes.blockID - 256, "BlueWool")).setItemName("ItemKaevBlueWoolSlopes");
        }
        else
        {
            BlockKaevBlueWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevPurpleWoolSlopes") != 0)
        {
            BlockKaevPurpleWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevPurpleWoolSlopes"), 193, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPurpleWoolSlopes");
            ItemKaevPurpleWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevPurpleWoolSlopes.blockID - 256, "PurpleWool")).setItemName("ItemKaevPurpleWoolSlopes");
        }
        else
        {
            BlockKaevPurpleWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevCyanWoolSlopes") != 0)
        {
            BlockKaevCyanWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevCyanWoolSlopes"), 209, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevCyanWoolSlopes");
            ItemKaevCyanWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevCyanWoolSlopes.blockID - 256, "CyanWool")).setItemName("ItemKaevCyanWoolSlopes");
        }
        else
        {
            BlockKaevCyanWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevSilverWoolSlopes") != 0)
        {
            BlockKaevSilverWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevSilverWoolSlopes"), 225, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSilverWoolSlopes");
            ItemKaevSilverWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevSilverWoolSlopes.blockID - 256, "SilverWool")).setItemName("ItemKaevSilverWoolSlopes");
        }
        else
        {
            BlockKaevSilverWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevGrayWoolSlopes") != 0)
        {
            BlockKaevGrayWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevGrayWoolSlopes"), 114, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGrayWoolSlopes");
            ItemKaevGrayWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevGrayWoolSlopes.blockID - 256, "GrayWool")).setItemName("ItemKaevGrayWoolSlopes");
        }
        else
        {
            BlockKaevGrayWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevPinkWoolSlopes") != 0)
        {
            BlockKaevPinkWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevPinkWoolSlopes"), 130, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPinkWoolSlopes");
            ItemKaevPinkWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevPinkWoolSlopes.blockID - 256, "PinkWool")).setItemName("ItemKaevPinkWoolSlopes");
        }
        else
        {
            BlockKaevPinkWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevLimeWoolSlopes") != 0)
        {
            BlockKaevLimeWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevLimeWoolSlopes"), 146, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLimeWoolSlopes");
            ItemKaevLimeWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevLimeWoolSlopes.blockID - 256, "LimeWool")).setItemName("ItemKaevLimeWoolSlopes");
        }
        else
        {
            BlockKaevLimeWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevYellowWoolSlopes") != 0)
        {
            BlockKaevYellowWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevYellowWoolSlopes"), 162, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevYellowWoolSlopes");
            ItemKaevYellowWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevYellowWoolSlopes.blockID - 256, "YellowWool")).setItemName("ItemKaevYellowWoolSlopes");
        }
        else
        {
            BlockKaevYellowWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevLightBlueWoolSlopes") != 0)
        {
            BlockKaevLightBlueWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevLightBlueWoolSlopes"), 178, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLightBlueWoolSlopes");
            ItemKaevLightBlueWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevLightBlueWoolSlopes.blockID - 256, "LightBlueWool")).setItemName("ItemKaevLightBlueWoolSlopes");
        }
        else
        {
            BlockKaevLightBlueWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevMagentaWoolSlopes") != 0)
        {
            BlockKaevMagentaWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevMagentaWoolSlopes"), 194, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevMagentaWoolSlopes");
            ItemKaevMagentaWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevMagentaWoolSlopes.blockID - 256, "MagentaWool")).setItemName("ItemKaevMagentaWoolSlopes");
        }
        else
        {
            BlockKaevMagentaWoolSlopes = Block.stone;
        }

        if (props.getInt("BlockKaevOrangeWoolSlopes") != 0)
        {
            BlockKaevOrangeWoolSlopes = (new BlockSlopes_Kaevator(props.getInt("BlockKaevOrangeWoolSlopes"), 210, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevOrangeWoolSlopes");
            ItemKaevOrangeWoolSlopes = (new ItemSlopes_Kaevator(BlockKaevOrangeWoolSlopes.blockID - 256, "OrangeWool")).setItemName("ItemKaevOrangeWoolSlopes");
        }
        else
        {
            BlockKaevOrangeWoolSlopes = Block.stone;
        }

        props.save();
    }
}
