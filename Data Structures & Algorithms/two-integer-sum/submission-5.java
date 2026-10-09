class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map=new LinkedHashMap<>();
        Map<Integer,Integer> indecis=new LinkedHashMap<>();
        int i=0;
        for(int n :nums){
            if (map.containsKey(n)&n+n==target)
             return new int[]{indecis.get(n),i};
            map.put(n,target-n);

            indecis.put(n,i);
            i++;
        }
int []two=new int[2];
        for(int n:map.keySet()){
            
            if (map.containsKey(map.get(n))) {
              
               two[0]=indecis.get(map.get(n));
               two[1]=indecis.get(n);
               
            }
        }
        return two;
    }
}
