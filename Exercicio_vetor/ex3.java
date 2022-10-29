import java.util.Scanner;

public class ex3 {
	
	public static void recebe(int[] vet1, int[]vet2) {
		
		int contador=0,contador2=0;
		
		int vet3[] = new int[vet1.length*2];
		
		for(int c=1; c<vet3.length;c+=2) {
			
			vet3[c]=vet1[contador];
			contador++;
			
		}
		
		for(int c=0; c<vet3.length;c+=2) {
			
			vet3[c]=vet2[contador2];
			contador2++;
			
		}
		
		for(int c=0; c<vet3.length;c++) {
			
			System.out.println(vet3[c]);
			
		}
			

	}
	
	
	public static void preenche() {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int vet1[]= new int[5];
		int vet2[]= new int[5];
		
		System.out.println("Preencha o vetor 1");
		for(int conta=0;conta< vet1.length;conta++) 
		{
			vet1[conta]=teclado.nextInt();
		}
		
		System.out.println("Preencha o vetor 2");
		for(int conta=0;conta< vet1.length;conta++) 
		{
			vet2[conta]=teclado.nextInt();
		}
		
		recebe(vet1,vet2);
	
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		preenche();
		teclado.close();

	}

}
