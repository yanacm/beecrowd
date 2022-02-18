import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner(System.in);
		
		double vetor [] = new double [100];
		double N = entrada.nextDouble();
		
		for(int i = 0; i < 100; i++) {
			vetor[i] = N;
			
			System.out.println("N[" + i + "] = " + String.format("%.4f", N));
			
			N = N / 2.0;
		}
 
    }
 
}
