
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER-GT
 */
public class Demo01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        double sum =0;
		for (int i = 0; i <n; i++)
		{
                     sum += i;
		}
		
		double avg = sum / 10;
    }
}
