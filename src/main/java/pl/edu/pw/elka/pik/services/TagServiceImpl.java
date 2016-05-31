package pl.edu.pw.elka.pik.services;

import org.springframework.stereotype.Service;
import pl.edu.pw.elka.pik.entities.Tag;
import pl.edu.pw.elka.pik.repositories.TagRepository;

import javax.inject.Inject;
import java.util.List;

/**
 * @author pkubik.
 */
@Service
public class TagServiceImpl implements TagService {

    private final TagRepository repository;

    @Inject
    public TagServiceImpl(TagRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public Tag getTag(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Tag> searchTags(String query) {
        List<Tag> res = (List<Tag>) repository.searchTags(query);
        return res;
    }
}
