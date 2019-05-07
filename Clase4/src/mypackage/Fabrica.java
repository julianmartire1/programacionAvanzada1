package mypackage;

public class Fabrica {
	public Conexion getConexion(String s) {
		if("oracle".equals(s)) {
			return new ConexionOracle();
		} else {
			return new ConexionMySql();
		}
	}
}
