package ar.com.itrsa.demoCitiMovimientos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date utilDate;

    private String concepto;

    private int importe;

    @ManyToOne
    private Users user;

    public Movimientos(Date utilDate, String concepto, int importe, Users user) {
        this.utilDate = utilDate;
        this.concepto = concepto;
        this.importe = importe;
        this.user = user;

    }

}
