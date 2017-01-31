package RMI2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements InterfaceServidor {

	protected Servidor() throws RemoteException{
		super();
		
	}
	public int operacion(int num1, int num2, String operador)throws RemoteException{
		int resultado=0;

		if (operador.equals("+")){
			resultado=num1 + num2;
				
		}else if (operador.equals("-")) {
			resultado=num1-num2;
		}
	
		return resultado;
	}
	
	public static void main(String[] args) {
		try{
			LocateRegistry.createRegistry(1099);
			Servidor obj = new Servidor();
			Naming.rebind("//localhost/Operar", obj);
			
		}catch(RemoteException | MalformedURLException e){
			System.out.println("error en el servidor");
			e.printStackTrace();
		}
		System.out.println("Objeto hola registrado");
		

	}

}