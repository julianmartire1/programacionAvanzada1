package primer;

public class Otra {

	public static void main(String[] args) {
		MiClase otra = new MiClase();
		MiClase otra2 = new MiClase();
		
		/*if(otra.numero == otra2.numero) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}*/
		
		/*otra.setTexto("hola");
		
		if(otra.getTexto().equals(otra2.getTexto())) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}*/
		
		otra.setTexto("texto");
		otra2.setTexto("texto");
		
		System.out.println(otra.equals(otra2));
	}
	
}