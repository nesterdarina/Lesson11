package lt.lhu.unit11.main;

public class Task2 {

	public static void main(String[] args) {
		// —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)

		int n = 5;
		int[][] array = new int[n][n];
		init(array, n);
		print(array);
	}

	public static void init(int[][] mas, int n) {
		int j = 1;
		for (int i = 0; i < mas.length; i++) {
			mas[i][mas[i].length - j] = n - (mas.length - j);
			j++;
		}

	}

	public static void print(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}