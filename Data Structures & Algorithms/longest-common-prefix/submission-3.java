class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word=strs[0];
       char ch='d';
       String prefix="";
       for (int i = 0; i <word.length() ; i++) {
           ch=word.charAt(i);
           for(int j=1; j<strs.length;j++){
   if(i>=strs[j].length()|| strs[j].charAt(i)!=ch)
       return prefix;
           }
           prefix+=ch;
       }
return prefix;
    }
}