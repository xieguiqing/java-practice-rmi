package com.vick.java.practice.rmi.withoutzk;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ILogin extends Remote{

	public void login() throws RemoteException;
	
	public void login(String name) throws RemoteException;
}
