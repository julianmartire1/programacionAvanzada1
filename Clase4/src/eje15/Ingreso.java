package eje15;

public class Ingreso implements IEstado {
	
	static Ingreso i;
	private Ingreso() { }
	
	public static Ingreso getInstance() {
		if(i == null) {
			i = new Ingreso();
		}
		
		return i;
	}

	@Override
	public String obtenerEstado(Alumno a) {
		return "Ingreso";
	}

	@Override
	public void cambiarEstado(Alumno a, int cambiar) {
		a.setEstado(Regular.getInstance());
		
	}

}
