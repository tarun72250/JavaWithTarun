package arrayListDemo;
import java.util.*;
public class A_03_ArrayListDemo2 {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		int ch;
		
		do 
		{
			System.out.println("1.Add info...!");
			System.out.println("2.Display.....");
			System.out.println("3.set info at index");
			System.out.println("4.remove info by string element");
			
			System.out.println("Enter your choice...!");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1 :
				System.out.println("Enter String...!");
				String str = sc.next();
				words.add(str);
				break;
				
			case 2 :
				System.out.println("====================Display=========================");
				Iterator<String> i = words.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				break;
				
			case 3 :
				System.out.println("Enter index no and String to add");
				int ino = sc.nextInt();
				String str1 = sc.next();
				words.add(ino,str1);
				break;
			case 4 :
				System.out.println("Enter your string to remove");
				String str2 = sc.next();
				words.remove(str2);
				break;
			case 5 :
				System.exit(0);
				break;
			}
			
		}while(ch!=0);
		
		
		
		
		
		
	}

}


/*
List<String> words=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
	
		int ch;
		do 
		{
			System.out.println("1.add info:");
			System.out.println("2.remove info  by string element:");
			System.out.println("3.set info at index");
			System.out.println("4.For display");
			System.out.println("5.particular index element");
			System.out.println("6.overall count of String:");
			System.out.println("7:upper case string:");
			System.out.println("8.lower case string :");
			System.out.println("9.sort string by letter:");
			System.out.println("10:reverse string:");
			System.out.println("11.search string:");
			
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:		
					System.out.println("Enter String:");
					String str=sc.next();
					words.add(str);
					break;
					
					
			case 2:
					System.out.println("Enter string to remove:");
					String s1=sc.next();
					words.remove(s1);
					break;
				
				
			case 3:
					System.out.println("Enter index no and string to add");
					int a=sc.nextInt();
					String s2=sc.next();
					words.add(a, s2);
					break;
			
			
			case 4:
				System.out.println("*******Display******");
				
				
				//display method using iterator
				Iterator<String> i= words.iterator();
				while(i.hasNext())
					 System.out.println(i.next());
					 
					 //display by normal for loop
				for(int i=0;i<words.size();i++)
					System.out.println(words.get(i));
				
				
				//advanced for each loop
				for ( String s: words)
					System.out.println(s);
				System.out.println("*************");
				break;
				
			case 5:
				System.out.println("Enter index to get string at that particular loc");
				int b=sc.nextInt();
				System.out.println("*************");
				 System.out.println(words.get(b));
				 System.out.println("*************");
				break;
			case 6:
				System.out.println("*************");
				System.out.println("Count of your String :"+words.size());
				System.out.println("*************");
				break;
			case 7:
				for(String s:words)
					System.out.println(s.toUpperCase());
				break;
			case 8:
				for(String s:words)
					System.out.println(s.toLowerCase());
				break;
			case 9:
				Collections.sort(words);
				 System.out.println(words);
//				Collections.sort(words);
//				words.forEach(s-> System.out.println(s));
				break;
			case 10:
				ListIterator<String> l=words.listIterator(words.size());
				while(l.hasPrevious())
					System.out.println(l.previous());
				break;
			case 11:
				ListIterator<String> l1=words.listIterator();
				System.out.println("ENter string to search:");
				String ss=sc.next();
				while (l1.hasNext())
						{
							if(l1.next().equals(ss))
							{
								System.out.println("Element is present at "+words.indexOf(ss));
							}
						}
				System.out.println("string is not present:");
				}
		}while(ch!=0);
*/