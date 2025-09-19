package org.offline.caffe.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/games")
public class GamesResource {

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int getGamesCount(){
        return 0;
    }
}
