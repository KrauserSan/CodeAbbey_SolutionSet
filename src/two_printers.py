'''
Created on Jun 8, 2017

@author: vivpa
'''

def main():
    for _ in xrange(input()):
        x,y,n = map(int,raw_input().split())
        t = n * x * y / (x+y)
        while (t/x) + (t/y) < n:
            t += 1
        print t,

if __name__ == '__main__':
    main()