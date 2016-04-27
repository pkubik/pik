package pl.edu.pw.elka.pik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pw.elka.pik.EntityObjects.User;

/**
 * @author mzaremba
 */
public interface UserRepository extends JpaRepository<User, String>
{

}
