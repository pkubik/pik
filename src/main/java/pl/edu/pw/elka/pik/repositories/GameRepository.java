package pl.edu.pw.elka.pik.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.edu.pw.elka.pik.entities.Game;

/**
 * Created by Mateusz on 2016-05-31.
 */
public interface GameRepository extends PagingAndSortingRepository<Game, Long> {

    Game findByName(String gameName);

}
