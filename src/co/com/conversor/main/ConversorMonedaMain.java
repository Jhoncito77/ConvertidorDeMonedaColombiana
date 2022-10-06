package co.com.conversor.main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.com.conversor.controlador.Conversiones;
import co.com.conversor.vista.InputCantidad;
import co.com.conversor.vista.MenuPrincipal;
import co.com.conversor.vista.SelectorMonedaConversion;

public class ConversorMonedaMain {

	public static void main(String[] args) {
		Object[] opciones = {"Conversor de moneda", "Conversor de temperatura"};
		Object[] conversionesMoneda = {"Peso Colombiano a dolar", "Dolar a peso colombiano", "Pesos Colombianos a Euros","Euros a pesos Colombianos",
				"Pesos Colombianos a Libras esterlinas", "Libras esterlinas a pesos Colombianos","Pesos Colombianos a Yen",
				"Yen a pesos Colombianos", "Pesos Colombianos a won Coreano", "Won Coreano a Pesos Colombianos"};
		
		Object[] conversionTemperatura = {"°C a °F","°F a °C","°C a K","K a °C" };
		
		String mensajeConversionMoneda = "Ingresa la cantidad de dinero que deseas convertir";
		String mensajeConversionTemperatura = "Ingresa el valor de la temperatura que deseas convertir";
		InputCantidad cantidad;
		SelectorMonedaConversion tipoConversion;
		Conversiones conversion = new Conversiones();
		boolean validacion = true;
		
		while(validacion) {
			MenuPrincipal menuPrincipal = new MenuPrincipal(opciones);
			menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			if(menuPrincipal.getOpcion() == opciones[0]) {
				cantidad = new InputCantidad(mensajeConversionMoneda);
				System.out.println(cantidad.getCantidad());
				tipoConversion = new SelectorMonedaConversion(conversionesMoneda);
				System.out.println(tipoConversion.getOpcionConversion());
				conversion.mensaje(tipoConversion.getOpcionConversion(), cantidad.getCantidad());
			}else if(menuPrincipal.getOpcion() == opciones[1]) {
				cantidad = new InputCantidad(mensajeConversionTemperatura);
				System.out.println(cantidad.getCantidad());
				tipoConversion = new SelectorMonedaConversion(conversionTemperatura);
				System.out.println(tipoConversion.getOpcionConversion());
				conversion.mensajeTemperatura(tipoConversion.getOpcionConversion(), cantidad.getCantidad());
			}
			
			int confirmacion =JOptionPane.showConfirmDialog(null, "¿Desea realizar mas conversiones?");
			System.out.println(confirmacion);
			
			if(confirmacion >= 1) {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				validacion=false;
			}
		}
			
		
		

	}

}
