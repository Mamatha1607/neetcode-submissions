class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
       for(int i : nums)
        {
            if(map.containsKey(i))
            {
                 //map.put(i, map.get(i)+1);
                 return true;
            }
            else{
                map.put(i,1);
            }
        }
        return false;
    }   
}