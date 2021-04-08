package hafta2odev;

import java.util.Scanner;

public class A4_Soru4 {

	public static void main(String[] args) {
		/* 
		Kullanicidan 3 tane pozitif  tam sayi alalim
		bu uc sayidan ucgen olup olmama durumunu kontrol edelim
		eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim.

		* Ucgen olma kosullari.
		b+c>a>b-c  1
		a+c>b>a-c  1
		a+b>c>a-b 1

		* Eskenar ucgen olma kosullari.
		a=b=c 
*/
		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen  tamsayi olarak 3 kenar uuzunlugu giriniz .");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
	
		if(a<0 || b<0 || c<0) {
			
			System.out.println("Lütfen kenar uzunluklarini icin pozitif bir tamsayi giriniz");
			
		
		}else  if(a==b && b==c)
		 {
			System.out.println("vermis oldugunuz kenarlarla bir eskenar ucgen olusabiliyor");
		 
		 }else if(b+c >a  && a> b-c ||a+c>b && b>a-c || a+b>c&& c>a-b) {
			
			System.out.println("vermis oldugunuz kenarlarla bir ucgen olusabiliyor" );
			 
				 
			 }
		
		scan.close();
	}

}
