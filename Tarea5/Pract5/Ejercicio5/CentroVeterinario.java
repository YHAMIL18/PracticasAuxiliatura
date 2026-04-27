package Tarea5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class CentroVeterinario {
	//Atributos
	private String nombre;
	private int cantPerros;
	private List<Perro> perros;
	private int cantGatos;
	private List<Gato> gatos;
	//Metodos
	public CentroVeterinario(String nombre, int cantP, List<Perro> perros, int cantG, List<Gato> gatos) {
		this.nombre=nombre;
		this.cantPerros=cantP;
		this.perros=perros;
		this.cantGatos=cantG;
		this.gatos=gatos;
	}
	public void AgregarP(Perro p) {
		if(!perros.contains(p)) {
			perros.add(p);
			cantPerros++;
		}
	}
	public void AgregarG(Gato g) {
		if(!gatos.contains(g)) {
			gatos.add(g);
			cantGatos++;
		}
	}
	public void OrdenarP() {
		perros.sort(Comparator.comparingInt(Perro::getEdad));
	}
	public void OrdenarG() {
		for(int i=0;i<gatos.size();i++) {
			if(gatos.get(i).isTomaLeche()==false) {
				gatos.sort(Comparator.comparingInt(Gato::getEdad).reversed());
			}
			else {
				if(gatos.get(i).isTomaLeche()==true) {
					System.out.println("------Beben Leche------");
					System.out.println(gatos.get(i));
				}
				else {
					if(gatos.get(i-1).getEdad()==gatos.get(i).getEdad()) {
						gatos.sort(Comparator.comparing(Gato::getNombre));
					}
				}
				
			}
		}
	}
	public void VerDueño() {
			boolean DueñoDos=false;
			for(int t=0;t<perros.size();t++) {
				for(int i=0;i<perros.size();i++) {
					if(perros.get(i).getNombreDueño().equals(gatos.get(i).getNombreDueño())) {
						System.out.println(perros.get(i).getNombreDueño()+"tiene un perro y un gato");
						DueñoDos=true;
					}
				}
			}
			
			boolean[] cont=new boolean[perros.size()];
			for(int y=0;y<perros.size();y++) {
				if(cont[y]) continue;
				int c=1;
				for(int j=y+1;j<perros.size();j++) {
					if(perros.get(y).getNombreDueño().equals(gatos.get(y).getNombreDueño())) {
						c++;
						cont[j]=true;
					}
				}
				if(c>=2) {
					System.out.println(perros.get(y).getNombreDueño()+" tiene "+cont+" perros");
					DueñoDos=true;
				}
			}
			boolean[] cont2=new boolean[gatos.size()];
			for(int i=0;i<gatos.size();i++) {
				if(cont2[i]) continue;
				int c=0;
				for(int k=i+1;k<gatos.size();k++) {
					if(gatos.get(i).getNombreDueño().equals(gatos.get(i).getNombreDueño())) {
						c++;
						cont2[k]=true;
					}
				}
				if(c>=2) {
					System.out.println(gatos.get(i).getNombreDueño()+" tiene "+c+" gatos");
					DueñoDos=true;
				}
			}
	}
	public String toString() {
		return "[Nombre: "+nombre+", cantP: "+cantPerros+", cantG: "+cantGatos+ perros + gatos +"]";
	}
	protected void finalize() {
		System.out.println("Finalizado");
	}
}
