package masterpian0.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import masterpian0.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
