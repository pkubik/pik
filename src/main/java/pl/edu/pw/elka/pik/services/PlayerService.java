package pl.edu.pw.elka.pik.services;

import pl.edu.pw.elka.pik.entities.Player;

import java.util.List;

/**
 * @author pkubik
 */
public interface PlayerService
{
    Player save(Player user);
    Player getPlayer(Long id);
    List<Player> getPlayers();
    List<Player> getPageOfPlayers(int page, int size);
}
