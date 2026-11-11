package trainaddon.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;
import trainaddon.client.render.locomotive.electric.Model112E_B;
import trainaddon.common.library.Info;
import train.common.api.SpeedHandler;

public class EntityLocoElectric112E_B extends ElectricTrain {

    public static final SoundRecord Sound = new SoundRecord(EntityLocoElectric112E_B.class,
            Info.modID + ":112e_horn", 0.8F,
            Info.modID + ":112e_run", 0.4F, 50,
            Info.modID + ":112e_idle", 0.3F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoElectric112E_B(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "PKP Cargo - Front");
        InsertTexture(1, "PKP Cargo - Tył");
        InsertTexture(2, "PKP Pomarańczowy pas - Front");
        InsertTexture(3, "PKP Pomarańczowy pas - Tył");
        InsertTexture(4, "PKP Żółte czoło - Front");
        InsertTexture(5, "PKP Żółte czoło - Tył");
        InsertTexture(6, "PKP Żółty pas - Front");
        InsertTexture(7, "PKP Żółty pas - Tył");
        InsertTexture(8, "SP Cargo - Front");
        InsertTexture(9, "SP Cargo - Tył");
    }

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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.3, 0.2, 0.0); }

    @Override
    public String transportCountry() { return "PL"; }

    @Override
    public String getInventoryName() { return "PKP ET42-B"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.5F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoElectric112E_B.class, new Model112E_B(),
                "112E_B_",
                new float[]{-2.85F, -0.65F, 0.7F},
                new float[]{0F, 180F, -180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_PKPC_FRONT";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_PKPC_BACK";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_PP_FRONT";
                        break;
                    case "skin19":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_PP_BACK";
                        break;
                    case "skin20":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_ZC_FRONT";
                        break;
                    case "skin21":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_ZC_BACK";
                        break;
                    case "skin22":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_ZP_FRONT";
                        break;
                    case "skin23":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_ZP_BACK";
                        break;
                    case "skin24":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_SPCARGO_FRONT";
                        break;
                    case "skin25":
                        texturePath = "textures/trains/Locomotives/Electric/112E_B_/112E_B_SPCARGO_BACK";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}