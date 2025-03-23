class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        res = dividend/divisor
        if dividend == -2147483648 and divisor == -1:
            return 2147483647 
        elif res > 0:
            return floor(res)
        else:
            return ceil(res)