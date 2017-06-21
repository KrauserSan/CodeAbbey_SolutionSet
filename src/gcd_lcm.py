'''
Created on Jun 9, 2017

@author: vivpa
'''
def gcd(i):
    a = int(i[0])
    b = int(i[1])
    while(a!=b):
        if a>b:
            a = a-b
        elif a<b:
            b = b-a 
        else:
            break
    return '(%d %d)' %(a,(int(i[0])*int(i[1])/a))
    
def main():
    test = []
    for _ in range(input()):
        test.append(raw_input().split(' '))
    ans = map(gcd,test)
    print " ".join(ans)

if __name__ == '__main__':
    main()