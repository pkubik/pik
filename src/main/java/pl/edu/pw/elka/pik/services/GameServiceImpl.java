package pl.edu.pw.elka.pik.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pw.elka.pik.entities.Game;
import pl.edu.pw.elka.pik.repositories.GameRepository;
import pl.edu.pw.elka.pik.services.api.GameService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Mateusz on 2016-05-31.
 */
@Service
public class GameServiceImpl implements GameService {

    @Inject
    GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    @Transactional
    public Game save(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Game getGame(Long id) {
        return gameRepository.findOne(id);
    }

    @Override
    public Game getGame(String gameName) {
        return gameRepository.findByName(gameName);
    }

    @Override
    public List<Game> getGames() {
        return (List<Game>) gameRepository.findAll();
    }
}
