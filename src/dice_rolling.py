'''
Created on Jun 11, 2017

@author: vivpa
'''

def main():
    nums = []
    elem = 6
    for x in range(input()):
        nums.append(int(input()*elem) + 1 )
    for _ in nums:
        print _,
    

if __name__ == '__main__':
    main()