package mypackage;

public class SueldoMensual implements ICalculoSueldo {

	@Override
	public double Calcular(Empleado e) {
		return e.getSueldo();
	}

}
