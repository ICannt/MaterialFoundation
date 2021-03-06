package org.icannt.materialfoundation.item;

import org.icannt.materialfoundation.gui.MFCreativeTab;
import org.icannt.materialfoundation.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class ItemMFBlockFabricator extends Item
{
	private String type = "tool";
	private String name = "MF_Block_Fabricator";
	
	public ItemMFBlockFabricator()
	{
		this.setUnlocalizedName(Constants.MODID + "." + type + "." + name.toLowerCase());
		this.setTextureName(Constants.MODID + ":" + type + "/" + name);
		this.setCreativeTab(MFCreativeTab.mfCreativeTab);
		this.setMaxStackSize(1);
		//this.setMaxDamage(10 - 1);
		//this.setNoRepair();
	}
	
	@Override 
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
	{		
		return false;     
    }
	
	@Override
    public Item setContainerItem(Item item)
    {
        return this;
    }

	@Override
	public boolean hasContainerItem(ItemStack itemStack)
	{
		return true;
	}
	
	@Override
    public boolean isDamageable()
    {
        return false;
    }
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		//itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		return itemStack;
	}
	
}
