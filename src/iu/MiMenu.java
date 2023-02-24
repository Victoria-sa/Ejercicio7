package iu;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArraySet;

public class MiMenu {
	 static public void mostrarMenu() {
	int opcion;
	do {
		System.out.println("Menu+Cotas");
		System.out.println("1. Alta");
		System.out.println("2. Baja");
		System.out.println("3. Salir");
		System.out.println("Tu opcion es -> ");
		opcion=new Scanner(System.in).nextInt();
		switch (opcion ){
		case 1:System.out.println(" Es un Alta");
			break;
		case	2:System.out.println(" Es una Baja ");
			break;
		case 3: System.out.println(" Hasta luego Lucas....");
		  break;
			
		default:System.out.println(" Opcion erronea ");		
		}		
	}while(opcion!=3);
}

}