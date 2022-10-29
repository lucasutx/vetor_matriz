import java.util.Scanner;

public class ex7 {public static int[][] recebe2(int[][]matriz1, int[][]matriz2)


{

	int matrizD[][] = new int[4][6];

	for(int l = 0; l<matrizD.length; l++) {

		for(int c = 0 ; c<matrizD[0].length;c++) {

			matrizD[l][c] = matriz1[l][c]-matriz2[l][c];
		}
	}

	return matrizD;
}



public static int[][] recebe(int[][]matriz1, int[][]matriz2){

	int matrizS[][] = new int[4][6];

	for(int l = 0; l<matrizS.length; l++) {

		for(int c = 0 ; c<matrizS[0].length;c++) {

			matrizS[l][c] = matriz1[l][c]+matriz2[l][c];
		}
	}

	return matrizS;
}

public static void preencha() {
	Scanner teclado = new Scanner(System.in);

	int matriz1[][] = new int[4][6];
	int matriz2[][] = new int[4][6];


	System.out.println("Digite os valores da matriz 1");
	for(int l = 0; l< matriz1.length; l++) {

		for(int c = 0; c < matriz1[0].length;c++) {

			matriz1[l][c]=teclado.nextInt();
		}
	}


	System.out.println("Digite os valores da matriz 2");
	for(int l = 0; l< matriz2.length; l++) {

		for(int c = 0; c < matriz2[0].length;c++) {

			matriz2[l][c]=teclado.nextInt();
		}
	}

	int somaS[][] = recebe(matriz1,matriz2);
	

	System.out.println("A soma é:");

	for(int l = 0; l< somaS.length; l++) {

		for(int c = 0; c < somaS[0].length;c++) {

			System.out.print(somaS[l][c]+"\t");
		}
		System.out.println();
	}
	
	int divD[][] = recebe2(matriz1,matriz2);
	System.out.println("A subtração é:");

	for(int l = 0; l< divD.length; l++) 
	{

	for(int c = 0; c < divD[0].length;c++) {

		System.out.print(divD[l][c]+"\t");
	}
	System.out.println();
}
}

	


public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	preencha();

	teclado.close();

}


}
