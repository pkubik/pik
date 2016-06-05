package pl.edu.pw.elka.pik.services;

import org.springframework.transaction.annotation.Transactional;
import pl.edu.pw.elka.pik.entities.Achievement;
import pl.edu.pw.elka.pik.entities.Game;
import pl.edu.pw.elka.pik.repositories.AchievementsRepository;
import pl.edu.pw.elka.pik.services.api.AchievementService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Mateusz on 2016-05-31.
 */
public class AchievementServiceImpl implements AchievementService {

    @Inject
    private AchievementsRepository achievementsRepository;

    public AchievementServiceImpl(AchievementsRepository achievementsRepository) {
        this.achievementsRepository = achievementsRepository;
    }

    @Override
    @Transactional
    public Achievement addAchievement(Achievement achievement) {
        return achievementsRepository.save(achievement);
    }

    @Override
    public Achievement getAchievement(Long id) {
        return achievementsRepository.findOne(id);
    }

    @Override
    public Achievement getAchievement(String achievementName) {
        return achievementsRepository.findByName(achievementName);
    }

    @Override
    public List<Achievement> getAchievements(Game game) {
        return achievementsRepository.find(game);
    }

    @Override
    public List<Achievement> getAchievements() {
        return (List<Achievement>) achievementsRepository.findAll();
    }
}
