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
import trainaddon.client.render.locomotive.electric.Model104E_Wiadra_Polowki;
import trainaddon.common.library.Info;

public class EntityLocoElectric104E_Wiadra_Polowki extends ElectricTrain {
    public static final SoundRecord Sound = new SoundRecord(EntityLocoElectric104E_Wiadra_Polowki.class,
            Info.modID + ":104e_horn", 0.8F,
            Info.modID + ":104e_run", 0.4F, 50,
            Info.modID + ":104e_idle", 0.3F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoElectric104E_Wiadra_Polowki(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "PKP Rodzyn");
        InsertTexture(1, "SSKL");
        InsertTexture(2, "Railjet");
        InsertTexture(3, "SP Cargo");
        InsertTexture(4, "PKP Cargo");
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.1, 0, 0.0); }

    @Override
    public String transportCountry() { return "PL"; }

    @Override
    public String getInventoryName() { return "PKP 104E_Wiadra_Polowki"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.5F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoElectric104E_Wiadra_Polowki.class, new Model104E_Wiadra_Polowki(),
                "104E_Wiadra_Polowki_",
                new float[]{-2.3F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Electric/104E_Wiadra_Polowki_/104E_Wiadra_Polowki_Rodzyn";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Locomotives/Electric/104E_Wiadra_Polowki_/104E_Wiadra_Polowki_SSKL";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Locomotives/Electric/104E_Wiadra_Polowki_/104E_Wiadra_Polowki_Railjet";
                        break;
                    case "skin19":
                        texturePath = "textures/trains/Locomotives/Electric/104E_Wiadra_Polowki_/104E_Wiadra_Polowki_SPCARGO";
                        break;
                    case "skin20":
                        texturePath = "textures/trains/Locomotives/Electric/104E_Wiadra_Polowki_/104E_Wiadra_Polowki_PKPCARGO";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}
