import java.util.Arrays;

public class selectionsort{
  public static void main(String[] args) {
    int []arr ={5,3,4,1,2};
    System.out.println("current arrays is :"+Arrays.toString(arr));
    System.out.println("sorted array using selection sort is:");selection(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void selection(int []arr){
    
    for(int i=0;i<arr.length-1;i++){
      int last=arr.length-i-1;
       int maxindex=0;
      for (int j=1;j<=last;j++ ){
        if(arr[j]>arr[maxindex]){
          maxindex=j;
         
        }
      }
       
      
    }
    int  temp=arr[last];
          arr[last]=arr[maxindex];
          arr[maxindex]=temp;

  }
}