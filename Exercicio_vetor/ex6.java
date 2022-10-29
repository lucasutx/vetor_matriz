import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 int soma=0;
		 int matriz[][]= new int [4][4];

			for(int l =0; l < matriz.length; l++) {
				
				for(int j=0; j<matriz[0].length; j++) {
					System.out.println("Infome um número:");
					matriz[l][j]=ler.nextInt();
				}
			}
			for (int i=0;i<matriz.length;i++) 
			{
				for (int j=0;j<matriz.length;j++) 
				{
					if (i>j) 
					{
						soma +=matriz[i][j];	 
					}
					
				}
			}
			System.out.println("A soma dos números abaixo da diagonal principal é = "+soma);
			System.out.println("Diagonal principal:");
			
			for (int k=0;k<matriz.length;k++) 
			{
					System.out.print(matriz[k][k]+"\t");
			}
		ler.close();

	}

}

