package odev6;

import java.util.Arrays;
import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		/*
		 * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
		 * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
		 * yaziniz
		 *
		 * Array={3,5,21,32,34,45,56,57,76,87,95}
		 *
		 * Input : 5 Output: Girdiginiz sayi Arrayde var Input : 15 Output: Girdiginiz
		 * sayi Arrayde yok
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 100 den kucuk bir tamsayi giriniz.");
		int sayi = scan.nextInt();

		int arr[] = { 3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95 };
		
		// Arrays classindan method kullanrak yapalim

		Arrays.sort(arr);  
	
		int sayi1=Arrays.binarySearch(arr, sayi);
		if(sayi1>=0)
			System.out.println("Girdiginiz sayi Array'de var.");
		else
			System.out.println("Girdiginiz sayi Array'de yok");

		
		// for loop kullanarak cozum
		
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sayi) {
				flag = true;

			}

		}

		if (flag) {
			System.out.println("Girdiginiz sayi Array'de var.");

		} else {
			System.out.println("Girdiginiz sayi Array'de yok");

		}
		
		
		scan.close();
	}

}
