package Tarea3;
import java.util.Scanner;
// Autor: Victor Yhamil Gutierrez Acarapi
public class Aula {
	//Atributos
	private String nombredeaula;
	private int piso;
	private String[] nombre;
	private int[] nota;
	//Metodos
	public Aula(String na,int p){
		this.nombredeaula=na;
		this.piso=p;
	}
	public void leernombre() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese cantidad de estudiantes:");
		int n=sc.nextInt();
		sc.nextLine();
		nombre=new String[n];
		System.out.print("Ingrese nombres de los estudiantes:");
		for(int i=0;i<n;i++) {
			nombre[i]=sc.nextLine();
		}
	}
	public void leernota() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese cantidad de notas:");
		int n=sc.nextInt();
		nota=new int[n];
		System.out.print("Ingrese nota de los estudiantes:");
		for(int i=0;i<n;i++) {
			nota[i]=sc.nextInt();
		}
	}
	public void mostrarnombre(int n, Aula a1) {
		System.out.println("Nombre Estudiante");
		for(int i=0;i<n;i++) {
			System.out.println(nombre[i]);
		}
	}
	public void mostrarnota(int n , Aula a1) {
		System.out.println("Nota sobre 100");
		for(int i=0;i<n;i++) {
			System.out.println(nota[i]);
		}
	}
	public void Evaluacion(int n , Aula a1) {
		for(int i=0;i<n;i++) {
			if(nota[i]<51) {
				System.out.println("Reprobado");
			}
			else {
				System.out.println("Aprobado");;
			}
		}
	}
	public String toString() {
		return "{Nombre de aula: "+this.nombredeaula+" , Piso: "+this.piso+"}";
	}
	protected void finalize() {
		System.out.println("Finalizado");
	}
	public static void main(String[] args) {
		Aula a1=new Aula("Cuarto A",2);
		a1.leernombre();
		a1.leernota();
		System.out.println(a1.toString());
		a1.mostrarnombre(2, a1);
		a1.mostrarnota(2,a1);
		a1.Evaluacion(2,a1);
		a1=null;
		System.gc();
	}
	
}
