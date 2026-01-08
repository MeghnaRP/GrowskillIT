package methodsassignment;

public class Program_Fibonacci {

	static void fibonacci(int count)
	{
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		count=count-2;
		while(count>0)
		{
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			count--;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       fibonacci(10);
	}

}
