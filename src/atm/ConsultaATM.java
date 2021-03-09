package atm;

public class ConsultaATM extends OperacionesATM {

	
	public ConsultaATM(Cuenta cuenta, Cliente cliente) {
		super(cuenta, cliente);
		// TODO Auto-generated constructor stub
	}

	public void transaccionar() {
		Cuenta cuenta = this.getCuenta();
		System.out.println("----------------------------------");
		System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
		System.out.println("----------------------------------");
	}
	
	public void pedirDato() {
		// agregar un cuerpo al metodo
	}
}
