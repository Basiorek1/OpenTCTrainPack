//FMT-Marker DFM-1.0

package trainaddon.client.render.rollingstock.passenger;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.7 &copy; 2026 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model6B extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public Model6B(){
		bodyModel = new ModelRendererTurbo[278];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addShapeBox(0, 0, 0, 126, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[0].setRotationPoint(-65.0f, 2.0f, -10.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 213, 80, textureX, textureY);
		bodyModel[1].addShapeBox(0, 0, 0, 34, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[1].setRotationPoint(27.0f, -15.0f, -11.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 372, 110, textureX, textureY); // Box 136cp
		bodyModel[2].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(-48.0f, -4.0f, -10.0f);
		bodyModel[2].rotateAngleY = 6.2831855f;

		bodyModel[3] = new ModelRendererTurbo(this, 346, 112, textureX, textureY); // Box 136cp
		bodyModel[3].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[3].setRotationPoint(-47.0f, -3.0f, -10.0f);
		bodyModel[3].rotateAngleY = 6.2831855f;

		bodyModel[4] = new ModelRendererTurbo(this, 171, 135, textureX, textureY); // Box 136cp
		bodyModel[4].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(-44.0f, -10.0f, -10.0f);
		bodyModel[4].rotateAngleY = 6.2831855f;

		bodyModel[5] = new ModelRendererTurbo(this, 156, 135, textureX, textureY); // Box 136cp
		bodyModel[5].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(-2.0f, -10.0f, 4.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 329, 110, textureX, textureY); // Box 136cp
		bodyModel[6].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[6].setRotationPoint(-2.0f, -4.0f, 4.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 458, 111, textureX, textureY); // Box 136cp
		bodyModel[7].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[7].setRotationPoint(-1.0f, -3.0f, 4.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 289, 27, textureX, textureY);
		bodyModel[8].addShapeBox(0, 0, 0, 38, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[8].setRotationPoint(-21.0f, -15.0f, -11.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 142, 80, textureX, textureY);
		bodyModel[9].addShapeBox(0, 0, 0, 34, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[9].setRotationPoint(-65.0f, -15.0f, -11.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 71, 80, textureX, textureY);
		bodyModel[10].addShapeBox(0, 0, 0, 34, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[10].setRotationPoint(-65.0f, -15.0f, 10.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 380, 23, textureX, textureY);
		bodyModel[11].addShapeBox(0, 0, 0, 38, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[11].setRotationPoint(-21.0f, -15.0f, 10.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 0, 80, textureX, textureY);
		bodyModel[12].addShapeBox(0, 0, 0, 34, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[12].setRotationPoint(27.0f, -15.0f, 10.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 255, 75, textureX, textureY);
		bodyModel[13].addShapeBox(0, 0, 0, 126, 3, 1, 0, 0, -1.7f, 0, 0, -1.7f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[13].setRotationPoint(-65.0f, -18.0f, -11.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 0, 68, textureX, textureY);
		bodyModel[14].addShapeBox(0, 0, 0, 126, 2, 4, 0, 0, -1.2f, -2, 0, -1.2f, -2, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[14].setRotationPoint(-65.0f, -19.7f, -10.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 0, 53, textureX, textureY);
		bodyModel[15].addShapeBox(0, 0, 0, 126, 1, 6, 0, 0, -0.6f, -2, 0, -0.6f, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(-65.0f, -19.9f, -6.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 0, 61, textureX, textureY);
		bodyModel[16].addShapeBox(0, 0, 0, 126, 2, 4, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -1.2f, -2, 0, -1.2f, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[16].setRotationPoint(-65.0f, -19.7f, 6.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 0, 75, textureX, textureY);
		bodyModel[17].addShapeBox(0, 0, 0, 126, 3, 1, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -1.7f, 0, 0, -1.7f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(-65.0f, -18.0f, 10.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 376, 70, textureX, textureY);
		bodyModel[18].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[18].setRotationPoint(17.0f, 2.2f, 10.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 353, 70, textureX, textureY);
		bodyModel[19].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[19].setRotationPoint(17.0f, 2.2f, -11.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 330, 70, textureX, textureY);
		bodyModel[20].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[20].setRotationPoint(17.0f, 3.2f, 10.3f);

		bodyModel[21] = new ModelRendererTurbo(this, 307, 70, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[21].setRotationPoint(17.0f, 3.2f, -11.3f);

		bodyModel[22] = new ModelRendererTurbo(this, 284, 70, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[22].setRotationPoint(-31.0f, 2.2f, -11.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 261, 70, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[23].setRotationPoint(-31.0f, 3.2f, -11.3f);

		bodyModel[24] = new ModelRendererTurbo(this, 488, 39, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[24].setRotationPoint(-31.0f, 3.2f, 10.3f);

		bodyModel[25] = new ModelRendererTurbo(this, 269, 22, textureX, textureY);
		bodyModel[25].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[25].setRotationPoint(-31.0f, 2.2f, 10.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 507, 95, textureX, textureY);
		bodyModel[26].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[26].setRotationPoint(-29.0f, 2.2f, 9.3f);

		bodyModel[27] = new ModelRendererTurbo(this, 384, 95, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[27].setRotationPoint(-22.5f, 2.2f, 9.3f);

		bodyModel[28] = new ModelRendererTurbo(this, 379, 95, textureX, textureY);
		bodyModel[28].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[28].setRotationPoint(19.0f, 2.2f, 9.3f);

		bodyModel[29] = new ModelRendererTurbo(this, 374, 95, textureX, textureY);
		bodyModel[29].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[29].setRotationPoint(24.5f, 2.2f, 9.3f);

		bodyModel[30] = new ModelRendererTurbo(this, 369, 95, textureX, textureY);
		bodyModel[30].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[30].setRotationPoint(24.5f, 2.2f, -10.4f);

		bodyModel[31] = new ModelRendererTurbo(this, 402, 94, textureX, textureY);
		bodyModel[31].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[31].setRotationPoint(19.0f, 2.2f, -10.4f);

		bodyModel[32] = new ModelRendererTurbo(this, 503, 92, textureX, textureY);
		bodyModel[32].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[32].setRotationPoint(-23.5f, 2.2f, -10.4f);

		bodyModel[33] = new ModelRendererTurbo(this, 490, 86, textureX, textureY);
		bodyModel[33].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[33].setRotationPoint(-29.0f, 2.2f, -10.4f);

		bodyModel[34] = new ModelRendererTurbo(this, 109, 122, textureX, textureY);
		bodyModel[34].addShapeBox(0, 0, 0, 10, 17, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[34].setRotationPoint(-31.0f, -15.0f, -11.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 86, 122, textureX, textureY);
		bodyModel[35].addShapeBox(0, 0, 0, 10, 17, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[35].setRotationPoint(17.0f, -15.0f, -11.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 478, 111, textureX, textureY);
		bodyModel[36].addShapeBox(0, 0, 0, 10, 17, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[36].setRotationPoint(17.0f, -15.0f, 9.7f);

		bodyModel[37] = new ModelRendererTurbo(this, 281, 107, textureX, textureY);
		bodyModel[37].addShapeBox(0, 0, 0, 10, 17, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[37].setRotationPoint(-31.0f, -15.0f, 9.7f);

		bodyModel[38] = new ModelRendererTurbo(this, 258, 107, textureX, textureY);
		bodyModel[38].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[38].setRotationPoint(-65.0f, -15.0f, -10.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 435, 103, textureX, textureY);
		bodyModel[39].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[39].setRotationPoint(-65.0f, -18.0f, -10.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 257, 49, textureX, textureY);
		bodyModel[40].addShapeBox(0, 0, 0, 126, 2, 12, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[40].setRotationPoint(-65.0f, -19.7f, -6.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 495, 137, textureX, textureY);
		bodyModel[41].addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[41].setRotationPoint(-68.0f, -16.0f, 4.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 51, 137, textureX, textureY);
		bodyModel[42].addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[42].setRotationPoint(-68.0f, -16.0f, -5.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 430, 103, textureX, textureY);
		bodyModel[43].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[43].setRotationPoint(-68.0f, -17.0f, -4.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 87, 108, textureX, textureY);
		bodyModel[44].addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[44].setRotationPoint(-65.0f, 0.0f, -4.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 485, 92, textureX, textureY);
		bodyModel[45].addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[45].setRotationPoint(-69.0f, 1.0f, -1.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		bodyModel[46].addShapeBox(0, 0, 0, 124, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[46].setRotationPoint(-64.0f, 0.0f, -10.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 141, 135, textureX, textureY); // Box 136cp
		bodyModel[47].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[47].setRotationPoint(-63.0f, -10.0f, 4.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 389, 104, textureX, textureY); // Box 136cp
		bodyModel[48].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[48].setRotationPoint(-63.0f, -4.0f, 4.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 415, 111, textureX, textureY); // Box 136cp
		bodyModel[49].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[49].setRotationPoint(-62.0f, -3.0f, 4.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 126, 135, textureX, textureY); // Box 136cp
		bodyModel[50].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[50].setRotationPoint(-35.0f, -10.0f, -10.0f);
		bodyModel[50].rotateAngleY = 6.2831855f;

		bodyModel[51] = new ModelRendererTurbo(this, 346, 104, textureX, textureY); // Box 136cp
		bodyModel[51].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[51].setRotationPoint(-39.0f, -4.0f, -10.0f);
		bodyModel[51].rotateAngleY = 6.2831855f;

		bodyModel[52] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Box 136cp
		bodyModel[52].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[52].setRotationPoint(-38.0f, -3.0f, -10.0f);
		bodyModel[52].rotateAngleY = 6.2831855f;

		bodyModel[53] = new ModelRendererTurbo(this, 392, 103, textureX, textureY);
		bodyModel[53].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[53].setRotationPoint(28.0f, -17.0f, -10.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 349, 102, textureX, textureY);
		bodyModel[54].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[54].setRotationPoint(-33.0f, -17.0f, -10.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 201, 132, textureX, textureY); // Box 136cp
		bodyModel[55].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[55].setRotationPoint(-44.0f, -10.0f, 4.0f);
		bodyModel[55].rotateAngleY = 6.2831855f;

		bodyModel[56] = new ModelRendererTurbo(this, 481, 103, textureX, textureY); // Box 136cp
		bodyModel[56].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[56].setRotationPoint(-48.0f, -4.0f, 4.0f);
		bodyModel[56].rotateAngleY = 6.2831855f;

		bodyModel[57] = new ModelRendererTurbo(this, 214, 108, textureX, textureY); // Box 136cp
		bodyModel[57].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[57].setRotationPoint(-47.0f, -3.0f, 4.0f);
		bodyModel[57].rotateAngleY = 6.2831855f;

		bodyModel[58] = new ModelRendererTurbo(this, 67, 131, textureX, textureY); // Box 136cp
		bodyModel[58].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[58].setRotationPoint(-35.0f, -10.0f, 4.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 130, 108, textureX, textureY); // Box 136cp
		bodyModel[59].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[59].setRotationPoint(-38.0f, -3.0f, 4.0f);
		bodyModel[59].rotateAngleY = 6.2831855f;

		bodyModel[60] = new ModelRendererTurbo(this, 458, 103, textureX, textureY); // Box 136cp
		bodyModel[60].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[60].setRotationPoint(-39.0f, -4.0f, 4.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 306, 102, textureX, textureY);
		bodyModel[61].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[61].setRotationPoint(-20.0f, -17.0f, -10.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 215, 100, textureX, textureY);
		bodyModel[62].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[62].setRotationPoint(15.0f, -17.0f, -10.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 480, 130, textureX, textureY); // Box 136cp
		bodyModel[63].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[63].setRotationPoint(13.0f, -10.0f, 4.0f);
		bodyModel[63].rotateAngleY = 6.2831855f;

		bodyModel[64] = new ModelRendererTurbo(this, 415, 103, textureX, textureY); // Box 136cp
		bodyModel[64].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[64].setRotationPoint(9.0f, -4.0f, 4.0f);
		bodyModel[64].rotateAngleY = 6.2831855f;

		bodyModel[65] = new ModelRendererTurbo(this, 304, 107, textureX, textureY); // Box 136cp
		bodyModel[65].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[65].setRotationPoint(10.0f, -3.0f, 4.0f);
		bodyModel[65].rotateAngleY = 6.2831855f;

		bodyModel[66] = new ModelRendererTurbo(this, 465, 127, textureX, textureY); // Box 136cp
		bodyModel[66].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[66].setRotationPoint(30.0f, -10.0f, -10.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 372, 102, textureX, textureY); // Box 136cp
		bodyModel[67].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[67].setRotationPoint(30.0f, -4.0f, -10.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 257, 107, textureX, textureY); // Box 136cp
		bodyModel[68].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[68].setRotationPoint(31.0f, -3.0f, -10.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 450, 127, textureX, textureY); // Box 136cp
		bodyModel[69].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[69].setRotationPoint(30.0f, -10.0f, 4.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 329, 102, textureX, textureY); // Box 136cp
		bodyModel[70].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[70].setRotationPoint(30.0f, -4.0f, 4.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 136cp
		bodyModel[71].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[71].setRotationPoint(31.0f, -3.0f, 4.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 210, 122, textureX, textureY);
		bodyModel[72].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[72].setRotationPoint(-31.5f, -10.0f, 10.7f);

		bodyModel[73] = new ModelRendererTurbo(this, 506, 113, textureX, textureY);
		bodyModel[73].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[73].setRotationPoint(-20.5f, -10.0f, 10.7f);

		bodyModel[74] = new ModelRendererTurbo(this, 509, 112, textureX, textureY);
		bodyModel[74].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[74].setRotationPoint(16.5f, -10.0f, 10.7f);

		bodyModel[75] = new ModelRendererTurbo(this, 503, 110, textureX, textureY);
		bodyModel[75].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[75].setRotationPoint(27.5f, -10.0f, 10.7f);

		bodyModel[76] = new ModelRendererTurbo(this, 323, 107, textureX, textureY);
		bodyModel[76].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[76].setRotationPoint(27.5f, -10.0f, -12.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 232, 100, textureX, textureY);
		bodyModel[77].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[77].setRotationPoint(16.5f, -10.0f, -12.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 507, 99, textureX, textureY);
		bodyModel[78].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[78].setRotationPoint(-20.5f, -10.0f, -12.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 504, 96, textureX, textureY);
		bodyModel[79].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[79].setRotationPoint(-31.5f, -10.0f, -12.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 166, 102, textureX, textureY);
		bodyModel[80].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[80].setRotationPoint(-42.0f, 7.0f, -5.5f);

		bodyModel[81] = new ModelRendererTurbo(this, 109, 112, textureX, textureY);
		bodyModel[81].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[81].setRotationPoint(-41.5f, 7.5f, 5.5f);

		bodyModel[82] = new ModelRendererTurbo(this, 238, 100, textureX, textureY);
		bodyModel[82].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[82].setRotationPoint(-56.0f, 7.0f, -5.5f);

		bodyModel[83] = new ModelRendererTurbo(this, 505, 71, textureX, textureY);
		bodyModel[83].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[83].setRotationPoint(-42.0f, 7.0f, 5.5f);

		bodyModel[84] = new ModelRendererTurbo(this, 500, 57, textureX, textureY);
		bodyModel[84].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[84].setRotationPoint(-56.0f, 7.0f, 5.5f);

		bodyModel[85] = new ModelRendererTurbo(this, 369, 90, textureX, textureY);
		bodyModel[85].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[85].setRotationPoint(-44.0f, 8.0f, 6.5f);

		bodyModel[86] = new ModelRendererTurbo(this, 322, 88, textureX, textureY);
		bodyModel[86].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[86].setRotationPoint(-58.0f, 8.0f, 6.5f);

		bodyModel[87] = new ModelRendererTurbo(this, 398, 80, textureX, textureY);
		bodyModel[87].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[87].setRotationPoint(-41.0f, 4.0f, 6.5f);

		bodyModel[88] = new ModelRendererTurbo(this, 273, 3, textureX, textureY);
		bodyModel[88].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[88].setRotationPoint(-56.0f, 4.0f, 6.5f);

		bodyModel[89] = new ModelRendererTurbo(this, 339, 80, textureX, textureY);
		bodyModel[89].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[89].setRotationPoint(-39.0f, 6.0f, 6.5f);

		bodyModel[90] = new ModelRendererTurbo(this, 504, 64, textureX, textureY);
		bodyModel[90].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[90].setRotationPoint(-60.0f, 6.0f, 6.5f);

		bodyModel[91] = new ModelRendererTurbo(this, 498, 92, textureX, textureY);
		bodyModel[91].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[91].setRotationPoint(-49.0f, 5.0f, 6.5f);

		bodyModel[92] = new ModelRendererTurbo(this, 457, 90, textureX, textureY);
		bodyModel[92].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[92].setRotationPoint(-47.5f, 5.0f, 6.5f);

		bodyModel[93] = new ModelRendererTurbo(this, 398, 90, textureX, textureY);
		bodyModel[93].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[93].setRotationPoint(-50.5f, 5.0f, 6.5f);

		bodyModel[94] = new ModelRendererTurbo(this, 273, 6, textureX, textureY);
		bodyModel[94].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[94].setRotationPoint(-49.5f, 2.5f, -1.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 66, 100, textureX, textureY);
		bodyModel[95].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[95].setRotationPoint(-38.0f, 6.0f, -6.5f);

		bodyModel[96] = new ModelRendererTurbo(this, 23, 100, textureX, textureY);
		bodyModel[96].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[96].setRotationPoint(-60.0f, 6.0f, -6.5f);

		bodyModel[97] = new ModelRendererTurbo(this, 471, 67, textureX, textureY);
		bodyModel[97].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[97].setRotationPoint(-58.0f, 4.0f, 6.5f);

		bodyModel[98] = new ModelRendererTurbo(this, 400, 43, textureX, textureY);
		bodyModel[98].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[98].setRotationPoint(-48.5f, 3.5f, -1.0f);

		bodyModel[99] = new ModelRendererTurbo(this, 47, 110, textureX, textureY);
		bodyModel[99].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[99].setRotationPoint(-49.5f, 2.5f, 1.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 331, 91, textureX, textureY);
		bodyModel[100].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[100].setRotationPoint(-49.5f, 2.5f, -3.0f);

		bodyModel[101] = new ModelRendererTurbo(this, 371, 43, textureX, textureY);
		bodyModel[101].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[101].setRotationPoint(-60.5f, 3.5f, 0.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 259, 48, textureX, textureY);
		bodyModel[102].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[102].setRotationPoint(-39.0f, 6.0f, -7.5f);

		bodyModel[103] = new ModelRendererTurbo(this, 448, 67, textureX, textureY);
		bodyModel[103].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[103].setRotationPoint(-41.0f, 4.0f, -7.5f);

		bodyModel[104] = new ModelRendererTurbo(this, 471, 0, textureX, textureY);
		bodyModel[104].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[104].setRotationPoint(-56.0f, 4.0f, -7.5f);

		bodyModel[105] = new ModelRendererTurbo(this, 425, 67, textureX, textureY);
		bodyModel[105].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[105].setRotationPoint(-58.0f, 4.0f, -7.5f);

		bodyModel[106] = new ModelRendererTurbo(this, 459, 40, textureX, textureY);
		bodyModel[106].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[106].setRotationPoint(-60.0f, 6.0f, -7.5f);

		bodyModel[107] = new ModelRendererTurbo(this, 505, 55, textureX, textureY);
		bodyModel[107].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[107].setRotationPoint(-42.0f, 7.0f, -7.5f);

		bodyModel[108] = new ModelRendererTurbo(this, 428, 87, textureX, textureY);
		bodyModel[108].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[108].setRotationPoint(-58.0f, 8.0f, -7.5f);

		bodyModel[109] = new ModelRendererTurbo(this, 369, 87, textureX, textureY);
		bodyModel[109].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[109].setRotationPoint(-44.0f, 8.0f, -7.5f);

		bodyModel[110] = new ModelRendererTurbo(this, 341, 88, textureX, textureY);
		bodyModel[110].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[110].setRotationPoint(-49.0f, 5.0f, -7.5f);

		bodyModel[111] = new ModelRendererTurbo(this, 485, 85, textureX, textureY);
		bodyModel[111].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[111].setRotationPoint(-50.5f, 5.0f, -7.5f);

		bodyModel[112] = new ModelRendererTurbo(this, 507, 84, textureX, textureY);
		bodyModel[112].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[112].setRotationPoint(-47.5f, 5.0f, -7.5f);

		bodyModel[113] = new ModelRendererTurbo(this, 502, 84, textureX, textureY);
		bodyModel[113].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[113].setRotationPoint(-42.0f, 5.0f, -7.5f);

		bodyModel[114] = new ModelRendererTurbo(this, 259, 53, textureX, textureY);
		bodyModel[114].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[114].setRotationPoint(-56.0f, 7.0f, -7.5f);

		bodyModel[115] = new ModelRendererTurbo(this, 66, 100, textureX, textureY);
		bodyModel[115].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[115].setRotationPoint(-41.5f, 7.5f, -5.5f);

		bodyModel[116] = new ModelRendererTurbo(this, 23, 100, textureX, textureY);
		bodyModel[116].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[116].setRotationPoint(-55.5f, 7.5f, -5.5f);

		bodyModel[117] = new ModelRendererTurbo(this, 305, 87, textureX, textureY);
		bodyModel[117].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[117].setRotationPoint(-55.5f, 7.5f, 5.5f);

		bodyModel[118] = new ModelRendererTurbo(this, 489, 83, textureX, textureY);
		bodyModel[118].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[118].setRotationPoint(-58.0f, 7.0f, -7.5f);

		bodyModel[119] = new ModelRendererTurbo(this, 500, 52, textureX, textureY);
		bodyModel[119].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[119].setRotationPoint(-54.0f, 5.0f, -7.5f);

		bodyModel[120] = new ModelRendererTurbo(this, 459, 35, textureX, textureY);
		bodyModel[120].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[120].setRotationPoint(-45.0f, 5.0f, -7.5f);

		bodyModel[121] = new ModelRendererTurbo(this, 503, 33, textureX, textureY);
		bodyModel[121].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[121].setRotationPoint(-41.0f, 5.0f, -7.5f);

		bodyModel[122] = new ModelRendererTurbo(this, 339, 83, textureX, textureY);
		bodyModel[122].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[122].setRotationPoint(-40.0f, 7.0f, -7.5f);

		bodyModel[123] = new ModelRendererTurbo(this, 488, 33, textureX, textureY);
		bodyModel[123].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[123].setRotationPoint(-58.0f, 5.0f, -7.5f);

		bodyModel[124] = new ModelRendererTurbo(this, 507, 80, textureX, textureY);
		bodyModel[124].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[124].setRotationPoint(-56.0f, 5.0f, -7.5f);

		bodyModel[125] = new ModelRendererTurbo(this, 279, 35, textureX, textureY);
		bodyModel[125].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[125].setRotationPoint(-45.0f, 5.0f, 6.5f);

		bodyModel[126] = new ModelRendererTurbo(this, 502, 80, textureX, textureY);
		bodyModel[126].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[126].setRotationPoint(-42.0f, 5.0f, 6.5f);

		bodyModel[127] = new ModelRendererTurbo(this, 490, 80, textureX, textureY);
		bodyModel[127].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[127].setRotationPoint(-40.0f, 7.0f, 6.5f);

		bodyModel[128] = new ModelRendererTurbo(this, 13, 32, textureX, textureY);
		bodyModel[128].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[128].setRotationPoint(-41.0f, 5.0f, 6.5f);

		bodyModel[129] = new ModelRendererTurbo(this, 459, 30, textureX, textureY);
		bodyModel[129].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[129].setRotationPoint(-54.0f, 5.0f, 6.5f);

		bodyModel[130] = new ModelRendererTurbo(this, 485, 80, textureX, textureY);
		bodyModel[130].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[130].setRotationPoint(-56.0f, 5.0f, 6.5f);

		bodyModel[131] = new ModelRendererTurbo(this, 507, 67, textureX, textureY);
		bodyModel[131].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[131].setRotationPoint(-58.0f, 7.0f, 6.5f);

		bodyModel[132] = new ModelRendererTurbo(this, 503, 29, textureX, textureY);
		bodyModel[132].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[132].setRotationPoint(-58.0f, 5.0f, 6.5f);

		bodyModel[133] = new ModelRendererTurbo(this, 195, 100, textureX, textureY);
		bodyModel[133].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[133].setRotationPoint(51.0f, 7.0f, -5.5f);

		bodyModel[134] = new ModelRendererTurbo(this, 428, 80, textureX, textureY);
		bodyModel[134].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[134].setRotationPoint(51.0f, 7.5f, 5.5f);

		bodyModel[135] = new ModelRendererTurbo(this, 152, 100, textureX, textureY);
		bodyModel[135].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[135].setRotationPoint(37.0f, 7.0f, -5.5f);

		bodyModel[136] = new ModelRendererTurbo(this, 488, 29, textureX, textureY);
		bodyModel[136].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[136].setRotationPoint(51.0f, 7.0f, 5.5f);

		bodyModel[137] = new ModelRendererTurbo(this, 459, 26, textureX, textureY);
		bodyModel[137].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[137].setRotationPoint(37.0f, 7.0f, 5.5f);

		bodyModel[138] = new ModelRendererTurbo(this, 494, 70, textureX, textureY);
		bodyModel[138].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[138].setRotationPoint(49.0f, 8.0f, 6.5f);

		bodyModel[139] = new ModelRendererTurbo(this, 399, 70, textureX, textureY);
		bodyModel[139].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[139].setRotationPoint(35.0f, 8.0f, 6.5f);

		bodyModel[140] = new ModelRendererTurbo(this, 282, 25, textureX, textureY);
		bodyModel[140].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[140].setRotationPoint(52.0f, 4.0f, 6.5f);

		bodyModel[141] = new ModelRendererTurbo(this, 359, 0, textureX, textureY);
		bodyModel[141].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[141].setRotationPoint(37.0f, 4.0f, 6.5f);

		bodyModel[142] = new ModelRendererTurbo(this, 503, 24, textureX, textureY);
		bodyModel[142].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[142].setRotationPoint(54.0f, 6.0f, 6.5f);

		bodyModel[143] = new ModelRendererTurbo(this, 459, 23, textureX, textureY);
		bodyModel[143].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[143].setRotationPoint(33.0f, 6.0f, 6.5f);

		bodyModel[144] = new ModelRendererTurbo(this, 457, 80, textureX, textureY);
		bodyModel[144].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[144].setRotationPoint(44.0f, 5.0f, 6.5f);

		bodyModel[145] = new ModelRendererTurbo(this, 444, 80, textureX, textureY);
		bodyModel[145].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[145].setRotationPoint(45.5f, 5.0f, 6.5f);

		bodyModel[146] = new ModelRendererTurbo(this, 385, 80, textureX, textureY);
		bodyModel[146].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[146].setRotationPoint(42.5f, 5.0f, 6.5f);

		bodyModel[147] = new ModelRendererTurbo(this, 359, 3, textureX, textureY);
		bodyModel[147].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[147].setRotationPoint(43.5f, 2.5f, -1.0f);

		bodyModel[148] = new ModelRendererTurbo(this, 428, 80, textureX, textureY);
		bodyModel[148].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[148].setRotationPoint(55.0f, 6.0f, -6.5f);

		bodyModel[149] = new ModelRendererTurbo(this, 369, 80, textureX, textureY);
		bodyModel[149].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[149].setRotationPoint(33.0f, 6.0f, -6.5f);

		bodyModel[150] = new ModelRendererTurbo(this, 488, 22, textureX, textureY);
		bodyModel[150].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[150].setRotationPoint(35.0f, 4.0f, 6.5f);

		bodyModel[151] = new ModelRendererTurbo(this, 446, 15, textureX, textureY);
		bodyModel[151].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[151].setRotationPoint(44.5f, 3.5f, -1.0f);

		bodyModel[152] = new ModelRendererTurbo(this, 269, 35, textureX, textureY);
		bodyModel[152].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[152].setRotationPoint(43.5f, 2.5f, 1.0f);

		bodyModel[153] = new ModelRendererTurbo(this, 385, 14, textureX, textureY);
		bodyModel[153].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[153].setRotationPoint(43.5f, 2.5f, -3.0f);

		bodyModel[154] = new ModelRendererTurbo(this, 359, 15, textureX, textureY);
		bodyModel[154].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[154].setRotationPoint(32.5f, 3.5f, 0.0f);

		bodyModel[155] = new ModelRendererTurbo(this, 307, 9, textureX, textureY);
		bodyModel[155].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[155].setRotationPoint(54.0f, 6.0f, -7.5f);

		bodyModel[156] = new ModelRendererTurbo(this, 13, 22, textureX, textureY);
		bodyModel[156].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[156].setRotationPoint(52.0f, 4.0f, -7.5f);

		bodyModel[157] = new ModelRendererTurbo(this, 273, 0, textureX, textureY);
		bodyModel[157].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[157].setRotationPoint(37.0f, 4.0f, -7.5f);

		bodyModel[158] = new ModelRendererTurbo(this, 503, 19, textureX, textureY);
		bodyModel[158].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[158].setRotationPoint(35.0f, 4.0f, -7.5f);

		bodyModel[159] = new ModelRendererTurbo(this, 504, 0, textureX, textureY);
		bodyModel[159].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[159].setRotationPoint(33.0f, 6.0f, -7.5f);

		bodyModel[160] = new ModelRendererTurbo(this, 306, 16, textureX, textureY);
		bodyModel[160].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[160].setRotationPoint(51.0f, 7.0f, -7.5f);

		bodyModel[161] = new ModelRendererTurbo(this, 494, 67, textureX, textureY);
		bodyModel[161].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[161].setRotationPoint(35.0f, 8.0f, -7.5f);

		bodyModel[162] = new ModelRendererTurbo(this, 293, 18, textureX, textureY);
		bodyModel[162].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[162].setRotationPoint(49.0f, 8.0f, -7.5f);

		bodyModel[163] = new ModelRendererTurbo(this, 322, 80, textureX, textureY);
		bodyModel[163].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[163].setRotationPoint(44.0f, 5.0f, -7.5f);

		bodyModel[164] = new ModelRendererTurbo(this, 478, 67, textureX, textureY);
		bodyModel[164].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[164].setRotationPoint(42.5f, 5.0f, -7.5f);

		bodyModel[165] = new ModelRendererTurbo(this, 455, 67, textureX, textureY);
		bodyModel[165].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[165].setRotationPoint(45.5f, 5.0f, -7.5f);

		bodyModel[166] = new ModelRendererTurbo(this, 432, 67, textureX, textureY);
		bodyModel[166].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[166].setRotationPoint(51.0f, 5.0f, -7.5f);

		bodyModel[167] = new ModelRendererTurbo(this, 273, 11, textureX, textureY);
		bodyModel[167].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[167].setRotationPoint(37.0f, 7.0f, -7.5f);

		bodyModel[168] = new ModelRendererTurbo(this, 369, 80, textureX, textureY);
		bodyModel[168].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[168].setRotationPoint(51.5f, 7.5f, -5.5f);

		bodyModel[169] = new ModelRendererTurbo(this, 305, 80, textureX, textureY);
		bodyModel[169].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[169].setRotationPoint(37.5f, 7.5f, -5.5f);

		bodyModel[170] = new ModelRendererTurbo(this, 498, 8, textureX, textureY);
		bodyModel[170].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[170].setRotationPoint(37.5f, 7.5f, 5.5f);

		bodyModel[171] = new ModelRendererTurbo(this, 507, 52, textureX, textureY);
		bodyModel[171].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[171].setRotationPoint(35.0f, 7.0f, -7.5f);

		bodyModel[172] = new ModelRendererTurbo(this, 13, 10, textureX, textureY);
		bodyModel[172].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[172].setRotationPoint(39.0f, 5.0f, -7.5f);

		bodyModel[173] = new ModelRendererTurbo(this, 359, 8, textureX, textureY);
		bodyModel[173].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[173].setRotationPoint(48.0f, 5.0f, -7.5f);

		bodyModel[174] = new ModelRendererTurbo(this, 307, 5, textureX, textureY);
		bodyModel[174].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[174].setRotationPoint(52.0f, 5.0f, -7.5f);

		bodyModel[175] = new ModelRendererTurbo(this, 264, 52, textureX, textureY);
		bodyModel[175].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[175].setRotationPoint(53.0f, 7.0f, -7.5f);

		bodyModel[176] = new ModelRendererTurbo(this, 393, 4, textureX, textureY);
		bodyModel[176].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[176].setRotationPoint(35.0f, 5.0f, -7.5f);

		bodyModel[177] = new ModelRendererTurbo(this, 0, 53, textureX, textureY);
		bodyModel[177].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[177].setRotationPoint(37.0f, 5.0f, -7.5f);

		bodyModel[178] = new ModelRendererTurbo(this, 488, 3, textureX, textureY);
		bodyModel[178].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[178].setRotationPoint(48.0f, 5.0f, 6.5f);

		bodyModel[179] = new ModelRendererTurbo(this, 0, 45, textureX, textureY);
		bodyModel[179].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[179].setRotationPoint(51.0f, 5.0f, 6.5f);

		bodyModel[180] = new ModelRendererTurbo(this, 269, 35, textureX, textureY);
		bodyModel[180].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[180].setRotationPoint(53.0f, 7.0f, 6.5f);

		bodyModel[181] = new ModelRendererTurbo(this, 393, 0, textureX, textureY);
		bodyModel[181].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[181].setRotationPoint(52.0f, 5.0f, 6.5f);

		bodyModel[182] = new ModelRendererTurbo(this, 306, 0, textureX, textureY);
		bodyModel[182].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[182].setRotationPoint(39.0f, 5.0f, 6.5f);

		bodyModel[183] = new ModelRendererTurbo(this, 0, 32, textureX, textureY);
		bodyModel[183].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[183].setRotationPoint(37.0f, 5.0f, 6.5f);

		bodyModel[184] = new ModelRendererTurbo(this, 269, 28, textureX, textureY);
		bodyModel[184].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[184].setRotationPoint(35.0f, 7.0f, 6.5f);

		bodyModel[185] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		bodyModel[185].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[185].setRotationPoint(35.0f, 5.0f, 6.5f);

		bodyModel[186] = new ModelRendererTurbo(this, 435, 127, textureX, textureY); // Box 136cp
		bodyModel[186].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[186].setRotationPoint(-2.0f, -10.0f, -10.0f);

		bodyModel[187] = new ModelRendererTurbo(this, 209, 100, textureX, textureY); // Box 136cp
		bodyModel[187].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[187].setRotationPoint(-2.0f, -4.0f, -10.0f);

		bodyModel[188] = new ModelRendererTurbo(this, 444, 80, textureX, textureY); // Box 136cp
		bodyModel[188].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[188].setRotationPoint(-1.0f, -3.0f, -10.0f);

		bodyModel[189] = new ModelRendererTurbo(this, 495, 124, textureX, textureY); // Box 136cp
		bodyModel[189].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[189].setRotationPoint(-63.0f, -10.0f, -10.0f);

		bodyModel[190] = new ModelRendererTurbo(this, 126, 100, textureX, textureY); // Box 136cp
		bodyModel[190].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[190].setRotationPoint(-63.0f, -4.0f, -10.0f);

		bodyModel[191] = new ModelRendererTurbo(this, 385, 80, textureX, textureY); // Box 136cp
		bodyModel[191].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[191].setRotationPoint(-62.0f, -3.0f, -10.0f);

		bodyModel[192] = new ModelRendererTurbo(this, 58, 124, textureX, textureY); // Box 136cp
		bodyModel[192].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[192].setRotationPoint(13.0f, -10.0f, -10.0f);
		bodyModel[192].rotateAngleY = 6.2831855f;

		bodyModel[193] = new ModelRendererTurbo(this, 82, 100, textureX, textureY); // Box 136cp
		bodyModel[193].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[193].setRotationPoint(9.0f, -4.0f, -10.0f);
		bodyModel[193].rotateAngleY = 6.2831855f;

		bodyModel[194] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 136cp
		bodyModel[194].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[194].setRotationPoint(10.0f, -3.0f, -10.0f);
		bodyModel[194].rotateAngleY = 6.2831855f;

		bodyModel[195] = new ModelRendererTurbo(this, 0, 45, textureX, textureY);
		bodyModel[195].addShapeBox(0, 0, 0, 126, 1, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.6f, -2, 0, -0.6f, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[195].setRotationPoint(-65.0f, -19.9f, 0.0f);

		bodyModel[196] = new ModelRendererTurbo(this, 39, 100, textureX, textureY);
		bodyModel[196].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0);
		bodyModel[196].setRotationPoint(-68.0f, 0.0f, -4.0f);

		bodyModel[197] = new ModelRendererTurbo(this, 371, 27, textureX, textureY);
		bodyModel[197].flip = true;
		bodyModel[197].addCylinder(0, 0, 0, 2, 10, 8, 1, 1, 4);
		bodyModel[197].setRotationPoint(16.0f, 4.7f, 0.0f);
		bodyModel[197].rotateAngleX = 1.5707964f;

		bodyModel[198] = new ModelRendererTurbo(this, 54, 100, textureX, textureY);
		bodyModel[198].flip = true;
		bodyModel[198].addCylinder(0, 0, 0, 2, 2, 8, 1, 1, 4);
		bodyModel[198].setRotationPoint(11.0f, -21.0f, 3.0f);

		bodyModel[199] = new ModelRendererTurbo(this, 305, 96, textureX, textureY);
		bodyModel[199].addShapeBox(0, 0, 0, 6, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[199].setRotationPoint(9.0f, -20.0f, -4.0f);

		bodyModel[200] = new ModelRendererTurbo(this, 43, 124, textureX, textureY); // Box 136cp
		bodyModel[200].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[200].setRotationPoint(-12.0f, -10.0f, 4.0f);

		bodyModel[201] = new ModelRendererTurbo(this, 322, 80, textureX, textureY); // Box 136cp
		bodyModel[201].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[201].setRotationPoint(-12.0f, -4.0f, 4.0f);

		bodyModel[202] = new ModelRendererTurbo(this, 269, 25, textureX, textureY); // Box 136cp
		bodyModel[202].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[202].setRotationPoint(-11.0f, -3.0f, 4.0f);

		bodyModel[203] = new ModelRendererTurbo(this, 192, 122, textureX, textureY); // Box 136cp
		bodyModel[203].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[203].setRotationPoint(-12.0f, -10.0f, -10.0f);

		bodyModel[204] = new ModelRendererTurbo(this, 477, 67, textureX, textureY); // Box 136cp
		bodyModel[204].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[204].setRotationPoint(-12.0f, -4.0f, -10.0f);

		bodyModel[205] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 136cp
		bodyModel[205].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[205].setRotationPoint(-11.0f, -3.0f, -10.0f);

		bodyModel[206] = new ModelRendererTurbo(this, 454, 67, textureX, textureY); // Box 136cp
		bodyModel[206].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[206].setRotationPoint(44.0f, -4.0f, 4.0f);
		bodyModel[206].rotateAngleY = 6.2831855f;

		bodyModel[207] = new ModelRendererTurbo(this, 177, 122, textureX, textureY); // Box 136cp
		bodyModel[207].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[207].setRotationPoint(48.0f, -10.0f, 4.0f);
		bodyModel[207].rotateAngleY = 6.2831855f;

		bodyModel[208] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 136cp
		bodyModel[208].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[208].setRotationPoint(45.0f, -3.0f, 4.0f);
		bodyModel[208].rotateAngleY = 6.2831855f;

		bodyModel[209] = new ModelRendererTurbo(this, 431, 67, textureX, textureY); // Box 136cp
		bodyModel[209].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[209].setRotationPoint(54.0f, -4.0f, 4.0f);
		bodyModel[209].rotateAngleY = 6.2831855f;

		bodyModel[210] = new ModelRendererTurbo(this, 162, 122, textureX, textureY); // Box 136cp
		bodyModel[210].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[210].setRotationPoint(58.0f, -10.0f, 4.0f);
		bodyModel[210].rotateAngleY = 6.2831855f;

		bodyModel[211] = new ModelRendererTurbo(this, 43, 100, textureX, textureY);
		bodyModel[211].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[211].setRotationPoint(60.0f, -18.0f, -10.0f);

		bodyModel[212] = new ModelRendererTurbo(this, 294, 6, textureX, textureY); // Box 136cp
		bodyModel[212].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[212].setRotationPoint(55.0f, -3.0f, 4.0f);
		bodyModel[212].rotateAngleY = 6.2831855f;

		bodyModel[213] = new ModelRendererTurbo(this, 380, 3, textureX, textureY); // Box 136cp
		bodyModel[213].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[213].setRotationPoint(55.0f, -3.0f, -10.0f);
		bodyModel[213].rotateAngleY = 6.2831855f;

		bodyModel[214] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136cp
		bodyModel[214].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[214].setRotationPoint(45.0f, -3.0f, -10.0f);
		bodyModel[214].rotateAngleY = 6.2831855f;

		bodyModel[215] = new ModelRendererTurbo(this, 408, 67, textureX, textureY); // Box 136cp
		bodyModel[215].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[215].setRotationPoint(54.0f, -4.0f, -10.0f);
		bodyModel[215].rotateAngleY = 6.2831855f;

		bodyModel[216] = new ModelRendererTurbo(this, 147, 122, textureX, textureY); // Box 136cp
		bodyModel[216].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[216].setRotationPoint(58.0f, -10.0f, -10.0f);
		bodyModel[216].rotateAngleY = 6.2831855f;

		bodyModel[217] = new ModelRendererTurbo(this, 471, 3, textureX, textureY); // Box 136cp
		bodyModel[217].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[217].setRotationPoint(44.0f, -4.0f, -10.0f);
		bodyModel[217].rotateAngleY = 6.2831855f;

		bodyModel[218] = new ModelRendererTurbo(this, 132, 122, textureX, textureY); // Box 136cp
		bodyModel[218].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[218].setRotationPoint(48.0f, -10.0f, -10.0f);
		bodyModel[218].rotateAngleY = 6.2831855f;

		bodyModel[219] = new ModelRendererTurbo(this, 488, 29, textureX, textureY);
		bodyModel[219].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[219].setRotationPoint(61.0f, -17.0f, -4.0f);

		bodyModel[220] = new ModelRendererTurbo(this, 0, 100, textureX, textureY);
		bodyModel[220].addShapeBox(-6, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[220].setRotationPoint(66.0f, -15.0f, -10.0f);

		bodyModel[221] = new ModelRendererTurbo(this, 42, 137, textureX, textureY);
		bodyModel[221].addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[221].setRotationPoint(61.0f, -16.0f, -5.0f);

		bodyModel[222] = new ModelRendererTurbo(this, 488, 19, textureX, textureY);
		bodyModel[222].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0);
		bodyModel[222].setRotationPoint(61.0f, 0.0f, -4.0f);

		bodyModel[223] = new ModelRendererTurbo(this, 186, 135, textureX, textureY);
		bodyModel[223].addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[223].setRotationPoint(61.0f, -16.0f, 4.0f);

		bodyModel[224] = new ModelRendererTurbo(this, 498, 3, textureX, textureY);
		bodyModel[224].addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[224].setRotationPoint(61.0f, 1.0f, -1.0f);

		bodyModel[225] = new ModelRendererTurbo(this, 446, 80, textureX, textureY);
		bodyModel[225].addShapeBox(0, 0, 0, 10, 4, 18, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[225].setRotationPoint(-31.0f, -20.0f, -9.0f);

		bodyModel[226] = new ModelRendererTurbo(this, 389, 80, textureX, textureY);
		bodyModel[226].addShapeBox(0, 0, 0, 10, 4, 18, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[226].setRotationPoint(17.0f, -20.0f, -9.0f);

		bodyModel[227] = new ModelRendererTurbo(this, 500, 48, textureX, textureY);
		bodyModel[227].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[227].setRotationPoint(46.0f, -20.0f, -1.5f);

		bodyModel[228] = new ModelRendererTurbo(this, 446, 8, textureX, textureY);
		bodyModel[228].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[228].setRotationPoint(0.0f, -20.0f, -1.5f);

		bodyModel[229] = new ModelRendererTurbo(this, 446, 4, textureX, textureY);
		bodyModel[229].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[229].setRotationPoint(-51.0f, -20.0f, -1.5f);

		bodyModel[230] = new ModelRendererTurbo(this, 446, 0, textureX, textureY);
		bodyModel[230].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[230].setRotationPoint(-10.0f, -20.0f, -1.5f);

		bodyModel[231] = new ModelRendererTurbo(this, 380, 0, textureX, textureY);
		bodyModel[231].addBox(0, 0, 0, 22, 1, 21, 0f);
		bodyModel[231].setRotationPoint(-20.0f, 3.0f, -10.5f);

		bodyModel[232] = new ModelRendererTurbo(this, 293, 0, textureX, textureY);
		bodyModel[232].addShapeBox(0, 0, 0, 22, 5, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f);
		bodyModel[232].setRotationPoint(-20.0f, 4.0f, -10.5f);

		bodyModel[233] = new ModelRendererTurbo(this, 263, 80, textureX, textureY);
		bodyModel[233].addShapeBox(0, 0, 0, 10, 5, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f);
		bodyModel[233].setRotationPoint(3.0f, 4.0f, -10.5f);

		bodyModel[234] = new ModelRendererTurbo(this, 446, 22, textureX, textureY);
		bodyModel[234].addBox(0, 0, 0, 10, 1, 21, 0f);
		bodyModel[234].setRotationPoint(3.0f, 3.0f, -10.5f);

		bodyModel[235] = new ModelRendererTurbo(this, 175, 145, textureX, textureY);
		bodyModel[235].addShapeBox(0, 0, 0, 124, 2, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[235].setRotationPoint(-64.0f, -18.0f, -10.0f);

		bodyModel[236] = new ModelRendererTurbo(this, 269, 25, textureX, textureY);
		bodyModel[236].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[236].setRotationPoint(39.5f, -23.5f, 7.0f);

		bodyModel[237] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
		bodyModel[237].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[237].setRotationPoint(39.5f, -24.5f, 7.0f);

		bodyModel[238] = new ModelRendererTurbo(this, 305, 80, textureX, textureY);
		bodyModel[238].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[238].setRotationPoint(39.5f, -24.5f, -7.0f);

		bodyModel[239] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		bodyModel[239].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[239].setRotationPoint(39.5f, -24.5f, -8.0f);

		bodyModel[240] = new ModelRendererTurbo(this, 395, 16, textureX, textureY);
		bodyModel[240].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[240].setRotationPoint(39.5f, -23.5f, -8.0f);

		bodyModel[241] = new ModelRendererTurbo(this, 287, 67, textureX, textureY);
		bodyModel[241].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[241].setRotationPoint(28.2f, -22.6f, -5.0f);
		bodyModel[241].rotateAngleZ = -6.161012f;

		bodyModel[242] = new ModelRendererTurbo(this, 389, 67, textureX, textureY);
		bodyModel[242].addShapeBox(0, 0, 0, 11, 1, 1, 0, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8);
		bodyModel[242].setRotationPoint(28.2f, -22.61f, 3.0000002f);
		bodyModel[242].rotateAngleZ = 0.11868239f;

		bodyModel[243] = new ModelRendererTurbo(this, 260, 67, textureX, textureY);
		bodyModel[243].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[243].setRotationPoint(28.2f, -22.6f, 4.0f);
		bodyModel[243].rotateAngleZ = -6.161012f;

		bodyModel[244] = new ModelRendererTurbo(this, 477, 64, textureX, textureY);
		bodyModel[244].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[244].setRotationPoint(40.3f, -21.0f, 5.0f);
		bodyModel[244].rotateAngleY = -3.1415927f;
		bodyModel[244].rotateAngleZ = -6.161012f;

		bodyModel[245] = new ModelRendererTurbo(this, 475, 15, textureX, textureY);
		bodyModel[245].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[245].setRotationPoint(41.5f, -20.1f, 4.01f);

		bodyModel[246] = new ModelRendererTurbo(this, 395, 13, textureX, textureY);
		bodyModel[246].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[246].setRotationPoint(37.5f, -20.1f, 4.01f);

		bodyModel[247] = new ModelRendererTurbo(this, 273, 6, textureX, textureY);
		bodyModel[247].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[247].setRotationPoint(37.5f, -21.1f, -4.99f);

		bodyModel[248] = new ModelRendererTurbo(this, 109, 100, textureX, textureY);
		bodyModel[248].addBox(0, 0, 0, 3, 1, 10, 0f);
		bodyModel[248].setRotationPoint(38.5f, -21.5f, -4.99f);

		bodyModel[249] = new ModelRendererTurbo(this, 450, 64, textureX, textureY);
		bodyModel[249].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[249].setRotationPoint(40.0f, -21.5f, 4.0f);
		bodyModel[249].rotateAngleZ = -6.1784654f;

		bodyModel[250] = new ModelRendererTurbo(this, 423, 64, textureX, textureY);
		bodyModel[250].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[250].setRotationPoint(40.2f, -24.1f, 4.0f);
		bodyModel[250].rotateAngleZ = -0.10471976f;

		bodyModel[251] = new ModelRendererTurbo(this, 396, 64, textureX, textureY);
		bodyModel[251].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[251].setRotationPoint(40.3f, -21.0f, -3.9799995f);
		bodyModel[251].rotateAngleY = -3.1415927f;
		bodyModel[251].rotateAngleZ = -6.161012f;

		bodyModel[252] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		bodyModel[252].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[252].setRotationPoint(37.5f, -20.1f, -4.99f);

		bodyModel[253] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		bodyModel[253].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[253].setRotationPoint(41.5f, -20.1f, -4.99f);

		bodyModel[254] = new ModelRendererTurbo(this, 369, 64, textureX, textureY);
		bodyModel[254].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[254].setRotationPoint(40.2f, -24.1f, -5.0f);
		bodyModel[254].rotateAngleZ = -0.10471976f;

		bodyModel[255] = new ModelRendererTurbo(this, 342, 64, textureX, textureY);
		bodyModel[255].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[255].setRotationPoint(40.0f, -21.5f, -4.9799995f);
		bodyModel[255].rotateAngleZ = -6.1784654f;

		bodyModel[256] = new ModelRendererTurbo(this, 364, 67, textureX, textureY);
		bodyModel[256].addShapeBox(0, 0, 0, 11, 1, 1, 0, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8);
		bodyModel[256].setRotationPoint(40.8f, -24.01f, 3.0000002f);
		bodyModel[256].rotateAngleZ = -0.1134464f;

		bodyModel[257] = new ModelRendererTurbo(this, 315, 64, textureX, textureY);
		bodyModel[257].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[257].setRotationPoint(-42.5f, -34.5f, 4.0f);
		bodyModel[257].rotateAngleZ = -0.5235988f;

		bodyModel[258] = new ModelRendererTurbo(this, 339, 67, textureX, textureY);
		bodyModel[258].addShapeBox(0, 0, 0, 11, 1, 1, 0, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8);
		bodyModel[258].setRotationPoint(-42.2f, -34.31f, 3.0f);
		bodyModel[258].rotateAngleZ = -0.5235988f;

		bodyModel[259] = new ModelRendererTurbo(this, 288, 64, textureX, textureY);
		bodyModel[259].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[259].setRotationPoint(-42.5f, -34.5f, -5.0f);
		bodyModel[259].rotateAngleZ = -0.5235988f;

		bodyModel[260] = new ModelRendererTurbo(this, 261, 64, textureX, textureY);
		bodyModel[260].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[260].setRotationPoint(-43.0f, -21.6f, -4.9799995f);
		bodyModel[260].rotateAngleZ = -5.67232f;

		bodyModel[261] = new ModelRendererTurbo(this, 294, 9, textureX, textureY);
		bodyModel[261].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[261].setRotationPoint(-43.0f, -33.6f, 7.0f);

		bodyModel[262] = new ModelRendererTurbo(this, 471, 6, textureX, textureY);
		bodyModel[262].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[262].setRotationPoint(-43.0f, -34.6f, 7.0f);

		bodyModel[263] = new ModelRendererTurbo(this, 481, 3, textureX, textureY);
		bodyModel[263].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[263].setRotationPoint(-43.0f, -34.6f, -7.0f);

		bodyModel[264] = new ModelRendererTurbo(this, 380, 6, textureX, textureY);
		bodyModel[264].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[264].setRotationPoint(-43.0f, -34.6f, -8.0f);

		bodyModel[265] = new ModelRendererTurbo(this, 294, 6, textureX, textureY);
		bodyModel[265].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[265].setRotationPoint(-43.0f, -33.6f, -8.0f);

		bodyModel[266] = new ModelRendererTurbo(this, 483, 45, textureX, textureY);
		bodyModel[266].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[266].setRotationPoint(-43.0f, -21.6f, 4.0f);
		bodyModel[266].rotateAngleZ = -5.67232f;

		bodyModel[267] = new ModelRendererTurbo(this, 485, 80, textureX, textureY);
		bodyModel[267].addBox(0, 0, 0, 3, 1, 10, 0f);
		bodyModel[267].setRotationPoint(-44.5f, -21.6f, -4.99f);

		bodyModel[268] = new ModelRendererTurbo(this, 359, 3, textureX, textureY);
		bodyModel[268].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[268].setRotationPoint(-45.5f, -21.2f, -4.99f);

		bodyModel[269] = new ModelRendererTurbo(this, 471, 3, textureX, textureY);
		bodyModel[269].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[269].setRotationPoint(-41.5f, -20.2f, -4.99f);

		bodyModel[270] = new ModelRendererTurbo(this, 380, 3, textureX, textureY);
		bodyModel[270].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[270].setRotationPoint(-41.5f, -20.2f, 4.01f);

		bodyModel[271] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		bodyModel[271].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[271].setRotationPoint(-45.5f, -20.2f, 4.01f);

		bodyModel[272] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[272].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[272].setRotationPoint(-45.5f, -20.2f, -4.99f);

		bodyModel[273] = new ModelRendererTurbo(this, 456, 45, textureX, textureY);
		bodyModel[273].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[273].setRotationPoint(-42.7f, -21.1f, -3.98f);
		bodyModel[273].rotateAngleY = -3.1415927f;
		bodyModel[273].rotateAngleZ = -5.67232f;

		bodyModel[274] = new ModelRendererTurbo(this, 429, 45, textureX, textureY);
		bodyModel[274].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[274].setRotationPoint(-42.7f, -21.1f, 5.0f);
		bodyModel[274].rotateAngleY = -3.1415927f;
		bodyModel[274].rotateAngleZ = -5.67232f;

		bodyModel[275] = new ModelRendererTurbo(this, 259, 45, textureX, textureY);
		bodyModel[275].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[275].setRotationPoint(-52.5f, -28.0f, -5.0f);
		bodyModel[275].rotateAngleZ = -5.7072268f;

		bodyModel[276] = new ModelRendererTurbo(this, 314, 67, textureX, textureY);
		bodyModel[276].addShapeBox(0, 0, 0, 11, 1, 1, 0, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8, -1, 0, 7, 0, 0, -1, -1, 0, 0, 0, 0, -8);
		bodyModel[276].setRotationPoint(-52.5f, -28.01f, 3.0f);
		bodyModel[276].rotateAngleZ = 0.57595867f;

		bodyModel[277] = new ModelRendererTurbo(this, 467, 19, textureX, textureY);
		bodyModel[277].addBox(0, 0, 0, 12, 1, 1, 0f);
		bodyModel[277].setRotationPoint(-52.5f, -28.0f, 4.0f);
		bodyModel[277].rotateAngleZ = -5.7072268f;

		flipAll();
	}

}
