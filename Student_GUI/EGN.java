package studentProject;

public class egn {
 private long data;
public egn(long n) {
 data=n;
 }
public egn(String n) {
 try {
 data=Long.parseLong(n);
 } catch(Exception ex) {
 data=0;
 }
}
public boolean isCorrect() { //proverqva korektnostta na egn-to
 if (data>=10000000000L) return false;
 byte[]d=new byte[10]; //pulni se s 0
 long t=data;
 for(int i=9;i>=0;i--) {
 d[i]=(byte)(t%10);
 t/=10;
 }
 int year=10*d[0]+d[1];
 int month=10*d[2]+d[3];
 int day=10*d[4]+d[5];
 if (month>40) {
 month-=40;
 year+=2000;
 }
 else year+=1900;
 if (day<=0||day>31)return false;
 if (month<=0||month>12)return false;
 if ((month==2||month==4||month==6||month==9||month==11)&&day==31) return false;
 if (month==2&&day==30)return false;
 if (month==2&&day==29&&year%4!=0 && year!=1900)return false;
 int s=0; //check suma
 for (int i=8;i>=0;i--) s=2*s+d[i];
 s*=2;
 s=(s%11)%10;
 return s==d[9];
}
public char sex() {
 if (!isCorrect())return '?';
 int s=(int)(data/10)%2;
 return (s==0)?'M':'F';
}
public String birthDate() {
 if (!isCorrect())return "Incorrect!";
 int year=(int) (data/100000000);
 int month=(int) (data/1000000)%100;
 int day=(int) (data/10000)%100;
 if (month>40) {
 month-=40;
 year+=2000;
 }
 else year+=1900;
 return String.format("%02d.%02d.%d", day,month,year);
}
@Override
public String toString() {
 if (!isCorrect())return "incorrect!";
 return String.format("%010d", data);
}

}
