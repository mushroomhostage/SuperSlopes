package net.minecraft.server;

public class ItemIntCorners_Kaevator extends ItemBlock
{
    public static final String[] Kaevator_Materials = new String[] {"TruncCornerDown", "TruncCornerDown", "TruncCornerDown", "TruncCornerDown", "TruncCornerUp", "TruncCornerUp", "TruncCornerUp", "TruncCornerUp", "InvCornerDown", "InvCornerDown", "InvCornerDown", "InvCornerDown", "InvCornerUp", "InvCornerUp", "InvCornerUp", "InvCornerUp"};
    private String itemMatName;

    public ItemIntCorners_Kaevator(int var1, String var2)
    {
        super(var1);
        this.itemMatName = var2;
        this.setMaxDurability(0);
        this.a(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int filterData(int var1)
    {
        return var1;
    }

    public String a(ItemStack var1)
    {
        return "Kaev" + this.itemMatName + "Slopes" + Kaevator_Materials[var1.getData()];
    }
}
