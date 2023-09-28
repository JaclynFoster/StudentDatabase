import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
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
    public void enroll() {
        //Get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
                if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
                }
                else {
                System.out.println("BREAK!");
                break; 
                }
        } while (1 != 0);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }
    //View balance

    //Pay Tuition

    //Show status
}