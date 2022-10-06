package co.com.conversor.vista;

import javax.swing.JOptionPane;

public class SelectorMonedaConversion {
	private String opcionConversion;
	
	public SelectorMonedaConversion(Object[] datos) {
		this.opcionConversion = JOptionPane.showInputDialog(null, "Elije el tipo de conversion", "Monedas", JOptionPane.PLAIN_MESSAGE, null, 
				datos, "Elegir").toString();
	}

	public String getOpcionConversion() {
		return opcionConversion;
	}

	public void setOpcionConversion(String opcionConversion) {
		this.opcionConversion = opcionConversion;
	}
	
	
}
