package lt.lhu.unit11.main;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
		
		int[][] array = new int[6][6];
		
		init(array);
		print(array);
		printDiagonal(array);
		
	}

	public static void init(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		} 
	}
		public static void print(int[][] mas) {
				for(int i=0; i<mas.length; i++) {
					for(int j=0; j<mas[i].length; j++) {
					System.out.printf("%3d", mas[i][j]);
					}
					System.out.println();
			}
		}
		
	public static void printDiagonal(int [][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.printf("%3d", mas[i][j]);
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();	
	}
	}
}
	

