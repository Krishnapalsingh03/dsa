import java.util.Arrays;
import java.util.Scanner;


public class array {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("this is siimple 1d array");
        // this is simple array 
        int []arr={10,2,33,50,5};
        System.out.println(Arrays.toString(arr));


// this is 2 d array
        System.out.println("this is 2d array");
        int [][] arr1= new int[3][3];
                for(int row=0; row<arr1.length;row++){
            for(int col=0;col<arr1[row].length;col++){
                arr1[row][col]=sc.nextInt();
            }

        }
        for(int row=0; row<arr1.length;row++){
            for(int col=0;col<arr1[row].length;col++){
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();

        }




    }
}
