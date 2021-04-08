package odev5;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Kullanýcýdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez tekrarlandýðýný kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =“John came late" 
=> Tekrar Sayisi = 2
		*/
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
                
        String cumle = scan.nextLine();
                
        System.out.println("Lutfen bir harf giriniz");
                
        String harf = scan.next().substring(0, 1); 
                
            int count=0;
                
                int index=0;
                
                    while (index<cumle.length()) {
                    
                        if (cumle.substring(index, index+1).equals(harf)) {
                        count++;
                        
                    } 
                    index++;
                } 
                System.out.println("Cumlede " + harf + " harfi " + count + " defa kullanilmis");
                System.out.println("kelime uzunlugu: " + index);
                scan.close();

	}

}
