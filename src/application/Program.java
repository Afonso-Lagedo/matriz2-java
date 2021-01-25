package application;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// Da matriz escolher um número e mostrar o de cima, baixo, esquerda e direita
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many lines:");
		int lines = sc.nextInt();
		System.out.println("How many columns:");
		int columns = sc.nextInt();
		
		
		int [][] mat = new int[lines][columns];//declarando a matriz de ordem lines x colunms
		
		for (int i=0; i<lines; i++) {//usando o tamanho da linha
			for (int j=0; j<columns; j++) {//usando o tamanho do vetor correspondente aquela linha  
				System.out.printf("Element position %d x %d:", i, j);
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		for (int i=0; i<lines; i++) {
			for (int j=0; j<columns; j++) {
				if(mat[i][j]==number) {
					System.out.println("Position:"+i+"x"+j);
					
					if(j>0) {
						System.out.println("Left:"+mat[i][j-1]);
					}
					if(j<columns-1) {
						System.out.println("Rigth:"+mat[i][j+1]);
					}
							
					if(i>0) {
						System.out.println("Up:"+mat[i-1][j]);
					}
					if(i<lines-1) {
						System.out.println("Down:"+mat[i+1][j]);
					}
					
					
				}
				
			}
		}
		
		
								
		sc.close();
	}

}
