package trainaddon.common.library;

import net.minecraft.item.Item;
import train.common.library.TypeOfRollingStock;

import static train.common.library.TypeOfRollingStock.*;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum AddonRollingStockItems
{
    minecartET42_A("ET42-A-icon", ELECTRIC, 20),
    minecartET42_B("ET42-B-icon", ELECTRIC, 20),
    minecartEP09_Wiadra_Polowki("EP09_wiadra_polowki-icon", ELECTRIC, 20),
    minecart4E_EU07("4E-EU07-icon", ELECTRIC, 20),
    minecart4E_EP07("4E-EP07-icon", ELECTRIC, 20),
    minecartEP08("4E-EP08-icon", ELECTRIC, 20),
    minecart303E_EU07("303E-EU07-icon", ELECTRIC, 20),
    minecart303E_EP07("303E-EP07-icon", ELECTRIC, 20),
    minecartSM31("411D-icon", DIESEL, 20),
    minecart412W_Eaos("412W-icon", FREIGHT, 10),
    ;


    AddonRollingStockItems(String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, int amountForEmerald)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = this.name();
    }

    AddonRollingStockItems(String itemName, String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, int amountForEmerald)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = itemName;
    }

    AddonRollingStockItems(String iconName, TypeOfRollingStock typeOfRollingStock)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = -1;
        ItemName = this.name();
    }

    AddonRollingStockItems(String itemName, String iconName, TypeOfRollingStock typeOfRollingStock)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = -1;
        ItemName = itemName;
    }

    public Item item;
    public final String iconName;
    public final TypeOfRollingStock TypeOfRollingStock;

    public final String ItemName;

    public byte amountForEmerald;
}