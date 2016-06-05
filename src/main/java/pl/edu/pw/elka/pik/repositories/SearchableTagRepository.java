package pl.edu.pw.elka.pik.repositories;

import pl.edu.pw.elka.pik.entities.Tag;

/**
 * @author pkubik.
 */
public interface SearchableTagRepository {
    Iterable<Tag> searchTags(String keywords);
}
