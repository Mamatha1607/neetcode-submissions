class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        my_dict={}
        for char in s:
            if char not in my_dict:
                my_dict[char]= 1
            else:
                my_dict[char]+=1
        for char in t:
            if char in my_dict:
                my_dict[char]-=1
                if my_dict[char] == 0:
                 del my_dict[char]
            else:
                return False
        return not my_dict