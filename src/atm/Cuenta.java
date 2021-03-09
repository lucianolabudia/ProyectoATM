package atm;

public class Cuenta {

	private int nroCuenta;
	private int nip;
	private double saldo;
	
	public Cuenta(int nroCuenta, int nip, double saldo) {
		this.nroCuenta = nroCuenta;
		this.nip = nip;
		this.saldo = saldo;
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double deposito(double amt) {
		saldo = saldo + amt;
		return saldo;
	}
	
	
	public double retiro(double amt) {		
		double result = -1; // assume operation failure		
		if(amt <= saldo) {
			saldo = saldo - amt;
			result = saldo; // operation succeeds
		}
		return result;
	}
	
	
}
