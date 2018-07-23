package com.androidkt.recyclerviewselection.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.androidkt.recyclerviewselection.model.Item;

import java.util.List;

import androidx.recyclerview.selection.ItemKeyProvider;

/**
 * Created by brijesh on 27/3/18.
 */

public class MyItemKeyProvider extends ItemKeyProvider {
    private final List<Item> itemList;

    public MyItemKeyProvider(int scope, List<Item> itemList) {
        super(scope);
        this.itemList = itemList;
    }

    @Nullable
    @Override
    public Object getKey(int position) {
        return itemList.get(position);
    }

    @Override
    public int getPosition(@NonNull Object key) {
        return itemList.indexOf(key);
    }
}
