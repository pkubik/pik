package pl.edu.pw.elka.pik.services;

import pl.edu.pw.elka.pik.entities.Player;

import java.util.List;

/**
 * @author pkubik
 */
public interface PlayerService
{
    Player save(Player user);
    List<Player> getPlayers();
}
