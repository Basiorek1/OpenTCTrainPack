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

public class EntityLocoElectricEP08 extends ElectricTrain {

    public static final SoundRecord Sound = new SoundRecord(EntityLocoElectricEP08.class,
            Info.modID + ":4e_horn", 0.8F,
            Info.modID + ":4e_run", 0.4F, 50,
            Info.modID + ":4e_idle", 0.3F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoElectricEP08(World world) {
        super(world);
        setupTextureDescription();
    }

    // kolejnosc = kolejnosc skinow w rejestracji: Skin16, Skin17, ...
    public void setupTextureDescription() {
        InsertTexture(0, "PKP Denaturat");   // Skin16
        InsertTexture(1, "PKP Denaturat ZEZ");
        InsertTexture(2, "PKP Intercity 1");
        InsertTexture(3, "PKP Intercity 1 ZEZ");
        InsertTexture(4, "PKP Intercity 2");
        InsertTexture(5, "PKP Intercity 2 ZEZ");
        InsertTexture(6, "PKP Intercity 3");
        InsertTexture(7, "PKP Intercity 3 ZEZ");
        InsertTexture(8, "PKP Intercity 4");
        InsertTexture(9, "PKP Intercity 4 ZEZ");
        InsertTexture(10, "PKP Świnia 1");
        InsertTexture(11, "PKP Świnia 1 ZEZ");
        InsertTexture(12, "PKP Świnia 2");
        InsertTexture(13, "PKP Świnia 2 ZEZ");
        InsertTexture(14, "PKP Świnia 3");
        InsertTexture(15, "PKP Świnia 3 ZEZ");
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
    public String getInventoryName() { return "PKP 4E EP08"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.4F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoElectricEP08.class, new Model4E(),
                "4E_",
                new float[]{-1.65F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_Denaturat";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_Denaturat_ZEZ";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_PKPIC1";
                        break;
                    case "skin19":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_PKPIC1_ZEZ";
                        break;
                    case "skin20":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_PKPIC2";
                        break;
                    case "skin21":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_PKPIC2_ZEZ";
                        break;
                    case "skin22":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_PKPIC3";
                        break;
                    case "skin23":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_PKPIC3_zez";
                        break;
                    case "skin24":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_PKPIC4";
                        break;
                    case "skin25":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_PKPIC4_zez";
                        break;
                    case "skin26":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_Swinia";
                        break;
                    case "skin27":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_Swinia_ZEZ";
                        break;
                    case "skin28":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_Swinia2";
                        break;
                    case "skin29":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_Swinia2_ZEZ";
                        break;
                    case "skin30":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_Swinia3";
                        break;
                    case "skin31":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/EP08_Swinia3_ZEZ";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}