import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner(System.in);
		
		int N = 1, ContA = 0, ContG = 0, ContD = 0;

	    while ( N != 4){
	      N = entrada.nextInt();
	      
	      if (N == 1 ) {
	        ContA++;
	      }else if (N == 2 ) {
	        ContG++;
	      }else if (N == 3 ) {
	        ContD++;
	      }
	    }
	    System.out.println("MUITO OBRIGADO");
	    System.out.println("Alcool: " + ContA);
	    System.out.println("Gasolina: " + ContG);
	    System.out.println("Diesel: " + ContD);
    }
 
}
