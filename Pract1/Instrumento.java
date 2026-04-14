package Tar1;

public class Instrumento {
	//Atributos
	public String nombre;
	private String material;
	private String tipo;
	//Metodos
	public Instrumento(String no, String mat,String tp) {
		this.nombre=no;
		this.material=mat;
		this.tipo=tp;
	}
	public String toString() {
		return ("Nombre: "+this.nombre+" Material: "+this.material+" Tipo: "+this.tipo);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
