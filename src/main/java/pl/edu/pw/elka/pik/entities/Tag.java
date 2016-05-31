package pl.edu.pw.elka.pik.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Player Entity
 *
 * @author pkubik
 */
@Entity
@NamedNativeQuery(
        name = "Tag.searchTags",
        query = "SELECT search.id, search.name, search.description\n" +
                "FROM\n" +
                "  (SELECT id, name, description,\n" +
                "   ts_rank(text_search_vector, to_tsquery(?1)) as relevancy\n" +
                "   FROM tag) AS search\n" +
                "WHERE relevancy > 0\n" +
                "ORDER BY relevancy DESC;",
        resultClass = Tag.class)
public class Tag
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    @NotNull
    private Long id = (long) -1;

    @Column(name = "name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "description")
    private String description;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
