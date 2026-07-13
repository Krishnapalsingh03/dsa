//floor means selecting greatest element  that is smaller then or equal to target  element

import java.util.Arrays;
import java.util.Scanner;

public class floorinarray {
    public static void main(String[] args) {
         int []arr={10,20,30,40,50};
        Scanner sc =new Scanner(System.in);
        System.out.println("this is array:"+Arrays.toString(arr));
        System.out.println("enter value for target value");
        int target=sc.nextInt();
       int ans= floorfun(arr,target);
       System.out.println(ans);
    }
    static int floorfun(int []arr,int target){
          int start=0;
        int last=arr.length-1;
        if(target>arr[last]){
            System.out.println("not found");
            return -1;
        }
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
       // this is main logic for ceiling
       System.out.println("previous greatest and smaller then element then "+target+" is ");
        return arr[last];

    }
}

