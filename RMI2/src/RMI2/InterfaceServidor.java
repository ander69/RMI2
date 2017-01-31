package RMI2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServidor extends Remote {
	int operacion(int num1, int num2, String operador) throws RemoteException;

	

}
