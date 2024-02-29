package model;

public class Fan extends Persona{

	
	private String equipo;
	
	public Fan(String nombre, short edad, String nacionalidad, String equipo) {
		super(nombre, edad, nacionalidad);
		this.equipo = equipo;
	}
	
	public Fan(String equipo) {
		super();
		this.equipo = equipo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}



	
}
