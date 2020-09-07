package io.github.thecinfiniteteam.cinfinitelib.cinfinitelib.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class Container_canInteractWith extends Container {
    public Container_canInteractWith(EntityPlayer player) {
        super();
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}

