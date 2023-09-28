import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("Grade Levels:\n1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student grade level: ");
        this.gradeLevel = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeLevel);

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeLevel + " " + studentID);
    }
    //Generate an ID
    private void setStudentID() {
        //Grade Level + ID
        id++;
        this.studentID = gradeLevel + "" + id;

    }

    //Enroll in courses

    //View balance

    //Pay Tuition

    //Show status
}