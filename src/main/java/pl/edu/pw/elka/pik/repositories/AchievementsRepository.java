package pl.edu.pw.elka.pik.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import pl.edu.pw.elka.pik.entities.Achievement;
import pl.edu.pw.elka.pik.entities.Game;

import java.util.List;

/**
 * Created by Mateusz on 2016-05-31.
 */
public interface AchievementsRepository extends PagingAndSortingRepository<Achievement, Long> {

    Achievement findByName(String name);

    @Query("SELECT a FROM Achievement a WHERE a.game.id = : game.id ")
    List<Achievement> find(Game game);

}
