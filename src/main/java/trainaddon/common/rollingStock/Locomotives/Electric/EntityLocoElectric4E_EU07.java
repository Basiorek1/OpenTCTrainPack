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
import trainaddon.client.render.locomotive.electric.Model4E;
import trainaddon.common.library.Info;

public class EntityLocoElectric4E_EU07 extends ElectricTrain {

    public static final SoundRecord Sound = new SoundRecord(EntityLocoElectric4E_EU07.class,
            Info.modID + ":4e_horn", 0.8F,
            Info.modID + ":4e_run", 0.4F, 50,
            Info.modID + ":4e_idle", 0.3F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoElectric4E_EU07(World world) {
        super(world);
        setupTextureDescription();
    }

    // kolejnosc = kolejnosc skinow w rejestracji: Skin16, Skin17, ...
    public void setupTextureDescription() {
        InsertTexture(0, "EU07-128");   // Skin16
        InsertTexture(1, "EU07-195");
        InsertTexture(2, "EU07-241");
        InsertTexture(3, "PKP Cargo 1");
        InsertTexture(4, "PKP Cargo 1 TV");
        InsertTexture(5, "PKP Cargo 1 ZEZ");
        InsertTexture(6, "PKP Cargo 2");
        InsertTexture(7, "PKP Cargo 2 TV");
        InsertTexture(8, "PKP Cargo 2 ZEZ");
        InsertTexture(9, "PKP Cargo 3");
        InsertTexture(10, "PKP Cargo 3 TV");
        InsertTexture(11, "PKP Cargo 3 ZEZ");
        InsertTexture(12, "PKP Cargo 15XX");
        InsertTexture(13, "PKP Cargo 15XX TV");
        InsertTexture(14, "PKP Cargo 15XX ZEZ");
        InsertTexture(15, "PKP Intercity 1");
        InsertTexture(16, "PKP Intercity 1 TV");
        InsertTexture(17, "PKP Intercity 2");
        InsertTexture(18, "PKP Intercity 2 TV");
        InsertTexture(19, "PKP Intercity 3");
        InsertTexture(20, "PKP Intercity 3 TV");
        InsertTexture(21, "PKP Intercity 4");
        InsertTexture(22, "PKP Intercity 4 TV");
        InsertTexture(23, "PKP Intercity Denaturat");
        InsertTexture(24, "Trainspeed ZEZ");
        InsertTexture(25, "EU07");
        InsertTexture(26, "EU07");
        InsertTexture(27, "EU07");
    }

    // limit vmax takze w ukrotnieniu
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.25, 0.15, 0); }

    @Override
    public String transportCountry() { return "PL"; }

    @Override
    public String getInventoryName() { return "PKP 4E EU07"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.4F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoElectric4E_EU07.class, new Model4E(),
                "4E_",
                new float[]{-1.65F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07-128";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07-195";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07-241";
                        break;
                    case "skin19":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC1";
                        break;
                    case "skin20":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC1_TV";
                        break;
                    case "skin21":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC1_ZEZ";
                        break;
                    case "skin22":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC2";
                        break;
                    case "skin23":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC2_TV";
                        break;
                    case "skin24":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC2_ZEZ";
                        break;
                    case "skin25":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC3";
                        break;
                    case "skin26":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC3_TV";
                        break;
                    case "skin27":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC3_ZEZ";
                        break;
                    case "skin28":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC_15XX";
                        break;
                    case "skin29":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC_15XX_TV";
                        break;
                    case "skin30":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPC_15XX_ZEZ";
                        break;
                    case "skin31":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPIC1";
                        break;
                    case "skin32":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPIC1_TV";
                        break;
                    case "skin33":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPIC2";
                        break;
                    case "skin34":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPIC2_TV";
                        break;
                    case "skin35":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPIC3";
                        break;
                    case "skin36":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPIC3_TV";
                        break;
                    case "skin37":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPIC4";
                        break;
                    case "skin38":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_PKPIC4_TV";
                        break;
                    case "skin39":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_Denaturat";
                        break;
                    case "skin40":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EU07_TrainSpeed_ZEZ";
                        break;
                    case "skin41":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E-Wreck1";
                        break;
                    case "skin42":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E-Wreck2";
                        break;
                    case "skin43":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E-Wreck3";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}