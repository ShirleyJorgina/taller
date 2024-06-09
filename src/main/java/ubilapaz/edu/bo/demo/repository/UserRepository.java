package ubilapaz.edu.bo.demo.repository;

import org.springframework.stereotype.Repository;
import ubilapaz.edu.bo.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}