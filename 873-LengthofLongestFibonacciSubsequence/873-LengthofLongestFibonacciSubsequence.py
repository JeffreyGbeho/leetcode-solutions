// Last updated: 01/03/2025 10:58:37
def fib(pos, last1, last2):
   skip = fib(pos + 1, last1, last2)
   if arr[pos] == arr[last1] + arr[last2]:
       take = 1 + fib(pos + 1, pos, last1)
   return max(take, skip)