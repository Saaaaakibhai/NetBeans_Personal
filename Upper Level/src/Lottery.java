
import java.util.Scanner;

public class Lottery {
    public static boolean checkforlottery(String s) {
		if(s==null||s.isBlank()) {
			boolean loser = false;

		}
        for(int x=0;x<s.length();x++) {
        	if(!Character.isDigit(s.charAt(x))) {
        		  boolean loser=false;
        	}
            
        }
        boolean Winner= true;
		return Winner;
	}
   public static void main(String[]args) {
	   Scanner input = new Scanner(System.in);
	   String txt = input.nextLine();
           String s = input.nextLine();
	   boolean result = checkforlottery(txt);
	   System.out.println(result); 
   }
}
