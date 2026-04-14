package Tar1;
// autor : Victor Gutierrez A.
public class ProyPrin {
	public static void main(String[] args) {
		Anime a1=new Anime("JJK", "Accion", 48);
		Anime a2=new Anime("OnePiece","Fantasia",1000);
		System.out.println("---------------------ANIMES---------------------");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println("------------------------------------------------");
		
		Televisor t1=new Televisor("LG",1080,"oled");
		Televisor t2=new Televisor("Samsung",1080,"ips");
		System.out.println("------------------TELEVISORES-------------------");
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println("------------------------------------------------");
		
		Instrumento i1=new Instrumento("guitarra","madera","cuerda");
		Instrumento i2=new Instrumento("flauta","plastico","aire");
		System.out.println("-----------------INSTRUMENTOS-------------------");
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println("------------------------------------------------");
		
		
	}
}
