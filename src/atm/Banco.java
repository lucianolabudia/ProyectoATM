package atm;

public class Banco {

	private Cliente[] clientes;
	private int nroClientes;
	
	public Banco() {
		clientes = new Cliente[10];
		nroClientes = 0;
	}
	
	public void addClientes(String nombre, String apellido) {
		int i = nroClientes++;
		clientes[i] = new Cliente(nombre, apellido);
	}
	
	public int getNroClientes() {
		return nroClientes;
	}
	
	public Cliente getCliente(int cliente_index) {
		return clientes[cliente_index];
	}

	public void addClientes(Cliente cliente1) {
		// TODO Auto-generated method stub
		
	}
	
}
