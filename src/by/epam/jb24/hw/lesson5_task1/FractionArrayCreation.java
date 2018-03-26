package by.epam.jb24.hw.lesson5_task1;

import java.util.Random;

public class FractionArrayCreation {
	public static void main(String[] arg) {

		int k = 6; // size of array
		String arr[] = new String[k]; // to declare array

		System.out.println("Fraction array: ");
		for (int i = 0; i < arr.length; i++) {
			Fraction fr = new Fraction();
			Random rand = new Random();
			fr.setM(rand.nextInt(8) + 1);
			fr.setN(rand.nextInt(8) + 1);
			arr[i] = fr.getM() + "/" + fr.getN();
			System.out.print("[" + arr[i] + "]");
		}
	}

}
