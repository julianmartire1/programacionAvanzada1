package mypackage;

public class SueldoPorHora implements ICalculoSueldo {

	@Override
	public double Calcular(Empleado e) {
		return e.getSueldo() * e.getCantidadDeHorasTrabajadas();
	}

}
