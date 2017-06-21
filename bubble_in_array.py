'''
Created on Jun 8, 2017

@author: vivpa
'''

def swap(usr_inp):
    swaps = 0
    for i in range(len(usr_inp)-2):
        if usr_inp[i] > usr_inp[i+1]:
            temp = usr_inp[i+1]
            usr_inp[i+1] = usr_inp[i]
            usr_inp[i] = temp 
            swaps += 1
    return swaps,usr_inp[:len(usr_inp)-1]

def checksum(ans):
    result = 0
    for i in ans:
        result += i
        result = (result*113)%10000007
    return result
def main():
    usr_inp = map(int,raw_input('enter array').split(' '))
    swaps,ans = swap(usr_inp)
    check_ = checksum(ans)
    print swaps, check_
    

if __name__ == '__main__':
    main()