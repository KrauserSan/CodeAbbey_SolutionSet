'''
Created on Jun 9, 2017

@author: vivpa
'''
import math

def main():
    N,K = map(int,raw_input().split(' '))
    ll = range(1,N+1)
    old_ll = ll
    rem = 0
    while True:
        ll = [x for x in ll if (ll.index(x)+1+rem)%K !=0]
        rem = rem + len(old_ll) - math.floor(len(old_ll)/K)*K
        if len(ll)==1:
            break
        old_ll = ll
        print ll, rem
    print ll[0]
if __name__ == '__main__':
    main()