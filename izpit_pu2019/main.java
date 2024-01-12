package izpit_pu2019;

public class main {
  private Stars[] stars=new Stars[2000]; 
	public static void main(String[] args) {
		Stars s=new Stars(); //syzdavame obekt tip zvezda
        s.inp();
        System.out.println(s);
        System.out.println(Stars.classif(7));// nqma nujda da syzdavame obekt
	}

}
