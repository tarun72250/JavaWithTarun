package day_06_oopIII;

public class A_12_Student {
    private int rollNumber;
    private String name;
    private int numSubjects;
    private int[] marks;

    public A_12_Student(int rollNumber, String name, int numSubjects, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.numSubjects = numSubjects;
        this.marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            this.marks[i] = marks[i];
        }
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Number of Subjects: " + numSubjects);
        System.out.print("Marks of Each Subject: ");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
    	A_12_Student [] students = new A_12_Student[2];

        // Student 1
        int rollNumber1 = 1;
        String name1 = "Vaibhav";
        int numSubjects1 = 3;
        int[] marks1 = {90, 85, 88};
        students[0] = new A_12_Student(rollNumber1, name1, numSubjects1, marks1);

        // Student 2
        int rollNumber2 = 2;
        String name2 = "Ankush";
        int numSubjects2 = 4;
        int[] marks2 = {78, 82, 80, 75};
        students[1] = new A_12_Student(rollNumber2, name2, numSubjects2, marks2);

        // Display details of all students
        for (A_12_Student student : students) {
            student.displayDetails();
            System.out.println();
        }
    }
}
