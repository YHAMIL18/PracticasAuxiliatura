package Tarea6;
import java.util.ArrayList;
import java.util.List;
public class Edificio {
	//Atributos
	private String nombre;
	private double superficie;
	private int cantDepartamentos;
	private List<Departamento> deps;
	private Parqueo parqueo;
	//Metodos
	public Edificio(String nom, double superf, List<Departamento> deps) {
		this.nombre=nom;
		this.superficie=superf;
		this.cantDepartamentos=0;
		this.deps=deps;
	}
	public void AddDeparYHabi(List<Departamento> dep,int nroP, int nroPi,List<Habitacion> hab, String nom, double ta, List<Mueble> mueble) {
		int c=0;
		Departamento d1=new Departamento(nroP, nroPi,hab);
		Habitacion h1=new Habitacion(nom, ta, mueble);
		if(!dep.contains(d1)) {
			dep.add(d1);
			cantDepartamentos++;
		}
		if(!hab.contains(h1)) {
			hab.add(h1);
		}
	}
	public void AgregarHab(Habitacion h, List<Habitacion> ha) {
		if(!ha.contains(ha)) {
			ha.add(h);
		}
	}
	public void AgregarMueble(List<Mueble> m, Mueble m1, int Puerta, int Piso) {
		if(!m.contains(m1)) {
			m.add(m1);
		}
	}
	public void AgregarParqueo(Parqueo p) {
		this.parqueo=p;
	}
	public void MasHabs(List<Departamento> ha1) {
		int mayor=0;
		int piso=0;
		for(int i=0;i<ha1.size();i++) {
			if(ha1.get(i).getHab().size()>mayor) {
				mayor=ha1.get(i).getHab().size();
				piso=ha1.get(i).getNroPiso();
			}
		}
		System.out.println("El Piso "+piso+" tiene "+mayor+" habitaciones");
	}
	public void MasMuebles(List<Departamento> dep) {
		int mayor=0;
		System.out.println("Departamentos con mas muebles");
		for(int y=0;y<dep.size();y++) {
			Departamento deps=dep.get(y);
			for(int h=0;h<deps.getHab().size();h++) {
				Habitacion hab=deps.getHab().get(h);
				if(hab.getCantMuebles()>=mayor) {
					mayor=hab.getCantMuebles();
					System.out.println(dep.get(y));
				}
			}
		}
	}
	public void nombreHab(List<Departamento> dep) {
		int c=1;
		int mayor=0;
		for(int i=0;i<dep.size();i++) {
			if(dep.get(i).getNroPiso()==dep.get(c).getNroPiso()) {
				c++;
				for(int j=0;j<dep.get(i).getHab().size();j++) {
					if(dep.get(i).getHab().get(j).getCantMuebles()>mayor) {
						mayor=dep.get(i).getHab().get(j).getCantMuebles();
						System.out.println(dep.get(i).getHab().get(j).getNombre());
					}
				}
			}
		}
	}
	public void EliminarHab(List<Departamento> dep) {
		int c=0;
		for(int i=0;i<dep.size();i++) {
			Departamento deps=dep.get(i);
			if(deps.getHab().size()%(i+1)==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("nroHab primo");
		}
	}
	public String toString() {
		return "[Nombre: "+nombre+", Departamentos: "+cantDepartamentos+" "+parqueo+" "
				+"Departamentos: "+deps+"]";
	}
}
class Departamento{
	private int nroPuerta;
	private int nroHab;
	private int nroPiso;
	private List<Habitacion> hab;
	
	public Departamento(int nroP, int nroPi, List<Habitacion> hab) {
		this.nroPuerta=nroP;
		this.nroHab=0;
		this.nroPiso=nroPi;
		this.hab=hab;
	}
	public void AgregarHab(Habitacion h, List<Habitacion> ha) {
		if(!ha.contains(h)) {
			ha.add(h);
			nroHab++;
		}
	}
	public List<Habitacion> getHab() {
		return hab;
	}
	public int getNroHab() {
		return nroHab;
	}
	public int getNroPiso() {
		return nroPiso;
	}
	public String toString() {
		return "{NroPuerta: "+nroPuerta+", NroPiso: "+nroPiso+" "+"Habitaciones "+hab+"}";
	}
}
class Habitacion{
	private String nombre;
	private double tamanio;
	private int cantMuebles;
	private List<Mueble> mueble;
	
	public Habitacion(String nom, double ta, List<Mueble> mueble) {
		this.nombre=nom;
		this.tamanio=ta;
		this.cantMuebles=0;
		this.mueble=mueble;
	}
	public String getNombre() {
		return nombre;
	}

	public int getCantMuebles() {
		return cantMuebles;
	}

	public List<Mueble> getMueble() {
		return mueble;
	}

	public String toString() {
		return "{Nombre: "+nombre+", Tamaño: "+tamanio+", cantMuebles: "+cantMuebles+"}";
	}
	
}
class Mueble{
	private String tipo;
	private String material;
	
	public Mueble(String ti, String ma) {
		this.tipo=ti;
		this.material=ma;
	}
	public String toString() {
		return "{Tipo: "+tipo+", Material: "+material+"}";
	}
}

class Parqueo{
	private int capacidad;
	private int cantAuto;
	private List<String> placa;
	private double precioH;
	
	public Parqueo(int ca, double precioH, List<String> placa) {
		this.capacidad=ca;
		this.precioH=precioH;
		this.cantAuto=0;
		this.placa=placa;
	}
	public void AgregarPlaca(String p) {
		if(!placa.contains(p)) {
			placa.add(p);
			cantAuto++;
		}
	}
	public String toString() {
		return "{Capacidad:"+capacidad+", Placas: "+placa+", cantAuto: "+cantAuto+"}";
	}
}

class Edificando{
	public static void main(String[] args) {
		List<String> placas=new ArrayList<>();
		String p1=new String("1234HDF");
		String p2=new String("5575DHZ");
		Parqueo par=new Parqueo(20, 6.5, placas);
		par.AgregarPlaca(p1);
		par.AgregarPlaca(p2);
		
		
		List<Mueble> muebles=new ArrayList<>();
		Mueble m1=new Mueble("Silla","Madera");
		Mueble m2=new Mueble("Mesa","Metal");
		
		List<Mueble> muebles2=new ArrayList<>();
		Mueble m3=new Mueble("Tocador","Madera");
		Mueble m4=new Mueble("Cama","Madera");
	
		List<Habitacion> hab1=new ArrayList<>();
		List<Habitacion> hab2=new ArrayList<>();
		
		List<Departamento> dep1=new ArrayList<>();
		
		Edificio d=new Edificio("Victoria",200,dep1);
		d.AgregarParqueo(par);
		
		d.AddDeparYHabi(dep1,37, 3, hab1, "Sala", 6, muebles);
		d.AddDeparYHabi(dep1,24, 1, hab2, "Cuarto", 4, muebles2);
		
		Habitacion h1=new Habitacion("Cuarto",5,muebles2);
		
		d.AgregarHab(h1,hab1);
		
		d.MasHabs(dep1);
		
		Mueble s1=new Mueble("Estante","Madera");
		d.AgregarMueble(muebles, s1, 37, 3);
		
		System.out.println(d);
		d.MasMuebles(dep1);
		
		System.out.println("-------------------------------");
		d.EliminarHab(dep1);
		
		
		
	}
}