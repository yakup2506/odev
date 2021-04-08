package hafta1odev;

import java.util.Scanner;

public class A4_Odev4 {
	public static void main(String[] args) {
		
		
		/* soru 4
		Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 3 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
		
		
			System.out.println((sayi>=100 && sayi<1000 )?"rakamlarin toplami ="+ ((sayi%10) + (sayi/=10 +sayi%10)+ (sayi/100))
			:"lutfen gecerli bir sayi giriniz");
		
		
		
		
		scan.close();
		
		
	}

}
