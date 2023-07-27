package mx.conversor_test;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import mx.conversor.modelo.Conversiones;
import mx.conversor.modelo.ValoresConversion;
import mx.conversor.modelo.Ventanas;

public class TestConversor {

	public static void main(String[] args) {
		boolean isTrue = true;
		double valorMoneda = 0;;
		double valorConvertido = 0;
		try {
			while(isTrue) {
				Ventanas ventana = new Ventanas();
				Conversiones tiposConversion = new Conversiones();
				String seleccionMenu = ventana.abrirMenu();
				String seleccionConversion = ventana.seleccionarConversion(seleccionMenu);
				Double valorConvertir = ventana.ingresarDatos();
				if (seleccionMenu == "Moneda") {
					ValoresConversion valoresMonedas = new ValoresConversion();
					valoresMonedas.generarValores();
					valorMoneda = Double.valueOf(valoresMonedas.contieneNombre(seleccionConversion));
					valorConvertido = tiposConversion.conversionUnidad(valorConvertir, valorMoneda);
				} else {
					valorConvertido = tiposConversion.seleccionConversionTemperatura(valorConvertir, seleccionConversion);
				}
				DecimalFormat formato = new DecimalFormat("#.##");
				ventana.mostrarDatos((formato.format(valorConvertido)).toString(),seleccionConversion);
				isTrue = ventana.continuarConvirtiendo();
			}
		}catch (NullPointerException ex) {
			JOptionPane.showMessageDialog(null,"Programa finalizado");
		}
	}

}
