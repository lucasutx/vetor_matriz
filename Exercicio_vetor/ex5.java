import java.util.Scanner;

public class ex5 {
	
	public static int somasE(int matriz[][] ){
		
	    int soma=0;
			for(int i =0; i < matriz.length; i++) {
				for(int j=0; j<matriz[0].length; j++) {
					    soma+=matriz[i][j];
				}
			}
	  return soma;
			}
	public static int somasD(int matriz[][] ){
			
	    int soma=0;

	    for(int j=1,i =0; i < matriz.length; j--, i++) 
	      {
	            soma+=matriz[i][j];
				}
	  return soma;
			}
	  
	public static int somasC(int matriz[][] ){
			
	    int soma=0;

	    for(int i =0; i < matriz.length; i++) {
				for(int j=0; j<matriz[0].length; j++) {
					if (matriz[i]==matriz[j]){
	            soma+=matriz[i][j];
	        }
				}
			}
			return soma;
		}
	public static int somasB(int matriz[][] ){
			
	    int soma=0;

	    for(int i=0; i<matriz.length;i++){
	        soma+= matriz[i][1];
	    }
			return soma;
		}

	public static int somasA(int matriz[][] ){
			
	    int soma=0;

	    for(int i=0; i<matriz.length;i++){
	        soma+= matriz[1][i];
	    }
			return soma;
		}

		public static void preenche(int [][]matriz){
			Scanner ler = new Scanner(System.in);
			

			for(int i =0; i < matriz.length; i++) {
				for(int j=0; j<matriz[0].length; j++) {
					System.out.println("Infome um número:");
					matriz[i][j]=ler.nextInt();
				}
			}
		   somasA(matriz);
	     somasB(matriz);
	     somasC(matriz);
	     somasD(matriz);
	     somasE(matriz);
		}
		
		public static void main(String[] args) {
			
	    int matriz[][]= new int [2][2];
	    
			preenche(matriz);
	    
	    System.out.println("A soma da linha 4 de M: "+somasA(matriz));

	    System.out.println("A soma da  da coluna 2 de M: "+somasB(matriz));

	      System.out.println("A soma da   da diagonal principal: "+somasC(matriz));
	    
	       System.out.println("A soma da  da diagonal secundária: "+somasD(matriz));

	       System.out.println("A soma de todos os elementos da matriz: "+somasE(matriz));
		}

}

