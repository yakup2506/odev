package odev5;

public class Soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1-20 arasindaki -20 dahil olmak üzere-  çift sayýlarý yazdýrýn. e.g.2 4 6 .. 20


		1-20 arasindaki -20 dahil olmak üzere-  tek sayýlarý yazdýrýn. e.g 1,3,5,7,...,19 Virgul dahil!


		20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		 
		1 - 20 arasýndaki tüm çift sayýlarýn toplamýný bulun.

		11 veya 15 hariç 1-20 arasýndaki tüm sayýlarý yazdýrýn; break or continue kullanin. 
		*/
		         
/* a. 1-20 arasindaki -20 dahil olmak üzere- çift sayýlarý yazdýrýn. 
         * e.g.2 4 6 .. 20
         * b. 1-20 arasindaki -20 dahil olmak üzere- tek sayýlarý yazdýrýn. 
         * e.g 1,3,5,7,...,19 Virgul dahil!
         * c. 20 ile 1 arasindaki 5 e bolunebilen sayillari 
         * 20 den geriye gelerek yazdirin. e.g.20,15,10,5
         * d. 1 - 20 arasýndaki tüm çift sayýlarýn toplamýný bulun.
         * e.11 veya 15 hariç 1-20 arasýndaki tüm sayýlarý yazdýrýn; break or continue kullanin.*/
            
        int[] sayi = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        
        ciftSayi(sayi);
                System.out.println();
        tekSayi (sayi);
                System.out.println();
        
        bolunebilen5(sayi);
            System.out.println();
        ciftToplam(sayi);
        
        sayiHaric(sayi);
          
            
        }
        public static void sayiHaric(int[] sayi) {
            for (int i = 0; i < sayi.length; i++) {
                if (sayi[i]==11 || sayi[i]==15) {
                    continue;
                } 
                System.out.print(sayi[i] + " ");
            }
            
            
    }
        public static void ciftToplam(int[] sayi) {
            int toplam=0;
            for (int i = 0; i < sayi.length; i++) {
                if (sayi[i]%2==0) {
                    toplam+=sayi[i];
                }  
            }  System.out.println(toplam);
            
            
            
            
    }
        public static void bolunebilen5(int[] sayi) {
            for (int i = sayi.length-1; i >=0 ; i--) {
                if (sayi[i]%5==0) {
                    System.out.print(sayi[i] + " ");
                }
                
                
            }
            
            
        }
        public static void tekSayi(int[] sayi) {
            for (int i = 0; i < sayi.length; i++) {
                if (sayi[i]%2==1) {
                    System.out.print(sayi[i] + ",");
                }
            }  
        }
        
        
    public static void ciftSayi(int[] sayi) {
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]%2==0) {
                System.out.print(sayi[i] + " ");
            }
        }
	}

}
