'''
Created on Jun 10, 2017

@author: vivpa
'''
import cmath


def func(i):
    A,B,C = i
    x1 = (-B + cmath.sqrt((B**2) - 4*A*C))/(2*A)
    x2 = (-B - cmath.sqrt((B**2) - 4*A*C))/(2*A)
    if x1.imag == 0 and x2.imag == 0:
        c1 = int(max(x1.real,x2.real))
        c2 = int(min(x1.real,x2.real))
        return str(c1) + ' ' + str(c2)
    else:
        return str(x1) + ' ' + str(x2)
        
def main():
    task = []
    for _ in range(input()):
        task.append(map(int,raw_input().split(' ')))
    print task
    ans = map(func,task)
    print ";".join(ans)
        
if __name__ == '__main__':
    main()
    