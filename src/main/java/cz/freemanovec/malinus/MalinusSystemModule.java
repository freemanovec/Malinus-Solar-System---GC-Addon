package cz.freemanovec.malinus;

import java.util.List;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.relauncher.Side;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.planets.IPlanetsModule;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;

public class MalinusSystemModule implements IPlanetsModule{

	public static SolarSystem solarSystemMalinus;
	public static Star starMalinus;
	public static Planet planetOrion, planetFurra, planetSierra, planetTango;
	public static Moon moonNova, moonRainbow, moonAllegia;
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		Vector3 solarPosition = new Vector3(Vec3.createVectorHelper(-1.3f, 0, 0));
		solarSystemMalinus = new SolarSystem("malinus", "milkyWay").setMapPosition(solarPosition);
		
		starMalinus = (Star) new Star("malinus").setParentSolarSystem(solarSystemMalinus).setTierRequired(-1);
		starMalinus.setBodyIcon(new ResourceLocation(References.MOD_ID, "/textures/gui/celestialbodies/malinus.png"));
		
		solarSystemMalinus.setMainStar(starMalinus);
		
		GalaxyRegistry.registerSolarSystem(solarSystemMalinus);
		
		planetOrion = new Planet("orion").setParentSolarSystem(solarSystemMalinus);
		planetFurra = new Planet("furra").setParentSolarSystem(solarSystemMalinus);
		planetSierra = new Planet("sierra").setParentSolarSystem(solarSystemMalinus);
		planetTango = new Planet("tango").setParentSolarSystem(solarSystemMalinus);
		moonNova = new Moon("nova").setParentPlanet(planetFurra);
		moonRainbow = new Moon("rainbow").setParentPlanet(planetTango);
		moonAllegia = new Moon("allegia").setParentPlanet(planetTango);
		
		planetOrion.setBodyIcon(new ResourceLocation(References.MOD_ID, "/textures/gui/celestialbodies/orion.png"));
		planetFurra.setBodyIcon(new ResourceLocation(References.MOD_ID, "/textures/gui/celestialbodies/furra.png"));
		planetSierra.setBodyIcon(new ResourceLocation(References.MOD_ID, "/textures/gui/celestialbodies/sierra.png"));
		planetTango.setBodyIcon(new ResourceLocation(References.MOD_ID, "/textures/gui/celestialbodies/tango.png"));
		moonNova.setBodyIcon(new ResourceLocation(References.MOD_ID, "/textures/gui/celestialbodies/nova.png"));
		moonRainbow.setBodyIcon(new ResourceLocation(References.MOD_ID, "/textures/gui/celestialbodies/rainbow.png"));
		moonAllegia.setBodyIcon(new ResourceLocation(References.MOD_ID, "/textures/gui/celestialbodies/allegia.png"));
		
		planetOrion.setRingColorRGB(1f, 0, 0);
		planetFurra.setRingColorRGB(1f, 1f, 1f);
		planetSierra.setRingColorRGB(1f, 1f, 1f);
		planetTango.setRingColorRGB(1f, 1f, 1f);
		moonNova.setRingColorRGB(1f, 1f, 1f);
		moonRainbow.setRingColorRGB(1f, 1f, 1f);
		moonAllegia.setRingColorRGB(1f, 1f, 1f);
		
		planetOrion.setPhaseShift(1f);
		planetFurra.setPhaseShift(1f);
		planetSierra.setPhaseShift(1f);
		planetTango.setPhaseShift(1f);
		moonNova.setPhaseShift(1f);
		moonRainbow.setPhaseShift(1f);
		moonAllegia.setPhaseShift(1f);
		
		planetOrion.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.5f, 0.5f));
		planetFurra.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.9f, 0.9f));
		planetSierra.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.65f, 1.65f));
		planetTango.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(4.2f, 4.2f));
		moonNova.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(13f, 13f));
		moonRainbow.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(12f, 12f));
		moonAllegia.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(16f, 16f));
		
		planetOrion.setRelativeOrbitTime(0.1606f);
		planetFurra.setRelativeOrbitTime(0.8835f);
		planetSierra.setRelativeOrbitTime(0.8353f);
		planetTango.setRelativeOrbitTime(13.8471f);
		moonNova.setRelativeOrbitTime(100f);
		moonRainbow.setRelativeOrbitTime(86f);
		moonAllegia.setRelativeOrbitTime(124f);
		
		planetOrion.setRelativeSize(0.6f);
		planetFurra.setRelativeSize(1.06f);
		planetSierra.setRelativeSize(0.96f);
		planetTango.setRelativeSize(2.1f);
		moonNova.setRelativeSize(0.28f);
		moonRainbow.setRelativeSize(0.74f);
		moonAllegia.setRelativeSize(0.16f);
		
		planetOrion.setTierRequired(1);
		planetFurra.setTierRequired(1);
		planetSierra.setTierRequired(2);
		planetTango.setTierRequired(3);
		moonNova.setTierRequired(1);
		moonRainbow.setTierRequired(3);
		moonAllegia.setTierRequired(3);
		
		GalaxyRegistry.registerPlanet(planetOrion);
		GalaxyRegistry.registerPlanet(planetFurra);
		GalaxyRegistry.registerPlanet(planetSierra);
		GalaxyRegistry.registerPlanet(planetTango);
		GalaxyRegistry.registerMoon(moonNova);
		GalaxyRegistry.registerMoon(moonRainbow);
		GalaxyRegistry.registerMoon(moonAllegia);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		
	}

	@Override
	public void serverInit(FMLServerStartedEvent event) {
		
	}

	@Override
	public void serverStarting(FMLServerStartingEvent event) {
		
	}

	@Override
	public void getGuiIDs(List<Integer> idList) {
		
	}

	@Override
	public Object getGuiElement(Side side, int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Configuration getConfiguration() {
		return Main.configurationFile;
	}

	@Override
	public void syncConfig() {
		ConfigurationCLS.syncConfig();
	}

}
