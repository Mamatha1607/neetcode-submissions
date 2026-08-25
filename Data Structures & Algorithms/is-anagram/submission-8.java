class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> map1=new HashMap<>(); 
    if(s.length()!=t.length())
    return false;
    for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
        {
      map1.put(ch1,map1.getOrDefault(ch1,0)+1);
      map1.put(ch2,map1.getOrDefault(ch2,0)-1);

        }
    }
    for(int val:map1.values()){
    if(val!=0)
    {
        return false;
    }
    }
    return true;
    }
}
