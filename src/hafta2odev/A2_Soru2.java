package hafta2odev;

import java.util.Scanner;

public class A2_Soru2 {

	public static void main(String[] args) {
		
		/*  soru 2
		  Print "L�tfen i� unvan�n�z� girin� �jobTitle� isimli bir degisken olusturun ve kullanicidan isteyin.
        Do�ru jobTitle yazd�rmak i�in a�a��daki test datalarini kullan�n. Example :
        Eger jobTitle  qa ise print ��� unvan�n�z Quality Analyst� 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */

		Scanner scan= new Scanner(System.in);
	
		System.out.println("lutfen is unvaninizi giriniz.");
		String jobTitle= scan.next().toLowerCase();
		
		String sonuc=jobTitle.equals("qa") ? "Is �nvaniniz : Quality Analist": jobTitle.equals("dev") ? "Is �nvaniniz : Developer" :  
			jobTitle.equals("ba")?"Is �nvaniniz Business Analyst" : jobTitle.equals("pm")?
					"Is �nvaniniz : Project Manager" : "L�tfen gecerli bir Jobtitle giriniz";
		
		System.out.println(sonuc);
		
		scan.close();
		
	}

}
