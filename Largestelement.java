package arrayassignment;

public class Largestelement {
	public static void fun(int arr[])
	{
		int maxIndex=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[maxIndex])
			{
				maxIndex=i;
			}
		}
		arr[maxIndex]=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] numbers= {20,40,60,90};
      //System.out.println("original array:");
      //for(int num:numbers)
     // {
    	  //System.out.println(num + " ");
    	  
      //}
      //fun(numbers);
      System.out.println("\nArray after replacing largest element with 0:");
      for(int num:numbers)
      {
    	  System.out.println(num + " " );
      }
	}

}
