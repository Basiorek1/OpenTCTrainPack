package trainaddon.common.rollingStock.Locomotives.Diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.api.SpeedHandler;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;
import trainaddon.client.render.locomotive.diseal.Model411D;
import trainaddon.common.library.Info;

import java.util.ArrayList;

public class EntityLocoDiesel411D extends DieselTrain {

    public static final SoundRecord Sound = new SoundRecord(EntityLocoDiesel411D.class,
            Info.modID + ":411d_horn", 0.8F,
            Info.modID + ":411d_run", 0.4F, 50,
            Info.modID + ":411d_idle", 0.3F, 50,
            false, " ", 0);

    @Override
    public SoundRecord getSoundRecord() { return Sound; }

    public EntityLocoDiesel411D(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityLocoDiesel411D.class).getTankCapacity(),
                LiquidManager.dieselFilter());
        setupTextureDescription();
    }

    // kolejnosc = kolejnosc skinow w rejestracji: Skin16, Skin17, ...
    public void setupTextureDescription() {
        InsertTexture(0, "PKP Oliwkowe");   // Skin16
        InsertTexture(1, "PKP Zielone");
        InsertTexture(2, "PKP Zielone Goła Baba");
        InsertTexture(3, "PKP");
        InsertTexture(4, "PKP");
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4, 0, 0.0); }

    @Override
    public String transportCountry() { return "PL"; }

    @Override
    public String getInventoryName() { return "PKP SM31"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.4F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityLocoDiesel411D.class, new Model411D(),
                "411D_",
                new float[]{-2.3F, 0.16F, 0F},
                new float[]{0F, 180F, 180F},
                null,
                // dym: typ + pozycja komina {przod/tyl, wysokosc, bok} w blokach
                "smoke", new ArrayList<double[]>() { { add(new double[]{2.3D, 1.2D, 0.0D}); } },
                null, null, 5, 0) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                String texturePath = "";
                switch (colorAsString.toLowerCase()) {
                    case "skin16":
                        texturePath = "textures/trains/Locomotives/Diesel/411D_/411D_oliwkowe";
                        break;
                    case "skin17":
                        texturePath = "textures/trains/Locomotives/Diesel/411D_/411D_zielone";
                        break;
                    case "skin18":
                        texturePath = "textures/trains/Locomotives/Diesel/411D_/411D_zielone_golababa";
                        break;
                }
                texturePath += ".png";
                return new ResourceLocation(Info.modID, texturePath);
            }
        });
    }
}