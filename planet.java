public class planet{
 //Атрибути
 private String name;
 private int number, satCount; 
 private double size;
 //Конструктор по всички данни
 public Planet(String name, int number, int satCount, double size){
  this.name=name;
  this.number=number;
  this.satCount=satCount;
  this.size=size;
 }
 //Гетъри
 public String getName(){
  return name;
 }
 public int getNumber(){
  return number;
 }
 public double getMass(){
  return size;
 }
 public int getSat(){
  return satCount;
 }
 public int compare(planet p){
  if (this.size>p.size) return -1;//По-голяма маса
  if (this.size<p.size) return 1; //По-малка маса
  
  int t=name.length()-p.name.length();//Сравняване на дължините на името
  if (t!=0) return -t; //Ако не са еднакво дълги - обратно на дължината
/* ili   if (this.name.length()>p.name.length()) return -1;
         if (this.name.length()<p.name.length()) return 1;
                     */
  
return p.number-number; //Обратно на близостта до светилото
/* ili t.this.number-p.number;
   return t;
                    */
/* ili //if (this.number<p.number) return -1;
         if (this.number>p.number) return 1; 
         return 0; 
                    */
  
 }
 //Намаляващо по брой сателити
 public int compare2(planet p){
  return -(this.satCount-p.satCount);
  // ili return p.satCount-satCount;
 }
}
