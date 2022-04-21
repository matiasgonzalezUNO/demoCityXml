package ar.com.itrsa.demoCitiMovimientos.dataseed;

import ar.com.itrsa.demoCitiMovimientos.models.Movimientos;
import ar.com.itrsa.demoCitiMovimientos.repositories.MovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    MovimientosRepository movimientosRepository;

    Date utilDate1 = new Date();
    Date utilDate2 = new Date();

    @Override
    public void run(String... args) throws Exception {
        loadMovimientosData();
    }

    private void loadMovimientosData() throws ParseException {
        if(movimientosRepository.count() == 0) {
            Movimientos movimientos1 = new Movimientos(1L, utilDate1 ,"Retiro de efectivo",10000);
            Movimientos movimientos2 = new Movimientos(2L, utilDate2,"Transferencia inmediata",20000);

            movimientos1.setUtilDate(new SimpleDateFormat("yyyy-MM-dd").parse("2022-3-31"));
            movimientos1.setUtilDate(new SimpleDateFormat("yyyy-MM-dd").parse("2022-3-20"));

            movimientosRepository.save(movimientos1);
            movimientosRepository.save(movimientos2);
        }
        System.out.println("Movimientos agregados por el seed data: " + movimientosRepository.count());
    }
}
