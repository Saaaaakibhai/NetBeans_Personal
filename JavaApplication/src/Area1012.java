import java.io.IOException;
import java.util.Scanner;

public class Area1012 {
 
    public static void main(String[] args) throws IOException {
    	float A,B,C;
             Scanner input = new Scanner(System.in);
              A =input.nextFloat();
              B =input.nextFloat();
              C =input.nextFloat();
             float triangle = (float) ((.5) * A * C);
             float circle = (float) (3.14159 * C * C);
             float trapezium = (C/2)*(A+B);
             float square = B*B;
             float rectangle = A * B;
             System.out.printf("TRIANGULO:"+triangle);
             System.out.printf("CIRCULO:"+circle);
             System.out.printf("TRAPEZIO:"+trapezium);
             System.out.printf("QUADRADO:"+square);
             System.out.printf("RETANGULO:"+rectangle);
            input.close();
    }
 
}