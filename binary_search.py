'''
Created on Jun 9, 2017

@author: vivpa
'''
import math
from win32con import BF_MIDDLE

def func(i):
    A,B,C,D = i
    begin = 0
    end = 1000
    f_beg = solve(begin,A,B,C,D)
    f_end = solve(end,A,B,C,D)
    print f_beg,f_end
    while True:
        xmid = (begin + end)/2.0
        f_mid = solve(xmid,A,B,C,D)
        print xmid,f_mid
        if 0 > round(f_mid,12):
            begin = xmid
            
        elif 0< round(f_mid,12):
            end = xmid 
        elif round(f_mid,12) == 0:
            return xmid
            break
def solve(x,A,B,C,D):
    return A*x + B*math.sqrt((x**3)) - C*math.exp(-x/50) - D
def main():
    task = []
    for _ in range(input()):
        task.append(map(float, raw_input().split(' ')))
    ans = map(func,task)
    print " ".join(map(str,ans))
if __name__ == '__main__':
    main()