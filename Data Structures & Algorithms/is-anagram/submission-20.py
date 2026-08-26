class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_dict={}
        for char in s:
            if char not in char_dict:
                char_dict[char]=1
            else:
                char_dict[char]+=1
        for char in t:
            if char in char_dict:
                char_dict[char]-=1
                if char_dict[char]==0: # if value of that key is 0
                    char_dict.pop(char) #delte that particular key value pair
            else:
                return False
        return not char_dict