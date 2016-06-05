package pl.edu.pw.elka.pik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pw.elka.pik.entities.Tag;

/**
 * @author pkubik.
 */
public interface TagRepository extends JpaRepository<Tag, Long>, SearchableTagRepository
{
}
