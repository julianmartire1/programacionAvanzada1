package eje15;

public class Main {
	public static void main(String[] args) {
		Alumno a = new Alumno("nombre", "apellido", "carrera 1", 123, Ingreso.getInstance());
		
		System.out.println(a.getEstado().obtenerEstado(a));
		a.getEstado().cambiarEstado(a, 0);
		System.out.println(a.getEstado().obtenerEstado(a));
		a.getEstado().cambiarEstado(a, 0);
		System.out.println(a.getEstado().obtenerEstado(a));
		a.getEstado().cambiarEstado(a, 0);
		System.out.println(a.getEstado().obtenerEstado(a));
		a.getEstado().cambiarEstado(a, 1);
		System.out.println(a.getEstado().obtenerEstado(a));
		
		
	}
}
