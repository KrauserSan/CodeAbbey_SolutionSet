'''
Created on Jun 6, 2017
Problem set: Codeabbey.com
@author: vivpa
'''

def func(dat_len, usr_dat):
    ans = []
    for i in range(dat_len):
        a = int(usr_dat[i][0])
        b = int(usr_dat[i][1])
        c = int(usr_dat[i][2])
        if a + b < c or b + c < a or a + c < b:
            ans.append(0)
        else:
            ans.append(1)
    return ans
def main():
    usr_dat = ''
    while True:
        data = raw_input()
        if not data: break
        usr_dat += data + '\n'
    usr_dat = usr_dat.split('\n')
    dat_len = int(usr_dat[0])
    usr_dat = usr_dat[1:]
    for i in range(len(usr_dat)):
        usr_dat[i] = usr_dat[i].split(' ')
    print dat_len, usr_dat
    sol_ = func(dat_len,usr_dat)
    print sol_
    for i in range(len(sol_)):
        sol_[i] = str(sol_[i])
    print " ".join(sol_)
if __name__ == '__main__':
    main()