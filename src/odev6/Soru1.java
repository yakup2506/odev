package odev6;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * // Stringi ters çevirmek için bir Java Programý yazýn //1.Yol: StringBuilder
		 * () kullanarak //2.Yol: String Classini kullanarak //3.Yol: Bir method
		 * oluþturun, ardýndan methodu main method dan çaðýrýn
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
