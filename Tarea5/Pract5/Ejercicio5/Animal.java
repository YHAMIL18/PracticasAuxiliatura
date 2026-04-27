package Tarea5;

public class Animal {
	//Atributos
	protected String nombre;
	protected int edad;
	protected String nombreDueño;
	//Metodos
	public Animal(String nom, int edad, String nomDu) {
		this.nombre=nom;
		this.edad=edad;
		this.nombreDueño=nomDu;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}

	public String toString() {
		return "{Nombre: "+nombre+", Edad: "+edad+", NomDueño: "+nombreDueño+"}";
	}
}
