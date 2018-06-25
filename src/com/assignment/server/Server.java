package com.assignment.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.assignment.rmi_interface.Interface;

public class Server extends UnicastRemoteObject implements Interface {
	private static final long serialVersionUID = 1L;

	protected Server() throws RemoteException {
		super();
	}

	@Override
	public String helloTo(String name) throws RemoteException{
		System.err.println(name + " just connected and wants to communicate!");
		return "Server says hello to " + name;
	}
	
	public static void main(String[] args){
		try {
			Naming.rebind("//localhost/MyServer", new Server());
            System.err.println("Ready for communication");
            
        } catch (Exception e) {
        	System.err.println("Fatal server exception: " + e.toString());
          e.printStackTrace();
        }
	}
}
