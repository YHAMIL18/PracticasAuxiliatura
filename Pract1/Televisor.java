package Tar1;

public class Televisor {
	//Atributos
	private String marca;
	private int resolucion;
	private String tipo;
	//Metodos
	public Televisor(String ma,int re,String ti) {
		this.marca=ma;
		this.resolucion=re;
		this.tipo=ti;
	}
	public Televisor() {
		this.marca="";
		this.resolucion=0;
		this.tipo="";
	}
	public String toString() {
		return ("Marca: "+this.marca+" Resolucion: "+this.resolucion+" Tipo: "+this.tipo);
	}
}
