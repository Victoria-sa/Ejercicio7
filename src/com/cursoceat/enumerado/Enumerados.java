package com.cursoceat.enumerado;
import java.util.*;

public class Enumerados {

	enum Talla{
			
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		private String abreviatura;
		
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}	
		
		public String getdameAbreviatura() {
			return abreviatura;
		}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANA, GRANDE, MUY_GRANDE" );
		
		String entradaDatos=lector.next().toUpperCase();
		
		Talla laTalla=Enum.valueOf(Talla.class, entradaDatos);
		System.out.println("Talla=" + laTalla);
		System.out.println("Aabreviatura=" + laTalla.getdameAbreviatura());
		
		
	}

}
