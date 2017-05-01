package com.vick.java.practice.rmi.withoutzk;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LoginImpl extends UnicastRemoteObject implements ILogin {

	protected LoginImpl() throws RemoteException {
	}

	public void login() throws RemoteException {
		System.out.println("login");
	}

	public void login(String name) throws RemoteException{
		System.out.println(name + "  login");
	}

}
