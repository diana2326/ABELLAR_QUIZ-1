import java.util.Scanner;

public class StudentEnrollment {

     // System to determine the overall enrollment cost depending on the quantity of units
   public static int calculateEnrollmentFee(int numberOfUnits) {
     // The unit fee is fixed at 1000.
        int feePerUnit = 1000; 
     // Multiply the number of units by the fee per unit to get the total fee.
        return numberOfUnits * feePerUnit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the data that a student needs.
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
       
        // Prompt the user to enter the course the student is enrolling in.
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
       
        // Prompt the user to enter the course code.
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        
        // Prompt the user to enter the number of units the student is enrolling in.
        // The maximum number of units allowed is 10.
        System.out.print("Enter Number of Units (Maximum 10): ");
        int numberOfUnits = scanner.nextInt();

        // Make sure the quantity of units does not above the upper limit permitted.
        if (numberOfUnits > 10) {
       // If the number of units is greater than 10, print an error message and exit.
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
           // If the payment amount is equal to the total fee, print "Fully Paid".
            System.out.println("Fully Paid");
        } else if (paymentAmount < totalFee) {
          // Print "Partial Payment" and the amount paid if the payment is less than the entire fee.
            System.out.println("Partial Payment. Amount Paid: " + paymentAmount);
        } else {
          // Print "Overpayment" and request that the amount be checked if the payment exceeds the entire cost.
            System.out.println("Overpayment. Please check the amount.");
        }

        scanner.close();// Close the scanner to prevent resource leaks.
    }
}
