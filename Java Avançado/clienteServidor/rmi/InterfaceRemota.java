package rmi;

public interface InterfaceRemota extends java.rmi.Remote 
{ 
	String sayHello() throws java.rmi.RemoteException; 
} 

