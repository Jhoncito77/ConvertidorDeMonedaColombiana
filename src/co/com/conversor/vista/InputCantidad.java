package co.com.conversor.vista;

import javax.swing.JOptionPane;

public class InputCantidad {
	private double cantidad;

	public InputCantidad(String mensaje) {
		try {
			this.cantidad =Double.valueOf(JOptionPane.showInputDialog(mensaje));
		}catch (Exception e) {
			while(cantidad == 0) {
				try {
					this.cantidad =Double.valueOf(JOptionPane.showInputDialog("Ingresa un valor numerico valido para convertir"));
				}catch (Exception f) {
					System.out.println(f);
				}
			}
			
		}
		
		
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
