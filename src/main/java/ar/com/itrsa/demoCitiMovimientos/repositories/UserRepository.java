package ar.com.itrsa.demoCitiMovimientos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.itrsa.demoCitiMovimientos.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

}
