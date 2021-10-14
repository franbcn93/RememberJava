import javax.swing.JOptionPane;

public class UsoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] paises = new String[3];
		
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce el pais " + (i + 1));
		}
		
		for (String elemento : paises) {
			JOptionPane.showMessageDialog(null, elemento);
		}
	}

}
