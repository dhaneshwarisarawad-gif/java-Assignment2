import java.util.Scanner;

public class InternshipEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Graduation Percentage: ");
        double percentage = sc.nextDouble();
        if (age >= 18 && percentage >= 60) {
            System.out.println("\nEligible for Internship");
        } else {
            System.out.println("\nNot Eligible for Internship");

            if (age < 18) {
                System.out.println("Reason: Age must be 18 or above");
            }
            if (percentage < 60) {
                System.out.println("Reason: Graduation percentage must be at least 60%");
            }
        }
        sc.close();
    }
}