package epl362Project;

import java.rmi.Naming;

public class client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
String url=new String("rmi://localhost:2020/RMI");
Communication comm=(Communication)Naming.lookup(url);
System.out.println(comm.Communicate());
	}

}
