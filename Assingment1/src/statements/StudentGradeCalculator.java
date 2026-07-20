package statements;
import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter student marks (0-100): ");
	        int marks = sc.nextInt();

	        if (marks >= 90 && marks <= 100) {
	            System.out.println("Grade: A");
	        } 
	        else if (marks >= 75 && marks <= 89) {
	            System.out.println("Grade: B");
	        } 
	        else if (marks >= 60 && marks <= 74) {
	            System.out.println("Grade: C");
	        } 
	        else if (marks >= 40 && marks <= 59) {
	            System.out.println("Grade: D");
	        } 
	        else if (marks >= 0 && marks <= 39) {
	            System.out.println("Result: Fail");
	        } 
	        else {
	            System.out.println("Invalid marks! Please enter marks between 0 and 100.");
	        }
	        sc.close();
	}
}
