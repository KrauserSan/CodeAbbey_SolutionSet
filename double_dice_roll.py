'''
Created on Jun 11, 2017

@author: vivpa
'''

def main():
    nums = []
    elem = 6
    for x in range(input()):
        num1,num2 = map(int,raw_input().split(' '))
        num1,num2 = num1%elem + 1, num2%elem + 1
        nums.append(num1+num2) 
    for _ in nums:
        print _,
    

if __name__ == '__main__':
    main()