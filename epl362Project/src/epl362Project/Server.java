package epl362Project;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		LocateRegistry.createRegistry(2020);
		Implementation impl=new Implementation();
		Naming.rebind("//localhost:2020/RMI", impl);
		System.out.println("Implementation has been bind to the name RMI and is ready for use");
	}

}
