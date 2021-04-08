package odev5;

import java.util.Scanner;

public class Soru4 {
public static void main(String[] args) {
	
	/*
	Get numbers from the user and output that number consecutive fibonacci number sequence
	     	e.g : User enters 10
	output : 0 1 1  2  3  5 8 13 21 34
	      	*/
	/*
    Get numbers from the user and output that number consecutive fibonacci number sequence
            e.g : User enters 10
    output : 0 1 1  2  3  5 8 13 21 34
            */
    Scanner scan= new Scanner (System.in);
    System.out.println("Bir sayi giriniz");
    int fibo= scan.nextInt();
     
    int f=0;
    int f1=1;
    int toplam=0;
    System.out.print(f+" "+f1+" ");
    for (int i = 0; i <= fibo-2; i++) {
        
        toplam=f+f1;
        f=f1;
        f1=toplam;
        System.out.print(toplam+" ");
    }
    
    System.out.println();
scan.close();
/*Scanner scan = new Scanner(System.in);
System.out.println("Lutfen pozitif bir tam sayi giriniz: ");
int sayi = scan.nextInt();

List<Integer> fibo = new ArrayList<>();
fibo.add(0);
fibo.add(1);

for (int i = 0; i< sayi-2; i++) {
    fibo.add(fibo.get(i)+fibo.get(i+1));
}
for (Integer j : fibo) System.out.print(j + " ");

scan.close();*/

}
}
