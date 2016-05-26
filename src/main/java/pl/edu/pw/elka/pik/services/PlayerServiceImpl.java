package pl.edu.pw.elka.pik.services;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pw.elka.pik.entities.Player;
import pl.edu.pw.elka.pik.repositories.PlayerRepository;

import javax.inject.Inject;
import java.util.List;

/**
 * @author mzaremba
 */
@Service
@SuppressWarnings( "unused" )
public class PlayerServiceImpl implements PlayerService
{

    private final PlayerRepository repository;

    @Inject
    public PlayerServiceImpl(PlayerRepository repository )
    {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Player save(Player player)
    {
        return repository.save(player);
    }

    @Override
    public Player getPlayer(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Player> getPlayers()
    {
        return repository.findAll();
    }

    public List<Player> getPageOfPlayers(int page, int size) {
        return repository.findAll(new PageRequest(page, size)).getContent();
    }
}
