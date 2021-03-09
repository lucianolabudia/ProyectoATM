package atm;

public class RetiroATM extends OperacionesATM {
	
	private int retiro;
	
	public RetiroATM(Cuenta cuenta, Cliente cliente) {
		super(cuenta, cliente);
	}
	
	
	public void transaccionar() {
		
		Cuenta cuenta = this.getCuenta();
		
		pedirDato();
		
		
		double resultado = cuenta.retiro(retiro);
		
		
		
		if (resultado >= 0) {			
			System.out.println("------------------------------------");
			System.out.println("Retiraste: " + retiro);
			System.out.println("Tu saldo actual es: " + resultado);
			System.out.println("------------------------------------");
		} else {
			System.out.println("---------------------");
			System.out.println("Saldo insuficiente.");
			System.out.println("---------------------");
		}
	}
	
	public void pedirDato() {
		System.out.println("Cuanto desea retirar: ");
		retiro = entrada.nextInt();		
	}
}
