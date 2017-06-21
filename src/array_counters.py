'''
Created on Jun 8, 2017

@author: vivpa
'''
from __builtin__ import raw_input

def main():
    usr_dat = ''
    ans = ''
    while True:
        dat = raw_input()
        if not dat: break
        usr_dat += dat + '\n'
    usr_dat = usr_dat.split('\n')
    usr_dat = usr_dat[:len(usr_dat)-1]
    for i in range(len(usr_dat)):
        usr_dat[i] = usr_dat[i].split(' ')
    M,N = int(usr_dat[0][0]),int(usr_dat[0][1])
    usr_dat = usr_dat[1]
    list1 = [int(i) for i in usr_dat]
    temp = sorted(list(set(list1)))
    print temp
    for i in temp:
        ans += str(list1.count(i)) + ' '
    print ans
    
        

if __name__ == '__main__':
    main()