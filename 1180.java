import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner(System.in);
		
		int N = entrada.nextInt();
		int menor = 0, pos = 0;
		
		for(int i = 0; i < N; i++) {
			int num = entrada.nextInt();
			
			if(i == 0) {
				menor = num;
				pos = 0;
			}
			else {
				if(num < menor){
					menor = num;
					pos = i;
				}
			}
			
		}
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + pos);
 
    }
 
}
