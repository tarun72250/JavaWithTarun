package day_06_oopIII;

public class BookDemo {

	public static void main(String[] args) {
	
		Book [] arr = new Book[3];
		arr[0] = new Book();//default cons calling
		arr[1] = new Book(111,"Alex",101,"Mario","Pune");//para cons calling
		arr[2] = new Book(222,"Jahin",202,"Priyanka","Mumbai");// para cons calling
		for(int i=0;i<arr.length;i++)
		{
			arr[i].display();
			System.out.println();
		}
		
		arr[1].setBookid(333);//set book id object 1
		System.out.println("1 object Book id :-"+arr[1].getBookid());//get book id object 3
	
		System.out.println("-----------------------If one id get only in for loop-------------------------");
		Book [] arr1 = new Book[3];
		arr1[0] = new Book();
		arr1[1] = new Book(111,"Alex",101,"Mario","Pune");
		arr1[2] = new Book(222,"Jahin",202,"Priyanka","Mumbai");
		arr1[1].setBookid(333);//set book id object 1
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i].getBookid()== 333)
			{
				arr1[i].display();
				System.out.println();
			}
		}
		
		System.out.println("1 object Book id :-"+arr1[1].getBookid());//get bookid object 1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
