package return7.boardbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import return7.boardbackend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
