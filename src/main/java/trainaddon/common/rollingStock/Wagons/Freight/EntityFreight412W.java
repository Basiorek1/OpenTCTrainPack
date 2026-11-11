package trainaddon.common.rollingStock.Wagons.Freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import trainaddon.client.render.rollingstock.freight.Model412W;
import trainaddon.common.library.Info;

public class EntityFreight412W extends AbstractStandardFreightCar {

    // folder z teksturami
    private static final String TEX_DIR = "textures/trains/Wagons/Freight/412W_/";

    // {nazwa w grze, sciezka w folderze 412W_ bez .png}
    // kazda pozycja daje 2 skiny: zwykly i z koncowka (_END)
    // NOWE DOPISUJ TYLKO NA KONCU
    private static final String[][] TEXTURES = {
            {"PKP Cargo - pusty",   "PKP Cargo/Empty/412W_PKPC"},
            {"PKP Cargo - węgiel",  "PKP Cargo/Coal/412W_PKPC_COAL"},
            {"PKP Cargo - piasek",  "PKP Cargo/Sand/412W_PKPC_SAND"},
            {"PKP Cargo - żwir",    "PKP Cargo/Gravel/412W_PKPC_GRAVEL"},
            {"PKP Cargo - tłuczeń", "PKP Cargo/Ballast/412W_PKPC_BALLAST"},

            {"PKP 1 - pusty",   "PKP1/Empty/412W_PKP1"},
            {"PKP 1 - węgiel",  "PKP1/Coal/412W_PKP1_COAL"},
            {"PKP 1 - piasek",  "PKP1/Sand/412W_PKP1_SAND"},
            {"PKP 1 - żwir",    "PKP1/Gravel/412W_PKP1_GRAVEL"},
            {"PKP 1 - tłuczeń", "PKP1/Ballast/412W_PKP1_BALLAST"},

            {"PKP 2 - pusty",   "PKP2/Empty/412W_PKP2"},
            {"PKP 2 - węgiel",  "PKP2/Coal/412W_PKP2_COAL"},
            {"PKP 2 - piasek",  "PKP2/Sand/412W_PKP2_SAND"},
            {"PKP 2 - żwir",    "PKP2/Gravel/412W_PKP2_GRAVEL"},
            {"PKP 2 - tłuczeń", "PKP2/Ballast/412W_PKP2_BALLAST"},

            {"PKP 3 - pusty",   "PKP3/Empty/412W_PKP3"},
            {"PKP 3 - węgiel",  "PKP3/Coal/412W_PKP3_COAL"},
            {"PKP 3 - piasek",  "PKP3/Sand/412W_PKP3_SAND"},
            {"PKP 3 - żwir",    "PKP3/Gravel/412W_PKP3_GRAVEL"},
            {"PKP 3 - tłuczeń", "PKP3/Ballast/412W_PKP3_BALLAST"},

            {"IKOM - pusty",   "IKOM/Empty/412W_IKOM"},
            {"IKOM - węgiel",  "IKOM/Coal/412W_IKOM_COAL"},
            {"IKOM - piasek",  "IKOM/Sand/412W_IKOM_SAND"},
            {"IKOM - żwir",    "IKOM/Gravel/412W_IKOM_GRAVEL"},
            {"IKOM - tłuczeń", "IKOM/Ballast/412W_IKOM_BALLAST"},

            {"SRR - pusty",   "SRR/Empty/412W_SRR"},
            {"SRR - węgiel",  "SRR/Coal/412W_SRR_COAL"},
            {"SRR - piasek",  "SRR/Sand/412W_SRR_SAND"},
            {"SRR - żwir",    "SRR/Gravel/412W_SRR_GRAVEL"},
            {"SRR - tłuczeń", "SRR/Ballast/412W_SRR_BALLAST"},

            {"ZOS Zvolen - pusty",   "ZOS Zvolen/Empty/412W_PKP1"},
            {"ZOS Zvolen - węgiel",  "ZOS Zvolen/Coal/412W_PKP1_COAL"},
            {"ZOS Zvolen - piasek",  "ZOS Zvolen/Sand/412W_PKP1_SAND"},
            {"ZOS Zvolen - żwir",    "ZOS Zvolen/Gravel/412W_PKP1_GRAVEL"},
            {"ZOS Zvolen - tłuczeń", "ZOS Zvolen/Ballast/412W_ZOS_BALLAST"},

            {"CTL - pusty",   "CTL/Empty/412W_CTL"},
            {"CTL - węgiel",  "CTL/Coal/412W_CTL_COAL"},
            {"CTL - piasek",  "CTL/Sand/412W_CTL_SAND"},
            {"CTL - żwir",    "CTL/Gravel/412W_CTL_GRAVEL"},
            {"CTL - tłuczeń", "CTL/Ballast/412W_CTL_BALLAST"},

            {"Pol-Miedź Trans - pusty",   "PMT/Empty/412W_PMT"},
            {"Pol-Miedź Trans - węgiel",  "PMT/Coal/412W_PMT_COAL"},
            {"Pol-Miedź Trans - piasek",  "PMT/Sand/412W_PMT_SAND"},
            {"Pol-Miedź Trans - żwir",    "PMT/Gravel/412W_PMT_GRAVEL"},
            {"Pol-Miedź Trans - tłuczeń", "PMT/Ballast/412W_PMT_BALLAST"},

            {"PROTOR - pusty",   "PROTOR/Empty/412W_PROTOR"},
            {"PROTOR - węgiel",  "PROTOR/Coal/412W_PROTOR_COAL"},
            {"PROTOR - piasek",  "PROTOR/Sand/412W_PROTOR_SAND"},
            {"PROTOR - żwir",    "PROTOR/Gravel/412W_PROTOR_GRAVEL"},
            {"PROTOR - tłuczeń", "PROTOR/Ballast/412W_PROTOR_BALLAST"},

            {"SP Cargo - pusty",   "SP Cargo/Empty/412W_SPCARGO"},
            {"SP Cargo - węgiel",  "SP Cargo/Coal/412W_SPCARGO_COAL"},
            {"SP Cargo - piasek",  "SP Cargo/Sand/412W_SPCARGO_SAND"},
            {"SP Cargo - żwir",    "SP Cargo/Gravel/412W_SPCARGO_GRAVEL"},
            {"SP Cargo - tłuczeń", "SP Cargo/Ballast/412W_SPCARGO_BALLAST"},
    };

