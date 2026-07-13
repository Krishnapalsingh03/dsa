import java.util.Arrays;
import java.util.Scanner;

public class Printmaxinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={10,30,5,66,77,80};
        System.out.println("this is your array"+Arrays.toString(arr));
        System.out.println("enter first index of range");
        int start=sc.nextInt();
         System.out.println("enter second index of range");
        int end=sc.nextInt();
        Maxvlaue(arr, start, end);

    }
        static void Maxvlaue(int []arr,int start ,int end){
            
                int maxvalue=arr[start];
                for(int i=start;i<=end;i++){
                    if(maxvalue<arr[i]){
                        maxvalue=arr[i];
                        
                        
                    }
                   
                }
                 System.out.println("max value is"+maxvalue);
        }
    }

