class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List<String>> map=new HashMap<>();
       for (String s:strs){
           char[]words= s.toCharArray();
           Arrays.sort(words);
           String newword= new String(words);
           map.putIfAbsent(newword,new ArrayList<>());
           map.get(newword).add(s);



       }
       return new ArrayList<>(map.values())    ;}
}
