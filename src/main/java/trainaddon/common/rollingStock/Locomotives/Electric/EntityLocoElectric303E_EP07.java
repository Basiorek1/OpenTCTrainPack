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
import trainaddon.client.render.locomotive.electric.Model303E;
import trainaddon.common.library.Info;

public class EntityLocoElectric303E_EP07 extends ElectricTrain {

    public static final SoundRecord Sound = new SoundRecord(EntityLocoElectric303E_EP07.class,
            Info.modID + ":303e_horn", 0.8F,
            Info.modID + ":303e_run", 0.4F, 50,
            Info.modID + ":303e_idle", 0.3F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoElectric303E_EP07(World world) {
        super(world);
        setupTextureDescription();
    }

    // kolejnosc = kolejnosc skinow w rejestracji: Skin16, Skin17, ...
    public void setupTextureDescription() {
        InsertTexture(0, "PKP Intercity 1");// Skin16
        InsertTexture(1, "PKP Intercity 1 Olkol");
        InsertTexture(2, "PKP Intercity 1 TV");
        InsertTexture(3, "PKP Intercity 1 ZEZ");
        InsertTexture(4, "PKP Intercity 2");
        InsertTexture(5, "PKP Intercity 2 Olkol");
        InsertTexture(6, "PKP Intercity 2 TV");
        InsertTexture(7, "PKP Intercity 2 ZEZ");
        InsertTexture(8, "PKP Intercity 3");
        InsertTexture(9, "PKP Intercity 3 Olkol");
        InsertTexture(10, "PKP Intercity 3 TV");
        InsertTexture(11, "PKP Intercity 3 ZEZ");
        InsertTexture(12, "PKP Intercity 4");
        InsertTexture(13, "PKP Intercity 4 Olkol");
        InsertTexture(14, "PKP Intercity 4 TV");
        InsertTexture(15, "PKP Intercity 4 ZEZ");
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
    public String getInventoryName() { return "PKP 303E EP07"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.4F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoElectric303E_EP07.class, new Model303E(),
                "303E_",
                new float[]{-1.65F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC1";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC1_Olkol";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC1_TV";
                        break;
                    case "skin19":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC1_ZEZ";
                        break;
                    case "skin20":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC2";
                        break;
                    case "skin21":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC2_Olkol";
                        break;
                    case "skin22":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC2_TV";
                        break;
                    case "skin23":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC2_ZEZ";
                        break;
                    case "skin24":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC3";
                        break;
                    case "skin25":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC3_Olkol";
                        break;
                    case "skin26":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC3_TV";
                        break;
                    case "skin27":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC3_ZEZ";
                        break;
                    case "skin28":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC4";
                        break;
                    case "skin29":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC4_Olkol";
                        break;
                    case "skin30":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC4_TV";
                        break;
                    case "skin31":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EP07_PKPIC4_ZEZ";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}