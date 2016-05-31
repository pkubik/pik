package pl.edu.pw.elka.pik.repositories;

import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.edu.pw.elka.pik.entities.Tag;

import java.util.List;

/**
 * @author pkubik.
 */
public interface TagRepository extends JpaRepository<Tag, Long>
{
    List<Tag> searchTags(String keywords);
}
