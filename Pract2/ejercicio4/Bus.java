package Tar2;
import java.util.Scanner;
public class Bus {
	private String nombre;
	public Bus() {
		this.nombre="";
	}
	public Bus(String nom) {
		this.nombre=nom;
	}
	public void NuevoPasajero() {
		Scanner tc=new Scanner(System.in);
		System.out.println("Subiendo nuevo pasajero");
		System.out.print("Nombre: ");
		this.nombre=tc.nextLine();
	}
	public double CobroDePasajes(int n) {
		return 1.50*n;
	}
	public int AsientosDisponibles(int n) {
		int totaldeasientos=50;
		return totaldeasientos-n;
	}
	protected void finaliza() {
		System.out.println("Finalizado");
	}											
	public static void main(String[] args) {
		Bus b1=new Bus();
		Bus b2=new Bus();
		Bus b3=new Bus();
		Bus buses[]={b1,b2,b3};
		int n=buses.length;
		b1.NuevoPasajero();
		b2.NuevoPasajero();
		b3.NuevoPasajero();
		System.out.println("Cobro de pasajes "+buses[n-1].CobroDePasajes(n));
		System.out.println("Total de Asientos 50");
		System.out.println("Asientos Disponible "+b1.AsientosDisponibles(n));
		b1=null;
		b2=null;
		b3=null;
		System.gc();
	}
}
