package mx.conversor.modelo;

import javax.swing.JOptionPane;

public class Ventanas {
	
	private Object[] monedas = {"Dolares", "Euros", "Libras","Yenes", "Wones Coreanos",
			"Dolar a pesos", "Euros a pesos", "Libras a pesos",
			"Yen a pesos", "Won Coreano a pesos"};
	private Object[] temperaturas = {"Celsius a Farenheit", "Celsius a Kelvin", 
			"Farenheit a Celsius", "Farenheit a Kelvin",
			"Kelvin a Celsius", "Kelvin a Farenheit"};
	private String seleccionMenu;
	private String seleccionMoneda;
	private String seleccionTemperatura;
	private double ingresarValores;
	JOptionPane pane = new JOptionPane();
	
	public String abrirMenu () {
		
		this.seleccionMenu = (JOptionPane.showInputDialog(pane,
				"Seleciona el tipo de conversión que deseas realizar", 
				"Conversor",JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"Moneda", "Temperatura"},"Moneda")).toString();
		return seleccionMenu;
	}
	
	public String seleccionarConversion (Object seleccionMenu) {
		
		if (seleccionMenu == "Moneda") {
			this.seleccionMoneda = (JOptionPane.showInputDialog(pane,
					"Seleciona la moneda a la que deseas convertir", 
					"Conversor",JOptionPane.PLAIN_MESSAGE, null,
					monedas,"Dólar")).toString();
			return this.seleccionMoneda;
		} else {
			this.seleccionTemperatura = (JOptionPane.showInputDialog(pane,
					"Seleciona la temperatura a la que deseas convertir", 
					"Conversor",JOptionPane.PLAIN_MESSAGE, null,
					this.temperaturas,"Celcius")).toString();
			return this.seleccionTemperatura;
		}
	}
	
	public Double ingresarDatos() {
		try {
			return this.ingresarValores = Double.valueOf(JOptionPane.showInputDialog(pane,
					"Ingresa el valor que deseas convertir", 
					"Conversor",JOptionPane.PLAIN_MESSAGE));
		}catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(pane, "Valor invalido, no dejar en blanco y solo números",
					"Error", JOptionPane.ERROR_MESSAGE);
			return ingresarDatos();
		}
	}
	public void mostrarDatos(String valor, String unidad) {
		if (unidad.contains("pesos")) {
			JOptionPane.showMessageDialog(pane,"Tu valor convertio es de : " + valor + " pesos");
		} else {
			JOptionPane.showMessageDialog(pane,"Tu valor convertio es de : " + valor + " " + unidad);
		}
		
	}
	
	public boolean continuarConvirtiendo() {
		double numero = JOptionPane.showConfirmDialog(null,
	             "¿Desea continuar?", "Conversor", JOptionPane.YES_NO_CANCEL_OPTION);
		if (numero == 0) {
			return true;
		} else {
			JOptionPane.showMessageDialog(pane,"Programa finalizado");
			return false;
		}
	}
}
