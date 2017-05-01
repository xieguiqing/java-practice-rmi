package com.vick.java.practice.rmi.withoutzk;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OrderImpl extends UnicastRemoteObject implements IOrder {

	protected OrderImpl() throws RemoteException {
	}

	public void placeOrder() throws RemoteException {
		System.out.println("place order successfully.");

	}

}
