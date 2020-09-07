package io.github.thecinfiniteteam.cinfinitelib.cinfinitelib.item;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        //event.getRegistry().registerAll(ItemHandler.items.toArray(new Item[0]));
        /*for (int i = 0;i < ItemHandler.items.size()+1;i++){
            event.getRegistry().register(ItemHandler.items.get(i));
        }
        */
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : ItemHandler.items){
            if(item instanceof ItemHandler.IHasModel){
                ((ItemHandler.IHasModel)item).registerModel();
            }
        }
    }
}
