package VampireBatMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by minecraft on 7/8/14.
 */
public class CookedBatMeat extends ItemFood {

    public CookedBatMeat() {
        super(6, 7, false);
        this.setUnlocalizedName("cookedBatMeat");
        this.setCreativeTab(CreativeTabs.tabFood);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister i) {
        this.itemIcon = i.registerIcon("vampirebatmod:CookedBatMeat");
    }
}

