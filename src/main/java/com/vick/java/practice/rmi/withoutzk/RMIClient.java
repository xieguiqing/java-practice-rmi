package com.vick.java.practice.rmi.withoutzk;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		ILogin login= (ILogin) Naming.lookup("rmi://127.0.0.1:6060/ILogin");
		login.login();
		
		IOrder order = (IOrder) Naming.lookup("rmi://127.0.0.1:6060/IOrder");
		order.placeOrder();
	}

}
