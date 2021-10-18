package graficos;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiMarco marco = new MiMarco();
		
		marco.setLocationRelativeTo(null);
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MiMarco extends JFrame{
	public MiMarco() {
				
		setSize(500,300);
	}
}