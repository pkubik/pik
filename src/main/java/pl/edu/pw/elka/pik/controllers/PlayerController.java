package pl.edu.pw.elka.pik.controllers;

import org.springframework.web.bind.annotation.*;
import pl.edu.pw.elka.pik.entities.Player;
import pl.edu.pw.elka.pik.services.api.PlayerService;

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

    @RequestMapping(value="/player/{id}", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable(value="id") Long id)
    {
        return playerService.getPlayer(id);
    }

    @RequestMapping(value="/player", method = RequestMethod.POST)
    public Player createPlayer(@RequestBody @Valid final Player player){
        return playerService.save(player);
    }

    @RequestMapping(value="/players", method = RequestMethod.GET)
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @RequestMapping(value="/players/{page},{size}", method = RequestMethod.GET)
    public List<Player> getPlayers(@PathVariable(value="page") int page, @PathVariable(value="size") int size)
    {
        return playerService.getPageOfPlayers(page, size);
    }
}
