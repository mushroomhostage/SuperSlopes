// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemSlopes_Kaevator.java


public class ItemSlopes_Kaevator extends dd
{

    public ItemSlopes_Kaevator(int i, String pItemMatName)
    {
        super(i);
        itemMatName = pItemMatName;
        f(0);
        a(true);
    }

    public int a(int i)
    {
        return i;
    }

    public String a(kp itemstack)
    {
        return (new StringBuilder()).append("Kaev").append(itemMatName).append("Slopes").append(Kaevator_Materials[itemstack.h()]).toString();
    }

    public static final String Kaevator_Materials[] = {
        "StairsUp", "StairsUp", "StairsUp", "StairsUp", "SlopeDown", "SlopeDown", "SlopeDown", "SlopeDown", "SlopeUp", "SlopeUp", 
        "SlopeUp", "SlopeUp", "SlopeSide", "SlopeSide", "SlopeSide", "SlopeSide"
    };
    private String itemMatName;

}
