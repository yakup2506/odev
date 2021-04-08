package hafta2odev;

import java.util.Scanner;

public class A1_Soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* soru 1
		 * 
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa “gecerli bir email girin” yazdirin
       @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
       @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail hesabinizi girin” yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : “gecerli bir email girin”
       INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
       INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
       */
		
		Scanner scan= new Scanner(System.in);
		
		  System.out.println("lutfen bir mail giriniz");
	        String email=scan.next().toLowerCase();	
	        
	        // ternary ile cozumu
	        
	     //   System.out.println(email.contains("@")&& !email.contains("gmail.com") ?  "lutfen gmail adresi giriniz":
	        
	      //  		email.contains("@gmail.com") ? "email onaylandi." : "gecerli bir e mail giriniz");
	        
	    
	     
	        if (email.contains("@gmail.com")) {
	        	
	        	System.out.println("email onaylandi.");
	        	
	        }else  if(email.contains("@")&& !email.contains("gmail.com")) {
	        	System.out.println("lutfen gmail adresi giriniz");
	        	} else  {
	        	System.out.println("gecerli bir e mail giriniz"); }
	        	
	        	scan.close();
	   
}
	}
