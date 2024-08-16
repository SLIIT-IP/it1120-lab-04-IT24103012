import java.util.Scanner;
public class IT24103012Lab4Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// emarks means Exam marks And lamrks means Lab marks
		System.out.print("Enter the Exam Marks:");
		double emarks = scanner.nextDouble();
		
		if (emarks < 0 || emarks > 100) {
			System.out.print("Invalid input for exam marks.  Terminating program.");
			return;
		}
		System.out.print("Enter the Lab Submission Marks:");
		double lmarks = scanner.nextDouble();
		if (lmarks <0 || lmarks > 100) {
			System.out.print("Invalid input for lab submission marks. Terminating program.");
			return;
		}
		System.out.print("Enter the percentage given for the exam: ");
		double eperc = scanner.nextDouble();
		
		System.out.print("Enter the percentage given for the lab submission: ");
		double lperc = scanner.nextDouble();
		
		if (eperc + lperc != 100) {
			System.out.print("The percentage must add up to 100. Terminating program.");
			return;
		}
		double totalmarks = ((emarks * eperc)/100) + ((lmarks * lperc)/100);
		System.out.print("The Total Marks is " +totalmarks);
	}
}			
			