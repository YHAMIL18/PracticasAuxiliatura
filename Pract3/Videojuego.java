package Tarea3;
import java.util.Scanner;
// Autor:Victor Yhamil Gutierrez Acarapi
public class Videojuego {
	//Atributos
	private String nombre;
	private String plataforma;
	private int cantjugadores;
	//Metodos
	public Videojuego() {
		this.nombre="";
		this.plataforma="";
		this.cantjugadores=0;
	}
	public Videojuego(String nom, String pla) {
		this.nombre=nom;
		this.plataforma=pla;
	}
	public Videojuego(String pla) {
		this.nombre="";
		this.plataforma=pla;
		this.cantjugadores=0;;
	}
	public void agregarJugadores() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese nombre del jugador: ");
		this.nombre=sc.nextLine();
	}
	public String agregarJugador(int n) {
		return "Cantidad de jugadores: "+n;
	}
	public String toString() {
		return "[Nombre: "+this.nombre+", Plaforma: "+this.plataforma+"]";
	}
	protected void fibaloize() {
		System.out.println("Finalizado");
	}
	public static void main(String[] args) {
		Videojuego v1=new Videojuego("Xbox");
		Videojuego v2=new Videojuego("Dorian","pc");
		Videojuego jugadores[]= {v1,v2};
		int n=jugadores.length;
		v1.agregarJugadores();
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v1.agregarJugador(n));
		v1=null;
		v2=null;
		System.gc();
	}

}
