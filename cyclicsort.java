import java.util.Arrays;

public class cyclicsort {
  public static void main(String[] args) {
    int []arr={3,5,2,1,4};
    System.out.println("current array"+Arrays.toString(arr));
   int ans[]=  bubble(arr);
    System.out.println("after bubble sorting:"+Arrays.toString(arr));

  }
  public static int[] bubble(int []arr){
    int i=0;
   
    while(i<arr.length){
     
      int correctindex=arr[i]-1;
      if(arr[i]==arr[correctindex]){
        i++;
      }
      else{
        int temp=arr[i];
        arr[i]=arr[correctindex];
        arr[correctindex]=temp;
      }
    }
    return arr;

  }
}
