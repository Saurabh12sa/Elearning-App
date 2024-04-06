package in.saurabhit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

import in.saurabhit.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>  {

}
