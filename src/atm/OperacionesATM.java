package atm;

import java.util.Scanner;

public abstract class OperacionesATM {

	
	Scanner entrada = new Scanner(System.in);	
	private Cuenta cuenta;
	private Cliente cliente;
	
	//constructor
	public OperacionesATM(Cuenta cuenta, Cliente cliente) {
		this.cuenta = cuenta;
		this.cliente = cliente;
	}
	
	
	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	public void login() {
		int usuario = cuenta.getNroCuenta();
		int password = cuenta.getNip();		
		
		int intento = 0;
		
		String datosCliente = cliente.toString();
		
		do {
			
			Scanner input1 = new Scanner(System.in);
			System.out.println("-----------------------------------------------------------");
			System.out.println("Para acceder a su cuenta realice las siguientes acciones...");
			System.out.println("-----------------------------------------------------------");
			System.out.println("Ingrese su Número de Cuenta: ");
			int user = input1.nextInt();
			
			Scanner input2 = new Scanner(System.in);
			System.out.println("Ingrese su NIP: ");
			int pass = input1.nextInt();
						
			
			
		    if ((user == usuario) && (pass == password)) {
		    	System.out.println("-------------------------------------------------");
		        System.out.println("Acceso Correcto! Bienvenido " + datosCliente + "!");
		        System.out.println("-------------------------------------------------");
		        operar();
		    }else if (user == usuario) {
		        System.out.println("NIP Invalido!\n");		        
		        intento ++;
		    } else if (pass == password) {
		        System.out.println("Número de Cuenta Invalido!\n");		        
		        intento ++;
		    } else {
		        System.out.println("Número de Cuenta y NIP Incorrectos!\n");		        
		        intento ++;
		    }
		    
		    if (intento == 3) {
		    	System.out.println("-------------------------------------");
		    	System.out.println("Usted agoto los intentos de ingreso");
				System.out.println("Vuelva a intentarlo más tarde");
				System.out.println("-------------------------------------");
			}
		    
		} while (intento != 3);
	}
	


	public void operar() {		
		int i = 0;
		int seleccion = 0;
		
		do {	
			
			do {
				System.out.println("Por favor seleccione una opción:");
				System.out.println("     1. Consultar Saldo.");
				System.out.println("     2. Retirar Efectivo.");
				System.out.println("     3. Depositar en Cuenta.");
				System.out.println("     4. Salir.");
			
				seleccion = entrada.nextInt();
				
				if (seleccion >= 1 && seleccion <= 4) {
					i = 1;
				} else {
					System.out.println("------------------------------------------");
					System.out.println("Opción no disponible, vuelva a intentarlo.");
					System.out.println("------------------------------------------");
				}
			} while(i == 0);
		
			
			if (seleccion == 1) {
				OperacionesATM tConsulta = new ConsultaATM(cuenta, cliente);
				tConsulta.transaccionar();
			} else if (seleccion == 2) {
				OperacionesATM tRetiro = new RetiroATM(cuenta, cliente);
				tRetiro.transaccionar();
			} else if (seleccion == 3) {
				OperacionesATM tDeposito = new DepositoATM(cuenta, cliente);
				tDeposito.transaccionar();
			} else if (seleccion == 4) {
				System.out.println("-------------------------");
				System.out.println("¡Gracias!, vuelva pronto.");
				System.out.println("-------------------------");
				i = 2;
			}
			
			
		}while(i != 2);
	}
	
	
	
	// Métodos abstracto
	public abstract void transaccionar();
	
	public abstract void pedirDato();
	
	
}
