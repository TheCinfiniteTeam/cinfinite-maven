package io.github.thecinfiniteteam.cinfinitelib.cinfinitelib.item;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public static final List<Item> items = new ArrayList<Item>();
    public interface IHasModel {
        public void registerModel();
    }
}