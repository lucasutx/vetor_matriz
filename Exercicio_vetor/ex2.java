
import java.util.Scanner;

public class ex2 {
	
	
	public static void testeN(int[] numeros) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int contaN=0,total=0,conta=0;
		
		int copia1[] = new int[contaN];
		
		for(int c=0;c<numeros.length;c++) {
			
			if(numeros[c]<0) {
				
				total++;
			}
		}
		
		int vetor2[] = new int[total];
		
		for(int j=0;j<numeros.length;j++) {
			
			if(numeros[j]<0) {
				
				vetor2[conta]=numeros[j];
				conta++;
			}
		}
		
		for(int o=0 ; o < vetor2.length; o++) {
			
			System.out.println("Os números negativos são "+vetor2[o]);
		}
		
		
	}
	
	public static void preencher() {
		
		Scanner teclado = new Scanner(System.in);
		
		int elementos[] = new int[10];
		
		System.out.println("Digite os 10 elementos");
		
		for(int conta = 0; conta<elementos.length;conta++) {
			
			System.out.println("Insira");
			elementos[conta]=teclado.nextInt();
			
		}
		
		testeN(elementos);
		
		
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		preencher();
		
		
		teclado.close();

	}

}
