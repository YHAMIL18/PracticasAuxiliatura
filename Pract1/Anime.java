package Tar1;

public class Anime {
	//Atributos
	public String nombre;
	public String genero;
	private int nroEpisodios;
	private String[] episodios; 
	//Metodo
	public Anime(String nom, String gen,int nrpi) {
		this.nombre=nom;
		this.genero=gen;
		this.nroEpisodios=nrpi;
	}
	public String toString() {
		return("Nombre: "+this.nombre+" Genero: "+this.genero+" NroEpi: "+this.nroEpisodios);
	}
	
}
