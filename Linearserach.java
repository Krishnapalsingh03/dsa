import java.util.Scanner;

public class Linearserach {
    public static void main(String[] args) {
        int []arr={1,20,44,5,7};
        int target=7;
        boolean found=false;
       linearsearch(arr,target,found);
       Scanner sc=new Scanner(System.in);
       System.out.println("enter first or start of range ");
       int start =sc.nextInt();
        System.out.println("enter last or end of range ");
       int end =sc.nextInt();

    searchinrange(arr,target,start,end, found);
       
    }

    //this is code for linear search
        static void linearsearch(int []arr,int target,boolean found){

         if(arr.length==0){
                System.out.println("array is empty");
                return;
            }
        for (int i=0;i<arr.length;i++){
           
            if(target==arr[i]){
                System.out.println("elemnt found at index"+i);
                found=true;
                break;
                           
            }
            
        }
        if(!found){
            System.out.println("element not found");
           
        }
    }
    //this is code to search element in range 
    static void searchinrange(int []arr, int target,int start,int end,boolean found){
         if(arr.length==0){
                System.out.println("array is empty");
                return;
            }
             for (int i=start;i<end;i++){
           
            if(target==arr[i]){
                System.out.println("elemnt found at index"+i);
                found=true;
                break;
                           
            }

            
        }
         if(!found){
            System.out.println("element not found");
           
        }

    }


}
