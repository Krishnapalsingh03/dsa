//ceiling means selecting smallest element  that is greater then or equal to target  elemnt

import java.util.Arrays;
import java.util.Scanner;

public class ceilinginarray {
    public static void main(String[] args) {
         int []arr={10,20,30,40,50};
        Scanner sc =new Scanner(System.in);
        System.out.println("this is array:"+Arrays.toString(arr));
        System.out.println("enter value for target value");
        int target=sc.nextInt();
       int ans= ceilingfun(arr,target);
       System.out.println(ans);
    }
    static int ceilingfun(int []arr,int target){
          int start=0;
        int last=arr.length-1;
        if(target>arr[last]){
            System.out.println("not found");
            return -1;
        }
        while(start<=last){
            int mid=(start+last)/2;
            // if target value if present in array
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
       // this is main logic for ceiling
       System.out.println("next smallest and greater then element then "+target+" is ");
        return arr[start];

    }
}
