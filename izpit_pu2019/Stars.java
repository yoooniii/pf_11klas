package izpit_pu2019;

import java.util.Scanner;

public class Stars {
	private String name="", cons="";
	private double dist, mass;//razstoqnie i masa
	private int clas;//klasifikaciq
	public Stars(String name, String cons, double dist, double mass, int clas) {
		this.name = name;
		this.cons = cons;
		this.dist = dist;
		this.mass = mass;
		this.clas = clas;
	}
	public void inp() {
		Scanner in=new Scanner(System.in);
		System.out.print("Star: ");
		name=in.nextLine();
		System.out.print("Constilation: ");
		cons=in.nextLine();
		System.out.print("Distance: ");
		dist=in.nextDouble();
		System.out.print("Mass: ");
		mass=in.nextDouble();
		System.out.print("Classification (1=õèïåðãèãàíòè,\r\n"
				+ "2=ñâðúõãèãàíòè, 3=ÿðêè ãèãàíòè, 4=ãèãàíòè, 5=ñóáãèãàíòè, 6=äæóäæåòà,\r\n"
				+ "7=ñóáäæóäæåòà, 8=÷åðâåíè äæóäæåòà, 9=êàôÿâè äæóäæåòà): ");
		clas=in.nextInt();
		in.nextLine();
		in.close();
	}
	
	public Stars() {//prazen konstryktor za prazna zvezda
		this("","",0,0,0);//povikvame definiran konstruktor v drug konstruktor (nulira dannite ot drugiq(mai));THIS konstruktor suzdai go po THIS nachin
	}
	
	public static String classif(int clas) {  //statichen metod
		switch(clas) {
		case 1: return "õèïåðãèãàíò";
		case 2: return "ñâðúõãèãàíò";
		case 3: return "ÿðêè ãèãàíò";
		case 4: return "ãèãàíò";
		case 5: return "ñóáãèãàíò";
		case 6: return "äæóäæå";
		case 7: return "ñóáäæóäæå";
		case 8: return "÷åðâåío äæóäæå";
		case 9: return "êàôÿâo äæóäæå";
		} return "";
	}
	public String classif() { //dinamichen metod
		return classif(this.clas); 
	}
	@Override
	public String toString() {
		return  name + ", " +Double.toString(dist).replace(',', '.') + "ñâ.ã., "+
	           classif(clas)+" "+Double.toString(mass).replace(',', '.') + "ñë.ì., "+ cons;
	}
	public int compare1(Stars s) {
		if (this.dist<s.dist) return -1;
		if (this.dist>s.dist) return 1;
		return 0;
	}
    public int compare2(Stars s) {
    	int t=this.cons.compareTo(s.cons);//sravnqvame tekushtiq obekt s parametura mu
    	if (t!=0) return t;
    	if (this.mass<s.mass) return 1;
		if (this.mass>s.mass) return -1;
		return 0;
	}
}
