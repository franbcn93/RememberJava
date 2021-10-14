package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche Renault = new Coche();
		
		Renault.establecer_color(JOptionPane.showInputDialog("Introduce el color del coche"));
		
		
		System.out.println(Renault.dime_largo());
		
		System.out.println(Renault.dime_color());
		
		Renault.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero el coche?"));
		
		System.out.println(Renault.dime_asientos());
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador el coche?"));
		
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
	}

}
