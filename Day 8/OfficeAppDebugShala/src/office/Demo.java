package office;

import office.staff.Staff;
import office.student.Student;
import office.trainer.Trainer;

public class Demo {

	public static void main(String[] args) {

		Staff s = new Staff();
		s.display();

		Student stu = new Student();
		stu.display();
		
		Trainer t = new Trainer();
		t.display();
	}

}
