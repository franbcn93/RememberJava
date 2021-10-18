package poo2;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador[] = new Empleados[2];
		trabajador[0] = new Empleados("Paquito");
		trabajador[1] = new Empleados("Ana");
		
		trabajador[0].setSeccion("RRHH");
		
		
		
		for (Empleados CadaTrabajador : trabajador) {
			System.out.println(CadaTrabajador.getDatos());
		}
		
	}

}

class Empleados{
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
	
	public Empleados(String nom) {
		nombre = nom;
		
		seccion = "Administración";	
		
		Id = IdSiguiente;
		
		IdSiguiente++;
		
	}


	public String getDatos() {
		return "El nombre es: " + nombre + " y la sección es: " + seccion + ". Y el ID es: " + Id;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
		
	
}
