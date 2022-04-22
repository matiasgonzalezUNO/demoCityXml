package ar.com.itrsa.demoCitiMovimientos.controllers;

import ar.com.itrsa.demoCitiMovimientos.models.Movimientos;
import ar.com.itrsa.demoCitiMovimientos.services.MovimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/homebanking")
public class MovimientosController {

    @Autowired
    MovimientosService movimientosService;

    @GetMapping(value = "/movimientos/{id}", produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Movimientos>> list(@PathVariable("id") Integer id) {
        List<Movimientos> list = movimientosService.list(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
