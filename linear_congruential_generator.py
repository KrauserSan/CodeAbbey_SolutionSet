'''
Created on Jun 9, 2017

@author: vivpa
'''

def func(i):
    i = map(int,i)
    A,C,M,x0,N = i[0],i[1],i[2],i[3],i[4]
    for _ in range(N):
        x0 = (A*x0 + C)%M
    return x0 
    

def main():
    elem = input()
    test = []
    for x in range(elem):
        test.append(raw_input().split(' '))
    for i in test:
        print func(i),

if __name__ == '__main__':
    main()