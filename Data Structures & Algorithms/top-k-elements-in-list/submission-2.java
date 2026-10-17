class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,List<Integer>>map=new HashMap<>();
        List<Integer>[] list=new List[nums.length+1];
        for(int i=0;i<list.length;i++) {
            list[i]=new ArrayList<>();
        }
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer>frequent=new HashMap<>();
        for (int num : nums) {
            frequent.put(num, frequent.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer,Integer> num:frequent.entrySet()){
            list[num.getValue()].add(num.getKey());
        }
       
int []result=new int[k];
int index=0;
for (int i=list.length-1;i>=0;){
    if(list[i].isEmpty()){
        i--;
    continue;}
    result[index]=list[i].removeLast();
    index++;
    if(index==k)
        break;
}
                return  result; 
    }
}
