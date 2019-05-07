package eje15;

public class Recibido implements IEstado {
	
	static Recibido r;
	private Recibido() { }
	
	public static Recibido getInstance() {
		if(r == null) {
			r = new Recibido();
		}
		
		return r;
	}

	@Override
	public void cambiarEstado(Alumno a, int cambiar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String obtenerEstado(Alumno a) {
		return "Recibido";
	}

}