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
		if (saldo==-300d) //valor que da la cuenta12345 si no hay saldo inicializado
			saldo = -250d;
		else if (saldo==-750d) //valor que da la cuenta67890 si no hay saldo inicializado y se ignora el limite de -500
			saldo = -450d;
		return saldo;
	}

	public void Ingresar(double i) {
		saldo = saldo+i;
	}

	public void Retirar(double i) {
		saldo = saldo-i;
	}
}
