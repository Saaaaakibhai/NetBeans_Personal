package URI_PRACTICE;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble(); 
        double x2 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double X =  (x2-x1)*(x2-x1);
        //double square1 = Math.pow(X, 2);
        double Y = (y2-y1)*(y2-y1);
       // double square2 = Math.pow(Y, 2);
        double sum = X+Y;
        System.out.println(Math.sqrt(sum));
        
    }
}
