package pl.edu.pw.elka.pik.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Player Entity
 *
 * @author pkubik
 */
@Entity
public class Player
{
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @NotNull
    private Long id;

    @Column(name = "name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "email", nullable = false)
    @NotNull
    private String email;

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
