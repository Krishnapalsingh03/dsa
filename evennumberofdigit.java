public class evennumberofdigit {
    static int  evennumberdigit(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            //IF number is even then incerse the count
                 if(checkeven(arr[i])){
                    count ++;
                 }
        }
        //return the value of count 
        return count;
    }
    //checking whether number  in array is even or not 
    static boolean checkeven(int nums){
        int numberofdigit=checktotalnum(nums);
        if(numberofdigit%2==0){
            return true;

        }
        return false;

    }

//finding number of digit in numbers
    static int checktotalnum(int nums){
        if(nums<0){
            nums=nums*-1;
        }
        int count=0;
        while(nums>0){
            count++;
            nums=nums/10;
        }
        return count;


    }

    public static void main(String[] args) {
        int []arr={11,22,3,444,5555,8888888};
       int ans= evennumberdigit(arr);
       System.out.println("total number of even number in array:"+ans);

    }
}