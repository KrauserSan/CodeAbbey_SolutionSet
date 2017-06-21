'''
Created on Jun 7, 2017
Problem set: Codeabbey.com
@author: vivpa
'''

def main():
    usr_dat = raw_input()
    usr_dat = usr_dat.split(' ')
    for x in range(len(usr_dat)):
        usr_dat[x] = int(usr_dat[x])
    print max(usr_dat), min(usr_dat)
    
if __name__ == '__main__':
    main()