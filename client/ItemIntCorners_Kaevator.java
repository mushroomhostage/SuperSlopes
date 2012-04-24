package net.minecraft.src;

public class ItemIntCorners_Kaevator extends ItemBlock
{
    public static final String[] Kaevator_Materials = new String[] {"TruncCornerDown", "TruncCornerDown", "TruncCornerDown", "TruncCornerDown", "TruncCornerUp", "TruncCornerUp", "TruncCornerUp", "TruncCornerUp", "InvCornerDown", "InvCornerDown", "InvCornerDown", "InvCornerDown", "InvCornerUp", "InvCornerUp", "InvCornerUp", "InvCornerUp"};
    private String itemMatName;

    public ItemIntCorners_Kaevator(int var1, String var2)
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
