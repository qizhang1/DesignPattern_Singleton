/* Singleton Example using double locking Lazy initialization
*/
public class Singleton2 {
	private static Singleton2 instance = null;
	
	// *****no public constructor!*****
	private Singleton2() {
	// do stuff to make the object...
	}
	
	public static synchronized Singleton2 getInstance() {
		if (instance == null)
		{
			synchronized(Singleton2.class)
			{
				if (instance == null)
				{
					instance = new Singleton2();
				}
			}            
		}
		return instance;
	}
	
	public void doSomething(){
		//Singleton does something!
	}
}
