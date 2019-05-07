package eje15;

public class Regular implements IEstado {
	
	static Regular r;
	private Regular() { }
	
	public static Regular getInstance() {
		if(r == null) {
			r = new Regular();
		}
		
		return r;
	}

	@Override
	public void cambiarEstado(Alumno a, int cambiar) {
		if(cambiar == 1) {
			a.setEstado(Recibido.getInstance());
		} else {
			a.setEstado(Irregular.getInstance());
		}
	}

	@Override
	public String obtenerEstado(Alumno a) {
		return "Regular";
	}

}