class Solution {
    public boolean isPalindrome(String s) {
     s= s.replace(" ","");
   
        for (int i = 0,j=s.length()-1; i <s.length() ; i++,j--) {
          if(!Character.isLetterOrDigit(s.charAt(i))){
            j++;
                continue;  }
                 if(!Character.isLetterOrDigit(s.charAt(j))){
           i--;
                continue;  }
                
                if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
       System.out.print("??????");     
                return false;}
        }
        return true;
    }
}
