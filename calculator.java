package thesecondtrial;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		
		// SIMPLE CALCULATOR PROGRAM
		
		// Declare all variables and objects (such as scanner)
		// Take first number as input
		Scanner scanner = new Scanner(System.in);
		double num1;
		double num2;
		char operator;
		
		System.out.print("Enter the first number: ");
		num1 = scanner.nextDouble();
		
		// Take the operator as input
		
		System.out.print("Choose an operator (+, -, *, /, ^): ");
		operator = scanner.next().charAt(0); //we can chain methods and use charAt to resolve user input string to a character.
		
		// Take the second number as input
		
		System.out.print("Enter the second number: ");
		num2 = scanner.nextDouble();
		
		// Remember we can write multiple lines of code in a case statement by putting curly brackets
		
		// Print result
		
		switch(operator) {
			case '+' -> System.out.printf("Result is: %.2f", num1+num2); //we are using single quotes because we are working with a character
			case '-' -> System.out.printf("Result is: %.2f", num1-num2);
			case '*' -> System.out.printf("Result is: %.2f", num1*num2);
			case '/' -> {if(num2 == 0) { System.out.println("Dividing by zero is undefined!"); }
			else { System.out.printf("Result is: %.2f", num1/num2); }  }
			
			case '^' -> System.out.printf("Result is: %.2f", Math.pow(num1, num2));
			default -> System.out.println("Wrong operator type!");
		}
		
		// If operator is wrong default to printing "wrong operator!"
		scanner.close();
	}
}
