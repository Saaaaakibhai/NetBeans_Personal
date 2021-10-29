
package Class03;

public class RandomNumber {
                //Random Number 
		//Formula 
		//(num2-num1+1)+num1)
		public static void main(String[] args) 
            {
		int num1 = 1;
		int num2 = 6;
		int rnum = (int)(Math.random()*(num2-num1+1)+num1);
		System.out.println(rnum);
            }
}
