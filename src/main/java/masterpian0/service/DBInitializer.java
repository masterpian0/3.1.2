package masterpian0.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import masterpian0.model.Role;
import masterpian0.model.User;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
@Transactional
public class DBInitializer {

    private UserService userService;

    public DBInitializer(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void initUsers() {
        User admin = new User();
        admin.setName("admin");
        admin.setLastName("admin");
        admin.setAge(35);
        admin.setEmail("admin@mail.ru");
        admin.setPassword("admin");
        admin.setRoles(Set.of(new Role("ADMIN")));
        userService.createUser(admin);

        User user = new User();
        user.setName("user");
        user.setLastName("user");
        user.setAge(30);
        user.setEmail("user@mail.ru");
        user.setPassword("user");
        user.setRoles(Set.of(new Role("USER")));
        userService.createUser(user);
    }
}
