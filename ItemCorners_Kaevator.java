package net.minecraft.src;

public class ItemCorners_Kaevator extends ItemBlock
{
    public static final String[] Kaevator_Materials = new String[] {"QuadriCornerDown", "QuadriCornerDown", "QuadriCornerDown", "QuadriCornerDown", "QuadriCornerUp", "QuadriCornerUp", "QuadriCornerUp", "QuadriCornerUp", "TriCornerDown", "TriCornerDown", "TriCornerDown", "TriCornerDown", "TriCornerUp", "TriCornerUp", "TriCornerUp", "TriCornerUp"};
    private String itemMatName;

    public ItemCorners_Kaevator(int var1, String var2)
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
