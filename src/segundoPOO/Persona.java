package segundoPOO;

public class Persona {
String nombre;
byte edad;
double estatura;
public void saludar() {
	System.out.println(" Hola. Mi nombre es :"+nombre);
	System.out.println(" Encantado de conocerte ");
}
public void cumplirAños() {
	edad++;//incrementamos en 1
	
}
public void crecer(double incremento) {
	estatura+=incremento;//la estatura aumenta segun el incremento
	
}

	// TODO Auto-generated method stub
	
}

