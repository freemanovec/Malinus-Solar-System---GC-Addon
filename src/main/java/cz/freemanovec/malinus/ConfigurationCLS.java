package cz.freemanovec.malinus;

import cpw.mods.fml.common.FMLCommonHandler;

public class ConfigurationCLS {
	public static int dimensionID_orion, dimensionID_furra, dimensionID_sierra, dimensionID_tango;
	public static int dimensionID_nova, dimensionID_rainbow, dimensionID_allegia;
	public static int biomeID_orionFlat, biomeID_furra, biomeID_sierra, biomeID_tango, biomeID_nova, biomeID_rainbow, biomeID_allegia;
	
	public static void syncConfig(){
		FMLCommonHandler.instance().bus().register(Main.instance);
		
		final String DIMENSIONS = Main.configurationFile.CATEGORY_GENERAL + Main.configurationFile.CATEGORY_SPLITTER + "Dimensions";
		Main.configurationFile.addCustomCategoryComment(DIMENSIONS, "Change dimension IDs for planets");
		
		dimensionID_orion = Main.configurationFile.get(DIMENSIONS, "ID of dimension Planet Orion", 60).getInt();
		dimensionID_furra = Main.configurationFile.get(DIMENSIONS, "ID of dimension Planet Furra", 61).getInt();
		dimensionID_nova = Main.configurationFile.get(DIMENSIONS, "ID of dimension Moon Nova", 62).getInt();
		dimensionID_sierra = Main.configurationFile.get(DIMENSIONS, "ID of dimension Planet Sierra", 63).getInt();
		dimensionID_tango = Main.configurationFile.get(DIMENSIONS, "ID of dimension Planet Tango", 64).getInt();
		dimensionID_rainbow = Main.configurationFile.get(DIMENSIONS, "ID of dimension Moon Rainbow", 65).getInt();
		dimensionID_allegia = Main.configurationFile.get(DIMENSIONS, "ID of dimension Moon Allegia", 66).getInt();
		
		final String BIOMES = Main.configurationFile.CATEGORY_GENERAL + Main.configurationFile.CATEGORY_SPLITTER + "Biomes";
		Main.configurationFile.addCustomCategoryComment(BIOMES, "Change biome IDs for planets");
		biomeID_orionFlat = Main.configurationFile.get(BIOMES, "ID of biome orionFlat", 180).getInt();
		biomeID_furra = Main.configurationFile.get(BIOMES, "ID of biome orionFlat", 180).getInt();
		biomeID_sierra = Main.configurationFile.get(BIOMES, "ID of biome orionFlat", 180).getInt();
		biomeID_tango = Main.configurationFile.get(BIOMES, "ID of biome orionFlat", 180).getInt();
		biomeID_nova = Main.configurationFile.get(BIOMES, "ID of biome orionFlat", 180).getInt();
		biomeID_rainbow = Main.configurationFile.get(BIOMES, "ID of biome orionFlat", 180).getInt();
		biomeID_allegia = Main.configurationFile.get(BIOMES, "ID of biome orionFlat", 180).getInt();
		
		
		if(Main.configurationFile.hasChanged()){
			Main.configurationFile.save();
		}
	}
}
