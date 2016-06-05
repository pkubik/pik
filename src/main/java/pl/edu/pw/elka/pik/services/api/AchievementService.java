package pl.edu.pw.elka.pik.services.api;

import pl.edu.pw.elka.pik.entities.Achievement;
import pl.edu.pw.elka.pik.entities.Game;

import java.util.List;

/**
 * Created by Mateusz on 2016-05-31.
 */
public interface AchievementService {

    Achievement addAchievement(Achievement achievement);

    Achievement getAchievement(Long id);

    Achievement getAchievement(String achievementName);

    List<Achievement> getAchievements(Game game);

    List<Achievement> getAchievements();


}
