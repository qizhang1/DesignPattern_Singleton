/* Singleton Example using simple Lazy initialization
*  Have only one instance for a class
*/
public class Singleton1 {
	private static Singleton1 instance = null;
	
	// *****no public constructor!*****
	private Singleton1() {
	// do stuff to make the object...
	}
	
	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
	
	public void doSomething()
	{
		//Singleton does something!
	}
}
