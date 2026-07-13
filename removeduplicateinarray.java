import java.util.Arrays;

public class removeduplicateinarray {
    
    public  static void removeDuplicates(int[] nums) {
       
        int k=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
             boolean duplicate=false;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                   duplicate=true;
                   o++;
                  
               break;
                }

            }
             if(!duplicate){
                k++;
           
            System.out.print(nums[i]+" ");
        }
       
        }
        System.out.println("\n number of elemnt in array:"+k);
        System.out.println("number of  dublicates elemnt are "+o);
       
       
        
    }
    public static void main(String[]args){
        int[]nums={1,1,2,2,3,4,5};
        removeDuplicates(nums);

    }
    
}

