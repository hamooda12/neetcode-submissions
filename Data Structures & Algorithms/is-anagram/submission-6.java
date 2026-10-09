
class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        if (s.length()!=t.length())
            return false;
        for (char c:s.toCharArray()){

            if (map.get(c)!=null)
                map.put(c,map.get(c)+1);
            else
                map.put(c,0);
        }
        Map<Character,Integer>map2=new HashMap<>();
        int count2=0;
        for (char d:t.toCharArray()){

            if (map2.get(d)!=null)
                map2.put(d,map2.get(d)+1);
            else map2.put(d,0);
        }
      
        for (char c : map.keySet()){
            if (!map.get(c).equals(map2.get(c)))
                return false;
        }
        return true;



    }
}
