package day_06_oopIII;

public class A_07_BoxDemo {
	
	public static void main(String[]args)
	{
		A_07_Box b [] ;//declaratiuon of array
		b = new A_07_Box[3];//initialized of Box array
		b [0] = new A_07_Box();//defult cons calling
		b [1] = new A_07_Box(2,3,4);//para cons calling
		b [2] = new A_07_Box(1,4,5);//para cons calling
		for(int i=0 ; i<b.length ; i++)
		 {
			b[i].calVolume();
		 }
	}

}
