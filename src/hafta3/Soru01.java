package hafta3;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		 
		/* 		soru 1	
		           Kullan�c�n�n girmi� oldu�u A,B,C,D,F notlar�n�n kar��l���n� yazd�ran Switch Case java kodunu yaz�n�z.					
		           A	Excellent				
		           B	Good				
		           C	Average				
		           D	Deficient				
		           F	Failing								
				 */

		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen notunuzu harf t�r�nden giriniz.");
		
	
		char harf = scan.next().toUpperCase().charAt(0);
		
		
		 switch( harf) {
		  case 'A':
		 System.out.println("Excellent");
		 break;
		 
		 case 'B':
	     System.out.println("Good");
		 break;
		 
		 case 'C': 
		 System.out.println("Average	");
		 break;
		 
		 case 'D':
	     System.out.println("Deficient"); 
	     break; 
	     
		 case 'F':
		 System.out.println("Failing");
		 break; 
		 
			  
		default:
		  System.out.println("lutfen gecerli bir harf giriniz");}
		  
		  
		
		 scan.close();

		 
		

	}

}
