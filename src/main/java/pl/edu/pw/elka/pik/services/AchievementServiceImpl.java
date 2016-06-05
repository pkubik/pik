package pl.edu.pw.elka.pik.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pw.elka.pik.entities.Achievement;
import pl.edu.pw.elka.pik.entities.Game;
import pl.edu.pw.elka.pik.repositories.AchievementRepository;
import pl.edu.pw.elka.pik.services.api.AchievementService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Mateusz on 2016-05-31.
 */
@Service
@SuppressWarnings("unused")
public class AchievementServiceImpl implements AchievementService {

    private AchievementRepository achievementRepository;

    @Inject
    public AchievementServiceImpl(AchievementRepository achievementRepository) {
        this.achievementRepository = achievementRepository;
    }

    @Override
    @Transactional
    public Achievement addAchievement(Achievement achievement) {
        return achievementRepository.save(achievement);
    }

    @Override
    public Achievement getAchievement(Long id) {
        return achievementRepository.findOne(id);
    }

    @Override
    public Achievement getAchievement(String achievementName) {
        return achievementRepository.findByName(achievementName);
    }

    @Override
    public List<Achievement> getAchievements(Game game) {
        return achievementRepository.findByGame(game);
    }

    @Override
    public List<Achievement> getAchievements() {
        return (List<Achievement>) achievementRepository.findAll();
    }
}
