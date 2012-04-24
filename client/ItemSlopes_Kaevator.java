package net.minecraft.src;

public class ItemSlopes_Kaevator extends ItemBlock
{
    public static final String[] Kaevator_Materials = new String[] {"StairsUp", "StairsUp", "StairsUp", "StairsUp", "SlopeDown", "SlopeDown", "SlopeDown", "SlopeDown", "SlopeUp", "SlopeUp", "SlopeUp", "SlopeUp", "SlopeSide", "SlopeSide", "SlopeSide", "SlopeSide"};
    private String itemMatName;

    public ItemSlopes_Kaevator(int var1, String var2)
    {
        super(var1);
        this.itemMatName = var2;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int var1)
    {
        return var1;
    }

    public String getItemNameIS(ItemStack var1)
    {
        return "Kaev" + this.itemMatName + "Slopes" + Kaevator_Materials[var1.getItemDamage()];
    }
}
