import java.util.Scanner;

public class StudentGrades
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numSubjects;
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();
        scanner.nextLine();
        String[] subjects = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++)
        {
            System.out.print("Enter name for subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();
            totalMarks += marks[i];
        }
        double averagePercentage = (double) totalMarks / numSubjects;
        char grade;
        if (averagePercentage >= 91)
        {
            grade = 'O';
        }
        else if (averagePercentage >= 81)
        {
            grade = 'E';
        }
        else if (averagePercentage >= 71)
        {
            grade = 'A';
        }
        else if (averagePercentage >= 61)
        {
            grade = 'B';
        }
        else if (averagePercentage >= 51)
        {
            grade = 'C';
        }
        else if (averagePercentage >= 41)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("\nResults:");
        for (int i = 0; i < numSubjects; i++)
        {
            System.out.println(subjects[i] + ": " + marks[i] + " marks");
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}