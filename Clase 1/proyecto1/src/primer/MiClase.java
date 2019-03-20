package primer;

public class MiClase {
	
	public int numero;
	private String texto; 
	
	public MiClase() { }
	
	public MiClase(String texto) {
		this.texto = texto;
	}
	
	public void setTexto(String nombre) {
		this.texto = nombre;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero;
		//return super.toString(); ---> ID
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			//Comparar Clases
			if( obj.getClass().equals(this.getClass())) {
				MiClase mC = (MiClase)obj;
				if(mC.getTexto().equals(this.getTexto()) && mC.numero == this.numero ) {
					return true;
				}
			}
		}
		
		return false;		
	}
	
	@Override 
	public int hashCode() {
		int primo = 31;
		
		int resultado = 1;
		
		resultado = this.numero * primo;
		resultado += primo * this.getTexto().hashCode();
		
		return resultado;
	}
}
