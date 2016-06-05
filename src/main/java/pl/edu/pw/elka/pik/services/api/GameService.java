package pl.edu.pw.elka.pik.services.api;

import pl.edu.pw.elka.pik.entities.Game;

import java.util.List;

/**
 * Created by Mateusz on 2016-05-31.
 */
public interface GameService {

    Game save(Game game);

    Game getGame(Long id);

    Game getGame(String gameName);

    List<Game> getGames();

}
