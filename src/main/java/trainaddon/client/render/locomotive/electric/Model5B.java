//FMT-Marker DFM-1.0

package trainaddon.client.render.locomotive.electric;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.7 &copy; 2026 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model5B extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public Model5B(){
		bodyModel = new ModelRendererTurbo[367];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addShapeBox(0, 0, 0, 125, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[0].setRotationPoint(-65.0f, 1.5f, -10.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 274, 60, textureX, textureY);
		bodyModel[1].addShapeBox(0, 0, 0, 32, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[1].setRotationPoint(28.0f, -15.5f, -11.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 99, 102, textureX, textureY);
		bodyModel[2].addShapeBox(0, 0, 0, 3, 3, 8, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2.5f, -2, 0, 0, 0, 0, 0, -1, 0);
		bodyModel[2].setRotationPoint(60.0f, 0.5f, -11.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 235, 121, textureX, textureY);
		bodyModel[3].addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[3].setRotationPoint(61.0f, -4.7f, -7.7f);

		bodyModel[4] = new ModelRendererTurbo(this, 91, 86, textureX, textureY);
		bodyModel[4].addShapeBox(0, 0, 0, 6, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(12.0f, 2.5f, 3.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 282, 119, textureX, textureY);
		bodyModel[5].flip = true;
		bodyModel[5].addCylinder(0, 0, 0, 1, 9, 10, 1, 1, 4);
		bodyModel[5].setRotationPoint(-8.0f, 3.3f, -8.0f);
		bodyModel[5].rotateAngleZ = 1.5707964f;

		bodyModel[6] = new ModelRendererTurbo(this, 489, 116, textureX, textureY);
		bodyModel[6].flip = true;
		bodyModel[6].addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4);
		bodyModel[6].setRotationPoint(55.2f, -5.8f, -3.6f);

		bodyModel[7] = new ModelRendererTurbo(this, 84, 102, textureX, textureY); // Box 136cp
		bodyModel[7].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[7].setRotationPoint(-49.0f, -4.5f, -10.0f);
		bodyModel[7].rotateAngleY = 6.2831855f;

		bodyModel[8] = new ModelRendererTurbo(this, 275, 109, textureX, textureY); // Box 136cp
		bodyModel[8].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[8].setRotationPoint(-48.0f, -3.5f, -10.0f);
		bodyModel[8].rotateAngleY = 6.2831855f;

		bodyModel[9] = new ModelRendererTurbo(this, 378, 118, textureX, textureY); // Box 136cp
		bodyModel[9].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[9].setRotationPoint(-45.0f, -10.5f, -10.0f);
		bodyModel[9].rotateAngleY = 6.2831855f;

		bodyModel[10] = new ModelRendererTurbo(this, 363, 118, textureX, textureY); // Box 136cp
		bodyModel[10].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[10].setRotationPoint(-2.0f, -10.5f, 4.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 489, 92, textureX, textureY); // Box 136cp
		bodyModel[11].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[11].setRotationPoint(-2.0f, -4.5f, 4.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 180, 107, textureX, textureY); // Box 136cp
		bodyModel[12].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[12].setRotationPoint(-1.0f, -3.5f, 4.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 19, 107, textureX, textureY);
		bodyModel[13].addShapeBox(0, 0, 0, 3, 16, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[13].setRotationPoint(60.0f, -15.5f, -3.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 61, 99, textureX, textureY);
		bodyModel[14].addShapeBox(0, 0, 0, 3, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, 0);
		bodyModel[14].setRotationPoint(60.0f, -15.5f, 3.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 38, 99, textureX, textureY);
		bodyModel[15].addShapeBox(0, 0, 0, 3, 16, 8, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[15].setRotationPoint(60.0f, -15.5f, -11.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 406, 60, textureX, textureY);
		bodyModel[16].addShapeBox(0, 0, 0, 31, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[16].setRotationPoint(-13.0f, -15.5f, -11.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 358, 0, textureX, textureY);
		bodyModel[17].addShapeBox(0, 0, 0, 42, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(-65.0f, -15.5f, -11.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 271, 0, textureX, textureY);
		bodyModel[18].addShapeBox(0, 0, 0, 42, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[18].setRotationPoint(-65.0f, -15.5f, 10.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 341, 60, textureX, textureY);
		bodyModel[19].addShapeBox(0, 0, 0, 31, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[19].setRotationPoint(-13.0f, -15.5f, 10.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 445, 0, textureX, textureY);
		bodyModel[20].addShapeBox(0, 0, 0, 32, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[20].setRotationPoint(28.0f, -15.5f, 10.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 0, 59, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, 0, 125, 3, 1, 0, 0, -1.7f, 0, 0, -1.7f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[21].setRotationPoint(-65.0f, -18.5f, -11.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 0, 52, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 125, 2, 4, 0, 0, -1.2f, -2, 0, -1.2f, -2, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(-65.0f, -20.2f, -10.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 247, 30, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 125, 1, 6, 0, 0, -0.6f, -2, 0, -0.6f, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[23].setRotationPoint(-65.0f, -20.4f, -6.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 0, 45, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 125, 2, 4, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -1.2f, -2, 0, -1.2f, -2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0);
		bodyModel[24].setRotationPoint(-65.0f, -20.2f, 6.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 259, 55, textureX, textureY);
		bodyModel[25].addShapeBox(0, 0, 0, 125, 3, 1, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -1.7f, 0, 0, -1.7f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[25].setRotationPoint(-65.0f, -18.5f, 10.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 207, 102, textureX, textureY);
		bodyModel[26].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -0.3f, 0, -1.2f, -0.8f, 0, -1.5f, -1.7f, -0.2f, 0, -1.7f, 0, 0, 0, 0, -1.2f, 0, 0, -1.5f, 0, 0, 0, 0, 0);
		bodyModel[26].setRotationPoint(60.0f, -18.5f, 10.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 403, 84, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 3, 4, 2, 0, 0, -0.5f, 0, -1.5f, -1.6f, 0, -2.2f, -1.8f, 0, 0, -1.3f, 0, 0, 0, 0, -1.55f, 0, 0, -2.2f, 0, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(60.0f, -19.5f, 8.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 222, 121, textureX, textureY);
		bodyModel[28].addShapeBox(0, 0, 0, 3, 5, 3, 0, 0, -1.1f, -1, -1, -2.5f, -1, -1.5f, -2.6f, 0, 0, -1.5f, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -1.55f, 0, 0, 0, 0, 0);
		bodyModel[28].setRotationPoint(60.0f, -20.5f, 5.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 150, 94, textureX, textureY);
		bodyModel[29].addShapeBox(0, 0, 0, 3, 5, 2, 0, 0, -0.68f, -1.2f, -0.6f, -2.5f, -1.2f, -0.6f, -2.5f, 0, 0, -0.7f, 0, 0, 0, -1, 0, 0, -1, -0.3f, 0, 0, 0, 0, 0);
		bodyModel[29].setRotationPoint(60.0f, -20.5f, 2.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 209, 121, textureX, textureY);
		bodyModel[30].addShapeBox(0, 0, 0, 3, 5, 3, 0, 0, -0.7f, -1.1f, -0.6f, -2.5f, -1.1f, -1, -2.5f, 0.1f, 0, -1.1f, 0.1f, 0, 0, -1, -0.27f, 0, -1, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[30].setRotationPoint(60.0f, -20.5f, 2.9f);

		bodyModel[31] = new ModelRendererTurbo(this, 114, 102, textureX, textureY);
		bodyModel[31].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -1.7f, 0, -1.5f, -1.7f, -0.2f, -1.2f, -0.8f, 0, 0, -0.3f, 0, 0, 0, 0, -1.5f, 0, 0, -1.18f, 0, 0, 0, 0, 0);
		bodyModel[31].setRotationPoint(60.0f, -18.5f, -11.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 302, 83, textureX, textureY);
		bodyModel[32].addShapeBox(0, 0, 0, 3, 4, 2, 0, 0, -1.3f, 0, -2.2f, -1.8f, 0, -1.5f, -1.6f, 0, 0, -0.5f, 0, 0, 0, 0, -2.18f, 0, 0, -1.55f, 0, 0, 0, 0, 0);
		bodyModel[32].setRotationPoint(60.0f, -19.5f, -10.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 81, 121, textureX, textureY);
		bodyModel[33].addShapeBox(0, 0, 0, 3, 5, 3, 0, 0, -1.5f, 0, -1.5f, -2.6f, 0, -1, -2.5f, -1, 0, -1.1f, -1, 0, 0, 0, -1.55f, 0, 0, -0.94f, 0, -1, 0, 0, -0.9f);
		bodyModel[33].setRotationPoint(60.0f, -20.5f, -8.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 445, 120, textureX, textureY);
		bodyModel[34].addShapeBox(0, 0, 0, 3, 5, 3, 0, 0, -1.1f, 0, -1, -2.5f, 0, -0.6f, -2.5f, -1, 0, -0.7f, -1, 0, 0, 0, -0.94f, 0, 0, -0.26f, 0, -0.9f, 0, 0, -0.9f);
		bodyModel[34].setRotationPoint(60.0f, -20.5f, -6.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 238, 83, textureX, textureY);
		bodyModel[35].addShapeBox(0, 0, 0, 3, 5, 2, 0, 0, -0.7f, 0, -0.6f, -2.5f, 0, -0.6f, -2.5f, -1.2f, 0, -0.68f, -1.2f, 0, 0, 0, -0.25f, 0, -0.1f, 0, 0, -1, 0, 0, -1);
		bodyModel[35].setRotationPoint(60.0f, -20.5f, -4.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 432, 120, textureX, textureY);
		bodyModel[36].addShapeBox(0, 0, 0, 3, 5, 3, 0, 0, -0.6f, 0, -0.6f, -2.5f, 0, -0.6f, -2.5f, 0.2f, 0, -0.68f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[36].setRotationPoint(60.0f, -20.5f, 0.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 419, 120, textureX, textureY);
		bodyModel[37].addShapeBox(0, 2, 0, 3, 5, 3, 0, 0, -0.68f, 0.25f, -0.6f, -2.5f, 0.2f, -0.6f, -2.5f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[37].setRotationPoint(60.0f, -22.5f, -3.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 102, 86, textureX, textureY);
		bodyModel[38].addShapeBox(0, 0, 0, 1, 4, 11, 0, 1, -2, -0.05f, -1.5f, -2, -0.05f, -3, 0, 0, 2.5f, 0, 0, 1, 0, -0.05f, -1.5f, 0, -0.05f, -3.5f, -1.5f, 0, 3, -1.5f, 0);
		bodyModel[38].setRotationPoint(63.2f, 1.5f, 0.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 446, 82, textureX, textureY);
		bodyModel[39].addShapeBox(0, 0, 0, 2, 4, 11, 0, -1.6f, 0, -0.05f, 0.1f, 0, -0.05f, -1.9f, 1.5f, 0, 0.4f, 1.5f, 0, -1.5f, -1.5f, -0.05f, 0, -1.5f, -0.05f, -1.8f, -2.2f, -1.8f, 0.3f, -2.2f, -1.8f);
		bodyModel[39].setRotationPoint(60.6f, 5.5f, 0.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 177, 95, textureX, textureY);
		bodyModel[40].addShapeBox(0, 0, 0, 3, 3, 8, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2.5f, -2, 0, 0, -2, 0);
		bodyModel[40].setRotationPoint(60.0f, 0.5f, 3.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 348, 118, textureX, textureY);
		bodyModel[41].addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[41].setRotationPoint(60.0f, 0.5f, -3.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 489, 89, textureX, textureY);
		bodyModel[42].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[42].setRotationPoint(18.0f, 1.7f, 10.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 419, 88, textureX, textureY);
		bodyModel[43].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[43].setRotationPoint(18.0f, 1.7f, -11.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 376, 88, textureX, textureY);
		bodyModel[44].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[44].setRotationPoint(18.0f, 2.7f, 10.3f);

		bodyModel[45] = new ModelRendererTurbo(this, 333, 88, textureX, textureY);
		bodyModel[45].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[45].setRotationPoint(18.0f, 2.7f, -11.3f);

		bodyModel[46] = new ModelRendererTurbo(this, 489, 86, textureX, textureY);
		bodyModel[46].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[46].setRotationPoint(-23.0f, 1.7f, -11.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 43, 79, textureX, textureY);
		bodyModel[47].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[47].setRotationPoint(-23.0f, 2.7f, -11.3f);

		bodyModel[48] = new ModelRendererTurbo(this, 102, 77, textureX, textureY);
		bodyModel[48].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[48].setRotationPoint(-23.0f, 2.7f, 10.3f);

		bodyModel[49] = new ModelRendererTurbo(this, 145, 75, textureX, textureY);
		bodyModel[49].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[49].setRotationPoint(-23.0f, 1.7f, 10.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 484, 116, textureX, textureY);
		bodyModel[50].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[50].setRotationPoint(-21.0f, 1.7f, 9.3f);

		bodyModel[51] = new ModelRendererTurbo(this, 474, 116, textureX, textureY);
		bodyModel[51].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[51].setRotationPoint(-15.5f, 1.7f, 9.3f);

		bodyModel[52] = new ModelRendererTurbo(this, 469, 116, textureX, textureY);
		bodyModel[52].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[52].setRotationPoint(20.0f, 1.7f, 9.3f);

		bodyModel[53] = new ModelRendererTurbo(this, 174, 116, textureX, textureY);
		bodyModel[53].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[53].setRotationPoint(25.5f, 1.7f, 9.3f);

		bodyModel[54] = new ModelRendererTurbo(this, 169, 116, textureX, textureY);
		bodyModel[54].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[54].setRotationPoint(25.5f, 1.7f, -10.4f);

		bodyModel[55] = new ModelRendererTurbo(this, 157, 116, textureX, textureY);
		bodyModel[55].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[55].setRotationPoint(20.0f, 1.7f, -10.4f);

		bodyModel[56] = new ModelRendererTurbo(this, 124, 116, textureX, textureY);
		bodyModel[56].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[56].setRotationPoint(-15.5f, 1.7f, -10.4f);

		bodyModel[57] = new ModelRendererTurbo(this, 119, 116, textureX, textureY);
		bodyModel[57].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[57].setRotationPoint(-21.0f, 1.7f, -10.4f);

		bodyModel[58] = new ModelRendererTurbo(this, 258, 96, textureX, textureY);
		bodyModel[58].addShapeBox(0, 0, 0, 10, 17, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[58].setRotationPoint(-23.0f, -15.5f, -11.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 127, 94, textureX, textureY);
		bodyModel[59].addShapeBox(0, 0, 0, 10, 17, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[59].setRotationPoint(18.0f, -15.5f, -11.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 23, 88, textureX, textureY);
		bodyModel[60].addShapeBox(0, 0, 0, 10, 17, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[60].setRotationPoint(18.0f, -15.5f, 9.7f);

		bodyModel[61] = new ModelRendererTurbo(this, 0, 88, textureX, textureY);
		bodyModel[61].addShapeBox(0, 0, 0, 10, 17, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[61].setRotationPoint(-23.0f, -15.5f, 9.7f);

		bodyModel[62] = new ModelRendererTurbo(this, 406, 118, textureX, textureY);
		bodyModel[62].addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[62].setRotationPoint(61.0f, -4.7f, 4.7f);

		bodyModel[63] = new ModelRendererTurbo(this, 427, 93, textureX, textureY);
		bodyModel[63].addShapeBox(0, 0, 0, 4, 3, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[63].setRotationPoint(59.5f, -21.5f, -1.5f);

		bodyModel[64] = new ModelRendererTurbo(this, 238, 96, textureX, textureY);
		bodyModel[64].addShapeBox(0, 0, 0, 7, 3, 2, 0, 0, -0.8f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1.7f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[64].setRotationPoint(53.0f, -21.5f, -0.5f);

		bodyModel[65] = new ModelRendererTurbo(this, 491, 70, textureX, textureY);
		bodyModel[65].addShapeBox(0, 0, 0, 7, 3, 2, 0, 0, -1.7f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[65].setRotationPoint(53.0f, -21.5f, -1.5f);

		bodyModel[66] = new ModelRendererTurbo(this, 503, 66, textureX, textureY);
		bodyModel[66].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.9f, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[66].setRotationPoint(51.5f, -20.7f, -0.5f);

		bodyModel[67] = new ModelRendererTurbo(this, 244, 64, textureX, textureY);
		bodyModel[67].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -1, 0, -0.5f, -0.9f, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[67].setRotationPoint(51.5f, -20.7f, -1.5f);

		bodyModel[68] = new ModelRendererTurbo(this, 77, 86, textureX, textureY);
		bodyModel[68].addShapeBox(0, 0, 0, 1, 4, 11, 0, 2.5f, 0, 0, -3, 0, 0, -1.5f, -2, -0.05f, 1, -2, -0.05f, 3, -1.5f, 0, -3.5f, -1.5f, 0, -1.5f, 0, -0.05f, 1, 0, -0.05f);
		bodyModel[68].setRotationPoint(63.2f, 1.5f, -11.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 172, 80, textureX, textureY);
		bodyModel[69].addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[69].setRotationPoint(44.0f, 2.7f, -11.3f);

		bodyModel[70] = new ModelRendererTurbo(this, 66, 79, textureX, textureY);
		bodyModel[70].addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[70].setRotationPoint(44.0f, 3.7f, -11.3f);

		bodyModel[71] = new ModelRendererTurbo(this, 247, 38, textureX, textureY);
		bodyModel[71].addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[71].setRotationPoint(44.0f, 3.7f, 10.3f);

		bodyModel[72] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
		bodyModel[72].addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0);
		bodyModel[72].setRotationPoint(44.0f, 2.7f, 10.3f);

		bodyModel[73] = new ModelRendererTurbo(this, 439, 91, textureX, textureY);
		bodyModel[73].addShapeBox(0, 0, 0, 0, 3, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[73].setRotationPoint(48.5f, 1.7f, 9.3f);

		bodyModel[74] = new ModelRendererTurbo(this, 261, 115, textureX, textureY);
		bodyModel[74].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, -1, -0.5f, -0.2f, -1, -0.5f, -0.2f, 0.5f, 0, -0.2f, 0.5f);
		bodyModel[74].setRotationPoint(45.0f, 1.7f, 9.3f);

		bodyModel[75] = new ModelRendererTurbo(this, 141, 114, textureX, textureY);
		bodyModel[75].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[75].setRotationPoint(48.5f, 1.7f, -10.4f);

		bodyModel[76] = new ModelRendererTurbo(this, 136, 114, textureX, textureY);
		bodyModel[76].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1, 0, -0.2f, -1);
		bodyModel[76].setRotationPoint(45.0f, 1.7f, -10.4f);

		bodyModel[77] = new ModelRendererTurbo(this, 403, 80, textureX, textureY);
		bodyModel[77].addShapeBox(0, 0, 0, 2, 4, 11, 0, 0.4f, 1.5f, 0, -1.9f, 1.5f, 0, 0.1f, 0, -0.05f, -1.6f, 0, -0.05f, 0.3f, -2.2f, -1.8f, -1.8f, -2.2f, -1.8f, 0, -1.5f, -0.05f, -1.5f, -1.5f, -0.05f);
		bodyModel[77].setRotationPoint(60.6f, 5.5f, -11.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 360, 95, textureX, textureY);
		bodyModel[78].addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[78].setRotationPoint(61.0f, 1.0f, -1.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 172, 103, textureX, textureY);
		bodyModel[79].addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[79].setRotationPoint(65.0f, -0.5f, -2.5f);

		bodyModel[80] = new ModelRendererTurbo(this, 498, 38, textureX, textureY);
		bodyModel[80].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[80].setRotationPoint(65.3f, 1.25f, -1.5f);

		bodyModel[81] = new ModelRendererTurbo(this, 114, 106, textureX, textureY);
		bodyModel[81].addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.4f, 0.04f, 0, -0.05f, 0.05f, 0, -1.71f, 0.7f, 0, 1.16f, 0.65f, 0, -0.7f, 0, 0, 0.2f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[81].setRotationPoint(61.6f, 8.0f, 0.5f);

		bodyModel[82] = new ModelRendererTurbo(this, 193, 64, textureX, textureY);
		bodyModel[82].addShapeBox(0, 0, 0, 1, 1, 8, 0, 1.16f, 0.65f, 0, -1.71f, 0.7f, 0, -0.05f, 0.05f, 0, -0.4f, 0.04f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0.2f, 0, 0, -0.7f, 0, 0);
		bodyModel[82].setRotationPoint(61.6f, 8.0f, -8.5f);

		bodyModel[83] = new ModelRendererTurbo(this, 66, 86, textureX, textureY);
		bodyModel[83].addShapeBox(0, 0, 0, 6, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[83].setRotationPoint(6.0f, 2.5f, 3.0f);

		bodyModel[84] = new ModelRendererTurbo(this, 505, 115, textureX, textureY);
		bodyModel[84].flip = true;
		bodyModel[84].addCylinder(0, 0, 0, 1, 9, 10, 1, 1, 4);
		bodyModel[84].setRotationPoint(-33.0f, 3.3f, -7.0f);
		bodyModel[84].rotateAngleZ = 1.5707964f;

		bodyModel[85] = new ModelRendererTurbo(this, 56, 124, textureX, textureY);
		bodyModel[85].flip = true;
		bodyModel[85].addCylinder(0, 0, 0, 2, 9, 10, 1, 1, 4);
		bodyModel[85].setRotationPoint(-20.0f, 3.5f, -4.0f);
		bodyModel[85].rotateAngleZ = 1.5707964f;

		bodyModel[86] = new ModelRendererTurbo(this, 215, 83, textureX, textureY);
		bodyModel[86].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[86].setRotationPoint(-65.0f, -15.5f, -10.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 466, 82, textureX, textureY);
		bodyModel[87].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[87].setRotationPoint(-65.0f, -18.5f, -10.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 255, 40, textureX, textureY);
		bodyModel[88].addShapeBox(0, 0, 0, 115, 2, 12, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[88].setRotationPoint(-65.0f, -20.2f, -6.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 47, 124, textureX, textureY);
		bodyModel[89].addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[89].setRotationPoint(-68.0f, -16.5f, 4.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 38, 124, textureX, textureY);
		bodyModel[90].addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[90].setRotationPoint(-68.0f, -16.5f, -5.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 230, 68, textureX, textureY);
		bodyModel[91].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[91].setRotationPoint(-68.0f, -17.5f, -4.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 161, 105, textureX, textureY);
		bodyModel[92].addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[92].setRotationPoint(-65.0f, -0.5f, -4.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 317, 95, textureX, textureY);
		bodyModel[93].addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[93].setRotationPoint(-69.0f, 0.5f, -1.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 446, 82, textureX, textureY);
		bodyModel[94].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[94].setRotationPoint(39.0f, -20.5f, -1.5f);

		bodyModel[95] = new ModelRendererTurbo(this, 403, 80, textureX, textureY);
		bodyModel[95].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[95].setRotationPoint(20.0f, -20.5f, -1.5f);

		bodyModel[96] = new ModelRendererTurbo(this, 113, 80, textureX, textureY);
		bodyModel[96].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[96].setRotationPoint(6.5f, -20.5f, -1.5f);

		bodyModel[97] = new ModelRendererTurbo(this, 43, 72, textureX, textureY);
		bodyModel[97].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[97].setRotationPoint(-10.0f, -20.5f, -1.5f);

		bodyModel[98] = new ModelRendererTurbo(this, 255, 45, textureX, textureY);
		bodyModel[98].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[98].setRotationPoint(-33.0f, -20.5f, -1.5f);

		bodyModel[99] = new ModelRendererTurbo(this, 32, 110, textureX, textureY); // lampcp
		bodyModel[99].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[99].setRotationPoint(63.5f, -16.01f, 2.0f);
		bodyModel[99].rotateAngleY = -3.1415927f;

		bodyModel[100] = new ModelRendererTurbo(this, 18, 110, textureX, textureY); // lampcp
		bodyModel[100].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0.2f, 0.2f, 0, -0.2f, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.2f, 0.2f);
		bodyModel[100].setRotationPoint(64.5f, -16.01f, 2.0f);
		bodyModel[100].rotateAngleY = -3.1415927f;

		bodyModel[101] = new ModelRendererTurbo(this, 423, 80, textureX, textureY);
		bodyModel[101].addShapeBox(0, 0, 0, 1, 19, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[101].setRotationPoint(49.0f, -17.5f, -10.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 0, 64, textureX, textureY);
		bodyModel[102].addShapeBox(0, 0, 0, 11, 3, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[102].setRotationPoint(49.0f, -18.5f, -10.0f);

		bodyModel[103] = new ModelRendererTurbo(this, 43, 64, textureX, textureY);
		bodyModel[103].addShapeBox(0, 0, 0, 7, 2, 12, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[103].setRotationPoint(49.0f, -20.2f, -6.0f);

		bodyModel[104] = new ModelRendererTurbo(this, 162, 86, textureX, textureY);
		bodyModel[104].addShapeBox(0, 0, 0, 4, 9, 7, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0);
		bodyModel[104].setRotationPoint(56.0f, -7.5f, 3.0f);

		bodyModel[105] = new ModelRendererTurbo(this, 277, 83, textureX, textureY);
		bodyModel[105].addShapeBox(0, 0, 0, 4, 3, 6, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, 0, 0, 0, 0, 0, 0, -0.1f, -0.1f, 0, -0.1f);
		bodyModel[105].setRotationPoint(56.0f, -7.5f, -3.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 267, 118, textureX, textureY);
		bodyModel[106].addShapeBox(0, 0, 0, 6, 10, 1, 0, -0.5f, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[106].setRotationPoint(55.0f, -8.5f, 2.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 158, 78, textureX, textureY);
		bodyModel[107].addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.5f, -0.3f, 0, -0.3f, 0, 0, -0.3f, 0, -0.1f, -0.5f, -0.3f, -0.1f, -1, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.1f, -1, 0, -0.1f);
		bodyModel[107].setRotationPoint(54.2f, -5.9f, -1.75f);

		bodyModel[108] = new ModelRendererTurbo(this, 233, 60, textureX, textureY);
		bodyModel[108].addShapeBox(0, 0, 0, 20, 2, 20, 0, 0, -1.5f, 0, -16, 0, 0, -16, 0, -13, 0, -1.5f, -13, 0, 0, 0, -16, 0, 0, -16, 0, -13, 0, 0, -13);
		bodyModel[108].setRotationPoint(56.0f, -7.5f, -10.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 386, 92, textureX, textureY);
		bodyModel[109].addShapeBox(0, 0, 0, 3, 4, 3, 0, -1, -0.4f, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.1f, -0.9f, -0.4f, -0.1f, -1.5f, 0, -0.3f, 0.2f, 0, -0.3f, 0.2f, 0, -0.1f, -1.5f, 0, -0.1f);
		bodyModel[109].setRotationPoint(53.2f, -5.8f, -5.9f);

		bodyModel[110] = new ModelRendererTurbo(this, 101, 114, textureX, textureY);
		bodyModel[110].flip = true;
		bodyModel[110].addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4);
		bodyModel[110].setRotationPoint(55.2f, -5.8f, -4.9f);

		bodyModel[111] = new ModelRendererTurbo(this, 66, 94, textureX, textureY);
		bodyModel[111].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[111].setRotationPoint(53.4f, -6.2f, -4.5f);

		bodyModel[112] = new ModelRendererTurbo(this, 266, 91, textureX, textureY);
		bodyModel[112].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[112].setRotationPoint(54.1f, -6.0f, -5.1f);
		bodyModel[112].rotateAngleY = 0.7853982f;
		bodyModel[112].rotateAngleZ = 0.36651915f;

		bodyModel[113] = new ModelRendererTurbo(this, 153, 113, textureX, textureY);
		bodyModel[113].flip = true;
		bodyModel[113].addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4);
		bodyModel[113].setRotationPoint(56.8f, -6.4f, -4.4f);
		bodyModel[113].rotateAngleZ = 0.31415927f;

		bodyModel[114] = new ModelRendererTurbo(this, 504, 111, textureX, textureY);
		bodyModel[114].flip = true;
		bodyModel[114].addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4);
		bodyModel[114].setRotationPoint(56.8f, -6.4f, -5.5f);
		bodyModel[114].rotateAngleZ = 0.31415927f;

		bodyModel[115] = new ModelRendererTurbo(this, 84, 110, textureX, textureY);
		bodyModel[115].flip = true;
		bodyModel[115].addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4);
		bodyModel[115].setRotationPoint(56.8f, -6.4f, -6.6f);
		bodyModel[115].rotateAngleZ = 0.31415927f;

		bodyModel[116] = new ModelRendererTurbo(this, 13, 110, textureX, textureY);
		bodyModel[116].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[116].setRotationPoint(58.4f, -7.5f, -4.1f);
		bodyModel[116].rotateAngleZ = 0.34732053f;

		bodyModel[117] = new ModelRendererTurbo(this, 0, 110, textureX, textureY);
		bodyModel[117].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[117].setRotationPoint(58.4f, -7.5f, -4.4f);
		bodyModel[117].rotateAngleZ = 0.34732053f;

		bodyModel[118] = new ModelRendererTurbo(this, 498, 109, textureX, textureY);
		bodyModel[118].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[118].setRotationPoint(57.8f, -7.3f, -4.1f);
		bodyModel[118].rotateAngleZ = 0.34732053f;

		bodyModel[119] = new ModelRendererTurbo(this, 484, 109, textureX, textureY);
		bodyModel[119].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[119].setRotationPoint(57.8f, -7.3f, -4.4f);
		bodyModel[119].rotateAngleZ = 0.34732053f;

		bodyModel[120] = new ModelRendererTurbo(this, 479, 109, textureX, textureY);
		bodyModel[120].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[120].setRotationPoint(57.2f, -7.1f, -4.4f);
		bodyModel[120].rotateAngleZ = 0.34732053f;

		bodyModel[121] = new ModelRendererTurbo(this, 507, 108, textureX, textureY);
		bodyModel[121].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[121].setRotationPoint(57.2f, -7.1f, -4.1f);
		bodyModel[121].rotateAngleZ = 0.34732053f;

		bodyModel[122] = new ModelRendererTurbo(this, 180, 107, textureX, textureY);
		bodyModel[122].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[122].setRotationPoint(56.6f, -6.85f, -4.1f);
		bodyModel[122].rotateAngleZ = 0.34732053f;

		bodyModel[123] = new ModelRendererTurbo(this, 114, 107, textureX, textureY);
		bodyModel[123].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[123].setRotationPoint(56.6f, -6.85f, -4.4f);
		bodyModel[123].rotateAngleZ = 0.34732053f;

		bodyModel[124] = new ModelRendererTurbo(this, 32, 107, textureX, textureY);
		bodyModel[124].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[124].setRotationPoint(56.0f, -6.6f, -4.1f);
		bodyModel[124].rotateAngleZ = 0.34732053f;

		bodyModel[125] = new ModelRendererTurbo(this, 18, 107, textureX, textureY);
		bodyModel[125].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[125].setRotationPoint(56.0f, -6.6f, -4.5f);
		bodyModel[125].rotateAngleZ = 0.34732053f;

		bodyModel[126] = new ModelRendererTurbo(this, 13, 107, textureX, textureY);
		bodyModel[126].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[126].setRotationPoint(54.8f, -6.2f, -0.85f);
		bodyModel[126].rotateAngleZ = 0.24783675f;

		bodyModel[127] = new ModelRendererTurbo(this, 0, 107, textureX, textureY);
		bodyModel[127].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, -0.45f, -0.5f, -0.5f, -0.45f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.5f, -0.45f, -0.4f, -0.5f, -0.45f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[127].setRotationPoint(55.0f, -6.25f, -1.35f);
		bodyModel[127].rotateAngleZ = 0.24783675f;

		bodyModel[128] = new ModelRendererTurbo(this, 503, 106, textureX, textureY);
		bodyModel[128].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[128].setRotationPoint(54.3f, -6.1f, -1.3f);
		bodyModel[128].rotateAngleZ = 0.24783675f;

		bodyModel[129] = new ModelRendererTurbo(this, 498, 106, textureX, textureY);
		bodyModel[129].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[129].setRotationPoint(54.3f, -6.1f, -1.7f);
		bodyModel[129].rotateAngleZ = 0.24783675f;

		bodyModel[130] = new ModelRendererTurbo(this, 484, 106, textureX, textureY);
		bodyModel[130].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.45f, -0.5f, -0.8f, -0.45f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.45f, -0.4f, -0.8f, -0.45f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[130].setRotationPoint(54.9f, -6.25f, -0.15f);
		bodyModel[130].rotateAngleZ = 0.24783675f;

		bodyModel[131] = new ModelRendererTurbo(this, 479, 106, textureX, textureY);
		bodyModel[131].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.45f, -0.5f, -0.8f, -0.45f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.45f, -0.4f, -0.8f, -0.45f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[131].setRotationPoint(54.7f, -6.25f, -0.15f);
		bodyModel[131].rotateAngleZ = 0.24783675f;

		bodyModel[132] = new ModelRendererTurbo(this, 281, 106, textureX, textureY);
		bodyModel[132].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[132].setRotationPoint(54.3f, -6.1f, -2.1f);
		bodyModel[132].rotateAngleZ = 0.24783675f;

		bodyModel[133] = new ModelRendererTurbo(this, 163, 106, textureX, textureY);
		bodyModel[133].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.1f, -0.5f, 0, -0.1f, -0.7f, 0, -0.3f, 0.1f, 0, -0.3f, 0.1f, 0, -0.1f, -0.7f, 0, -0.1f);
		bodyModel[133].setRotationPoint(54.0f, -5.2f, -1.75f);

		bodyModel[134] = new ModelRendererTurbo(this, 337, 96, textureX, textureY);
		bodyModel[134].addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.3f, 0, -0.2f, 0, 0, -0.2f, 0, -0.1f, -0.5f, -0.3f, -0.1f, -1, 0, 0, 0, 0, 0, 0, 0, -0.1f, -1, 0, -0.1f);
		bodyModel[134].setRotationPoint(55.2f, -6.0f, -8.3f);
		bodyModel[134].rotateAngleZ = -0.12217305f;

		bodyModel[135] = new ModelRendererTurbo(this, 301, 96, textureX, textureY);
		bodyModel[135].addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.3f, 0, -0.2f, 0, 0, -0.2f, 0, -0.1f, -0.5f, -0.3f, -0.1f, -1, 0, 0, 0, 0, 0, 0, 0, -0.1f, -1, 0, -0.1f);
		bodyModel[135].setRotationPoint(53.2f, -6.3f, -10.0f);

		bodyModel[136] = new ModelRendererTurbo(this, 466, 106, textureX, textureY);
		bodyModel[136].flip = true;
		bodyModel[136].addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4);
		bodyModel[136].setRotationPoint(54.3f, -6.3f, -9.6f);
		bodyModel[136].rotateAngleZ = 0.2268928f;

		bodyModel[137] = new ModelRendererTurbo(this, 259, 91, textureX, textureY);
		bodyModel[137].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[137].setRotationPoint(54.4f, -7.4f, -7.7f);
		bodyModel[137].rotateAngleY = 2.0943952f;
		bodyModel[137].rotateAngleZ = -0.33161256f;

		bodyModel[138] = new ModelRendererTurbo(this, 150, 105, textureX, textureY);
		bodyModel[138].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.25f, -0.5f, -0.4f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, -0.4f, -0.25f, -0.4f, -0.4f, -0.25f, -0.4f, 0, 0, -0.4f, 0);
		bodyModel[138].setRotationPoint(57.7f, -7.3f, -5.2f);
		bodyModel[138].rotateAngleZ = 0.34732053f;

		bodyModel[139] = new ModelRendererTurbo(this, 101, 105, textureX, textureY);
		bodyModel[139].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, -0.5f, -0.7f, -0.25f, -0.5f, -0.7f, -0.25f, -0.5f, 0, 0.3f, -0.5f, 0, 0.3f, -0.4f, -0.7f, -0.25f, -0.4f, -0.7f, -0.25f, -0.4f, 0, 0.3f, -0.4f, 0);
		bodyModel[139].setRotationPoint(57.9f, -7.3f, -5.95f);
		bodyModel[139].rotateAngleZ = 0.34732053f;

		bodyModel[140] = new ModelRendererTurbo(this, 281, 103, textureX, textureY);
		bodyModel[140].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[140].setRotationPoint(55.0f, -5.9f, -7.6f);
		bodyModel[140].rotateAngleZ = 0.57595867f;

		bodyModel[141] = new ModelRendererTurbo(this, 163, 103, textureX, textureY);
		bodyModel[141].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[141].setRotationPoint(55.0f, -5.9f, -8.9f);
		bodyModel[141].rotateAngleZ = 0.57595867f;

		bodyModel[142] = new ModelRendererTurbo(this, 150, 102, textureX, textureY);
		bodyModel[142].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[142].setRotationPoint(57.5f, -6.8f, -10.1f);
		bodyModel[142].rotateAngleZ = 0.34732053f;

		bodyModel[143] = new ModelRendererTurbo(this, 121, 102, textureX, textureY);
		bodyModel[143].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[143].setRotationPoint(57.5f, -6.8f, -9.8f);
		bodyModel[143].rotateAngleZ = 0.34732053f;

		bodyModel[144] = new ModelRendererTurbo(this, 101, 102, textureX, textureY);
		bodyModel[144].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[144].setRotationPoint(57.5f, -6.8f, -9.5f);
		bodyModel[144].rotateAngleZ = 0.34732053f;

		bodyModel[145] = new ModelRendererTurbo(this, 418, 96, textureX, textureY);
		bodyModel[145].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[145].setRotationPoint(57.5f, -6.8f, -9.2f);
		bodyModel[145].rotateAngleZ = 0.34732053f;

		bodyModel[146] = new ModelRendererTurbo(this, 413, 96, textureX, textureY);
		bodyModel[146].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[146].setRotationPoint(57.5f, -6.8f, -8.9f);
		bodyModel[146].rotateAngleZ = 0.34732053f;

		bodyModel[147] = new ModelRendererTurbo(this, 408, 96, textureX, textureY);
		bodyModel[147].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[147].setRotationPoint(57.5f, -6.8f, -8.6f);
		bodyModel[147].rotateAngleZ = 0.34732053f;

		bodyModel[148] = new ModelRendererTurbo(this, 403, 96, textureX, textureY);
		bodyModel[148].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[148].setRotationPoint(57.5f, -6.8f, -8.3f);
		bodyModel[148].rotateAngleZ = 0.34732053f;

		bodyModel[149] = new ModelRendererTurbo(this, 308, 96, textureX, textureY);
		bodyModel[149].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[149].setRotationPoint(57.5f, -6.8f, -8.0f);
		bodyModel[149].rotateAngleZ = 0.34732053f;

		bodyModel[150] = new ModelRendererTurbo(this, 506, 95, textureX, textureY);
		bodyModel[150].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[150].setRotationPoint(56.9f, -6.9f, -10.35f);
		bodyModel[150].rotateAngleZ = 0.41887903f;

		bodyModel[151] = new ModelRendererTurbo(this, 489, 95, textureX, textureY);
		bodyModel[151].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[151].setRotationPoint(56.0f, -6.9f, -8.45f);
		bodyModel[151].rotateAngleZ = 0.34732053f;

		bodyModel[152] = new ModelRendererTurbo(this, 480, 95, textureX, textureY);
		bodyModel[152].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[152].setRotationPoint(56.9f, -6.5f, -9.0f);
		bodyModel[152].rotateAngleZ = 0.34732053f;

		bodyModel[153] = new ModelRendererTurbo(this, 380, 95, textureX, textureY);
		bodyModel[153].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.25f, -0.5f, -0.4f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, -0.4f, -0.25f, -0.4f, -0.4f, -0.25f, -0.4f, 0, 0, -0.4f, 0);
		bodyModel[153].setRotationPoint(57.7f, -7.3f, -6.8f);
		bodyModel[153].rotateAngleZ = 0.34732053f;

		bodyModel[154] = new ModelRendererTurbo(this, 46, 95, textureX, textureY);
		bodyModel[154].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, -0.5f, -0.7f, -0.25f, -0.5f, -0.7f, -0.25f, -0.5f, 0, 0.3f, -0.5f, 0, 0.3f, -0.4f, -0.7f, -0.25f, -0.4f, -0.7f, -0.25f, -0.4f, 0, 0.3f, -0.4f, 0);
		bodyModel[154].setRotationPoint(57.9f, -7.3f, -6.35f);
		bodyModel[154].rotateAngleZ = 0.34732053f;

		bodyModel[155] = new ModelRendererTurbo(this, 121, 94, textureX, textureY);
		bodyModel[155].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[155].setRotationPoint(58.1f, -7.0f, -10.4f);
		bodyModel[155].rotateAngleZ = 0.34732053f;

		bodyModel[156] = new ModelRendererTurbo(this, 116, 94, textureX, textureY);
		bodyModel[156].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[156].setRotationPoint(58.1f, -7.0f, -10.1f);
		bodyModel[156].rotateAngleZ = 0.34732053f;

		bodyModel[157] = new ModelRendererTurbo(this, 83, 94, textureX, textureY);
		bodyModel[157].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[157].setRotationPoint(58.1f, -7.0f, -9.8f);
		bodyModel[157].rotateAngleZ = 0.34732053f;

		bodyModel[158] = new ModelRendererTurbo(this, 78, 94, textureX, textureY);
		bodyModel[158].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[158].setRotationPoint(58.1f, -7.0f, -9.5f);
		bodyModel[158].rotateAngleZ = 0.34732053f;

		bodyModel[159] = new ModelRendererTurbo(this, 73, 94, textureX, textureY);
		bodyModel[159].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[159].setRotationPoint(58.1f, -7.0f, -9.2f);
		bodyModel[159].rotateAngleZ = 0.34732053f;

		bodyModel[160] = new ModelRendererTurbo(this, 506, 92, textureX, textureY);
		bodyModel[160].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[160].setRotationPoint(58.1f, -7.0f, -8.9f);
		bodyModel[160].rotateAngleZ = 0.34732053f;

		bodyModel[161] = new ModelRendererTurbo(this, 489, 92, textureX, textureY);
		bodyModel[161].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[161].setRotationPoint(58.1f, -7.0f, -8.6f);
		bodyModel[161].rotateAngleZ = 0.34732053f;

		bodyModel[162] = new ModelRendererTurbo(this, 351, 91, textureX, textureY);
		bodyModel[162].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[162].setRotationPoint(58.1f, -7.0f, -8.3f);
		bodyModel[162].rotateAngleZ = 0.34732053f;

		bodyModel[163] = new ModelRendererTurbo(this, 452, 90, textureX, textureY);
		bodyModel[163].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[163].setRotationPoint(58.1f, -7.0f, -8.0f);
		bodyModel[163].rotateAngleZ = 0.34732053f;

		bodyModel[164] = new ModelRendererTurbo(this, 309, 90, textureX, textureY);
		bodyModel[164].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.95f, -0.95f, 0, -0.95f, -0.95f, 0, 0, 0, 0, 0, 0, -0.7f, -0.95f, -0.95f, -0.7f, -0.95f, -0.95f, -0.7f, 0, 0, -0.7f, 0);
		bodyModel[164].setRotationPoint(58.475f, -6.05f, -9.15f);
		bodyModel[164].rotateAngleX = 1.5707964f;
		bodyModel[164].rotateAngleZ = 0.34732053f;

		bodyModel[165] = new ModelRendererTurbo(this, 294, 86, textureX, textureY);
		bodyModel[165].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[165].setRotationPoint(56.9f, -6.5f, -9.375f);
		bodyModel[165].rotateAngleZ = 0.34732053f;

		bodyModel[166] = new ModelRendererTurbo(this, 108, 86, textureX, textureY);
		bodyModel[166].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[166].setRotationPoint(56.9f, -6.5f, -9.75f);
		bodyModel[166].rotateAngleZ = 0.34732053f;

		bodyModel[167] = new ModelRendererTurbo(this, 83, 86, textureX, textureY);
		bodyModel[167].flip = true;
		bodyModel[167].addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 3);
		bodyModel[167].setRotationPoint(59.2f, -12.2f, -9.35f);
		bodyModel[167].rotateAngleY = 0.57595867f;

		bodyModel[168] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		bodyModel[168].addShapeBox(0, 0, 0, 113, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[168].setRotationPoint(-64.0f, -0.5f, -10.0f);

		bodyModel[169] = new ModelRendererTurbo(this, 333, 118, textureX, textureY); // Box 136cp
		bodyModel[169].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[169].setRotationPoint(-63.0f, -10.5f, 4.0f);

		bodyModel[170] = new ModelRendererTurbo(this, 139, 86, textureX, textureY); // Box 136cp
		bodyModel[170].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[170].setRotationPoint(-63.0f, -4.5f, 4.0f);

		bodyModel[171] = new ModelRendererTurbo(this, 0, 107, textureX, textureY); // Box 136cp
		bodyModel[171].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[171].setRotationPoint(-62.0f, -3.5f, 4.0f);

		bodyModel[172] = new ModelRendererTurbo(this, 318, 118, textureX, textureY); // Box 136cp
		bodyModel[172].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[172].setRotationPoint(-42.0f, -10.5f, -10.0f);

		bodyModel[173] = new ModelRendererTurbo(this, 116, 86, textureX, textureY); // Box 136cp
		bodyModel[173].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[173].setRotationPoint(-42.0f, -4.5f, -10.0f);

		bodyModel[174] = new ModelRendererTurbo(this, 485, 106, textureX, textureY); // Box 136cp
		bodyModel[174].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[174].setRotationPoint(-41.0f, -3.5f, -10.0f);

		bodyModel[175] = new ModelRendererTurbo(this, 303, 118, textureX, textureY); // Box 136cp
		bodyModel[175].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[175].setRotationPoint(-27.0f, -10.5f, -10.0f);
		bodyModel[175].rotateAngleY = 6.2831855f;

		bodyModel[176] = new ModelRendererTurbo(this, 462, 82, textureX, textureY); // Box 136cp
		bodyModel[176].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[176].setRotationPoint(-31.0f, -4.5f, -10.0f);
		bodyModel[176].rotateAngleY = 6.2831855f;

		bodyModel[177] = new ModelRendererTurbo(this, 466, 106, textureX, textureY); // Box 136cp
		bodyModel[177].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[177].setRotationPoint(-30.0f, -3.5f, -10.0f);
		bodyModel[177].rotateAngleY = 6.2831855f;

		bodyModel[178] = new ModelRendererTurbo(this, 380, 80, textureX, textureY);
		bodyModel[178].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[178].setRotationPoint(29.0f, -17.5f, -10.0f);

		bodyModel[179] = new ModelRendererTurbo(this, 337, 80, textureX, textureY);
		bodyModel[179].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[179].setRotationPoint(-25.0f, -17.5f, -10.0f);

		bodyModel[180] = new ModelRendererTurbo(this, 288, 118, textureX, textureY); // Box 136cp
		bodyModel[180].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[180].setRotationPoint(-45.0f, -10.5f, 4.0f);
		bodyModel[180].rotateAngleY = 6.2831855f;

		bodyModel[181] = new ModelRendererTurbo(this, 419, 80, textureX, textureY); // Box 136cp
		bodyModel[181].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[181].setRotationPoint(-49.0f, -4.5f, 4.0f);
		bodyModel[181].rotateAngleY = 6.2831855f;

		bodyModel[182] = new ModelRendererTurbo(this, 150, 103, textureX, textureY); // Box 136cp
		bodyModel[182].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[182].setRotationPoint(-48.0f, -3.5f, 4.0f);
		bodyModel[182].rotateAngleY = 6.2831855f;

		bodyModel[183] = new ModelRendererTurbo(this, 110, 118, textureX, textureY); // Box 136cp
		bodyModel[183].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[183].setRotationPoint(-42.0f, -10.5f, 4.0f);

		bodyModel[184] = new ModelRendererTurbo(this, 376, 80, textureX, textureY); // Box 136cp
		bodyModel[184].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[184].setRotationPoint(-42.0f, -4.5f, 4.0f);

		bodyModel[185] = new ModelRendererTurbo(this, 194, 102, textureX, textureY); // Box 136cp
		bodyModel[185].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[185].setRotationPoint(-41.0f, -3.5f, 4.0f);

		bodyModel[186] = new ModelRendererTurbo(this, 175, 117, textureX, textureY); // Box 136cp
		bodyModel[186].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[186].setRotationPoint(-27.0f, -10.5f, 4.0f);
		bodyModel[186].rotateAngleY = 6.2831855f;

		bodyModel[187] = new ModelRendererTurbo(this, 467, 92, textureX, textureY); // Box 136cp
		bodyModel[187].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[187].setRotationPoint(-30.0f, -3.5f, 4.0f);
		bodyModel[187].rotateAngleY = 6.2831855f;

		bodyModel[188] = new ModelRendererTurbo(this, 333, 80, textureX, textureY); // Box 136cp
		bodyModel[188].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[188].setRotationPoint(-31.0f, -4.5f, 4.0f);
		bodyModel[188].rotateAngleY = 6.2831855f;

		bodyModel[189] = new ModelRendererTurbo(this, 294, 80, textureX, textureY);
		bodyModel[189].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[189].setRotationPoint(-12.0f, -17.5f, -10.0f);

		bodyModel[190] = new ModelRendererTurbo(this, 192, 64, textureX, textureY);
		bodyModel[190].addShapeBox(0, 0, 0, 1, 17, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[190].setRotationPoint(16.0f, -17.5f, -10.0f);

		bodyModel[191] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Box 136cp
		bodyModel[191].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[191].setRotationPoint(13.9f, -10.5f, 4.0f);
		bodyModel[191].rotateAngleY = 6.2831855f;

		bodyModel[192] = new ModelRendererTurbo(this, 489, 78, textureX, textureY); // Box 136cp
		bodyModel[192].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[192].setRotationPoint(10.0f, -4.5f, 4.0f);
		bodyModel[192].rotateAngleY = 6.2831855f;

		bodyModel[193] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Box 136cp
		bodyModel[193].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[193].setRotationPoint(11.0f, -3.5f, 4.0f);
		bodyModel[193].rotateAngleY = 6.2831855f;

		bodyModel[194] = new ModelRendererTurbo(this, 490, 116, textureX, textureY); // Box 136cp
		bodyModel[194].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[194].setRotationPoint(31.0f, -10.5f, -10.0f);

		bodyModel[195] = new ModelRendererTurbo(this, 189, 74, textureX, textureY); // Box 136cp
		bodyModel[195].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[195].setRotationPoint(31.0f, -4.5f, -10.0f);

		bodyModel[196] = new ModelRendererTurbo(this, 63, 64, textureX, textureY); // Box 136cp
		bodyModel[196].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[196].setRotationPoint(32.0f, -3.5f, -10.0f);

		bodyModel[197] = new ModelRendererTurbo(this, 475, 116, textureX, textureY); // Box 136cp
		bodyModel[197].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[197].setRotationPoint(31.0f, -10.5f, 4.0f);

		bodyModel[198] = new ModelRendererTurbo(this, 172, 72, textureX, textureY); // Box 136cp
		bodyModel[198].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[198].setRotationPoint(31.0f, -4.5f, 4.0f);

		bodyModel[199] = new ModelRendererTurbo(this, 0, 64, textureX, textureY); // Box 136cp
		bodyModel[199].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[199].setRotationPoint(32.0f, -3.5f, 4.0f);

		bodyModel[200] = new ModelRendererTurbo(this, 74, 124, textureX, textureY);
		bodyModel[200].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[200].setRotationPoint(-23.5f, -10.5f, 10.7f);

		bodyModel[201] = new ModelRendererTurbo(this, 71, 124, textureX, textureY);
		bodyModel[201].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[201].setRotationPoint(-12.5f, -10.5f, 10.7f);

		bodyModel[202] = new ModelRendererTurbo(this, 68, 124, textureX, textureY);
		bodyModel[202].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[202].setRotationPoint(17.5f, -10.5f, 10.7f);

		bodyModel[203] = new ModelRendererTurbo(this, 65, 124, textureX, textureY);
		bodyModel[203].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[203].setRotationPoint(28.5f, -10.5f, 10.7f);

		bodyModel[204] = new ModelRendererTurbo(this, 248, 121, textureX, textureY);
		bodyModel[204].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[204].setRotationPoint(28.5f, -10.5f, -12.0f);

		bodyModel[205] = new ModelRendererTurbo(this, 97, 121, textureX, textureY);
		bodyModel[205].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[205].setRotationPoint(17.5f, -10.5f, -12.0f);

		bodyModel[206] = new ModelRendererTurbo(this, 94, 121, textureX, textureY);
		bodyModel[206].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[206].setRotationPoint(-12.5f, -10.5f, -12.0f);

		bodyModel[207] = new ModelRendererTurbo(this, 15, 117, textureX, textureY);
		bodyModel[207].addShapeBox(0, 0, 0, 0, 12, 1, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0);
		bodyModel[207].setRotationPoint(-23.5f, -10.5f, -12.0f);

		bodyModel[208] = new ModelRendererTurbo(this, 52, 86, textureX, textureY);
		bodyModel[208].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[208].setRotationPoint(-42.0f, 6.5f, -5.5f);

		bodyModel[209] = new ModelRendererTurbo(this, 393, 118, textureX, textureY);
		bodyModel[209].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[209].setRotationPoint(-41.5f, 7.0f, 5.5f);

		bodyModel[210] = new ModelRendererTurbo(this, 288, 83, textureX, textureY);
		bodyModel[210].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[210].setRotationPoint(-56.0f, 6.5f, -5.5f);

		bodyModel[211] = new ModelRendererTurbo(this, 294, 96, textureX, textureY);
		bodyModel[211].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[211].setRotationPoint(-42.0f, 6.5f, 5.5f);

		bodyModel[212] = new ModelRendererTurbo(this, 393, 91, textureX, textureY);
		bodyModel[212].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[212].setRotationPoint(-56.0f, 6.5f, 5.5f);

		bodyModel[213] = new ModelRendererTurbo(this, 317, 90, textureX, textureY);
		bodyModel[213].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[213].setRotationPoint(-44.0f, 7.5f, 6.5f);

		bodyModel[214] = new ModelRendererTurbo(this, 156, 89, textureX, textureY);
		bodyModel[214].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[214].setRotationPoint(-58.0f, 7.5f, 6.5f);

		bodyModel[215] = new ModelRendererTurbo(this, 83, 102, textureX, textureY);
		bodyModel[215].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[215].setRotationPoint(-41.0f, 3.5f, 6.5f);

		bodyModel[216] = new ModelRendererTurbo(this, 129, 64, textureX, textureY);
		bodyModel[216].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[216].setRotationPoint(-56.0f, 3.5f, 6.5f);

		bodyModel[217] = new ModelRendererTurbo(this, 252, 91, textureX, textureY);
		bodyModel[217].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[217].setRotationPoint(-39.0f, 5.5f, 6.5f);

		bodyModel[218] = new ModelRendererTurbo(this, 238, 91, textureX, textureY);
		bodyModel[218].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[218].setRotationPoint(-60.0f, 5.5f, 6.5f);

		bodyModel[219] = new ModelRendererTurbo(this, 480, 90, textureX, textureY);
		bodyModel[219].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[219].setRotationPoint(-49.0f, 4.5f, 6.5f);

		bodyModel[220] = new ModelRendererTurbo(this, 46, 88, textureX, textureY);
		bodyModel[220].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[220].setRotationPoint(-47.5f, 4.5f, 6.5f);

		bodyModel[221] = new ModelRendererTurbo(this, 174, 86, textureX, textureY);
		bodyModel[221].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[221].setRotationPoint(-50.5f, 4.5f, 6.5f);

		bodyModel[222] = new ModelRendererTurbo(this, 117, 70, textureX, textureY);
		bodyModel[222].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[222].setRotationPoint(-49.5f, 2.0f, -1.0f);

		bodyModel[223] = new ModelRendererTurbo(this, 360, 80, textureX, textureY);
		bodyModel[223].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[223].setRotationPoint(-38.0f, 5.5f, -6.5f);

		bodyModel[224] = new ModelRendererTurbo(this, 317, 80, textureX, textureY);
		bodyModel[224].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[224].setRotationPoint(-60.0f, 5.5f, -6.5f);

		bodyModel[225] = new ModelRendererTurbo(this, 76, 102, textureX, textureY);
		bodyModel[225].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[225].setRotationPoint(-58.0f, 3.5f, 6.5f);

		bodyModel[226] = new ModelRendererTurbo(this, 172, 68, textureX, textureY);
		bodyModel[226].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[226].setRotationPoint(-48.5f, 3.0f, -1.0f);

		bodyModel[227] = new ModelRendererTurbo(this, 341, 91, textureX, textureY);
		bodyModel[227].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[227].setRotationPoint(-49.5f, 2.0f, 1.0f);

		bodyModel[228] = new ModelRendererTurbo(this, 46, 88, textureX, textureY);
		bodyModel[228].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[228].setRotationPoint(-49.5f, 2.0f, -3.0f);

		bodyModel[229] = new ModelRendererTurbo(this, 474, 66, textureX, textureY);
		bodyModel[229].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[229].setRotationPoint(-60.5f, 3.0f, 0.0f);

		bodyModel[230] = new ModelRendererTurbo(this, 462, 90, textureX, textureY);
		bodyModel[230].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[230].setRotationPoint(-39.0f, 5.5f, -7.5f);

		bodyModel[231] = new ModelRendererTurbo(this, 373, 95, textureX, textureY);
		bodyModel[231].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[231].setRotationPoint(-41.0f, 3.5f, -7.5f);

		bodyModel[232] = new ModelRendererTurbo(this, 86, 64, textureX, textureY);
		bodyModel[232].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[232].setRotationPoint(-56.0f, 3.5f, -7.5f);

		bodyModel[233] = new ModelRendererTurbo(this, 330, 95, textureX, textureY);
		bodyModel[233].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[233].setRotationPoint(-58.0f, 3.5f, -7.5f);

		bodyModel[234] = new ModelRendererTurbo(this, 302, 90, textureX, textureY);
		bodyModel[234].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[234].setRotationPoint(-60.0f, 5.5f, -7.5f);

		bodyModel[235] = new ModelRendererTurbo(this, 138, 88, textureX, textureY);
		bodyModel[235].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[235].setRotationPoint(-42.0f, 6.5f, -7.5f);

		bodyModel[236] = new ModelRendererTurbo(this, 317, 87, textureX, textureY);
		bodyModel[236].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[236].setRotationPoint(-58.0f, 7.5f, -7.5f);

		bodyModel[237] = new ModelRendererTurbo(this, 156, 86, textureX, textureY);
		bodyModel[237].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[237].setRotationPoint(-44.0f, 7.5f, -7.5f);

		bodyModel[238] = new ModelRendererTurbo(this, 116, 86, textureX, textureY);
		bodyModel[238].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[238].setRotationPoint(-49.0f, 4.5f, -7.5f);

		bodyModel[239] = new ModelRendererTurbo(this, 277, 83, textureX, textureY);
		bodyModel[239].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[239].setRotationPoint(-50.5f, 4.5f, -7.5f);

		bodyModel[240] = new ModelRendererTurbo(this, 252, 83, textureX, textureY);
		bodyModel[240].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[240].setRotationPoint(-47.5f, 4.5f, -7.5f);

		bodyModel[241] = new ModelRendererTurbo(this, 462, 82, textureX, textureY);
		bodyModel[241].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[241].setRotationPoint(-42.0f, 4.5f, -7.5f);

		bodyModel[242] = new ModelRendererTurbo(this, 56, 88, textureX, textureY);
		bodyModel[242].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[242].setRotationPoint(-56.0f, 6.5f, -7.5f);

		bodyModel[243] = new ModelRendererTurbo(this, 202, 112, textureX, textureY);
		bodyModel[243].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[243].setRotationPoint(-41.5f, 7.0f, -5.5f);

		bodyModel[244] = new ModelRendererTurbo(this, 53, 99, textureX, textureY);
		bodyModel[244].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[244].setRotationPoint(-55.5f, 7.0f, -5.5f);

		bodyModel[245] = new ModelRendererTurbo(this, 281, 96, textureX, textureY);
		bodyModel[245].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[245].setRotationPoint(-55.5f, 7.0f, 5.5f);

		bodyModel[246] = new ModelRendererTurbo(this, 506, 81, textureX, textureY);
		bodyModel[246].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[246].setRotationPoint(-58.0f, 6.5f, -7.5f);

		bodyModel[247] = new ModelRendererTurbo(this, 446, 86, textureX, textureY);
		bodyModel[247].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[247].setRotationPoint(-54.0f, 4.5f, -7.5f);

		bodyModel[248] = new ModelRendererTurbo(this, 184, 86, textureX, textureY);
		bodyModel[248].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[248].setRotationPoint(-45.0f, 4.5f, -7.5f);

		bodyModel[249] = new ModelRendererTurbo(this, 133, 86, textureX, textureY);
		bodyModel[249].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[249].setRotationPoint(-41.0f, 4.5f, -7.5f);

		bodyModel[250] = new ModelRendererTurbo(this, 164, 78, textureX, textureY);
		bodyModel[250].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[250].setRotationPoint(-40.0f, 6.5f, -7.5f);

		bodyModel[251] = new ModelRendererTurbo(this, 288, 83, textureX, textureY);
		bodyModel[251].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[251].setRotationPoint(-58.0f, 4.5f, -7.5f);

		bodyModel[252] = new ModelRendererTurbo(this, 419, 80, textureX, textureY);
		bodyModel[252].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[252].setRotationPoint(-56.0f, 4.5f, -7.5f);

		bodyModel[253] = new ModelRendererTurbo(this, 267, 83, textureX, textureY);
		bodyModel[253].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[253].setRotationPoint(-45.0f, 4.5f, 6.5f);

		bodyModel[254] = new ModelRendererTurbo(this, 376, 80, textureX, textureY);
		bodyModel[254].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[254].setRotationPoint(-42.0f, 4.5f, 6.5f);

		bodyModel[255] = new ModelRendererTurbo(this, 232, 71, textureX, textureY);
		bodyModel[255].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[255].setRotationPoint(-40.0f, 6.5f, 6.5f);

		bodyModel[256] = new ModelRendererTurbo(this, 479, 82, textureX, textureY);
		bodyModel[256].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[256].setRotationPoint(-41.0f, 4.5f, 6.5f);

		bodyModel[257] = new ModelRendererTurbo(this, 436, 80, textureX, textureY);
		bodyModel[257].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[257].setRotationPoint(-54.0f, 4.5f, 6.5f);

		bodyModel[258] = new ModelRendererTurbo(this, 333, 80, textureX, textureY);
		bodyModel[258].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[258].setRotationPoint(-56.0f, 4.5f, 6.5f);

		bodyModel[259] = new ModelRendererTurbo(this, 215, 71, textureX, textureY);
		bodyModel[259].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[259].setRotationPoint(-58.0f, 6.5f, 6.5f);

		bodyModel[260] = new ModelRendererTurbo(this, 393, 80, textureX, textureY);
		bodyModel[260].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[260].setRotationPoint(-58.0f, 4.5f, 6.5f);

		bodyModel[261] = new ModelRendererTurbo(this, 263, 83, textureX, textureY);
		bodyModel[261].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[261].setRotationPoint(51.5f, 6.5f, -5.5f);

		bodyModel[262] = new ModelRendererTurbo(this, 360, 86, textureX, textureY);
		bodyModel[262].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[262].setRotationPoint(52.0f, 7.0f, 5.5f);

		bodyModel[263] = new ModelRendererTurbo(this, 238, 83, textureX, textureY);
		bodyModel[263].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[263].setRotationPoint(37.5f, 6.5f, -5.5f);

		bodyModel[264] = new ModelRendererTurbo(this, 350, 80, textureX, textureY);
		bodyModel[264].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[264].setRotationPoint(51.5f, 6.5f, 5.5f);

		bodyModel[265] = new ModelRendererTurbo(this, 225, 76, textureX, textureY);
		bodyModel[265].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[265].setRotationPoint(37.5f, 6.5f, 5.5f);

		bodyModel[266] = new ModelRendererTurbo(this, 360, 83, textureX, textureY);
		bodyModel[266].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[266].setRotationPoint(49.5f, 7.5f, 6.5f);

		bodyModel[267] = new ModelRendererTurbo(this, 360, 80, textureX, textureY);
		bodyModel[267].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[267].setRotationPoint(35.5f, 7.5f, 6.5f);

		bodyModel[268] = new ModelRendererTurbo(this, 13, 74, textureX, textureY);
		bodyModel[268].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[268].setRotationPoint(52.5f, 3.5f, 6.5f);

		bodyModel[269] = new ModelRendererTurbo(this, 474, 63, textureX, textureY);
		bodyModel[269].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[269].setRotationPoint(37.5f, 3.5f, 6.5f);

		bodyModel[270] = new ModelRendererTurbo(this, 245, 73, textureX, textureY);
		bodyModel[270].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[270].setRotationPoint(54.5f, 5.5f, 6.5f);

		bodyModel[271] = new ModelRendererTurbo(this, 102, 72, textureX, textureY);
		bodyModel[271].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[271].setRotationPoint(33.5f, 5.5f, 6.5f);

		bodyModel[272] = new ModelRendererTurbo(this, 506, 76, textureX, textureY);
		bodyModel[272].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[272].setRotationPoint(44.5f, 4.5f, 6.5f);

		bodyModel[273] = new ModelRendererTurbo(this, 215, 76, textureX, textureY);
		bodyModel[273].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[273].setRotationPoint(46.0f, 4.5f, 6.5f);

		bodyModel[274] = new ModelRendererTurbo(this, 206, 74, textureX, textureY);
		bodyModel[274].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[274].setRotationPoint(43.0f, 4.5f, 6.5f);

		bodyModel[275] = new ModelRendererTurbo(this, 117, 65, textureX, textureY);
		bodyModel[275].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[275].setRotationPoint(44.0f, 2.0f, -1.0f);

		bodyModel[276] = new ModelRendererTurbo(this, 129, 67, textureX, textureY);
		bodyModel[276].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[276].setRotationPoint(55.5f, 5.5f, -6.5f);

		bodyModel[277] = new ModelRendererTurbo(this, 86, 67, textureX, textureY);
		bodyModel[277].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[277].setRotationPoint(33.5f, 5.5f, -6.5f);

		bodyModel[278] = new ModelRendererTurbo(this, 245, 68, textureX, textureY);
		bodyModel[278].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[278].setRotationPoint(35.5f, 3.5f, 6.5f);

		bodyModel[279] = new ModelRendererTurbo(this, 215, 64, textureX, textureY);
		bodyModel[279].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[279].setRotationPoint(45.0f, 3.0f, -1.0f);

		bodyModel[280] = new ModelRendererTurbo(this, 174, 86, textureX, textureY);
		bodyModel[280].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[280].setRotationPoint(44.0f, 2.0f, 1.0f);

		bodyModel[281] = new ModelRendererTurbo(this, 215, 76, textureX, textureY);
		bodyModel[281].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[281].setRotationPoint(44.0f, 2.0f, -3.0f);

		bodyModel[282] = new ModelRendererTurbo(this, 172, 64, textureX, textureY);
		bodyModel[282].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[282].setRotationPoint(33.0f, 3.0f, 0.0f);

		bodyModel[283] = new ModelRendererTurbo(this, 204, 68, textureX, textureY);
		bodyModel[283].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[283].setRotationPoint(54.5f, 5.5f, -7.5f);

		bodyModel[284] = new ModelRendererTurbo(this, 162, 68, textureX, textureY);
		bodyModel[284].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[284].setRotationPoint(52.5f, 3.5f, -7.5f);

		bodyModel[285] = new ModelRendererTurbo(this, 474, 60, textureX, textureY);
		bodyModel[285].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[285].setRotationPoint(37.5f, 3.5f, -7.5f);

		bodyModel[286] = new ModelRendererTurbo(this, 102, 67, textureX, textureY);
		bodyModel[286].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[286].setRotationPoint(35.5f, 3.5f, -7.5f);

		bodyModel[287] = new ModelRendererTurbo(this, 259, 49, textureX, textureY);
		bodyModel[287].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[287].setRotationPoint(33.5f, 5.5f, -7.5f);

		bodyModel[288] = new ModelRendererTurbo(this, 204, 64, textureX, textureY);
		bodyModel[288].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[288].setRotationPoint(51.5f, 6.5f, -7.5f);

		bodyModel[289] = new ModelRendererTurbo(this, 129, 77, textureX, textureY);
		bodyModel[289].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[289].setRotationPoint(35.5f, 7.5f, -7.5f);

		bodyModel[290] = new ModelRendererTurbo(this, 129, 74, textureX, textureY);
		bodyModel[290].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[290].setRotationPoint(49.5f, 7.5f, -7.5f);

		bodyModel[291] = new ModelRendererTurbo(this, 0, 74, textureX, textureY);
		bodyModel[291].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[291].setRotationPoint(44.5f, 4.5f, -7.5f);

		bodyModel[292] = new ModelRendererTurbo(this, 189, 73, textureX, textureY);
		bodyModel[292].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[292].setRotationPoint(43.0f, 4.5f, -7.5f);

		bodyModel[293] = new ModelRendererTurbo(this, 172, 72, textureX, textureY);
		bodyModel[293].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[293].setRotationPoint(46.0f, 4.5f, -7.5f);

		bodyModel[294] = new ModelRendererTurbo(this, 474, 70, textureX, textureY);
		bodyModel[294].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[294].setRotationPoint(51.5f, 4.5f, -7.5f);

		bodyModel[295] = new ModelRendererTurbo(this, 162, 64, textureX, textureY);
		bodyModel[295].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[295].setRotationPoint(37.5f, 6.5f, -7.5f);

		bodyModel[296] = new ModelRendererTurbo(this, 317, 80, textureX, textureY);
		bodyModel[296].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[296].setRotationPoint(52.0f, 7.0f, -5.5f);

		bodyModel[297] = new ModelRendererTurbo(this, 129, 67, textureX, textureY);
		bodyModel[297].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[297].setRotationPoint(38.0f, 7.0f, -5.5f);

		bodyModel[298] = new ModelRendererTurbo(this, 498, 44, textureX, textureY);
		bodyModel[298].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[298].setRotationPoint(38.0f, 7.0f, 5.5f);

		bodyModel[299] = new ModelRendererTurbo(this, 232, 68, textureX, textureY);
		bodyModel[299].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[299].setRotationPoint(35.5f, 6.5f, -7.5f);

		bodyModel[300] = new ModelRendererTurbo(this, 76, 64, textureX, textureY);
		bodyModel[300].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[300].setRotationPoint(39.5f, 4.5f, -7.5f);

		bodyModel[301] = new ModelRendererTurbo(this, 13, 64, textureX, textureY);
		bodyModel[301].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[301].setRotationPoint(48.5f, 4.5f, -7.5f);

		bodyModel[302] = new ModelRendererTurbo(this, 505, 38, textureX, textureY);
		bodyModel[302].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[302].setRotationPoint(52.5f, 4.5f, -7.5f);

		bodyModel[303] = new ModelRendererTurbo(this, 215, 68, textureX, textureY);
		bodyModel[303].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[303].setRotationPoint(53.5f, 6.5f, -7.5f);

		bodyModel[304] = new ModelRendererTurbo(this, 13, 32, textureX, textureY);
		bodyModel[304].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[304].setRotationPoint(35.5f, 4.5f, -7.5f);

		bodyModel[305] = new ModelRendererTurbo(this, 145, 67, textureX, textureY);
		bodyModel[305].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[305].setRotationPoint(37.5f, 4.5f, -7.5f);

		bodyModel[306] = new ModelRendererTurbo(this, 504, 30, textureX, textureY);
		bodyModel[306].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[306].setRotationPoint(48.5f, 4.5f, 6.5f);

		bodyModel[307] = new ModelRendererTurbo(this, 94, 67, textureX, textureY);
		bodyModel[307].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[307].setRotationPoint(51.5f, 4.5f, 6.5f);

		bodyModel[308] = new ModelRendererTurbo(this, 63, 67, textureX, textureY);
		bodyModel[308].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[308].setRotationPoint(53.5f, 6.5f, 6.5f);

		bodyModel[309] = new ModelRendererTurbo(this, 504, 24, textureX, textureY);
		bodyModel[309].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[309].setRotationPoint(52.5f, 4.5f, 6.5f);

		bodyModel[310] = new ModelRendererTurbo(this, 13, 22, textureX, textureY);
		bodyModel[310].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[310].setRotationPoint(39.5f, 4.5f, 6.5f);

		bodyModel[311] = new ModelRendererTurbo(this, 86, 67, textureX, textureY);
		bodyModel[311].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[311].setRotationPoint(37.5f, 4.5f, 6.5f);

		bodyModel[312] = new ModelRendererTurbo(this, 0, 67, textureX, textureY);
		bodyModel[312].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[312].setRotationPoint(35.5f, 6.5f, 6.5f);

		bodyModel[313] = new ModelRendererTurbo(this, 504, 20, textureX, textureY);
		bodyModel[313].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[313].setRotationPoint(35.5f, 4.5f, 6.5f);

		bodyModel[314] = new ModelRendererTurbo(this, 63, 64, textureX, textureY); // lampcp
		bodyModel[314].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[314].setRotationPoint(63.5f, -16.0f, -0.5f);
		bodyModel[314].rotateAngleY = -3.1415927f;

		bodyModel[315] = new ModelRendererTurbo(this, 49, 64, textureX, textureY); // lampcp
		bodyModel[315].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0.2f, 0.2f, 0, -0.2f, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.2f, 0.2f);
		bodyModel[315].setRotationPoint(64.5f, -16.01f, -0.5f);
		bodyModel[315].rotateAngleY = -3.1415927f;

		bodyModel[316] = new ModelRendererTurbo(this, 0, 64, textureX, textureY);
		bodyModel[316].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[316].setRotationPoint(58.5f, -7.2f, -10.4f);
		bodyModel[316].rotateAngleZ = 0.34732053f;

		bodyModel[317] = new ModelRendererTurbo(this, 507, 63, textureX, textureY);
		bodyModel[317].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[317].setRotationPoint(58.5f, -7.2f, -10.1f);
		bodyModel[317].rotateAngleZ = 0.34732053f;

		bodyModel[318] = new ModelRendererTurbo(this, 507, 60, textureX, textureY);
		bodyModel[318].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[318].setRotationPoint(58.5f, -7.2f, -9.8f);
		bodyModel[318].rotateAngleZ = 0.34732053f;

		bodyModel[319] = new ModelRendererTurbo(this, 262, 38, textureX, textureY);
		bodyModel[319].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[319].setRotationPoint(58.5f, -7.2f, -9.5f);
		bodyModel[319].rotateAngleZ = 0.34732053f;

		bodyModel[320] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
		bodyModel[320].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[320].setRotationPoint(58.5f, -7.2f, -9.2f);
		bodyModel[320].rotateAngleZ = 0.34732053f;

		bodyModel[321] = new ModelRendererTurbo(this, 247, 33, textureX, textureY);
		bodyModel[321].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[321].setRotationPoint(58.5f, -7.2f, -8.9f);
		bodyModel[321].rotateAngleZ = 0.34732053f;

		bodyModel[322] = new ModelRendererTurbo(this, 0, 32, textureX, textureY);
		bodyModel[322].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[322].setRotationPoint(58.5f, -7.2f, -8.6f);
		bodyModel[322].rotateAngleZ = 0.34732053f;

		bodyModel[323] = new ModelRendererTurbo(this, 247, 30, textureX, textureY);
		bodyModel[323].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[323].setRotationPoint(58.5f, -7.2f, -8.3f);
		bodyModel[323].rotateAngleZ = 0.34732053f;

		bodyModel[324] = new ModelRendererTurbo(this, 247, 25, textureX, textureY);
		bodyModel[324].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[324].setRotationPoint(58.5f, -7.2f, -8.0f);
		bodyModel[324].rotateAngleZ = 0.34732053f;

		bodyModel[325] = new ModelRendererTurbo(this, 460, 116, textureX, textureY); // Box 136cp
		bodyModel[325].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[325].setRotationPoint(-1.0f, -10.5f, -10.0f);

		bodyModel[326] = new ModelRendererTurbo(this, 474, 70, textureX, textureY); // Box 136cp
		bodyModel[326].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[326].setRotationPoint(-1.0f, -4.5f, -10.0f);

		bodyModel[327] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 136cp
		bodyModel[327].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[327].setRotationPoint(0.0f, -3.5f, -10.0f);

		bodyModel[328] = new ModelRendererTurbo(this, 160, 116, textureX, textureY); // Box 136cp
		bodyModel[328].addShapeBox(0, 0, 0, 1, 6, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[328].setRotationPoint(-63.0f, -10.5f, -10.0f);

		bodyModel[329] = new ModelRendererTurbo(this, 215, 68, textureX, textureY); // Box 136cp
		bodyModel[329].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[329].setRotationPoint(-63.0f, -4.5f, -10.0f);

		bodyModel[330] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 136cp
		bodyModel[330].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[330].setRotationPoint(-62.0f, -3.5f, -10.0f);

		bodyModel[331] = new ModelRendererTurbo(this, 252, 115, textureX, textureY); // Box 136cp
		bodyModel[331].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[331].setRotationPoint(14.0f, -10.5f, -10.0f);
		bodyModel[331].rotateAngleY = 6.2831855f;

		bodyModel[332] = new ModelRendererTurbo(this, 145, 67, textureX, textureY); // Box 136cp
		bodyModel[332].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[332].setRotationPoint(10.0f, -4.5f, -10.0f);
		bodyModel[332].rotateAngleY = 6.2831855f;

		bodyModel[333] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 136cp
		bodyModel[333].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[333].setRotationPoint(11.0f, -3.5f, -10.0f);
		bodyModel[333].rotateAngleY = 6.2831855f;

		bodyModel[334] = new ModelRendererTurbo(this, 247, 22, textureX, textureY);
		bodyModel[334].addShapeBox(0, 0, 0, 125, 1, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.6f, -2, 0, -0.6f, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[334].setRotationPoint(-65.0f, -20.4f, 0.0f);

		bodyModel[335] = new ModelRendererTurbo(this, 102, 67, textureX, textureY);
		bodyModel[335].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0);
		bodyModel[335].setRotationPoint(-68.0f, -0.5f, -4.0f);

		bodyModel[336] = new ModelRendererTurbo(this, 127, 114, textureX, textureY);
		bodyModel[336].addShapeBox(0, 0, 0, 1, 8, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[336].setRotationPoint(60.0f, -7.5f, -3.0f);

		bodyModel[337] = new ModelRendererTurbo(this, 143, 113, textureX, textureY);
		bodyModel[337].addShapeBox(0, 0, 0, 1, 8, 7, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[337].setRotationPoint(60.0f, -7.5f, -10.0f);

		bodyModel[338] = new ModelRendererTurbo(this, 192, 112, textureX, textureY);
		bodyModel[338].addShapeBox(0, 0, 0, 1, 8, 7, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[338].setRotationPoint(60.0f, -7.5f, 3.0f);

		bodyModel[339] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
		bodyModel[339].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.5f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0, -0.5f, -0.6f, 0);
		bodyModel[339].setRotationPoint(59.3f, -7.8f, -5.9f);
		bodyModel[339].rotateAngleY = -0.17453292f;

		bodyModel[340] = new ModelRendererTurbo(this, 247, 22, textureX, textureY);
		bodyModel[340].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.5f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0, -0.5f, -0.6f, 0);
		bodyModel[340].setRotationPoint(59.2f, -7.8f, -6.5f);
		bodyModel[340].rotateAngleY = -0.08726646f;

		bodyModel[341] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		bodyModel[341].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0, -0.6f, -0.6f, 0);
		bodyModel[341].setRotationPoint(55.0f, -5.65f, -6.8f);
		bodyModel[341].rotateAngleZ = 0.34906584f;

		bodyModel[342] = new ModelRendererTurbo(this, 15, 17, textureX, textureY);
		bodyModel[342].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4f, -0.75f, -0.25f, -0.4f, -0.75f, -0.25f, -0.4f, 0, -0.5f, -0.4f, 0);
		bodyModel[342].setRotationPoint(54.9525f, -6.25f, -6.875f);
		bodyModel[342].rotateAngleZ = 0.34906584f;

		bodyModel[343] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		bodyModel[343].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[343].setRotationPoint(55.7f, -5.9f, -8.0f);
		bodyModel[343].rotateAngleZ = 0.43633232f;

		bodyModel[344] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		bodyModel[344].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[344].setRotationPoint(55.7f, -5.9f, -8.3f);
		bodyModel[344].rotateAngleZ = 0.43633232f;

		bodyModel[345] = new ModelRendererTurbo(this, 14, 0, textureX, textureY);
		bodyModel[345].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f, 0, 0, 0, 0, 0);
		bodyModel[345].setRotationPoint(55.7f, -5.9f, -8.6f);
		bodyModel[345].rotateAngleZ = 0.43633232f;

		bodyModel[346] = new ModelRendererTurbo(this, 288, 103, textureX, textureY);
		bodyModel[346].addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.8f, 0, 0);
		bodyModel[346].setRotationPoint(58.7f, -10.9f, -10.5f);
		bodyModel[346].rotateAngleY = -0.08726646f;

		bodyModel[347] = new ModelRendererTurbo(this, 101, 114, textureX, textureY); // Box 136cp
		bodyModel[347].addBox(0, 0, 0, 2, 4, 5, 0f);
		bodyModel[347].setRotationPoint(51.5f, -2.1f, -9.9f);

		bodyModel[348] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136cp
		bodyModel[348].addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0);
		bodyModel[348].setRotationPoint(50.5f, -3.1f, -9.9f);

		bodyModel[349] = new ModelRendererTurbo(this, 86, 67, textureX, textureY); // Box 136cp
		bodyModel[349].addShapeBox(0, 0, 0, 1, 5, 5, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[349].setRotationPoint(50.5f, -8.1f, -9.9f);

		bodyModel[350] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[350].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.1f, -0.5f, 0, 0.1f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.1f, -0.5f, 0, 0.1f);
		bodyModel[350].setRotationPoint(59.1f, -12.9f, -10.0f);

		bodyModel[351] = new ModelRendererTurbo(this, 90, 125, textureX, textureY);
		bodyModel[351].addShapeBox(0, 0, 0, 1, 2, 10, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[351].setRotationPoint(62.0f, -17.76f, -5.0f);

		bodyModel[352] = new ModelRendererTurbo(this, 13, 7, textureX, textureY);
		bodyModel[352].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, -0.8f, -0.4f, 0, -0.8f, -0.8f, -0.8f, 0, -0.8f, -0.8f, 0, -0.8f, 0, -0.8f, -0.8f, 0);
		bodyModel[352].setRotationPoint(59.1f, -8.7f, -3.0f);

		bodyModel[353] = new ModelRendererTurbo(this, 84, 110, textureX, textureY); // Box 136cp
		bodyModel[353].addBox(0, 0, 0, 2, 4, 6, 0f);
		bodyModel[353].setRotationPoint(50.0f, -2.1f, 3.9f);

		bodyModel[354] = new ModelRendererTurbo(this, 252, 83, textureX, textureY); // Box 136cp
		bodyModel[354].addShapeBox(0, 0, 0, 4, 1, 6, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0);
		bodyModel[354].setRotationPoint(49.0f, -3.1f, 3.9f);

		bodyModel[355] = new ModelRendererTurbo(this, 498, 38, textureX, textureY);
		bodyModel[355].addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.7f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.9f, -0.3f, -0.3f, -0.9f, -0.3f, -0.3f, -0.9f, -0.5f, -0.7f, -0.9f, -0.5f);
		bodyModel[355].setRotationPoint(54.15f, -3.6f, -2.2f);

		bodyModel[356] = new ModelRendererTurbo(this, 43, 64, textureX, textureY);
		bodyModel[356].addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.9f, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, -0.9f, -0.4f, 0, -0.9f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.9f, 0, 0);
		bodyModel[356].setRotationPoint(54.95f, -6.5f, -2.7f);

		bodyModel[357] = new ModelRendererTurbo(this, 149, 64, textureX, textureY);
		bodyModel[357].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[357].setRotationPoint(32.0f, -18.5f, -10.0f);

		bodyModel[358] = new ModelRendererTurbo(this, 106, 64, textureX, textureY);
		bodyModel[358].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[358].setRotationPoint(11.0f, -18.5f, -10.0f);

		bodyModel[359] = new ModelRendererTurbo(this, 63, 64, textureX, textureY);
		bodyModel[359].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[359].setRotationPoint(-12.0f, -18.5f, -10.0f);

		bodyModel[360] = new ModelRendererTurbo(this, 451, 60, textureX, textureY);
		bodyModel[360].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[360].setRotationPoint(-30.0f, -18.5f, -10.0f);

		bodyModel[361] = new ModelRendererTurbo(this, 252, 115, textureX, textureY); // Box 136cp
		bodyModel[361].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[361].setRotationPoint(-4.0f, -10.5f, -10.0f);
		bodyModel[361].rotateAngleY = 6.2831855f;

		bodyModel[362] = new ModelRendererTurbo(this, 145, 67, textureX, textureY); // Box 136cp
		bodyModel[362].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[362].setRotationPoint(-8.0f, -4.5f, -10.0f);
		bodyModel[362].rotateAngleY = 6.2831855f;

		bodyModel[363] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 136cp
		bodyModel[363].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[363].setRotationPoint(-7.0f, -3.5f, -10.0f);
		bodyModel[363].rotateAngleY = 6.2831855f;

		bodyModel[364] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 136cp
		bodyModel[364].addBox(0, 0, 0, 3, 3, 6, 0f);
		bodyModel[364].setRotationPoint(-7.0f, -3.5f, 4.0f);
		bodyModel[364].rotateAngleY = 6.2831855f;

		bodyModel[365] = new ModelRendererTurbo(this, 145, 67, textureX, textureY); // Box 136cp
		bodyModel[365].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[365].setRotationPoint(-8.0f, -4.5f, 4.0f);
		bodyModel[365].rotateAngleY = 6.2831855f;

		bodyModel[366] = new ModelRendererTurbo(this, 252, 115, textureX, textureY); // Box 136cp
		bodyModel[366].addShapeBox(0, 0, 0, 1, 6, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[366].setRotationPoint(-4.0f, -10.5f, 4.0f);
		bodyModel[366].rotateAngleY = 6.2831855f;

		flipAll();
	}

}