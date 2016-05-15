package pl.edu.pw.elka.pik.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pw.elka.pik.entities.Player;
import pl.edu.pw.elka.pik.services.PlayerService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

/**
 * @author mzaremba
 */
@RestController
@SuppressWarnings( "unused" )
public class PlayerController
{

    private final PlayerService playerService;

    @Inject
    public PlayerController(PlayerService playerService)
    {
        this.playerService = playerService;
    }

    @RequestMapping(value="/player", method = RequestMethod.POST)
    public Player createPlayer(@RequestBody @Valid final Player player){
        return playerService.save(player);
    }

    @RequestMapping(value="/player", method = RequestMethod.GET)
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }
}
