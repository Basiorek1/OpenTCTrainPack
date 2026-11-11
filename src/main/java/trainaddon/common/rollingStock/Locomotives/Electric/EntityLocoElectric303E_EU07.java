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
import trainaddon.client.render.locomotive.electric.Model4E;
import trainaddon.common.library.Info;

public class EntityLocoElectric303E_EU07 extends ElectricTrain {

    public static final SoundRecord Sound = new SoundRecord(EntityLocoElectric303E_EU07.class,
            Info.modID + ":303e_horn", 0.8F,
            Info.modID + ":303e_run", 0.4F, 50,
            Info.modID + ":303e_idle", 0.3F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoElectric303E_EU07(World world) {
        super(world);
        setupTextureDescription();
    }

    // kolejnosc = kolejnosc skinow w rejestracji: Skin16, Skin17, ...
    public void setupTextureDescription() {
        InsertTexture(0, "PKP Cargo");   // Skin16
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
    public String getInventoryName() { return "PKP 303E EU07"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.4F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoElectric303E_EU07.class, new Model303E(),
                "303E_",
                new float[]{-1.65F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Electric/303E_/303E_EU07_PKPC1";
                        break;

                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}