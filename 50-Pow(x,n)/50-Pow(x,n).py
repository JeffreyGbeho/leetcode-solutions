class Solution:
    def myPow(self, x: float, n: int) -> float:
        res = 1

        if n == 0:
            return 1   #unnecessary

        elif n < 0:      # 4^-3 = (1/4)^3
            x = 1/x
            n = abs(n)

        while n > 0:            #imagine x^binary(n)                      #
            if n&1:              #if lsb is 1, then we multiply result with number itself (base or x)
                res = res*x      #as we move from lsb to msb, every step we multiply x with itself
            x = x*x              #imagine binary to decimal conversition, same concept
            n = n>>1

        return res