    // lista skinow do rejestracji: Skin16, Skin17, ... (tworzy sie sama)
    public static final String[] SKINS = new String[TEXTURES.length * 2];
    static {
        for (int i = 0; i < SKINS.length; i++) {
            SKINS[i] = "Skin" + (16 + i);
        }
    }

    public EntityFreight412W(World world) {
        super(world);
        setupTextureDescription();
    }

    // brak dodatkowych czesci (drzwi, ladunek) - zostaw null
    @Override
    public CargoManager setupCargoManager() { return null; }

    // kolejnosc = kolejnosc SKINS
    @Override
    public void setupTextureDescription() {
        for (int i = 0; i < TEXTURES.length; i++) {
            InsertTexture(i * 2,     TEXTURES[i][0]);
            InsertTexture(i * 2 + 1, TEXTURES[i][0] + " (koniec składu)");
        }
    }

    @Override
    public String getInventoryName() { return "PKP 412W Eaos"; }

    // odstep przy sprzeganiu
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.1F; }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                EntityFreight412W.class, new Model412W(),
                "412W_",
                new float[]{0F, 0.14F, 0F},
                new float[]{0F, 180F, 180F},
                null) {
            @Override
            public ResourceLocation getTextureFile(String colorAsString) {
                int index = 0;
                String s = colorAsString == null ? "" : colorAsString.toLowerCase();
                if (s.startsWith("skin")) {
                    try {
                        index = Integer.parseInt(s.substring(4)) - 16;
                    } catch (NumberFormatException ignored) { }
                }
                if (index < 0 || index >= SKINS.length) index = 0;

                String path = TEXTURES[index / 2][1];
                if (index % 2 == 1) path += "_END";
                return new ResourceLocation(Info.modID, TEX_DIR + path + ".png");
            }
        });
    }
}