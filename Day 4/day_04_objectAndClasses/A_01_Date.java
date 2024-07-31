package day_04_objectAndClasses;

public class A_01_Date {
	
	private int dd;//data members - instance members
	private int mm;//state 
	private int yy;//always data members should be private

		//instance member method
		public void showDate()
		{
			System.out.println(dd+"  "+mm+"  "+yy);
		}
		
		
}

/*
 
//Note:-If we do not specify any constructor in class 
//So always default cons it is present
//if we define any cons in class so we always define default cons.
		//Default cons
		public A_01_Date()
		{
		
		}
	
//Fully parametrized Constructor
		public A_01_Date(int dd , int mm , int yy)
		{
			this.dd=dd;// this refrence is differntaite btw local var and instance var
			this.mm=mm;
			this.yy=yy;
		}

//local var always dominating over instance variable 
//so i want to assign local var to instance var 
//so for this i am goin to use something else which is this refrence	
//partially parametrized constructor
		public A_01_Date(int dd , int mm )
		{
			this.dd=dd;// this is differntaite btw local var and instance var
			this.mm=mm;
		}

//int n =10;
//n=n; //self assignment which is of no use .
//		public Date1(int dd, int mm ,int yy)
//		{
//			dd=dd;//this is self assignment
//			mm=mm;
//			yy=yy;
//		}		
		public A_01_Date(int dd )
		{
			this.dd=dd;// this is differntaite btw local var and instance var
		}
		
		//copy constructor
		public A_01_Date(A_01_Date d)
		{
			this.dd=d.dd;// this is differntaite btw local var and instance var
			this.mm=d.mm;
			this.yy=d.yy;
		}
		
		public void showDate(char ch)
		{
			System.out.println(dd+" "+ch+mm+ch+" "+yy);
		}

 */


