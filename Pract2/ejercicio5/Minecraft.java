package Tar2;
import java.util.Scanner;
public class Minecraft {
	private String jugador;
	private int diamante;
	
	public Minecraft() {
		this.jugador="";
		this.diamante=0;
	}
	public Minecraft(String ju, int dia) {
		this.jugador=ju;
		this.diamante=dia;
	}
	public void NuevoJuegador() {
		Scanner tc=new Scanner(System.in);
		System.out.println("Agregando nuevo jugador");
		System.out.print("Nombre del jugador:");
		this.jugador=tc.nextLine();
		System.out.print("CantDiamantes:");
		this.diamante=tc.nextInt();
	}
	public int Stacks() {
		return this.diamante/64;
	}
	public int Stacks2() {
		return this.diamante%64;
	}
	
	public String getJugador() {
		return jugador;
	}
	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	public int getDiamante() {
		return diamante;
	}
	public void setDiamante(int diamante) {
		this.diamante = diamante;
	}
	public String toString() {
		return "Nombre del jugador: "+this.jugador+" "+"CantDiamantes: "+this.diamante; 
	}
	protected void finaliza() {
		System.out.println("Finalizado");
	}
	public static void main(String[] args) {
		Minecraft j1=new Minecraft();
		Minecraft j2=new Minecraft("Carlos", 58);
		Minecraft j3=new Minecraft("Dorian",120);
		j1.NuevoJuegador();
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		Minecraft jugadores[]= {j1,j2,j3};
		int n=jugadores.length,sum=0;
		System.out.println("Tiene "+j1.Stacks()+" Stacks"+" y "+j1.Stacks2()+" diamantes");
		System.out.println("Tiene "+j2.Stacks()+" Stacks"+" y "+j2.Stacks2()+" diamantes");
		System.out.println("Tiene "+j3.Stacks()+" Stacks"+" y "+j3.Stacks2()+" diamantes");
		for(int c=0;c<n;c++) {
			sum=sum+jugadores[c].getDiamante();
		}
		System.out.println("Total: "+sum+" diamantes");
		int mayor=0;
		String mayor2="";
		for(int i=0;i<n;i++) {
			if(jugadores[i].getDiamante()>mayor) {
				mayor=jugadores[i].getDiamante();
				mayor2=jugadores[i].getJugador();
			}
		}
		System.out.println("El mayor es: "+mayor2+" con "+mayor);
		j1=null;
		j2=null;
		j3=null;
		System.gc();
	}
}
