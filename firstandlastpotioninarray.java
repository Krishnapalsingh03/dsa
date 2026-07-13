  import java.util.Arrays;
import java.util.Scanner;
public class firstandlastpotioninarray {



    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};

        Scanner sc = new Scanner(System.in);

        System.out.println("Array: " + Arrays.toString(nums));

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] ans = searchRange(nums, target);

        System.out.println("First Position: " + ans[0]);
        System.out.println("Last Position: " + ans[1]);
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);   // First occurrence
        ans[1] = search(nums, target, false);  // Last occurrence

        return ans;
    }

    static int search(int[] nums, int target, boolean findFirst) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {

                ans = mid;

                if (findFirst) {
                    end = mid - 1;     // Search left
                } else {
                    start = mid + 1;   // Search right
                }
            }
        }

        return ans;
    }
}

