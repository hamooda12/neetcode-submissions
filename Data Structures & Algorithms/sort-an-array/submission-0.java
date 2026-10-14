class Solution {
    public int[] sortArray(int[] nums) {
         if (nums.length==2)
            return new int[]{Math.min(nums[0],nums[1]),Math.max(nums[0],nums[1])};
        else if(nums.length==1)
            return nums;
        int[]arr1=sortArray(Arrays.copyOfRange(nums,0,nums.length/2));
        int[]arr2=sortArray(Arrays.copyOfRange(nums,nums.length/2,nums.length));


        return sortone(arr1,arr2);   
    }
        static int[] sortone(int arr1[],int arr2[]){
        int[] combined = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        for (int k = 0; k < combined.length; k++) {
            if (i<arr1.length&&j< arr2.length){
                if(arr1[i]<arr2[j])
                 combined[k]=arr1[i++];
                else
                    combined[k]=arr2[j++];
            }
            else if(i<arr1.length)
                combined[k]=arr1[i++];
            else
                combined[k]=arr2[j++];
        }
        return combined;
    }

}