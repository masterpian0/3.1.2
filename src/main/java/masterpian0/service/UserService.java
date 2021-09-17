package masterpian0.service;

import masterpian0.model.User;

public interface UserService {

    void createUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    Iterable<User> getUsers();
}
