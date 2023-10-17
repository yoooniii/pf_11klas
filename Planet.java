public class Planet{
 //Атрибути
 private String name; //име
 private int number,sat; //номер и брой спътници
 private double mass; //маса
 //Конструктор по всички данни
 public Planet(String nm,int n,int s,double m){
  name=nm;
  number=n;
  sat=s;
  mass=m;
 }
 //Гетъри
 public String getName(){
  return name;
 }
 public int getNumber(){
  return number;
 }
 public double getMass(){
  return mass;
 }
 public int getSat(){
  return sat;
 }
 public int cmp1(Planet b){
  if (mass>b.mass) return -1;//По-голяма маса
  if (mass>b.mass) return 1; //По-малка маса
  int t=name.length()-b.name.length();//Сравняване на дължините на името
  if (t!=0) return -t; //Ако не са еднакво дълги - обратно на дължината
  return b.number-number; //Обратно на близостта до светилото
 }
 //Намаляващо по брой сателити
 public int cmp2(Planet b){
  return b.sat-sat;
 }
}
