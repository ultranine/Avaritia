package fox.spiteful.avaritia.compat;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import fox.spiteful.avaritia.Lumberjack;
import fox.spiteful.avaritia.blocks.LudicrousBlocks;
import fox.spiteful.avaritia.crafting.Grinder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Level;

public class Compat {

    public static boolean nei = false;
    public static boolean thaumic = false;
    public static boolean sc2 = false;
    public static boolean ae2 = false;
    public static boolean exu = false;
    public static boolean ic2 = false;
    public static boolean gt = false;
    public static boolean botan = false;
    public static boolean blood = false;
    public static boolean lolDargon = false;
    public static boolean bigReactors = false;
    public static boolean ticon = false;

    public static void census(){
        nei = Loader.isModLoaded("NotEnoughItems");
        thaumic = Loader.isModLoaded("Thaumcraft");
        sc2 = Loader.isModLoaded("StevesCarts");
        ae2 = Loader.isModLoaded("appliedenergistics2");
        exu = Loader.isModLoaded("ExtraUtilities");
        ic2 = Loader.isModLoaded("IC2");
        gt = Loader.isModLoaded("gregtech");
        botan = Loader.isModLoaded("Botania");
        blood = Loader.isModLoaded("AWWayofTime");
        lolDargon = Loader.isModLoaded("DraconicEvolution");
        bigReactors = Loader.isModLoaded("BigReactors");
        ticon = Loader.isModLoaded("TConstruct");
    }

