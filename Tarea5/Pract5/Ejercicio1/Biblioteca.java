package Tarea5;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
	//Atributos
	private String nombre;
	private int cantlibros;
	private List<Libro> libros;
	//Metodos
	public Biblioteca(String nom, int cantlibros, List<Libro> libros) {
		this.nombre=nom;
		this.cantlibros=cantlibros;
		this.libros=libros;
	}
	public void AgregarLibro(Libro l) {
		if(!libros.contains(l)) {
			libros.add(l);
			this.cantlibros++;
		}
	}
	public void Verificar(Libro l) {
		getNombre();
		for(int i=0;i<libros.size();i++) {
			if(libros.get(i).getNombre()==l.getNombre()) {
				System.out.println(l.mostrarDatos());
				System.out.println("");
			}
		}
	}
	public void mostrarBiblio(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("[Bibliteca: "+this.nombre+", " + libros.get(i));
		}
	}
	public void MasLibros(Biblioteca b) {
		if(cantlibros==b.cantlibros) {
			System.out.println("Las bibliotecas tienen la misma cantlibros");
			this.mostrarBiblio(cantlibros);
			System.out.println("--------------------------------------------");
			b.mostrarBiblio(b.cantlibros);
		}
		else {
			if(cantlibros>b.cantlibros) {
				System.out.println("La biblioteca "+this.nombre+" tiene mas");
				this.mostrarBiblio(cantlibros);
			}
			else {
				System.out.println("La biblioteca "+b.nombre+" tiene mas");
				b.mostrarBiblio(b.cantlibros);
			}
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
;	public int getCantlibros() {
		return cantlibros;
	}
	public void setCantlibros(int cantlibros) {
		this.cantlibros = cantlibros;
	}
	public String toString() {
		return "[Biblioteca: "+nombre+" {"+libros+"}]"; 
	}
}

class Libro{
	//Atributos
	private String nombre;
	private String autor;
	private int anio;
	//Metodos
	public Libro(String nom, String autor, int anio) {
		this.nombre=nom;
		this.autor=autor;
		this.anio=anio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public String toString() {
		return " Nombre: "+nombre+", Autor: "+autor+", Año: "+anio+"";
	}
	public String mostrarDatos() {
		return "[Nombre: "+nombre+", Autor: "+autor+", Año: "+anio+"]";
	}
}

class Aplicando{
	public static void main(String[] args) {
		Libro l1=new Libro("Titulo", "Yo",2012);
		Libro l2=new Libro("Titulo1","El",2000);
		Libro l3=new Libro("Titulo2","Ella",1997);
		Libro l4=new Libro("Titulo3","Ellos",1987);
		Libro l5=new Libro("Titulo4","Nosotros",1887);
		List<Libro> libros1=new ArrayList<>();
		
		Biblioteca b1=new Biblioteca("Umsa",libros1.size(), libros1);
		
		b1.AgregarLibro(l1);
		b1.AgregarLibro(l2);
		
		List<Libro> libros2=new ArrayList<>();
		Biblioteca b2=new Biblioteca("Admin",libros2.size(),libros2);
		
		b2.AgregarLibro(l3);
		b2.AgregarLibro(l4);
		b2.AgregarLibro(l5);
		
		b2.Verificar(l5);
		
		b1.MasLibros(b2);
	}
}
