# Last updated: 03/10/2025 19:44:09
class Solution:
    def myAtoi(self, s: str) -> int:
        s=s.strip()
        if s:
                
            vidai=""
            l=0
            if s[0]=="-" or s[0]=="+":
                vidai+=s[0]
                l+=1
            try:
                    
                if s[l]=="0":
                    while s[l]=="0":
                        l+=1
                while s[l].isnumeric():

                        vidai+=s[l]
                        if l<len(s)-1:

                            l+=1
                        else:
                            break
            except:
                return 0
            if vidai:
                try:
                        
                    if int(vidai)<(-(2**31)):
                        return -(2**31)
                    elif int(vidai)>(2**31)-1:
                        return (2**31)-1
                    else:
                        return int(vidai)
                except:
                    return 0
            return 0
        return 0

        