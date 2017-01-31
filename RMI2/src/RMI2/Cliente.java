package RMI2;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int resultado;
		int num1,num2;
		String operador;
		try{
			System.out.println("numero 1 ");
			num1=sc.nextInt();
			System.out.println("numero 2 ");
			num2=sc.nextInt();
			System.out.println("operador ");
			sc.nextLine();
			operador=sc.nextLine();
			InterfaceServidor obj=(InterfaceServidor) Naming.lookup("//localhost/Operar");
			resultado=obj.operacion(num1,num2,operador);
			System.out.println(resultado);
		
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
