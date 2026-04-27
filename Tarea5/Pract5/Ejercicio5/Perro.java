package Tarea5;

public class Perro extends Animal {
	//Atributos
	private boolean requiereBosal;
	private boolean ladraFuerte; 
	//Metodos
	public Perro(String nom, int edad, String nomDu) {
		super(nom, edad, nomDu);
		this.requiereBosal=true;
		this.ladraFuerte=true;
	}
	
	public String toSring() {
		return super.toString();
	}
}

