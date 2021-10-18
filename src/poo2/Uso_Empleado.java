package poo2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*
		 * Empleado empleado1 = new Empleado("Paco", 18000, 1980, 9, 14); Empleado
		 * empleado2 = new Empleado("Sofia", 22000, 2017, 10, 9); Empleado empleado3 =
		 * new Empleado("Adam", 33000, 2020, 11, 25);
		 * 
		 * empleado1.setSueldo(5); empleado2.setSueldo(12); empleado3.setSueldo(1.2);
		 * 
		 * System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " +
		 * empleado1.getSueldo() + " Fecha de alta: " + empleado1.getAltaContrato());
		 * 
		 * System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " +
		 * empleado2.getSueldo() + " Fecha de alta: " + empleado2.getAltaContrato());
		 * 
		 * System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " +
		 * empleado3.getSueldo() + " Fecha de alta: " + empleado3.getAltaContrato());
		 */
		
		/*
		 * Jefatura jefe_RRHH = new Jefatura("Yaz", 35000, 1980, 1, 6);
		 * 
		 * jefe_RRHH.setIncentivo(2450);
		 * 
		 * Empleado[] misEmpleados = new Empleado[4];
		 * 
		 * misEmpleados[0] = new Empleado("Paco", 18000, 1980, 9, 14); misEmpleados[1] =
		 * new Empleado("Sofia", 22000, 2017, 10, 9); misEmpleados[2] = new
		 * Empleado("Adam", 33000, 2020, 11, 25); misEmpleados[3] = jefe_RRHH;
		 * 
		 * for (Empleado empleado : misEmpleados) { empleado.setSueldo(5);
		 * 
		 * System.out.println("Nombre: " + empleado.getNombre() + " Sueldo: " +
		 * empleado.getSueldo() + " Fecha de alta: " + empleado.getAltaContrato()); }
		 */
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado("Luis", 50000, 2000, 3, 12);
		lasPersonas[1] = new Alumno("Ana", "Empresariales");
		
		for (Persona persona : lasPersonas) {
			System.out.println(persona.getNombre() +", "  + persona.dameDescripcion());
		}
		
	}
}

class Empleado extends Persona {
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		
	}
	
	public String dameDescripcion() {
		return "Este empleado con nombre= " + nombre + " y con un sueldo: " + sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double porcentaje) {
		// this.sueldo = sueldo;
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo += aumento;
	}

	public Date getAltaContrato() {
		return altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}
}

class Jefatura extends Empleado{
	
	private double incentivo;

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		// TODO Auto-generated constructor stub
	}

	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}

	public void setIncentivo(double b) {
		this.incentivo = b;
	}	
	
}

abstract class Persona {
	
	private String nombre;
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

class Alumno extends Persona {
	public String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		
		carrera = car;
	}
	
	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera;
 	}
}
