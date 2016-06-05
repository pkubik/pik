package pl.edu.pw.elka.pik.repositories;

import pl.edu.pw.elka.pik.entities.Tag;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pkubik.
 */
public class TagRepositoryImpl implements SearchableTagRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Iterable<Tag> searchTags(String keywords) {
        Query query = entityManager.createNativeQuery("SELECT search.id, search.name, search.description\n" +
                "FROM\n" +
                "  (SELECT id, name, description,\n" +
                "   ts_rank(text_search_vector, to_tsquery(?1)) as relevancy\n" +
                "   FROM tag) AS search\n" +
                "WHERE relevancy > 0\n" +
                "ORDER BY relevancy DESC;", Tag.class);

        String transformed = keywords.replaceAll(" ", " | ");
        query.setParameter(1, transformed);
        return query.getResultList();
    }
}
