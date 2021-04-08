package hafta3;

public class Soru03 {

	public static void main(String[] args) {
		/*  
		 * soru 3
		Ternary kullanarak:
				int variable : FIYAT
				string variable : Secim (String Secim=.....)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
			*/

     int fiyat= -6;

      System.out.println(fiyat>0 ? (fiyat>0 && fiyat<10 ? "ucuz" : fiyat>=10 && fiyat<20 ? "uygun": "pahali" ): "lutfen gecerli bir fiyat giriniz ");
	}
}
