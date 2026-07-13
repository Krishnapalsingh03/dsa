import java.util.Arrays;
import java.util.Scanner;

public class agnosticbinarysearch {
    public static void main(String[] args) {
        int []arr={ 1111,111 , 55,10,2,-3,-4,-5};
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
        boolean isAsc=arr[start]<arr[last];
       
        while(start<=last){
            int mid=(start+last)/2;
            //this constion willl remain will saem for both asecending array or descending array
            if(arr[mid]==target){
                System.out.println("element found at:");
               return mid;
               
            }
            //this constion is for ascending array
            if(isAsc){
                  if(arr[mid]<target){
                start=mid+1;

            }
                else{
                last=mid-1;
            }
            }
            //this condition for decending array 
            else{
                 if(arr[mid]>target){
                start=mid+1;

            }
                else{
                last=mid-1;
            }

            }
           
        }
        System.out.println("element not found");
        return -1;
    
    }
}
