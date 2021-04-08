package hafta3;

import java.util.Scanner;

public class Soru02 {
	public static void main(String[] args) {
		
		
		  
				/*   soru2
				 * 
				* Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
					*/
		
		Scanner scan= new Scanner(System.in);
		  System.out.println("lutfen bir ay ismi yaziniz.");
		
		 
		  String ay = scan.next().toLowerCase();
		   switch(ay)  {
		   
		   case "ocak":
		   System.out.println("Girmis oldugunuz ay 31 gün icermektedir"); 
		   break;
		  
		   case "subat": 
		   System.out.println("Girmis oldugunuz ay 28 gün icermektedir");
		   break; 
		   
		   case "mart": 
		   System.out.println("Girmis oldugunuz ay 31 gün icermektedir"); 
		   break; 
		   
		   case "nisan":
		   System.out.println("Girmis oldugunuz ay 30 gün icermektedir");
		   break; 
		   
		   case "mayis":
		   System.out.println("Girmis oldugunuz ay 31 gün icermektedir");
		   break;
		   
		   case "haziran":
		   System.out.println("Girmis oldugunuz ay 30 gün icermektedir");
		   break;
		  
		   case "temmuz": 
		   System.out.println("Girmis oldugunuz ay 31 gün icermektedir");
		   		
		   break;
		   case "agustos": 
			   System.out.println("Girmis oldugunuz ay 31 gün icermektedir");
			   		
			   break;
		   case "eylul": 
			   System.out.println("Girmis oldugunuz ay 30 gün icermektedir");
			   		
			   break;
		   case "ekim": 
			   System.out.println("Girmis oldugunuz ay 31 gün icermektedir");
			   		
			   break;
		   case "kasim": 
			   System.out.println("Girmis oldugunuz ay 30 gün icermektedir");
			   		
			   break;
		   case "aralik": 
			   System.out.println("Girmis oldugunuz ay 31 gün icermektedir");
			   		
			   break;
			   
		   
		   default:
		   System.out.println("lutfen gecerli bir ay ismi  giriniz");
		  
		  
		 
		  scan.close();
		  
		  
		 
		 
		  }
		   }
		  
		
	
}
