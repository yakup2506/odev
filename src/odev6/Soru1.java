package odev6;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * // Stringi ters �evirmek i�in bir Java Program� yaz�n //1.Yol: StringBuilder
		 * () kullanarak //2.Yol: String Classini kullanarak //3.Yol: Bir method
		 * olu�turun, ard�ndan methodu main method dan �a��r�n
		 */
		// 1. yol
		/*
		 * StringBuilder sb1= new StringBuilder("Yakup Akpinar"); sb1.reverse();
		 * System.out.println(sb1);
		 */

		// 2. yol

		String str = "Yakup Akpinar";
		String sonuc = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			sonuc += str.charAt(i);
		}
		System.out.println(sonuc);

		
		// 3.yol
		tersetenyaz();
		System.out.println((sonuc));
	}

	public static String tersetenyaz() {
		String str = "Yakup Akpinar";
		String sonuc = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			sonuc += str.charAt(i);

		}
		return sonuc;
	}
}
