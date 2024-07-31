package day_07_stringsDemo;
//Wap to remove duplicate char in given String
public class B_04_RemoveDuplicateCharInGivenString {

	public static void main(String[] args) {
		
		String str = "programming";
		
		//Appraoch 1.
		StringBuilder sbuilder = new StringBuilder();
	
		for(int i =0 ; i<str.length();i++)//programming
		{
			char ch = str.charAt(i);//a
			int idx = str.indexOf(ch, i+1);//a m
			if(idx == -1)//0 == -1 
			{
				sbuilder.append(ch);//prog
			}
		}
		System.out.println(sbuilder);
		
		// 11 33 66 55 33 22 11 22 33
		//Approach 2.
		char [] arr = str.toCharArray();
		StringBuilder sbuilder1 = new StringBuilder();
		
		for(int i =0 ; i<arr.length;i++)//programming
		{
			boolean repeated = false;
			for(int j = i+1 ; j<arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					repeated = true;
					break;
				}
			}
			if(!repeated)
			{
				sbuilder1.append(arr[i]);
			}	
		}
		System.out.println(sbuilder1);
		
		
		
		
	}
}

/*

String str = "programming";
		
		//Approach 1.
		StringBuilder sb2 = new StringBuilder();
		for(int i =0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			int idx = str.indexOf(ch , i+1);
			if(idx == -1)
			{
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		

		//Approach 2.
		char [] arr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for(int i =0 ; i<arr.length ; i++)
		{
			boolean repeated = false;
			for(int j= i+1 ; j<arr.length ;j++)
			{
				if(arr[i] == arr[j])
				{
					repeated = true ;
					break ;
				}
			}
			if(!repeated)
			{
				sb3.append(arr[i]);
			}
			
		}
		System.out.println(sb3);

*/