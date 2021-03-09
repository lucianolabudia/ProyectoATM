package atm;

public class Cliente {

	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido;
	}
	
	
}
