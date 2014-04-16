package epl362Project;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * @author Peggy
 *
 */
public interface Communication extends Remote{
public String Communicate() throws RemoteException;
}
