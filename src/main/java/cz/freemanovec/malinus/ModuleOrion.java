package cz.freemanovec.malinus;

import java.util.List;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.relauncher.Side;
import cz.freemanovec.malinus.planets.providers.WorldProviderOrion;
import cz.freemanovec.malinus.planets.teleporttypes.TeleportTypeOrion;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.planets.IPlanetsModule;
import micdoodle8.mods.galacticraft.planets.mars.MarsModule;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;

public class ModuleOrion implements IPlanetsModule{
	public static Planet planetOrion;
	
	@Override
	public void init(FMLInitializationEvent event){
		ModuleOrion.planetOrion = (Planet) new Planet("orion").setParentSolarSystem(GalacticraftCore.solarSystemSol).setRingColorRGB(1f, 0f, 0f).setPhaseShift(0.1667f).setRelativeSize(0.2319f).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.15f, 0.15f)).setRelativeOrbitTime(0.01f);
		ModuleOrion.planetOrion.setBodyIcon(new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/gui/celestialbodies/mars.png"));
		ModuleOrion.planetOrion.setDimensionInfo(ConfigurationCLS.dimensionID_orion, WorldProviderOrion.class).setTierRequired(2);
		ModuleOrion.planetOrion.atmosphereComponent(IAtmosphericGas.ARGON).atmosphereComponent(IAtmosphericGas.METHANE);
		
		GalaxyRegistry.registerPlanet(ModuleOrion.planetOrion);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrion.class, new TeleportTypeOrion());
		GalacticraftRegistry.registerRocketGui(WorldProviderOrion.class, new ResourceLocation(MarsModule.ASSET_PREFIX, "textures/gui/marsRocketGui.png"));
		
		Main.log.debug("Orion Module init completed");
	}
	@Override
	public void postInit(FMLPostInitializationEvent event){
		Main.log.debug("Orion Module postInit completed");
	}
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		Main.log.debug("Orion Module preInit completed");
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
