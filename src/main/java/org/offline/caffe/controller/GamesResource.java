package org.offline.caffe.controller;

import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/games")
public class GamesResource {

    @Authenticated
    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int getGamesCount(){
        return 0;
    }
}
