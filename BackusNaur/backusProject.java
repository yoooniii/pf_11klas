public class backus_project {

	public static void main(String[] args) {
      //System.out.println(isDigit("9"));
      //System.out.println(isNumeric(""));
      //System.out.println(isWord("11111100000"));
	  //System.out.println(isWord1("AAAAAAAAAAAAAAAA"));
	  //System.out.println(isWord2("CAA"));
	  //makeWord(5);
	  //System.out.println(isPara("()()"));
		System.out.println(isParaIt("()()"));
	}
	
	//<digit>::=0|1|2|3|4|5|6|7|8|9
    public static boolean isDigit(String s) {
    	if (s.length()!=1) return false;
    	return s.charAt(0)>='0' && s.charAt(0)<='9';
    }
    
    //<numeric>::=<digit>|<numeric><digit>
    public static boolean isNumeric(String s) {
    	//if (s.equals("")) return false;
    	if (s.length()==0) return false;
    	return isDigit(s) || (isDigit(""+s.charAt(s.length()-1)) && isNumeric(s.substring(0,s.length()-1)));
    }
    
    //<word>::=1|10|1<word>0
    public static boolean isWord(String s) {
    	switch (s.length()) {
    	 case 0: return false;
    	 case 1: return s.equals("1");
    	 case 2: return s.equals("10");
    	// case 3: return s.equals("110");
    	// case 4: return s.equals("1100");
    	// case 5: return s.equals("11100");
    	}
    	return s.charAt(0)=='1' && s.charAt(s.length()-1)=='0' && isWord(s.substring(1,s.length()-1));
    }
    
    //<word1>::=A|AA|BA|A<word1>|B<word1>AB
    public static boolean isWord1 (String s) {
    	switch (s.length()) {
   	      case 0: return false;
   	      case 1: return s.charAt(0)=='A';
   	      case 2: return s.equals("AA") || s.equals("BA");
   	      case 3: return s.equals("AAA") || s.equals("ABA");
   	     // case 4:  return s.equals("BAAB");
        }
    	return s.charAt(0)=='A' && isWord1 (s.substring(1)) || 
    		   s.charAt(0)=='B' && s.substring(s.length()-2).equals("AB") && isWord1(s.substring(1,s.length()-2));
    }
    
    //<word2>::=AB|BC|C<word2>|<word2>AA
    public static boolean isWord2 (String s) {
    	switch (s.length()) {
    	case 0: 
    	case 1: return false;
    	case 2: return s.equals("AB") || s.equals("BC");
    	//case 3: return s.equals("CAB") || s.equals("CBC");
    	}
    	return s.charAt(0)=='C' && isWord2(s.substring(1))
    		|| (s.substring(s.length()-2).equals("AA")) && isWord2(s.substring(1,s.length()-2));
    }
    
    // obratna zadacha
    public static void makeWord(int n) {
    	make(n, "AB");
    	make(n, "BC");
    }
    private static void make(int n, String w) {
    	if (w.length()>n) return; // pravilo za krai s neuspeh 
    	if (w.length()==n) {
    		// obrabotka
    		 System.out.println(w);
    		 return; // pravilo za krai s uspeh 
    	}
    	// rekursivni obrushteniq 
    	make(n,"C"+w);
    	make(n, w+"AA");
    }
    
    //<para>::=()|(<para>)|<para><para>
    public static boolean isPara (String s) {
    	int i=s.length();//dostuput do s.length() e konstanta 
    	if (i==0 || i%2==1) return false;
    	if (i==2) return s.equals("()");
        //if (s.equals("()")) return true;
        if (s.charAt(0)=='(' && s.charAt(s.length()-1)==')' && isPara(s.substring(1,s.length()-1))) return true;
        
        for (int j=2;j<=s.length()-2;j+=2) { //kusame niza na 2 chasti - nachalo do j, j do kraq
        	if (isPara(s.substring(0,j)) && isPara(s.substring(j))) return true;
        }
    	return false;
    }
    public static boolean isParaIt(String s) {
    	int c=0;
    	for (int i=0;i<s.length();i++) {
    		switch(s.charAt(i)) {
    		case '(': c++; 
    		    break;
    		case ')': {
    			c--;
    		  if (c<0) return false;
    			break;
    		}
    		default: return false;
    		}
    	}
    	return !s.equals("") && c==0;
    }
}
