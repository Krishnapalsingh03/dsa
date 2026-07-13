import java.util.Scanner;

public class multidemisionalarray {
    public static void main(String[] args) {
        int [][]arr={{10,20,30},{4,99,60},{70,44,77}};
        //calling max value function
        maxvalue(arr);
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value you want to search in 2d array");
        int target=sc.nextInt();
        boolean found=false;
      //calling 2d search funation  
      search2d(arr, target, found);
    }
    //this funation is to check max value in 2d array
    static void maxvalue(int [][]arr){
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(max<arr[row][col]){
                    max=arr[row][col];
                   
                }
            }
        }
        System.out.println("max value is 2d array is:"+max);
       

    }
    static void search2d(int[][]arr,int target,boolean found){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                    System.out.println("element found at:"+"row"+row+"coloumn"+col);
                    found=true;
                   
                }
            }
        }
        if(!found){
            System.out.println("not found");
        }

    }
}
