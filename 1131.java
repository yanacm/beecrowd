import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner(System.in);
		
		int resp = 1, grenal = 0, vitoriasGremio = 0, vitoriasInter = 0, empate = 0;

	    while(resp == 1){

	    grenal++;
	    
	    int x = entrada.nextInt();
	    int y = entrada.nextInt();

	    if(x > y){
	        vitoriasInter++;
	    }
	    else if(x < y){
	        vitoriasGremio++;
	    }
	    else if(x == y){
	        empate++;
	    }

	    System.out.println("Novo grenal (1-sim 2-nao)");

	    resp = entrada.nextInt();

	    }

	    System.out.println(grenal + " grenais");
	    System.out.println("Inter:" + vitoriasInter);
	    System.out.println("Gremio:" + vitoriasGremio);
	    System.out.println("Empates:" + empate);

	    if(vitoriasInter > vitoriasGremio){
	    	System.out.println("Inter venceu mais");
	    }
	    else if(vitoriasInter < vitoriasGremio){
	    	System.out.println("Gremio venceu mais");
	    }
	    else if(vitoriasInter == vitoriasGremio){
	    	System.out.println("Nao houve vencedor");
	    }
 
    }
 
}
