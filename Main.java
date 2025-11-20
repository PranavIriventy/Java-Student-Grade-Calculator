import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks for 5 Subjects (out of 100): ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        double total = s1 + s2 + s3 + s4 + s5;
        double percentage = (total / 500) * 100;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        String grade;

        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "Fail";

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
