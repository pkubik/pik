package pl.edu.pw.elka.pik.services;

import pl.edu.pw.elka.pik.entities.Tag;

import java.util.List;

/**
 * @author pkubik.
 */
public interface TagService {
    Tag getTag(Long id);
    List<Tag> searchTags(String query);
}
