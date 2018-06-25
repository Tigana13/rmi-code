package com.assignment.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.assignment.rmi_interface.Interface;

public class Client {
	private static Interface look_up;

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		look_up = (Interface) Naming.lookup("//localhost/MyServer");
		String txt = JOptionPane.showInputDialog("Hey there. Welcome to this communication. Where were you born?");
			
		String response = look_up.helloTo(txt);
		JOptionPane.showMessageDialog(null, response);
	}
}
