package odev5;

public class Soru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		String name = "Emine";
		         charAt yöntemini kullanarak konsolda tüm harfleri yazdýrýn.
		         
		         
		         */
		
		String isim= "Emine";
				
				for (int i = 0; i < isim.length(); i++) {
					
					isim.charAt(i);
					System.out.print(isim.charAt(i)+",");
					
				}
	}

}
