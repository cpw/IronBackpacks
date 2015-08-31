package main.ironbackpacks.items.upgrades.upgradeItems.filterUpgrades;

import main.ironbackpacks.items.upgrades.ItemUpgradeBase;
import main.ironbackpacks.util.ConfigHandler;
import main.ironbackpacks.util.IronBackpacksConstants;

public class ItemFilterMiningUpgrade extends ItemUpgradeBase {

    public ItemFilterMiningUpgrade(){
        super("filterMiningUpgrade", "filterMiningUpgrade", IronBackpacksConstants.Upgrades.FILTER_MINING_UPGRADE_ID, ConfigHandler.filterMiningUpgradeCost, IronBackpacksConstants.Upgrades.FILTER_MINING_DESCRIPTION);
    }
}
