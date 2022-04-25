package ar.com.itrsa.demoCitiMovimientos.repositories;

import ar.com.itrsa.demoCitiMovimientos.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
