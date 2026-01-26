package arrayassignment;

public class LargestArray {
	public static int largest(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] numbers= {20,40,60,80};
      int largestNumber=largest(numbers);
      System.out.println("The largest number in the array is: "  +largestNumber);
		
      
	}

}
