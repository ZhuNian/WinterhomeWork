package org.nightschool.model;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CartTest {
    @Test
    public void should_count_kinds() throws Exception {
        Cart cart = new Cart();

        assertThat(cart.countKinds(),is(0));

    }

    @Test
    public void should_add_item() throws Exception {
        Items it =  new Items("小清新","..//image1.jpg","hello",1.1,"包邮");
        Items it2 =  new Items("小清新","..//image1.jpg","hello",1.1,"包邮");
        Cart cart = new Cart();

        cart.addItem(it);
        cart.addItem(it2);


        assertThat(cart.countKinds() ,is(1));
    }



    @Test
    public void should_remove_item() throws Exception {
        Cart cart = new Cart();
        assertThat(cart.countKinds(),is(0));

        Items items1 = new Items("小清新","..//image1.jpg","hello",1.1,"包邮");
        Items items2 = new Items("小清新1","..//image1.jpg","hello",1.1,"包邮");
        Items items3 = new Items("小清新2","..//image1.jpg","hello",1.1,"包邮");
        Items items4 = new Items("小清新3","..//image1.jpg","hello",1.1,"包邮");
        Items items5 = new Items("小清新","..//image1.jpg","hello",1.1,"包邮");

        cart.addItem(items1);
        cart.addItem(items2);
        cart.addItem(items3);
        cart.addItem(items4);
        cart.addItem(items5);

        assertThat(cart.countKinds(), is(4));

        cart.removeItem(items1);
        cart.removeItem(items2);
        assertThat(cart.countKinds(),is(2));
    }
}