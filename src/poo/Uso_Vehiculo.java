package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		Coche miCoche = new Coche();
		
		miCoche.establecer_color("Verde");
		
		Furgoneta miFurgoneta = new Furgoneta(2, 1400);
		
		miFurgoneta.configura_asientos("si");
		
		miFurgoneta.establecer_color("Negro");
		
		miFurgoneta.configura_climatizador("si");
		
		System.out.println(miCoche.dime_color() + " " + miCoche.dime_asientos());
		
		System.out.println(miFurgoneta.getDatoStringFurgoneta()+ " " + miFurgoneta.dime_asientos());
	}

}