    public static void compatify(){
        if(nei){
            try
            {
                Class<?> handler = Class.forName("fox.spiteful.avaritia.compat.ExtremeShapedRecipeHandler");
                Class<?> handler2 = Class.forName("fox.spiteful.avaritia.compat.ExtremeShapelessRecipeHandler");
                Class<?> api = Class.forName("codechicken.nei.api.API");
                api.getMethod("registerRecipeHandler", Class.forName("codechicken.nei.recipe.ICraftingHandler")).invoke(null, handler.newInstance());
                api.getMethod("registerUsageHandler", Class.forName("codechicken.nei.recipe.IUsageHandler")).invoke(null, handler.newInstance());
                api.getMethod("registerRecipeHandler", Class.forName("codechicken.nei.recipe.ICraftingHandler")).invoke(null, handler2.newInstance());
                api.getMethod("registerUsageHandler", Class.forName("codechicken.nei.recipe.IUsageHandler")).invoke(null, handler2.newInstance());
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        if(thaumic){
            try
            {
                Lucrum.abracadabra();
            }
            catch(Throwable e){
                Lumberjack.log(Level.INFO, "Avaritia accumulated too much Warp!");
                e.printStackTrace();
                thaumic = false;
            }
        }

        if(sc2){
            try {
                Block resource = getBlock("StevesCarts", "BlockMetalStorage");
                ItemStack galg = new ItemStack(resource, 1, 2);
                Grinder.catalyst.recipeItems.add(galg);
            }
            catch(Exception e){
                Lumberjack.log(Level.INFO, "Avaritia died of old age while trying to craft the Galgadorian Drill.");
                e.printStackTrace();
                sc2 = false;
            }
        }

        if(ae2){
            try {
                Item resource = getItem("appliedenergistics2", "item.ItemMultiMaterial");
                ItemStack cell = new ItemStack(resource, 1, 38);
                ItemStack singularity = new ItemStack(resource, 1, 47);
                Grinder.catalyst.recipeItems.add(cell);
                Grinder.catalyst.recipeItems.add(singularity);
            }
            catch (Exception e){
                Lumberjack.log(Level.INFO, "Avaritia couldn't figure out how channels work.");
                e.printStackTrace();
                ae2 = false;
            }
        }

        if(exu){
            try {
                Block bedrockium = getBlock("ExtraUtilities", "block_bedrockium");
                Block deco = getBlock("ExtraUtilities", "decorativeBlock1");
                ItemStack bed = new ItemStack(bedrockium, 1, 0);
                ItemStack unstable = new ItemStack(deco, 1, 5);
                Grinder.catalyst.recipeItems.add(bed);
                Grinder.catalyst.recipeItems.add(unstable);
            }
            catch (Exception e){
                Lumberjack.log(Level.INFO, "Avaritia was unable to stop Lavos.");
                e.printStackTrace();
                exu = false;
            }
        }

        if(ic2){
            try {
                if(gt){
                    try {
                        Block resource = getBlock("gregtech", "gt.meta.storage.ingot");
                        ItemStack osmir = new ItemStack(resource, 1, 8682);
                        Grinder.catalyst.recipeItems.add(osmir);
                    }
                    catch(Exception e){
                        Lumberjack.log(Level.INFO, "Avaritia got sick of only getting 2 planks per log.");
                        e.printStackTrace();
                        gt = false;
                    }
                }

                if(!gt){
                    Item iridium = getItem("IC2", "itemPartIridium");
                    ItemStack plate = new ItemStack(iridium, 1, 0);
                    Grinder.catalyst.recipeItems.add(plate);
                }
            }
            catch (Exception e){
                Lumberjack.log(Level.INFO, "Avaritia blew up the macerator.");
                e.printStackTrace();
                ic2 = false;
            }
        }

        if(botan){
            try {
                Tsundere.baka();
            }
            catch (Exception e){
                Lumberjack.log(Level.INFO, "Avaritia is wondering where all the dayblooms went.");
                e.printStackTrace();
                botan = false;
            }
        }

        if(blood){
            try {
                Block crystal = getBlock("AWWayofTime", "blockCrystal");
                ItemStack cluster = new ItemStack(crystal, 1, 0);
                Grinder.catalyst.recipeItems.add(cluster);
            }
            catch (Exception e){
                Lumberjack.log(Level.INFO, "Avaritia decided to use a Fallen Kanade instead.");
                e.printStackTrace();
                blood = false;
            }
        }

        if(lolDargon){
            try {
                Block dargon = getBlock("DraconicEvolution", "draconicBlock");
                ItemStack lol = new ItemStack(dargon, 1, 0);
                Grinder.catalyst.recipeItems.add(lol);
            }
            catch (Exception e){
                Lumberjack.log(Level.INFO, "Avaritia was distracted by a giant glowing sphere.");
                e.printStackTrace();
                lolDargon = false;
            }
        }

        if(bigReactors){
            try {
                Item ingot = getItem("BigReactors", "BRIngot");
                ItemStack ludicrite = new ItemStack(ingot, 1, 8);
                Grinder.catalyst.recipeItems.add(ludicrite);
            }
            catch (Exception e){
                Lumberjack.log(Level.INFO, "Avaritia was distracted by a giant glowing sphere.");
                e.printStackTrace();
                lolDargon = false;
            }
        }

        if(ticon){
            try {
                Block metal = getBlock("TConstruct", "MetalBlock");
                ItemStack menomena = new ItemStack(metal, 1, 2);
                Grinder.catalyst.recipeItems.add(menomena);
            }
            catch (Exception e){
                Lumberjack.log(Level.INFO, "Avaritia fell in the smeltery.");
                e.printStackTrace();
                lolDargon = false;
            }
        }
    }

    public static Block getBlock(String mod, String block) throws ItemNotFoundException {
        Block target = GameRegistry.findBlock(mod, block);
        if(target == null)
            throw new ItemNotFoundException(mod, block);
        return target;
    }

    public static Item getItem(String mod, String item) throws ItemNotFoundException {
        Item target = GameRegistry.findItem(mod, item);
        if(target == null)
            throw new ItemNotFoundException(mod, item);
        return target;
    }

    public static class ItemNotFoundException extends Exception {
        public ItemNotFoundException(String mod, String item){
            super("Unable to find " + item + " in mod " + mod + "! Are you using the correct version of the mod?");
        }
    }
}