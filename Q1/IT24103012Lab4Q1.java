import java.util.Scanner;
public class IT24103012Lab4Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number = scanner.nextInt();
		if (number > 0) {
			System.out.print("The Number is Positve");
		}
		else if (number < 0) {
			System.out.print("The Number is Negative");
		}
		else {
			System.out.print("The Number is Zero");
		}
	}
}
