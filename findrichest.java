public class findrichest {
    static int richest(int[][]arr){
        int max=0;
        for(int row=0;row<arr.length;row++){
            int sum=0;
            for(int col=0;col<arr[row].length;col++){
             sum =sum+arr[row][col];
            
            }
            if(sum>max){
                max=sum;
            }

        }
        return max;

    }
    public static void main(String[] args) {
        int[][]arr={{1,3,4},{1,4,2},{2,4,6}};
           int ans= richest(arr);
           System.out.println("richest has:"+ans);
    }
}
