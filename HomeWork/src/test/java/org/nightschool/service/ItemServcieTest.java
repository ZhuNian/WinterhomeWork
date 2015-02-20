package org.nightschool.service;

import org.junit.Before;
import org.junit.Test;
import org.nightschool.model.Items;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemServcieTest {
    private ItemServcie diskServcie;

    @Before
    public void setUp() throws Exception {
        diskServcie = new ItemServcie();
    }

    @Test
    public void test_list_disks_is_empty() throws Exception {
        List<Items> disks = diskServcie.listItems();
        assertThat(disks.size(), is(0));
    }

    @Test
    public void test_list_disk_is_non_empty_after_add_a_disk() throws Exception {
        Items disk = new Items("diskname", "diksimage", "diskdesc",1.1,"fa");
        diskServcie.add(disk);
        assertThat(diskServcie.listItems().size(), is(1));
    }

}