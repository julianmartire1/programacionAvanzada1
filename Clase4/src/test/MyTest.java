package test;

import java.util.List;
import java.util.ArrayList;
import mypackage.*;
import org.junit.Test;

import junit.framework.Assert;

public class MyTest {
	@Test
	public void liquidarSueldo() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado("empleado 1", "empleado 1",123,1,10000,TipoCobro.porHora, 10));
		empleados.add(new Empleado("empleado 2", "empleado 2",123,1,20000,TipoCobro.mensual, 20));
		
		for (int i = 0; i < empleados.size(); i++) {
			ICalculoSueldo cal = Empleado.liquidarSueldo(empleados.get(i));
			double sueldo = cal.Calcular(empleados.get(i));
			System.out.println(i+ " - " + sueldo);
		}
		//Assert.assertTrue(true);
	}
}
