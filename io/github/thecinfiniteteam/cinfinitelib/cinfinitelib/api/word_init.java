package io.github.thecinfiniteteam.cinfinitelib.cinfinitelib.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.ITextComponent;

public class word_init {
    public word_init(EntityPlayer entityPlayer, ITextComponent init_text){
        System.out.println("init Cinf-api");
        entityPlayer.sendMessage(init_text);
    }
}
