package trainaddon.common.rollingStock.Wagons.Passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;
import trainaddon.client.render.rollingstock.passenger.Model6B;
import trainaddon.common.library.Info;

public class EntityPassenger6B_EN57 extends AbstractPassengerCar {

    public EntityPassenger6B_EN57(World world) {
        super(world);
        setupTextureDescription();
    }

    // kolejnosc = kolejnosc skinow w rejestracji: Skin16, Skin17, ...
    public void setupTextureDescription() {
        InsertTexture(0, "PKP Bordowe");
        InsertTexture(1, "PKP Bordowe (bez ryfli)");
        InsertTexture(2, "Polregio");
        InsertTexture(3, "Polregio (bez ryfli)");
        InsertTexture(4, "PKP Żółto-niebieskie");
        InsertTexture(5, "PKP Żółto-niebieskie (bez ryfli)");
    }

    // miejsca dla pasazerow: (id, wzdluz wagonu, wysokosc, w bok, rola)
    @Override
    protected SeatDefinition[] getSeatDefinitions() {
        return new SeatDefinition[] {
                new SeatDefinition("passenger_1", -2.5F, 0.0F,  0.3F, SeatRole.PASSENGER),
                new SeatDefinition("passenger_2", -2.5F, 0.0F, -0.3F, SeatRole.PASSENGER),
                new SeatDefinition("passenger_3",  0.0F, 0.0F,  0.3F, SeatRole.PASSENGER),
                new SeatDefinition("passenger_4",  0.0F, 0.0F, -0.3F, SeatRole.PASSENGER),
                new SeatDefinition("passenger_5",  2.5F, 0.0F,  0.3F, SeatRole.PASSENGER),
                new SeatDefinition("passenger_6",  2.5F, 0.0F, -0.3F, SeatRole.PASSENGER)
        };
    }

    // jedno entity na srodku - odstep to ok. polowa dlugosci wagonu
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 4.2F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityPassenger6B_EN57.class, new Model6B(),
                "6B_",
                new float[]{0F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Wagons/Passenger/6B_/6B_Bordo";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Wagons/Passenger/6B_/6B_Bordo_BezRyfli";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Wagons/Passenger/6B_/6B_polregio";
                        break;
                    case "skin19":
                        texturePath = "textures/trains/Wagons/Passenger/6B_/6B_polregio_BezRyfli";
                        break;
                    case "skin20":
                        texturePath = "textures/trains/Wagons/Passenger/6B_/6B_ZoltoNiebieski";
                        break;
                    case "skin21":
                        texturePath = "textures/trains/Wagons/Passenger/6B_/6B_ZoltoNiebieski_BezRyfli";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}