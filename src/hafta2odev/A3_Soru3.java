package hafta2odev;

import java.util.Scanner;

public class A3_Soru3 {

	public static void main(String[] args) {

		/*
		 * soru 3
		 * 
		 * 
		 * “NestedIfStatements” class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yýlý, ayi ve günü tamsayý olarak alýn e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen 1 kisi icin dogum yilini tamsayi giriniz.");
		int dgmYil1 = scan.nextInt();
		System.out.println("lutfen 1 kisi icin dogum ayini  tam sayi giriniz.");
		int dgmAy1 = scan.nextInt();
		
		System.out.println("lutfen 1 kisi icin dogum gununu tam sayi giriniz.");
		int dgmGun1 = scan.nextInt();

		System.out.println("lutfen 2 kisi icin dogum yilini tam sayi giriniz.");
		int dgmYil2 = scan.nextInt();
		System.out.println("lutfen 2 kisi icin dogum ayini tamsayi  giriniz.");
		int dgmAy2 = scan.nextInt();
		System.out.println("lutfen 2 kisi icin dogum gununu tamsayi giriniz.");
		int dgmGun2 = scan.nextInt();

		if (dgmAy1 < 1 || dgmAy1 > 12 || dgmAy2 < 1 ||dgmAy2 > 12) {
			
			System.out.println("lutfen gecerli bir ay giriniz");
		
		} else if (dgmGun1< 1 || dgmGun1 >31 || dgmGun2 < 1 || dgmGun2 > 31) {
			System.out.println("lutfen gecerli bir gün giriniz"); 
		
		}else if (dgmYil1 == dgmYil2) {

			if (dgmAy1 < dgmAy2) {
				System.out.println("1. kisi 2. kisiden büyüktür");

			} else if (dgmAy1 == dgmAy2 && dgmGun1 < dgmGun2) {
				System.out.println("1. kisi 2. kisiden büyüktür");
			}
		} else if (dgmYil1 > dgmYil2) {
			System.out.println("1. kisi 2. kisiden büyüktür");
		} else {
			System.out.println("2. kisi 1. kisiden büyüktür");
		}
scan.close();
		
	}

}
