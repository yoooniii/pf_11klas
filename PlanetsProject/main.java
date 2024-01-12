import java.util.Scanner;
import java.io.File;

public class Main {
 //Метод за извеждане на номериран списък от масив p от планети, в името на които се съдържа низ s
 private static void show(planet[]p, String s){
  for (int i=0,j=1;i<p.length;i++) {
	  if (p[i].getName().indexOf(s)>=0)
   System.out.printf("%3d. %s\n",j++,p[i].getName());
  }
 }
 //Метод за размяна на местата на две планети в масив a
 public static void swap(planet[]p,int i,int j){
  planet c=p[i];
  p[i]=p[j];
  p[j]=c;
 }
 public static void sort(int crit, planet[]p){
   for (int i=0;i<p.length-1;i++){
	   int k=i;
	   for (int j=i+1;j<p.length;j++)
		   switch(crit){
			   case 1: {
                                if (p[j].compare(p[k])>0) k=j;
				  break;
			   }
			   case 2: {
                                if (p[j].compare2(p[k])>0) k=j;
				  break;
			   }   
		   }
	 swap(p,i,k);
	}
 }

 public static void main(String[] args) {
  Scanner inp; 
  File file; //Входен файл
  planet[] planets;
	  try{ //Опит за отваряне на входния файл
   file=new File("PLANETS.in");
   inp=new Scanner(file);
  }catch(Exception e){
    System.out.println("File not found"); //Съобщение при неуспех
    return;
  }
  //Променливи за четене на параметрите от файла
  int no,sat;
  String s;
  double sz;
 
  int n=inp.nextInt();//Четене на броя описани във файла планети
  planets=new planet[n];//Масив с планети
  inp.nextLine(); //Изчистване на входния буфер
  for(int i=0;i<n;i++){
   s=inp.nextLine(); //Име на планетата
   no=inp.nextInt(); //Номер
   sat=inp.nextInt();// брой сателити
   sz=inp.nextDouble();// маса/size
   inp.nextLine();//Изчистване на входния буфер
   planets[i]=new planet(s,no,sat,sz);//Добавяне към масива на нова планета с прочетените свойства
  }
  inp.close();//Затваряне на входния файл (resursa)
  //Сортиране по приоритетите на зад. 2
  sort(1,planets);
  show(planets,""); //Извеждане на номерирания списък (празният низ е подниз на всеки низ)
  inp=new Scanner(System.in); //За четене от стандартния вход
  System.out.print("Planet name should contain: "); //Подсказка
  s=inp.nextLine();//Търсен подниз
  inp.close();
  //Сортиране намаляващо по брой сателити
  sort(2,planets);
  show(planets,s); //Извеждане на номерирания списък
 }
}
