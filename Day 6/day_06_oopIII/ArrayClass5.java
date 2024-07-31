package day_06_oopIII;

public class ArrayClass5 {

	public static void main(String[] args) 
	{
		
		
		int [] arr = {4,2,8,5,6};//short way of array declaration
		System.out.println("Sum : "+sumOfArray(arr));
		System.out.println("Average :"+avgOfArray(arr));
		
		ArrayClass5 a = new ArrayClass5();
		//System.out.println(a.maxNumber(arr));
		
		a.evenValiuePrint(arr);
		
				
		
		
		/*Date d1= new Date();
		d1.showDate();*/
    }
	     
	    public static int sumOfArray(int [] arr)
	    {
		    int sum = 0;
			for(int i=0;i<arr.length;i++)
				sum+=arr[i];
			return sum;		
	    }	

	    public static int avgOfArray(int [] arr)
	    {
	    	int sum =0;//19
	    	int res= 0;
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		sum = sum + arr[i];//
	    		res= sum / arr.length;
	    	}
	    	return res;
	    }
	    
	    public void evenValiuePrint(int []arr)
	    {
	    	
	    	
	    	for(int i=0 ; i<arr.length; i+=2)
	    	{
	    		System.out.println(arr[i]);
	    	}
	    	
	    	
	    }
	    
	    
	    

}
