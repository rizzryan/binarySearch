import java.util.Arrays;
import java.util.Scanner;

public class binarySearch
{
  public static int binarySearch(int [] array, int number)
  {
    int low = 0;
    int high = array.length - 1;
    while(low <= high)
    {
      int mid = (low + high) / 2;
      if (array[mid] == number)
      {
        return mid;
      }
      else if(array[mid] < number)
      {
        low = mid + 1;
      }
      else
      {
        high = mid - 1;
      }
    }
    return -1;
  }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an int from 1 to 15 inclusive to generate a random int: ");
    int num = scan.nextInt();
    if (num >= 15)
    {
        System.out.println("You entered in a number too high. Your max number can be 15. The number is now 15.");
        num = 15; // Setting the number value to 15 if it is too high
    }
    int [] monthVal = new int[num];
    System.out.print("The length of the created array is " + monthVal.length);
    binarySearch(monthVal, 6);
  }
}
// Random array with random number of elements with numbers that can be changed
