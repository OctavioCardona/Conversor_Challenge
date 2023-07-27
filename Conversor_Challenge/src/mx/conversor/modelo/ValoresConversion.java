package mx.conversor.modelo;

import java.util.ArrayList;
import java.util.List;

public class ValoresConversion {
	private List<Divisa> lista = new ArrayList<>();
	private int posicionDosPuntos;
	
	public void generarValores() {
		Divisa moneda1 = new Divisa();
		moneda1.setValor(0.0583);
		moneda1.setNombre("Dolares");
		
		Divisa moneda2 = new Divisa();
		moneda2.setValor(0.0535);
		moneda2.setNombre("Euros");
		
		Divisa moneda3 = new Divisa();
		moneda3.setValor(0.0461);
		moneda3.setNombre("Libras");
		
		Divisa moneda4 = new Divisa();
		moneda4.setValor(8.4266);
		moneda4.setNombre("Yenes");
		
		Divisa moneda5 = new Divisa();
		moneda5.setValor(76.8586);
		moneda5.setNombre("Wones Coreanos");
		
		Divisa moneda6 = new Divisa();
		moneda6.setValor(17.1189);
		moneda6.setNombre("Dolar a pesos");
		
		Divisa moneda7 = new Divisa();
		moneda7.setValor(18.6916);
		moneda7.setNombre("Euros a pesos");
		
		Divisa moneda8 = new Divisa();
		moneda8.setValor(21.7526);
		moneda8.setNombre("Libras a pesos");
		
		Divisa moneda9 = new Divisa();
		moneda9.setValor(0.1186);
		moneda9.setNombre("Yen a pesos");
		
		Divisa moneda10 = new Divisa();
		moneda10.setValor(0.0131);
		moneda10.setNombre("Won Coreano a pesos");
		

		this.lista.add(moneda1);
		this.lista.add(moneda2);
		this.lista.add(moneda3);
		this.lista.add(moneda4);
		this.lista.add(moneda5);
		this.lista.add(moneda6);
		this.lista.add(moneda7);
		this.lista.add(moneda8);
		this.lista.add(moneda9);
		this.lista.add(moneda10);
		

	}
	public String contieneNombre (String nombre) {
		for(int i = 0; i < lista.size(); i++) {
			if (((lista.get(i)).toString()).contains(nombre)) {
				this.posicionDosPuntos = ((lista.get(i)).toString()).indexOf(":");
				return ((lista.get(i).toString()).substring(posicionDosPuntos + 2,posicionDosPuntos + 8));
			}
		}
		return null;
	}
}
