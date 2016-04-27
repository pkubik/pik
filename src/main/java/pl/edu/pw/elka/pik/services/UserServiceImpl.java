package pl.edu.pw.elka.pik.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pw.elka.pik.EntityObjects.User;
import pl.edu.pw.elka.pik.repositories.UserRepository;

import javax.inject.Inject;
import java.util.List;

/**
 * @author mzaremba
 */
@Service
@SuppressWarnings( "unused" )
public class UserServiceImpl implements UserService
{

    private final UserRepository repository;

    @Inject
    public UserServiceImpl( UserRepository repository )
    {
        this.repository = repository;
    }

    @Override
    @Transactional
    public User save( User user )
    {
        return repository.save( user );
    }

    @Override
    public List<User> getUsers()
    {
        return repository.findAll();
    }
}
