package com.assignment.rmi_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
	public String helloTo(String name) throws RemoteException;
}