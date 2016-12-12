import java.RMI.Naming;
import java.RMI.RemoteException;

/*
Classname: HelloClient
Comment: The RMI cliente
*/

public class HelloClient {
	static String message = "blank";
	// The Hello object "obj" is identifier that is

	// the Hello interface
	static hello obj = null;

	//The Hello interface
	static Hello obj = null;

	public static void main(String[] args) {
      try{
      	obj = (Hello)Naming.lookup("//"+"kvist.cs.umu.se"+"/Hello");
      	System.out.println("Messagem no servidor RMI de: \"" + message + "\"");
      }catch(Exception e){
        System.out.println("HelloClient exception: " + e.getMessage());
        e.printStackTrace();
      }
	}
}