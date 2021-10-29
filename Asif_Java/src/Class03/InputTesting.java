package Class03;
import java.util.Scanner;
public class InputTesting {
    public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Id: ");
		int id = input.nextInt();
		//input.nextLine();
		System.out.print("Enter your CGPA: ");
		double cgpa = input.nextDouble();
		input.nextLine();//Important 
		System.out.print("Enter your full name: ");
		String name = input.nextLine();
		
		System.out.println("ID: "+id);
		System.out.println("CGPA: "+cgpa);
		System.out.println("Name: "+name);
		
		input.close();
    }
}
