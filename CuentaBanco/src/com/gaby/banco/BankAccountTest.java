package com.gaby.banco;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount var = new BankAccount();
		var.nuevaCuenta();
		System.out.println("La cantidad de cuentas es de: " + BankAccount.getCantidadCuentas());
		var.depositarCuentaCorriente(10.000);
		var.depositarCuentaCorriente(3.000);
		var.depositarCuentaAhorro(5.000);
		var.depositarCuentaAhorro(8.000);
		var.retirarCuentaCorriente(4.000);
		var.retirarCuentaAhorro(4.000);
		var.consultaSaldo();
		System.out.println("Su saldo total es de: " + BankAccount.getCantidadDinero());
	}

}
