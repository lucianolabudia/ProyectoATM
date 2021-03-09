package test;

import atm.Banco;
import atm.Cliente;
import atm.ConsultaATM;
import atm.Cuenta;
import atm.OperacionesATM;

public class TestATM {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		Cliente cliente1 = new Cliente("Luciano", "Labudia");
		banco.addClientes(cliente1);		
		Cuenta cuenta1 = new Cuenta(12345, 12345, 40000);
		OperacionesATM atm1 = new ConsultaATM(cuenta1, cliente1);
		
		atm1.login();

	}

}
