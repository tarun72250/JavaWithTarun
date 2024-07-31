package day_03_E_iterativeStatements;

public class UsingIterativeStatements {

	public static void main(String[] args) {
		
		//for loop
//		for(int i =0 ; i <=10  ; i++)//0<=10  1<=10  2<=10   3<=10   .... 10<=10
//		{
//			System.out.println("A");//0   1    2     3      .... 10
//		}
		
		
		//while loop
//		int i=0;
//		while(i<=10)
//		{
//			System.out.println(i);
//			i++;
//		}
		
		
		//do-while loop
//		int i=0;
//		do 
//		{
//		System.out.println(i);
//		i++;
//		}while(i<=10);
		
		
		
		for(int i=1;i<=3;i++){    
            //inner loop  
            for(int j=1;j<=3;j++){    
                if(i==2&&j==2){    
                    //using break statement inside the inner loop  
                    break;    
                }    
                System.out.println(i+" "+j);    
            }    
    }    

	}

}
