package ar.com.itrsa.demoCitiMovimientos.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Movimientos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date utilDate;

    private String concepto;

    private int importe;
    
    @ManyToOne
    private Users user;

	public Movimientos() {
    }     
	
    public Movimientos(Date utilDate, String concepto, int importe, Users user) {
		this.utilDate = utilDate;
		this.concepto = concepto;
		this.importe = importe;
		this.user = user;
	}

	public Date getUtilDate() {
		return utilDate;
	}

	public void setUtilDate(Date utilDate) {
		this.utilDate = utilDate;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}



    
}
