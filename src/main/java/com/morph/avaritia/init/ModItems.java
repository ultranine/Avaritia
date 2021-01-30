package com.morph.avaritia.init;

import com.morph.avaritia.item.ItemResource;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    // Resources
    public static final RegistryObject<Item> DIAMOND_LATTICE = RegistryHandler.ITEMS.register("diamond_lattice", ItemResource::new);
    public static final RegistryObject<Item> CRYSTAL_MATRIX_INGOT = RegistryHandler.ITEMS.register("crystal_matrix_ingot", ItemResource::new);
    public static final RegistryObject<Item> NEUTRON_PILE = RegistryHandler.ITEMS.register("neutron_pile", ItemResource::new);
    public static final RegistryObject<Item> NEUTRON_NUGGET = RegistryHandler.ITEMS.register("neutron_nugget", ItemResource::new);
    public static final RegistryObject<Item> NEUTRONIUM_INGOT = RegistryHandler.ITEMS.register("neutronium_ingot", ItemResource::new);
    public static final RegistryObject<Item> INFINITY_CATALYST = RegistryHandler.ITEMS.register("infinity_catalyst", ItemResource::new);
    public static final RegistryObject<Item> INFINITY_INGOT = RegistryHandler.ITEMS.register("infinity_ingot", ItemResource::new);
    public static final RegistryObject<Item> RECORD_FRAGMENT = RegistryHandler.ITEMS.register("record_fragment", ItemResource::new);

    static void register() {}
}
