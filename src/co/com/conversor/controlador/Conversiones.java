package co.com.conversor.controlador;

import javax.swing.JOptionPane;

public class Conversiones {

	private double dolar = 4614.58;
	private double euro = 4525.13;
	private double libras = 5151.72;
	private double yen = 31.83;
	private double won = 3.27;
	private String[] conversiones = { "Peso Colombiano a dolar", "Dolar a peso colombiano", "Pesos Colombianos a Euros",
			"Euros a pesos Colombianos", "Pesos Colombianos a Libras esterlinas",
			"Libras esterlinas a pesos Colombianos", "Pesos Colombianos a Yen", "Yen a pesos Colombianos",
			"Pesos Colombianos a won Coreano", "Won Coreano a Pesos Colombianos" };
	
	private String[] conversionesTemperatura = {"°C a °F","°F a °C","°C a K","K a °C" };

	public void mensaje(String tipoConversion, double cantidad) {
		if(tipoConversion == conversiones[0]) {
			ventana(convertirPesosADolar(cantidad));
		}else if(tipoConversion==conversiones[1]) {
			ventana(convertirDolarAPesos(cantidad));
		}if(tipoConversion == conversiones[2]) {
			ventana(convertirPesosAEuro(cantidad));
		}else if(tipoConversion==conversiones[3]) {
			ventana(convertirEuroAPesos(cantidad));
		}if(tipoConversion == conversiones[4]) {
			ventana(convertirPesosALibras(cantidad));
		}else if(tipoConversion==conversiones[5]) {
			ventana(convertirLibrasAPesos(cantidad));
		}if(tipoConversion == conversiones[6]) {
			ventana(convertirPesosAYen(cantidad));
		}else if(tipoConversion==conversiones[7]) {
			ventana(convertirYenAPesos(cantidad));
		}if(tipoConversion == conversiones[8]) {
			ventana(convertirPesosAWon(cantidad));
		}else if(tipoConversion==conversiones[9]) {
			ventana(convertirWonAPesos(cantidad));
		}
	}
	
	public void mensajeTemperatura(String tipoConversion, double cantidad) {
		if(tipoConversion == conversionesTemperatura[0]) {
			ventana(convertirCelsiusAFahrenheit(cantidad));
		}else if(tipoConversion==conversionesTemperatura[1]) {
			ventana(convertirFahrenheitAcelsius(cantidad));
		}if(tipoConversion == conversionesTemperatura[2]) {
			ventana(convertirCelsiusAKelvin(cantidad));
		}else if(tipoConversion==conversionesTemperatura[3]) {
			ventana(convertirKelvinAcelsius(cantidad));
		}
	}

	public void ventana(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public String convertirPesosADolar(double valor) {
		String result = String.valueOf(valor / dolar);

		return "Son $" + result + " dolares";
	}
	
	public String convertirDolarAPesos(double valor) {
		String result = String.valueOf(valor * dolar);

		return "Son $" + result + " dolares";
	}
	
	public String convertirPesosAEuro(double valor) {
		String result = String.valueOf(valor / euro);

		return "Son $" + result + " euros";
	}
	
	public String convertirEuroAPesos(double valor) {
		String result = String.valueOf(valor * euro);

		return "Son $" + result + " euros";
	}
	
	public String convertirPesosALibras(double valor) {
		String result = String.valueOf(valor / libras);

		return "Son $" + result + " libras esterlinas";
	}
	
	public String convertirLibrasAPesos(double valor) {
		String result = String.valueOf(valor * libras);

		return "Son $" + result + " libras esterlinas";
	}
	
	public String convertirPesosAYen(double valor) {
		String result = String.valueOf(valor / yen);

		return "Son $" + result + " yenes";
	}
	
	public String convertirYenAPesos(double valor) {
		String result = String.valueOf(valor * yen);

		return "Son $" + result + " yenes";
	}
	
	public String convertirPesosAWon(double valor) {
		String result = String.valueOf(valor / won);

		return "Son $" + result + " Won Coreano";
	}
	
	public String convertirWonAPesos(double valor) {
		String result = String.valueOf(valor * won);

		return "Son $" + result + " won Coreano";
	}
	
	public String convertirFahrenheitAcelsius(double valor) {
		String result = String.valueOf((valor - 32) * 5/9);

		return "Son " + result + " °C";
	}
	
	public String convertirCelsiusAFahrenheit(double valor) {
		String result = String.valueOf((valor*9/5) +32);

		return "Son " + result + " °F";
	}
	
	public String convertirKelvinAcelsius(double valor) {
		String result = String.valueOf(valor - 273.15);

		return "Son " + result + " °C";
	}
	
	public String convertirCelsiusAKelvin(double valor) {
		String result = String.valueOf(valor + 273.15);

		return "Son " + result + " K";
	}
	
	
}
