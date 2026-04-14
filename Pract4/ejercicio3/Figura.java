package Tarea4;
public abstract class Figura {
	//Atributos
	protected String color;
	//Metodos
	public Figura(String color) {
		this.color=color;
	}
	protected abstract double obtenerArea();
}

class Cuadrado extends Figura{
	//Atributos
	private int lado;
	//Metodos
	public Cuadrado(String color, int lado) {
		super(color);
		this.lado=lado;
	}
	public double obtenerArea() {
		return lado*lado;
	}
}

class Triangulo extends Figura{
	//Atributos
	private int lado;
	private int lado2;
	private int lado3;
	//Metodos
	public Triangulo(String color, int lado,int lado2,int lado3) {
		super(color);
		this.lado=lado;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	public double obtenerArea() {
		double s=(lado+lado2+lado3)/2;
		double f=(s-lado)*(s-lado2)*(s-lado3);
		return Math.sqrt((s*f));
	}
}

class Redondo extends Figura{
	//Atributos
	private int radio;
	//	Metodos
	public Redondo(String color, int radio) {
		super(color);
		this.radio=radio;
	}
	public double obtenerArea() {
		return Math.PI*radio*radio;
	}
}

class Aplicacion{
	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado("Cyan",3);
		Cuadrado c2=new Cuadrado("Azul",2);
		Triangulo t1=new Triangulo("Naranja",1,2,3);
		Triangulo t2=new Triangulo("Amarillo",2,3,4);
		Redondo r1=new Redondo("Rojo",3);
		Redondo r2=new Redondo("Morado",2);
	}
}