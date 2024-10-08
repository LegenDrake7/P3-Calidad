package pkg;

public class Movimiento {
	Double importe;
	public enum signo{D,H}; //Debe y Haber
	String detalle;
	
	public Movimiento(Double imp, signo sign) {
		importe = imp;
		if (sign==signo.D) {
			detalle = "Reintegro de " + importe + "€";
		} else if (sign==signo.H) {
			detalle = "Ingreso de " + importe + "€";
		}
	}
	
	public String getDetalle() {
		return detalle;
	}
}
