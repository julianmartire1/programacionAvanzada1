package mypackage;

//Patron Singleton
public class ManejoString {
	static ManejoString mS;
	private ManejoString() { }
	
	//Patron Singleton
	/*ManejoString ms = null;
	ManejoString manejo = ms.getInstance();*/
	
	public static ManejoString getInstance() {
		if(mS == null) {
			mS = new ManejoString();
		}
		
		return mS;
	}
}
