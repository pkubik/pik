package pl.edu.pw.elka.pik.services;

import pl.edu.pw.elka.pik.EntityObjects.User;

import java.util.List;

/**
 * @author mzaremba
 */
public interface UserService
{
    User save(User user);
    List<User> getUsers();
}
