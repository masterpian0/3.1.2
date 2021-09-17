package masterpian0.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import masterpian0.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
