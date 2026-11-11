//FMT-Marker DFM-1.0
//Creator: IceWelder

package trainaddon.client.render.locomotive.electric;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.7 &copy; 2026 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model4E_Bogie extends ModelConverter {

	private int textureX = 256;
	private int textureY = 256;

	public Model4E_Bogie(){
		bodyModel = new ModelRendererTurbo[53];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 156, 0, textureX, textureY);
		bodyModel[0].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[0].setRotationPoint(2.5f, 6.5f, -5.5f);

		bodyModel[1] = new ModelRendererTurbo(this, 39, 3, textureX, textureY);
		bodyModel[1].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[1].setRotationPoint(3.0f, 7.0f, 5.5f);

		bodyModel[2] = new ModelRendererTurbo(this, 127, 0, textureX, textureY);
		bodyModel[2].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[2].setRotationPoint(-11.5f, 6.5f, -5.5f);

		bodyModel[3] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		bodyModel[3].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[3].setRotationPoint(2.5f, 6.5f, 5.5f);

		bodyModel[4] = new ModelRendererTurbo(this, 141, 4, textureX, textureY);
		bodyModel[4].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[4].setRotationPoint(-11.5f, 6.5f, 5.5f);

		bodyModel[5] = new ModelRendererTurbo(this, 26, 3, textureX, textureY);
		bodyModel[5].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[5].setRotationPoint(0.5f, 7.5f, 6.5f);

		bodyModel[6] = new ModelRendererTurbo(this, 13, 3, textureX, textureY);
		bodyModel[6].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[6].setRotationPoint(-13.5f, 7.5f, 6.5f);

		bodyModel[7] = new ModelRendererTurbo(this, 156, 5, textureX, textureY);
		bodyModel[7].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[7].setRotationPoint(3.5f, 3.5f, 6.5f);

		bodyModel[8] = new ModelRendererTurbo(this, 33, 0, textureX, textureY);
		bodyModel[8].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[8].setRotationPoint(-11.5f, 3.5f, 6.5f);

		bodyModel[9] = new ModelRendererTurbo(this, 127, 5, textureX, textureY);
		bodyModel[9].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[9].setRotationPoint(5.5f, 5.5f, 6.5f);

		bodyModel[10] = new ModelRendererTurbo(this, 115, 4, textureX, textureY);
		bodyModel[10].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[10].setRotationPoint(-15.5f, 5.5f, 6.5f);

		bodyModel[11] = new ModelRendererTurbo(this, 181, 7, textureX, textureY);
		bodyModel[11].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[11].setRotationPoint(-4.5f, 4.5f, 6.5f);

		bodyModel[12] = new ModelRendererTurbo(this, 115, 7, textureX, textureY);
		bodyModel[12].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[12].setRotationPoint(-3.0f, 4.5f, 6.5f);

		bodyModel[13] = new ModelRendererTurbo(this, 101, 7, textureX, textureY);
		bodyModel[13].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[13].setRotationPoint(-6.0f, 4.5f, 6.5f);

		bodyModel[14] = new ModelRendererTurbo(this, 127, 0, textureX, textureY);
		bodyModel[14].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[14].setRotationPoint(-5.0f, 2.0f, -1.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 140, 0, textureX, textureY);
		bodyModel[15].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[15].setRotationPoint(6.5f, 5.5f, -6.5f);

		bodyModel[16] = new ModelRendererTurbo(this, 111, 0, textureX, textureY);
		bodyModel[16].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[16].setRotationPoint(-15.5f, 5.5f, -6.5f);

		bodyModel[17] = new ModelRendererTurbo(this, 108, 4, textureX, textureY);
		bodyModel[17].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(-13.5f, 3.5f, 6.5f);

		bodyModel[18] = new ModelRendererTurbo(this, 95, 0, textureX, textureY);
		bodyModel[18].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[18].setRotationPoint(-4.0f, 3.0f, -1.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 185, 0, textureX, textureY);
		bodyModel[19].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[19].setRotationPoint(-5.0f, 2.0f, 1.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 170, 0, textureX, textureY);
		bodyModel[20].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[20].setRotationPoint(-5.0f, 2.0f, -3.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 66, 0, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[21].setRotationPoint(-16.0f, 3.0f, 0.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 101, 4, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(5.5f, 5.5f, -7.5f);

		bodyModel[23] = new ModelRendererTurbo(this, 94, 4, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[23].setRotationPoint(3.5f, 3.5f, -7.5f);

		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[24].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[24].setRotationPoint(-11.5f, 3.5f, -7.5f);

		bodyModel[25] = new ModelRendererTurbo(this, 87, 4, textureX, textureY);
		bodyModel[25].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[25].setRotationPoint(-13.5f, 3.5f, -7.5f);

		bodyModel[26] = new ModelRendererTurbo(this, 80, 4, textureX, textureY);
		bodyModel[26].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[26].setRotationPoint(-15.5f, 5.5f, -7.5f);

		bodyModel[27] = new ModelRendererTurbo(this, 73, 4, textureX, textureY);
		bodyModel[27].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[27].setRotationPoint(2.5f, 6.5f, -7.5f);

		bodyModel[28] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		bodyModel[28].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[28].setRotationPoint(-13.5f, 7.5f, -7.5f);

		bodyModel[29] = new ModelRendererTurbo(this, 239, 0, textureX, textureY);
		bodyModel[29].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[29].setRotationPoint(0.5f, 7.5f, -7.5f);

		bodyModel[30] = new ModelRendererTurbo(this, 79, 7, textureX, textureY);
		bodyModel[30].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[30].setRotationPoint(-4.5f, 4.5f, -7.5f);

		bodyModel[31] = new ModelRendererTurbo(this, 58, 7, textureX, textureY);
		bodyModel[31].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[31].setRotationPoint(-6.0f, 4.5f, -7.5f);

		bodyModel[32] = new ModelRendererTurbo(this, 148, 6, textureX, textureY);
		bodyModel[32].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[32].setRotationPoint(-3.0f, 4.5f, -7.5f);

		bodyModel[33] = new ModelRendererTurbo(this, 32, 6, textureX, textureY);
		bodyModel[33].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[33].setRotationPoint(2.5f, 4.5f, -7.5f);

		bodyModel[34] = new ModelRendererTurbo(this, 146, 2, textureX, textureY);
		bodyModel[34].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[34].setRotationPoint(-11.5f, 6.5f, -7.5f);

		bodyModel[35] = new ModelRendererTurbo(this, 226, 0, textureX, textureY);
		bodyModel[35].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[35].setRotationPoint(3.0f, 7.0f, -5.5f);

		bodyModel[36] = new ModelRendererTurbo(this, 213, 0, textureX, textureY);
		bodyModel[36].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[36].setRotationPoint(-11.0f, 7.0f, -5.5f);

		bodyModel[37] = new ModelRendererTurbo(this, 200, 0, textureX, textureY);
		bodyModel[37].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[37].setRotationPoint(-11.0f, 7.0f, 5.5f);

		bodyModel[38] = new ModelRendererTurbo(this, 27, 6, textureX, textureY);
		bodyModel[38].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[38].setRotationPoint(-13.5f, 6.5f, -7.5f);

		bodyModel[39] = new ModelRendererTurbo(this, 66, 4, textureX, textureY);
		bodyModel[39].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[39].setRotationPoint(-9.5f, 4.5f, -7.5f);

		bodyModel[40] = new ModelRendererTurbo(this, 246, 3, textureX, textureY);
		bodyModel[40].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[40].setRotationPoint(-0.5f, 4.5f, -7.5f);

		bodyModel[41] = new ModelRendererTurbo(this, 239, 3, textureX, textureY);
		bodyModel[41].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[41].setRotationPoint(3.5f, 4.5f, -7.5f);

		bodyModel[42] = new ModelRendererTurbo(this, 22, 6, textureX, textureY);
		bodyModel[42].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[42].setRotationPoint(4.5f, 6.5f, -7.5f);

		bodyModel[43] = new ModelRendererTurbo(this, 59, 3, textureX, textureY);
		bodyModel[43].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[43].setRotationPoint(-13.5f, 4.5f, -7.5f);

		bodyModel[44] = new ModelRendererTurbo(this, 17, 6, textureX, textureY);
		bodyModel[44].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[44].setRotationPoint(-11.5f, 4.5f, -7.5f);

		bodyModel[45] = new ModelRendererTurbo(this, 52, 3, textureX, textureY);
		bodyModel[45].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[45].setRotationPoint(-0.5f, 4.5f, 6.5f);

		bodyModel[46] = new ModelRendererTurbo(this, 12, 6, textureX, textureY);
		bodyModel[46].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[46].setRotationPoint(2.5f, 4.5f, 6.5f);

		bodyModel[47] = new ModelRendererTurbo(this, 7, 6, textureX, textureY);
		bodyModel[47].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[47].setRotationPoint(4.5f, 6.5f, 6.5f);

		bodyModel[48] = new ModelRendererTurbo(this, 180, 0, textureX, textureY);
		bodyModel[48].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[48].setRotationPoint(3.5f, 4.5f, 6.5f);

		bodyModel[49] = new ModelRendererTurbo(this, 156, 0, textureX, textureY);
		bodyModel[49].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[49].setRotationPoint(-9.5f, 4.5f, 6.5f);

		bodyModel[50] = new ModelRendererTurbo(this, 195, 0, textureX, textureY);
		bodyModel[50].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[50].setRotationPoint(-11.5f, 4.5f, 6.5f);

		bodyModel[51] = new ModelRendererTurbo(this, 170, 0, textureX, textureY);
		bodyModel[51].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[51].setRotationPoint(-13.5f, 6.5f, 6.5f);

		bodyModel[52] = new ModelRendererTurbo(this, 141, 0, textureX, textureY);
		bodyModel[52].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[52].setRotationPoint(-13.5f, 4.5f, 6.5f);

		flipAll();
	}

}
