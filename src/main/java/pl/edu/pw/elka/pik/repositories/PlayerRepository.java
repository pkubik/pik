package pl.edu.pw.elka.pik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pw.elka.pik.entities.Player;

import java.util.List;

/**
 * @author pkubik
 */
public interface PlayerRepository extends JpaRepository<Player, Long>
{

}