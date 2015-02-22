package org.nightschool.service;

import org.nightschool.model.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twer on 12/14/14.
 */
public class ItemServcie {

    private final List itemList = new ArrayList();

    public List<Items> listItems() {
        return itemList;
    }

    public void add(Items it) {
        itemList.add(it);
    }
}
