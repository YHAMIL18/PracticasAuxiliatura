package Tarea4;
public class Persona {
	//Atributos
	protected String nombre;
	protected int carnet;
	protected int edad;
	//Metodos
	public Persona(String nombre, int carnet, int edad) {
		this.nombre=nombre;
		this.carnet=carnet;
		this.edad=edad;
	}
	public String toString() {
		return "[Nombre= "+nombre+", Carnet= "+carnet+", edad= "+edad+"]";
	}
	protected void finalize() {
		System.out.println("Finalizado");
	}
}
class Estudiante extends Persona{
	//Atributos
	private int matricula;
	private String carrera;
	//Metodos
	public Estudiante(String nombre, int carnet, int edad, int matri, String carera) {
		super(nombre, carnet,edad);
		this.matricula=matri;
		this.carrera=carera;
	}
	public String VerificarEdad(Docente d1) {
		if(this.edad==d1.edad) {
			return this.nombre+" y "+d1.nombre+" tienen la misma edad";
		}
		else{
			return this.nombre+" y "+d1.nombre+" no tienen la misma edad";
		}
	}
	public String VerificarCarrera(Estudiante e1) {
		if(this.carrera==e1.carrera) {
			return this.nombre+" y "+e1.nombre+" estan en la misma carrera";
		}
		else {
			return this.nombre+" y "+e1.nombre+" no estan en la misma carrera";
		}
	}
	public String toString() {
		return super.toString()+"[Matricula= "+matricula+", Carrera= "+carrera+"]";
	}
	protected void finalize() {
		System.out.println("Finalizado");
	}
}
class Docente extends Persona{
	//Atributos
	private int antiguedad;
	private double sueldo;
	//Metodos
	public Docente(String nombre, int carnet, int edad,int antiguo, double sueldo) {
		super(nombre, carnet,edad);
		this.antiguedad=antiguo;
		this.sueldo=sueldo;
	}
	public String toString() {
		return super.toString()+"[Antiguedad= "+antiguedad+", Sueldo= "+sueldo+"]";
	}	
	protected void finalize() {
		System.out.println("Finalizado");
	}
}
class Aplcacion{
	public static void main(String[] args) {
		Estudiante e1=new Estudiante("Juan",1374923,17,188629,"Informatica");
		Estudiante e2=new Estudiante("Pablo",9987323,45,123234,"Informatica");
		Docente d1=new Docente("Tapia",8909772,45,15,8500);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(d1);
		System.out.println(e1.VerificarEdad(d1));
		System.out.println(e2.VerificarEdad(d1));
		System.out.println(e1.VerificarCarrera(e2));
		e1=null;
		e2=null;
		d1=null;
		System.gc();
	}
}
