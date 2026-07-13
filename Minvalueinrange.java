import java.util.Scanner;

public class Minvalueinrange {
    public static void main(String[] args) {
        int []arr={10,4,3,0,-2,66,1};
        minimum(arr);
         Scanner sc=new Scanner(System.in);
       System.out.println("enter first or start of range ");
       int start =sc.nextInt();
        System.out.println("enter last or end of range ");
       int end =sc.nextInt();
        Minimuninrange(arr, start, end);
    }
    static void minimum(int []arr){
        int smallest=arr[0];
        for (int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("smallest element is :"+smallest);

    }
    static void Minimuninrange(int []arr,int start,int end){
         int smallest=arr[0];
          for (int i=start;i<end;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("smallest element is :"+smallest);

    }
    
}
