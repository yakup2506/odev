package hafta3;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 *  soru 5
		 *  
		Kullan�c�dan bir kelime girmesini isteyin. S�zc�kte tek say�da karakter ve 3 veya daha fazla karakter i�eriyorsa, 
		kelimenin ortas�ndaki karakteri yazd�r�n.
		*/
		Scanner scan= new Scanner(System.in);
		  System.out.println("lutfen bir kelime ismi yaziniz.");
		  String kelime= scan.next().toLowerCase();


		  if (kelime.length()<3) 
			  System.out.println("lutfen en az 3 karakter iceren bir kelime giriniz");
		  else if(kelime.length()%2==0)
			  System.out.println("L�tfen karakter sayisi tek olan bir kelime giriniz");
			  else
				  System.out.println("Giirmis oldugunuz kelimenin ortadaki karakteri :"+ kelime.charAt((kelime.length()-1)/2) + " harfidir.");
			  
			  scan.close();
		  
		  
	}

}
