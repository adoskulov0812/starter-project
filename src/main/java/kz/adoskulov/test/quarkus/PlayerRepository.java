package kz.adoskulov.test.quarkus;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import kz.adoskulov.test.quarkus.model.Player;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PlayerRepository implements PanacheRepository<Player> {

}
