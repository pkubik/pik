package pl.edu.pw.elka.pik.entities;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    @NotNull
    private Long id = (long) -1;

    @Column(name = "name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "email", nullable = false)
    @NotNull
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
