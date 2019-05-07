package eje15;

public class Alumno {
	private String nombre, apellido, carrera;
	private int legajo;
	private IEstado estado;
	
	public Alumno(String nombre, String apellido, String carrera, int legajo, IEstado estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.legajo = legajo;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public int getLegajo() {
		return legajo;
	}
	
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public IEstado getEstado() {
		return estado;
	}
	
	public void setEstado(IEstado estado) {
		this.estado = estado;
	}
	
	
}
