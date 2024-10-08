package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.signo;

public class Cuenta {
	
	double saldo;
	String numero;
	String nombre;
	List <Movimiento> movimiento;
	int numMov;

	public Cuenta(Double saldoIni) {
		saldo = saldoIni;
	}
	
	public Cuenta(Double saldoIni, String num, String nom) {
		saldo = saldoIni;
		numero = num;
		nombre = nom;
		movimiento = new ArrayList<>();
		numMov = 0;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Object getSaldo() {
		return saldo;
	}

	public void Ingresar(double i) {
		movimiento.add(new Movimiento(i, signo.H));
		numMov++;
		saldo = saldo+i;
		System.out.println("Cuenta "+ numero + ": " + movimiento.get(numMov-1).getDetalle());
	}

	public void Retirar(double i) {
		if(saldo-i >= -500d) {
			movimiento.add(new Movimiento(i, signo.D));
			numMov++;
			saldo = saldo-i;
			System.out.println("Cuenta "+ numero + ": " + movimiento.get(numMov-1).getDetalle());
		}
		else
			System.out.println("Fondos insuficientes (saldo " + saldo + "€) en la cuenta " + numero + " para el reintegro de " + i + " €");
	}
}
