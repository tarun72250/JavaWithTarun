package day_07_stringsDemo;

public class A_01_CreationOfString {

	public static void main(String[] args) 
	{	
				//Declaration of String
				//String Literal 
				String str ="Suraj Rajput";//Both mean same
				//String creation Using new Keyword

				String str1 = new String("Learning Java in Morning Batch");
				System.out.println(str +" "+str1);

				//iteration in string using for loop
				for(int i=0 ; i<str.length();i++)
				{
					System.out.print(str.charAt(i));
				}
				
				//String Methods in Java
				//1 length()
		        System.out.println("\n------length()-------");
						System.out.println(str.length());//return 10 char in a String
				
				//2 charAt()
				        System.out.println("\n------charAt()-------");
						System.out.println(str.charAt(4));//return j
				
				//3 substring(3)
				        System.out.println("\n------substring(3)-------");
						System.out.println(str.substring(3));//aj rajput 
						
				//4 substring(2,5)
				        System.out.println("\n------substring(2,5)-------");
						System.out.println(str.substring(2,5));//return raj
						
				//5 concat()
				        System.out.println("\n------concat()-------");
						String new_str = str.concat(" "+str1);
						System.out.println(new_str);//Suraj Rajput Learning Java in Morning Batch
						
				//6 indexOf()
				        System.out.println("\n------indexOf()-------");
						String s = "Sumit Learning Java Web Development";
						int output = s.indexOf("Share"); // returns -1
					    int output1 = s.indexOf("Web");  // return 20
						int output3 = s.indexOf("ing");// returns 11
						System.out.println(output+" "+output1+" "+output3);
				
				//7 lastIndexOf()
				        System.out.println("\n------lastIndexOf()-------");
						String s4 = "Suraj Learning HTML CSS JAVASCRAIPT";
					    int output4 = s4.lastIndexOf("A"); // returns 31
					    System.out.println(output4);
				
			    //8 equals()
				        System.out.println("\n------equals()-------");
					    Boolean out = str.equals("Suraj Rajput"); // returns true
					    Boolean out1 = str.equals("sumit rajput"); // returns false
					    System.out.println(out + " " + out1);
					    
					    Boolean out3= "DebugShala".equalsIgnoreCase("debugShala"); // returns true
					    Boolean out4 = "DebugShala".equalsIgnoreCase("DebugShala "); // returns false
					    System.out.println(out3 +" "+ out4);
				
			    //9 toLowerCase() and toUpperCase()
				        System.out.println("\n------toLowerCase() and toUpperCase()-------");
					    String word1 = "SUMIT RAGHUWANSHI";
					    String word3 = word1.toLowerCase(); // returns “hello"
					    System.out.println(word3);
					    String word2 = "sumit raghuwanshi";
					    String word4 = word2.toUpperCase(); // returns “HELLO”
					    System.out.println(word4);
			    
				//10 trim()
				        System.out.println("\n------trim()-------");
				        String word5 = "            Learn        Share Learn     ";//removed whitespaces from sides
				        System.out.println("Trim the word :" + word5.trim());
				
				//11 replace()
				        System.out.println("\n------replace()-------");
				        String word6 = "Sumin";
				        System.out.println("Original String :" + word6);
				        String word7 = "Sumin".replace('n' ,'t') ;
				        System.out.println("Replaced n with t -> " + word7);//DebugShala

				//12 startsWith(String prefix)
				        System.out.println("\n------startsWith(String prefix)-------");
				        boolean startsWith = str.startsWith("Suraj");//str = "Suraj Rajput"
				        System.out.println("Starts with Suraj: " + startsWith);//true
				
				//13 endsWith(String suffix)
				        System.out.println("\n------endsWith(String suffix)-------");
				        boolean endsWith = str.endsWith("puta");//true
				        System.out.println("Ends with 'puta': " + endsWith);
				
				//14 split(String regex)
				        System.out.println("\n------Split parts:-------");
				        String var="Deb,ug,S,hala";
				        String[] parts = var.split(",");
				        for (String part : parts)//advanced for loop
				        {
				            System.out.print(part.trim());//DebugShala
				        }
				        
				//15 equals(Object anObject)
				        System.out.println("\n------equals(Object anObject)-------");
				        String str2 = "DebugShala ";
				        boolean isEqual = str.equals(str2);
				        System.out.println("Strings are equal: " + isEqual);//false
				        
				//16 contains(CharSequence s)
				        System.out.println("\n------contains(CharSequence s)-------");
				        boolean contains = str.contains("Sumit");
				        System.out.println("Contains 'Sumit': " + contains);//false
				        boolean contains1 = str.contains("Suraj");
				        System.out.println("Contains 'Suraj': " + contains1);//true
				        
				//17 isEmpty()
				        System.out.println("\n------isEmpty()-------");
				        boolean isEmpty = str.isEmpty();
				        System.out.println("String is empty: " + isEmpty);//false
				        
				//18 isEqualIgnoreCase()
				        System.out.println("\n------isEqualIgnoreCase()-------");
				        String var1 = "HELLO";
				        String var2 = "hello";
				        boolean isEqualIgnoreCase = var1.equalsIgnoreCase(var2);//true
				        System.out.println("equalsIgnore case result: " + isEqualIgnoreCase);
				
	}
}
/*

		
	   
	
*/