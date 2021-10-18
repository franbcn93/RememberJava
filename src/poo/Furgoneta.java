package poo;

public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		
		super();
		
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
		
	}
	
	

	public String getDatoStringFurgoneta() {
		return ("La capacidad de carga es " + capacidad_carga + " Y las plazas son: " + plazas_extra);
	}



	public void setCapacidad_carga(int capacidad_carga) {
		this.capacidad_carga = capacidad_carga;
	}



	public int getPlazas_extra() {
		return plazas_extra;
	}



	public void setPlazas_extra(int plazas_extra) {
		this.plazas_extra = plazas_extra;
	}



}
