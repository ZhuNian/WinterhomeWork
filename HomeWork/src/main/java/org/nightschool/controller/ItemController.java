package org.nightschool.controller;

import org.nightschool.model.Items;
import org.nightschool.service.ItemServcie;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by twer on 12/14/14.
 */
@Path("/disks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemController {

    private final ItemServcie itemServcie = new ItemServcie();

    @GET
    @Path("list")
    public List<Items> list() {
        return itemServcie.listItems();
    }

    @POST
    @Path("add")
    public Items add(Items disk) {
        itemServcie .add(disk);
        return disk;
    }
}
