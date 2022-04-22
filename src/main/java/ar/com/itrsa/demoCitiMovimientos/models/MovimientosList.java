package ar.com.itrsa.demoCitiMovimientos.models;

import java.util.ArrayList;
import java.util.List;

public class MovimientosList {

	private List<Movimientos> movimientos;
	
	public MovimientosList() {
		movimientos = new ArrayList<>();
    }

	public List<Movimientos> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimientos> movimientos) {
		this.movimientos = movimientos;
	}
	
	
}
