package cz.freemanovec.malinus;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cz.freemanovec.malinus.blocks.BlockRainbow;
import cz.freemanovec.malinus.planets.providers.WorldProviderOrion;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.Constants;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.planets.GalacticraftPlanets;
import micdoodle8.mods.galacticraft.planets.IPlanetsModule;
import micdoodle8.mods.galacticraft.planets.PlanetsProxy;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = References.MOD_ID, version = References.version, name = References.MOD_NAME, dependencies = References.DEPENDENCIES)
public class Main {
	
	@Mod.Instance
	public static Main instance;
	public static Configuration configurationFile;
	public static Logger log = FMLLog.getLogger();
	
	public static SolarSystem solarSystemMalinus;
	public static Planet planetFurra, planetSierra, planetTango;
	public static Moon moonNova, moonRainbow, moonAllegia;
	
	public static Block blockRainbow;
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equals(References.MOD_ID)){
			ConfigurationCLS.syncConfig();
		}
	}
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		FMLCommonHandler.instance().bus().register(this);
		
		configurationFile = new Configuration(event.getSuggestedConfigurationFile());
		ConfigurationCLS.syncConfig();
		
		GalacticraftPlanets.commonModules.put("ModuleOrion", new ModuleOrion());
		GalacticraftPlanets.commonModules.put("ModuleMalinusSolarSystem", new MalinusSystemModule());
		
		blockRainbow = new BlockRainbow();
		//GalacticraftPlanets.proxy.preInit(event);
	}
	//public static Planet planetOrion;
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		/*Vector3 solarPosition = new Vector3(Vec3.createVectorHelper(-1.3f,0,0));
		Main.solarSystemMalinus = new SolarSystem("kundus", "milkyWay").setMapPosition(solarPosition);
		Star starKundus = (Star) new Star("kundus").setParentSolarSystem(solarSystemMalinus).setTierRequired(-1);
		starKundus.setBodyIcon(new ResourceLocation("malinus", "/textures/gui/celestialbodies/malinus.png"));
		Main.solarSystemMalinus.setMainStar(starKundus);
		
		GalaxyRegistry.registerSolarSystem(solarSystemMalinus);
		
		planetFurra = new Planet("furra").setParentSolarSystem(solarSystemMalinus);
		planetSierra = new Planet("sierra").setParentSolarSystem(solarSystemMalinus);
		planetTango = new Planet("tango").setParentSolarSystem(solarSystemMalinus);
		
		planetFurra.setBodyIcon(new ResourceLocation("malinus","/textures/gui/celestialbodies/furra.png"));
		planetSierra.setBodyIcon(new ResourceLocation("malinus","/textures/gui/celestialbodies/sierra.png"));
		planetTango.setBodyIcon(new ResourceLocation("malinus","/textures/gui/celestialbodies/tango.png"));
		
		planetFurra.setRingColorRGB(0.1F, 0.9F, 0.6F).setPhaseShift(1.45F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.9f, 0.9f)).setRelativeOrbitTime(0.8835f);
		planetSierra.setRingColorRGB(0.1F, 0.9F, 0.6F).setPhaseShift(1.45F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.65f, 1.65f)).setRelativeOrbitTime(0.8353f);
		planetTango.setRingColorRGB(0.1F, 0.9F, 0.6F).setPhaseShift(1.45F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(4.2f, 4.2f)).setRelativeOrbitTime(13.8471f);
		
		planetFurra.setRelativeSize(0.4319f);
		planetSierra.setRelativeSize(0.5216f);
		planetTango.setRelativeSize(1.054f);
		
		GalaxyRegistry.registerPlanet(planetFurra);
		GalaxyRegistry.registerPlanet(planetSierra);
		GalaxyRegistry.registerPlanet(planetTango);*/
		
		
		
	}
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		GameRegistry.registerBlock(blockRainbow, "rainbow");
        //GalacticraftPlanets.proxy.postInit(event);
    }
	
	@EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
        //GalacticraftPlanets.proxy.serverStarting(event);
    }
}
