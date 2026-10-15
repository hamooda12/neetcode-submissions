class Solution {
    public void sortColors(int[] nums) {
     int indexMin=0;
       for(int i=0;i<nums.length;i++){
           int min=Integer.MAX_VALUE;
           int num=nums[i];
           for(int j=i+1;j<nums.length;j++){
               if(nums[j]<min){
                   min=nums[j];
                   indexMin=j;
               }

           }
           if(min<num){
               nums[i]=min;
               nums[indexMin]=num;
           }

       }
    }

}