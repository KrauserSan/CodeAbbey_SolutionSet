'''
Created on Jun 7, 2017
Problem set: Codeabbey.com
@author: vivpa
'''
def func(init_val, usr_dat):
    ans = 0
    for i in range(len(usr_dat)):
        if usr_dat[i][0] == '+':
            ans = ans + int(usr_dat[i][1])
        elif usr_dat[i][0] == '*':
            ans = ans * int(usr_dat[i][1])
        elif usr_dat[i][0] == '%':
            ans = ans%int(usr_dat[i][1])
    return ans
def main():
    usr_dat = ''
    while True:
        data = raw_input()
        if not data: break
        usr_dat += data + '\n'
    usr_dat = usr_dat.split('\n')
    init_val = int(usr_dat[0])
    usr_dat = usr_dat[1:len(usr_dat)-1]
    for x in range(len(usr_dat)):
        usr_dat[x] = usr_dat[x].split(' ')
    print usr_dat
    sol_ = func(init_val,usr_dat)
    print sol_
if __name__ == '__main__':
    main()