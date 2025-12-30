package assignment1;

public class Program_ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=50;
		if(marks >= 90 && marks <= 100)
		{
		System.out.println("Grade is A");
		}
		else if(marks >= 75 && marks <= 89)
		{
		System.out.println("Grade is B");
		}
		else if(marks >= 50 && marks <= 74)
		{
		System.out.println("Grade is C");
		}
		else
		{
		System.out.println("Fail");
		}
	}

}
