package trainaddon.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.api.SpeedHandler;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;
import trainaddon.client.render.locomotive.electric.Model5B;
import trainaddon.common.library.Info;

public class EntityLocoElectric5B_EN57 extends ElectricTrain {

    // klakson, jazda, postoj - na razie dzwieki z FoxTC
    public static final SoundRecord Sound = new SoundRecord(EntityLocoElectric5B_EN57.class,
            "tc:eu07_horn", 0.8F,
            "tc:vl10_idle", 0.2F, 50,
            "tc:vl10_idle", 0.2F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoElectric5B_EN57(World world) {
        super(world);
        setupTextureDescription();
    }

    // kolejnosc = kolejnosc skinow w rejestracji: Skin16, Skin17, ...
    public void setupTextureDescription() {
        InsertTexture(0,  "PKP Bordowe - przód");
        InsertTexture(1,  "PKP Bordowe - tył");
        InsertTexture(2,  "PKP Bordowe (bez ryfli) - przód");
        InsertTexture(3,  "PKP Bordowe (bez ryfli) - tył");
        InsertTexture(4,  "Polregio - przód");
        InsertTexture(5,  "Polregio - tył");
        InsertTexture(6,  "Polregio (bez ryfli) - przód");
        InsertTexture(7,  "Polregio (bez ryfli) - tył");
        InsertTexture(8,  "PKP Żółto-niebieskie - przód");
        InsertTexture(9,  "PKP Żółto-niebieskie - tył");
        InsertTexture(10, "PKP Żółto-niebieskie (bez ryfli) - przód");
        InsertTexture(11, "PKP Żółto-niebieskie (bez ryfli) - tył");
    }

    // maszynista: (odleglosc od glownego hitboxa, wysokosc, bok)
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.3, 0.15, 0); }

    @Override
    public String transportCountry() { return "PL"; }

    @Override
    public String getInventoryName() { return "PKP EN57ra/rb"; }

    // odstep przy sprzeganiu (od skrajnych hitboxow)
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.4F; }

    // vmax dziala tez w ukrotnieniu
    @Override
    public void limitSpeedOnTCRail() {
        super.limitSpeedOnTCRail();
        if (canBePulled) {
            float max = SpeedHandler.handleSpeed(getMaxSpeed(), maxSpeed, this);
            double v = Math.sqrt(motionX * motionX + motionZ * motionZ);
            if (v > max) {
                motionX *= max / v;
                motionZ *= max / v;
            }
        }
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoElectric5B_EN57.class, new Model5B(),
                "5B_",
                new float[]{-3.6F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_Bordo_Front";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_Bordo_Rear";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_Bordo_BezRyfli_Front";
                        break;
                    case "skin19":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_Bordo_BezRyfli_Rear";
                        break;
                    case "skin20":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_polregio_Front";
                        break;
                    case "skin21":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_polregio_Rear";
                        break;
                    case "skin22":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_polregio_BezRyfli_Front";
                        break;
                    case "skin23":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_polregio_BezRyfli_Rear";
                        break;
                    case "skin24":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_ZoltoNiebieski_Front";
                        break;
                    case "skin25":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_ZoltoNiebieski_Rear";
                        break;
                    case "skin26":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_ZoltoNiebieski_BezRyfli_Front";
                        break;
                    case "skin27":
                        texturePath = "textures/trains/Locomotives/Electric/5B_/5B_ZoltoNiebieski_BezRyfli_Rear";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}