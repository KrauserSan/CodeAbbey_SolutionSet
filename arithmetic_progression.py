'''
Created on Jun 5, 2017
Problem set: Codeabbey.com
@author: vivpa
'''

def func(dat_len, usr_dat):
    ans = []
    for i in range(dat_len):
        _sum = 0
        init_value = int(usr_dat[i][0])
        diff_val = int(usr_dat[i][1])
        num_vals = int(usr_dat[i][2])
        for x in range(num_vals):
            _sum += (x)*diff_val + init_value
        ans.append(_sum) 
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