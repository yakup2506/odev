package hafta1odev;

import java.util.Scanner;

public class A2_Odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*soru 2
		  
		 * Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. Daha
		 * sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu
		 * yaziniz. 1 seker= 1.7 gr Ornek: Input ⇒ Cay : 10 Seker :2 Output : 12.41
		 * kg/yil
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen gunde kac cay ictiginizi giriniz");
		double sayi1 = scan.nextDouble();
		System.out.println("lutfen cayi  kac sekerli ictiginizi  giriniz");
		double sayi2 = scan.nextDouble();
		System.out.println("yilda " + (sayi1 * 365 * sayi2 * 1.7) / 1000 + "kg seker tüketmektesiniz. ");

		scan.close();
	}

}
