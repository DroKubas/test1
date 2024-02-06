package com.yfletch.octodt.config;

import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum Food
{
	MONKFISH(ItemID.MONKFISH),
	KARAMBWAN(ItemID.COOKED_KARAMBWAN),
	SARADOMIN_BREWS(ItemID.SARADOMIN_BREW4, ItemID.SARADOMIN_BREW3, ItemID.SARADOMIN_BREW2, ItemID.SARADOMIN_BREW1),
    CAKE(ItemID.1891,ItemID.1893,ItemID.1895);
	private final int[] ids;

	Food(int... ids)
	{
		this.ids = ids;
	}
}
