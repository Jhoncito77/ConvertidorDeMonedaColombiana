package co.com.conversor.vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private String opcion;

	public MenuPrincipal(Object[] opciones) {
		try {
		this.opcion = JOptionPane.showInputDialog(null, "Seleccione una opcion de coversion", "Menu", JOptionPane.PLAIN_MESSAGE, null, 
			opciones, "Elegir").toString();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getOpcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

}
