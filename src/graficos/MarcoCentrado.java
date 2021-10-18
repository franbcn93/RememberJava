package graficos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.tools.Tool;

public class MarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoC miMarcoC = new MarcoC();
		
		miMarcoC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarcoC.setVisible(true);
		
	}

}

class MarcoC extends JFrame{
	public MarcoC() {
		Toolkit miPantalla = java.awt.Toolkit.getDefaultToolkit();
		
		Dimension tamanioPDimension = miPantalla.getScreenSize();
		
		int alturaP = tamanioPDimension.height;
		
		int anchuraP = tamanioPDimension.width;
		
		setSize(anchuraP/2,alturaP/2);
		
		setLocation(anchuraP/4, alturaP/4);
		
		setTitle("Marco Centrado");
		
		Lamina miLamina = new Lamina();
		
		add(miLamina);
		
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Aprendiendo Swing", 100, 100);
	}
}
