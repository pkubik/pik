package pl.edu.pw.elka.pik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.edu.pw.elka.pik.entities.Game;
import pl.edu.pw.elka.pik.services.api.GameService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Mateusz on 2016-06-04.
 */
@Controller
@RequestMapping("/game")
@SuppressWarnings("unused")
public class GameController {

    @Inject
    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping(value="/all", method = RequestMethod.GET)
    List<Game> getGames(){
        return gameService.getGames();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    Game addGame(@RequestBody @Valid final Game game){
        return gameService.save(game);
    }

}
