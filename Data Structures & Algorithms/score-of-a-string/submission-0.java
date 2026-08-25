class Solution {
    public int scoreOfString(String s) {
        int result=0,sum=0;
        for(int i=1;i<s.length();i++)
        {
        int current =  s.charAt(i);
        int prev = s.charAt(i-1);
        result+=Math.abs(current-prev);
        }
        return result;
        
    }
}