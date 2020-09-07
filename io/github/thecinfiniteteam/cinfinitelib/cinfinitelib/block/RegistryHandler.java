package io.github.thecinfiniteteam.cinfinitelib.cinfinitelib.block;

import io.github.thecinfiniteteam.cinfinitelib.cinfinitelib.item.ItemHandler;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        //event.getRegistry().registerAll(BlockHandler.blocks.toArray(new Block[0]));
        /*for (int i = 0; i < BlockHandler.blocks.size()+1; i++){
            event.getRegistry().register(BlockHandler.blocks.get(i));
        }*/
    }
}
