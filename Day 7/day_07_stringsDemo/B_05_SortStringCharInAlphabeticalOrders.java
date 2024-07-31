package day_07_stringsDemo;

import java.util.Arrays;

//Wap to sort String char in Alphabetical orders.
//Input : java
//Output : aajv
//1. Without using sorting method
//2. Using sort method of Array class
public class B_05_SortStringCharInAlphabeticalOrders {

     public static void main(String[] args) {
        
    	 String str = "fdcba";
    	 //Approach 1.
    	 
    	 char [] ch = str.toCharArray();
    	 for( int i=0 ; i<ch.length ; i++)//v
    	 {
    		 for (int j = i+1 ; j<ch.length;j++)//a
    		 {
    			 int temp;
    			 if(ch[i] > ch[j])//
    			 {
    				 temp = ch[i];
    				 ch[i] = ch[j];
    				 ch[j] = (char)temp;
    			 }
    		 }
    	 }
    	 System.out.println(new String(ch));
    	 
    	 
    	 
    	 //Approch 2.
    	 
    	 char [] ch1 = str.toCharArray();
    	 Arrays.sort(ch1);
    	 System.out.println(new String(ch1));
     }

}
/*
  //Approach 1.
        String str = "rock";
        
        char [] ch = str.toCharArray();
      
        for(int i=0 ; i<ch.length;i++)
        {
            for(int j=i+1 ; j<ch.length;j++)
            {
            	 int temp;
                if(ch[i] > ch[j])
                {
                    temp = ch [i];
                    ch[i] = ch[j];
                    ch[j] = (char) temp;
                }
            }   
        }
        System.out.println(new String(ch));


         //Approach 2.
         String str1 = "rock";
        
         char [] ch1 = str1.toCharArray();
         Arrays.sort(ch1);
         System.out.println(new String(ch1));
 


*/