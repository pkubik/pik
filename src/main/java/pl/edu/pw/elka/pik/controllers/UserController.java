package pl.edu.pw.elka.pik.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pw.elka.pik.EntityObjects.User;
import pl.edu.pw.elka.pik.services.UserService;

import javax.inject.Inject;
import javax.validation.Valid;

/**
 * @author mzaremba
 */
@RestController
@SuppressWarnings( "unused" )
public class UserController
{

    private final UserService userService;

    @Inject
    public UserController( UserService userService )
    {
        this.userService = userService;
    }

    @RequestMapping(value="/user", method = RequestMethod.POST)
    public User createUser(@RequestBody @Valid final User user){
        return userService.save(user);
    }
}
