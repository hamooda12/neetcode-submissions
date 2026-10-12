class Solution {
    public int majorityElement(int[] nums) {
     Map<Integer,Integer>map=new HashMap<>();
     int max=0;
     for(int num:nums){
        map.put(num,map.getOrDefault(num, 0)+1);
    if (map.get(num)>nums.length/2)
    max=num;
     }   
     return max;
    }
}