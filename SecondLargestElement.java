package arrayassignment;
public class SecondLargestElement{

public static int secLargest(int arr[]) {
    if (arr.length < 2) {
        System.out.println("Array must contain at least two elements");
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > largest) {
         
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
           
            secondLargest = num;
        }
    }

    if (secondLargest == Integer.MIN_VALUE) {
    	System.out.println("No second largest element (all elements may be equal)");
    }

    return secondLargest;
}

public static void main(String[] args) {
    int[] numbers = {25, 47, 3, 19, 8, 56};
    int result = secLargest(numbers);
    System.out.println("The second largest element in the array is: " + result);
}
}
