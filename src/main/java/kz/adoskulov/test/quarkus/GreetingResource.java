package kz.adoskulov.test.quarkus;

import io.smallrye.mutiny.Uni;
import kz.adoskulov.test.quarkus.model.Player;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class GreetingResource {

    @Inject
    PlayerRepository playerRepository;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get_all_players")
    public Uni<List<Player>> getAllPlayers() {
        return playerRepository.findAll().list();
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello 123 from RESTEasy Reactive";
    }
}