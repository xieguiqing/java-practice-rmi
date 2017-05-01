package com.vick.java.practice.rmi.withoutzk;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IOrder extends Remote {
	public void placeOrder() throws RemoteException;
}
