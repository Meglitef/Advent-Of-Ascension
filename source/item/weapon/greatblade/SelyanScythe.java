package net.tslat.aoa3.item.weapon.greatblade;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.item.weapon.AdventWeapon;
import net.tslat.aoa3.item.weapon.LongReachWeapon;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ItemUtil;
import net.tslat.aoa3.utils.player.PlayerUtil;

import java.util.List;

public class SelyanScythe extends BaseGreatblade implements AdventWeapon, LongReachWeapon {
	public SelyanScythe(double dmg, double speed, int durability) {
		super(dmg, speed, durability);
		setTranslationKey("SelyanScythe");
		setRegistryName("aoa3:selyan_scythe");
	}

	@Override
	protected void doMeleeEffect(ItemStack stack, EntityLivingBase attacker, Entity target, float dmgDealt) {
		float damagePercent = Math.min(dmgDealt / (float)dmg, 1f);

		attacker.heal(0.75f * damagePercent);

		if (attacker instanceof EntityPlayerMP)
			PlayerUtil.addResourceToPlayer((EntityPlayer)attacker, Enums.Resources.SOUL, 1 * damagePercent);

		if (target instanceof EntityPlayerMP)
			PlayerUtil.consumeResource((EntityPlayer)target, Enums.Resources.SOUL, 1 * damagePercent, true);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(ItemUtil.getFormattedDescriptionText("item.SelyanScythe.desc.1", Enums.ItemDescriptionType.POSITIVE));
		tooltip.add(ItemUtil.getFormattedDescriptionText("items.description.scythe", Enums.ItemDescriptionType.ITEM_TYPE_INFO));
	}
}
