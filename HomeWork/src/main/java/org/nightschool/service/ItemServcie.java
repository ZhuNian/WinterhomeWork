package org.nightschool.service;

import org.nightschool.model.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twer on 12/14/14.
 */
public class ItemServcie {

    private final List itemsList = new ArrayList();

    public List<Items> listItems() {
        return itemsList;
    }

    public void add(Items it) {
        itemsList.add(it);
    }
}
