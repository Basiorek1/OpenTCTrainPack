package trainaddon.common.core.handler;

import train.common.Traincraft;
import train.common.library.EnumTrainType;
import train.common.library.register.TrainRecord;
import trainaddon.common.FoxTCAddonPack;
import trainaddon.common.library.AddonRollingStockItems;
import trainaddon.common.rollingStock.Locomotives.Electric.EntityLocoElectric104E_Wiadra_Polowki;
import trainaddon.common.rollingStock.Locomotives.Electric.EntityLocoElectric112E_B;
import trainaddon.common.rollingStock.Locomotives.Electric.EntityLocoElectric112E_A;
import trainaddon.common.rollingStock.Locomotives.Electric.EntityLocoElectric4E_EU07;
import trainaddon.common.rollingStock.Locomotives.Electric.EntityLocoElectric4E_EP07;
import trainaddon.common.rollingStock.Locomotives.Electric.EntityLocoElectricEP08;
import trainaddon.common.rollingStock.Locomotives.Electric.EntityLocoElectric303E_EU07;
import trainaddon.common.rollingStock.Locomotives.Electric.EntityLocoElectric303E_EP07;
import trainaddon.common.rollingStock.Locomotives.Diesel.EntityLocoDiesel411D;
import trainaddon.common.rollingStock.Wagons.Freight.EntityFreight412W;

public class AddonPackRollingStockEntityHandler
{
    private Object Instance()
    {
        return FoxTCAddonPack.instance;
    }

    public AddonPackRollingStockEntityHandler()
    {
        // ===== Lokomotywy elektryczne =====

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartET42_A.item,
                new TrainRecord("PKP ET42-A", EntityLocoElectric112E_A.class, AddonRollingStockItems.minecartET42_A.item,
                        EnumTrainType.Electric, 0, new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25"}, 12)
                        .setMHP(3290).setMaxSpeed(100).setFuelConsumption(25)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.85),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartET42_B.item,
                new TrainRecord("PKP ET42-B", EntityLocoElectric112E_B.class, AddonRollingStockItems.minecartET42_B.item,
                        EnumTrainType.Electric, 0, new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25"}, 12)
                        .setMHP(3290).setMaxSpeed(100).setFuelConsumption(25)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.85),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartEP09_Wiadra_Polowki.item,
                new TrainRecord("PKP EP09 Wiadra połówki", EntityLocoElectric104E_Wiadra_Polowki.class, AddonRollingStockItems.minecartEP09_Wiadra_Polowki.item,
                        EnumTrainType.Electric, 0, new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20"}, 12)
                        .setMHP(3915).setMaxSpeed(160).setFuelConsumption(25)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-4.7),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecart4E_EU07.item,
                new TrainRecord("PKP 4E EU07", EntityLocoElectric4E_EU07.class, AddonRollingStockItems.minecart4E_EU07.item,
                        EnumTrainType.Electric, 0, new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin38", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43"}, 12)
                        .setMHP(2700).setMaxSpeed(125).setFuelConsumption(25)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-4.3),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecart4E_EP07.item,
                new TrainRecord("PKP 4E EP07", EntityLocoElectric4E_EP07.class, AddonRollingStockItems.minecart4E_EP07.item,
                        EnumTrainType.Electric, 0, new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37"}, 12)
                        .setMHP(2700).setMaxSpeed(125).setFuelConsumption(25)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-4.3),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartEP08.item,
                new TrainRecord("PKP EP08", EntityLocoElectricEP08.class, AddonRollingStockItems.minecartEP08.item,
                        EnumTrainType.Electric, 0, new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31"}, 12)
                        .setMHP(2700).setMaxSpeed(140).setFuelConsumption(25)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-4.3),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecart303E_EU07.item,
                new TrainRecord("PKP 303E EU07", EntityLocoElectric303E_EU07.class, AddonRollingStockItems.minecart303E_EU07.item,
                        EnumTrainType.Electric, 0, new String[]{"Skin16"}, 12)
                        .setMHP(2700).setMaxSpeed(125).setFuelConsumption(25)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-4.3),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecart303E_EP07.item,
                new TrainRecord("PKP 303E EP07", EntityLocoElectric303E_EP07.class, AddonRollingStockItems.minecart303E_EP07.item,
                        EnumTrainType.Electric, 0, new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31"}, 12)
                        .setMHP(2700).setMaxSpeed(125).setFuelConsumption(25)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-4.3),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSM31.item,
                new TrainRecord("PKP SM31", EntityLocoDiesel411D.class, AddonRollingStockItems.minecartSM31.item,
                        EnumTrainType.Diesel, 0, new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"}, 12)
                        .setMHP(1200).setMaxSpeed(80).setFuelConsumption(25)
                        .setHeatingTime(1000).setAccelerationRate(0.6).setBrakeRate(0.9)
                        .setBogieLocoPosition(-4.95).setTankCapacity(5000),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecart412W_Eaos.item,
                new TrainRecord("PKP 412W Eaos", EntityFreight412W.class, AddonRollingStockItems.minecart412W_Eaos.item,
                        EnumTrainType.Gondola, 0, EntityFreight412W.SKINS, 12)
                        .setCargoCapacity(54),
                Instance()
        );
    }
}