class Solution {
    public void reverseString(char[] s) {
     for(int i=s.length-1,j=0;i>=0&j<s.length&j<i;i--,j++){
char charI=s[i];
char charJ=s[j];
s[i]=charJ;
s[j]=charI;
            
        }
    }
}