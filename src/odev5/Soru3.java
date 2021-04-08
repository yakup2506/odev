package odev5;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
		String str=“ilovejavatoo” 
		Output: o v a
		         */
		
		    
		        /*
		        Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
		        String str=“ilovejavatoo” 
		        Output: o v a
		        */
		        String str="ilovejavatoo";
		        String str1[] = str.split("");
		        List<String> list=new ArrayList<>();
		        
		        for (int i = 0; i < str1.length-1; i++) {
		            for (int j = i+1; j < str1.length; j++) {
		                if (str1[i].equals(str1[j])) {
		                    if (!list.contains(str1[i])) list.add(str1[i]);
		                }
		            }
		        }
		        System.out.println(list);

	}

}
