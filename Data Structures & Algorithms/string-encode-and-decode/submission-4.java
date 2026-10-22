class Solution {

      static public String encode(List<String> strs) {
        StringBuilder en = new StringBuilder();
        for(String s: strs){
            en.append(s.length()).append(',').append(s);
        }
        return en.toString();
    }

    static public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        while(true) {
            int f = str.indexOf(',');
            if(f == -1) break;
            String s= str.substring(0, f);
            int length = Integer.parseInt(s);
            res.add(str.substring(f+1,length+f+1));
            str = str.substring(length+f+1, str.length());
        }
        return res;
    }}
