package ar.com.itrsa.demoCitiMovimientos.services;

import ar.com.itrsa.demoCitiMovimientos.models.Movimientos;
import ar.com.itrsa.demoCitiMovimientos.repositories.MovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovimientosService {

    @Autowired
    MovimientosRepository movimientosRepository;

    public List<Movimientos> list(Integer id) {
        return movimientosRepository.findByUserId(id);
    }
}
