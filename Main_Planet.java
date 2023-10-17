import java.util.Scanner;
import java.io.File;
public class Main {
 //Метод за извеждане на номериран списък от масив a
 // от планети, в името на които се съдържа низ s
 private static void show(Planet a[],String s){
  for (int i=0,j=1;i<a.length;i++) if (a[i].getName().indexOf(s)>=0) {
   if (i<10) System.out.print(' ');
   if (i<100) System.out.print(' ');
   System.out.println(j+++". "+a[i].getName());
  }
 }
 //Метод за размяна на местата на две планети в масив a
 private static void swap(Planet[]a,int i,int j){
  Planet c=a[i];
  a[i]=a[j];
  a[j]=c;
 }
 private static void bubSort1(Planet[]a){
  boolean f;
  int r=a.length;
  do{
   f=false;
   for (int i=0;i<r-1;i++)
	if (a[i].cmp1(a[i+1])>0) {
	 swap(a,i,i+1);
	 f=true;
	}
   r--;
  }while (f);
 }
 private static void bubSort2(Planet[]a){
  boolean f;
  int r=a.length;
  do{
   f=false;
   for (int i=0;i<r-1;i++)
	if (a[i].cmp2(a[i+1])>0) {
	 swap(a,i,i+1);
	 f=true;
	}
   r--;
  }while (f);
 }
 public static void main(String[] args) {
  File file; //Входен файл
  Planet[] L;
  Scanner inp;
  //Променливи за четене на параметрите от файла
  int n,no,sat;
  String s;
  double m;
  try{ //Опит за отваряне на входния файл
   file=new File("PLANETS.in");
   inp=new Scanner(file);
  }catch(Exception e){
    System.out.println("File not found"); //Съобщение при неуспех
    return;
  }
  n=inp.nextInt();//Четене на броя описани във файла планети
  L=new Planet[n];//Масив с планети
  inp.nextLine(); //Изчистване на входния буфер
  for(int i=0;i<n;i++){
   s=inp.nextLine(); //Име на планетата
   no=inp.nextInt(); //Номер,
   sat=inp.nextInt();// брой сателити
   m=inp.nextDouble();// маса
   inp.nextLine();//Изчистване на входния буфер
   L[i]=new Planet(s,no,sat,m);//Добавяне към масива на нова планета 
                               //с прочетените свойства
  }
  inp.close();//Затваряне на входния файл
  //Сортиране по приоритетите на зад. 2
  bubSort1(L);
  show(L,""); //Извеждане на номерирания списък (празният низ е подниз на всеки низ)
  inp=new Scanner(System.in); //За четене от стандартния вход
  System.out.print("Planet name should contain: "); //Подсказка
  s=inp.nextLine();//Търсен подниз
  inp.close();
  //Сортиране намаляващо по брой сателити
  bubSort2(L);
  show(L,s); //Извеждане на номерирания списък
 }
}
