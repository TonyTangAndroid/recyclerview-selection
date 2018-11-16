package com.androidkt.recyclerviewselection.adapter;

import com.androidkt.recyclerviewselection.model.Item;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.selection.ItemKeyProvider;

/**
 * Created by brijesh on 27/3/18.
 */
public class MyItemKeyProvider extends ItemKeyProvider<Long> {
    private final List<Item> itemList;

    public MyItemKeyProvider(int scope, List<Item> itemList) {
        super(scope);
        this.itemList = itemList;
    }

    @Nullable
    @Override
    public Long getKey(int position) {
        return itemList.get(position).getItemId();
    }

    @Override
    public int getPosition(@NonNull Long key) {
        return itemList.indexOf(new Item(key));
    }
}
