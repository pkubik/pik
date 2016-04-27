package pl.edu.pw.elka.pik.EntityObjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * User Entity
 *
 * @author mzaremba
 */
@Entity
public class User
{
    @Id
    @Column( name = "id", nullable = false, updatable = false)
    @NotNull
    @Size(max = 64)
    private String id;

    @Column( name = "password", nullable = false)
    @NotNull
    @Size(max = 64)
    private String name;

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
