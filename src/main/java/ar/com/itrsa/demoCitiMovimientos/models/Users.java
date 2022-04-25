package ar.com.itrsa.demoCitiMovimientos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    private String nombre;

    private int numeroDeCuenta;

    public Users(String nombre, int numeroDeCuenta) {
        this.nombre = nombre;
        this.numeroDeCuenta = numeroDeCuenta;
    }

}
