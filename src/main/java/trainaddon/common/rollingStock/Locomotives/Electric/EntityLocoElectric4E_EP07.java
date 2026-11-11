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

public class EntityLocoElectric4E_EP07 extends ElectricTrain {

    public static final SoundRecord Sound = new SoundRecord(EntityLocoElectric4E_EP07.class,
            Info.modID + ":4e_horn", 0.8F,
            Info.modID + ":4e_run", 0.4F, 50,
            Info.modID + ":4e_idle", 0.3F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoElectric4E_EP07(World world) {
        super(world);
        setupTextureDescription();
    }

    // kolejnosc = kolejnosc skinow w rejestracji: Skin16, Skin17, ...
    public void setupTextureDescription() {
        InsertTexture(0, "EP07-201");   // Skin16
        InsertTexture(1, "PKP Denaturat");
        InsertTexture(2, "PKP Denaturat ZEZ");
        InsertTexture(3, "PKP Intercity 1");
        InsertTexture(4, "PKP Intercity 1 Pomarańczowy pas");
        InsertTexture(5, "PKP Intercity 1 ZEZ");
        InsertTexture(6, "PKP Intercity 1 TV");
        InsertTexture(7, "PKP Intercity 1 TV Chińczyk");
        InsertTexture(8, "PKP Intercity 2");
        InsertTexture(9, "PKP Intercity 2 ZEZ");
        InsertTexture(10, "PKP Intercity 2 TV");
        InsertTexture(11, "PKP Intercity 2 TV Chińczyk");
        InsertTexture(12, "PKP Intercity 3");
        InsertTexture(13, "PKP Intercity 3 ZEZ");
        InsertTexture(14, "PKP Intercity 3 TV");
        InsertTexture(15, "PKP Intercity 3 TV Chińczyk");
        InsertTexture(16, "PKP Intercity 4");
        InsertTexture(17, "PKP Intercity 4 ZEZ");
        InsertTexture(18, "PKP Intercity 4 TV");
        InsertTexture(19, "PKP Intercity 4 TV Chińczyk");
        InsertTexture(20, "SSKL ZEZ");
        InsertTexture(21, "EP07-174 2016");
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
    public String getInventoryName() { return "PKP 4E EP07"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.4F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoElectric4E_EP07.class, new Model4E(),
                "4E_",
                new float[]{-1.65F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07-201";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_Denaturat";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_Denaturat_ZEZ";
                        break;
                    case "skin19":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC1";
                        break;
                    case "skin20":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC1_Pom";
                        break;
                    case "skin21":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC1_ZEZ";
                        break;
                    case "skin22":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC1TV";
                        break;
                    case "skin23":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC1TVCH";
                        break;
                    case "skin24":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC2";
                        break;
                    case "skin25":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC2_ZEZ";
                        break;
                    case "skin26":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC2TV";
                        break;
                    case "skin27":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC2TVCH";
                        break;
                    case "skin28":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC3";
                        break;
                    case "skin29":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC3_ZEZ";
                        break;
                    case "skin30":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC3TV";
                        break;
                    case "skin31":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC3TVCH";
                        break;
                    case "skin32":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC4";
                        break;
                    case "skin33":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC4_ZEZ";
                        break;
                    case "skin34":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC4TV";
                        break;
                    case "skin35":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_PKPIC4TVCH";
                        break;
                    case "skin36":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07_SSKL_ZEZ";
                        break;
                    case "skin37":
                        texturePath = "textures/trains/Locomotives/Electric/4E_/4E_EP07-174_16";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}