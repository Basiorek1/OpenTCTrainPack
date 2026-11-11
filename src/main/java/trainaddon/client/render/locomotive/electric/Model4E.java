//FMT-Marker DFM-1.0
//Creator: IceWelder

package trainaddon.client.render.locomotive.electric;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.7 &copy; 2026 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model4E extends ModelConverter {

	private int textureX = 256;
	private int textureY = 256;

	public Model4E(){
		bodyModel = new ModelRendererTurbo[213];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(0, 0, 0, 74, 2, 22, 0f);
		bodyModel[0].setRotationPoint(-45.0f, 0.0f, -11.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 0, 134, textureX, textureY);
		bodyModel[1].addShapeBox(0, 0, 0, 1, 11, 8, 0, 1, 0, 0, -1, 0, 0, -3, 0, 0, 2, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1);
		bodyModel[1].setRotationPoint(30.0f, -11.0f, 3.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 214, 148, textureX, textureY);
		bodyModel[2].addShapeBox(0, 0, 0, 1, 11, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(30.0f, -11.0f, -3.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 201, 133, textureX, textureY);
		bodyModel[3].addShapeBox(0, 0, 0, 1, 7, 8, 0, 2, 0, 0, -2, 0, 0, -3.5f, 0, 0, 2.5f, 0, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 1, 0, -1);
		bodyModel[3].setRotationPoint(29.0f, -18.0f, 3.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 36, 148, textureX, textureY);
		bodyModel[4].addShapeBox(0, 0, 0, 1, 7, 6, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(29.0f, -18.0f, -3.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 181, 107, textureX, textureY);
		bodyModel[5].addShapeBox(0, 0, 0, 7, 3, 8, 0, 0, 0, 0, 0, -3, 0, -1.5f, -3, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(21.0f, -21.0f, 3.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 58, 121, textureX, textureY);
		bodyModel[6].addShapeBox(0, 0, 0, 7, 3, 6, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[6].setRotationPoint(21.0f, -21.0f, -3.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 9, 154, textureX, textureY);
		bodyModel[7].addShapeBox(0, 0, 0, 3, 7, 1, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[7].setRotationPoint(26.0f, -18.0f, 10.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 25, 160, textureX, textureY);
		bodyModel[8].addBox(0, 0, 0, 2, 11, 1, 0f);
		bodyModel[8].setRotationPoint(26.0f, -11.0f, 10.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 18, 160, textureX, textureY);
		bodyModel[9].addBox(0, 0, 0, 2, 11, 1, 0f);
		bodyModel[9].setRotationPoint(26.0f, -11.0f, -11.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 120, 96, textureX, textureY); // lamp
		bodyModel[10].addBox(0, 0, 0, 2, 3, 3, 0f);
		bodyModel[10].setRotationPoint(28.65f, -4.0f, 6.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 199, 126, textureX, textureY); // lamp
		bodyModel[11].addBox(0, 0, 0, 8, 3, 3, 0f);
		bodyModel[11].setRotationPoint(21.0f, -21.01f, -1.5f);

		bodyModel[12] = new ModelRendererTurbo(this, 171, 7, textureX, textureY);
		bodyModel[12].addBox(0, 0, 0, 1, 1, 5, 0f);
		bodyModel[12].setRotationPoint(30.0f, -3.0f, -2.5f);

		bodyModel[13] = new ModelRendererTurbo(this, 24, 119, textureX, textureY);
		bodyModel[13].addBox(0, 0, 0, 1, 3, 3, 0f);
		bodyModel[13].setRotationPoint(30.0f, -9.0f, -1.5f);

		bodyModel[14] = new ModelRendererTurbo(this, 150, 84, textureX, textureY);
		bodyModel[14].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[14].setRotationPoint(31.0f, -8.5f, -1.5f);

		bodyModel[15] = new ModelRendererTurbo(this, 138, 84, textureX, textureY);
		bodyModel[15].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(31.0f, -8.0f, -0.5f);

		bodyModel[16] = new ModelRendererTurbo(this, 250, 83, textureX, textureY);
		bodyModel[16].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[16].setRotationPoint(31.0f, -9.0f, 0.5f);

		bodyModel[17] = new ModelRendererTurbo(this, 72, 147, textureX, textureY);
		bodyModel[17].addBox(0, 0, 0, 7, 18, 1, 0f);
		bodyModel[17].setRotationPoint(19.0f, -18.0f, 10.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 0, 154, textureX, textureY);
		bodyModel[18].addShapeBox(0, 0, 0, 3, 7, 1, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[18].setRotationPoint(26.0f, -18.0f, -11.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 72, 131, textureX, textureY);
		bodyModel[19].addShapeBox(0, 0, 0, 1, 7, 8, 0, 2.5f, 0, -1, -3.5f, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, -1, -2, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[19].setRotationPoint(29.0f, -18.0f, -11.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 52, 97, textureX, textureY);
		bodyModel[20].addShapeBox(0, 0, 0, 7, 3, 8, 0, 0, -2, 0, -1.5f, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[20].setRotationPoint(21.0f, -21.0f, -11.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 53, 131, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, 0, 1, 11, 8, 0, -1, 0, 0, 1, 0, 0, 2, 0, -1, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0);
		bodyModel[21].setRotationPoint(-47.0f, -11.0f, 3.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 192, 145, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 1, 11, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(-47.0f, -11.0f, -3.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 139, 130, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 1, 11, 8, 0, -3, 0, 0, 2, 0, -1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[23].setRotationPoint(-47.0f, -11.0f, -11.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 120, 130, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 1, 7, 8, 0, -2, 0, 0, 2, 0, 0, 2.5f, 0, -1, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, -2, 0, 0);
		bodyModel[24].setRotationPoint(-46.0f, -18.0f, 3.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 182, 129, textureX, textureY);
		bodyModel[25].addShapeBox(0, 0, 0, 1, 7, 8, 0, -3.5f, 0, 0, 2.5f, 0, -1, 2, 0, 0, -2, 0, 0, -2, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[25].setRotationPoint(-46.0f, -18.0f, -11.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 70, 65, textureX, textureY);
		bodyModel[26].addShapeBox(0, 0, 0, 1, 7, 6, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[26].setRotationPoint(-46.0f, -18.0f, -3.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 0, 28, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.82f, -1, 0, -1.82f, -1, 0, 0, 0, 0, 0, 0, 0, -1.82f, 0, 0, -1.82f, 0, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(28.0f, -11.0f, 10.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 60, 151, textureX, textureY);
		bodyModel[28].addShapeBox(0, 0, 0, 3, 7, 1, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[28].setRotationPoint(-45.0f, -18.0f, 10.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 207, 149, textureX, textureY);
		bodyModel[29].addBox(0, 0, 0, 2, 11, 1, 0f);
		bodyModel[29].setRotationPoint(-44.0f, -11.0f, 10.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 119, 146, textureX, textureY);
		bodyModel[30].addBox(0, 0, 0, 7, 18, 1, 0f);
		bodyModel[30].setRotationPoint(-42.0f, -18.0f, 10.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 21, 97, textureX, textureY);
		bodyModel[31].addShapeBox(0, 0, 0, 7, 3, 8, 0, 0, -3, 0, 0, 0, 0, 0, -2, 0, -1.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0);
		bodyModel[31].setRotationPoint(-44.0f, -21.0f, 3.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 95, 45, textureX, textureY);
		bodyModel[32].addShapeBox(0, 0, 0, 7, 3, 8, 0, -1.5f, -3, 0, 0, -2, 0, 0, 0, 0, 0, -3, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[32].setRotationPoint(-44.0f, -21.0f, -11.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 175, 119, textureX, textureY);
		bodyModel[33].addShapeBox(0, 0, 0, 7, 3, 6, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[33].setRotationPoint(-44.0f, -21.0f, -3.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 85, 126, textureX, textureY); // lamp
		bodyModel[34].addBox(0, 0, 0, 8, 3, 3, 0f);
		bodyModel[34].setRotationPoint(-45.0f, -21.01f, -1.5f);

		bodyModel[35] = new ModelRendererTurbo(this, 161, 84, textureX, textureY); // lamp
		bodyModel[35].addBox(0, 0, 0, 2, 3, 3, 0f);
		bodyModel[35].setRotationPoint(-47.0f, -4.0f, 6.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 34, 128, textureX, textureY);
		bodyModel[36].addShapeBox(0, 0, 0, 1, 11, 8, 0, 2, 0, -1, -3, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[36].setRotationPoint(30.0f, -11.0f, -11.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 158, 150, textureX, textureY); // door swing right
		bodyModel[37].addBox(0, 0, -1, 4, 16, 1, 0f);
		bodyModel[37].setRotationPoint(15.0f, -18.0f, 11.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 42, 75, textureX, textureY);
		bodyModel[38].addBox(0, 0, 0, 4, 2, 1, 0f);
		bodyModel[38].setRotationPoint(15.0f, -2.0f, 10.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 147, 150, textureX, textureY); // door swing left
		bodyModel[39].addBox(-4, 0, 0, 4, 16, 1, 0f);
		bodyModel[39].setRotationPoint(19.0f, -18.0f, -11.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 205, 72, textureX, textureY);
		bodyModel[40].addBox(0, 0, 0, 4, 2, 1, 0f);
		bodyModel[40].setRotationPoint(15.0f, -2.0f, -11.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 136, 150, textureX, textureY); // door swing left
		bodyModel[41].addBox(0, 0, -1, 4, 16, 1, 0f);
		bodyModel[41].setRotationPoint(-35.0f, -18.0f, 11.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 51, 151, textureX, textureY);
		bodyModel[42].addShapeBox(0, 0, 0, 3, 7, 1, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[42].setRotationPoint(-45.0f, -18.0f, -11.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 229, 148, textureX, textureY);
		bodyModel[43].addBox(0, 0, 0, 2, 11, 1, 0f);
		bodyModel[43].setRotationPoint(-44.0f, -11.0f, -11.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 237, 145, textureX, textureY);
		bodyModel[44].addBox(0, 0, 0, 7, 18, 1, 0f);
		bodyModel[44].setRotationPoint(-42.0f, -18.0f, -11.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 89, 149, textureX, textureY); // door swing right
		bodyModel[45].addBox(-4, 0, 0, 4, 16, 1, 0f);
		bodyModel[45].setRotationPoint(-31.0f, -18.0f, -11.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 79, 65, textureX, textureY);
		bodyModel[46].addBox(0, 0, 0, 4, 2, 1, 0f);
		bodyModel[46].setRotationPoint(-35.0f, -2.0f, 10.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 179, 25, textureX, textureY);
		bodyModel[47].addBox(0, 0, 0, 4, 2, 1, 0f);
		bodyModel[47].setRotationPoint(-35.0f, -2.0f, -11.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 127, 29, textureX, textureY);
		bodyModel[48].addBox(0, 0, 0, 58, 3, 6, 0f);
		bodyModel[48].setRotationPoint(-37.0f, -21.0f, -3.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 0, 45, textureX, textureY);
		bodyModel[49].addBox(0, 0, 0, 46, 18, 1, 0f);
		bodyModel[49].setRotationPoint(-31.0f, -18.0f, 10.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 133, 39, textureX, textureY);
		bodyModel[50].addBox(0, 0, 0, 46, 18, 1, 0f);
		bodyModel[50].setRotationPoint(-31.0f, -18.0f, -11.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 21, 128, textureX, textureY);
		bodyModel[51].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[51].setRotationPoint(-29.0f, -17.0f, 11.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 0, 127, textureX, textureY);
		bodyModel[52].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[52].setRotationPoint(-13.0f, -17.0f, 11.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 222, 126, textureX, textureY);
		bodyModel[53].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[53].setRotationPoint(-3.0f, -17.0f, 11.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 212, 87, textureX, textureY);
		bodyModel[54].addBox(0, 0, 0, 1, 18, 20, 0f);
		bodyModel[54].setRotationPoint(14.0f, -18.0f, -10.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 138, 86, textureX, textureY);
		bodyModel[55].addBox(0, 0, 0, 1, 18, 20, 0f);
		bodyModel[55].setRotationPoint(-31.0f, -18.0f, -10.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 0, 97, textureX, textureY);
		bodyModel[56].addBox(0, 0, 0, 1, 3, 18, 0f);
		bodyModel[56].setRotationPoint(29.0f, 2.0f, -9.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 171, 16, textureX, textureY);
		bodyModel[57].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[57].setRotationPoint(30.0f, 3.0f, -1.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 79, 79, textureX, textureY);
		bodyModel[58].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[58].setRotationPoint(30.0f, 3.0f, 6.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 9, 108, textureX, textureY);
		bodyModel[59].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[59].setRotationPoint(31.0f, 2.5f, 5.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 0, 108, textureX, textureY);
		bodyModel[60].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[60].setRotationPoint(31.0f, 2.5f, -8.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 216, 72, textureX, textureY);
		bodyModel[61].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[61].setRotationPoint(30.0f, 3.0f, -7.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 148, 125, textureX, textureY);
		bodyModel[62].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[62].setRotationPoint(-17.5f, -21.0f, 8.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 0, 122, textureX, textureY);
		bodyModel[63].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[63].setRotationPoint(-7.5f, -21.0f, 8.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 102, 121, textureX, textureY);
		bodyModel[64].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[64].setRotationPoint(-7.5f, -22.0f, 3.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 79, 121, textureX, textureY);
		bodyModel[65].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[65].setRotationPoint(-17.5f, -22.0f, 3.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 230, 78, textureX, textureY);
		bodyModel[66].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[66].setRotationPoint(-7.5f, -21.0f, -10.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 230, 73, textureX, textureY);
		bodyModel[67].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[67].setRotationPoint(-17.5f, -21.0f, -10.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 42, 70, textureX, textureY);
		bodyModel[68].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[68].setRotationPoint(-7.5f, -22.0f, -5.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 42, 65, textureX, textureY);
		bodyModel[69].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[69].setRotationPoint(-17.5f, -22.0f, -5.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 185, 72, textureX, textureY);
		bodyModel[70].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[70].setRotationPoint(2.0f, -21.0f, 4.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 33, 72, textureX, textureY);
		bodyModel[71].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[71].setRotationPoint(13.0f, -21.0f, 4.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 185, 69, textureX, textureY);
		bodyModel[72].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[72].setRotationPoint(13.0f, -21.0f, -5.0f);

		bodyModel[73] = new ModelRendererTurbo(this, 70, 68, textureX, textureY);
		bodyModel[73].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[73].setRotationPoint(2.0f, -21.0f, -5.0f);

		bodyModel[74] = new ModelRendererTurbo(this, 90, 84, textureX, textureY);
		bodyModel[74].addShapeBox(0, 0, 0, 12, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[74].setRotationPoint(2.0f, -22.0f, -5.0f);

		bodyModel[75] = new ModelRendererTurbo(this, 0, 68, textureX, textureY);
		bodyModel[75].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[75].setRotationPoint(-19.0f, -21.0f, 4.0f);

		bodyModel[76] = new ModelRendererTurbo(this, 164, 83, textureX, textureY);
		bodyModel[76].addShapeBox(0, 0, 0, 12, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[76].setRotationPoint(-30.0f, -22.0f, -5.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 90, 65, textureX, textureY);
		bodyModel[77].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[77].setRotationPoint(-30.0f, -21.0f, 4.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 70, 65, textureX, textureY);
		bodyModel[78].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[78].setRotationPoint(-19.0f, -21.0f, -5.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 0, 65, textureX, textureY);
		bodyModel[79].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[79].setRotationPoint(-30.0f, -21.0f, -5.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 0, 119, textureX, textureY);
		bodyModel[80].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[80].setRotationPoint(-1.0f, -31.0f, -4.99f);
		bodyModel[80].rotateAngleZ = -0.7853982f;

		bodyModel[81] = new ModelRendererTurbo(this, 121, 118, textureX, textureY);
		bodyModel[81].addBox(0, 0, 0, 3, 1, 10, 0f);
		bodyModel[81].setRotationPoint(6.5f, -22.5f, -5.0f);

		bodyModel[82] = new ModelRendererTurbo(this, 104, 118, textureX, textureY);
		bodyModel[82].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[82].setRotationPoint(8.0f, -22.0f, -4.99f);
		bodyModel[82].rotateAngleZ = -5.497787f;

		bodyModel[83] = new ModelRendererTurbo(this, 77, 118, textureX, textureY);
		bodyModel[83].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[83].setRotationPoint(8.0f, -22.0f, 3.99f);
		bodyModel[83].rotateAngleZ = -5.497787f;

		bodyModel[84] = new ModelRendererTurbo(this, 50, 118, textureX, textureY);
		bodyModel[84].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[84].setRotationPoint(-1.0f, -31.0f, 3.99f);
		bodyModel[84].rotateAngleZ = -0.7853982f;

		bodyModel[85] = new ModelRendererTurbo(this, 53, 78, textureX, textureY); // lampcp
		bodyModel[85].addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[85].setRotationPoint(28.65f, -4.0f, -9.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 236, 126, textureX, textureY); // lampcp
		bodyModel[86].addShapeBox(0, 0, 0, 2, 11, 7, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[86].setRotationPoint(28.0f, -11.0f, -10.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 101, 126, textureX, textureY); // lampcp
		bodyModel[87].addShapeBox(0, 0, 0, 2, 11, 7, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[87].setRotationPoint(28.0f, -11.0f, 3.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 102, 145, textureX, textureY); // lampcp
		bodyModel[88].addShapeBox(0, 0, 0, 2, 11, 6, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[88].setRotationPoint(28.0f, -11.0f, -3.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 45, 65, textureX, textureY); // lampcp
		bodyModel[89].addBox(0, 0, 0, 2, 11, 20, 0f);
		bodyModel[89].setRotationPoint(26.0f, -11.0f, -10.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 203, 63, textureX, textureY); // lampcp
		bodyModel[90].addBox(0, 0, 0, 3, 1, 20, 0f);
		bodyModel[90].setRotationPoint(23.0f, -11.0f, -10.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 189, 85, textureX, textureY); // lampcp
		bodyModel[91].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0);
		bodyModel[91].setRotationPoint(25.0f, -10.0f, -10.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 238, 11, textureX, textureY);
		bodyModel[92].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[92].setRotationPoint(-51.0f, 3.0f, -1.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 230, 64, textureX, textureY);
		bodyModel[93].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[93].setRotationPoint(-47.0f, 3.0f, 6.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 128, 106, textureX, textureY);
		bodyModel[94].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[94].setRotationPoint(-48.0f, 2.5f, 5.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 80, 106, textureX, textureY);
		bodyModel[95].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[95].setRotationPoint(-48.0f, 2.5f, -8.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 215, 64, textureX, textureY);
		bodyModel[96].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[96].setRotationPoint(-47.0f, 3.0f, -7.0f);

		bodyModel[97] = new ModelRendererTurbo(this, 235, 96, textureX, textureY);
		bodyModel[97].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[97].setRotationPoint(4.0f, -17.0f, -11.25f);

		bodyModel[98] = new ModelRendererTurbo(this, 188, 95, textureX, textureY);
		bodyModel[98].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[98].setRotationPoint(-12.0f, -17.0f, -11.25f);

		bodyModel[99] = new ModelRendererTurbo(this, 235, 50, textureX, textureY);
		bodyModel[99].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[99].setRotationPoint(-22.0f, -17.0f, -11.25f);

		bodyModel[100] = new ModelRendererTurbo(this, 31, 118, textureX, textureY); // Box 136
		bodyModel[100].addShapeBox(0, 0, 0, 5, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[100].setRotationPoint(16.0f, -4.0f, -4.0f);
		bodyModel[100].rotateAngleY = 6.2831855f;

		bodyModel[101] = new ModelRendererTurbo(this, 39, 115, textureX, textureY);
		bodyModel[101].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[101].setRotationPoint(8.0f, -39.0f, 3.99f);
		bodyModel[101].rotateAngleZ = -0.7853982f;

		bodyModel[102] = new ModelRendererTurbo(this, 21, 112, textureX, textureY);
		bodyModel[102].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[102].setRotationPoint(8.0f, -39.0f, -5.01f);
		bodyModel[102].rotateAngleZ = -0.7853982f;

		bodyModel[103] = new ModelRendererTurbo(this, 93, 109, textureX, textureY);
		bodyModel[103].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[103].setRotationPoint(-1.0f, -31.0f, 3.99f);
		bodyModel[103].rotateAngleZ = -5.497787f;

		bodyModel[104] = new ModelRendererTurbo(this, 48, 109, textureX, textureY);
		bodyModel[104].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[104].setRotationPoint(-1.0f, -31.0f, -5.01f);
		bodyModel[104].rotateAngleZ = -5.497787f;

		bodyModel[105] = new ModelRendererTurbo(this, 175, 145, textureX, textureY);
		bodyModel[105].addBox(0, 0, 0, 7, 18, 1, 0f);
		bodyModel[105].setRotationPoint(19.0f, -18.0f, -11.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 163, 125, textureX, textureY); // Box 136cp
		bodyModel[106].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[106].setRotationPoint(16.0f, -11.0f, -4.0f);
		bodyModel[106].rotateAngleY = 6.2831855f;

		bodyModel[107] = new ModelRendererTurbo(this, 25, 65, textureX, textureY);
		bodyModel[107].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[107].setRotationPoint(7.0f, -39.5f, -7.01f);

		bodyModel[108] = new ModelRendererTurbo(this, 205, 64, textureX, textureY);
		bodyModel[108].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[108].setRotationPoint(7.0f, -39.5f, -8.01f);

		bodyModel[109] = new ModelRendererTurbo(this, 164, 62, textureX, textureY);
		bodyModel[109].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[109].setRotationPoint(7.0f, -39.5f, 6.99f);

		bodyModel[110] = new ModelRendererTurbo(this, 230, 61, textureX, textureY);
		bodyModel[110].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[110].setRotationPoint(7.0f, -38.5f, 6.99f);

		bodyModel[111] = new ModelRendererTurbo(this, 215, 61, textureX, textureY);
		bodyModel[111].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[111].setRotationPoint(7.0f, -38.5f, -8.01f);

		bodyModel[112] = new ModelRendererTurbo(this, 111, 106, textureX, textureY);
		bodyModel[112].addBox(0, 0, 0, 3, 1, 10, 0f);
		bodyModel[112].setRotationPoint(-25.5f, -22.5f, -5.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 21, 109, textureX, textureY);
		bodyModel[113].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[113].setRotationPoint(-33.0f, -31.0f, -4.99f);
		bodyModel[113].rotateAngleZ = -0.7853982f;

		bodyModel[114] = new ModelRendererTurbo(this, 93, 106, textureX, textureY);
		bodyModel[114].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[114].setRotationPoint(-33.0f, -31.0f, 3.99f);
		bodyModel[114].rotateAngleZ = -0.7853982f;

		bodyModel[115] = new ModelRendererTurbo(this, 161, 101, textureX, textureY);
		bodyModel[115].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[115].setRotationPoint(-33.0f, -31.0f, 3.99f);
		bodyModel[115].rotateAngleZ = -5.497787f;

		bodyModel[116] = new ModelRendererTurbo(this, 93, 99, textureX, textureY);
		bodyModel[116].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[116].setRotationPoint(-33.0f, -31.0f, -5.01f);
		bodyModel[116].rotateAngleZ = -5.497787f;

		bodyModel[117] = new ModelRendererTurbo(this, 161, 98, textureX, textureY);
		bodyModel[117].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[117].setRotationPoint(-24.0f, -22.0f, -4.99f);
		bodyModel[117].rotateAngleZ = -5.497787f;

		bodyModel[118] = new ModelRendererTurbo(this, 93, 96, textureX, textureY);
		bodyModel[118].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[118].setRotationPoint(-24.0f, -39.0f, -5.01f);
		bodyModel[118].rotateAngleZ = -0.7853982f;

		bodyModel[119] = new ModelRendererTurbo(this, 161, 95, textureX, textureY);
		bodyModel[119].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[119].setRotationPoint(-24.0f, -22.0f, 3.99f);
		bodyModel[119].rotateAngleZ = -5.497787f;

		bodyModel[120] = new ModelRendererTurbo(this, 25, 81, textureX, textureY);
		bodyModel[120].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[120].setRotationPoint(-24.0f, -39.0f, 3.99f);
		bodyModel[120].rotateAngleZ = -0.7853982f;

		bodyModel[121] = new ModelRendererTurbo(this, 171, 0, textureX, textureY);
		bodyModel[121].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[121].setRotationPoint(-25.0f, -39.5f, -7.01f);

		bodyModel[122] = new ModelRendererTurbo(this, 205, 61, textureX, textureY);
		bodyModel[122].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[122].setRotationPoint(-25.0f, -39.5f, 6.99f);

		bodyModel[123] = new ModelRendererTurbo(this, 164, 59, textureX, textureY);
		bodyModel[123].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[123].setRotationPoint(-25.0f, -39.5f, -8.01f);

		bodyModel[124] = new ModelRendererTurbo(this, 126, 55, textureX, textureY);
		bodyModel[124].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[124].setRotationPoint(-25.0f, -38.5f, 6.99f);

		bodyModel[125] = new ModelRendererTurbo(this, 235, 44, textureX, textureY);
		bodyModel[125].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[125].setRotationPoint(-25.0f, -38.5f, -8.01f);

		bodyModel[126] = new ModelRendererTurbo(this, 75, 97, textureX, textureY);
		bodyModel[126].addBox(0, 0, 0, 1, 3, 3, 0f);
		bodyModel[126].setRotationPoint(-47.0f, -9.0f, -1.5f);

		bodyModel[127] = new ModelRendererTurbo(this, 128, 51, textureX, textureY);
		bodyModel[127].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[127].setRotationPoint(-47.5f, -8.5f, 0.5f);

		bodyModel[128] = new ModelRendererTurbo(this, 95, 49, textureX, textureY);
		bodyModel[128].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[128].setRotationPoint(-47.5f, -8.0f, -0.5f);

		bodyModel[129] = new ModelRendererTurbo(this, 95, 45, textureX, textureY);
		bodyModel[129].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[129].setRotationPoint(-47.5f, -9.0f, -1.5f);

		bodyModel[130] = new ModelRendererTurbo(this, 25, 72, textureX, textureY); // lamp
		bodyModel[130].addBox(0, 0, 0, 2, 3, 3, 0f);
		bodyModel[130].setRotationPoint(-47.0f, -4.0f, -9.0f);

		bodyModel[131] = new ModelRendererTurbo(this, 85, 59, textureX, textureY);
		bodyModel[131].addBox(0, 0, 0, 34, 14, 10, 0f);
		bodyModel[131].setRotationPoint(-25.0f, -14.0f, -5.0f);

		bodyModel[132] = new ModelRendererTurbo(this, 152, 25, textureX, textureY);
		bodyModel[132].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8);
		bodyModel[132].setRotationPoint(8.0f, -39.01f, 2.99f);
		bodyModel[132].rotateAngleZ = -0.7853982f;

		bodyModel[133] = new ModelRendererTurbo(this, 125, 25, textureX, textureY);
		bodyModel[133].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -1, -1, 0, 7, 0, 0, -8, -1, 0, 0, 0, 0, -1, -1, 0, 7, 0, 0, -8, -1, 0, 0);
		bodyModel[133].setRotationPoint(-24.0f, -39.01f, 2.99f);
		bodyModel[133].rotateAngleZ = -0.7853982f;

		bodyModel[134] = new ModelRendererTurbo(this, 219, 24, textureX, textureY);
		bodyModel[134].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8);
		bodyModel[134].setRotationPoint(-1.0f, -31.01f, 2.99f);
		bodyModel[134].rotateAngleZ = 0.7853982f;

		bodyModel[135] = new ModelRendererTurbo(this, 192, 24, textureX, textureY);
		bodyModel[135].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8);
		bodyModel[135].setRotationPoint(-33.0f, -31.01f, 2.99f);
		bodyModel[135].rotateAngleZ = 0.7853982f;

		bodyModel[136] = new ModelRendererTurbo(this, 44, 97, textureX, textureY);
		bodyModel[136].addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, -2.82f, 0, 0, -2.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, 0, 0, -1.9f, 0, 0, 0, 0, 0);
		bodyModel[136].setRotationPoint(28.0f, -10.0f, 10.0f);

		bodyModel[137] = new ModelRendererTurbo(this, 174, 69, textureX, textureY);
		bodyModel[137].addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, -2.9f, 0, 0, -2.9f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[137].setRotationPoint(28.0f, -5.0f, 10.0f);

		bodyModel[138] = new ModelRendererTurbo(this, 25, 65, textureX, textureY);
		bodyModel[138].addShapeBox(0, 0, 0, 4, 5, 1, 0, -2.9f, 0, 0, 0, 0, 0, 0, 0, 0, -2.9f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[138].setRotationPoint(-48.0f, -5.0f, 10.0f);

		bodyModel[139] = new ModelRendererTurbo(this, 245, 61, textureX, textureY);
		bodyModel[139].addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, -2.9f, 0, 0, -2.9f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[139].setRotationPoint(28.0f, -5.0f, -11.0f);

		bodyModel[140] = new ModelRendererTurbo(this, 118, 45, textureX, textureY);
		bodyModel[140].addShapeBox(0, 0, 0, 4, 5, 1, 0, -2.9f, 0, 0, 0, 0, 0, 0, 0, 0, -2.9f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[140].setRotationPoint(-48.0f, -5.0f, -11.0f);

		bodyModel[141] = new ModelRendererTurbo(this, 212, 85, textureX, textureY); // lampcp
		bodyModel[141].addShapeBox(0, 0, 0, 2, 11, 7, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[141].setRotationPoint(-46.0f, -11.0f, 3.0f);

		bodyModel[142] = new ModelRendererTurbo(this, 138, 84, textureX, textureY); // lampcp
		bodyModel[142].addShapeBox(0, 0, 0, 2, 11, 7, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[142].setRotationPoint(-46.0f, -11.0f, -10.0f);

		bodyModel[143] = new ModelRendererTurbo(this, 19, 142, textureX, textureY); // lampcp
		bodyModel[143].addShapeBox(0, 0, 0, 2, 11, 6, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[143].setRotationPoint(-46.0f, -11.0f, -3.0f);

		bodyModel[144] = new ModelRendererTurbo(this, 208, 39, textureX, textureY); // lampcp
		bodyModel[144].addBox(0, 0, 0, 3, 1, 20, 0f);
		bodyModel[144].setRotationPoint(-42.0f, -11.0f, -10.0f);

		bodyModel[145] = new ModelRendererTurbo(this, 115, 84, textureX, textureY); // lampcp
		bodyModel[145].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0);
		bodyModel[145].setRotationPoint(-42.0f, -10.0f, -10.0f);

		bodyModel[146] = new ModelRendererTurbo(this, 230, 61, textureX, textureY); // Box 136cp
		bodyModel[146].addBox(0, 0, 0, 3, 3, 8, 0f);
		bodyModel[146].setRotationPoint(17.0f, -3.0f, -4.0f);
		bodyModel[146].rotateAngleY = 6.2831855f;

		bodyModel[147] = new ModelRendererTurbo(this, 188, 0, textureX, textureY); // Box 136cp
		bodyModel[147].addBox(0, 0, 0, 3, 3, 8, 0f);
		bodyModel[147].setRotationPoint(-36.0f, -3.0f, -4.0f);
		bodyModel[147].rotateAngleY = 6.2831855f;

		bodyModel[148] = new ModelRendererTurbo(this, 164, 59, textureX, textureY); // Box 136cp
		bodyModel[148].addShapeBox(0, 0, 0, 5, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[148].setRotationPoint(-37.0f, -4.0f, -4.0f);
		bodyModel[148].rotateAngleY = 6.2831855f;

		bodyModel[149] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 136cp
		bodyModel[149].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[149].setRotationPoint(-33.0f, -11.0f, -4.0f);
		bodyModel[149].rotateAngleY = 6.2831855f;

		bodyModel[150] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
		bodyModel[150].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.82f, -1, 0, -1.82f, -1, 0, 0, 0, 0, 0, 0, 0, -1.82f, 0, 0, -1.82f, 0, 0, 0, 0, 0);
		bodyModel[150].setRotationPoint(28.0f, -11.0f, -11.0f);

		bodyModel[151] = new ModelRendererTurbo(this, 199, 85, textureX, textureY);
		bodyModel[151].addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, -2.82f, 0, 0, -2.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, 0, 0, -1.9f, 0, 0, 0, 0, 0);
		bodyModel[151].setRotationPoint(28.0f, -10.0f, -11.0f);

		bodyModel[152] = new ModelRendererTurbo(this, 125, 84, textureX, textureY);
		bodyModel[152].addShapeBox(0, 0, 0, 3, 5, 1, 0, -2.82f, 0, 0, 0, 0, 0, 0, 0, 0, -2.82f, 0, 0, -1.9f, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, 0, 0);
		bodyModel[152].setRotationPoint(-47.0f, -10.0f, 10.0f);

		bodyModel[153] = new ModelRendererTurbo(this, 186, 19, textureX, textureY);
		bodyModel[153].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.82f, -1, 0, 0, 0, 0, 0, 0, 0, -1.82f, -1, 0, -1.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.82f, 0, 0);
		bodyModel[153].setRotationPoint(-46.0f, -11.0f, 10.0f);

		bodyModel[154] = new ModelRendererTurbo(this, 90, 84, textureX, textureY);
		bodyModel[154].addShapeBox(0, 0, 0, 3, 5, 1, 0, -2.82f, 0, 0, 0, 0, 0, 0, 0, 0, -2.82f, 0, 0, -1.9f, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, 0, 0);
		bodyModel[154].setRotationPoint(-47.0f, -10.0f, -11.0f);

		bodyModel[155] = new ModelRendererTurbo(this, 186, 16, textureX, textureY);
		bodyModel[155].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.82f, -1, 0, 0, 0, 0, 0, 0, 0, -1.82f, -1, 0, -1.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.82f, 0, 0);
		bodyModel[155].setRotationPoint(-46.0f, -11.0f, -11.0f);

		bodyModel[156] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // lampcp
		bodyModel[156].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[156].setRotationPoint(21.0f, -20.75f, 2.5f);

		bodyModel[157] = new ModelRendererTurbo(this, 248, 42, textureX, textureY); // lampcp
		bodyModel[157].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0.2f, -0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.2f, -0.2f, 0, -0.2f, 0.2f, 0, -0.5f, 0);
		bodyModel[157].setRotationPoint(24.0f, -20.75f, 2.5f);

		bodyModel[158] = new ModelRendererTurbo(this, 0, 81, textureX, textureY); // lampcp
		bodyModel[158].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[158].setRotationPoint(21.0f, -20.75f, -4.0f);

		bodyModel[159] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // lampcp
		bodyModel[159].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0.2f, -0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.2f, -0.2f, 0, -0.2f, 0.2f, 0, -0.5f, 0);
		bodyModel[159].setRotationPoint(24.0f, -20.75f, -4.0f);

		bodyModel[160] = new ModelRendererTurbo(this, 53, 75, textureX, textureY); // lampcp
		bodyModel[160].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[160].setRotationPoint(-40.0f, -20.75f, 2.5f);

		bodyModel[161] = new ModelRendererTurbo(this, 13, 15, textureX, textureY); // lampcp
		bodyModel[161].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[161].setRotationPoint(-40.0f, -20.75f, -4.0f);

		bodyModel[162] = new ModelRendererTurbo(this, 248, 39, textureX, textureY); // lampcp
		bodyModel[162].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0.2f, 0.2f, 0, -0.2f, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.2f, 0.2f);
		bodyModel[162].setRotationPoint(-41.0f, -20.75f, 2.5f);

		bodyModel[163] = new ModelRendererTurbo(this, 125, 39, textureX, textureY); // lampcp
		bodyModel[163].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0.2f, 0.2f, 0, -0.2f, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.2f, 0.2f);
		bodyModel[163].setRotationPoint(-41.0f, -20.75f, -4.0f);

		bodyModel[164] = new ModelRendererTurbo(this, 193, 0, textureX, textureY);
		bodyModel[164].addBox(0, 0, 0, 13, 5, 18, 0f);
		bodyModel[164].setRotationPoint(-10.5f, 2.0f, -9.0f);

		bodyModel[165] = new ModelRendererTurbo(this, 174, 59, textureX, textureY);
		bodyModel[165].addBox(0, 0, 0, 6, 5, 18, 0f);
		bodyModel[165].setRotationPoint(-17.5f, 2.0f, -9.0f);

		bodyModel[166] = new ModelRendererTurbo(this, 60, 160, textureX, textureY); // unnamedcp
		bodyModel[166].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[166].setRotationPoint(23.0f, -18.0f, 12.0f);

		bodyModel[167] = new ModelRendererTurbo(this, 57, 160, textureX, textureY); // unnamedcp
		bodyModel[167].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[167].setRotationPoint(19.0f, -18.0f, 12.0f);

		bodyModel[168] = new ModelRendererTurbo(this, 54, 160, textureX, textureY); // unnamedcp
		bodyModel[168].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[168].setRotationPoint(-27.0f, -18.0f, 12.0f);

		bodyModel[169] = new ModelRendererTurbo(this, 51, 160, textureX, textureY); // unnamed
		bodyModel[169].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[169].setRotationPoint(-31.0f, -18.0f, 12.0f);

		bodyModel[170] = new ModelRendererTurbo(this, 32, 160, textureX, textureY); // unnamedcp
		bodyModel[170].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[170].setRotationPoint(-31.0f, -18.0f, -10.5f);

		bodyModel[171] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // unnamedcp
		bodyModel[171].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[171].setRotationPoint(-27.0f, -18.0f, -10.5f);

		bodyModel[172] = new ModelRendererTurbo(this, 172, 150, textureX, textureY); // unnamedcp
		bodyModel[172].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[172].setRotationPoint(19.0f, -18.0f, -10.5f);

		bodyModel[173] = new ModelRendererTurbo(this, 169, 150, textureX, textureY); // unnamedcp
		bodyModel[173].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[173].setRotationPoint(23.0f, -18.0f, -10.5f);

		bodyModel[174] = new ModelRendererTurbo(this, 70, 79, textureX, textureY);
		bodyModel[174].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[174].setRotationPoint(15.0f, 2.0f, 11.0f);

		bodyModel[175] = new ModelRendererTurbo(this, 11, 65, textureX, textureY);
		bodyModel[175].addBox(0, 0, 0, 4, 6, 0, 0f);
		bodyModel[175].setRotationPoint(-35.0f, 2.0f, 11.0f);

		bodyModel[176] = new ModelRendererTurbo(this, 183, 59, textureX, textureY);
		bodyModel[176].addBox(0, 0, 0, 4, 6, 0, 0f);
		bodyModel[176].setRotationPoint(15.0f, 2.0f, -11.0f);

		bodyModel[177] = new ModelRendererTurbo(this, 246, 24, textureX, textureY);
		bodyModel[177].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[177].setRotationPoint(-35.0f, 2.0f, -11.0f);

		bodyModel[178] = new ModelRendererTurbo(this, 202, 12, textureX, textureY);
		bodyModel[178].addBox(0, 0, 0, 2, 1, 2, 0f);
		bodyModel[178].setRotationPoint(15.0f, 2.0f, -1.0f);

		bodyModel[179] = new ModelRendererTurbo(this, 13, 11, textureX, textureY);
		bodyModel[179].addBox(0, 0, 0, 2, 1, 2, 0f);
		bodyModel[179].setRotationPoint(-32.0f, 2.0f, -1.0f);

		bodyModel[180] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // unnamedcp
		bodyModel[180].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[180].setRotationPoint(28.8f, -2.01f, 7.01f);

		bodyModel[181] = new ModelRendererTurbo(this, 0, 11, textureX, textureY); // unnamedcp
		bodyModel[181].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[181].setRotationPoint(28.8f, -2.01f, -7.99f);

		bodyModel[182] = new ModelRendererTurbo(this, 248, 3, textureX, textureY); // unnamedcp
		bodyModel[182].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[182].setRotationPoint(-47.2f, -2.01f, 7.01f);

		bodyModel[183] = new ModelRendererTurbo(this, 248, 0, textureX, textureY); // unnamedcp
		bodyModel[183].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[183].setRotationPoint(-47.2f, -2.01f, -7.99f);

		bodyModel[184] = new ModelRendererTurbo(this, 235, 85, textureX, textureY);
		bodyModel[184].addShapeBox(0, 0, 0, 2, 2, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[184].setRotationPoint(-47.0f, 0.0f, -11.0f);

		bodyModel[185] = new ModelRendererTurbo(this, 158, 141, textureX, textureY);
		bodyModel[185].addBox(0, 0, 0, 2, 2, 6, 0f);
		bodyModel[185].setRotationPoint(-47.0f, 0.0f, -3.0f);

		bodyModel[186] = new ModelRendererTurbo(this, 235, 39, textureX, textureY);
		bodyModel[186].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[186].setRotationPoint(-47.0f, 0.0f, 3.0f);

		bodyModel[187] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
		bodyModel[187].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[187].setRotationPoint(29.0f, 0.0f, 3.0f);

		bodyModel[188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[188].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[188].setRotationPoint(29.0f, 0.0f, -11.0f);

		bodyModel[189] = new ModelRendererTurbo(this, 220, 139, textureX, textureY);
		bodyModel[189].addBox(0, 0, 0, 2, 2, 6, 0f);
		bodyModel[189].setRotationPoint(29.0f, 0.0f, -3.0f);

		bodyModel[190] = new ModelRendererTurbo(this, 72, 96, textureX, textureY);
		bodyModel[190].addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[190].setRotationPoint(-46.0f, 2.0f, -9.0f);

		bodyModel[191] = new ModelRendererTurbo(this, 235, 39, textureX, textureY);
		bodyModel[191].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[191].setRotationPoint(-45.0f, 2.0f, -11.0f);

		bodyModel[192] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
		bodyModel[192].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[192].setRotationPoint(-45.0f, 2.0f, 10.0f);

		bodyModel[193] = new ModelRendererTurbo(this, 250, 29, textureX, textureY);
		bodyModel[193].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[193].setRotationPoint(28.0f, 2.0f, 10.0f);

		bodyModel[194] = new ModelRendererTurbo(this, 125, 28, textureX, textureY);
		bodyModel[194].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[194].setRotationPoint(28.0f, 2.0f, -11.0f);

		bodyModel[195] = new ModelRendererTurbo(this, 179, 7, textureX, textureY);
		bodyModel[195].addShapeBox(0, 0, 0, 1, 3, 1, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.4f, 0, 0, 0, 0, 0);
		bodyModel[195].setRotationPoint(-47.0f, 4.0f, 8.0f);

		bodyModel[196] = new ModelRendererTurbo(this, 171, 7, textureX, textureY);
		bodyModel[196].addShapeBox(0, 0, 0, 1, 3, 1, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.4f, 0, 0, 0, 0, 0);
		bodyModel[196].setRotationPoint(-47.0f, 4.0f, -9.0f);

		bodyModel[197] = new ModelRendererTurbo(this, 238, 0, textureX, textureY);
		bodyModel[197].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[197].setRotationPoint(29.0f, 2.0f, 9.0f);

		bodyModel[198] = new ModelRendererTurbo(this, 203, 0, textureX, textureY);
		bodyModel[198].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[198].setRotationPoint(29.0f, 2.0f, -11.0f);

		bodyModel[199] = new ModelRendererTurbo(this, 188, 0, textureX, textureY);
		bodyModel[199].addShapeBox(0, 0, 0, 1, 3, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[199].setRotationPoint(-46.0f, 2.0f, -11.0f);

		bodyModel[200] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[200].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[200].setRotationPoint(-46.0f, 2.0f, 9.0f);

		bodyModel[201] = new ModelRendererTurbo(this, 13, 3, textureX, textureY);
		bodyModel[201].addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[201].setRotationPoint(-35.0f, 6.0f, -11.0f);

		bodyModel[202] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		bodyModel[202].addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[202].setRotationPoint(15.0f, 6.0f, 11.0f);

		bodyModel[203] = new ModelRendererTurbo(this, 171, 0, textureX, textureY);
		bodyModel[203].addBox(0, 0, 0, 1, 1, 5, 0f);
		bodyModel[203].setRotationPoint(-47.0f, -3.0f, -2.5f);

		bodyModel[204] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // lampcp
		bodyModel[204].addBox(0, 0, 0, 2, 11, 20, 0f);
		bodyModel[204].setRotationPoint(-44.0f, -11.0f, -10.0f);

		bodyModel[205] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
		bodyModel[205].addShapeBox(0, 0, 0, 58, 1, 8, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[205].setRotationPoint(-37.0f, -19.0f, 3.0f);

		bodyModel[206] = new ModelRendererTurbo(this, 0, 97, textureX, textureY); // unnamedcp
		bodyModel[206].addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, -1, 0, 0, -3, 0, -1, -3, 0, -0.7f, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[206].setRotationPoint(-47.0f, 6.0f, 2.0f);

		bodyModel[207] = new ModelRendererTurbo(this, 0, 97, textureX, textureY); // unnamedcp
		bodyModel[207].addShapeBox(0, 0, 0, 1, 3, 7, 0, -0.7f, 0, 0, -1, -3, 0, 0, -3, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[207].setRotationPoint(-47.0f, 6.0f, -9.0f);

		bodyModel[208] = new ModelRendererTurbo(this, 0, 97, textureX, textureY); // unnamedcp
		bodyModel[208].addShapeBox(0, 0, 0, 1, 3, 7, 0, -1, -3, 0, -0.7f, 0, 0, 0, -1, 0, 0, -3, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[208].setRotationPoint(30.0f, 6.0f, -9.0f);

		bodyModel[209] = new ModelRendererTurbo(this, 0, 97, textureX, textureY); // unnamedcp
		bodyModel[209].addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, -3, 0, 0, -1, 0, -0.7f, 0, 0, -1, -3, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[209].setRotationPoint(30.0f, 6.0f, 2.0f);

		bodyModel[210] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
		bodyModel[210].addShapeBox(0, 0, 0, 58, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[210].setRotationPoint(-37.0f, -19.0f, -11.0f);

		bodyModel[211] = new ModelRendererTurbo(this, 179, 0, textureX, textureY);
		bodyModel[211].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0);
		bodyModel[211].setRotationPoint(30.0f, 4.0f, 8.0f);

		bodyModel[212] = new ModelRendererTurbo(this, 171, 0, textureX, textureY);
		bodyModel[212].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0);
		bodyModel[212].setRotationPoint(30.0f, 4.0f, -9.0f);

		flipAll();
	}
	// ---- wozki ----
	private static final float BOGIE_FRONT_X = 1.175F;   // przedni wozek (bloki)
	private static final float BOGIE_REAR_X  = -1.65F; // tylny wozek (bloki)
	private static final float BOGIE_Y       = 0F;     // wysokosc wozkow

	private final Model4E_Bogie bogie = new Model4E_Bogie();

	@Override
	public void render(net.minecraft.entity.Entity entity, float f0, float f1, float f2, float f3, float f4, float scale) {
		super.render(entity, f0, f1, f2, f3, f4, scale); // pudlo

		// wozek ma wlasna teksture
		tmt.Tessellator.bindTexture(new net.minecraft.util.ResourceLocation(
				trainaddon.common.library.Info.modID, "textures/trains/Locomotives/Electric/4E_/4E_bogie.png"));

		org.lwjgl.opengl.GL11.glPushMatrix();
		org.lwjgl.opengl.GL11.glTranslatef(BOGIE_FRONT_X, BOGIE_Y, 0F);
		bogie.render(entity, f0, f1, f2, f3, f4, scale);
		org.lwjgl.opengl.GL11.glPopMatrix();

		org.lwjgl.opengl.GL11.glPushMatrix();
		org.lwjgl.opengl.GL11.glTranslatef(BOGIE_REAR_X, BOGIE_Y, 0F);
		bogie.render(entity, f0, f1, f2, f3, f4, scale);
		org.lwjgl.opengl.GL11.glPopMatrix();
	}
}
