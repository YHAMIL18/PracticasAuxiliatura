package Tarea5;
import java.util.ArrayList;
import java.util.List;
public class Aplicacion {
	public static void main(String[] args) {
		Perro p1=new Perro("Max",3,"Alan");
		Perro p2=new Perro("Wolfy",5,"Alex");
		Perro p3=new Perro("Manchister",12,"yhamil");
		Perro p4=new Perro("Mix",3,"David");
		List<Perro> perros=new ArrayList<>();
		
		Gato g1=new Gato("Loky",5,"Yhamil",false);
		Gato g2=new Gato("Leo",6,"Pedro",true);
		Gato g3=new Gato("Demostenes",5,"David",false);
		Gato g4=new Gato("Canela",12,"Yhamil",false);
		List<Gato> gatos=new ArrayList<>();
		
		CentroVeterinario c1=new CentroVeterinario("Pet",perros.size(), perros, gatos.size(), gatos);
		
		c1.AgregarP(p1);
		c1.AgregarP(p2);
		c1.AgregarP(p3);
		c1.AgregarP(p4);
		
		c1.OrdenarP();
		
		c1.AgregarG(g1);
		c1.AgregarG(g2);
		c1.AgregarG(g3);
		c1.AgregarG(g4);

		c1.OrdenarG();
		
		System.out.println(c1);
		
		
		c1.VerDueño();
		
		c1=null;
		System.gc();
	}
}
