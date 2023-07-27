package mx.conversor.modelo;

public class Divisa {
	
	private double valor;
	private String nombre; 
	private String pais;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Valor: " + this.valor + ", nombre: " + this.nombre;
	}
}
