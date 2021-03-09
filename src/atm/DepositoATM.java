package atm;

public class DepositoATM extends OperacionesATM {
	
	private int deposito;
	
	public DepositoATM(Cuenta cuenta, Cliente cliente) {
		super(cuenta, cliente);
	}	

	
	public void transaccionar() {
		Cuenta cuenta = this.getCuenta();		
		
		pedirDato();	
		
		double resultado = cuenta.deposito(deposito);		
		
		System.out.println("------------------------------------");
		System.out.println("Depositado: " + deposito);
		System.out.println("Tu saldo actual es: " + resultado);
		System.out.println("------------------------------------");
	}
	
	public void pedirDato() {
		System.out.println("Caunto deseas depositar: ");
		deposito = entrada.nextInt();
	}
}
