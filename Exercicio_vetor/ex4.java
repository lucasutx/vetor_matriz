import java.util.Scanner;

public class ex4 {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int temp[] = new int[5];
		int maior=0, menor = Integer.MAX_VALUE;
		int soma=0,media=0,cont=0;
		
		
		System.out.println("Digite as temperaturas");
		
		for(int conta=0;conta<temp.length;conta++) 
		{
			temp[conta]=teclado.nextInt();
			soma+=temp[conta];
      
		}
		
		
		for(int conta=0;conta<temp.length;conta++) 
		{
			
			if(maior<temp[conta]) {
				
				maior=temp[conta];
			}
			
			if(menor>temp[conta]) {
				
				menor=temp[conta];
			}
      
		}
		
		media=soma/temp.length;
		
		System.out.println("A maior temperatura é: "+maior);
		System.out.println("A menor temperatura é: "+menor );
		System.out.println("A média das temperaturas é: "+media);
  
		
		for(int conta=0;conta<temp.length;conta++) 
		{
			if(temp[conta]<media) {
				
				cont++;
			}
		}
		
		System.out.println("O número de dias que ficou abaixo da média é: "+cont);
		
		
		teclado.close();

	}

}
