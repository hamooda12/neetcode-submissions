class Solution {
    public int[] productExceptSelf(int[] nums) {
         Map<Integer,Integer> map=new HashMap<>();
       Map<Integer,Integer> map2=new HashMap<>();
        int prod1=1;
        int prod2=1;
        int i=0;
        int j= nums.length-1;
        while(i<nums.length|| j >= 0){



            if(i<nums.length){
                if(i>0) {prod1*=nums[i-1];
                map2.put(i,prod1);}
             i++;}
            if(j>=0) {

                if(j<nums.length-1) prod2*=nums[j+1];
                if(j!=nums.length-1) map.put(j, prod2);
                j--;
            }
        }
        int[] output =new int[nums.length];
        for(int k=0;k<nums.length;k++)
            output[k]=1;
for(int k=0;k<nums.length;k++){
    if(map.containsKey(k))
        output[k]*=map.get(k);
    if(map2.containsKey(k)) output[k]*=map2.get(k);
}
return output;
    }
}  
