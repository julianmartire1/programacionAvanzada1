package mypackage;

public class Empleado {
	private String nombre;
	private String apellido;
	private int cuil;
	private int estado;
	private double sueldo;
	private TipoCobro tipoCobro;
	private double cantidadDeHorasTrabajadas;
	
	public Empleado(String nombre, String apellido, int cuil, int estado, double sueldo, TipoCobro tipoCobro, double canthoras) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.estado = estado;
		this.sueldo = sueldo;
		this.tipoCobro = tipoCobro;
		this.cantidadDeHorasTrabajadas = canthoras;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public double getCantidadDeHorasTrabajadas() {
		return this.cantidadDeHorasTrabajadas;
	}
	
	public TipoCobro getTipoCobro() {
		return tipoCobro;
	}
	
	public static ICalculoSueldo liquidarSueldo(Empleado e) {
		if(e.getTipoCobro() == TipoCobro.mensual) {
			return new SueldoMensual();
		} else {
			if(e.getTipoCobro() == TipoCobro.porHora) {
				return new SueldoPorHora();
			}
		}
		return null;
	}
}
