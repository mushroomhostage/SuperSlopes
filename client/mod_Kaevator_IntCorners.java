package net.minecraft.src;

import java.io.File;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class mod_Kaevator_IntCorners extends BaseMod
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
        ModLoader.addLocalization("KaevWoodSlopesTruncCornerDown.name", "wooden oblic slopes");
        ModLoader.addLocalization("KaevWoodSlopesTruncCornerUp.name", "wooden oblic upslope");
        ModLoader.addLocalization("KaevWoodSlopesInvCornerDown.name", "wooden interior corner");
        ModLoader.addLocalization("KaevWoodSlopesInvCornerUp.name", "wooden interior upcorner");
        ModLoader.addLocalization("KaevCobblestoneSlopesTruncCornerDown.name", "cobblestone oblic slopes");
        ModLoader.addLocalization("KaevCobblestoneSlopesTruncCornerUp.name", "cobblestone oblic upslope");
        ModLoader.addLocalization("KaevCobblestoneSlopesInvCornerDown.name", "cobblestone interior corner");
        ModLoader.addLocalization("KaevCobblestoneSlopesInvCornerUp.name", "cobblestone interior upcorner");
        ModLoader.addLocalization("KaevGlassSlopesTruncCornerDown.name", "glass oblic slopes");
        ModLoader.addLocalization("KaevGlassSlopesTruncCornerUp.name", "glass oblic upslope");
        ModLoader.addLocalization("KaevGlassSlopesInvCornerDown.name", "glass interior corner");
        ModLoader.addLocalization("KaevGlassSlopesInvCornerUp.name", "glass interior upcorner");
        ModLoader.addLocalization("KaevSandstoneSlopesTruncCornerDown.name", "sandstone oblic slopes");
        ModLoader.addLocalization("KaevSandstoneSlopesTruncCornerUp.name", "sandstone oblic upslope");
        ModLoader.addLocalization("KaevSandstoneSlopesInvCornerDown.name", "sandstone interior corner");
        ModLoader.addLocalization("KaevSandstoneSlopesInvCornerUp.name", "sandstone interior upcorner");
        ModLoader.addLocalization("KaevDirtSlopesTruncCornerDown.name", "dirt oblic slopes");
        ModLoader.addLocalization("KaevDirtSlopesTruncCornerUp.name", "dirt oblic upslope");
        ModLoader.addLocalization("KaevDirtSlopesInvCornerDown.name", "dirt interior corner");
        ModLoader.addLocalization("KaevDirtSlopesInvCornerUp.name", "dirt interior upcorner");
        ModLoader.addLocalization("KaevStoneSlopesTruncCornerDown.name", "stone oblic slopes");
        ModLoader.addLocalization("KaevStoneSlopesTruncCornerUp.name", "stone oblic upslope");
        ModLoader.addLocalization("KaevStoneSlopesInvCornerDown.name", "stone interior corner");
        ModLoader.addLocalization("KaevStoneSlopesInvCornerUp.name", "stone interior upcorner");
        ModLoader.addLocalization("KaevSandSlopesTruncCornerDown.name", "sand oblic slopes");
        ModLoader.addLocalization("KaevSandSlopesTruncCornerUp.name", "sand oblic upslope");
        ModLoader.addLocalization("KaevSandSlopesInvCornerDown.name", "sand interior corner");
        ModLoader.addLocalization("KaevSandSlopesInvCornerUp.name", "sand interior upcorner");
        ModLoader.addLocalization("KaevSnowSlopesTruncCornerDown.name", "snow oblic slopes");
        ModLoader.addLocalization("KaevSnowSlopesTruncCornerUp.name", "snow oblic upslope");
        ModLoader.addLocalization("KaevSnowSlopesInvCornerDown.name", "snow interior corner");
        ModLoader.addLocalization("KaevSnowSlopesInvCornerUp.name", "snow interior upcorner");
        ModLoader.addLocalization("KaevGrassSlopesTruncCornerDown.name", "grass oblic slopes");
        ModLoader.addLocalization("KaevGrassSlopesTruncCornerUp.name", "grass oblic upslope");
        ModLoader.addLocalization("KaevGrassSlopesInvCornerDown.name", "grass interior corner");
        ModLoader.addLocalization("KaevGrassSlopesInvCornerUp.name", "grass interior upcorner");
        ModLoader.addLocalization("KaevBricksSlopesTruncCornerDown.name", "bricks oblic slopes");
        ModLoader.addLocalization("KaevBricksSlopesTruncCornerUp.name", "bricks oblic upslope");
        ModLoader.addLocalization("KaevBricksSlopesInvCornerDown.name", "bricks interior corner");
        ModLoader.addLocalization("KaevBricksSlopesInvCornerUp.name", "bricks interior upcorner");
        ModLoader.addLocalization("KaevGravelSlopesTruncCornerDown.name", "gravel oblic slopes");
        ModLoader.addLocalization("KaevGravelSlopesTruncCornerUp.name", "gravel oblic upslope");
        ModLoader.addLocalization("KaevGravelSlopesInvCornerDown.name", "gravel interior corner");
        ModLoader.addLocalization("KaevGravelSlopesInvCornerUp.name", "gravel interior upcorner");
        ModLoader.addLocalization("KaevGoldSlopesTruncCornerDown.name", "golden oblic slopes");
        ModLoader.addLocalization("KaevGoldSlopesTruncCornerUp.name", "golden oblic upslope");
        ModLoader.addLocalization("KaevGoldSlopesInvCornerDown.name", "golden interior corner");
        ModLoader.addLocalization("KaevGoldSlopesInvCornerUp.name", "golden interior upcorner");
        ModLoader.addLocalization("KaevSteelSlopesTruncCornerDown.name", "steel oblic slopes");
        ModLoader.addLocalization("KaevSteelSlopesTruncCornerUp.name", "steel oblic upslope");
        ModLoader.addLocalization("KaevSteelSlopesInvCornerDown.name", "steel interior corner");
        ModLoader.addLocalization("KaevSteelSlopesInvCornerUp.name", "steel interior upcorner");
        ModLoader.addLocalization("KaevObsidianSlopesTruncCornerDown.name", "obsidian oblic slopes");
        ModLoader.addLocalization("KaevObsidianSlopesTruncCornerUp.name", "obsidian oblic upslope");
        ModLoader.addLocalization("KaevObsidianSlopesInvCornerDown.name", "obsidian interior corner");
        ModLoader.addLocalization("KaevObsidianSlopesInvCornerUp.name", "obsidian interior upcorner");
        ModLoader.addLocalization("KaevDiamondSlopesTruncCornerDown.name", "diamond oblic slopes");
        ModLoader.addLocalization("KaevDiamondSlopesTruncCornerUp.name", "diamond oblic upslope");
        ModLoader.addLocalization("KaevDiamondSlopesInvCornerDown.name", "diamond interior corner");
        ModLoader.addLocalization("KaevDiamondSlopesInvCornerUp.name", "diamond interior upcorner");
        ModLoader.addLocalization("KaevWhiteWoolSlopesTruncCornerDown.name", "white oblic slopes");
        ModLoader.addLocalization("KaevWhiteWoolSlopesTruncCornerUp.name", "white oblic upslope");
        ModLoader.addLocalization("KaevWhiteWoolSlopesInvCornerDown.name", "white interior corner");
        ModLoader.addLocalization("KaevWhiteWoolSlopesInvCornerUp.name", "white interior upcorner");
        ModLoader.addLocalization("KaevBlackWoolSlopesTruncCornerDown.name", "black oblic slopes");
        ModLoader.addLocalization("KaevBlackWoolSlopesTruncCornerUp.name", "black oblic upslope");
        ModLoader.addLocalization("KaevBlackWoolSlopesInvCornerDown.name", "black interior corner");
        ModLoader.addLocalization("KaevBlackWoolSlopesInvCornerUp.name", "black interior upcorner");
        ModLoader.addLocalization("KaevRedWoolSlopesTruncCornerDown.name", "red oblic slopes");
        ModLoader.addLocalization("KaevRedWoolSlopesTruncCornerUp.name", "red oblic upslope");
        ModLoader.addLocalization("KaevRedWoolSlopesInvCornerDown.name", "red interior corner");
        ModLoader.addLocalization("KaevRedWoolSlopesInvCornerUp.name", "red interior upcorner");
        ModLoader.addLocalization("KaevGreenWoolSlopesTruncCornerDown.name", "green oblic slopes");
        ModLoader.addLocalization("KaevGreenWoolSlopesTruncCornerUp.name", "green oblic upslope");
        ModLoader.addLocalization("KaevGreenWoolSlopesInvCornerDown.name", "green interior corner");
        ModLoader.addLocalization("KaevGreenWoolSlopesInvCornerUp.name", "green interior upcorner");
        ModLoader.addLocalization("KaevBrownWoolSlopesTruncCornerDown.name", "brown oblic slopes");
        ModLoader.addLocalization("KaevBrownWoolSlopesTruncCornerUp.name", "brown oblic upslope");
        ModLoader.addLocalization("KaevBrownWoolSlopesInvCornerDown.name", "brown interior corner");
        ModLoader.addLocalization("KaevBrownWoolSlopesInvCornerUp.name", "brown interior upcorner");
        ModLoader.addLocalization("KaevBlueWoolSlopesTruncCornerDown.name", "blue oblic slopes");
        ModLoader.addLocalization("KaevBlueWoolSlopesTruncCornerUp.name", "blue oblic upslope");
        ModLoader.addLocalization("KaevBlueWoolSlopesInvCornerDown.name", "blue interior corner");
        ModLoader.addLocalization("KaevBlueWoolSlopesInvCornerUp.name", "blue interior upcorner");
        ModLoader.addLocalization("KaevPurpleWoolSlopesTruncCornerDown.name", "purple oblic slopes");
        ModLoader.addLocalization("KaevPurpleWoolSlopesTruncCornerUp.name", "purple oblic upslope");
        ModLoader.addLocalization("KaevPurpleWoolSlopesInvCornerDown.name", "purple interior corner");
        ModLoader.addLocalization("KaevPurpleWoolSlopesInvCornerUp.name", "purple interior upcorner");
        ModLoader.addLocalization("KaevCyanWoolSlopesTruncCornerDown.name", "cyan oblic slopes");
        ModLoader.addLocalization("KaevCyanWoolSlopesTruncCornerUp.name", "cyan oblic upslope");
        ModLoader.addLocalization("KaevCyanWoolSlopesInvCornerDown.name", "cyan interior corner");
        ModLoader.addLocalization("KaevCyanWoolSlopesInvCornerUp.name", "cyan interior upcorner");
        ModLoader.addLocalization("KaevSilverWoolSlopesTruncCornerDown.name", "silver oblic slopes");
        ModLoader.addLocalization("KaevSilverWoolSlopesTruncCornerUp.name", "silver oblic upslope");
        ModLoader.addLocalization("KaevSilverWoolSlopesInvCornerDown.name", "silver interior corner");
        ModLoader.addLocalization("KaevSilverWoolSlopesInvCornerUp.name", "silver interior upcorner");
        ModLoader.addLocalization("KaevGrayWoolSlopesTruncCornerDown.name", "gray oblic slopes");
        ModLoader.addLocalization("KaevGrayWoolSlopesTruncCornerUp.name", "gray oblic upslope");
        ModLoader.addLocalization("KaevGrayWoolSlopesInvCornerDown.name", "gray interior corner");
        ModLoader.addLocalization("KaevGrayWoolSlopesInvCornerUp.name", "gray interior upcorner");
        ModLoader.addLocalization("KaevPinkWoolSlopesTruncCornerDown.name", "pink oblic slopes");
        ModLoader.addLocalization("KaevPinkWoolSlopesTruncCornerUp.name", "pink oblic upslope");
        ModLoader.addLocalization("KaevPinkWoolSlopesInvCornerDown.name", "pink interior corner");
        ModLoader.addLocalization("KaevPinkWoolSlopesInvCornerUp.name", "pink interior upcorner");
        ModLoader.addLocalization("KaevLimeWoolSlopesTruncCornerDown.name", "lime oblic slopes");
        ModLoader.addLocalization("KaevLimeWoolSlopesTruncCornerUp.name", "lime oblic upslope");
        ModLoader.addLocalization("KaevLimeWoolSlopesInvCornerDown.name", "lime interior corner");
        ModLoader.addLocalization("KaevLimeWoolSlopesInvCornerUp.name", "lime interior upcorner");
        ModLoader.addLocalization("KaevYellowWoolSlopesTruncCornerDown.name", "yellow oblic slopes");
        ModLoader.addLocalization("KaevYellowWoolSlopesTruncCornerUp.name", "yellow oblic upslope");
        ModLoader.addLocalization("KaevYellowWoolSlopesInvCornerDown.name", "yellow interior corner");
        ModLoader.addLocalization("KaevYellowWoolSlopesInvCornerUp.name", "yellow interior upcorner");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesTruncCornerDown.name", "lightBlue oblic slopes");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesTruncCornerUp.name", "lightBlue oblic upslope");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesInvCornerDown.name", "lightBlue interior corner");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesInvCornerUp.name", "lightBlue interior upcorner");
        ModLoader.addLocalization("KaevMagentaWoolSlopesTruncCornerDown.name", "magenta oblic slopes");
        ModLoader.addLocalization("KaevMagentaWoolSlopesTruncCornerUp.name", "magenta oblic upslope");
        ModLoader.addLocalization("KaevMagentaWoolSlopesInvCornerDown.name", "magenta interior corner");
        ModLoader.addLocalization("KaevMagentaWoolSlopesInvCornerUp.name", "magenta interior upcorner");
        ModLoader.addLocalization("KaevOrangeWoolSlopesTruncCornerDown.name", "orange oblic slopes");
        ModLoader.addLocalization("KaevOrangeWoolSlopesTruncCornerUp.name", "orange oblic upslope");
        ModLoader.addLocalization("KaevOrangeWoolSlopesInvCornerDown.name", "orange interior corner");
        ModLoader.addLocalization("KaevOrangeWoolSlopesInvCornerUp.name", "orange interior upcorner");

        if (props.getInt("BlockKaevWoodIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.planks});
            ModLoader.addRecipe(new ItemStack(Block.planks, 1), new Object[] {"#", '#', BlockKaevWoodIntCorners});
        }

        if (props.getInt("BlockKaevCobblestoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.cobblestone});
            ModLoader.addRecipe(new ItemStack(Block.cobblestone, 1), new Object[] {"#", '#', BlockKaevCobblestoneIntCorners});
        }

        if (props.getInt("BlockKaevGlassIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.glass});
            ModLoader.addRecipe(new ItemStack(Block.glass, 1), new Object[] {"#", '#', BlockKaevGlassIntCorners});
        }

        if (props.getInt("BlockKaevSandstoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.sandStone});
            ModLoader.addRecipe(new ItemStack(Block.sandStone, 1), new Object[] {"#", '#', BlockKaevSandstoneIntCorners});
        }

        if (props.getInt("BlockKaevDirtIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.dirt});
            ModLoader.addRecipe(new ItemStack(Block.dirt, 1), new Object[] {"#", '#', BlockKaevDirtIntCorners});
        }

        if (props.getInt("BlockKaevStoneIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.stone});
            ModLoader.addRecipe(new ItemStack(Block.stone, 1), new Object[] {"#", '#', BlockKaevStoneIntCorners});
        }

        if (props.getInt("BlockKaevSandIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.sand});
            ModLoader.addRecipe(new ItemStack(Block.sand, 1), new Object[] {"#", '#', BlockKaevSandIntCorners});
        }

        if (props.getInt("BlockKaevSnowIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.blockSnow});
            ModLoader.addRecipe(new ItemStack(Block.blockSnow, 1), new Object[] {"#", '#', BlockKaevSnowIntCorners});
        }

        if (props.getInt("BlockKaevGrassIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.grass});
            ModLoader.addRecipe(new ItemStack(Block.grass, 1), new Object[] {"#", '#', BlockKaevGrassIntCorners});
        }

        if (props.getInt("BlockKaevBricksIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.brick});
            ModLoader.addRecipe(new ItemStack(Block.brick, 1), new Object[] {"#", '#', BlockKaevBricksIntCorners});
        }

        if (props.getInt("BlockKaevGravelIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.gravel});
            ModLoader.addRecipe(new ItemStack(Block.gravel, 1), new Object[] {"#", '#', BlockKaevGravelIntCorners});
        }

        if (props.getInt("BlockKaevGoldIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.blockGold});
            ModLoader.addRecipe(new ItemStack(Block.blockGold, 1), new Object[] {"#", '#', BlockKaevGoldIntCorners});
        }

        if (props.getInt("BlockKaevSteelIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.blockSteel});
            ModLoader.addRecipe(new ItemStack(Block.blockSteel, 1), new Object[] {"#", '#', BlockKaevSteelIntCorners});
        }

        if (props.getInt("BlockKaevObsidianIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.obsidian});
            ModLoader.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {"#", '#', BlockKaevObsidianIntCorners});
        }

        if (props.getInt("BlockKaevDiamondIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.blockDiamond});
            ModLoader.addRecipe(new ItemStack(Block.blockDiamond, 1), new Object[] {"#", '#', BlockKaevDiamondIntCorners});
        }

        if (props.getInt("BlockKaevWhiteWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(0)), new Object[] {"  #", "###", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(4)), new Object[] {"###", "  #", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(8)), new Object[] {"## ", "# #", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.getDyeFromBlock(12)), new Object[] {"# #", "## ", '#', Block.cloth});
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 0), new Object[] {"#", '#', BlockKaevWhiteWoolIntCorners});
        }

        if (props.getInt("BlockKaevBlackWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 15), new Object[] {"#", '#', BlockKaevBlackWoolIntCorners});
        }

        if (props.getInt("BlockKaevRedWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 14), new Object[] {"#", '#', BlockKaevRedWoolIntCorners});
        }

        if (props.getInt("BlockKaevGreenWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 13), new Object[] {"#", '#', BlockKaevGreenWoolIntCorners});
        }

        if (props.getInt("BlockKaevBrownWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 12), new Object[] {"#", '#', BlockKaevBrownWoolIntCorners});
        }

        if (props.getInt("BlockKaevBlueWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 11), new Object[] {"#", '#', BlockKaevBlueWoolIntCorners});
        }

        if (props.getInt("BlockKaevPurpleWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 10), new Object[] {"#", '#', BlockKaevPurpleWoolIntCorners});
        }

        if (props.getInt("BlockKaevCyanWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 9), new Object[] {"#", '#', BlockKaevCyanWoolIntCorners});
        }

        if (props.getInt("BlockKaevSilverWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 8), new Object[] {"#", '#', BlockKaevSilverWoolIntCorners});
        }

        if (props.getInt("BlockKaevGrayWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 7), new Object[] {"#", '#', BlockKaevGrayWoolIntCorners});
        }

        if (props.getInt("BlockKaevPinkWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 6), new Object[] {"#", '#', BlockKaevPinkWoolIntCorners});
        }

        if (props.getInt("BlockKaevLimeWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 5), new Object[] {"#", '#', BlockKaevLimeWoolIntCorners});
        }

        if (props.getInt("BlockKaevYellowWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 4), new Object[] {"#", '#', BlockKaevYellowWoolIntCorners});
        }

        if (props.getInt("BlockKaevLightBlueWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 3), new Object[] {"#", '#', BlockKaevLightBlueWoolIntCorners});
        }

        if (props.getInt("BlockKaevMagentaWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 2), new Object[] {"#", '#', BlockKaevMagentaWoolIntCorners});
        }

        if (props.getInt("BlockKaevOrangeWoolIntCorners") != 0)
        {
            ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 1), new Object[] {"#", '#', BlockKaevOrangeWoolIntCorners});
        }
    }

    private static String getAppdata()
    {
        return Minecraft.getMinecraftDir().getPath();
    }

    public void renderInvBlock(RenderBlocks var1, Block var2, int var3, int var4)
    {
        Tessellator var5 = Tessellator.instance;

        if (var4 == IntCornersRenderID)
        {
            var2.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var5.startDrawingQuads();
            var5.setNormal(0.0F, -1.0F, 0.0F);
            this.renderIntCornersBottomFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(0, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(0.0F, 1.0F, 0.0F);
            this.renderIntCornersTopFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(1, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(0.0F, 0.0F, -1.0F);
            this.renderIntCornersEastFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(2, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(0.0F, 0.0F, 1.0F);
            this.renderIntCornersWestFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(3, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(-1.0F, 0.0F, 0.0F);
            this.renderIntCornersNorthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(4, var3), var3 + 1, var1, 240);
            var5.draw();
            var5.startDrawingQuads();
            var5.setNormal(1.0F, 0.0F, 0.0F);
            this.renderIntCornersSouthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(5, var3), var3 + 1, var1, 240);
            var5.draw();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        }

        var2.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public boolean renderWorldBlock(RenderBlocks var1, IBlockAccess var2, int var3, int var4, int var5, Block var6, int var7)
    {
        return var7 == IntCornersRenderID ? this.renderBlockIntCorners(var6, var3, var4, var5, var1, var2) : false;
    }

    public boolean renderBlockIntCorners(Block var1, int var2, int var3, int var4, RenderBlocks var5, IBlockAccess var6)
    {
        int var7 = var6.getBlockMetadata(var2, var3, var4);
        int var8 = var1.colorMultiplier(var6, var2, var3, var4);
        float var9 = (float)(var8 >> 16 & 255) / 255.0F;
        float var10 = (float)(var8 >> 8 & 255) / 255.0F;
        float var11 = (float)(var8 & 255) / 255.0F;
        return Minecraft.isAmbientOcclusionEnabled() ? this.renderIntCornersBlockWithAmbientOcclusion(var1, var2, var3, var4, var9, var10, var11, var7, var5, var6) : this.renderIntCornersBlockWithColorMultiplier(var1, var2, var3, var4, var9, var10, var11, var7, var5, var6);
    }

    public boolean renderIntCornersBlockWithAmbientOcclusion(Block var1, int var2, int var3, int var4, float var5, float var6, float var7, int var8, RenderBlocks var9, IBlockAccess var10)
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
            this.renderIntCornersBottomFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 + 1, var4, 1))
        {
            this.renderIntCornersTopFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 - 1, 2))
        {
            this.renderIntCornersEastFace(var1, (double)var2, (double)var3, (double)var4, var30, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

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
                this.renderIntCornersEastFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 + 1, 3))
        {
            this.renderIntCornersWestFace(var1, (double)var2, (double)var3, (double)var4, var35, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

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
                this.renderIntCornersWestFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 - 1, var3, var4, 4))
        {
            this.renderIntCornersNorthFace(var1, (double)var2, (double)var3, (double)var4, var40, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

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
                this.renderIntCornersNorthFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 + 1, var3, var4, 5))
        {
            this.renderIntCornersSouthFace(var1, (double)var2, (double)var3, (double)var4, var45, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));

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
                this.renderIntCornersSouthFace(var1, (double)var2, (double)var3, (double)var4, 38, var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var11 = true;
        }

        this.enableAO = false;
        return var11;
    }

    public boolean renderIntCornersBlockWithColorMultiplier(Block var1, int var2, int var3, int var4, float var5, float var6, float var7, int var8, RenderBlocks var9, IBlockAccess var10)
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

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 - 1, var4, 0) || var8 / 4 == 1 || var8 / 4 == 3)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3 - 1, var4);

            if (var8 / 4 == 1 || var8 / 4 == 3)
            {
                var30 = var29;
            }

            var11.setColorOpaque_F(var20 * var30, var23 * var30, var26 * var30);
            this.renderIntCornersBottomFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 + 1, var4, 1) || var8 / 4 == 0 || var8 / 4 == 2)
        {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3 + 1, var4);

            if (var1.maxY != 1.0D && !var1.blockMaterial.isLiquid() || var8 / 4 == 0 || var8 / 4 == 2)
            {
                var30 = var29;
            }

            var11.setColorOpaque_F(var17 * var30, var18 * var30, var19 * var30);
            this.renderIntCornersTopFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
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
            this.renderIntCornersEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 2), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
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
            this.renderIntCornersWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 3), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
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
            this.renderIntCornersNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 4), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
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
            this.renderIntCornersSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 5), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        return var12;
    }

    public void renderIntCornersBottomFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 / 4 != 0 && var9 / 4 != 2)
            {
                if (var9 == 4)
                {
                    var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                }
                else if (var9 == 5)
                {
                    var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                }
                else if (var9 == 6)
                {
                    var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                }
                else if (var9 == 7)
                {
                    var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
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
        else if (var9 / 4 != 0 && var9 / 4 != 2)
        {
            if (var9 == 4)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 5)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 6)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 7)
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

    public void renderIntCornersTopFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 / 4 != 1 && var9 / 4 != 3)
            {
                if (var9 == 0)
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
                else if (var9 == 1)
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
                else if (var9 == 2)
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
                else if (var9 == 3)
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
        else if (var9 / 4 != 1 && var9 / 4 != 3)
        {
            if (var9 == 0)
            {
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 1)
            {
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 2)
            {
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 3)
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

    public void renderIntCornersEastFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 2 && var9 != 10)
            {
                if (var9 != 0 && var9 != 8)
                {
                    if (var9 != 6 && var9 != 14)
                    {
                        if (var9 != 4 && var9 != 12)
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

                            if (var9 == 4)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var33, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var23, var29, var31, (var15 + var17) / 2.0D, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorEast + this.factorNorth) / 3.0F);
                                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                            }

                            if (var9 == 12)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                                var12.addVertexWithUV(var23, var27, var33, var15, var21);
                            }
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

                        if (var9 == 14)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var33, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var33, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                            var12.addVertexWithUV(var25, var29, var31, var17, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                        }
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

                    if (var9 == 0)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegZNeg * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F);
                        var12.addVertexWithUV(var23, var27, var31, (var15 + var17) / 2.0D, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorEast + this.factorNorth) / 3.0F);
                        var12.addVertexWithUV(var23, var29, var33, var17, var19);
                    }

                    if (var9 == 8)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F);
                        var12.addVertexWithUV(var25, var29, var33, var17, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F);
                        var12.addVertexWithUV(var25, var29, var33, var17, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                        var12.addVertexWithUV(var23, var27, var31, var15, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F);
                        var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    }
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

                if (var9 == 10)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                }
            }
        }
        else if (var9 != 2 && var9 != 10)
        {
            if (var9 != 0 && var9 != 8)
            {
                if (var9 != 6 && var9 != 14)
                {
                    if (var9 != 4 && var9 != 12)
                    {
                        var12.addVertexWithUV(var23, var29, var31, var17, var19);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.addVertexWithUV(var25, var27, var31, var15, var21);
                        var12.addVertexWithUV(var23, var27, var31, var17, var21);
                    }
                    else
                    {
                        var12.addVertexWithUV(var23, var29, var31, var17, var19);
                        var12.addVertexWithUV(var25, var29, var31, var15, var19);
                        var12.addVertexWithUV(var25, var27, var31, var15, var21);
                        var12.addVertexWithUV(var25, var27, var31, var15, var21);

                        if (var9 == 4)
                        {
                            var12.addVertexWithUV(var23, var27, var33, var17, var21);
                            var12.addVertexWithUV(var23, var29, var31, (var15 + var17) / 2.0D, var19);
                            var12.addVertexWithUV(var25, var27, var31, var15, var21);
                            var12.addVertexWithUV(var25, var27, var31, var15, var21);
                        }

                        if (var9 == 12)
                        {
                            var12.addVertexWithUV(var23, var29, var31, var15, var19);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                            var12.addVertexWithUV(var23, var27, var33, var15, var21);
                        }
                    }
                }
                else
                {
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);

                    if (var9 == 14)
                    {
                        var12.addVertexWithUV(var23, var27, var33, var15, var21);
                        var12.addVertexWithUV(var23, var27, var33, var15, var21);
                        var12.addVertexWithUV(var25, var29, var31, var17, var19);
                        var12.addVertexWithUV(var25, var27, var33, var17, var21);
                    }
                }
            }
            else
            {
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);

                if (var9 == 0)
                {
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.addVertexWithUV(var23, var27, var31, (var15 + var17) / 2.0D, var21);
                    var12.addVertexWithUV(var23, var29, var33, var17, var19);
                }

                if (var9 == 8)
                {
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                }
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var29, var31, var17, var19);
            var12.addVertexWithUV(var23, var29, var31, var17, var19);
            var12.addVertexWithUV(var25, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var31, var17, var21);

            if (var9 == 10)
            {
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var23, var29, var33, var15, var19);
                var12.addVertexWithUV(var23, var29, var33, var15, var19);
                var12.addVertexWithUV(var25, var29, var33, var17, var19);
            }
        }
    }

    public void renderIntCornersWestFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 3 && var9 != 11)
            {
                if (var9 != 1 && var9 != 9)
                {
                    if (var9 != 7 && var9 != 15)
                    {
                        if (var9 != 5 && var9 != 13)
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

                            if (var9 == 5)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNegZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNegZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNegZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosYNeg * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosZPos * (this.factorBottom + this.factorWest + this.factorSouth) / 3.0F);
                                var12.addVertexWithUV(var25, var29, var31, (var15 + var17) / 2.0D, var19);
                            }

                            if (var9 == 13)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                                var12.addVertexWithUV(var23, var27, var33, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                                var12.addVertexWithUV(var25, var29, var31, var17, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                                var12.addVertexWithUV(var23, var27, var33, var15, var21);
                            }
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

                        if (var9 == 15)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                            var12.addVertexWithUV(var23, var29, var31, var15, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var33, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                        }
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

                    if (var9 == 1)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F);
                        var12.addVertexWithUV(var25, var27, var31, (var15 + var17) / 2.0D, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosYPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F);
                        var12.addVertexWithUV(var25, var29, var33, var17, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F);
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorWest + this.factorSouth) / 3.0F);
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    }

                    if (var9 == 9)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F);
                        var12.addVertexWithUV(var25, var27, var31, var17, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F);
                        var12.addVertexWithUV(var25, var29, var33, var17, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F);
                        var12.addVertexWithUV(var23, var29, var33, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F);
                        var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    }
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

                if (var9 == 11)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                }
            }
        }
        else if (var9 != 3 && var9 != 11)
        {
            if (var9 != 1 && var9 != 9)
            {
                if (var9 != 7 && var9 != 15)
                {
                    if (var9 != 5 && var9 != 13)
                    {
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                        var12.addVertexWithUV(var23, var27, var31, var15, var21);
                        var12.addVertexWithUV(var25, var27, var31, var17, var21);
                        var12.addVertexWithUV(var25, var29, var31, var17, var19);
                    }
                    else
                    {
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                        var12.addVertexWithUV(var23, var27, var31, var15, var21);
                        var12.addVertexWithUV(var23, var27, var31, var15, var21);
                        var12.addVertexWithUV(var25, var29, var31, var17, var19);

                        if (var9 == 5)
                        {
                            var12.addVertexWithUV(var23, var27, var31, var15, var21);
                            var12.addVertexWithUV(var23, var27, var31, var15, var21);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                            var12.addVertexWithUV(var25, var29, var31, (var15 + var17) / 2.0D, var19);
                        }

                        if (var9 == 13)
                        {
                            var12.addVertexWithUV(var23, var27, var33, var15, var21);
                            var12.addVertexWithUV(var25, var27, var33, var17, var21);
                            var12.addVertexWithUV(var25, var29, var31, var17, var19);
                            var12.addVertexWithUV(var23, var27, var33, var15, var21);
                        }
                    }
                }
                else
                {
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.addVertexWithUV(var25, var29, var31, var17, var19);

                    if (var9 == 15)
                    {
                        var12.addVertexWithUV(var23, var29, var31, var15, var19);
                        var12.addVertexWithUV(var23, var27, var33, var15, var21);
                        var12.addVertexWithUV(var25, var27, var33, var17, var21);
                        var12.addVertexWithUV(var25, var27, var33, var17, var21);
                    }
                }
            }
            else
            {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var23, var29, var31, var15, var19);

                if (var9 == 1)
                {
                    var12.addVertexWithUV(var25, var27, var31, (var15 + var17) / 2.0D, var21);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                }

                if (var9 == 9)
                {
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                }
            }
        }
        else
        {
            var12.addVertexWithUV(var25, var29, var31, var17, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var29, var31, var17, var19);

            if (var9 == 11)
            {
                var12.addVertexWithUV(var25, var29, var33, var17, var19);
                var12.addVertexWithUV(var23, var29, var33, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var29, var33, var17, var19);
            }
        }
    }

    public void renderIntCornersNorthFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 3 && var9 != 11)
            {
                if (var9 != 0 && var9 != 8)
                {
                    if (var9 != 7 && var9 != 15)
                    {
                        if (var9 != 4 && var9 != 12)
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

                            if (var9 == 12)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                                var12.addVertexWithUV(var33, var25, var29, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                                var12.addVertexWithUV(var33, var25, var31, var17, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                                var12.addVertexWithUV(var33, var25, var31, var17, var21);
                            }
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

                        if (var9 == 7)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegZPos * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegZPos * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegZPos * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F);
                            var12.addVertexWithUV(var23, var27, var31, (var15 + var17) / 2.0D, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F);
                            var12.addVertexWithUV(var23, var25, var29, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegYNeg * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F);
                            var12.addVertexWithUV(var23, var25, var29, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNegZPos * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNegZPos * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNegZPos * (this.factorBottom + this.factorNorth + this.factorWest) / 3.0F);
                            var12.addVertexWithUV(var33, var25, var31, var17, var21);
                        }

                        if (var9 == 15)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var31, var15, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var29, var17, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var29, var17, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var31, var15, var21);
                        }
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

                    if (var9 == 8)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var33, var27, var31, var17, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var33, var27, var29, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var23, var25, var29, var15, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                        var12.addVertexWithUV(var33, var27, var31, var17, var19);
                    }
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

                if (var9 == 3)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPosZPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F);
                    var12.addVertexWithUV(var33, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegYPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXNegZPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F, this.colorGreenSlopes * this.aoLightValueXNegZPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F, this.colorBlueSlopes * this.aoLightValueXNegZPos * (this.factorTop + this.factorNorth + this.factorWest) / 3.0F);
                    var12.addVertexWithUV(var23, var25, var31, (var15 + var17) / 2.0D, var21);
                }

                if (var9 == 11)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var15, var19);
                }
            }
        }
        else if (var9 != 3 && var9 != 11)
        {
            if (var9 != 0 && var9 != 8)
            {
                if (var9 != 7 && var9 != 15)
                {
                    if (var9 != 4 && var9 != 12)
                    {
                        var12.addVertexWithUV(var23, var27, var31, var17, var19);
                        var12.addVertexWithUV(var23, var27, var29, var15, var19);
                        var12.addVertexWithUV(var23, var25, var29, var15, var21);
                        var12.addVertexWithUV(var23, var25, var31, var17, var21);
                    }
                    else
                    {
                        var12.addVertexWithUV(var23, var27, var31, var17, var19);
                        var12.addVertexWithUV(var23, var27, var29, var15, var19);
                        var12.addVertexWithUV(var23, var25, var31, var17, var21);
                        var12.addVertexWithUV(var23, var25, var31, var17, var21);

                        if (var9 == 12)
                        {
                            var12.addVertexWithUV(var23, var27, var29, var15, var19);
                            var12.addVertexWithUV(var33, var25, var29, var15, var21);
                            var12.addVertexWithUV(var33, var25, var31, var17, var21);
                            var12.addVertexWithUV(var33, var25, var31, var17, var21);
                        }
                    }
                }
                else
                {
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);

                    if (var9 == 7)
                    {
                        var12.addVertexWithUV(var23, var27, var31, (var15 + var17) / 2.0D, var19);
                        var12.addVertexWithUV(var23, var25, var29, var15, var21);
                        var12.addVertexWithUV(var23, var25, var29, var15, var21);
                        var12.addVertexWithUV(var33, var25, var31, var17, var21);
                    }

                    if (var9 == 15)
                    {
                        var12.addVertexWithUV(var23, var27, var31, var15, var19);
                        var12.addVertexWithUV(var33, var25, var29, var17, var21);
                        var12.addVertexWithUV(var33, var25, var29, var17, var21);
                        var12.addVertexWithUV(var33, var25, var31, var15, var21);
                    }
                }
            }
            else
            {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);

                if (var9 == 8)
                {
                    var12.addVertexWithUV(var33, var27, var31, var17, var19);
                    var12.addVertexWithUV(var33, var27, var29, var15, var19);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.addVertexWithUV(var33, var27, var31, var17, var19);
                }
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var25, var29, var15, var21);
            var12.addVertexWithUV(var23, var25, var31, var17, var21);

            if (var9 == 3)
            {
                var12.addVertexWithUV(var33, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var31, (var15 + var17) / 2.0D, var21);
            }

            if (var9 == 11)
            {
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var33, var27, var31, var15, var19);
            }
        }
    }

    public void renderIntCornersSouthFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11)
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
            if (var9 != 2 && var9 != 10)
            {
                if (var9 != 1 && var9 != 9)
                {
                    if (var9 != 6 && var9 != 14)
                    {
                        if (var9 != 5 && var9 != 13)
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

                            if (var9 == 13)
                            {
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                                var12.addVertexWithUV(var33, var25, var29, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                                var12.addVertexWithUV(var33, var25, var29, var15, var21);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                                var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                                var12.addVertexWithUV(var33, var25, var31, var17, var21);
                            }
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

                        if (var9 == 6)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosYNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F);
                            var12.addVertexWithUV(var23, var25, var31, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYNegZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F);
                            var12.addVertexWithUV(var33, var25, var29, var17, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F);
                            var12.addVertexWithUV(var23, var27, var29, (var15 + var17) / 2.0D, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosZNeg * (this.factorBottom + this.factorSouth + this.factorEast) / 3.0F);
                            var12.addVertexWithUV(var23, var25, var31, var15, var21);
                        }

                        if (var9 == 14)
                        {
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var31, var15, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var29, var17, var21);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var23, var27, var29, var17, var19);
                            var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                            var12.addVertexWithUV(var33, var25, var31, var15, var21);
                        }
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

                    if (var9 == 9)
                    {
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                        var12.addVertexWithUV(var23, var25, var31, var17, var21);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                        var12.addVertexWithUV(var33, var27, var29, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                        var12.addVertexWithUV(var33, var27, var29, var15, var19);
                        var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                        var12.addVertexWithUV(var33, var27, var31, var17, var19);
                    }
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

                if (var9 == 2)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosYPos * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueXPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueXPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueXPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F);
                    var12.addVertexWithUV(var23, var25, var29, (var15 + var17) / 2.0D, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorGreenSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F, this.colorBlueSlopes * this.aoLightValueYPosZNeg * (this.factorTop + this.factorSouth + this.factorEast) / 3.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                }

                if (var9 == 10)
                {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var15, var19);
                }
            }
        }
        else if (var9 != 2 && var9 != 10)
        {
            if (var9 != 1 && var9 != 9)
            {
                if (var9 != 6 && var9 != 14)
                {
                    if (var9 != 5 && var9 != 13)
                    {
                        var12.addVertexWithUV(var23, var25, var31, var15, var21);
                        var12.addVertexWithUV(var23, var25, var29, var17, var21);
                        var12.addVertexWithUV(var23, var27, var29, var17, var19);
                        var12.addVertexWithUV(var23, var27, var31, var15, var19);
                    }
                    else
                    {
                        var12.addVertexWithUV(var23, var25, var29, var17, var21);
                        var12.addVertexWithUV(var23, var25, var29, var17, var21);
                        var12.addVertexWithUV(var23, var27, var29, var17, var19);
                        var12.addVertexWithUV(var23, var27, var31, var15, var19);

                        if (var9 == 13)
                        {
                            var12.addVertexWithUV(var33, var25, var29, var15, var21);
                            var12.addVertexWithUV(var33, var25, var29, var15, var21);
                            var12.addVertexWithUV(var23, var27, var31, var17, var19);
                            var12.addVertexWithUV(var33, var25, var31, var17, var21);
                        }
                    }
                }
                else
                {
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);

                    if (var9 == 6)
                    {
                        var12.addVertexWithUV(var23, var25, var31, var15, var21);
                        var12.addVertexWithUV(var33, var25, var29, var17, var21);
                        var12.addVertexWithUV(var23, var27, var29, (var15 + var17) / 2.0D, var19);
                        var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    }

                    if (var9 == 14)
                    {
                        var12.addVertexWithUV(var33, var25, var31, var15, var21);
                        var12.addVertexWithUV(var33, var25, var29, var17, var21);
                        var12.addVertexWithUV(var23, var27, var29, var17, var19);
                        var12.addVertexWithUV(var33, var25, var31, var15, var21);
                    }
                }
            }
            else
            {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);

                if (var9 == 9)
                {
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                    var12.addVertexWithUV(var33, var27, var29, var15, var19);
                    var12.addVertexWithUV(var33, var27, var29, var15, var19);
                    var12.addVertexWithUV(var33, var27, var31, var17, var19);
                }
            }
        }
        else
        {
            var12.addVertexWithUV(var23, var25, var31, var15, var21);
            var12.addVertexWithUV(var23, var25, var29, var17, var21);
            var12.addVertexWithUV(var23, var27, var31, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var19);

            if (var9 == 2)
            {
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, (var15 + var17) / 2.0D, var21);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }

            if (var9 == 10)
            {
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var33, var27, var31, var15, var19);
                var12.addVertexWithUV(var33, var27, var31, var15, var19);
            }
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

        if (props.getInt("BlockKaevWoodIntCorners") != 0)
        {
            BlockKaevWoodIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevWoodIntCorners"), 4, Material.wood)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5.0F).setBlockName("BlockKaevWoodIntCorners");
            ItemKaevWoodIntCorners = (new ItemIntCorners_Kaevator(BlockKaevWoodIntCorners.blockID - 256, "Wood")).setItemName("ItemKaevWoodIntCorners");
        }
        else
        {
            BlockKaevWoodIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevCobblestoneIntCorners") != 0)
        {
            BlockKaevCobblestoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevCobblestoneIntCorners"), 16, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevCobblestoneIntCorners");
            ItemKaevCobblestoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevCobblestoneIntCorners.blockID - 256, "Cobblestone")).setItemName("ItemKaevCobblestoneIntCorners");
        }
        else
        {
            BlockKaevCobblestoneIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGlassIntCorners") != 0)
        {
            BlockKaevGlassIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGlassIntCorners"), 49, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("BlockKaevGlassIntCorners");
            ItemKaevGlassIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGlassIntCorners.blockID - 256, "Glass")).setItemName("ItemKaevGlassIntCorners");
        }
        else
        {
            BlockKaevGlassIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSandstoneIntCorners") != 0)
        {
            BlockKaevSandstoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSandstoneIntCorners"), 192, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("BlockKaevSandstoneIntCorners");
            ItemKaevSandstoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSandstoneIntCorners.blockID - 256, "Sandstone")).setItemName("ItemKaevSandstoneIntCorners");
        }
        else
        {
            BlockKaevSandstoneIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevDirtIntCorners") != 0)
        {
            BlockKaevDirtIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevDirtIntCorners"), 2, Material.ground)).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevDirtIntCorners");
            ItemKaevDirtIntCorners = (new ItemIntCorners_Kaevator(BlockKaevDirtIntCorners.blockID - 256, "Dirt")).setItemName("ItemKaevDirtIntCorners");
        }
        else
        {
            BlockKaevDirtIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevStoneIntCorners") != 0)
        {
            BlockKaevStoneIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevStoneIntCorners"), 1, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevStoneIntCorners");
            ItemKaevStoneIntCorners = (new ItemIntCorners_Kaevator(BlockKaevStoneIntCorners.blockID - 256, "Stone")).setItemName("ItemKaevStoneIntCorners");
        }
        else
        {
            BlockKaevStoneIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSandIntCorners") != 0)
        {
            BlockKaevSandIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSandIntCorners"), 18, Material.sand)).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("BlockKaevSandIntCorners");
            ItemKaevSandIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSandIntCorners.blockID - 256, "Sand")).setItemName("ItemKaevSandIntCorners");
        }
        else
        {
            BlockKaevSandIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSnowIntCorners") != 0)
        {
            BlockKaevSnowIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSnowIntCorners"), 66, Material.snow)).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSnowIntCorners");
            ItemKaevSnowIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSnowIntCorners.blockID - 256, "Snow")).setItemName("ItemKaevSnowIntCorners");
        }
        else
        {
            BlockKaevSnowIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGrassIntCorners") != 0)
        {
            BlockKaevGrassIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGrassIntCorners"), 3, Material.ground)).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("BlockKaevGrassIntCorners");
            ItemKaevGrassIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGrassIntCorners.blockID - 256, "Grass")).setItemName("ItemKaevGrassIntCorners");
        }
        else
        {
            BlockKaevGrassIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevBricksIntCorners") != 0)
        {
            BlockKaevBricksIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBricksIntCorners"), 7, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BlockKaevBricksIntCorners");
            ItemKaevBricksIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBricksIntCorners.blockID - 256, "Bricks")).setItemName("ItemKaevBricksIntCorners");
        }
        else
        {
            BlockKaevBricksIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGravelIntCorners") != 0)
        {
            BlockKaevGravelIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGravelIntCorners"), 19, Material.sand)).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevGravelIntCorners");
            ItemKaevGravelIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGravelIntCorners.blockID - 256, "Gravel")).setItemName("ItemKaevGravelIntCorners");
        }
        else
        {
            BlockKaevGravelIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGoldIntCorners") != 0)
        {
            BlockKaevGoldIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGoldIntCorners"), 23, Material.iron)).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevGoldIntCorners");
            ItemKaevGoldIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGoldIntCorners.blockID - 256, "Gold")).setItemName("ItemKaevGoldIntCorners");
        }
        else
        {
            BlockKaevGoldIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSteelIntCorners") != 0)
        {
            BlockKaevSteelIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSteelIntCorners"), 22, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevSteelIntCorners");
            ItemKaevSteelIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSteelIntCorners.blockID - 256, "Steel")).setItemName("ItemKaevSteelIntCorners");
        }
        else
        {
            BlockKaevSteelIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevObsidianIntCorners") != 0)
        {
            BlockKaevObsidianIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevObsidianIntCorners"), 37, Material.rock)).setHardness(10.0F).setStepSound(Block.soundStoneFootstep).setResistance(2000.0F).setBlockName("BlockKaevObsidianIntCorners");
            ItemKaevObsidianIntCorners = (new ItemIntCorners_Kaevator(BlockKaevObsidianIntCorners.blockID - 256, "Obsidian")).setItemName("ItemKaevObsidianIntCorners");
        }
        else
        {
            BlockKaevObsidianIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevDiamondIntCorners") != 0)
        {
            BlockKaevDiamondIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevDiamondIntCorners"), 24, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("BlockKaevDiamondIntCorners");
            ItemKaevDiamondIntCorners = (new ItemIntCorners_Kaevator(BlockKaevDiamondIntCorners.blockID - 256, "Diamond")).setItemName("ItemKaevDiamondIntCorners");
        }
        else
        {
            BlockKaevDiamondIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevWhiteWoolIntCorners") != 0)
        {
            BlockKaevWhiteWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevWhiteWoolIntCorners", 212), 64, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevWhiteWoolIntCorners");
            ItemKaevWhiteWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevWhiteWoolIntCorners.blockID - 256, "WhiteWool")).setItemName("ItemKaevWhiteWoolIntCorners");
        }
        else
        {
            BlockKaevWhiteWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevBlackWoolIntCorners") != 0)
        {
            BlockKaevBlackWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBlackWoolIntCorners", 213), 113, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlackWoolIntCorners");
            ItemKaevBlackWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBlackWoolIntCorners.blockID - 256, "BlackWool")).setItemName("ItemKaevBlackWoolIntCorners");
        }
        else
        {
            BlockKaevBlackWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevRedWoolIntCorners") != 0)
        {
            BlockKaevRedWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevRedWoolIntCorners", 214), 129, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevRedWoolIntCorners");
            ItemKaevRedWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevRedWoolIntCorners.blockID - 256, "RedWool")).setItemName("ItemKaevRedWoolIntCorners");
        }
        else
        {
            BlockKaevRedWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGreenWoolIntCorners") != 0)
        {
            BlockKaevGreenWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGreenWoolIntCorners", 215), 145, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGreenWoolIntCorners");
            ItemKaevGreenWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGreenWoolIntCorners.blockID - 256, "GreenWool")).setItemName("ItemKaevGreenWoolIntCorners");
        }
        else
        {
            BlockKaevGreenWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevBrownWoolIntCorners") != 0)
        {
            BlockKaevBrownWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBrownWoolIntCorners", 216), 161, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBrownWoolIntCorners");
            ItemKaevBrownWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBrownWoolIntCorners.blockID - 256, "BrownWool")).setItemName("ItemKaevBrownWoolIntCorners");
        }
        else
        {
            BlockKaevBrownWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevBlueWoolIntCorners") != 0)
        {
            BlockKaevBlueWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevBlueWoolIntCorners", 217), 177, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlueWoolIntCorners");
            ItemKaevBlueWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevBlueWoolIntCorners.blockID - 256, "BlueWool")).setItemName("ItemKaevBlueWoolIntCorners");
        }
        else
        {
            BlockKaevBlueWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevPurpleWoolIntCorners") != 0)
        {
            BlockKaevPurpleWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevPurpleWoolIntCorners", 218), 193, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPurpleWoolIntCorners");
            ItemKaevPurpleWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevPurpleWoolIntCorners.blockID - 256, "PurpleWool")).setItemName("ItemKaevPurpleWoolIntCorners");
        }
        else
        {
            BlockKaevPurpleWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevCyanWoolIntCorners") != 0)
        {
            BlockKaevCyanWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevCyanWoolIntCorners", 219), 209, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevCyanWoolIntCorners");
            ItemKaevCyanWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevCyanWoolIntCorners.blockID - 256, "CyanWool")).setItemName("ItemKaevCyanWoolIntCorners");
        }
        else
        {
            BlockKaevCyanWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevSilverWoolIntCorners") != 0)
        {
            BlockKaevSilverWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevSilverWoolIntCorners", 220), 225, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSilverWoolIntCorners");
            ItemKaevSilverWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevSilverWoolIntCorners.blockID - 256, "SilverWool")).setItemName("ItemKaevSilverWoolIntCorners");
        }
        else
        {
            BlockKaevSilverWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevGrayWoolIntCorners") != 0)
        {
            BlockKaevGrayWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevGrayWoolIntCorners", 221), 114, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGrayWoolIntCorners");
            ItemKaevGrayWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevGrayWoolIntCorners.blockID - 256, "GrayWool")).setItemName("ItemKaevGrayWoolIntCorners");
        }
        else
        {
            BlockKaevGrayWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevPinkWoolIntCorners") != 0)
        {
            BlockKaevPinkWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevPinkWoolIntCorners", 222), 130, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPinkWoolIntCorners");
            ItemKaevPinkWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevPinkWoolIntCorners.blockID - 256, "PinkWool")).setItemName("ItemKaevPinkWoolIntCorners");
        }
        else
        {
            BlockKaevPinkWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevLimeWoolIntCorners") != 0)
        {
            BlockKaevLimeWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevLimeWoolIntCorners", 223), 146, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLimeWoolIntCorners");
            ItemKaevLimeWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevLimeWoolIntCorners.blockID - 256, "LimeWool")).setItemName("ItemKaevLimeWoolIntCorners");
        }
        else
        {
            BlockKaevLimeWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevYellowWoolIntCorners") != 0)
        {
            BlockKaevYellowWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevYellowWoolIntCorners", 224), 162, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevYellowWoolIntCorners");
            ItemKaevYellowWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevYellowWoolIntCorners.blockID - 256, "YellowWool")).setItemName("ItemKaevYellowWoolIntCorners");
        }
        else
        {
            BlockKaevYellowWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevLightBlueWoolIntCorners") != 0)
        {
            BlockKaevLightBlueWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevLightBlueWoolIntCorners", 225), 178, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLightBlueWoolIntCorners");
            ItemKaevLightBlueWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevLightBlueWoolIntCorners.blockID - 256, "LightBlueWool")).setItemName("ItemKaevLightBlueWoolIntCorners");
        }
        else
        {
            BlockKaevLightBlueWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevMagentaWoolIntCorners") != 0)
        {
            BlockKaevMagentaWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevMagentaWoolIntCorners", 226), 194, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevMagentaWoolIntCorners");
            ItemKaevMagentaWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevMagentaWoolIntCorners.blockID - 256, "MagentaWool")).setItemName("ItemKaevMagentaWoolIntCorners");
        }
        else
        {
            BlockKaevMagentaWoolIntCorners = Block.stone;
        }

        if (props.getInt("BlockKaevOrangeWoolIntCorners") != 0)
        {
            BlockKaevOrangeWoolIntCorners = (new BlockIntCorners_Kaevator(props.getInt("BlockKaevOrangeWoolIntCorners", 227), 210, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevOrangeWoolIntCorners");
            ItemKaevOrangeWoolIntCorners = (new ItemIntCorners_Kaevator(BlockKaevOrangeWoolIntCorners.blockID - 256, "OrangeWool")).setItemName("ItemKaevOrangeWoolIntCorners");
        }
        else
        {
            BlockKaevOrangeWoolIntCorners = Block.stone;
        }

        props.save();
    }
}
