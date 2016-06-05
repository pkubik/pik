package pl.edu.pw.elka.pik.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import pl.edu.pw.elka.pik.entities.Achievement;
import pl.edu.pw.elka.pik.entities.Game;

import java.util.List;

/**
 * Created by Mateusz on 2016-05-31.
 */
public interface AchievementRepository extends PagingAndSortingRepository<Achievement, Long> {

    Achievement findByName(String name);

    List<Achievement> findByGame(Game game);

}
