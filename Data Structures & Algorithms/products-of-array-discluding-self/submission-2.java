class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod1=1;
        int prod2=1;
        int i=0;
        int j= nums.length-1;
       int[] output =new int[nums.length];
       for(int k=0;k<nums.length;k++)
           output[k]=1;
        while(i<nums.length|| j >= 0){

            if(i<nums.length){
                if(i>0) {
                    prod1*=nums[i-1];
                    output[i]*=prod1;}
             i++;}
            if(j>=0) {

                if(j<nums.length-1) prod2*=nums[j+1];
                if(j!=nums.length-1) output[j]*=prod2;
                j--;
            }
        }

return output;
    }
}  
