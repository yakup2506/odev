package hafta3;

import java.util.Scanner;

public class soru06 {

	public static void main(String[] args) {
		/* 
		 * soru 6
		 * 
		Kullan�c�dan firstName ve lastName'i girmesini isteyin, ard�ndan ba� harflerini b�y�k harf yap�n ve geri kalan� tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		          	kirac => Kirac
		          */
		
		
		Scanner scan= new Scanner(System.in);
		  System.out.println("lutfen isminizi yaziniz.");
		  String isim= scan.next().toLowerCase();
		  System.out.println("lutfen soy isminizi yaziniz.");
		  String soyIsim= scan.next().toLowerCase();
		
		  
		  System.out.println("Isim:" +isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase());
		  System.out.println("Soyisim:"+ soyIsim.toUpperCase().charAt(0) + soyIsim.substring(1).toLowerCase());
		  
		  
	scan.close();
	}

}
