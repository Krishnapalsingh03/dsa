import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        Scanner sc =new Scanner(System.in);
        System.out.println("this is array:"+Arrays.toString(arr));
        System.out.println("enter value for target value");
        int target=sc.nextInt();
       int ans= binarysearchfun(arr,target);
       System.out.println(ans);
    }
    static int binarysearchfun(int []arr,int target){
        int start=0;
        int last=arr.length-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(arr[mid]==target){
                System.out.println("element found at:");
               return mid;
               
            }
            else if(arr[mid]<target){
                start=mid+1;

            }
            else{
                last=mid-1;
            }

        }
        System.out.println("element not found");
        return -1;
    
    }
}
