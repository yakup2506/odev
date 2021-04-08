package odev6;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		/* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
Scanner scan=new Scanner(System.in);

int top=0;
int count=0;

do {

	System.out.println("lutfen pozitif bir sayi giriniz");
	int sayi=scan.nextInt();
	
	if (top<=100 && sayi>0)  
		top+=sayi;
		count++;
	

}while(top<=100);
	System.out.println(count+ " kere sayi girdiniz.Bu kadar sayi yeter.");

	scan.close();}

}
