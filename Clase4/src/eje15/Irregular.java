package eje15;

public class Irregular implements IEstado {
	
	static Irregular i;
	private Irregular() { }
	
	public static Irregular getInstance() {
		if(i == null) {
			i = new Irregular();
		}
		
		return i;
	}

	@Override
	public void cambiarEstado(Alumno a, int cambiar) {
		a.setEstado(Regular.getInstance());		
	}

	@Override
	public String obtenerEstado(Alumno a) {
		return "Irregular";
	}

}
