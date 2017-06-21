'''
Created on Jun 9, 2017

@author: vivpa
'''

def func(i):
    i = [y for y in i.lower() if y.isalpha()]
    print i 
    return 'Y' if i==i[::-1] else 'N'
        

def main():
    test = []
    for _ in range(input()):
        test.append(raw_input())
    ans = map(func, test)
    print " ".join(ans)

if __name__ == '__main__':
    main()