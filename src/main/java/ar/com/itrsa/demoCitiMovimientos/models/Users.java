package ar.com.itrsa.demoCitiMovimientos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Integer id;
    
    private String nombre;
    
    private int numeroDeCuenta;

    public Users() {
    	
    }
    
    public Users( String nombre, int numeroDeCuenta) {
		
		this.nombre = nombre;
		this.numeroDeCuenta = numeroDeCuenta;
	}
    
	public Users(int id, String nombre, int numeroDeCuenta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
        

}
