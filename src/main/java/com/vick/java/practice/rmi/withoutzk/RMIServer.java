package com.vick.java.practice.rmi.withoutzk;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		ILogin login = new LoginImpl();
		//制定端口注册
		LocateRegistry.createRegistry(6060); 
		Naming.bind("rmi://localhost:6060/ILogin",login); 
		
		IOrder order = new OrderImpl();
		Naming.bind("rmi://localhost:6060/IOrder",order); 
	}

}
