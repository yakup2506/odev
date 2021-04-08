package hafta2odev;

import java.util.Scanner;

public class A2_Soru2 {

	public static void main(String[] args) {
		
		/*  soru 2
		  Print "Lütfen iþ unvanýnýzý girin” “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
        Doðru jobTitle yazdýrmak için aþaðýdaki test datalarini kullanýn. Example :
        Eger jobTitle  qa ise print “Ýþ unvanýnýz Quality Analyst” 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */

		Scanner scan= new Scanner(System.in);
	
		System.out.println("lutfen is unvaninizi giriniz.");
		String jobTitle= scan.next().toLowerCase();
		
		String sonuc=jobTitle.equals("qa") ? "Is Ünvaniniz : Quality Analist": jobTitle.equals("dev") ? "Is Ünvaniniz : Developer" :  
			jobTitle.equals("ba")?"Is Ünvaniniz Business Analyst" : jobTitle.equals("pm")?
					"Is Ünvaniniz : Project Manager" : "Lütfen gecerli bir Jobtitle giriniz";
		
		System.out.println(sonuc);
		
		scan.close();
		
	}

}
