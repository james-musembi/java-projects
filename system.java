import java.util.Scanner;

class Student {
    String name;
    String admissionNumber;
    int yearOfStudy;
    int semesterOfStudy;
    double mathematics;
    double english;
    double swahili;
    double science;
    double average;
    String grade;

    public Student(Scanner scanner) {
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Admission Number: ");
        this.admissionNumber = scanner.nextLine();
        System.out.print("Enter Year of Study: ");
        this.yearOfStudy = scanner.nextInt();
        System.out.print("Enter Semester of Study: ");
        this.semesterOfStudy = scanner.nextInt();
        
        System.out.print("Enter Mathematics Marks: ");
        this.mathematics = scanner.nextDouble();
        System.out.print("Enter English Marks: ");
        this.english = scanner.nextDouble();
        System.out.print("Enter Swahili Marks: ");
        this.swahili = scanner.nextDouble();
        System.out.print("Enter Science Marks: ");
        this.science = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        calculateAverageAndGrade();
    }

    private void calculateAverageAndGrade() {
        this.average = (mathematics + english + swahili + science) / 4;
        if (average >= 80) {
            this.grade = "A";
        } else if (average >= 70) {
            this.grade = "B";
        } else if (average >= 60) {
            this.grade = "C";
        } else if (average >= 50) {
            this.grade = "D";
        } else {
            this.grade = "F";
        }
    }

    public void display() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Admission Number: " + admissionNumber);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println("Semester of Study: " + semesterOfStudy);
        System.out.println("Mathematics: " + mathematics);
        System.out.println("English: " + english);
        System.out.println("Swahili: " + swahili);
        System.out.println("Science: " + science);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade Scored: " + grade);
    }
}

public class system {
    public static Object out;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating three students
        Student student1 = new Student(scanner);
        Student student2 = new Student(scanner);
        Student student3 = new Student(scanner);

        // Sorting manually without arrays
        Student first, second, third;
        if (student1.average <= student2.average && student1.average <= student3.average) {
            first = student1;
            if (student2.average <= student3.average) {
                second = student2;
                third = student3;
            } else {
                second = student3;
                third = student2;
            }
        } else if (student2.average <= student1.average && student2.average <= student3.average) {
            first = student2;
            if (student1.average <= student3.average) {
                second = student1;
                third = student3;
            } else {
                second = student3;
                third = student1;
            }
        } else {
            first = student3;
            if (student1.average <= student2.average) {
                second = student1;
                third = student2;
            } else {
                second = student2;
                third = student1;
            }
        }

        // Displaying students in ascending order of their average marks
        System.out.println("\nStudent Performance in Ascending Order:");
        first.display();
        second.display();
        third.display();

        scanner.close();
    }
}


