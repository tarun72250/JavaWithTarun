package day_06_oopIII;

public class A_13_Student {
    private int rollNumber;
    private String name;
    private int numSubjects;
    private int[] marks;

    public A_13_Student(int rollNumber, String name, int numSubjects, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.numSubjects = numSubjects;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        double totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = (totalMarks / (numSubjects * 100)) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        // Example usage
    	A_13_Student [] students = new A_13_Student[2];

        // Student 1
        int[] marks1 = {90, 85, 88};
        students[0] = new A_13_Student(1, "Manas", marks1.length, marks1);

        // Student 2
        int[] marks2 = {78, 82, 80, 75};
        students[1] = new A_13_Student(2, "Sumit", marks2.length, marks2);

        // Display details of all students
        for (A_13_Student student : students) {
            student.displayDetails();
            System.out.println();
        }
    }
}
