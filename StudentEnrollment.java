import java.util.Scanner;

public class StudentEnrollment {

    // System to determine the overall enrollment cost depending on the quantity of units
    public static int calculateEnrollmentFee(int numberOfUnits) {
        // The unit fee is fixed at 1000.
        int feePerUnit = 1000; 
        return numberOfUnits * feePerUnit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the data that a student needs.
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Number of Units (Maximum 10): ");
        int numberOfUnits = scanner.nextInt();

        // Make sure the quantity of units does not above the upper limit permitted.
        if (numberOfUnits > 10) {
            System.out.println("The number of units cannot exceed 10.");
            return;
        }

        // Calculate the enrollment fee
        int totalFee = calculateEnrollmentFee(numberOfUnits);

        // Print the name of the student and the entire enrollment cost.
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalFee);

        // Inquire about the student's payment amount.
        System.out.print("Enter Payment Amount: ");
        int paymentAmount = scanner.nextInt();

        //Check the status of the payment.
        if (paymentAmount == totalFee) {
            System.out.println("Fully Paid");
        } else if (paymentAmount < totalFee) {
            System.out.println("Partial Payment. Amount Paid: " + paymentAmount);
        } else {
            System.out.println("Overpayment. Please check the amount.");
        }

        scanner.close();
    }
}
