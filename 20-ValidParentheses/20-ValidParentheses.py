# Last updated: 03/10/2025 19:44:05
class Solution(object):
    def isValid(self, s):
        while "()" in s or "[]" in s or "{}" in s:
            if "()" in s :
                s = s.replace("()", "")
            elif "[]" in s:
                s = s.replace("[]", "")
            elif "{}" in s:
                s = s.replace("{}", "")
        
        return s == ""