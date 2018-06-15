package rmi;

import java.rmi.*; 
import java.rmi.server.UnicastRemoteObject; 

public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota
{ 
	private String name; 

	public ObjetoRemoto (String s) throws java.rmi.RemoteException
	 { 
		super(); 
		name = s; 
	} 
	public String sayHello() throws RemoteException
	{
		return "Hello World!";
	} 

}
