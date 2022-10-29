import java.util.Scanner;

public class ex1 {
	
	public static void medias(double[] notas) 
	{
		
		
		double media;
		double soma=0;
		int acimaDaMedia=0;
		
		for(int conta=0;conta<notas.length;conta++) 
		{
			soma+=notas[conta];
			
		}
		
		
		media = soma/notas.length;
		System.out.println("A média da turma é:"+media);
		
		for(int conta=0;conta<notas.length;conta++) 
		{
			if(notas[conta]>media) {
				acimaDaMedia++;
			}
		}
		
		System.out.println("O número de alunos acima da média é:"+acimaDaMedia);
	}
	
	public static void preencher() {
		
		Scanner teclado = new Scanner(System.in);
		
		double notas[] = new double[10];
		
		for(int conta=0;conta<notas.length;conta++) {
			
			System.out.println("Insira as notas");
			notas[conta]=teclado.nextDouble();
		}
		
		medias(notas);
		
		
	}
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			
		preencher();
		
		
			
		teclado.close();
		}
		
		
		
		

	}

