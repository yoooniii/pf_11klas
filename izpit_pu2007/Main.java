package izpit_pu2007;

import java.io.File;
import java.util.Scanner;

public class Main {
private static Catalog []cats=new Catalog [100];
private static int N;
	public static void main(String[] args) {
	//	File f=new File("file.txt");
	//	try {
	//	Scanner in=new Scanner(f);
		Scanner in=new Scanner(System.in);
		do {
			System.out.println("Catalog count: ");
			N=in.nextInt();
		}while(N<0||N>100);
		for (int i=0;i<N;i++) {
			int j;
			do {
			System.out.println("Catalog #"+(i+1));
			cats[i]=new Catalog();
			cats[i].inp(true,in);//vuvejda se ot standartniq vhod i ot in
			
			for (j=0;j<i;j++)
				if (cats[j].getName().equals(cats[i].getName()))break;
			}while(j<i);
		}
	//	Catalog c=new Catalog();
	//	c.inp(false, in);
	//	c.inp(true, in);
        in.close();
     //   System.out.println(c);
	// }catch(Exception ex) {
		System.out.println("File not found.");
	}
	}
//}
