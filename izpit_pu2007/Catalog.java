package izpit_pu2007;

import java.util.Arrays;
import java.util.Scanner;

public class Catalog {
private String name="";//ime na faila
private String[] files=new String [20];//masiv s failovete 
private int count=0;
public void inp(boolean stdin, Scanner in) {
	if (stdin) System.out.print("Catalog name: ");
	name=in.next();
	if (stdin) System.out.print("File count: ");//podskazka
	count=in.nextInt();
    in.nextLine(); //izchistwame bufera
    for (int i=0;i<count;i++) {
    	if (stdin) System.out.print("File #"+(i+1)+": ");
    	files[i]=in.nextLine();
    }
 }

public String getName() {
	return name;
}
public String getFileName(int n) {
	if (n<0||n>=count) return "";
	int p=files[n].indexOf(".");
	return p<0 ? files[n] : files[n].substring(0,p);
}

public String getFileExt(int n) {
	if (n<0||n>=count) return "";
	int p=files[n].indexOf(".");//parametur za neshto si (index na tochkata)
	return p<0 ? "" : files[n].substring(p+1); //da vyrne prazniq niz, inache 
}

public String getFile(int n) {
	if (n<0||n>=count) return "";
	return files[n];
}

@Override
public String toString() {
	String s=name+"\n";
	for (int i=0;i<count;i++)
		s+=files[i]+"\n";
	return s;
}
private int compare(int i,int j) {
	if (getFileName(i).compareTo(getFileName(j))!=0)
		return (getFileName(i).compareTo(getFileName(j)));
	return (getFileExt(i).compareTo(getFileExt(j)));
	
}
public void sortFiles() {
	
}

}
