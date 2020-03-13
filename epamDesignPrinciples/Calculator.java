package epamDesignPrinciples;

import java.util.Scanner;

public class Calculator {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstNumber=sc.nextDouble();
        System.out.println("Enter second number:");
        double secondNumber=sc.nextDouble();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice:");
        CalculateValue ob = new CalculateValue(firstNumber,secondNumber);
        int choice=sc.nextInt();
        switch(choice){
        case 1:ob.addition();
                break;
        case 2:ob.subtraction();
                break;
        case 3:ob.multiplication();
                break;
        case 4:ob.division();
                break;
        default:System.out.println("Invalid choice...");
        }
    }


}
