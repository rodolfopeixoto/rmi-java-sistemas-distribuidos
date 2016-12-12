import java.RMI.Remote;
import java.RMI.RemoteExcepetion;

/*
  Classname: Hello
  Comment: The remote interface
*/

public interface Hello extends Remote{
	String Hello() throws RemoteExcepetion;
}