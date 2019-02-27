package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Dimens�o da matriz: ");
		int n = sc.nextInt();
		Integer[][] mat = new Integer[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++){
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + count);
		sc.close();
	}
}
