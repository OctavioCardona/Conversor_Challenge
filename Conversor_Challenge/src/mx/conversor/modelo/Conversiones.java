package mx.conversor.modelo;

public class Conversiones {
	public double conversionUnidad (double peso, double valor) {
		return peso * valor;
	}
	public double seleccionConversionTemperatura(double valor, String nombre) {
		switch (nombre) {
		case "Celsius a Farenheit":
				return conversionCelsiusFarenheit(valor);
		case "Celsius a Kelvin":
				return conversionCelsiuskelvin(valor);
		case "Farenheit a Celsius":
				return conversionFarenheitCelsius(valor);
		case "Farenheit a Kelvin":
				return conversionFarenheitKelvin(valor);
		case "Kelvin a Celsius":
				return conversionKelvinCelsius(valor);
		case "Kelvin a Farenheit":
				return conversionKelvinFarenheit(valor);
		default:
			return 0;
		}
	}
	public double conversionCelsiusFarenheit(double valor) {
		return (valor * ( 9 / 5 )) + 32;
	}
	public double conversionCelsiuskelvin(double valor) {
		return valor +  273.15;
	}
	public double conversionFarenheitCelsius(double valor) {
		return (valor - 32 ) * 5 / 9 ;
	}
	public double conversionFarenheitKelvin(double valor) {
		return ((valor - 32) * 5 / 9 ) + 273.15;
	}
	public double conversionKelvinFarenheit(double valor) {
		return ((valor - 273.15) *  9 / 5 ) + 32;
	}
	public double conversionKelvinCelsius(double valor) {
		return valor - 273.15;
	}
}
