package ar.com.itrsa.demoCitiMovimientos.repositories;

import ar.com.itrsa.demoCitiMovimientos.models.Movimientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientosRepository extends JpaRepository<Movimientos, Long> {

}
