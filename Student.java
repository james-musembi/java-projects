import java.util.Scanner;

class Student {
    String name;
    String admissionNumber;
    int yearOfStudy;
    int semesterOfStudy;
    double averageMarks;
    String grade;

    // Method to calculate average and assign grade
    public void calculateAverageAndGrade(double math, double english, double swahili, double science) {
        averageMarks = (math + english + swahili + science) / 4;
        grade = assignGrade(averageMarks);
    }

    // Method to assign grade based on average marks
    private String assignGrade(double average) {
        if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Input details for each student
        inputStudentDetails(scanner, student1);
        inputStudentDetails(scanner, student2);
        inputStudentDetails(scanner, student3);

        // Calculate average and grade for each student
        calculateStudentPerformance(scanner, student1);
        calculateStudentPerformance(scanner, student2);
        calculateStudentPerformance(scanner, student3);

        // Display results in ascending order based on average marks
        displayResultsInAscendingOrder(student1, student2, student3);
    }

    private static void inputStudentDetails(Scanner scanner, Student student) {
        System.out.println("Enter details for student:");
        System.out.print("Name: ");
        student.name = scanner.nextLine();
        System.out.print("Admission Number: ");
        student.admissionNumber = scanner.nextLine();
        System.out.print("Year of Study: ");
        student.yearOfStudy = scanner.nextInt();
        System.out.print("Semester of Study: ");
        student.semesterOfStudy = scanner.nextInt();
        scanner.nextLine(); // Consume newline
    }

    private static void calculateStudentPerformance(Scanner scanner, Student student) {
        System.out.println("Enter marks for " + student.name + ":");
        System.out.print("Mathematics: ");
        double math = scanner.nextDouble();
        System.out.print("English: ");
        double english = scanner.nextDouble();
        System.out.print("Swahili: ");
        double swahili = scanner.nextDouble();
        System.out.print("Science: ");
        double science = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        student.calculateAverageAndGrade(math, english, swahili, science);
    }

    private static void displayResultsInAscendingOrder(Student... students) {
        // Sort students based on average marks using a simple bubble sort
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].averageMarks > students[j + 1].averageMarks) {
                    // Swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display results
        System.out.println("\nStudent Performance in Ascending Order of Average Marks:");
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Admission Number: " + student.admissionNumber);
            System.out.println("Year of Study: " + student.yearOfStudy);
            System.out.println("Semester of Study: " + student.semesterOfStudy);
            System.out.println("Average Marks: " + student.averageMarks);
            System.out.println("Grade: " + student.grade);
            System.out.println("-----------------------------");
        }
    }
}