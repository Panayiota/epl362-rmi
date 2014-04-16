package epl362Project;
/**
 * @author Peggy
 *
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementation extends UnicastRemoteObject implements Communication {
private static final long serialVersionUID=1L;
public Implementation() throws RemoteException{
	super();
}
@Override
/**
 * Communication Tester method
 */
public String Communicate() throws RemoteException {
	// TODO Auto-generated method stub
	return "Server Says Hi";
}
}
