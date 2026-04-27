package Tarea5;

public class Gato extends Animal{
	//Atributos
	private boolean cazaRatones;
	private boolean tomaLeche;
	//Metodos
	public Gato(String nom, int edad, String nomDu, boolean sw) {
		super(nom, edad, nomDu);
		this.cazaRatones=false;
		this.tomaLeche=sw;
	}
	
	public boolean isTomaLeche() {
		return tomaLeche;
	}

	public void setTomaLeche(boolean tomaLeche) {
		this.tomaLeche = tomaLeche;
	}

	public String toSring() {
		return super.toString();
	}
}
