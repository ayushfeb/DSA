package Arrays;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArrayByK {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size of array = ");
      int num = input.nextInt();
      System.out.print("Enter the element by which you need to rotate an array = ");
      int k = input.nextInt();
      int[] arr = new int[num];
      System.out.println("Enter the elements of array");
      for(int i = 0; i < arr.length; i++){
          arr[i] = input.nextInt();
      }
      rotate(arr, k);
      System.out.println(Arrays.toString(arr));
  }

  //Simple logic the number by which we need to roate an array, we need to divide that array in two parts and
  // reverse both the resultant array
  // combine both the reverse array and reverse again the whole arrays
    public static void rotate(int[] nums, int k) {
        //part 1 reverse
        // find out why its till nums.length -k - 1 not till k
        reverse(nums, 0, nums.length - k -1);
        //part2 reverse
        reverse(nums, nums.length - k, nums.length-1);
        //part 3 reverse
        reverse(nums, 0 , nums.length-1);
    }
    public static void reverse(int[] a, int i, int j){
        int li = i;
        int ri = j;

        while(li < ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }
}
