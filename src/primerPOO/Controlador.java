package primerPOO;
public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar la clase...declarar miAnimal como un objeto de la clase Animales
		Animales miAnimal=new Animales();
		miAnimal.nombre="Misifu";
		miAnimal.ID=1;
		miAnimal.edad=14;
		miAnimal.mostrarNombre();
		miAnimal.mostrarCaracteristica(miAnimal.nombre, miAnimal.edad,miAnimal.ID );
		miAnimal.nombre="GUffi";//cambiar nombre
		miAnimal.mostrarNombre();
		

	}

}
