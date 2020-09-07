package io.github.thecinfiniteteam.cinfinitelib.cinfinitelib.potion;

import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onPotionRegistration(RegistryEvent.Register<Potion> event) {
        //event.getRegistry().registerAll(new MyNewPotion().setRegistryName("my_mod", "my_potion"));
        /*for (int i = 0;i>PotionHandler.potions.size()+1;i++){
            event.getRegistry().register(PotionHandler.potions.get(i));
        }*/
    }
}
