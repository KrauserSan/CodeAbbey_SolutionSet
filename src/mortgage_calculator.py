'''
Created on Jun 10, 2017

@author: vivpa
'''

def main():
    P, R, L = map(float,raw_input().split(' '))
    Rm = R/1200
    print round(P*Rm/(1.0-(1.0+Rm)**(-L)))
        
if __name__ == '__main__':
    main()