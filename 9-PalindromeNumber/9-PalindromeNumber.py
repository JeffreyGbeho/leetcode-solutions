# Last updated: 23/05/2025 19:04:25
class Solution(object):
    def isPalindrome(self, x):
        # if negative return false always
        if x < 0:
            return False

        # array to store digits of the number
        a = []

        # fill the array
        while x > 0:
            a.append(x%10)
            x //= 10
        
        n = len(a)

        # check for palindrome
        for i in range(n//2):
            if a[i] != a[n - i - 1]:
                return False
        
        return True