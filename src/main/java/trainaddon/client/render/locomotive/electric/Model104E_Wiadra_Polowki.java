//FMT-Marker DFM-1.0
//Creator: Unregistered Account

package trainaddon.client.render.locomotive.electric;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.7 &copy; 2026 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model104E_Wiadra_Polowki extends ModelConverter {

	private int textureX = 256;
	private int textureY = 256;

	public Model104E_Wiadra_Polowki(){
		bodyModel = new ModelRendererTurbo[274];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		bodyModel[0].addBox(0, 0, 0, 78, 3, 22, 0f);
		bodyModel[0].setRotationPoint(-38.2f, -1.0f, -11.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 171, 111, textureX, textureY); // Box 14
		bodyModel[1].addBox(0, 0, 0, 3, 2, 3, 0f);
		bodyModel[1].setRotationPoint(-41.0375f, -18.7f, -1.5f);

		bodyModel[2] = new ModelRendererTurbo(this, 0, 26, textureX, textureY); // Box 17
		bodyModel[2].addBox(0.5f, 0, 0, 78, 3, 16, 0f);
		bodyModel[2].setRotationPoint(-38.7f, -18.5f, -8.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 48, 109, textureX, textureY);
		bodyModel[3].addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -1, -7, 0, -1, -7, 0, 0, 0, 0, 0, 0, 0.3f, 0, -7, 0.3f, 0, 0, 0, 0, 0, 0.3f, 0);
		bodyModel[3].setRotationPoint(-41.0375f, -20.0f, -1.5f);

		bodyModel[4] = new ModelRendererTurbo(this, 197, 82, textureX, textureY); // Box 10cp
		bodyModel[4].addShapeBox(0, 0, 0, 3, 5, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(-41.2f, -1.0f, -11.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 163, 145, textureX, textureY);
		bodyModel[5].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 3, 0, 0, 3, 0, 21, 0, 0, 21, 0, 1, 0, 0, 1, 0, 0, 1, 21, 0, 1, 21);
		bodyModel[5].setRotationPoint(-38.2f, 2.0f, -11.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 168, 76, textureX, textureY);
		bodyModel[6].addBox(0, 0, 0, 3, 5, 22, 0f);
		bodyModel[6].setRotationPoint(39.8f, -1.0f, -11.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 145, 144, textureX, textureY);
		bodyModel[7].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 3, 0, 0, 3, 0, 21, 0, 0, 21, 0, 1, 0, 1, 1, 0, 1, 1, 21, 0, 1, 21);
		bodyModel[7].setRotationPoint(39.8f, 2.0f, 11.0f);
		bodyModel[7].rotateAngleY = -3.1415927f;

		bodyModel[8] = new ModelRendererTurbo(this, 126, 111, textureX, textureY);
		bodyModel[8].addBox(0, 0, 0, 3, 2, 3, 0f);
		bodyModel[8].setRotationPoint(39.6625f, -18.5f, -1.5f);

		bodyModel[9] = new ModelRendererTurbo(this, 29, 109, textureX, textureY);
		bodyModel[9].addShapeBox(0, 0, 0, 8, 1, 1, 0, -7, 0, -1, 0, 0, -1, 0, 0, 0, -7, 0, 0, -7, 0.3f, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0);
		bodyModel[9].setRotationPoint(34.6625f, -19.8f, -1.5f);

		bodyModel[10] = new ModelRendererTurbo(this, 230, 53, textureX, textureY);
		bodyModel[10].addShapeBox(0, 0, 0, 8, 1, 1, 0, -8, 0, 0, -1, 0, 0, 0, 0, -1, -7, 0, -1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, -7, 0.3f, 0);
		bodyModel[10].setRotationPoint(34.6625f, -19.8f, 0.5f);

		bodyModel[11] = new ModelRendererTurbo(this, 173, 38, textureX, textureY);
		bodyModel[11].addShapeBox(0, 0, 0, 8, 1, 1, 0, -7, 0, 0, 0, 0, 0, 0, 0, 0, -7, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0);
		bodyModel[11].setRotationPoint(34.6625f, -19.8f, -0.5f);

		bodyModel[12] = new ModelRendererTurbo(this, 210, 37, textureX, textureY);
		bodyModel[12].addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0);
		bodyModel[12].setRotationPoint(-41.0375f, -20.0f, -0.5f);

		bodyModel[13] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
		bodyModel[13].addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, -7, 0, 0, -7, 0, -1, 0, 0, -1, 0, 0.3f, 0, 0, 0, 0, -7, 0.3f, 0, 0, 0.3f, 0);
		bodyModel[13].setRotationPoint(-41.0375f, -20.0f, 0.5f);

		bodyModel[14] = new ModelRendererTurbo(this, 18, 116, textureX, textureY);
		bodyModel[14].addBox(0, 0, 0, 5, 2, 3, 0f);
		bodyModel[14].setRotationPoint(-15.0f, -21.099998f, -2.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 197, 92, textureX, textureY);
		bodyModel[15].addShapeBox(0, 0, 0, 6, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[15].setRotationPoint(-15.5f, -19.099998f, -2.5f);

		bodyModel[16] = new ModelRendererTurbo(this, 214, 118, textureX, textureY);
		bodyModel[16].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.5f, 0, 0);
		bodyModel[16].setRotationPoint(7.0f, -19.599998f, -6.5f);

		bodyModel[17] = new ModelRendererTurbo(this, 234, 130, textureX, textureY);
		bodyModel[17].addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(42.8f, -1.0f, -1.5f);

		bodyModel[18] = new ModelRendererTurbo(this, 113, 76, textureX, textureY);
		bodyModel[18].addBox(0, 0, 0, 5, 5, 22, 0f);
		bodyModel[18].setRotationPoint(3.0f, 2.0f, -11.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 179, 4, textureX, textureY);
		bodyModel[19].addBox(0, 0, 0, 8, 4, 22, 0f);
		bodyModel[19].setRotationPoint(-7.0f, 2.0f, -11.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 0, 77, textureX, textureY);
		bodyModel[20].addShapeBox(0, 0, 0, 66, 15, 1, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[20].setRotationPoint(-32.2f, -16.0f, -11.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 73, 159, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, 0, 8, 15, 1, 0, -0.1f, 0, -0.6f, 0.01f, 0, -1.44f, 0.01f, 0, 0.5f, -0.1f, 0, 0, -0.1f, 0, 0, 0.1f, 0, 0, 0, 0, 0, -0.1f, 0, 0);
		bodyModel[21].setRotationPoint(33.7f, -16.0f, -11.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 163, 82, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 7, 3, 3, 0, 0, -2.4f, -0.6f, -1, -2.4f, -1.15f, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.6f, -1, 0, -1.2f, -1, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(33.8f, -19.0f, -11.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 101, 104, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 2, 3, 8, 0, -0.1f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, -1.1f, 1.85f, 0.1f, -1.1f, 1.5f, 0.7f, -1.1f, 0, 0, -1, 0);
		bodyModel[23].setRotationPoint(39.7f, -18.5f, -8.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 62, 116, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, 0.05f, -0.1f, -0.4f, -0.3f, -0.2f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.09f, 0, -0.24f, 0, 0, 0, 0, 0, 0);
		bodyModel[24].setRotationPoint(39.8f, -17.0f, -9.8f);

		bodyModel[25] = new ModelRendererTurbo(this, 140, 144, textureX, textureY);
		bodyModel[25].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[25].setRotationPoint(27.5f, -19.599998f, 4.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 131, 144, textureX, textureY);
		bodyModel[26].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[26].setRotationPoint(27.5f, -19.599998f, -5.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 220, 31, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(23.5f, -20.599998f, -5.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 189, 31, textureX, textureY);
		bodyModel[28].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[28].setRotationPoint(-26.5f, -20.599998f, -5.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 126, 144, textureX, textureY);
		bodyModel[29].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[29].setRotationPoint(-26.5f, -19.599998f, 4.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 78, 143, textureX, textureY);
		bodyModel[30].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[30].setRotationPoint(-26.5f, -19.599998f, -5.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 245, 100, textureX, textureY); // lampcp
		bodyModel[31].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[31].setRotationPoint(36.9f, -19.05f, 3.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 73, 143, textureX, textureY); // lampcp
		bodyModel[32].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0.2f, -0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.2f, -0.2f, 0, -0.2f, 0.2f, 0, -0.5f, 0);
		bodyModel[32].setRotationPoint(40.9f, -19.05f, 3.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 101, 98, textureX, textureY); // lampcp
		bodyModel[33].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[33].setRotationPoint(36.9f, -19.05f, -4.5f);

		bodyModel[34] = new ModelRendererTurbo(this, 68, 143, textureX, textureY); // lampcp
		bodyModel[34].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0.2f, -0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.2f, -0.2f, 0, -0.2f, 0.2f, 0, -0.5f, 0);
		bodyModel[34].setRotationPoint(40.9f, -19.05f, -4.5f);

		bodyModel[35] = new ModelRendererTurbo(this, 245, 97, textureX, textureY); // lampcp
		bodyModel[35].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[35].setRotationPoint(-39.2f, -19.05f, 3.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 245, 0, textureX, textureY); // lampcp
		bodyModel[36].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[36].setRotationPoint(-39.2f, -19.05f, -4.5f);

		bodyModel[37] = new ModelRendererTurbo(this, 63, 143, textureX, textureY); // lampcp
		bodyModel[37].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0.2f, 0.2f, 0, -0.2f, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.2f, 0.2f);
		bodyModel[37].setRotationPoint(-40.2f, -19.05f, 3.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 51, 143, textureX, textureY); // lampcp
		bodyModel[38].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0.2f, 0.2f, 0, -0.2f, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.2f, 0.2f);
		bodyModel[38].setRotationPoint(-40.2f, -19.05f, -4.5f);

		bodyModel[39] = new ModelRendererTurbo(this, 46, 143, textureX, textureY);
		bodyModel[39].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[39].setRotationPoint(6.5f, -19.599998f, 4.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 6, 139, textureX, textureY);
		bodyModel[40].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[40].setRotationPoint(-3.5f, -19.599998f, 4.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 61, 138, textureX, textureY);
		bodyModel[41].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[41].setRotationPoint(-22.5f, -19.599998f, 4.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 135, 73, textureX, textureY);
		bodyModel[42].addShapeBox(0, 0, 0, 45, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[42].setRotationPoint(-21.5f, -20.599998f, 4.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 171, 104, textureX, textureY);
		bodyModel[43].addBox(0, 0, 0, 3, 3, 3, 0f);
		bodyModel[43].setRotationPoint(-1.5f, -21.599998f, -2.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 135, 70, textureX, textureY);
		bodyModel[44].addShapeBox(0, 0, 0, 45, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[44].setRotationPoint(-21.5f, -20.599998f, -5.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 56, 138, textureX, textureY);
		bodyModel[45].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[45].setRotationPoint(-9.5f, -19.599998f, -5.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 6, 135, textureX, textureY);
		bodyModel[46].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[46].setRotationPoint(-0.5f, -19.599998f, -5.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 0, 136, textureX, textureY);
		bodyModel[47].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[47].setRotationPoint(-0.5f, -20.599998f, -4.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 60, 99, textureX, textureY);
		bodyModel[48].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[48].setRotationPoint(1.5f, -20.599998f, -1.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 18, 122, textureX, textureY);
		bodyModel[49].addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[49].setRotationPoint(6.5f, -20.599998f, 1.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 60, 131, textureX, textureY);
		bodyModel[50].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[50].setRotationPoint(23.5f, -19.599998f, 4.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 205, 127, textureX, textureY);
		bodyModel[51].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[51].setRotationPoint(23.5f, -19.599998f, -5.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 200, 127, textureX, textureY);
		bodyModel[52].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[52].setRotationPoint(-22.5f, -19.599998f, -5.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 46, 143, textureX, textureY);
		bodyModel[53].addShapeBox(0, 0, 0, 3, 8, 10, 0, -2.4f, 0, 0, 0, 0, 0, 0.1f, 0, -1.5f, -2.94f, 0, -1.5f, 0.3f, 0, 0, 0, 0, 0, 0.03f, 0, -0.7f, -0.6f, 0, -0.8f);
		bodyModel[53].setRotationPoint(44.8f, -16.599998f, 0.0f);
		bodyModel[53].rotateAngleY = -3.1415927f;

		bodyModel[54] = new ModelRendererTurbo(this, 19, 143, textureX, textureY);
		bodyModel[54].addShapeBox(0, 0, 0, 3, 8, 10, 0, -2.94f, 0, -1.5f, 0.1f, 0, -1.5f, 0, 0, 0, -2.4f, 0, 0, -0.6f, 0, -0.8f, 0.02f, 0, -0.7f, 0, 0, 0, 0.3f, 0, 0);
		bodyModel[54].setRotationPoint(44.8f, -16.599998f, 10.0f);
		bodyModel[54].rotateAngleY = -3.1415927f;

		bodyModel[55] = new ModelRendererTurbo(this, 235, 16, textureX, textureY);
		bodyModel[55].addShapeBox(0, 0, 0, 6, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[55].setRotationPoint(2.5f, -19.099998f, -2.5f);

		bodyModel[56] = new ModelRendererTurbo(this, 152, 117, textureX, textureY);
		bodyModel[56].addBox(0, 0, 0, 4, 2, 3, 0f);
		bodyModel[56].setRotationPoint(4.0f, -21.099998f, -2.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 47, 121, textureX, textureY);
		bodyModel[57].addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(-41.2f, -1.0f, 1.6f);
		bodyModel[57].rotateAngleY = -3.1415927f;

		bodyModel[58] = new ModelRendererTurbo(this, 180, 119, textureX, textureY);
		bodyModel[58].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[58].setRotationPoint(-33.0f, 2.0f, -11.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 11, 99, textureX, textureY);
		bodyModel[59].addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[59].setRotationPoint(-33.0f, 6.0f, -11.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 171, 119, textureX, textureY);
		bodyModel[60].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[60].setRotationPoint(31.0f, 2.0f, 11.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 180, 93, textureX, textureY);
		bodyModel[61].addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[61].setRotationPoint(31.0f, 6.0f, 11.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 179, 15, textureX, textureY);
		bodyModel[62].addShapeBox(0, 0, 0, 7, 3, 3, 0, 0, -2.4f, -0.6f, -1, -2.4f, -1.15f, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.6f, -1, 0, -1.2f, -1, 0, 0, 0, 0, 0);
		bodyModel[62].setRotationPoint(-32.2f, -19.0f, 11.0f);
		bodyModel[62].rotateAngleY = -3.1415927f;

		bodyModel[63] = new ModelRendererTurbo(this, 197, 80, textureX, textureY);
		bodyModel[63].addShapeBox(0, 0, 0, 2, 3, 8, 0, -0.1f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, -1.1f, 1.85f, 0.1f, -1.1f, 1.5f, 0.7f, -1.1f, 0, 0, -1, 0);
		bodyModel[63].setRotationPoint(-38.1f, -18.5f, 8.0f);
		bodyModel[63].rotateAngleY = -3.1415927f;

		bodyModel[64] = new ModelRendererTurbo(this, 100, 157, textureX, textureY);
		bodyModel[64].addShapeBox(0, 0, 0, 8, 15, 1, 0, -0.1f, 0, -0.6f, 0.01f, 0, -1.44f, 0.01f, 0, 0.5f, -0.1f, 0, 0, -0.1f, 0, 0, 0.1f, 0, 0, 0, 0, 0, -0.1f, 0, 0);
		bodyModel[64].setRotationPoint(-32.1f, -16.0f, 11.0f);
		bodyModel[64].rotateAngleY = -3.1415927f;

		bodyModel[65] = new ModelRendererTurbo(this, 32, 116, textureX, textureY);
		bodyModel[65].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, 0.05f, -0.1f, -0.4f, -0.3f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.1f, 0, -0.25f, 0, 0, 0, 0, 0, 0);
		bodyModel[65].setRotationPoint(-38.2f, -17.0f, 9.8f);
		bodyModel[65].rotateAngleY = -3.1415927f;

		bodyModel[66] = new ModelRendererTurbo(this, 0, 151, textureX, textureY);
		bodyModel[66].addShapeBox(0, 0, 0, 8, 15, 1, 0, -0.1f, 0, 0, 0, 0, 0.5f, 0.01f, 0, -1.43f, -0.1f, 0, -0.6f, -0.1f, 0, 0, 0, 0, 0, 0.1f, 0, 0, -0.1f, 0, 0);
		bodyModel[66].setRotationPoint(33.7f, -16.0f, 10.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 0, 60, textureX, textureY);
		bodyModel[67].addShapeBox(0, 0, 0, 66, 15, 1, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[67].setRotationPoint(33.8f, -16.0f, 11.0f);
		bodyModel[67].rotateAngleY = 3.1415927f;

		bodyModel[68] = new ModelRendererTurbo(this, 156, 112, textureX, textureY);
		bodyModel[68].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.4f, 0, -0.09f, -0.4f, -0.3f, 0, -0.4f, 0.05f, 0, 0, 0, 0, 0, 0, -0.09f, 0, -0.23f, 0, 0, 0);
		bodyModel[68].setRotationPoint(39.8f, -17.0f, 8.8f);

		bodyModel[69] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[69].addShapeBox(0, 0, 0, 3, 8, 11, 0, 0.3f, -0.4f, 0, 0, -0.4f, 0, 0.03f, -0.4f, -0.7f, -0.7f, -0.4f, -0.8f, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[69].setRotationPoint(-43.2f, -9.0f, 0.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 161, 140, textureX, textureY);
		bodyModel[70].addShapeBox(0, 0, 0, 3, 8, 10, 0, -2.94f, 0, -1.5f, 0.1f, 0, -1.5f, 0, 0, 0, -2.4f, 0, 0, -0.6f, 0, -0.8f, 0.03f, 0, -0.74f, 0, 0, 0, 0.3f, 0, 0);
		bodyModel[70].setRotationPoint(-43.2f, -16.6f, -10.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 73, 140, textureX, textureY);
		bodyModel[71].addShapeBox(0, 0, 0, 3, 8, 10, 0, -2.4f, 0, 0, 0, 0, 0, 0.1f, 0, -1.5f, -2.94f, 0, -1.5f, 0.3f, 0, 0, 0, 0, 0, 0.03f, 0, -0.7f, -0.6f, 0, -0.8f);
		bodyModel[71].setRotationPoint(-43.2f, -16.6f, 0.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 236, 148, textureX, textureY);
		bodyModel[72].addShapeBox(0, 0, 0, 8, 15, 1, 0, -0.1f, 0, 0, 0.01f, 0, 0.5f, 0.01f, 0, -1.44f, -0.1f, 0, -0.6f, -0.1f, 0, 0, 0, 0, 0, 0.1f, 0, 0, -0.1f, 0, 0);
		bodyModel[72].setRotationPoint(-32.1f, -16.0f, -10.0f);
		bodyModel[72].rotateAngleY = -3.1415927f;

		bodyModel[73] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		bodyModel[73].addShapeBox(0, 0, 0, 7, 3, 3, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -2.4f, -1.15f, 0, -2.4f, -0.6f, 0, 0, 0, -1, 0, 0, -1, 0, -1.2f, 0, 0, -0.6f);
		bodyModel[73].setRotationPoint(33.8f, -19.0f, 8.0f);

		bodyModel[74] = new ModelRendererTurbo(this, 235, 9, textureX, textureY);
		bodyModel[74].addShapeBox(0, 0, 0, 7, 3, 3, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -2.4f, -1.15f, 0, -2.4f, -0.6f, 0, 0, 0, -1, 0, 0, -1, 0, -1.2f, 0, 0, -0.6f);
		bodyModel[74].setRotationPoint(-32.2f, -19.0f, -8.0f);
		bodyModel[74].rotateAngleY = -3.1415927f;

		bodyModel[75] = new ModelRendererTurbo(this, 142, 112, textureX, textureY);
		bodyModel[75].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1f, -0.4f, -0.3f, 0, -0.4f, 0.05f, 0, 0, 0, 0, 0, 0, -0.09f, 0, -0.23f, 0, 0, 0);
		bodyModel[75].setRotationPoint(-38.2f, -17.0f, -8.8f);
		bodyModel[75].rotateAngleY = -3.1415927f;

		bodyModel[76] = new ModelRendererTurbo(this, 179, 3, textureX, textureY);
		bodyModel[76].addShapeBox(0, 0, 0, 2, 3, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.1f, 0, 0, 0, -1, 0, 0.7f, -1.1f, 0, 0.1f, -1.1f, 1.5f, -0.1f, -1.1f, 1.85f);
		bodyModel[76].setRotationPoint(-38.1f, -18.5f, 0.0f);
		bodyModel[76].rotateAngleY = -3.1415927f;

		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[77].addShapeBox(0, 0, 0, 2, 3, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.1f, 0, 0, 0, -1, 0, 0.7f, -1.1f, 0, 0.1f, -1.1f, 1.5f, -0.1f, -1.1f, 1.85f);
		bodyModel[77].setRotationPoint(39.7f, -18.5f, 0.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 47, 116, textureX, textureY);
		bodyModel[78].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[78].setRotationPoint(42.5f, 2.0f, -1.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 56, 124, textureX, textureY);
		bodyModel[79].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[79].setRotationPoint(42.8f, 2.5f, 7.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 0, 116, textureX, textureY);
		bodyModel[80].addBox(0, 0, 0, 1, 3, 4, 0f);
		bodyModel[80].setRotationPoint(43.8f, 1.0f, 5.0f);

		bodyModel[81] = new ModelRendererTurbo(this, 214, 110, textureX, textureY);
		bodyModel[81].addBox(0, 0, 0, 1, 3, 4, 0f);
		bodyModel[81].setRotationPoint(43.8f, 1.0f, -9.0f);

		bodyModel[82] = new ModelRendererTurbo(this, 34, 124, textureX, textureY);
		bodyModel[82].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[82].setRotationPoint(42.8f, 2.5f, -7.0f);

		bodyModel[83] = new ModelRendererTurbo(this, 240, 64, textureX, textureY);
		bodyModel[83].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[83].setRotationPoint(-46.0f, 2.0f, -1.0f);

		bodyModel[84] = new ModelRendererTurbo(this, 5, 124, textureX, textureY);
		bodyModel[84].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[84].setRotationPoint(-42.2f, 3.0f, 7.0f);

		bodyModel[85] = new ModelRendererTurbo(this, 156, 104, textureX, textureY);
		bodyModel[85].addBox(0, 0, 0, 1, 3, 4, 0f);
		bodyModel[85].setRotationPoint(-43.2f, 1.0f, 5.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 142, 104, textureX, textureY);
		bodyModel[86].addBox(0, 0, 0, 1, 3, 4, 0f);
		bodyModel[86].setRotationPoint(-43.2f, 1.0f, -10.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 0, 124, textureX, textureY);
		bodyModel[87].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[87].setRotationPoint(-42.2f, 2.5f, -8.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 135, 119, textureX, textureY);
		bodyModel[88].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[88].setRotationPoint(31.0f, 2.0f, -11.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 126, 119, textureX, textureY);
		bodyModel[89].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[89].setRotationPoint(-33.0f, 2.0f, 11.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 181, 82, textureX, textureY);
		bodyModel[90].addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[90].setRotationPoint(-33.0f, 6.0f, 11.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 139, 49, textureX, textureY);
		bodyModel[91].addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[91].setRotationPoint(31.0f, 6.0f, -11.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 191, 110, textureX, textureY);
		bodyModel[92].addBox(0, 0, 0, 1, 15, 20, 0f);
		bodyModel[92].setRotationPoint(-28.0f, -16.0f, -10.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 49, 94, textureX, textureY);
		bodyModel[93].addBox(0, 0, 0, 4, 1, 20, 0f);
		bodyModel[93].setRotationPoint(38.0f, -8.0f, -10.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 148, 104, textureX, textureY);
		bodyModel[94].addBox(0, 0, 0, 1, 15, 20, 0f);
		bodyModel[94].setRotationPoint(29.0f, -16.0f, -10.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);
		bodyModel[95].addBox(0, 0, 0, 4, 1, 20, 0f);
		bodyModel[95].setRotationPoint(-41.0f, -8.0f, -10.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 230, 46, textureX, textureY);
		bodyModel[96].addShapeBox(0, 0, 0, 10, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[96].setRotationPoint(-24.1f, -14.900002f, -10.7f);
		bodyModel[96].rotateAngleX = -0.038397245f;

		bodyModel[97] = new ModelRendererTurbo(this, 232, 110, textureX, textureY);
		bodyModel[97].addShapeBox(0, 0, 0, 8, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[97].setRotationPoint(-7.3f, -14.900002f, -10.7f);
		bodyModel[97].rotateAngleX = -0.038397245f;

		bodyModel[98] = new ModelRendererTurbo(this, 187, 110, textureX, textureY);
		bodyModel[98].addShapeBox(0, 0, 0, 8, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[98].setRotationPoint(2.8f, -14.900002f, -10.7f);
		bodyModel[98].rotateAngleX = -0.038397245f;

		bodyModel[99] = new ModelRendererTurbo(this, 226, 97, textureX, textureY);
		bodyModel[99].addShapeBox(0, 0, 0, 8, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[99].setRotationPoint(-7.3f, -9.099998f, -10.9f);
		bodyModel[99].rotateAngleX = -0.038397245f;

		bodyModel[100] = new ModelRendererTurbo(this, 210, 31, textureX, textureY);
		bodyModel[100].addShapeBox(0, 0, 0, 8, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[100].setRotationPoint(2.8f, -9.099998f, -10.9f);
		bodyModel[100].rotateAngleX = -0.038397245f;

		bodyModel[101] = new ModelRendererTurbo(this, 173, 31, textureX, textureY);
		bodyModel[101].addShapeBox(0, 0, 0, 10, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[101].setRotationPoint(17.1f, -14.900002f, -10.7f);
		bodyModel[101].rotateAngleX = -0.038397245f;

		bodyModel[102] = new ModelRendererTurbo(this, 144, 140, textureX, textureY); // Box 136
		bodyModel[102].addShapeBox(0, 0, 0, 5, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[102].setRotationPoint(32.0f, -5.0f, -4.0f);
		bodyModel[102].rotateAngleY = 6.2831855f;

		bodyModel[103] = new ModelRendererTurbo(this, 78, 94, textureX, textureY); // Box 136cp
		bodyModel[103].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[103].setRotationPoint(32.0f, -12.0f, -4.0f);
		bodyModel[103].rotateAngleY = 6.2831855f;

		bodyModel[104] = new ModelRendererTurbo(this, 213, 148, textureX, textureY); // Box 136cp
		bodyModel[104].addBox(0, 0, 0, 3, 3, 8, 0f);
		bodyModel[104].setRotationPoint(33.0f, -4.0f, -4.0f);
		bodyModel[104].rotateAngleY = 6.2831855f;

		bodyModel[105] = new ModelRendererTurbo(this, 45, 94, textureX, textureY); // Box 136cp
		bodyModel[105].addBox(0, 0, 0, 3, 3, 8, 0f);
		bodyModel[105].setRotationPoint(-34.0f, -4.0f, -4.0f);
		bodyModel[105].rotateAngleY = 6.2831855f;

		bodyModel[106] = new ModelRendererTurbo(this, 226, 138, textureX, textureY); // Box 136cp
		bodyModel[106].addShapeBox(0, 0, 0, 5, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[106].setRotationPoint(-35.0f, -5.0f, -4.0f);
		bodyModel[106].rotateAngleY = 6.2831855f;

		bodyModel[107] = new ModelRendererTurbo(this, 0, 94, textureX, textureY); // Box 136cp
		bodyModel[107].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[107].setRotationPoint(-31.0f, -12.0f, -4.0f);
		bodyModel[107].rotateAngleY = 6.2831855f;

		bodyModel[108] = new ModelRendererTurbo(this, 240, 56, textureX, textureY);
		bodyModel[108].addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0);
		bodyModel[108].setRotationPoint(43.0f, -3.5f, -3.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 170, 89, textureX, textureY);
		bodyModel[109].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0);
		bodyModel[109].setRotationPoint(-42.6f, -3.5f, -3.5f);

		bodyModel[110] = new ModelRendererTurbo(this, 139, 46, textureX, textureY);
		bodyModel[110].addBox(0, 0, 0, 40, 13, 10, 0f);
		bodyModel[110].setRotationPoint(-19.0f, -14.0f, -5.0f);

		bodyModel[111] = new ModelRendererTurbo(this, 0, 53, textureX, textureY);
		bodyModel[111].addShapeBox(0, 0, 0, 66, 3, 3, 0, 0, -1.9f, -0.6f, 0, -1.9f, -0.6f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[111].setRotationPoint(-32.2f, -18.5f, -11.0f);

		bodyModel[112] = new ModelRendererTurbo(this, 0, 46, textureX, textureY);
		bodyModel[112].addShapeBox(0, 0, 0, 66, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, -0.6f, 0, -1.9f, -0.6f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f);
		bodyModel[112].setRotationPoint(-32.2f, -18.5f, 8.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 101, 104, textureX, textureY);
		bodyModel[113].addShapeBox(0, 0, 0, 1, 2, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.2f, -0.5f, 0);
		bodyModel[113].setRotationPoint(40.0f, 4.0f, -11.0f);

		bodyModel[114] = new ModelRendererTurbo(this, 123, 129, textureX, textureY);
		bodyModel[114].addShapeBox(0, 0, 0, 3, 3, 11, 0, 0, 0, 0, -2.7f, 0, 0, -2.7f, 0, 0, 0, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, 1, -1, 0, 0, -1, 0);
		bodyModel[114].setRotationPoint(40.2f, 5.5f, -11.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 94, 129, textureX, textureY);
		bodyModel[115].addShapeBox(0, 0, 0, 3, 8, 11, 0, -2, -8, 0, 0, -8, 0, 0.04f, -0.4f, -10.3f, -0.7f, -0.4f, -10.2f, -2, 0, -11, 0, 0, -11, 0, -7.6f, 0, 0.3f, -7.6f, 0);
		bodyModel[115].setRotationPoint(44.8f, -9.0f, 11.0f);
		bodyModel[115].rotateAngleY = -3.1415927f;

		bodyModel[116] = new ModelRendererTurbo(this, 76, 120, textureX, textureY);
		bodyModel[116].addShapeBox(0, 0, 0, 3, 8, 11, 0, 0.3f, -0.4f, 0, 0, -0.4f, 0, 0.04f, -0.4f, -0.7f, -0.7f, -0.4f, -0.8f, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[116].setRotationPoint(44.8f, -9.0f, 0.0f);
		bodyModel[116].rotateAngleY = -3.1415927f;

		bodyModel[117] = new ModelRendererTurbo(this, 58, 116, textureX, textureY);
		bodyModel[117].addShapeBox(0, 0, 0, 3, 3, 11, 0, 0, 0, 0, -2.7f, 0, 0, -2.7f, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 0, 0, -1.5f, -1, 0, -1.5f, -1);
		bodyModel[117].setRotationPoint(40.2f, 5.5f, 0.0f);

		bodyModel[118] = new ModelRendererTurbo(this, 29, 116, textureX, textureY);
		bodyModel[118].addShapeBox(0, 0, 0, 3, 3, 11, 0, -2.7f, 0, 0, 0, 0, 0, 0, 0, 0, -2.7f, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, 0, -1, 0, 1, -1, 0);
		bodyModel[118].setRotationPoint(-41.6f, 5.5f, -11.0f);

		bodyModel[119] = new ModelRendererTurbo(this, 76, 94, textureX, textureY);
		bodyModel[119].addShapeBox(0, 0, 0, 1, 2, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.2f, -0.5f, 0, -0.2f, -0.5f, 0, -0.5f, -0.5f, 0);
		bodyModel[119].setRotationPoint(-39.4f, 4.0f, -11.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 0, 116, textureX, textureY);
		bodyModel[120].addShapeBox(0, 0, 0, 3, 3, 11, 0, -2.7f, 0, 0, 0, 0, 0, 0, 0, 0, -2.7f, 0, 0, 1, -1, 0, 0, -1, 0, 0, -1.5f, -1, 0, -1.5f, -1);
		bodyModel[120].setRotationPoint(-41.6f, 5.5f, 0.0f);

		bodyModel[121] = new ModelRendererTurbo(this, 214, 110, textureX, textureY);
		bodyModel[121].addShapeBox(0, 0, 0, 3, 8, 11, 0, -2, -8, 0, 0, -8, 0, 0.03f, -0.4f, -10.3f, -0.7f, -0.4f, -10.2f, -2, 0, -11, 0, 0, -11, 0, -7.6f, 0, 0.3f, -7.6f, 0);
		bodyModel[121].setRotationPoint(-43.2f, -9.0f, -11.0f);

		bodyModel[122] = new ModelRendererTurbo(this, 112, 119, textureX, textureY);
		bodyModel[122].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[122].setRotationPoint(24.0f, 2.0f, -11.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 103, 119, textureX, textureY);
		bodyModel[123].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[123].setRotationPoint(20.0f, 2.0f, -11.0f);

		bodyModel[124] = new ModelRendererTurbo(this, 94, 119, textureX, textureY);
		bodyModel[124].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[124].setRotationPoint(-20.0f, 2.0f, -11.0f);

		bodyModel[125] = new ModelRendererTurbo(this, 76, 119, textureX, textureY);
		bodyModel[125].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[125].setRotationPoint(-24.0f, 2.0f, -11.0f);

		bodyModel[126] = new ModelRendererTurbo(this, 60, 119, textureX, textureY);
		bodyModel[126].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[126].setRotationPoint(-24.0f, 2.0f, 9.0f);

		bodyModel[127] = new ModelRendererTurbo(this, 187, 104, textureX, textureY);
		bodyModel[127].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[127].setRotationPoint(-20.0f, 2.0f, 9.0f);

		bodyModel[128] = new ModelRendererTurbo(this, 114, 104, textureX, textureY);
		bodyModel[128].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[128].setRotationPoint(20.0f, 2.0f, 9.0f);

		bodyModel[129] = new ModelRendererTurbo(this, 89, 94, textureX, textureY);
		bodyModel[129].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[129].setRotationPoint(24.0f, 2.0f, 9.0f);

		bodyModel[130] = new ModelRendererTurbo(this, 188, 146, textureX, textureY);
		bodyModel[130].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[130].setRotationPoint(29.7f, 6.0f, -5.5f);

		bodyModel[131] = new ModelRendererTurbo(this, 126, 104, textureX, textureY);
		bodyModel[131].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[131].setRotationPoint(30.2f, 6.5f, 5.5f);

		bodyModel[132] = new ModelRendererTurbo(this, 126, 146, textureX, textureY);
		bodyModel[132].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[132].setRotationPoint(15.7f, 6.0f, -5.5f);

		bodyModel[133] = new ModelRendererTurbo(this, 31, 135, textureX, textureY);
		bodyModel[133].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[133].setRotationPoint(29.7f, 6.0f, 5.5f);

		bodyModel[134] = new ModelRendererTurbo(this, 58, 134, textureX, textureY);
		bodyModel[134].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[134].setRotationPoint(15.7f, 6.0f, 5.5f);

		bodyModel[135] = new ModelRendererTurbo(this, 29, 101, textureX, textureY);
		bodyModel[135].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[135].setRotationPoint(27.7f, 7.0f, 6.5f);

		bodyModel[136] = new ModelRendererTurbo(this, 242, 92, textureX, textureY);
		bodyModel[136].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[136].setRotationPoint(13.7f, 7.0f, 6.5f);

		bodyModel[137] = new ModelRendererTurbo(this, 24, 135, textureX, textureY);
		bodyModel[137].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[137].setRotationPoint(30.7f, 3.0f, 6.5f);

		bodyModel[138] = new ModelRendererTurbo(this, 218, 6, textureX, textureY);
		bodyModel[138].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[138].setRotationPoint(15.7f, 3.0f, 6.5f);

		bodyModel[139] = new ModelRendererTurbo(this, 58, 106, textureX, textureY);
		bodyModel[139].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[139].setRotationPoint(32.7f, 5.0f, 6.5f);

		bodyModel[140] = new ModelRendererTurbo(this, 29, 104, textureX, textureY);
		bodyModel[140].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[140].setRotationPoint(11.7f, 5.0f, 6.5f);

		bodyModel[141] = new ModelRendererTurbo(this, 41, 143, textureX, textureY);
		bodyModel[141].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[141].setRotationPoint(22.7f, 4.0f, 6.5f);

		bodyModel[142] = new ModelRendererTurbo(this, 36, 143, textureX, textureY);
		bodyModel[142].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[142].setRotationPoint(24.2f, 4.0f, 6.5f);

		bodyModel[143] = new ModelRendererTurbo(this, 249, 140, textureX, textureY);
		bodyModel[143].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[143].setRotationPoint(21.2f, 4.0f, 6.5f);

		bodyModel[144] = new ModelRendererTurbo(this, 60, 94, textureX, textureY);
		bodyModel[144].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[144].setRotationPoint(22.2f, 1.5f, -1.0f);

		bodyModel[145] = new ModelRendererTurbo(this, 171, 104, textureX, textureY);
		bodyModel[145].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[145].setRotationPoint(33.7f, 5.0f, -6.5f);

		bodyModel[146] = new ModelRendererTurbo(this, 126, 104, textureX, textureY);
		bodyModel[146].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[146].setRotationPoint(11.7f, 5.0f, -6.5f);

		bodyModel[147] = new ModelRendererTurbo(this, 141, 133, textureX, textureY);
		bodyModel[147].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[147].setRotationPoint(13.7f, 3.0f, 6.5f);

		bodyModel[148] = new ModelRendererTurbo(this, 101, 94, textureX, textureY);
		bodyModel[148].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[148].setRotationPoint(23.2f, 2.5f, -1.0f);

		bodyModel[149] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[149].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[149].setRotationPoint(22.2f, 1.5f, 1.0f);

		bodyModel[150] = new ModelRendererTurbo(this, 241, 32, textureX, textureY);
		bodyModel[150].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[150].setRotationPoint(22.2f, 1.5f, -3.0f);

		bodyModel[151] = new ModelRendererTurbo(this, 146, 92, textureX, textureY);
		bodyModel[151].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[151].setRotationPoint(11.2f, 2.5f, 0.0f);

		bodyModel[152] = new ModelRendererTurbo(this, 45, 99, textureX, textureY);
		bodyModel[152].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[152].setRotationPoint(32.7f, 5.0f, -7.5f);

		bodyModel[153] = new ModelRendererTurbo(this, 53, 131, textureX, textureY);
		bodyModel[153].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[153].setRotationPoint(30.7f, 3.0f, -7.5f);

		bodyModel[154] = new ModelRendererTurbo(this, 218, 3, textureX, textureY);
		bodyModel[154].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[154].setRotationPoint(15.7f, 3.0f, -7.5f);

		bodyModel[155] = new ModelRendererTurbo(this, 46, 131, textureX, textureY);
		bodyModel[155].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[155].setRotationPoint(13.7f, 3.0f, -7.5f);

		bodyModel[156] = new ModelRendererTurbo(this, 0, 99, textureX, textureY);
		bodyModel[156].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[156].setRotationPoint(11.7f, 5.0f, -7.5f);

		bodyModel[157] = new ModelRendererTurbo(this, 32, 131, textureX, textureY);
		bodyModel[157].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[157].setRotationPoint(29.7f, 6.0f, -7.5f);

		bodyModel[158] = new ModelRendererTurbo(this, 226, 92, textureX, textureY);
		bodyModel[158].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[158].setRotationPoint(13.7f, 7.0f, -7.5f);

		bodyModel[159] = new ModelRendererTurbo(this, 242, 89, textureX, textureY);
		bodyModel[159].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[159].setRotationPoint(27.7f, 7.0f, -7.5f);

		bodyModel[160] = new ModelRendererTurbo(this, 183, 140, textureX, textureY);
		bodyModel[160].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[160].setRotationPoint(22.7f, 4.0f, -7.5f);

		bodyModel[161] = new ModelRendererTurbo(this, 178, 140, textureX, textureY);
		bodyModel[161].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[161].setRotationPoint(21.2f, 4.0f, -7.5f);

		bodyModel[162] = new ModelRendererTurbo(this, 163, 140, textureX, textureY);
		bodyModel[162].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[162].setRotationPoint(24.2f, 4.0f, -7.5f);

		bodyModel[163] = new ModelRendererTurbo(this, 245, 137, textureX, textureY);
		bodyModel[163].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[163].setRotationPoint(29.7f, 4.0f, -7.5f);

		bodyModel[164] = new ModelRendererTurbo(this, 25, 131, textureX, textureY);
		bodyModel[164].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[164].setRotationPoint(15.7f, 6.0f, -7.5f);

		bodyModel[165] = new ModelRendererTurbo(this, 29, 94, textureX, textureY);
		bodyModel[165].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[165].setRotationPoint(30.2f, 6.5f, -5.5f);

		bodyModel[166] = new ModelRendererTurbo(this, 226, 85, textureX, textureY);
		bodyModel[166].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[166].setRotationPoint(16.2f, 6.5f, -5.5f);

		bodyModel[167] = new ModelRendererTurbo(this, 146, 83, textureX, textureY);
		bodyModel[167].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[167].setRotationPoint(16.2f, 6.5f, 5.5f);

		bodyModel[168] = new ModelRendererTurbo(this, 53, 121, textureX, textureY);
		bodyModel[168].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[168].setRotationPoint(13.7f, 6.0f, -7.5f);

		bodyModel[169] = new ModelRendererTurbo(this, 18, 131, textureX, textureY);
		bodyModel[169].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[169].setRotationPoint(17.7f, 4.0f, -7.5f);

		bodyModel[170] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[170].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[170].setRotationPoint(26.7f, 4.0f, -7.5f);

		bodyModel[171] = new ModelRendererTurbo(this, 141, 129, textureX, textureY);
		bodyModel[171].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[171].setRotationPoint(30.7f, 4.0f, -7.5f);

		bodyModel[172] = new ModelRendererTurbo(this, 163, 112, textureX, textureY);
		bodyModel[172].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[172].setRotationPoint(31.7f, 6.0f, -7.5f);

		bodyModel[173] = new ModelRendererTurbo(this, 232, 117, textureX, textureY);
		bodyModel[173].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[173].setRotationPoint(13.7f, 4.0f, -7.5f);

		bodyModel[174] = new ModelRendererTurbo(this, 251, 136, textureX, textureY);
		bodyModel[174].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[174].setRotationPoint(15.7f, 4.0f, -7.5f);

		bodyModel[175] = new ModelRendererTurbo(this, 94, 125, textureX, textureY);
		bodyModel[175].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[175].setRotationPoint(26.7f, 4.0f, 6.5f);

		bodyModel[176] = new ModelRendererTurbo(this, 51, 136, textureX, textureY);
		bodyModel[176].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[176].setRotationPoint(29.7f, 4.0f, 6.5f);

		bodyModel[177] = new ModelRendererTurbo(this, 92, 110, textureX, textureY);
		bodyModel[177].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[177].setRotationPoint(31.7f, 6.0f, 6.5f);

		bodyModel[178] = new ModelRendererTurbo(this, 85, 110, textureX, textureY);
		bodyModel[178].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[178].setRotationPoint(30.7f, 4.0f, 6.5f);

		bodyModel[179] = new ModelRendererTurbo(this, 27, 122, textureX, textureY);
		bodyModel[179].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[179].setRotationPoint(17.7f, 4.0f, 6.5f);

		bodyModel[180] = new ModelRendererTurbo(this, 14, 110, textureX, textureY);
		bodyModel[180].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[180].setRotationPoint(15.7f, 4.0f, 6.5f);

		bodyModel[181] = new ModelRendererTurbo(this, 36, 104, textureX, textureY);
		bodyModel[181].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[181].setRotationPoint(13.7f, 6.0f, 6.5f);

		bodyModel[182] = new ModelRendererTurbo(this, 78, 110, textureX, textureY);
		bodyModel[182].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[182].setRotationPoint(13.7f, 4.0f, 6.5f);

		bodyModel[183] = new ModelRendererTurbo(this, 112, 144, textureX, textureY);
		bodyModel[183].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[183].setRotationPoint(-14.3f, 6.0f, -5.5f);

		bodyModel[184] = new ModelRendererTurbo(this, 242, 82, textureX, textureY);
		bodyModel[184].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[184].setRotationPoint(-13.8f, 6.5f, 5.5f);

		bodyModel[185] = new ModelRendererTurbo(this, 142, 104, textureX, textureY);
		bodyModel[185].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[185].setRotationPoint(-28.3f, 6.0f, -5.5f);

		bodyModel[186] = new ModelRendererTurbo(this, 7, 110, textureX, textureY);
		bodyModel[186].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[186].setRotationPoint(-14.3f, 6.0f, 5.5f);

		bodyModel[187] = new ModelRendererTurbo(this, 0, 110, textureX, textureY);
		bodyModel[187].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[187].setRotationPoint(-28.3f, 6.0f, 5.5f);

		bodyModel[188] = new ModelRendererTurbo(this, 226, 82, textureX, textureY);
		bodyModel[188].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[188].setRotationPoint(-16.3f, 7.0f, 6.5f);

		bodyModel[189] = new ModelRendererTurbo(this, 136, 53, textureX, textureY);
		bodyModel[189].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[189].setRotationPoint(-30.3f, 7.0f, 6.5f);

		bodyModel[190] = new ModelRendererTurbo(this, 144, 119, textureX, textureY);
		bodyModel[190].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[190].setRotationPoint(-13.3f, 3.0f, 6.5f);

		bodyModel[191] = new ModelRendererTurbo(this, 212, 0, textureX, textureY);
		bodyModel[191].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[191].setRotationPoint(-28.3f, 3.0f, 6.5f);

		bodyModel[192] = new ModelRendererTurbo(this, 78, 98, textureX, textureY);
		bodyModel[192].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[192].setRotationPoint(-11.3f, 5.0f, 6.5f);

		bodyModel[193] = new ModelRendererTurbo(this, 192, 38, textureX, textureY);
		bodyModel[193].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[193].setRotationPoint(-32.3f, 5.0f, 6.5f);

		bodyModel[194] = new ModelRendererTurbo(this, 46, 136, textureX, textureY);
		bodyModel[194].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[194].setRotationPoint(-21.3f, 4.0f, 6.5f);

		bodyModel[195] = new ModelRendererTurbo(this, 18, 136, textureX, textureY);
		bodyModel[195].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[195].setRotationPoint(-19.8f, 4.0f, 6.5f);

		bodyModel[196] = new ModelRendererTurbo(this, 35, 119, textureX, textureY);
		bodyModel[196].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[196].setRotationPoint(-22.8f, 4.0f, 6.5f);

		bodyModel[197] = new ModelRendererTurbo(this, 11, 94, textureX, textureY);
		bodyModel[197].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[197].setRotationPoint(-21.8f, 1.5f, -1.0f);

		bodyModel[198] = new ModelRendererTurbo(this, 29, 94, textureX, textureY);
		bodyModel[198].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[198].setRotationPoint(-10.3f, 5.0f, -6.5f);

		bodyModel[199] = new ModelRendererTurbo(this, 226, 82, textureX, textureY);
		bodyModel[199].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[199].setRotationPoint(-32.3f, 5.0f, -6.5f);

		bodyModel[200] = new ModelRendererTurbo(this, 101, 106, textureX, textureY);
		bodyModel[200].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[200].setRotationPoint(-30.3f, 3.0f, 6.5f);

		bodyModel[201] = new ModelRendererTurbo(this, 224, 78, textureX, textureY);
		bodyModel[201].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[201].setRotationPoint(-20.8f, 2.5f, -1.0f);

		bodyModel[202] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[202].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[202].setRotationPoint(-21.8f, 1.5f, 1.0f);

		bodyModel[203] = new ModelRendererTurbo(this, 241, 25, textureX, textureY);
		bodyModel[203].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[203].setRotationPoint(-21.8f, 1.5f, -3.0f);

		bodyModel[204] = new ModelRendererTurbo(this, 197, 76, textureX, textureY);
		bodyModel[204].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[204].setRotationPoint(-32.8f, 2.5f, 0.0f);

		bodyModel[205] = new ModelRendererTurbo(this, 249, 22, textureX, textureY);
		bodyModel[205].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[205].setRotationPoint(-11.3f, 5.0f, -7.5f);

		bodyModel[206] = new ModelRendererTurbo(this, 248, 103, textureX, textureY);
		bodyModel[206].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[206].setRotationPoint(-13.3f, 3.0f, -7.5f);

		bodyModel[207] = new ModelRendererTurbo(this, 179, 0, textureX, textureY);
		bodyModel[207].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[207].setRotationPoint(-28.3f, 3.0f, -7.5f);

		bodyModel[208] = new ModelRendererTurbo(this, 101, 101, textureX, textureY);
		bodyModel[208].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[208].setRotationPoint(-30.3f, 3.0f, -7.5f);

		bodyModel[209] = new ModelRendererTurbo(this, 179, 8, textureX, textureY);
		bodyModel[209].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[209].setRotationPoint(-32.3f, 5.0f, -7.5f);

		bodyModel[210] = new ModelRendererTurbo(this, 78, 94, textureX, textureY);
		bodyModel[210].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[210].setRotationPoint(-14.3f, 6.0f, -7.5f);

		bodyModel[211] = new ModelRendererTurbo(this, 136, 46, textureX, textureY);
		bodyModel[211].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[211].setRotationPoint(-30.3f, 7.0f, -7.5f);

		bodyModel[212] = new ModelRendererTurbo(this, 243, 43, textureX, textureY);
		bodyModel[212].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[212].setRotationPoint(-16.3f, 7.0f, -7.5f);

		bodyModel[213] = new ModelRendererTurbo(this, 251, 113, textureX, textureY);
		bodyModel[213].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[213].setRotationPoint(-21.3f, 4.0f, -7.5f);

		bodyModel[214] = new ModelRendererTurbo(this, 206, 110, textureX, textureY);
		bodyModel[214].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[214].setRotationPoint(-22.8f, 4.0f, -7.5f);

		bodyModel[215] = new ModelRendererTurbo(this, 251, 108, textureX, textureY);
		bodyModel[215].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[215].setRotationPoint(-19.8f, 4.0f, -7.5f);

		bodyModel[216] = new ModelRendererTurbo(this, 163, 104, textureX, textureY);
		bodyModel[216].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[216].setRotationPoint(-14.3f, 4.0f, -7.5f);

		bodyModel[217] = new ModelRendererTurbo(this, 197, 84, textureX, textureY);
		bodyModel[217].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[217].setRotationPoint(-28.3f, 6.0f, -7.5f);

		bodyModel[218] = new ModelRendererTurbo(this, 146, 76, textureX, textureY);
		bodyModel[218].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[218].setRotationPoint(-13.8f, 6.5f, -5.5f);

		bodyModel[219] = new ModelRendererTurbo(this, 218, 16, textureX, textureY);
		bodyModel[219].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[219].setRotationPoint(-27.8f, 6.5f, -5.5f);

		bodyModel[220] = new ModelRendererTurbo(this, 218, 9, textureX, textureY);
		bodyModel[220].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[220].setRotationPoint(-27.8f, 6.5f, 5.5f);

		bodyModel[221] = new ModelRendererTurbo(this, 108, 101, textureX, textureY);
		bodyModel[221].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[221].setRotationPoint(-30.3f, 6.0f, -7.5f);

		bodyModel[222] = new ModelRendererTurbo(this, 45, 94, textureX, textureY);
		bodyModel[222].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[222].setRotationPoint(-26.3f, 4.0f, -7.5f);

		bodyModel[223] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);
		bodyModel[223].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[223].setRotationPoint(-17.3f, 4.0f, -7.5f);

		bodyModel[224] = new ModelRendererTurbo(this, 197, 80, textureX, textureY);
		bodyModel[224].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[224].setRotationPoint(-13.3f, 4.0f, -7.5f);

		bodyModel[225] = new ModelRendererTurbo(this, 240, 59, textureX, textureY);
		bodyModel[225].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[225].setRotationPoint(-12.3f, 6.0f, -7.5f);

		bodyModel[226] = new ModelRendererTurbo(this, 249, 58, textureX, textureY);
		bodyModel[226].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[226].setRotationPoint(-30.3f, 4.0f, -7.5f);

		bodyModel[227] = new ModelRendererTurbo(this, 130, 94, textureX, textureY);
		bodyModel[227].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[227].setRotationPoint(-28.3f, 4.0f, -7.5f);

		bodyModel[228] = new ModelRendererTurbo(this, 249, 53, textureX, textureY);
		bodyModel[228].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[228].setRotationPoint(-17.3f, 4.0f, 6.5f);

		bodyModel[229] = new ModelRendererTurbo(this, 214, 92, textureX, textureY);
		bodyModel[229].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[229].setRotationPoint(-14.3f, 4.0f, 6.5f);

		bodyModel[230] = new ModelRendererTurbo(this, 240, 56, textureX, textureY);
		bodyModel[230].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[230].setRotationPoint(-12.3f, 6.0f, 6.5f);

		bodyModel[231] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		bodyModel[231].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[231].setRotationPoint(-13.3f, 4.0f, 6.5f);

		bodyModel[232] = new ModelRendererTurbo(this, 179, 3, textureX, textureY);
		bodyModel[232].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[232].setRotationPoint(-26.3f, 4.0f, 6.5f);

		bodyModel[233] = new ModelRendererTurbo(this, 251, 39, textureX, textureY);
		bodyModel[233].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[233].setRotationPoint(-28.3f, 4.0f, 6.5f);

		bodyModel[234] = new ModelRendererTurbo(this, 10, 33, textureX, textureY);
		bodyModel[234].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[234].setRotationPoint(-30.3f, 6.0f, 6.5f);

		bodyModel[235] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[235].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[235].setRotationPoint(-30.3f, 4.0f, 6.5f);

		bodyModel[236] = new ModelRendererTurbo(this, 56, 131, textureX, textureY);
		bodyModel[236].addBox(0, 0, 0, 3, 1, 10, 0f);
		bodyModel[236].setRotationPoint(24.5f, -21.0f, -5.0f);

		bodyModel[237] = new ModelRendererTurbo(this, 29, 131, textureX, textureY);
		bodyModel[237].addBox(0, 0, 0, 3, 1, 10, 0f);
		bodyModel[237].setRotationPoint(-25.5f, -21.0f, -5.0f);

		bodyModel[238] = new ModelRendererTurbo(this, 92, 159, textureX, textureY);
		bodyModel[238].addShapeBox(0, 0, 0, 0, 14, 1, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.7f, 0, 0, 0.7f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[238].setRotationPoint(30.9f, -15.200001f, -12.1f);

		bodyModel[239] = new ModelRendererTurbo(this, 122, 157, textureX, textureY);
		bodyModel[239].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.7f, 0, 0, 0.7f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[239].setRotationPoint(35.1f, -13.0f, -12.1f);

		bodyModel[240] = new ModelRendererTurbo(this, 119, 157, textureX, textureY);
		bodyModel[240].addShapeBox(0, 0, 0, 0, 14, 1, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.7f, 0, 0, 0.7f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[240].setRotationPoint(-29.0f, -15.200001f, -12.1f);

		bodyModel[241] = new ModelRendererTurbo(this, 157, 150, textureX, textureY);
		bodyModel[241].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.7f, 0, 0, 0.7f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[241].setRotationPoint(-33.0f, -13.0f, -12.1f);

		bodyModel[242] = new ModelRendererTurbo(this, 154, 150, textureX, textureY);
		bodyModel[242].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.7f, 0, 0, 0.7f);
		bodyModel[242].setRotationPoint(-33.0f, -13.0f, 9.9f);

		bodyModel[243] = new ModelRendererTurbo(this, 151, 150, textureX, textureY);
		bodyModel[243].addShapeBox(0, 0, 0, 0, 14, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.7f, 0, 0, 0.7f);
		bodyModel[243].setRotationPoint(-29.0f, -15.200001f, 9.9f);

		bodyModel[244] = new ModelRendererTurbo(this, 188, 140, textureX, textureY);
		bodyModel[244].addShapeBox(0, 0, 0, 0, 14, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.7f, 0, 0, 0.7f);
		bodyModel[244].setRotationPoint(31.0f, -15.200001f, 9.9f);

		bodyModel[245] = new ModelRendererTurbo(this, 252, 118, textureX, textureY);
		bodyModel[245].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.7f, 0, 0, 0.7f);
		bodyModel[245].setRotationPoint(35.1f, -13.0f, 9.9f);

		bodyModel[246] = new ModelRendererTurbo(this, 121, 129, textureX, textureY);
		bodyModel[246].addShapeBox(0, 0, 0, 3, 8, 1, 0, 0.1f, 0, -0.7f, -3, 0, -0.7f, 0, 0, 0.7f, 0, 0, 0.7f, 0.04f, 0, 0.1f, -0.7f, 0, 0, -0.6f, 0, 0, 0, 0, 0);
		bodyModel[246].setRotationPoint(0.0f, -16.6f, -10.2f);

		bodyModel[247] = new ModelRendererTurbo(this, 112, 129, textureX, textureY);
		bodyModel[247].addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, 0.7f, -2.94f, 0, 0.7f, -0.059999943f, 0, -0.7f, 0.1f, 0, -0.7f, 0, 0, 0, -0.6f, 0, 0, -0.7f, 0, 0, 0.04f, 0, 0.1f);
		bodyModel[247].setRotationPoint(0.0f, -16.599998f, 9.2f);

		bodyModel[248] = new ModelRendererTurbo(this, 243, 127, textureX, textureY);
		bodyModel[248].addShapeBox(0, 0, 0, 3, 8, 1, 0, -3, 0, -0.7f, 0.1f, 0, -0.7f, 0, 0, 0.7f, -2.94f, 0, 0.7f, -0.7f, 0, 0, 0.04f, 0, 0.1f, 0, 0, 0, -0.6f, 0, 0);
		bodyModel[248].setRotationPoint(-43.2f, -16.6f, -10.2f);

		bodyModel[249] = new ModelRendererTurbo(this, 191, 119, textureX, textureY);
		bodyModel[249].addShapeBox(0, 0, 0, 3, 8, 1, 0, -2.94f, 0, 0.7f, 0, 0, 0.7f, 0.1f, 0, -0.7f, -3, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0.04f, 0, 0.1f, -0.7f, 0, 0);
		bodyModel[249].setRotationPoint(-43.2f, -16.599998f, 9.2f);

		bodyModel[250] = new ModelRendererTurbo(this, 243, 117, textureX, textureY);
		bodyModel[250].addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, 0.7f, -2.94f, 0, 0.7f, -3, 0, -0.7f, 0.1f, 0, -0.7f, 0, 0, 0, -0.6f, 0, 0, -0.7f, 0, 0, 0.04f, 0, 0.1f);
		bodyModel[250].setRotationPoint(41.8f, -16.599998f, 9.2f);

		bodyModel[251] = new ModelRendererTurbo(this, 200, 117, textureX, textureY);
		bodyModel[251].addShapeBox(0, 0, 0, 3, 8, 1, 0, 0.1f, 0, -0.7f, -3, 0, -0.7f, -2.94f, 0, 0.7f, 0, 0, 0.7f, 0.04f, 0, 0.1f, -0.7f, 0, 0, -0.6f, 0, 0, 0, 0, 0);
		bodyModel[251].setRotationPoint(41.8f, -16.6f, -10.2f);

		bodyModel[252] = new ModelRendererTurbo(this, 226, 74, textureX, textureY);
		bodyModel[252].addBox(0, 0, 0, 12, 1, 2, 0f);
		bodyModel[252].setRotationPoint(-33.1f, -27.0f, -0.99f);
		bodyModel[252].rotateAngleZ = -0.5235988f;

		bodyModel[253] = new ModelRendererTurbo(this, 163, 79, textureX, textureY);
		bodyModel[253].addShapeBox(0, 0, 1, 12, 1, 1, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0);
		bodyModel[253].setRotationPoint(-33.1f, -27.0f, -1.0f);
		bodyModel[253].rotateAngleZ = 0.7853982f;

		bodyModel[254] = new ModelRendererTurbo(this, 163, 76, textureX, textureY);
		bodyModel[254].addShapeBox(0, 0, 1, 12, 1, 1, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0);
		bodyModel[254].setRotationPoint(-33.1f, -27.0f, -2.0f);
		bodyModel[254].rotateAngleZ = 0.7853982f;

		bodyModel[255] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[255].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[255].setRotationPoint(-24.9f, -34.5f, 6.99f);

		bodyModel[256] = new ModelRendererTurbo(this, 251, 32, textureX, textureY);
		bodyModel[256].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[256].setRotationPoint(-24.9f, -35.5f, 6.99f);

		bodyModel[257] = new ModelRendererTurbo(this, 146, 76, textureX, textureY);
		bodyModel[257].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[257].setRotationPoint(-24.9f, -35.5f, -7.01f);

		bodyModel[258] = new ModelRendererTurbo(this, 241, 32, textureX, textureY);
		bodyModel[258].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[258].setRotationPoint(-24.9f, -35.5f, -8.01f);

		bodyModel[259] = new ModelRendererTurbo(this, 173, 26, textureX, textureY);
		bodyModel[259].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[259].setRotationPoint(-24.9f, -34.5f, -8.01f);

		bodyModel[260] = new ModelRendererTurbo(this, 10, 26, textureX, textureY);
		bodyModel[260].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[260].setRotationPoint(23.0f, -22.7f, 6.99f);

		bodyModel[261] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[261].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[261].setRotationPoint(23.0f, -21.7f, 6.99f);

		bodyModel[262] = new ModelRendererTurbo(this, 218, 9, textureX, textureY);
		bodyModel[262].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[262].setRotationPoint(23.0f, -22.7f, -7.01f);

		bodyModel[263] = new ModelRendererTurbo(this, 251, 25, textureX, textureY);
		bodyModel[263].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[263].setRotationPoint(23.0f, -22.7f, -8.01f);

		bodyModel[264] = new ModelRendererTurbo(this, 240, 25, textureX, textureY);
		bodyModel[264].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[264].setRotationPoint(23.0f, -21.7f, -8.01f);

		bodyModel[265] = new ModelRendererTurbo(this, 216, 43, textureX, textureY);
		bodyModel[265].addShapeBox(0, 0, 1, 12, 1, 1, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3);
		bodyModel[265].setRotationPoint(23.8f, -22.6f, -1.01f);
		bodyModel[265].rotateAngleZ = -0.08726646f;

		bodyModel[266] = new ModelRendererTurbo(this, 189, 43, textureX, textureY);
		bodyModel[266].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3);
		bodyModel[266].setRotationPoint(23.8f, -22.6f, -1.01f);
		bodyModel[266].rotateAngleZ = -0.08726646f;

		bodyModel[267] = new ModelRendererTurbo(this, 228, 70, textureX, textureY);
		bodyModel[267].addBox(0, 0, 0, 11, 1, 2, 0f);
		bodyModel[267].setRotationPoint(24.8f, -20.6f, -1.01f);
		bodyModel[267].rotateAngleZ = -6.195919f;

		bodyModel[268] = new ModelRendererTurbo(this, 181, 86, textureX, textureY);
		bodyModel[268].addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[268].setRotationPoint(43.33f, -5.5f, -7.25f);

		bodyModel[269] = new ModelRendererTurbo(this, 210, 80, textureX, textureY);
		bodyModel[269].addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[269].setRotationPoint(43.32f, -5.5f, 4.05f);

		bodyModel[270] = new ModelRendererTurbo(this, 251, 6, textureX, textureY);
		bodyModel[270].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0);
		bodyModel[270].setRotationPoint(41.7f, -18.4f, -0.5f);

		bodyModel[271] = new ModelRendererTurbo(this, 192, 3, textureX, textureY);
		bodyModel[271].addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[271].setRotationPoint(-42.73f, -5.5f, 4.85f);

		bodyModel[272] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		bodyModel[272].addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[272].setRotationPoint(-42.73f, -5.5f, -8.05f);

		bodyModel[273] = new ModelRendererTurbo(this, 251, 3, textureX, textureY);
		bodyModel[273].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f);
		bodyModel[273].setRotationPoint(-41.1f, -18.6f, -0.5f);

		flipAll();
	}

}
