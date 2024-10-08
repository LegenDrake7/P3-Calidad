package pkg;

public class Cuenta {
	
	double saldo;
	
	public Cuenta(Double saldoIni) {
		saldo = saldoIni;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Object getSaldo() {
		return saldo;
	}

	public void Ingresar(double i) {
		saldo = saldo+i;
	}

	public void Retirar(double i) {
		saldo = saldo-i;
	}
}
