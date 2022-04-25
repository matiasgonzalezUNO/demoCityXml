package ar.com.itrsa.demoCitiMovimientos.dataseed;

import ar.com.itrsa.demoCitiMovimientos.models.Movimientos;
import ar.com.itrsa.demoCitiMovimientos.models.Users;
import ar.com.itrsa.demoCitiMovimientos.repositories.MovimientosRepository;
import ar.com.itrsa.demoCitiMovimientos.repositories.UserRepository;
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

    @Autowired
    UserRepository userRepository;

    Date utilDate1 = new Date();
    Date utilDate2 = new Date();

    @Override
    public void run(String... args) throws Exception {
        loadUsers();
        loadMovimientosData();
    }

    private void loadUsers() throws ParseException {
        if(userRepository.count() == 0) {
            Users User1 = new Users("Matias Gonzalez",10);
            Users User2 = new Users("Andres Juarez",20);

            userRepository.save(User1);
            userRepository.save(User2);
        }
        System.out.println("Users agregados por el seed data: " + userRepository.count());
    }

    private void loadMovimientosData() throws ParseException {
        if(movimientosRepository.count() == 0) {

            Users User1 = userRepository.getById(1);
            Users User2 = userRepository.getById(2);

            Movimientos movimientos1 = new Movimientos(utilDate1 ,"Retiro de efectivo",10000,User1);
            Movimientos movimientos2 = new Movimientos(utilDate2,"Transferencia inmediata",20000,User1);
            Movimientos movimientos3 = new Movimientos(utilDate1 ,"Retiro de efectivo",500,User2);
            Movimientos movimientos4 = new Movimientos(utilDate2,"Compa Mcdonal",2000,User2);
            Movimientos movimientos5 = new Movimientos(utilDate1 ,"Transferencia inmediata",100000,User2);
            Movimientos movimientos6 = new Movimientos(utilDate2,"Transferencia inmediata",999,User2);

            movimientos1.setUtilDate(new SimpleDateFormat("yyyy-MM-dd").parse("2022-3-31"));
            movimientos2.setUtilDate(new SimpleDateFormat("yyyy-MM-dd").parse("2022-3-20"));
            movimientos3.setUtilDate(new SimpleDateFormat("yyyy-MM-dd").parse("2021-3-31"));
            movimientos4.setUtilDate(new SimpleDateFormat("yyyy-MM-dd").parse("2021-3-20"));
            movimientos5.setUtilDate(new SimpleDateFormat("yyyy-MM-dd").parse("2021-5-15"));
            movimientos6.setUtilDate(new SimpleDateFormat("yyyy-MM-dd").parse("2021-5-16"));

            movimientosRepository.save(movimientos1);
            movimientosRepository.save(movimientos2);
            movimientosRepository.save(movimientos3);
            movimientosRepository.save(movimientos4);
            movimientosRepository.save(movimientos5);
            movimientosRepository.save(movimientos6);
        }
        System.out.println("Movimientos agregados por el seed data: " + movimientosRepository.count());
    }
}
