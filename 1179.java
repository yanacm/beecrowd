import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner(System.in);
		
	    int vetpar [] = new int[15];
	    int vetimpar [] = new int[15];
	    int i = 0, j = 0, k = 0, z = 0, a = 0;

	    	
	    for(i = 0; i<15 ; i++){
	    	
	    	int n = entrada.nextInt();
	    	
	    	if(n %2 == 0){
	    			vetpar[j] = n;
	    			j++;
	    		if(j == 5){
	    			j = 0;
	    			for(z = 0; z < 5; z++){
	    				System.out.println("par["+z+"] = "+ vetpar[z]);
	    			}		
	    		}
	    	}	
	    	else{
	    		vetimpar[k] = n;
	    		k++;
	    			if(k == 5){
	    			   k = 0;
	    			   for(a = 0; a<5 ; a++){
	    				   System.out.println("impar["+a+"] = "+vetimpar[a]);
	    			   }			
	    			}
	    	}
	    }	
	    for( i = 0; i < k ; i++){
	    	System.out.println("impar["+i+"] = "+vetimpar[i]);
	    }
	    for( i = 0; i < j ; i++){
	    	System.out.println("par["+i+"] = "+vetpar[i]);
	    }
 
    }
 
}
