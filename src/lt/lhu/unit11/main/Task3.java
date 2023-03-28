package lt.lhu.unit11.main;

public class Task3 {
	public static void main(String[] args) {

		int[][] array = new int[5][5];
		init(array);
		print(array);
	}

	public static void init(int[][] mas) {

		int k = 2;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = (i + 1) * k;
					k++;
				}
			}
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
