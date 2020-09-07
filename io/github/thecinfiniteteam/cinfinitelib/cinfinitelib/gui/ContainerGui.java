package io.github.thecinfiniteteam.cinfinitelib.cinfinitelib.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public class ContainerGui extends GuiContainer {
    public ContainerGui(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
    }
}
