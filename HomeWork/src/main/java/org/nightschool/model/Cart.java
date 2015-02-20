package org.nightschool.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Cart {

    private final ArrayList<Items> m_items = new ArrayList<>();

    public List<Items> getItems() {
        return m_items;
    }

    public void addItem(Items it) {
        m_items.add(it);
    }

    public int countKinds() {
        HashSet<Items> diskSet = new HashSet<>();

        for (Items it: m_items) {
            diskSet.add(it);
        }

        return diskSet.size();
    }

    public void removeItem(Items it) {
        int count = 0;
        for (Items i : m_items) {
            if (i.equals(it)) {
                count++;
            }
        }

        int i=0;
        while (i<count){
            m_items.remove(it);
            i++;
        }
    }
}
