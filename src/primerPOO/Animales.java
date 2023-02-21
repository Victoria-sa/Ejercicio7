package primerPOO;
//Programacion orientada a objetos
public class Animales {
String nombre;//ATRIBUTOS
int ID;//aATRIBUTOS
int edad;//ATRIBUTOS

//METODOS
public void mostrarNombre() {
	System.out.println(nombre);
}
public void mostrarCaracteristica(String nombreString, int edad, int ID) {
	System.out.println("Mi animal se llama " +  nombreString  + " tiene " + edad + " años y su ID es "+ ID);
	
}

}
