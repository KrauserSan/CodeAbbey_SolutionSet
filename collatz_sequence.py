'''
Created on Jun 12, 2017

@author: vivpa
'''

def func(i):
    count = 0
    while(i!=1):
        if i%2==0:
            i = i/2
        else:
            i = 3*i + 1
        count +=1
    return str(count)
        

def main():
    elem = input()
    dat = map(int,raw_input().split(' '))
    dat = map(func, dat)
    print " ".join(dat)
if __name__ == '__main__':
    main()