import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

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
    }
    //Generate an ID

    //Enroll in courses

    //View balance

    //Pay Tuition

    //Show status
}