package by.naxa.stackoverfow.swaggerapiresponses.web;

import by.naxa.stackoverfow.swaggerapiresponses.web.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@DefaultApiResponses
@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/{id:\\d+}")
    public User getUser(@PathVariable Integer id) {
        if (id > 0)
            return new User(id);
        else
            throw new ResourceNotFoundException();
    }

    @GetMapping
    public List<User> listUsers() {
        return Arrays.asList(new User(1), new User(2));
    }

}
